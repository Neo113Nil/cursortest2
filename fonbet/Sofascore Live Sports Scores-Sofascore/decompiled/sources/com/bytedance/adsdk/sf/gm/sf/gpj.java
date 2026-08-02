package com.bytedance.adsdk.sf.gm.sf;

import com.bytedance.adsdk.sf.pcc.pcc.fum;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.sf gm;
    private final com.bytedance.adsdk.sf.gm.pcc.sf oo;
    private final String pcc;
    private final pcc sf;
    private final com.bytedance.adsdk.sf.gm.pcc.sf vj;
    private final boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static pcc pcc(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            a70.p("Unknown trim path type ".concat(String.valueOf(i)));
            return null;
        }
    }

    public gpj(String str, pcc pccVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, com.bytedance.adsdk.sf.gm.pcc.sf sfVar3, boolean z) {
        this.pcc = str;
        this.sf = pccVar;
        this.gm = sfVar;
        this.oo = sfVar2;
        this.vj = sfVar3;
        this.wh = z;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf gm() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf oo() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new fum(pccVar, this);
    }

    public pcc sf() {
        return this.sf;
    }

    public String toString() {
        return "Trim Path: {start: " + this.gm + ", end: " + this.oo + ", offset: " + this.vj + "}";
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf vj() {
        return this.vj;
    }

    public boolean wh() {
        return this.wh;
    }

    public String pcc() {
        return this.pcc;
    }
}
