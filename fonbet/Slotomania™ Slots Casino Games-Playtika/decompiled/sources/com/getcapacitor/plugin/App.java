package com.getcapacitor.plugin;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.PluginResult;
import com.safedk.android.utils.Logger;

@NativePlugin
/* loaded from: classes8.dex */
public class App extends Plugin {
    private static final String EVENT_BACK_BUTTON = "backButton";
    private static final String EVENT_RESTORED_RESULT = "appRestoredResult";
    private static final String EVENT_STATE_CHANGE = "appStateChange";
    private static final String EVENT_URL_OPEN = "appUrlOpen";
    private boolean isActive = false;

    public static void safedk_AppCompatActivity_startActivity_a955971bc7cfd53da954b60b6b0cd311(AppCompatActivity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/appcompat/app/AppCompatActivity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public void fireChange(boolean z) {
        com.getcapacitor.Logger.debug(getLogTag(), "Firing change: " + z);
        JSObject jSObject = new JSObject();
        jSObject.put("isActive", z);
        this.isActive = z;
        notifyListeners(EVENT_STATE_CHANGE, jSObject, false);
    }

    public void fireRestoredResult(PluginResult pluginResult) {
        com.getcapacitor.Logger.debug(getLogTag(), "Firing restored result");
        notifyListeners(EVENT_RESTORED_RESULT, pluginResult.getWrappedResult(), true);
    }

    public void fireBackButton() {
        notifyListeners(EVENT_BACK_BUTTON, new JSObject(), true);
        this.bridge.triggerJSEvent("backbutton", "document");
    }

    public boolean hasBackButtonListeners() {
        return hasListeners(EVENT_BACK_BUTTON);
    }

    @PluginMethod
    public void exitApp(PluginCall pluginCall) {
        getBridge().getActivity().finish();
    }

    @PluginMethod
    public void getLaunchUrl(PluginCall pluginCall) {
        Uri intentUri = this.bridge.getIntentUri();
        if (intentUri != null) {
            JSObject jSObject = new JSObject();
            jSObject.put("url", intentUri.toString());
            pluginCall.success(jSObject);
            return;
        }
        pluginCall.success();
    }

    @PluginMethod
    public void getState(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("isActive", this.isActive);
        pluginCall.success(jSObject);
    }

    @PluginMethod
    public void canOpenUrl(PluginCall pluginCall) {
        String string = pluginCall.getString("url");
        if (string == null) {
            pluginCall.error("Must supply a url");
            return;
        }
        PackageManager packageManager = getActivity().getApplicationContext().getPackageManager();
        JSObject jSObject = new JSObject();
        try {
            packageManager.getPackageInfo(string, 1);
            jSObject.put("value", true);
            pluginCall.success(jSObject);
        } catch (PackageManager.NameNotFoundException unused) {
            com.getcapacitor.Logger.error(getLogTag(), "Package name '" + string + "' not found!", null);
            jSObject.put("value", false);
            pluginCall.success(jSObject);
        }
    }

    @PluginMethod
    public void openUrl(PluginCall pluginCall) {
        String string = pluginCall.getString("url");
        if (string == null) {
            pluginCall.error("Must provide a url to open");
            return;
        }
        JSObject jSObject = new JSObject();
        PackageManager packageManager = getContext().getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(string));
        try {
            safedk_AppCompatActivity_startActivity_a955971bc7cfd53da954b60b6b0cd311(getActivity(), intent);
            jSObject.put("completed", true);
        } catch (Exception unused) {
            try {
                safedk_AppCompatActivity_startActivity_a955971bc7cfd53da954b60b6b0cd311(getActivity(), packageManager.getLaunchIntentForPackage(string));
                jSObject.put("completed", true);
            } catch (Exception unused2) {
                jSObject.put("completed", false);
            }
        }
        pluginCall.success(jSObject);
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);
        intent.getDataString();
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!"android.intent.action.VIEW".equals(action) || data == null) {
            return;
        }
        JSObject jSObject = new JSObject();
        jSObject.put("url", data.toString());
        notifyListeners(EVENT_URL_OPEN, jSObject, true);
    }
}
