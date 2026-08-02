package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.text.TextUtils;
import defpackage.iem;
import defpackage.iwm;
import defpackage.ydm;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends iwm {
    @Override // defpackage.iwm
    public int kj() {
        return gm.pcc().pcc().wh;
    }

    @Override // defpackage.iwm
    public String oo() {
        return "app_log_event";
    }

    @Override // defpackage.iwm
    public long ork() {
        return gm.pcc().pcc().kj;
    }

    @Override // defpackage.iwm
    public long pcc() {
        return gm.pcc().pcc().pcc;
    }

    @Override // defpackage.iwm
    public ydm qf() {
        return sf.pcc();
    }

    @Override // defpackage.iwm
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public vy pcc(String str, byte[] bArr, int i, int i2) {
        vy vyVar;
        try {
            vyVar = new vy(str, new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
            try {
                vyVar.pcc(i);
                vyVar.sf(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            vyVar = null;
        }
        if (vyVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = (JSONObject) vyVar.gm();
            String optString = jSONObject.optString("ad_extra_data");
            JSONObject jSONObject2 = !TextUtils.isEmpty(optString) ? new JSONObject(optString) : new JSONObject();
            String optString2 = jSONObject2.optString("pag_json_data");
            JSONObject jSONObject3 = !TextUtils.isEmpty(optString2) ? new JSONObject(optString2) : new JSONObject();
            jSONObject3.putOpt("_reqc", Integer.valueOf(vyVar.vj()));
            jSONObject2.putOpt("pag_json_data", jSONObject3.toString());
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
        } catch (Throwable unused3) {
        }
        return vyVar;
    }

    @Override // defpackage.iwm
    public long vj() {
        return gm.pcc().pcc().gm;
    }

    @Override // defpackage.iwm
    public int vy() {
        return gm.pcc().pcc().qf;
    }

    @Override // defpackage.iwm
    public boolean wh() {
        return sf.sf();
    }

    @Override // defpackage.iwm
    public void pcc(ArrayList<vy> arrayList, iem iemVar) {
        oo.pcc(arrayList, iemVar);
    }

    @Override // defpackage.iwm
    public int sf() {
        return gm.pcc().pcc().sf;
    }
}
