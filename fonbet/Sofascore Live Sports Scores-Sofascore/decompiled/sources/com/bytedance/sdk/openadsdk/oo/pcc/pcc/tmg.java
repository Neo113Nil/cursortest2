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
public class tmg extends iwm {
    @Override // defpackage.iwm
    public int kj() {
        return gm.pcc().sf().wh;
    }

    @Override // defpackage.iwm
    public String oo() {
        return "stats_log_event";
    }

    @Override // defpackage.iwm
    public long ork() {
        return gm.pcc().sf().kj;
    }

    @Override // defpackage.iwm
    public long pcc() {
        return gm.pcc().sf().pcc;
    }

    @Override // defpackage.iwm
    public ydm qf() {
        return sf.pcc();
    }

    @Override // defpackage.iwm
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public vh pcc(String str, byte[] bArr, int i, int i2) {
        vh vhVar;
        try {
            vhVar = new vh(str, new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
            try {
                vhVar.pcc(i);
                vhVar.sf(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            vhVar = null;
        }
        if (vhVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = (JSONObject) vhVar.gm();
            String optString = jSONObject.optString("event_extra");
            JSONObject jSONObject2 = !TextUtils.isEmpty(optString) ? new JSONObject(optString) : new JSONObject();
            jSONObject2.putOpt("_reqc", Integer.valueOf(vhVar.vj()));
            jSONObject.putOpt("event_extra", jSONObject2.toString());
        } catch (Throwable unused3) {
        }
        return vhVar;
    }

    @Override // defpackage.iwm
    public long vj() {
        return gm.pcc().sf().gm;
    }

    @Override // defpackage.iwm
    public int vy() {
        return gm.pcc().sf().qf;
    }

    @Override // defpackage.iwm
    public boolean wh() {
        return sf.sf();
    }

    @Override // defpackage.iwm
    public void pcc(ArrayList<vh> arrayList, iem iemVar) {
        oo.sf(arrayList, iemVar);
    }

    @Override // defpackage.iwm
    public int sf() {
        return gm.pcc().sf().sf;
    }
}
