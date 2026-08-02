package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.Path;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.gm gm;
    private final com.bytedance.adsdk.sf.gm.pcc.sf kj;
    private final com.bytedance.adsdk.sf.gm.pcc.oo oo;
    private final boolean ork;
    private final qf pcc;
    private final String qf;
    private final Path.FillType sf;
    private final com.bytedance.adsdk.sf.gm.pcc.wh vj;
    private final com.bytedance.adsdk.sf.gm.pcc.sf vy;
    private final com.bytedance.adsdk.sf.gm.pcc.wh wh;

    public vj(String str, qf qfVar, Path.FillType fillType, com.bytedance.adsdk.sf.gm.pcc.gm gmVar, com.bytedance.adsdk.sf.gm.pcc.oo ooVar, com.bytedance.adsdk.sf.gm.pcc.wh whVar, com.bytedance.adsdk.sf.gm.pcc.wh whVar2, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, boolean z) {
        this.pcc = qfVar;
        this.sf = fillType;
        this.gm = gmVar;
        this.oo = ooVar;
        this.vj = whVar;
        this.wh = whVar2;
        this.qf = str;
        this.kj = sfVar;
        this.vy = sfVar2;
        this.ork = z;
    }

    public Path.FillType gm() {
        return this.sf;
    }

    public boolean kj() {
        return this.ork;
    }

    public com.bytedance.adsdk.sf.gm.pcc.gm oo() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.kj(vyVar, qfVar, pccVar, this);
    }

    public com.bytedance.adsdk.sf.gm.pcc.wh qf() {
        return this.wh;
    }

    public qf sf() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.oo vj() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.gm.pcc.wh wh() {
        return this.vj;
    }

    public String pcc() {
        return this.qf;
    }
}
