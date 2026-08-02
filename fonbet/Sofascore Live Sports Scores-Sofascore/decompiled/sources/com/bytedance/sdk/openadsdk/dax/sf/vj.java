package com.bytedance.sdk.openadsdk.dax.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class vj implements gm {
    private static volatile vj pcc;

    private vj() {
    }

    public static vj pcc() {
        if (pcc == null) {
            synchronized (vj.class) {
                try {
                    if (pcc == null) {
                        pcc = new vj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.dax.sf.gm
    public void pcc(com.bytedance.sdk.openadsdk.dax.sf sfVar, boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.dax.sf.gm
    public void pcc(com.bytedance.sdk.openadsdk.dax.sf sfVar) {
    }
}
