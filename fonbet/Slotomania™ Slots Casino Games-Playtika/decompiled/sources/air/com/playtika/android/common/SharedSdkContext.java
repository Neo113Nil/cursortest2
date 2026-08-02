package air.com.playtika.android.common;

import air.com.playtika.android.common.account.AccountPreferenceService;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.preference.PreferenceManager;
import androidx.webkit.WebViewAssetLoader;
import com.google.common.net.HttpHeaders;
import com.playtika.sharedsdk.DefaultSdkContext;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SharedSdkContext extends DefaultSdkContext {
    private static final int INPUT_FILE_REQUEST_CODE = 1;
    private static final int REQUEST_PERMISSIONS_CODE = 112;
    private static final String TAG = "SharedSdkContext";
    private final AccountPreferenceService accountPreferenceService;
    private final GameActivity activity;
    private ValueCallback<Uri[]> filePathCallback;
    private GameSurfaceView gameSurfaceView;
    private final String[] mimeTypes;
    private final SentryEventHandler sentryEventHandler;
    private final WebAppInterface webAppInterface;
    private WebView webView;

    public static native void nativeBackPressed();

    public static native void nativeDebugConfigReady(String str);

    public static native void nativeExecuteScript(String str, boolean z);

    public static native void nativeHandleIntent(String str);

    public static native void nativeInitApp(Object obj, AssetManager assetManager, String str, String str2, String str3, String str4, int i);

    public static native void nativeKeyDown(int i);

    public static native void nativeKeyUp(int i);

    public static native void nativeKeyboardVisibilityChanged(int i);

    public static native void nativeLowMemory();

    public static native void nativeOnPause();

    public static native void nativeOnResume();

    public static native void nativeOnSurfaceChanged(int i, int i2);

    public static native void nativeOnSurfaceCreated(int i, int i2);

    public static native void nativeReloadApp(Object obj);

    public static native void nativeRender();

    public static native void nativeSetDefaultAudioStreamValues(int i, int i2);

    public static native void nativeSetFps(int i);

    public static native void nativeSetSafeInsets(int i, int i2, int i3, int i4);

    public static native void nativeTextInput(String str);

    public static native void nativeTouchBegin(float f, float f2);

    public static native void nativeTouchEnd(float f, float f2);

    public static native void nativeTouchMove(float f, float f2);

    public static native void onAppDestroyed();

    public SharedSdkContext(GameActivity gameActivity) {
        super(gameActivity);
        this.mimeTypes = new String[]{"application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/pdf", "image/*"};
        this.activity = gameActivity;
        this.accountPreferenceService = new AccountPreferenceService(gameActivity);
        this.sentryEventHandler = new SentryEventHandler(gameActivity);
        this.webAppInterface = new WebAppInterface();
    }

    public void attachGameSurfaceView(GameSurfaceView gameSurfaceView) {
        this.gameSurfaceView = gameSurfaceView;
        this.webAppInterface.attach(gameSurfaceView);
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext
    public GameActivity getActivity() {
        return this.activity;
    }

    public SentryEventHandler getSentryEventHandler() {
        return this.sentryEventHandler;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        String dataString;
        if (i != 1 || this.filePathCallback == null) {
            return false;
        }
        this.filePathCallback.onReceiveValue((i2 != -1 || intent == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)});
        this.filePathCallback = null;
        return true;
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext
    public String GetUserAgent() {
        String str;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused) {
            Log.w(TAG, "Unable to retrieve userAgent from System properties");
            str = null;
        }
        if (str != null) {
            return str;
        }
        try {
            return WebSettings.getDefaultUserAgent(this.activity);
        } catch (Exception unused2) {
            Log.w(TAG, "Unable to retrieve userAgent from WebSettings");
            return str;
        }
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void SetNotificationEnabledMode(boolean z) {
        Log.i(TAG, "SetNotificationEnabledMode: " + z);
        PreferenceManager.getDefaultSharedPreferences(this.activity).edit().putBoolean("notificationsEnabled", z).apply();
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void SetKeyValueToAccountStorage(String str, String str2) {
        this.accountPreferenceService.Set(str, str2);
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public String GetKeyValueFromAccountStorage(String str, String str2) {
        return this.accountPreferenceService.Get(str, str2);
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public String RetrieveLastSentryAnrEvent() {
        return this.sentryEventHandler.retrieveLastSentryAnrEvent();
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void keepAwake() {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$keepAwake$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$keepAwake$0() {
        this.activity.getWindow().addFlags(128);
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void allowSleep() {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$allowSleep$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$allowSleep$1() {
        this.activity.getWindow().clearFlags(128);
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void postMessage(String str) {
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.postMessage(str);
        }
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void reload() {
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.reloadNativeApp(this);
        }
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void onNativeAppReloaded() {
        final GameActivity gameActivity = this.activity;
        Objects.requireNonNull(gameActivity);
        gameActivity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.this.reloadCapacitorBridge();
            }
        });
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void showInput(final int i) {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$showInput$2(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showInput$2(int i) {
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.showKeyboard(i);
        }
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void hideInput() {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$hideInput$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideInput$3() {
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.hideKeyboard();
        }
        this.activity.hideSystemUi();
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void requestDebugConfig(final String str) {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$requestDebugConfig$4(str);
            }
        });
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void openWebView(final String str, final String str2) {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$openWebView$5(str, str2);
            }
        });
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void closeWebView() {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$closeWebView$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeWebView$6() {
        if (this.webView == null) {
            return;
        }
        ((CoordinatorLayout) this.activity.findViewById(R.id.root_view)).removeView(this.webView);
        this.webView.destroy();
        this.webView = null;
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void setWebViewVisibility(final boolean z) {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$setWebViewVisibility$7(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWebViewVisibility$7(boolean z) {
        WebView webView = this.webView;
        if (webView == null) {
            Log.w(TAG, "Can not set update visibility: webView == null.");
            return;
        }
        webView.setVisibility(z ? 0 : 4);
        if (z) {
            this.webView.invalidate();
            this.webView.requestLayout();
        }
    }

    @Override // com.playtika.sharedsdk.DefaultSdkContext, com.playtika.sharedsdk.SharedSdkCallback
    public void postMessageToWebView(final String str) {
        this.activity.runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                SharedSdkContext.this.lambda$postMessageToWebView$8(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postMessageToWebView$8(String str) {
        WebView webView = this.webView;
        if (webView == null) {
            Log.w(TAG, "Cannot post message to WebView: webView is null");
        } else {
            webView.evaluateJavascript("window.__onGameMessage('" + str.replaceAll("'", "\\\\'") + "')", null);
        }
    }

    public WebView getWebView() {
        return this.webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doOpenWebView, reason: merged with bridge method [inline-methods] */
    public void lambda$openWebView$5(String str, String str2) {
        String str3 = "https://appassets.androidplatform.net/assets/" + str;
        if (this.webView == null) {
            this.webView = createWebView();
            ((CoordinatorLayout) this.activity.findViewById(R.id.root_view)).addView(this.webView);
        }
        this.webAppInterface.setInitData(str2);
        this.webView.loadUrl(str3);
    }

    private WebView createWebView() {
        WebView webView = new WebView(this.activity);
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
        webView.setBackgroundColor(Color.argb(175, 0, 0, 0));
        webView.setLayoutParams(layoutParams);
        webView.addJavascriptInterface(this.webAppInterface, "WebApp");
        webView.getSettings().setSupportMultipleWindows(true);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        final WebViewAssetLoader build = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this.activity)).build();
        webView.setWebChromeClient(buildChromeClient());
        webView.setDownloadListener(buildDownloadListener(webView));
        webView.setWebViewClient(new WebViewClient() { // from class: air.com.playtika.android.common.SharedSdkContext.1
            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                return build.shouldInterceptRequest(webResourceRequest.getUrl());
            }
        });
        registerDownloadCompleteReceiver();
        return webView;
    }

    private WebChromeClient buildChromeClient() {
        return new WebChromeClient() { // from class: air.com.playtika.android.common.SharedSdkContext.2
            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p1 == null) {
                    return;
                }
                p0.startActivity(p1);
            }

            public static void safedk_GameActivity_startActivityForResult_d3bdbd726c3bac1ec10bb7e36dba197c(GameActivity p0, Intent p1, int p2) {
                Logger.d("SafeDK-Special|SafeDK: Call> Lair/com/playtika/android/common/GameActivity;->startActivityForResult(Landroid/content/Intent;I)V");
                if (p1 == null) {
                    return;
                }
                p0.startActivityForResult(p1, p2);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                if (SharedSdkContext.this.filePathCallback != null) {
                    SharedSdkContext.this.filePathCallback.onReceiveValue(null);
                }
                SharedSdkContext.this.filePathCallback = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType(SharedSdkContext.this.mimeTypes.length == 1 ? SharedSdkContext.this.mimeTypes[0] : "*/*");
                if (SharedSdkContext.this.mimeTypes.length > 0) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", SharedSdkContext.this.mimeTypes);
                }
                Intent intent2 = new Intent("android.intent.action.CHOOSER");
                intent2.putExtra("android.intent.extra.INTENT", intent);
                intent2.putExtra("android.intent.extra.TITLE", "File Chooser");
                intent2.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[0]);
                safedk_GameActivity_startActivityForResult_d3bdbd726c3bac1ec10bb7e36dba197c(SharedSdkContext.this.activity, intent2, 1);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                String extra;
                WebView.HitTestResult hitTestResult = webView.getHitTestResult();
                if (hitTestResult == null || (extra = hitTestResult.getExtra()) == null) {
                    return false;
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(webView.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(extra)));
                return false;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.d("WebApp", consoleMessage.message() + ServerSentEventKt.SPACE + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber());
                return true;
            }
        };
    }

    private DownloadListener buildDownloadListener(final WebView webView) {
        return new DownloadListener() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda2
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                SharedSdkContext.this.lambda$buildDownloadListener$9(webView, str, str2, str3, str4, j);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildDownloadListener$9(WebView webView, String str, String str2, String str3, String str4, long j) {
        if (str.startsWith("blob")) {
            return;
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (Build.VERSION.SDK_INT < 33 && !hasPermissions(webView.getContext(), strArr)) {
            Toast.makeText(this.activity.getApplicationContext(), "Downloading is blocked.", 1).show();
            ActivityCompat.requestPermissions(this.activity, strArr, 112);
            return;
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType("*.*");
        request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader(HttpHeaders.USER_AGENT, str2);
        request.setDescription("Downloading file...");
        String guessFileName = URLUtil.guessFileName(str, str3, str4);
        if (guessFileName.endsWith(".bin")) {
            Matcher matcher = Pattern.compile("response-content-disposition=attachment;\\sfilename\\s*=\\s*\"([^\"]+)\"").matcher(Uri.decode(str));
            if (matcher.find()) {
                guessFileName = matcher.group(1);
            }
        }
        String replaceAll = guessFileName.replaceAll("[\\\\/:*?\"<>|]", "-");
        request.setTitle(replaceAll);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, replaceAll);
        ((DownloadManager) this.activity.getSystemService(NativeAdPresenter.DOWNLOAD)).enqueue(request);
        Toast.makeText(this.activity.getApplicationContext(), "Downloading of " + replaceAll + " into Downloads.", 1).show();
    }

    private void registerDownloadCompleteReceiver() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: air.com.playtika.android.common.SharedSdkContext.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null || !"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction()) || intent.getLongExtra("extra_download_id", -1L) == -1) {
                    return;
                }
                Toast.makeText(SharedSdkContext.this.activity.getApplicationContext(), "Downloading finished.", 1).show();
            }
        };
        if (Build.VERSION.SDK_INT > 33) {
            this.activity.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            this.activity.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    private boolean hasPermissions(Context context, String... strArr) {
        if (context == null || strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (ActivityCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDebugConfigDialog, reason: merged with bridge method [inline-methods] */
    public void lambda$requestDebugConfig$4(String str) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(jSONObject.getString("name"));
                arrayList2.add(jSONObject.getString("configUrl"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        View inflate = this.activity.getLayoutInflater().inflate(R.layout.debug_dialog_layout, (ViewGroup) null);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.activity, android.R.layout.simple_spinner_item, arrayList);
        final Spinner spinner = (Spinner) inflate.findViewById(R.id.stages_input);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.create_new_user);
        final CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.debug_panel_enable);
        final CheckBox checkBox3 = (CheckBox) inflate.findViewById(R.id.debug_logs_enable);
        final CheckBox checkBox4 = (CheckBox) inflate.findViewById(R.id.debug_panel_only_fps);
        final CheckBox checkBox5 = (CheckBox) inflate.findViewById(R.id.debug_do_not_ask);
        final CheckBox checkBox6 = (CheckBox) inflate.findViewById(R.id.load_locally_ondemand_feature);
        final CheckBox checkBox7 = (CheckBox) inflate.findViewById(R.id.use_embedded_client_version);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        int indexOf = arrayList.indexOf("Preprod");
        if (indexOf != -1) {
            spinner.setSelection(indexOf);
        }
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this.activity, R.array.uiAnrWatcher_ms_array, android.R.layout.simple_spinner_item);
        Spinner spinner2 = (Spinner) inflate.findViewById(R.id.uiAnrWatcherSpinner);
        spinner2.setAdapter((SpinnerAdapter) createFromResource);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: air.com.playtika.android.common.SharedSdkContext.4
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                SharedSdkContext.this.activity.getSharedPreferences("UiAnrWatcher", 0).edit().putInt("delay_check_millis", Integer.parseInt(adapterView.getItemAtPosition(i2).toString())).apply();
            }
        });
        final Spinner spinner3 = (Spinner) inflate.findViewById(R.id.uiAssetsGroupSpinner);
        new AlertDialog.Builder(this.activity).setView(inflate).setIcon(android.R.drawable.ic_dialog_alert).setCancelable(false).setTitle("Debug options").setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: air.com.playtika.android.common.SharedSdkContext$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SharedSdkContext.this.lambda$showDebugConfigDialog$10(spinner, arrayList2, arrayList, checkBox, checkBox5, checkBox2, checkBox4, checkBox3, checkBox6, checkBox7, spinner3, dialogInterface, i2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDebugConfigDialog$10(Spinner spinner, ArrayList arrayList, ArrayList arrayList2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, Spinner spinner2, DialogInterface dialogInterface, int i) {
        int selectedItemPosition = spinner.getSelectedItemPosition();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("configUrl", arrayList.get(selectedItemPosition));
            jSONObject.put("name", arrayList2.get(selectedItemPosition));
            jSONObject.put("createNewUser", checkBox.isChecked());
            jSONObject.put("doNotAsk", checkBox2.isChecked());
            jSONObject.put("debugPanelEnable", checkBox3.isChecked());
            jSONObject.put("debugPanelOnlyFPS", checkBox4.isChecked());
            jSONObject.put("debugLogEnable", checkBox5.isChecked());
            jSONObject.put("loadLocallyOndemandFeature", checkBox6.isChecked());
            jSONObject.put("useEmbeddedClientVersion", checkBox7.isChecked());
            try {
                jSONObject.put("chosenAssetsGroup", Integer.parseInt(spinner2.getSelectedItem().toString()));
            } catch (NumberFormatException unused) {
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.debugConfigReady(jSONObject.toString());
        }
    }

    public static class WebAppInterface {
        private String initData = "";
        private GameSurfaceView view;

        public void attach(GameSurfaceView gameSurfaceView) {
            this.view = gameSurfaceView;
        }

        @JavascriptInterface
        public String getInitData() {
            return this.initData;
        }

        public void setInitData(String str) {
            this.initData = str;
        }

        @JavascriptInterface
        public void postMessage(String str) {
            GameSurfaceView gameSurfaceView = this.view;
            if (gameSurfaceView == null) {
                return;
            }
            gameSurfaceView.executeScript("window.__onWebAppMessage('" + str.replaceAll("'", "\\'") + "')", null);
        }
    }
}
