package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends gm implements com.bytedance.adsdk.ugeno.oo.pcc.oo {
    private com.bytedance.adsdk.ugeno.oo.pcc.gm vh;

    public oo(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        com.bytedance.adsdk.ugeno.oo.pcc.pcc rj = this.sf.rj();
        if (rj == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.oo.pcc.gm pcc = rj.pcc(this.wh);
        this.vh = pcc;
        if (pcc != null) {
            pcc.pcc(this);
            return false;
        }
        rj.pcc(this.wh, new com.bytedance.adsdk.ugeno.oo.pcc.sf());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.oo.pcc.oo
    public void pcc(String str) {
        this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
    }
}
