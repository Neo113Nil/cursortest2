package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc {
    private final com.bytedance.sdk.component.kj.sf.gm gm;
    private final Runnable oo;
    private final com.bytedance.sdk.component.adexpress.sf.hc pcc;
    private com.bytedance.sdk.component.adexpress.sf.qf sf;

    public qf(Context context, boolean z, com.bytedance.sdk.component.adexpress.dynamic.vj.kj kjVar, com.bytedance.sdk.component.adexpress.sf.hc hcVar, com.bytedance.sdk.component.adexpress.dynamic.wh.pcc pccVar) {
        super(context, z, kjVar, hcVar, pccVar);
        this.gm = new com.bytedance.sdk.component.kj.sf.gm("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ork.qf.1
            @Override // java.lang.Runnable
            public void run() {
                qf.this.pcc.gm();
                com.bytedance.sdk.openadsdk.core.jr.gm().post(qf.this.oo);
            }
        };
        this.oo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.qf.2
            @Override // java.lang.Runnable
            public void run() {
                if (qf.this.sf != null) {
                    qf qfVar = qf.this;
                    qf.super.pcc(qfVar.sf);
                }
            }
        };
        this.pcc = hcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc, com.bytedance.sdk.component.adexpress.sf.oo
    public void pcc(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
        this.sf = qfVar;
        rnn.gm((Runnable) this.gm);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc
    public void sf() {
        super.sf();
        com.bytedance.sdk.openadsdk.core.jr.gm().removeCallbacks(this.oo);
    }
}
