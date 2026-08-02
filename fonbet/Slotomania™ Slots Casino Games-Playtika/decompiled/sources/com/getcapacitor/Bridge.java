package com.getcapacitor;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.ValueCallback;
import com.getcapacitor.cordova.MockCordovaInterfaceImpl;
import com.getcapacitor.plugin.Accessibility;
import com.getcapacitor.plugin.App;
import com.getcapacitor.plugin.BrowserPlugin;
import com.getcapacitor.plugin.Camera;
import com.getcapacitor.plugin.Clipboard;
import com.getcapacitor.plugin.Device;
import com.getcapacitor.plugin.Filesystem;
import com.getcapacitor.plugin.Haptics;
import com.getcapacitor.plugin.Keyboard;
import com.getcapacitor.plugin.LocalNotifications;
import com.getcapacitor.plugin.Modals;
import com.getcapacitor.plugin.Network;
import com.getcapacitor.plugin.Permissions;
import com.getcapacitor.plugin.Photos;
import com.getcapacitor.plugin.PushNotifications;
import com.getcapacitor.plugin.Share;
import com.getcapacitor.plugin.SplashScreen;
import com.getcapacitor.plugin.StatusBar;
import com.getcapacitor.plugin.Storage;
import com.getcapacitor.plugin.Toast;
import com.getcapacitor.plugin.WebView;
import com.getcapacitor.plugin.background.BackgroundTask;
import com.getcapacitor.util.HostMask;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.cordova.CordovaInterfaceImpl;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.PluginManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Bridge {
    private static final String BUNDLE_LAST_PLUGIN_CALL_METHOD_NAME_KEY = "capacitorLastActivityPluginMethod";
    private static final String BUNDLE_LAST_PLUGIN_ID_KEY = "capacitorLastActivityPluginId";
    private static final String BUNDLE_PLUGIN_CALL_BUNDLE_KEY = "capacitorLastPluginCallBundle";
    private static final String BUNDLE_PLUGIN_CALL_OPTIONS_SAVED_KEY = "capacitorLastPluginCallOptions";
    public static final String CAPACITOR_CONTENT_START = "/_capacitor_content_";
    public static final String CAPACITOR_FILE_START = "/_capacitor_file_";
    public static final String CAPACITOR_HTTPS_SCHEME = "https";
    public static final String CAPACITOR_HTTP_SCHEME = "http";
    public static final String DEFAULT_WEB_ASSET_DIR = "public";
    private static final String LAST_BINARY_VERSION_CODE = "lastBinaryVersionCode";
    private static final String LAST_BINARY_VERSION_NAME = "lastBinaryVersionName";
    private static final String PREFS_NAME = "CapacitorSettings";
    private HostMask appAllowNavigationMask;
    private String appUrl;
    private String appUrlConfig;
    private CapConfig config;
    private final Activity context;
    public final CordovaInterfaceImpl cordovaInterface;
    private HashSet<String> cordovaResultOverride;
    private final HandlerThread handlerThread;
    private final List<Class<? extends Plugin>> initialPlugins;
    private Uri intentUri;
    private WebViewLocalServer localServer;
    private String localUrl;
    private final MessageHandler msgHandler;
    private PluginCall pluginCallForLastActivity;
    private Map<String, PluginHandle> plugins;
    private CordovaPreferences preferences;
    private Map<String, PluginCall> savedCalls;
    private Handler taskHandler;
    private final ViewBridge webViewBridge;
    private BridgeWebViewClient webViewClient;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public Bridge(Activity activity, ViewBridge viewBridge, List<Class<? extends Plugin>> list, CordovaInterfaceImpl cordovaInterfaceImpl, PluginManager pluginManager, CordovaPreferences cordovaPreferences, JSONObject jSONObject) {
        HandlerThread handlerThread = new HandlerThread("CapacitorPlugins");
        this.handlerThread = handlerThread;
        this.taskHandler = null;
        this.plugins = new HashMap();
        this.savedCalls = new HashMap();
        this.context = activity;
        this.webViewBridge = viewBridge;
        this.webViewClient = new BridgeWebViewClient(this);
        this.initialPlugins = list;
        this.cordovaInterface = cordovaInterfaceImpl;
        this.preferences = cordovaPreferences;
        handlerThread.start();
        this.taskHandler = new Handler(handlerThread.getLooper());
        Config.load(getActivity());
        CapConfig capConfig = new CapConfig(getActivity().getAssets(), jSONObject);
        this.config = capConfig;
        Logger.init(capConfig);
        if (activity instanceof BridgeActivity) {
            Splash.showOnLaunch((BridgeActivity) activity, this.config);
        }
        initWebView();
        this.msgHandler = new MessageHandler(this, viewBridge, pluginManager);
        this.intentUri = activity.getIntent().getData();
        registerAllPlugins();
        loadWebView();
    }

    private void loadWebView() {
        String string;
        this.appUrlConfig = getServerUrl();
        String[] array = this.config.getArray("server.allowNavigation");
        ArrayList arrayList = new ArrayList();
        if (array != null) {
            arrayList.addAll(Arrays.asList(array));
        }
        this.appAllowNavigationMask = HostMask.Parser.parse(array);
        String host = getHost();
        arrayList.add(host);
        String scheme = getScheme();
        String str = scheme + "://" + host;
        this.localUrl = str;
        if (this.appUrlConfig != null) {
            try {
                arrayList.add(new URL(this.appUrlConfig).getAuthority());
            } catch (Exception unused) {
            }
            String str2 = this.appUrlConfig;
            this.localUrl = str2;
            this.appUrl = str2;
        } else {
            this.appUrl = str;
            if (!scheme.equals("http") && !scheme.equals("https")) {
                this.appUrl += "/";
            }
        }
        if (this.webViewBridge.hasFileServer()) {
            WebViewLocalServer webViewLocalServer = new WebViewLocalServer(this.context, this, getJSInjector(), arrayList, this.config.getBoolean("server.html5mode", true));
            this.localServer = webViewLocalServer;
            webViewLocalServer.hostAssets("public");
            Logger.debug("Loading app at " + this.appUrl);
            this.webViewBridge.configure(new BridgeWebChromeClient(this), this.webViewClient, getJSInjector());
            if (!isDeployDisabled() && !isNewBinary() && (string = getContext().getSharedPreferences(WebView.WEBVIEW_PREFS_NAME, 0).getString(WebView.CAP_SERVER_PATH, null)) != null && !string.isEmpty() && new File(string).exists()) {
                setServerBasePath(string);
            }
            this.webViewBridge.loadUrl(this.appUrl);
            return;
        }
        this.webViewBridge.configure(new BridgeWebChromeClient(this), this.webViewClient, getJSInjector());
        this.webViewBridge.loadUrl(this.appUrl);
    }

    public void reload() {
        reset();
        this.webViewBridge.reload(getJSInjector());
    }

    public boolean launchIntent(Uri uri) {
        Boolean shouldOverrideLoad;
        Iterator<Map.Entry<String, PluginHandle>> it = this.plugins.entrySet().iterator();
        while (it.hasNext()) {
            Plugin pluginHandle = it.next().getValue().getInstance();
            if (pluginHandle != null && (shouldOverrideLoad = pluginHandle.shouldOverrideLoad(uri)) != null) {
                return shouldOverrideLoad.booleanValue();
            }
        }
        if (uri.toString().contains(this.appUrl) || this.appAllowNavigationMask.matches(uri.getHost())) {
            return false;
        }
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            return true;
        }
    }

    private boolean isNewBinary() {
        String str;
        String str2;
        PackageInfo packageInfo;
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(WebView.WEBVIEW_PREFS_NAME, 0);
        String string = sharedPreferences.getString(LAST_BINARY_VERSION_CODE, null);
        String string2 = sharedPreferences.getString(LAST_BINARY_VERSION_NAME, null);
        try {
            packageInfo = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0);
            str = Integer.toString(packageInfo.versionCode);
        } catch (Exception e) {
            e = e;
            str = "";
        }
        try {
            str2 = packageInfo.versionName;
        } catch (Exception e2) {
            e = e2;
            Logger.error("Unable to get package info", e);
            str2 = "";
            if (!str.equals(string)) {
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(LAST_BINARY_VERSION_CODE, str);
            edit.putString(LAST_BINARY_VERSION_NAME, str2);
            edit.putString(WebView.CAP_SERVER_PATH, "");
            edit.apply();
            return true;
        }
        if (!str.equals(string) && str2.equals(string2)) {
            return false;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(LAST_BINARY_VERSION_CODE, str);
        edit2.putString(LAST_BINARY_VERSION_NAME, str2);
        edit2.putString(WebView.CAP_SERVER_PATH, "");
        edit2.apply();
        return true;
    }

    public boolean isDeployDisabled() {
        return this.preferences.getBoolean("DisableDeploy", false);
    }

    public void handleAppUrlLoadError(Exception exc) {
        if (exc instanceof SocketTimeoutException) {
            Logger.error("Unable to load app. Ensure the server is running at " + this.appUrl + ", or modify the appUrl setting in capacitor.config.json (make sure to npx cap copy after to commit changes).", exc);
        }
    }

    public boolean isDevMode() {
        return (getActivity().getApplicationInfo().flags & 2) != 0;
    }

    public Context getContext() {
        return this.context;
    }

    public Activity getActivity() {
        return this.context;
    }

    public ViewBridge getViewBridge() {
        return this.webViewBridge;
    }

    public Uri getIntentUri() {
        return this.intentUri;
    }

    public String getScheme() {
        return this.config.getString("server.androidScheme", "http");
    }

    public String getHost() {
        return this.config.getString("server.hostname", "localhost");
    }

    public String getServerUrl() {
        return this.config.getString("server.url");
    }

    public CapConfig getConfig() {
        return this.config;
    }

    public void reset() {
        this.savedCalls = new HashMap();
    }

    private void initWebView() {
        this.webViewBridge.initWebView(this.config, isDevMode());
    }

    private void registerAllPlugins() {
        registerPlugin(App.class);
        registerPlugin(Accessibility.class);
        registerPlugin(BackgroundTask.class);
        registerPlugin(BrowserPlugin.class);
        registerPlugin(Camera.class);
        registerPlugin(Clipboard.class);
        registerPlugin(Device.class);
        registerPlugin(LocalNotifications.class);
        registerPlugin(Filesystem.class);
        registerPlugin(Haptics.class);
        registerPlugin(Keyboard.class);
        registerPlugin(Modals.class);
        registerPlugin(Network.class);
        registerPlugin(Permissions.class);
        registerPlugin(Photos.class);
        registerPlugin(PushNotifications.class);
        registerPlugin(Share.class);
        registerPlugin(SplashScreen.class);
        registerPlugin(StatusBar.class);
        registerPlugin(Storage.class);
        registerPlugin(Toast.class);
        registerPlugin(WebView.class);
        Iterator<Class<? extends Plugin>> it = this.initialPlugins.iterator();
        while (it.hasNext()) {
            registerPlugin(it.next());
        }
    }

    public void registerPlugins(Class<? extends Plugin>[] clsArr) {
        for (Class<? extends Plugin> cls : clsArr) {
            registerPlugin(cls);
        }
    }

    public void registerPlugin(Class<? extends Plugin> cls) {
        NativePlugin nativePlugin = (NativePlugin) cls.getAnnotation(NativePlugin.class);
        if (nativePlugin == null) {
            Logger.error("NativePlugin doesn't have the @NativePlugin annotation. Please add it");
            return;
        }
        String simpleName = cls.getSimpleName();
        if (!nativePlugin.name().equals("")) {
            simpleName = nativePlugin.name();
        }
        Logger.debug("Registering plugin: " + simpleName);
        try {
            this.plugins.put(simpleName, new PluginHandle(this, cls));
        } catch (InvalidPluginException unused) {
            Logger.error("NativePlugin " + cls.getName() + " is invalid. Ensure the @NativePlugin annotation exists on the plugin class and the class extends Plugin");
        } catch (PluginLoadException e) {
            Logger.error("NativePlugin " + cls.getName() + " failed to load", e);
        }
    }

    public PluginHandle getPlugin(String str) {
        return this.plugins.get(str);
    }

    public PluginHandle getPluginWithRequestCode(int i) {
        loop0: for (PluginHandle pluginHandle : this.plugins.values()) {
            NativePlugin pluginAnnotation = pluginHandle.getPluginAnnotation();
            if (pluginAnnotation != null) {
                int[] requestCodes = pluginAnnotation.requestCodes();
                int length = requestCodes.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (requestCodes[i2] == i) {
                            break loop0;
                        }
                        i2++;
                    } else if (pluginAnnotation.permissionRequestCode() == i) {
                    }
                }
                return pluginHandle;
            }
        }
        return null;
    }

    public void callPluginMethod(String str, final String str2, final PluginCall pluginCall) {
        try {
            final PluginHandle plugin = getPlugin(str);
            if (plugin == null) {
                Logger.error("unable to find plugin : " + str);
                pluginCall.errorCallback("unable to find plugin : " + str);
            } else {
                Logger.verbose("callback: " + pluginCall.getCallbackId() + ", pluginId: " + plugin.getId() + ", methodName: " + str2 + ", methodData: " + pluginCall.getData().toString());
                this.taskHandler.post(new Runnable() { // from class: com.getcapacitor.Bridge.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            plugin.invoke(str2, pluginCall);
                            if (pluginCall.isSaved()) {
                                Bridge.this.saveCall(pluginCall);
                            }
                        } catch (InvalidPluginMethodException e) {
                            e = e;
                            Logger.error("Unable to execute plugin method", e);
                        } catch (PluginLoadException e2) {
                            e = e2;
                            Logger.error("Unable to execute plugin method", e);
                        } catch (Exception e3) {
                            Logger.error("Serious error executing plugin", e3);
                            throw new RuntimeException(e3);
                        }
                    }
                });
            }
        } catch (Exception e) {
            Logger.error(Logger.tags("callPluginMethod"), "error : " + e, null);
            pluginCall.errorCallback(e.toString());
        }
    }

    public void eval(final String str, final ValueCallback<String> valueCallback) {
        new Handler(this.context.getMainLooper()).post(new Runnable() { // from class: com.getcapacitor.Bridge.2
            @Override // java.lang.Runnable
            public void run() {
                Bridge.this.webViewBridge.evaluateJavascript(str, valueCallback);
            }
        });
    }

    public void logToJs(String str, String str2) {
        eval("window.Capacitor.logJs(\"" + str + "\", \"" + str2 + "\")", null);
    }

    public void logToJs(String str) {
        logToJs(str, CreativeInfo.f);
    }

    public void triggerJSEvent(String str, String str2) {
        eval("window.Capacitor.triggerEvent(\"" + str + "\", \"" + str2 + "\")", new ValueCallback<String>() { // from class: com.getcapacitor.Bridge.3
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str3) {
            }
        });
    }

    public void triggerJSEvent(String str, String str2, String str3) {
        eval("window.Capacitor.triggerEvent(\"" + str + "\", \"" + str2 + "\", " + str3 + ")", new ValueCallback<String>() { // from class: com.getcapacitor.Bridge.4
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str4) {
            }
        });
    }

    public void triggerWindowJSEvent(String str) {
        triggerJSEvent(str, "window");
    }

    public void triggerWindowJSEvent(String str, String str2) {
        triggerJSEvent(str, "window", str2);
    }

    public void triggerDocumentJSEvent(String str) {
        triggerJSEvent(str, "document");
    }

    public void triggerDocumentJSEvent(String str, String str2) {
        triggerJSEvent(str, "document", str2);
    }

    public void execute(Runnable runnable) {
        this.taskHandler.post(runnable);
    }

    public void executeOnMainThread(Runnable runnable) {
        new Handler(this.context.getMainLooper()).post(runnable);
    }

    public void saveCall(PluginCall pluginCall) {
        this.savedCalls.put(pluginCall.getCallbackId(), pluginCall);
    }

    public PluginCall getSavedCall(String str) {
        return this.savedCalls.get(str);
    }

    public void releaseCall(PluginCall pluginCall) {
        this.savedCalls.remove(pluginCall.getCallbackId());
    }

    private JSInjector getJSInjector() {
        try {
            return new JSInjector(JSExport.getGlobalJS(this.context, isDevMode()), JSExport.getCoreJS(this.context), JSExport.getPluginJS(this.plugins.values()), JSExport.getCordovaJS(this.context), JSExport.getCordovaPluginJS(this.context), JSExport.getCordovaPluginsFileJS(this.context), "window.WEBVIEW_SERVER_URL = '" + this.localUrl + "';");
        } catch (JSExportException e) {
            Logger.error("Unable to export Capacitor JS. App will not function!", e);
            return null;
        }
    }

    protected void storeDanglingPluginResult(PluginCall pluginCall, PluginResult pluginResult) {
        ((App) getPlugin("App").getInstance()).fireRestoredResult(pluginResult);
    }

    public void restoreInstanceState(Bundle bundle) {
        String string = bundle.getString(BUNDLE_LAST_PLUGIN_ID_KEY);
        String string2 = bundle.getString(BUNDLE_LAST_PLUGIN_CALL_METHOD_NAME_KEY);
        String string3 = bundle.getString(BUNDLE_PLUGIN_CALL_OPTIONS_SAVED_KEY);
        if (string != null) {
            if (string3 != null) {
                try {
                    this.pluginCallForLastActivity = new PluginCall(this.msgHandler, string, "-1", string2, new JSObject(string3));
                } catch (JSONException e) {
                    Logger.error("Unable to restore plugin call, unable to parse persisted JSON object", e);
                }
            }
            Bundle bundle2 = bundle.getBundle(BUNDLE_PLUGIN_CALL_BUNDLE_KEY);
            PluginHandle plugin = getPlugin(string);
            if (plugin != null) {
                plugin.getInstance().restoreState(bundle2);
            }
        }
    }

    public void saveInstanceState(Bundle bundle) {
        PluginHandle plugin;
        Logger.debug("Saving instance state!");
        PluginCall pluginCall = this.pluginCallForLastActivity;
        if (pluginCall == null || (plugin = getPlugin(pluginCall.getPluginId())) == null) {
            return;
        }
        bundle.putString(BUNDLE_LAST_PLUGIN_ID_KEY, pluginCall.getPluginId());
        bundle.putString(BUNDLE_LAST_PLUGIN_CALL_METHOD_NAME_KEY, pluginCall.getMethodName());
        bundle.putString(BUNDLE_PLUGIN_CALL_OPTIONS_SAVED_KEY, pluginCall.getData().toString());
        bundle.putBundle(BUNDLE_PLUGIN_CALL_BUNDLE_KEY, plugin.getInstance().saveInstanceState());
    }

    public void startActivityForPluginWithResult(PluginCall pluginCall, Intent intent, int i) {
        Logger.debug("Starting activity for result");
        this.pluginCallForLastActivity = pluginCall;
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(getActivity(), intent, i);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PluginHandle pluginWithRequestCode = getPluginWithRequestCode(i);
        if (pluginWithRequestCode == null) {
            Logger.debug("Unable to find a Capacitor plugin to handle permission requestCode, trying Cordova plugins " + i);
            try {
                this.cordovaInterface.onRequestPermissionResult(i, strArr, iArr);
                return;
            } catch (JSONException e) {
                Logger.debug("Error on Cordova plugin permissions request " + e.getMessage());
                return;
            }
        }
        pluginWithRequestCode.getInstance().handleRequestPermissionsResult(i, strArr, iArr);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        PluginHandle pluginWithRequestCode = getPluginWithRequestCode(i);
        if (pluginWithRequestCode == null || pluginWithRequestCode.getInstance() == null) {
            Logger.debug("Unable to find a Capacitor plugin to handle requestCode, trying Cordova plugins " + i);
            CordovaPlugin activityResultCallback = ((MockCordovaInterfaceImpl) this.cordovaInterface).getActivityResultCallback();
            this.cordovaInterface.onActivityResult(i, i2, intent);
            if (activityResultCallback != null) {
                String serviceName = activityResultCallback.getServiceName();
                HashSet<String> hashSet = this.cordovaResultOverride;
                if (hashSet != null && hashSet.contains(serviceName)) {
                    Logger.debug("skip cordova result, plugin: " + serviceName);
                    return false;
                }
            }
            return true;
        }
        if (pluginWithRequestCode.getInstance().getSavedCall() == null && this.pluginCallForLastActivity != null) {
            pluginWithRequestCode.getInstance().saveCall(this.pluginCallForLastActivity);
        }
        pluginWithRequestCode.getInstance().handleOnActivityResult(i, i2, intent);
        this.pluginCallForLastActivity = null;
        return true;
    }

    public void onNewIntent(Intent intent) {
        Iterator<PluginHandle> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            it.next().getInstance().handleOnNewIntent(intent);
        }
    }

    public void onRestart() {
        Iterator<PluginHandle> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            it.next().getInstance().handleOnRestart();
        }
    }

    public void onStart() {
        Iterator<PluginHandle> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            it.next().getInstance().handleOnStart();
        }
    }

    public void onResume() {
        Iterator<PluginHandle> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            it.next().getInstance().handleOnResume();
        }
    }

    public void onPause() {
        Splash.onPause();
        Iterator<PluginHandle> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            it.next().getInstance().handleOnPause();
        }
    }

    public void onStop() {
        Iterator<PluginHandle> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            it.next().getInstance().handleOnStop();
        }
    }

    public void onDestroy() {
        Iterator<PluginHandle> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            it.next().getInstance().handleOnDestroy();
        }
    }

    public void onBackPressed() {
        PluginHandle plugin = getPlugin("App");
        if (plugin != null) {
            App app = (App) plugin.getInstance();
            if (app.hasBackButtonListeners()) {
                app.fireBackButton();
            } else if (this.webViewBridge.canGoBack()) {
                this.webViewBridge.goBack();
            }
        }
    }

    public String getServerBasePath() {
        return this.localServer.getBasePath();
    }

    public void setServerBasePath(String str) {
        if (this.webViewBridge.hasFileServer()) {
            this.localServer.hostFiles(str);
            this.webViewBridge.post(new Runnable() { // from class: com.getcapacitor.Bridge.5
                @Override // java.lang.Runnable
                public void run() {
                    Bridge.this.webViewBridge.loadUrl(Bridge.this.appUrl);
                }
            });
        }
    }

    public void setServerAssetPath(String str) {
        if (this.webViewBridge.hasFileServer()) {
            this.localServer.hostAssets(str);
            this.webViewBridge.post(new Runnable() { // from class: com.getcapacitor.Bridge.6
                @Override // java.lang.Runnable
                public void run() {
                    Bridge.this.webViewBridge.loadUrl(Bridge.this.appUrl);
                }
            });
        }
    }

    public String getLocalUrl() {
        return this.localUrl;
    }

    public WebViewLocalServer getLocalServer() {
        if (this.webViewBridge.hasFileServer()) {
            return this.localServer;
        }
        return null;
    }

    public HostMask getAppAllowNavigationMask() {
        return this.appAllowNavigationMask;
    }

    public BridgeWebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    public void setWebViewClient(BridgeWebViewClient bridgeWebViewClient) {
        this.webViewClient = bridgeWebViewClient;
    }

    public void setCordovaResultOverride(HashSet<String> hashSet) {
        this.cordovaResultOverride = hashSet;
    }
}
