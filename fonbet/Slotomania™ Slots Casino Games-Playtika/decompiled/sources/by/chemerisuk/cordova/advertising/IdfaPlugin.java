package by.chemerisuk.cordova.advertising;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import by.chemerisuk.cordova.support.CordovaMethod;
import by.chemerisuk.cordova.support.ReflectiveCordovaPlugin;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.LOG;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class IdfaPlugin extends ReflectiveCordovaPlugin {
    private static final String TAG = "IdfaPlugin";

    private static class IdfaResult {
        String id;
        boolean limitAdTracking;

        IdfaResult(String str, boolean z) {
            this.id = str;
            this.limitAdTracking = z;
        }
    }

    private IdfaResult getGooglePlayIdfa(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new IdfaResult(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (Exception unused) {
            LOG.w(TAG, "Unable to get IDFA from google play service.");
            return null;
        }
    }

    private IdfaResult getSecureStorageIdfa(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            return new IdfaResult(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0);
        } catch (Exception unused) {
            LOG.w(TAG, "Unable to get IDFA from secure storage.");
            return null;
        }
    }

    private IdfaResult getIdfa(Context context) {
        IdfaResult googlePlayIdfa = getGooglePlayIdfa(context);
        if (googlePlayIdfa == null) {
            googlePlayIdfa = getSecureStorageIdfa(context);
        }
        if (googlePlayIdfa != null) {
            return googlePlayIdfa;
        }
        IdfaResult idfaResult = new IdfaResult("", true);
        LOG.w(TAG, "Falling back to limited ad tracking.");
        return idfaResult;
    }

    @CordovaMethod(ReflectiveCordovaPlugin.ExecutionThread.WORKER)
    protected void getInfo(CallbackContext callbackContext) {
        try {
            IdfaResult idfa = getIdfa(this.f3354cordova.getActivity().getApplicationContext());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aaid", idfa.id);
            jSONObject.put("limitAdTracking", idfa.limitAdTracking);
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            LOG.e(TAG, e.getMessage(), e);
            callbackContext.error("JSONException");
        } catch (Exception e2) {
            LOG.e(TAG, e2.getMessage(), e2);
            callbackContext.error("NotSupported");
        }
    }
}
