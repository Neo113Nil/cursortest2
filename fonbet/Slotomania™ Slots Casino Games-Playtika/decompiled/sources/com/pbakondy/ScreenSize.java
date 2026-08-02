package com.pbakondy;

import android.util.DisplayMetrics;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ScreenSize extends CordovaPlugin {
    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        String str2;
        if (!str.equals("get")) {
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f3354cordova.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        double d = displayMetrics.xdpi;
        double d2 = displayMetrics.ydpi;
        double round = Math.round(Math.sqrt(Math.pow(i / d, 2.0d) + Math.pow(i2 / d2, 2.0d)) * 100.0d) / 100.0d;
        double d3 = displayMetrics.density;
        if (d3 < 1.0d) {
            str2 = "ldpi";
        } else if (d3 < 1.5d) {
            str2 = "mdpi";
        } else if (d3 < 2.0d) {
            str2 = "hdpi";
        } else if (d3 < 3.0d) {
            str2 = "xhdpi";
        } else if (d3 < 4.0d) {
            str2 = "xxhdpi";
        } else {
            str2 = "xxxhdpi";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            jSONObject.put("diameter", round);
            jSONObject.put("xdpi", d);
            jSONObject.put("ydpi", d2);
            jSONObject.put("densityValue", d3);
            jSONObject.put("densityBucket", str2);
        } catch (JSONException unused) {
        }
        callbackContext.success(jSONObject);
        return true;
    }
}
