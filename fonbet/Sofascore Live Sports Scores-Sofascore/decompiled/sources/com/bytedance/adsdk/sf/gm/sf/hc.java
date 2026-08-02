package com.bytedance.adsdk.sf.gm.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc implements gm {
    private final String pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.hc<Float, Float> sf;

    public hc(String str, com.bytedance.adsdk.sf.gm.pcc.hc<Float, Float> hcVar) {
        this.pcc = str;
        this.sf = hcVar;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.nac(vyVar, pccVar, this);
    }

    public com.bytedance.adsdk.sf.gm.pcc.hc<Float, Float> sf() {
        return this.sf;
    }

    public String pcc() {
        return this.pcc;
    }
}
