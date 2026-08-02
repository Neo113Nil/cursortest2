package com.bytedance.sdk.openadsdk.fum.pcc.pcc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.core.vj;
import com.bytedance.sdk.openadsdk.oo.gbb;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static boolean pcc(Context context, String str, of ofVar, int i, Map<String, Object> map, boolean z) {
        Map<String, Object> map2 = map;
        String pcc = kun.pcc(ofVar);
        vj.pcc(ofVar, pcc, 1, null);
        Intent pcc2 = pcc(context, str, ofVar);
        if (TextUtils.isEmpty(str) || pcc2 == null) {
            vj.pcc(ofVar, pcc, -2, ofVar.dt().oo());
            return false;
        }
        boolean oo = kun.oo(context);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, Object> map3 = map2;
        if (ofVar != null && ofVar.fg() == 0) {
            map3.put("auto_click", Boolean.valueOf(!ofVar.gpj()));
        }
        map3.put("can_query_install", Integer.valueOf(oo ? 1 : 0));
        map3.put("url", str);
        if (oo) {
            kun.sf pcc3 = kun.pcc(context, pcc2);
            if (pcc3.sf <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", pcc2.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                vj.pcc(ofVar, pcc, -3, jSONObject);
                return false;
            }
            try {
                pcc(context, ofVar, map3);
                map3.put("matched_count", Integer.valueOf(pcc3.sf));
                ComponentName componentName = pcc3.pcc;
                if (componentName != null) {
                    pcc2.setComponent(componentName);
                }
            } catch (Throwable th) {
                lo.gm("DeepLinkUtils", th.getMessage());
            }
        }
        try {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, pcc, "open_url_app", map3);
            context.startActivity(pcc2);
            gbb.pcc().pcc(map3).pcc(ofVar, pcc);
            com.bytedance.sdk.openadsdk.oo.gm.pcc("dp_start_act_success", ofVar, pcc, map3);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put("intent", pcc2.toString());
                jSONObject2.put("can_query_install", oo ? 1 : 0);
            } catch (Exception unused2) {
            }
            vj.pcc(ofVar, pcc, -4, jSONObject2);
            if (oo) {
                rnn.pcc(context, ofVar.xy(), ofVar, i, pcc, z);
            }
            return false;
        }
    }

    private static Intent pcc(Context context, String str, of ofVar) {
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (ofVar != null && ofVar.gmi() != null && !TextUtils.isEmpty(ofVar.gmi().oo())) {
                intent.setPackage(ofVar.gmi().oo());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            lo.gm("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void pcc(Context context, of ofVar, Map<String, Object> map) {
        if (ofVar != null && ofVar.fg() == 0) {
            map.put("auto_click", Boolean.valueOf(!ofVar.gpj()));
        }
        map.put("can_query_install", Integer.valueOf(kun.oo(context) ? 1 : 0));
    }
}
