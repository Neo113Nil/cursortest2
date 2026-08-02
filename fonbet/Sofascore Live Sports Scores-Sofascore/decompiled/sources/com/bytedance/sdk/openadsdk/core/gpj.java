package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.oo.sf;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj {
    public static void pcc(Context context, boolean z, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, int i, WebView webView, com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        int optInt = jSONObject.optInt("landingStyle");
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("fallback_url");
        String optString3 = jSONObject.optString("title", "");
        boolean z2 = false;
        boolean z3 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        if (optInt == 0) {
            if (webView != null) {
                webView.loadUrl(optString);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, -1, (JSONObject) null);
            }
        } else if (optInt == 1 || optInt == 8) {
            com.bytedance.sdk.openadsdk.dax.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.dax.pcc.sf();
            sfVar.pcc(sf.pcc.sf);
            sfVar.pcc(ofVar);
            sfVar.sf(str);
            sfVar.pcc(-1);
            sfVar.pcc(false);
            sfVar.sf(ofVar.az());
            com.bytedance.sdk.openadsdk.oo.gm.pcc(sfVar);
            com.bytedance.sdk.openadsdk.utils.yt.pcc(context, optString, ofVar, sf.pcc.sf, true);
        } else {
            if (optInt != 2) {
                if (optInt == 3) {
                    lo loVar = new lo(ofVar);
                    loVar.pcc(optString3);
                    loVar.pcc(z3);
                    rnn.pcc(context, optString, ofVar, i, str, false, loVar);
                }
                if (vjVar == null && z2) {
                    vjVar.pcc();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.yt.pcc(context, optString, ofVar, str)) {
                com.bytedance.sdk.openadsdk.dax.pcc.sf sfVar2 = new com.bytedance.sdk.openadsdk.dax.pcc.sf();
                sfVar2.pcc(sf.pcc.sf);
                sfVar2.pcc(ofVar);
                sfVar2.sf(str);
                sfVar2.pcc(-1);
                sfVar2.pcc(false);
                sfVar2.sf(ofVar.az());
                com.bytedance.sdk.openadsdk.oo.gm.pcc(sfVar2);
                HashMap hashMap = new HashMap();
                hashMap.put("deeplink_url", optString);
                hashMap.put("fallback_url", optString2);
                hashMap.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, "open_fallback_url", hashMap);
                com.bytedance.sdk.openadsdk.utils.yt.pcc(context, optString2, ofVar, sf.pcc.sf, true);
            }
        }
        z2 = true;
        if (vjVar == null) {
        }
    }
}
