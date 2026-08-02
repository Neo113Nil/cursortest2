package de.appplant.cordova.plugin.localnotification;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.PowerManager;
import android.util.Pair;
import com.google.android.exoplayer2.offline.DownloadService;
import com.ironsource.C2608q2;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.utils.Logger;
import de.appplant.cordova.plugin.notification.Manager;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.Options;
import de.appplant.cordova.plugin.notification.Request;
import de.appplant.cordova.plugin.notification.action.ActionGroup;
import io.sentry.MonitorConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.BuildConfig;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class LocalNotification extends CordovaPlugin {
    private static Pair<Integer, String> launchDetails;
    private static WeakReference<CordovaWebView> webView;
    private CallbackContext callbackContext;
    private static Boolean deviceready = false;
    private static ArrayList<String> eventQueue = new ArrayList<>();
    private static int REQUEST_PERMISSIONS_CALL = 10;
    private static int REQUEST_IGNORE_BATTERY_CALL = 20;

    public static void safedk_CordovaInterface_startActivityForResult_0406db0955f4e08e1191f68a9508d14e(CordovaInterface p0, CordovaPlugin p1, Intent p2, int p3) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lorg/apache/cordova/CordovaInterface;->startActivityForResult(Lorg/apache/cordova/CordovaPlugin;Landroid/content/Intent;I)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, BuildConfig.APPLICATION_ID);
        p0.startActivityForResult(p1, p2, p3);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        webView = new WeakReference<>(cordovaWebView);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onResume(boolean z) {
        super.onResume(z);
        deviceready();
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onDestroy() {
        deviceready = false;
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(final String str, final JSONArray jSONArray, final CallbackContext callbackContext) throws JSONException {
        if (str.equals("launch")) {
            launch(callbackContext);
            return true;
        }
        this.f3354cordova.getThreadPool().execute(new Runnable() { // from class: de.appplant.cordova.plugin.localnotification.LocalNotification.1
            @Override // java.lang.Runnable
            public void run() {
                if (str.equals(X3.i.s)) {
                    LocalNotification.deviceready();
                    return;
                }
                if (str.equals("check")) {
                    LocalNotification.this.check(callbackContext);
                    return;
                }
                if (str.equals("request")) {
                    LocalNotification.this.request(callbackContext);
                    return;
                }
                if (str.equals("actions")) {
                    LocalNotification.this.actions(jSONArray, callbackContext);
                    return;
                }
                if (str.equals(MonitorConfig.JsonKeys.SCHEDULE)) {
                    LocalNotification.this.schedule(jSONArray, callbackContext);
                    return;
                }
                if (str.equals("update")) {
                    LocalNotification.this.update(jSONArray, callbackContext);
                    return;
                }
                if (str.equals("cancel")) {
                    LocalNotification.this.cancel(jSONArray, callbackContext);
                    return;
                }
                if (str.equals("cancelAll")) {
                    LocalNotification.this.cancelAll(callbackContext);
                    return;
                }
                if (str.equals("clear")) {
                    LocalNotification.this.clear(jSONArray, callbackContext);
                    return;
                }
                if (str.equals("clearAll")) {
                    LocalNotification.this.clearAll(callbackContext);
                    return;
                }
                if (str.equals("type")) {
                    LocalNotification.this.type(jSONArray, callbackContext);
                    return;
                }
                if (str.equals("ids")) {
                    LocalNotification.this.ids(jSONArray, callbackContext);
                    return;
                }
                if (str.equals("notification")) {
                    LocalNotification.this.notification(jSONArray, callbackContext);
                    return;
                }
                if (str.equals(C2608q2.x)) {
                    LocalNotification.this.notifications(jSONArray, callbackContext);
                    return;
                }
                if (str.equals("hasDoNotDisturbPermissions")) {
                    LocalNotification.this.hasDoNotDisturbPermissions(callbackContext);
                    return;
                }
                if (str.equals("requestDoNotDisturbPermissions")) {
                    LocalNotification.this.requestDoNotDisturbPermissions(callbackContext);
                } else if (str.equals("isIgnoringBatteryOptimizations")) {
                    LocalNotification.this.isIgnoringBatteryOptimizations(callbackContext);
                } else if (str.equals("requestIgnoreBatteryOptimizations")) {
                    LocalNotification.this.requestIgnoreBatteryOptimizations(callbackContext);
                }
            }
        });
        return true;
    }

    private boolean needsDoNotDisturbPermissions() {
        return !((NotificationManager) this.f3354cordova.getActivity().getApplicationContext().getSystemService("notification")).isNotificationPolicyAccessGranted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hasDoNotDisturbPermissions(CallbackContext callbackContext) {
        success(callbackContext, !needsDoNotDisturbPermissions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestDoNotDisturbPermissions(CallbackContext callbackContext) {
        if (needsDoNotDisturbPermissions()) {
            this.callbackContext = callbackContext;
            PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
            pluginResult.setKeepCallback(true);
            callbackContext.sendPluginResult(pluginResult);
            safedk_CordovaInterface_startActivityForResult_0406db0955f4e08e1191f68a9508d14e(this.f3354cordova, this, new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), REQUEST_PERMISSIONS_CALL);
            return;
        }
        success(callbackContext, true);
    }

    private boolean ignoresBatteryOptimizations() {
        Context applicationContext = this.f3354cordova.getActivity().getApplicationContext();
        return ((PowerManager) applicationContext.getSystemService("power")).isIgnoringBatteryOptimizations(applicationContext.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isIgnoringBatteryOptimizations(CallbackContext callbackContext) {
        success(callbackContext, ignoresBatteryOptimizations());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestIgnoreBatteryOptimizations(CallbackContext callbackContext) {
        if (!ignoresBatteryOptimizations()) {
            this.callbackContext = callbackContext;
            PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
            pluginResult.setKeepCallback(true);
            callbackContext.sendPluginResult(pluginResult);
            String packageName = this.f3354cordova.getContext().getPackageName();
            String str = "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS";
            try {
                PackageInfo packageInfo = this.f3354cordova.getContext().getPackageManager().getPackageInfo(packageName, 4096);
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if (packageInfo.requestedPermissions[i].equals("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                        str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            try {
                Intent intent = new Intent(str);
                intent.setData(Uri.parse("package:" + packageName));
                safedk_CordovaInterface_startActivityForResult_0406db0955f4e08e1191f68a9508d14e(this.f3354cordova, this, intent, REQUEST_IGNORE_BATTERY_CALL);
                return;
            } catch (ActivityNotFoundException unused2) {
                isIgnoringBatteryOptimizations(callbackContext);
                this.callbackContext = null;
                return;
            }
        }
        success(callbackContext, true);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onActivityResult(int i, int i2, Intent intent) {
        CallbackContext callbackContext;
        CallbackContext callbackContext2;
        if (i == REQUEST_PERMISSIONS_CALL && (callbackContext2 = this.callbackContext) != null) {
            hasDoNotDisturbPermissions(callbackContext2);
            this.callbackContext = null;
        } else if (i == REQUEST_IGNORE_BATTERY_CALL && (callbackContext = this.callbackContext) != null) {
            isIgnoringBatteryOptimizations(callbackContext);
            this.callbackContext = null;
        }
        super.onActivityResult(i, i2, intent);
    }

    private void launch(CallbackContext callbackContext) {
        if (launchDetails == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", launchDetails.first);
            jSONObject.put("action", launchDetails.second);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        callbackContext.success(jSONObject);
        launchDetails = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void check(CallbackContext callbackContext) {
        success(callbackContext, getNotMgr().hasPermission());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void request(CallbackContext callbackContext) {
        check(callbackContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actions(JSONArray jSONArray, CallbackContext callbackContext) {
        int optInt = jSONArray.optInt(0);
        String optString = jSONArray.optString(1);
        JSONArray optJSONArray = jSONArray.optJSONArray(2);
        Activity activity = this.f3354cordova.getActivity();
        if (optInt == 0) {
            ActionGroup.register(ActionGroup.parse(activity, optString, optJSONArray));
            callbackContext.success();
        } else if (optInt == 1) {
            ActionGroup.unregister(optString);
            callbackContext.success();
        } else {
            if (optInt != 2) {
                return;
            }
            success(callbackContext, ActionGroup.isRegistered(optString));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedule(JSONArray jSONArray, CallbackContext callbackContext) {
        Manager notMgr = getNotMgr();
        for (int i = 0; i < jSONArray.length(); i++) {
            Notification schedule = notMgr.schedule(new Request(new Options(jSONArray.optJSONObject(i))), TriggerReceiver.class);
            if (schedule != null) {
                fireEvent(m.l, schedule);
            }
        }
        check(callbackContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void update(JSONArray jSONArray, CallbackContext callbackContext) {
        Manager notMgr = getNotMgr();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            Notification update = notMgr.update(optJSONObject.optInt("id", 0), optJSONObject, TriggerReceiver.class);
            if (update != null) {
                fireEvent("update", update);
            }
        }
        check(callbackContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancel(JSONArray jSONArray, CallbackContext callbackContext) {
        Manager notMgr = getNotMgr();
        for (int i = 0; i < jSONArray.length(); i++) {
            Notification cancel = notMgr.cancel(jSONArray.optInt(i, 0));
            if (cancel != null) {
                fireEvent("cancel", cancel);
            }
        }
        callbackContext.success();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAll(CallbackContext callbackContext) {
        getNotMgr().cancelAll();
        fireEvent("cancelall");
        callbackContext.success();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear(JSONArray jSONArray, CallbackContext callbackContext) {
        Manager notMgr = getNotMgr();
        for (int i = 0; i < jSONArray.length(); i++) {
            Notification clear = notMgr.clear(jSONArray.optInt(i, 0));
            if (clear != null) {
                fireEvent("clear", clear);
            }
        }
        callbackContext.success();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAll(CallbackContext callbackContext) {
        getNotMgr().clearAll();
        fireEvent("clearall");
        callbackContext.success();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void type(JSONArray jSONArray, CallbackContext callbackContext) {
        Notification notification = getNotMgr().get(jSONArray.optInt(0));
        if (notification == null) {
            callbackContext.success("unknown");
            return;
        }
        int i = AnonymousClass3.$SwitchMap$de$appplant$cordova$plugin$notification$Notification$Type[notification.getType().ordinal()];
        if (i == 1) {
            callbackContext.success("scheduled");
        } else if (i == 2) {
            callbackContext.success("triggered");
        } else {
            callbackContext.success("unknown");
        }
    }

    /* renamed from: de.appplant.cordova.plugin.localnotification.LocalNotification$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$de$appplant$cordova$plugin$notification$Notification$Type;

        static {
            int[] iArr = new int[Notification.Type.values().length];
            $SwitchMap$de$appplant$cordova$plugin$notification$Notification$Type = iArr;
            try {
                iArr[Notification.Type.SCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$Notification$Type[Notification.Type.TRIGGERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ids(JSONArray jSONArray, CallbackContext callbackContext) {
        List<Integer> ids;
        int optInt = jSONArray.optInt(0);
        Manager notMgr = getNotMgr();
        if (optInt == 0) {
            ids = notMgr.getIds();
        } else if (optInt == 1) {
            ids = notMgr.getIdsByType(Notification.Type.SCHEDULED);
        } else if (optInt == 2) {
            ids = notMgr.getIdsByType(Notification.Type.TRIGGERED);
        } else {
            ids = new ArrayList<>(0);
        }
        callbackContext.success(new JSONArray((Collection) ids));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notification(JSONArray jSONArray, CallbackContext callbackContext) {
        Options options = getNotMgr().getOptions(jSONArray.optInt(0));
        if (options != null) {
            callbackContext.success(options.getDict());
        } else {
            callbackContext.success();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifications(JSONArray jSONArray, CallbackContext callbackContext) {
        List<JSONObject> options;
        int optInt = jSONArray.optInt(0);
        JSONArray optJSONArray = jSONArray.optJSONArray(1);
        Manager notMgr = getNotMgr();
        if (optInt == 0) {
            options = notMgr.getOptions();
        } else if (optInt == 1) {
            options = notMgr.getOptionsByType(Notification.Type.SCHEDULED);
        } else if (optInt == 2) {
            options = notMgr.getOptionsByType(Notification.Type.TRIGGERED);
        } else if (optInt == 3) {
            options = notMgr.getOptionsById(toList(optJSONArray));
        } else {
            options = new ArrayList<>(0);
        }
        callbackContext.success(new JSONArray((Collection) options));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void deviceready() {
        synchronized (LocalNotification.class) {
            deviceready = true;
            Iterator<String> it = eventQueue.iterator();
            while (it.hasNext()) {
                sendJavascript(it.next());
            }
            eventQueue.clear();
        }
    }

    private void success(CallbackContext callbackContext, boolean z) {
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, z));
    }

    private void fireEvent(String str) {
        fireEvent(str, null, new JSONObject());
    }

    public static void fireEvent(String str, Notification notification) {
        fireEvent(str, notification, new JSONObject());
    }

    public static void fireEvent(String str, Notification notification, JSONObject jSONObject) {
        String jSONObject2;
        try {
            jSONObject.put("event", str);
            jSONObject.put(DownloadService.KEY_FOREGROUND, isInForeground());
            jSONObject.put("queued", !deviceready.booleanValue());
            if (notification != null) {
                jSONObject.put("notification", notification.getId());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (notification != null) {
            jSONObject2 = notification.toString() + "," + jSONObject.toString();
        } else {
            jSONObject2 = jSONObject.toString();
        }
        String str2 = "cordova.plugins.notification.local.fireEvent(\"" + str + "\"," + jSONObject2 + ")";
        if (launchDetails == null && !deviceready.booleanValue() && notification != null) {
            launchDetails = new Pair<>(Integer.valueOf(notification.getId()), str);
        }
        sendJavascript(str2);
    }

    private static synchronized void sendJavascript(final String str) {
        WeakReference<CordovaWebView> weakReference;
        synchronized (LocalNotification.class) {
            if (deviceready.booleanValue() && (weakReference = webView) != null) {
                final CordovaWebView cordovaWebView = weakReference.get();
                ((Activity) cordovaWebView.getContext()).runOnUiThread(new Runnable() { // from class: de.appplant.cordova.plugin.localnotification.LocalNotification.2
                    @Override // java.lang.Runnable
                    public void run() {
                        CordovaWebView.this.loadUrl("javascript:" + str);
                    }
                });
                return;
            }
            eventQueue.add(str);
        }
    }

    private static boolean isInForeground() {
        WeakReference<CordovaWebView> weakReference;
        if (deviceready.booleanValue() && (weakReference = webView) != null) {
            CordovaWebView cordovaWebView = weakReference.get();
            KeyguardManager keyguardManager = (KeyguardManager) cordovaWebView.getContext().getSystemService("keyguard");
            if ((keyguardManager == null || !keyguardManager.isKeyguardLocked()) && cordovaWebView.getView().getWindowVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    static boolean isAppRunning() {
        return webView != null;
    }

    private List<Integer> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Integer.valueOf(jSONArray.optInt(i)));
        }
        return arrayList;
    }

    private Manager getNotMgr() {
        return Manager.getInstance(this.f3354cordova.getActivity());
    }
}
