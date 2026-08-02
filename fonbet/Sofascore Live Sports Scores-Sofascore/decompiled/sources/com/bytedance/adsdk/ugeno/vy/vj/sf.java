package com.bytedance.adsdk.ugeno.vy.vj;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends gm<pcc> {
    private float gga;
    private int pcc;
    private float uae;
    private int vd;
    private float xf;
    private static final int rc = Color.parseColor("#FFC642");
    private static final int kez = Color.parseColor("#e3e3e4");

    public sf(Context context) {
        super(context);
        this.pcc = rc;
        this.vd = kez;
        this.xf = 4.0f;
        this.uae = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public pcc pcc() {
        pcc pccVar = new pcc(this.sf);
        pccVar.pcc(this);
        return pccVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.pcc = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.vd = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2, kez);
                break;
            case "gap":
                this.gga = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "size":
                this.uae = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 20.0f);
                break;
            case "score":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 4.0f);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        boolean lq = lq();
        T t = this.vj;
        if (lq) {
            ((pcc) t).pcc(this.xf, this.pcc, this.vd, this.uae, (int) this.gga);
        } else {
            ((pcc) t).pcc(this.xf, this.pcc, this.vd, this.uae, 5);
        }
    }
}
