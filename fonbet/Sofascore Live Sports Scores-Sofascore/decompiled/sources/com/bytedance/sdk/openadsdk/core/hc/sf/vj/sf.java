package com.bytedance.sdk.openadsdk.core.hc.sf.vj;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.sf.gm;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.adsdk.ugeno.sf.pcc<pcc> {
    private int uae;
    private int vd;
    private JSONArray xf;

    public sf(Context context) {
        super(context);
        this.vd = 0;
        this.uae = 0;
    }

    private void gm() {
        List<gm<View>> list = ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc;
        if (list == null || list.isEmpty()) {
            return;
        }
        gm<View> gmVar = ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.get(0);
        if (this.xf == null) {
            return;
        }
        for (int i = 0; i < this.xf.length(); i++) {
            tmg tmgVar = new tmg(this.sf);
            tmgVar.pcc(this.fvk);
            try {
                JSONObject optJSONObject = this.xf.optJSONObject(i);
                if (optJSONObject != null) {
                    boolean has = optJSONObject.has("$chunk");
                    JSONObject jSONObject = this.oo;
                    if (has) {
                        jSONObject.put("$item", optJSONObject.optJSONArray("$chunk"));
                    } else {
                        jSONObject.put("$item", optJSONObject);
                    }
                    ((pcc) this.vj).pcc(tmgVar.pcc(gmVar.ye(), this.oo, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void oo() {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.size(); i++) {
            gm<View> gmVar = ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.get(i);
            if (gmVar != null) {
                tmg tmgVar = new tmg(this.sf);
                tmgVar.pcc(this.fvk);
                ((pcc) this.vj).pcc(tmgVar.pcc(gmVar.ye(), this.oo, (JSONObject) null));
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "driveMode":
                this.uae = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
            case "direction":
                if (!TextUtils.equals(str2, "vertical")) {
                    this.vd = 0;
                    break;
                } else {
                    this.vd = 1;
                    break;
                }
            case "dataList":
                this.xf = com.bytedance.adsdk.ugeno.qf.sf.pcc(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        T t = this.vj;
        if (t instanceof pcc) {
            ((pcc) t).setOrientation(this.vd);
            ((pcc) this.vj).pcc(this);
            if (this.uae == 1) {
                oo();
            } else {
                gm();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public View pcc() {
        try {
            pcc pccVar = new pcc(this.sf);
            this.vj = pccVar;
            pccVar.pcc((oo) this);
        } catch (Throwable unused) {
            this.vj = new View(this.sf);
        }
        return this.vj;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(gm gmVar) {
        if (gmVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.add(gmVar);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(gm gmVar, ViewGroup.LayoutParams layoutParams) {
        if (gmVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.add(gmVar);
    }
}
