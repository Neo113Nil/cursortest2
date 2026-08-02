package com.bytedance.adsdk.sf.gm.sf;

import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.kj gm;
    private final boolean oo;
    private final String pcc;
    private final int sf;

    public nac(String str, int i, com.bytedance.adsdk.sf.gm.pcc.kj kjVar, boolean z) {
        this.pcc = str;
        this.sf = i;
        this.gm = kjVar;
        this.oo = z;
    }

    public boolean gm() {
        return this.oo;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.lu(vyVar, pccVar, this);
    }

    public com.bytedance.adsdk.sf.gm.pcc.kj sf() {
        return this.gm;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.pcc);
        sb.append(", index=");
        return wv8.j(sb, this.sf, '}');
    }

    public String pcc() {
        return this.pcc;
    }
}
