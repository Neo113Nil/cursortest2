package com.bytedance.adsdk.pcc.sf.sf.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class nac implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    protected com.bytedance.adsdk.pcc.sf.oo.gm gm;
    protected com.bytedance.adsdk.pcc.sf.sf.pcc pcc;
    protected com.bytedance.adsdk.pcc.sf.sf.pcc sf;

    public nac(com.bytedance.adsdk.pcc.sf.oo.gm gmVar) {
        this.gm = gmVar;
    }

    public void pcc(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.pcc = pccVar;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return this.pcc.sf() + this.gm.pcc() + this.sf.sf();
    }

    public String toString() {
        return sf();
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.OPERATOR_RESULT;
    }

    public void sf(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.sf = pccVar;
    }
}
