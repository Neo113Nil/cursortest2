package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.ftm;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends ork<JSONObject> {
    private static final AtomicInteger pcc = new AtomicInteger(0);
    private com.bytedance.sdk.openadsdk.oo.pcc sf;

    public vy(final com.bytedance.sdk.openadsdk.oo.pcc pccVar) {
        super(pccVar.pcc, new ftm() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.vy.1
            final int pcc = vy.pcc.getAndAdd(1);
            final long sf = SystemClock.elapsedRealtime();

            @Override // defpackage.ftm
            /* renamed from: sf, reason: merged with bridge method [inline-methods] */
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject oo = com.bytedance.sdk.openadsdk.oo.pcc.this.oo();
                    Iterator<String> keys = oo.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, oo.opt(next));
                    }
                    String optString = jSONObject.optString("ad_extra_data", null);
                    JSONObject jSONObject2 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                    String optString2 = jSONObject2.optString("pag_json_data");
                    JSONObject jSONObject3 = TextUtils.isEmpty(optString2) ? new JSONObject() : new JSONObject(optString2);
                    jSONObject3.putOpt("_nl", 1);
                    jSONObject3.putOpt("_ei", Integer.valueOf(this.pcc));
                    jSONObject3.putOpt("_reqc", 0);
                    jSONObject3.putOpt("_c_t_s", Long.valueOf(SystemClock.elapsedRealtime() - this.sf));
                    if (wh.sf()) {
                        jSONObject3.put("_ad_staging_flag", 3);
                    }
                    jSONObject2.putOpt("pag_json_data", jSONObject3.toString());
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
        pcc(pccVar.kj() ? 1 : 0);
        this.sf = pccVar;
    }

    public String kj() {
        com.bytedance.sdk.openadsdk.oo.pcc pccVar = this.sf;
        if (pccVar != null) {
            return pccVar.wh();
        }
        return null;
    }

    @Override // defpackage.itm
    public byte[] oo() {
        String jSONObject;
        JSONObject jSONObject2 = (JSONObject) gm();
        if (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) {
            return null;
        }
        return jSONObject.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.itm
    public String toString() {
        com.bytedance.sdk.openadsdk.oo.pcc pccVar = this.sf;
        return pccVar != null ? pccVar.wh() : super.toString();
    }

    public vy(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }
}
