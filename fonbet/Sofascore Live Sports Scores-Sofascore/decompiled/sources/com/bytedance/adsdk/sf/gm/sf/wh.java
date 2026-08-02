package com.bytedance.adsdk.sf.gm.sf;

import com.bytedance.adsdk.sf.gm.sf.lu;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.gm gm;
    private final boolean hc;
    private final lu.pcc kj;
    private final com.bytedance.adsdk.sf.gm.pcc.oo oo;
    private final float ork;
    private final String pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.sf qf;
    private final qf sf;
    private final com.bytedance.adsdk.sf.gm.pcc.sf tmg;
    private final List<com.bytedance.adsdk.sf.gm.pcc.sf> vh;
    private final com.bytedance.adsdk.sf.gm.pcc.wh vj;
    private final lu.sf vy;
    private final com.bytedance.adsdk.sf.gm.pcc.wh wh;

    public wh(String str, qf qfVar, com.bytedance.adsdk.sf.gm.pcc.gm gmVar, com.bytedance.adsdk.sf.gm.pcc.oo ooVar, com.bytedance.adsdk.sf.gm.pcc.wh whVar, com.bytedance.adsdk.sf.gm.pcc.wh whVar2, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, lu.pcc pccVar, lu.sf sfVar2, float f, List<com.bytedance.adsdk.sf.gm.pcc.sf> list, com.bytedance.adsdk.sf.gm.pcc.sf sfVar3, boolean z) {
        this.pcc = str;
        this.sf = qfVar;
        this.gm = gmVar;
        this.oo = ooVar;
        this.vj = whVar;
        this.wh = whVar2;
        this.qf = sfVar;
        this.kj = pccVar;
        this.vy = sfVar2;
        this.ork = f;
        this.vh = list;
        this.tmg = sfVar3;
        this.hc = z;
    }

    public com.bytedance.adsdk.sf.gm.pcc.gm gm() {
        return this.gm;
    }

    public boolean hc() {
        return this.hc;
    }

    public lu.pcc kj() {
        return this.kj;
    }

    public com.bytedance.adsdk.sf.gm.pcc.oo oo() {
        return this.oo;
    }

    public List<com.bytedance.adsdk.sf.gm.pcc.sf> ork() {
        return this.vh;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.vy(vyVar, pccVar, this);
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf qf() {
        return this.qf;
    }

    public qf sf() {
        return this.sf;
    }

    public float tmg() {
        return this.ork;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf vh() {
        return this.tmg;
    }

    public com.bytedance.adsdk.sf.gm.pcc.wh vj() {
        return this.vj;
    }

    public lu.sf vy() {
        return this.vy;
    }

    public com.bytedance.adsdk.sf.gm.pcc.wh wh() {
        return this.wh;
    }

    public String pcc() {
        return this.pcc;
    }
}
