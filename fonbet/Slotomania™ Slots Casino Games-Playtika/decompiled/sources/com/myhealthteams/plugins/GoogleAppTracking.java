package com.myhealthteams.plugins;

import com.google.ads.conversiontracking.AdWordsConversionReporter;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes5.dex */
public class GoogleAppTracking extends CordovaPlugin {
    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        String string = jSONArray.getString(0);
        String string2 = jSONArray.getString(1);
        String string3 = jSONArray.getString(2);
        Boolean valueOf = Boolean.valueOf(jSONArray.getBoolean(3));
        if (!str.equals("track")) {
            return false;
        }
        track(string, string2, string3, valueOf, callbackContext);
        return true;
    }

    private void track(String str, String str2, String str3, Boolean bool, CallbackContext callbackContext) {
        try {
            AdWordsConversionReporter.reportWithConversionId(this.f3354cordova.getActivity().getApplicationContext(), str, str2, str3, bool.booleanValue());
        } catch (Exception unused) {
            callbackContext.error("Error in GoogleAppConversion tracking.");
        }
    }
}
