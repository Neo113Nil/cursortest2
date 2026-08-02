package com.bytedance.sdk.component.adexpress.sf;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.sf.ork;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements ork {
    private kj gm;
    private hc oo;
    private Context pcc;
    private com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc sf;
    private int vj;

    public sf(Context context, hc hcVar, boolean z, com.bytedance.sdk.component.adexpress.dynamic.vj.kj kjVar, kj kjVar2, com.bytedance.sdk.component.adexpress.dynamic.wh.pcc pccVar, com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc pccVar2) {
        this.pcc = context;
        this.oo = hcVar;
        this.gm = kjVar2;
        if (pccVar2 != null) {
            this.sf = pccVar2;
        } else {
            pccVar2 = new com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc(context, z, kjVar, hcVar, pccVar);
            this.sf = pccVar2;
        }
        pccVar2.pcc(this.gm);
        if (kjVar instanceof com.bytedance.sdk.component.adexpress.dynamic.vj.qf) {
            this.vj = 3;
        } else {
            this.vj = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public boolean pcc(final ork.pcc pccVar) {
        this.oo.vj().pcc(this.vj);
        this.sf.pcc(new qf() { // from class: com.bytedance.sdk.component.adexpress.sf.sf.1
            @Override // com.bytedance.sdk.component.adexpress.sf.qf
            public void pcc(View view, gbb gbbVar) {
                if (pccVar.gm()) {
                    return;
                }
                sf.this.oo.vj().vj(sf.this.vj);
                sf.this.oo.vj().wh(sf.this.vj);
                sf.this.oo.vj().vy();
                jr sf = pccVar.sf();
                if (sf == null) {
                    return;
                }
                sf.pcc(sf.this.sf, gbbVar);
                pccVar.pcc(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.sf.qf
            public void pcc(int i, String str) {
                sf.this.oo.vj().pcc(sf.this.vj, i, str, pccVar.sf(sf.this));
                boolean sf = pccVar.sf(sf.this);
                ork.pcc pccVar2 = pccVar;
                if (sf) {
                    pccVar2.pcc(sf.this);
                    return;
                }
                jr sf2 = pccVar2.sf();
                if (sf2 == null) {
                    return;
                }
                sf2.a_(i);
            }
        });
        return true;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.oo sf() {
        com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc pccVar = this.sf;
        if (pccVar != null) {
            return pccVar.oo();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public void pcc() {
        com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.sf();
        }
    }
}
