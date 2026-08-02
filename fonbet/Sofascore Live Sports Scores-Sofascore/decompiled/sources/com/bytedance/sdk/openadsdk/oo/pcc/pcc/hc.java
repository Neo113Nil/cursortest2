package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.bytedance.sdk.openadsdk.utils.tsz;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc extends ork<JSONObject> {
    public hc(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static hc pcc(String str, boolean z, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("track_url", str);
            jSONObject.putOpt("replace_holder", Boolean.valueOf(z));
            jSONObject.putOpt("track_type", Integer.valueOf(i));
            jSONObject.putOpt("ad_id", str2);
            hc hcVar = new hc(tsz.pcc(), jSONObject);
            hcVar.pcc(1);
            return hcVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int kj() {
        JSONObject jSONObject = (JSONObject) gm();
        if (jSONObject != null) {
            return jSONObject.optInt("track_type");
        }
        return 0;
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

    public String ork() {
        JSONObject jSONObject = (JSONObject) gm();
        if (jSONObject != null) {
            return jSONObject.optString("track_url");
        }
        return null;
    }

    public String vh() {
        JSONObject jSONObject = (JSONObject) gm();
        if (jSONObject != null) {
            return jSONObject.optString("ad_id");
        }
        return null;
    }

    public boolean vy() {
        JSONObject jSONObject = (JSONObject) gm();
        if (jSONObject != null) {
            return jSONObject.optBoolean("replace_holder");
        }
        return false;
    }
}
