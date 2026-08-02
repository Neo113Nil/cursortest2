package com.android.plugins;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import org.apache.cordova.BuildConfig;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Permissions extends CordovaPlugin {
    private static final String ACTION_CHECK_PERMISSION = "checkPermission";
    private static int ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE = 5469;
    private static final String ACTION_REQUEST_PERMISSION = "requestPermission";
    private static final String ACTION_REQUEST_PERMISSIONS = "requestPermissions";
    private static final String KEY_ERROR = "error";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_RESULT_PERMISSION = "hasPermission";
    private static final int REQUEST_CODE_ENABLE_PERMISSION = 55433;
    private static String TAG = "Permissions";
    private CallbackContext permissionsCallback;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, BuildConfig.APPLICATION_ID);
        p0.startActivityForResult(p1, p2);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, final JSONArray jSONArray, final CallbackContext callbackContext) throws JSONException {
        if (ACTION_CHECK_PERMISSION.equals(str)) {
            this.f3354cordova.getThreadPool().execute(new Runnable() { // from class: com.android.plugins.Permissions.1
                @Override // java.lang.Runnable
                public void run() {
                    Permissions.this.checkPermissionAction(callbackContext, jSONArray);
                }
            });
            return true;
        }
        if (!ACTION_REQUEST_PERMISSION.equals(str) && !ACTION_REQUEST_PERMISSIONS.equals(str)) {
            return false;
        }
        this.f3354cordova.getThreadPool().execute(new Runnable() { // from class: com.android.plugins.Permissions.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Permissions.this.requestPermissionAction(callbackContext, jSONArray);
                } catch (Exception e) {
                    e.printStackTrace();
                    JSONObject jSONObject = new JSONObject();
                    Permissions.this.addProperty(jSONObject, "error", Permissions.ACTION_REQUEST_PERMISSION);
                    Permissions.this.addProperty(jSONObject, "message", "Request permission has been denied.");
                    callbackContext.error(jSONObject);
                    Permissions.this.permissionsCallback = null;
                }
            }
        });
        return true;
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) throws JSONException {
        if (this.permissionsCallback == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (strArr != null && strArr.length > 0) {
            addProperty(jSONObject, KEY_RESULT_PERMISSION, Boolean.valueOf(hasAllPermissions(strArr)));
            this.permissionsCallback.success(jSONObject);
        } else {
            addProperty(jSONObject, "error", ACTION_REQUEST_PERMISSION);
            addProperty(jSONObject, "message", "Unknown error.");
            this.permissionsCallback.error(jSONObject);
        }
        this.permissionsCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermissionAction(CallbackContext callbackContext, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0 || jSONArray.length() > 1) {
            JSONObject jSONObject = new JSONObject();
            addProperty(jSONObject, "error", ACTION_CHECK_PERMISSION);
            addProperty(jSONObject, "message", "One time one permission only.");
            callbackContext.error(jSONObject);
            return;
        }
        try {
            String string = jSONArray.getString(0);
            JSONObject jSONObject2 = new JSONObject();
            if ("android.permission.SYSTEM_ALERT_WINDOW".equals(string)) {
                addProperty(jSONObject2, KEY_RESULT_PERMISSION, Boolean.valueOf(Settings.canDrawOverlays(this.f3354cordova.getActivity().getApplicationContext())));
            } else if ("android.permission.SCHEDULE_EXACT_ALARM".equals(string)) {
                addProperty(jSONObject2, KEY_RESULT_PERMISSION, Boolean.valueOf(checkAlarmPermission()));
            } else {
                addProperty(jSONObject2, KEY_RESULT_PERMISSION, Boolean.valueOf(this.f3354cordova.hasPermission(string)));
            }
            callbackContext.success(jSONObject2);
        } catch (JSONException e) {
            JSONObject jSONObject3 = new JSONObject();
            addProperty(jSONObject3, "error", ACTION_REQUEST_PERMISSION);
            addProperty(jSONObject3, "message", "Check permission has been failed." + e);
            callbackContext.error(jSONObject3);
        }
    }

    private boolean checkAlarmPermission() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ((AlarmManager) this.f3354cordova.getContext().getSystemService(NotificationCompat.CATEGORY_ALARM)).canScheduleExactAlarms();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestPermissionAction(CallbackContext callbackContext, JSONArray jSONArray) throws Exception {
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONObject jSONObject = new JSONObject();
            addProperty(jSONObject, "error", ACTION_REQUEST_PERMISSION);
            addProperty(jSONObject, "message", "At least one permission.");
            callbackContext.error(jSONObject);
            return;
        }
        if (hasAllPermissions(jSONArray)) {
            JSONObject jSONObject2 = new JSONObject();
            addProperty(jSONObject2, KEY_RESULT_PERMISSION, true);
            callbackContext.success(jSONObject2);
            return;
        }
        this.permissionsCallback = callbackContext;
        String[] permissions = getPermissions(jSONArray);
        if (permissions.length == 1 && "android.permission.SYSTEM_ALERT_WINDOW".equals(permissions[0])) {
            Log.i(TAG, "Request permission SYSTEM_ALERT_WINDOW");
            Activity activity = this.f3354cordova.getActivity();
            if (!Settings.canDrawOverlays(this.f3354cordova.getActivity().getApplicationContext())) {
                Log.w(TAG, "Request permission SYSTEM_ALERT_WINDOW start intent because canDrawOverlays=false");
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())), ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE);
                return;
            }
        }
        this.f3354cordova.requestPermissions(this, REQUEST_CODE_ENABLE_PERMISSION, permissions);
    }

    private String[] getPermissions(JSONArray jSONArray) {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                strArr[i] = jSONArray.getString(i);
            } catch (JSONException unused) {
            }
        }
        return strArr;
    }

    private boolean hasAllPermissions(JSONArray jSONArray) throws JSONException {
        return hasAllPermissions(getPermissions(jSONArray));
    }

    private boolean hasAllPermissions(String[] strArr) throws JSONException {
        for (String str : strArr) {
            if (!this.f3354cordova.hasPermission(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperty(JSONObject jSONObject, String str, Object obj) {
        try {
            if (obj == null) {
                jSONObject.put(str, JSONObject.NULL);
            } else {
                jSONObject.put(str, obj);
            }
        } catch (JSONException unused) {
        }
    }
}
