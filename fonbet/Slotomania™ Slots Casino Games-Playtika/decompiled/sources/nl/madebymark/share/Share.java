package nl.madebymark.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messenger.MessengerUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import org.apache.cordova.BuildConfig;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes6.dex */
public class Share extends CordovaPlugin {
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
        if (str.equals("share")) {
            share(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2), callbackContext);
            return true;
        }
        if (!str.equals("messengerShare")) {
            return false;
        }
        messengerShare(jSONArray.getString(0), callbackContext);
        return true;
    }

    private void share(String str, String str2, String str3, CallbackContext callbackContext) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType(str3);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f3354cordova.getActivity(), Intent.createChooser(intent, str2));
            callbackContext.success();
        } catch (Error e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void messengerShare(String str, CallbackContext callbackContext) {
        Context applicationContext = this.f3354cordova.getActivity().getApplicationContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("fb-messenger://share/?link=" + Uri.encode(str)));
        intent.setPackage(MessengerUtils.PACKAGE_NAME);
        if (intent.resolveActivity(applicationContext.getPackageManager()) != null) {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f3354cordova.getActivity(), intent);
            callbackContext.success("Facebook Messenger opened");
        } else {
            callbackContext.error("Facebook Messenger not installed");
        }
    }
}
