package com.phonegap.plugins.nativesettings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.T3;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.sentry.protocol.Device;
import org.apache.cordova.BuildConfig;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class NativeSettings extends CordovaPlugin {
    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, BuildConfig.APPLICATION_ID);
        p0.startActivity(p1);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        Intent intent;
        Context applicationContext = this.f3354cordova.getActivity().getApplicationContext();
        PluginResult.Status status = PluginResult.Status.OK;
        Uri parse = Uri.parse("package:" + this.f3354cordova.getActivity().getPackageName());
        String string = jSONArray.getString(0);
        if (string.equals("accessibility")) {
            intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        } else if (string.equals("account")) {
            intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        } else if (string.equals("airplane_mode")) {
            intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
        } else if (string.equals("apn")) {
            intent = new Intent("android.settings.APN_SETTINGS");
        } else if (string.equals("application_details")) {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", parse);
        } else if (string.equals("application_development")) {
            intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
        } else if (string.equals("application")) {
            intent = new Intent("android.settings.APPLICATION_SETTINGS");
        } else if (string.equals("battery_optimization")) {
            intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        } else if (string.equals("biometric")) {
            new Intent();
            if (Build.VERSION.SDK_INT >= 28) {
                intent = new Intent("android.settings.FINGERPRINT_ENROLL");
            } else {
                intent = new Intent("android.settings.SETTINGS");
            }
        } else if (string.equals(T3.d)) {
            intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        } else if (string.equals("captioning")) {
            intent = new Intent("android.settings.CAPTIONING_SETTINGS");
        } else if (string.equals("cast")) {
            intent = new Intent("android.settings.CAST_SETTINGS");
        } else if (string.equals("data_roaming")) {
            intent = new Intent("android.settings.DATA_ROAMING_SETTINGS");
        } else if (string.equals(Globalization.DATE)) {
            intent = new Intent("android.settings.DATE_SETTINGS");
        } else if (string.equals("about")) {
            intent = new Intent("android.settings.DEVICE_INFO_SETTINGS");
        } else if (string.equals("display")) {
            intent = new Intent("android.settings.DISPLAY_SETTINGS");
        } else if (string.equals("dream")) {
            intent = new Intent("android.settings.DREAM_SETTINGS");
        } else if (string.equals("home")) {
            intent = new Intent("android.settings.HOME_SETTINGS");
        } else if (string.equals("keyboard")) {
            intent = new Intent("android.settings.INPUT_METHOD_SETTINGS");
        } else if (string.equals("keyboard_subtype")) {
            intent = new Intent("android.settings.INPUT_METHOD_SUBTYPE_SETTINGS");
        } else if (string.equals(X3.a.k)) {
            intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
        } else if (string.equals(Device.JsonKeys.LOCALE)) {
            intent = new Intent("android.settings.LOCALE_SETTINGS");
        } else if (string.equals(FirebaseAnalytics.Param.LOCATION)) {
            intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        } else if (string.equals("manage_all_applications")) {
            intent = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
        } else if (string.equals("manage_applications")) {
            intent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
        } else if (string.equals("memory_card")) {
            intent = new Intent("android.settings.MEMORY_CARD_SETTINGS");
        } else if (string.equals("network")) {
            intent = new Intent("android.settings.NETWORK_OPERATOR_SETTINGS");
        } else if (string.equals("nfcsharing")) {
            intent = new Intent("android.settings.NFCSHARING_SETTINGS");
        } else if (string.equals("nfc_payment")) {
            intent = new Intent("android.settings.NFC_PAYMENT_SETTINGS");
        } else if (string.equals("nfc_settings")) {
            intent = new Intent("android.settings.NFC_SETTINGS");
        } else if (string.startsWith("notification_id")) {
            Intent intent2 = new Intent();
            if (Build.VERSION.SDK_INT > 25) {
                intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent2.putExtra("android.provider.extra.APP_PACKAGE", applicationContext.getPackageName());
            } else {
                intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent2.putExtra("app_package", applicationContext.getPackageName());
                intent2.putExtra("app_uid", applicationContext.getApplicationInfo().uid);
            }
            intent = intent2;
        } else if (string.equals("alarms") && Build.VERSION.SDK_INT >= 33) {
            intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", parse);
        } else if (string.equals("print")) {
            intent = new Intent("android.settings.ACTION_PRINT_SETTINGS");
        } else if (string.equals(ShareConstants.WEB_DIALOG_PARAM_PRIVACY)) {
            intent = new Intent("android.settings.PRIVACY_SETTINGS");
        } else if (string.equals("quick_launch")) {
            intent = new Intent("android.settings.QUICK_LAUNCH_SETTINGS");
        } else if (string.equals("search")) {
            intent = new Intent("android.search.action.SEARCH_SETTINGS");
        } else if (string.equals("security")) {
            intent = new Intent("android.settings.SECURITY_SETTINGS");
        } else if (string.equals("settings")) {
            intent = new Intent("android.settings.SETTINGS");
        } else if (string.equals("show_regulatory_info")) {
            intent = new Intent("android.settings.SHOW_REGULATORY_INFO");
        } else if (string.equals("sound")) {
            intent = new Intent("android.settings.SOUND_SETTINGS");
        } else if (string.equals(X3.i.U)) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f3354cordova.getActivity().getPackageName()));
        } else if (string.equals("sync")) {
            intent = new Intent("android.settings.SYNC_SETTINGS");
        } else if (string.equals("usage")) {
            intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        } else if (string.equals("user_dictionary")) {
            intent = new Intent("android.settings.USER_DICTIONARY_SETTINGS");
        } else if (string.equals("voice_input")) {
            intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
        } else if (string.equals("wifi_ip")) {
            intent = new Intent("android.settings.WIFI_IP_SETTINGS");
        } else if (string.equals("wifi")) {
            intent = new Intent("android.settings.WIFI_SETTINGS");
        } else if (string.equals("wireless")) {
            intent = new Intent("android.settings.WIRELESS_SETTINGS");
        } else {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.INVALID_ACTION, ""));
            return false;
        }
        if (jSONArray.length() > 1 && jSONArray.getBoolean(1)) {
            intent.addFlags(268435456);
        }
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f3354cordova.getActivity(), intent);
        callbackContext.sendPluginResult(new PluginResult(status, ""));
        return true;
    }
}
