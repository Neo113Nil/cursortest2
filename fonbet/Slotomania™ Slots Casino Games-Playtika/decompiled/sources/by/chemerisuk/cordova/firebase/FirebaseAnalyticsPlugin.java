package by.chemerisuk.cordova.firebase;

import android.os.Bundle;
import android.util.Log;
import by.chemerisuk.cordova.support.CordovaMethod;
import by.chemerisuk.cordova.support.ReflectiveCordovaPlugin;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import org.apache.cordova.CallbackContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FirebaseAnalyticsPlugin extends ReflectiveCordovaPlugin {
    private static final String TAG = "FirebaseAnalyticsPlugin";
    private FirebaseAnalytics firebaseAnalytics;

    @Override // org.apache.cordova.CordovaPlugin
    protected void pluginInitialize() {
        Log.d(TAG, "Starting Firebase Analytics plugin");
        this.firebaseAnalytics = FirebaseAnalytics.getInstance(this.f3354cordova.getActivity().getApplicationContext());
    }

    @CordovaMethod
    private void logEvent(String str, JSONObject jSONObject, CallbackContext callbackContext) throws JSONException {
        this.firebaseAnalytics.logEvent(str, parse(jSONObject));
        callbackContext.success();
    }

    @CordovaMethod
    private void setUserId(String str, CallbackContext callbackContext) {
        this.firebaseAnalytics.setUserId(str);
        callbackContext.success();
    }

    @CordovaMethod
    private void setUserProperty(String str, String str2, CallbackContext callbackContext) {
        this.firebaseAnalytics.setUserProperty(str, str2);
        callbackContext.success();
    }

    @CordovaMethod
    private void resetAnalyticsData(CallbackContext callbackContext) {
        this.firebaseAnalytics.resetAnalyticsData();
        callbackContext.success();
    }

    @CordovaMethod
    private void setEnabled(boolean z, CallbackContext callbackContext) {
        this.firebaseAnalytics.setAnalyticsCollectionEnabled(z);
        callbackContext.success();
    }

    @CordovaMethod
    private void setCurrentScreen(String str, CallbackContext callbackContext) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, str);
        this.firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
        callbackContext.success();
    }

    @CordovaMethod
    private void setDefaultEventParameters(JSONObject jSONObject, CallbackContext callbackContext) throws JSONException {
        this.firebaseAnalytics.setDefaultEventParameters(parse(jSONObject));
        callbackContext.success();
    }

    private static Bundle parse(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String) {
                bundle.putString(next, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else {
                Log.w(TAG, "Value for key " + next + " not one of (String, Integer, Double, Long)");
            }
        }
        return bundle;
    }
}
