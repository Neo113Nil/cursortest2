package com.playtika.pras.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.safedk.android.utils.Logger;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    public final c a;
    public final String b;

    public b(c cVar, a aVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public final void a(f fVar, d dVar) {
        String str;
        FragmentActivity activity = dVar.getActivity();
        if (activity == null) {
            throw new IllegalStateException("Fragment must be attached to an activity.");
        }
        Context applicationContext = activity.getApplicationContext();
        Intent intent = fVar.a;
        if (intent == null) {
            c cVar = this.a;
            Intent intent2 = new Intent("android.intent.action.VIEW", fVar.c);
            intent2.addFlags(268435456);
            if (cVar.a) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (k.a(applicationContext2)) {
                    k.a(applicationContext2, intent2);
                }
            }
            intent = intent2;
        }
        int i = fVar.b;
        if (i != Integer.MIN_VALUE) {
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(this.b + "://"));
            intent3.addCategory("android.intent.category.DEFAULT");
            intent3.addCategory("android.intent.category.BROWSABLE");
            if (applicationContext.getPackageManager().queryIntentActivities(intent3, 0).isEmpty()) {
                str = "The return url scheme was not set up, incorrectly set up, or more than one Activity on this device defines the same url scheme in it's Android Manifest. See https://github.com/braintree/browser-switch-android for more information on setting up a return url scheme.";
            } else {
                if (applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u)), 0).isEmpty()) {
                    StringBuilder sb = new StringBuilder("No installed activities can open this URL");
                    Uri data = intent.getData();
                    if (data != null) {
                        sb.append(": " + data.toString());
                    }
                    str = sb.toString();
                } else {
                    str = null;
                }
            }
        } else {
            str = "Request code cannot be Integer.MIN_VALUE";
        }
        if (str != null) {
            dVar.onBrowserSwitchResult(i, new i(str), null);
            return;
        }
        Uri data2 = intent.getData();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestCode", i);
            jSONObject.put("url", data2.toString());
            jSONObject.put("state", "PENDING");
            l.a(applicationContext, jSONObject.toString());
        } catch (JSONException e) {
            Log.d("BrowserSwitch", e.getMessage());
            Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(applicationContext, intent);
    }
}
