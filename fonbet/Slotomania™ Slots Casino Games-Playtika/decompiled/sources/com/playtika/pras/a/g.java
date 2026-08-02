package com.playtika.pras.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {
    public static h a(Context context) {
        String string = context.getApplicationContext().getSharedPreferences("com.braintreepayament.browserswitch.persistentstore", 0).getString("browserSwitch.request", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                int i = jSONObject.getInt("requestCode");
                String string2 = jSONObject.getString("url");
                return new h(i, Uri.parse(string2), jSONObject.getString("state"), jSONObject.optJSONObject(TtmlNode.TAG_METADATA));
            } catch (JSONException e) {
                Log.d("BrowserSwitch", e.getMessage());
                Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
            }
        }
        return null;
    }
}
