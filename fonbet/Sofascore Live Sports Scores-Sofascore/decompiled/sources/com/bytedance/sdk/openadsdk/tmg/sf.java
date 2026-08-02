package com.bytedance.sdk.openadsdk.tmg;

import com.bytedance.sdk.component.adexpress.vj.vj;
import com.bytedance.sdk.component.pcc.lo;
import com.bytedance.sdk.openadsdk.component.reward.gm.kj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends lo {
    @Override // com.bytedance.sdk.component.pcc.lo
    public void gm() {
        if (this.vy != null) {
            if (kj.gm()) {
                vj.pcc().sf(this.vy, this, ((lo) this).kj);
            } else {
                vj.pcc().pcc(this.vy, this, ((lo) this).kj);
            }
        }
    }

    @Override // com.bytedance.sdk.component.pcc.lo
    public void oo() {
        if (kj.gm()) {
            vj.pcc().sf(this.vy, ((lo) this).kj);
        } else {
            vj.pcc().pcc(this.vy, ((lo) this).kj);
        }
    }
}
