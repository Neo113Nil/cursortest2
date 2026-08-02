package com.bytedance.sdk.openadsdk.ork;

import com.bytedance.sdk.component.vj.gpj;
import com.bytedance.sdk.component.vj.vy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj implements gpj {
    private static int pcc;
    private long gm;
    private boolean oo;
    private long sf = 0;
    private final String vj;

    public vj() {
        pcc++;
        this.vj = "image_request_" + pcc;
    }

    @Override // com.bytedance.sdk.component.vj.gpj
    public void pcc(String str, vy vyVar) {
        if (!this.oo) {
            vyVar.pcc();
            vyVar.sf();
            vyVar.gm();
            this.oo = true;
        }
        this.sf = System.currentTimeMillis();
        gm(str, vyVar);
    }

    @Override // com.bytedance.sdk.component.vj.gpj
    public void sf(String str, vy vyVar) {
        this.gm += System.currentTimeMillis() - this.sf;
        gm(str, vyVar);
    }

    private String gm(String str, vy vyVar) {
        return str;
    }
}
