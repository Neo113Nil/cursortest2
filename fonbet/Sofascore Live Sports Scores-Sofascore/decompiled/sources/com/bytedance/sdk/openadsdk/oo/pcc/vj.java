package com.bytedance.sdk.openadsdk.oo.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class vj implements com.bytedance.sdk.component.wh.pcc.vj.oo {
    private final com.bytedance.sdk.component.qf.sf pcc;

    public vj(com.bytedance.sdk.component.qf.sf sfVar) {
        this.pcc = sfVar;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj.oo
    public String gm() {
        com.bytedance.sdk.component.qf.sf sfVar = this.pcc;
        return sfVar != null ? sfVar.sf() : "";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj.oo
    public boolean pcc() {
        com.bytedance.sdk.component.qf.sf sfVar = this.pcc;
        if (sfVar != null) {
            return sfVar.wh();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj.oo
    public int sf() {
        com.bytedance.sdk.component.qf.sf sfVar = this.pcc;
        if (sfVar != null) {
            return sfVar.pcc();
        }
        return -1;
    }
}
