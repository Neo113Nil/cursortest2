package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lq {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        static final lq pcc = new lq();
    }

    private void pcc(String str, JSONArray jSONArray) {
        if (TextUtils.isEmpty(str) || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = jSONArray.length();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = z2;
                break;
            }
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString) && !pcc(optString)) {
                break;
            }
            if (i == length - 1) {
                z2 = true;
            }
            i++;
        }
        pcc(str, z, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    public void sf() {
        try {
            final JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("detect_cls_config", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            if (jSONObject.optBoolean(a.k, false)) {
                com.bytedance.sdk.openadsdk.core.jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.lq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            lq.this.pcc(jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                }, jSONObject.optLong("delay", 5000L));
            }
        } catch (Throwable unused) {
        }
    }

    private lq() {
    }

    public static lq pcc() {
        return pcc.pcc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && !a.k.equalsIgnoreCase(next) && !"delay".equalsIgnoreCase(next)) {
                    pcc(next, jSONObject.optJSONArray(next));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void pcc(final String str, final boolean z, final long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.dax.oo.pcc("detect_some_sdk", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.utils.lq.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            @Nullable
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("name", str);
                jSONObject.putOpt(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
                jSONObject.putOpt("exist", Integer.valueOf(z ? 1 : 0));
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("detect_some_sdk").sf(jSONObject.toString());
            }
        });
    }

    private static boolean pcc(String str) {
        try {
            Class.forName(str).toString();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
