package com.bytedance.sdk.component.adexpress.sf;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.sf.ork;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh implements ork {
    private hc gm;
    private Context pcc;
    private pcc sf;

    public wh(Context context, hc hcVar, pcc pccVar) {
        this.pcc = context;
        this.sf = pccVar;
        this.gm = hcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public boolean pcc(final ork.pcc pccVar) {
        this.gm.vj().qf(0);
        this.sf.pcc(new qf() { // from class: com.bytedance.sdk.component.adexpress.sf.wh.1
            @Override // com.bytedance.sdk.component.adexpress.sf.qf
            public void pcc(View view, gbb gbbVar) {
                if (pccVar.gm()) {
                    return;
                }
                jr sf = pccVar.sf();
                if (sf != null) {
                    sf.pcc(wh.this.sf, gbbVar);
                }
                pccVar.pcc(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.sf.qf
            public void pcc(int i, String str) {
                jr sf = pccVar.sf();
                if (sf != null) {
                    sf.a_(i);
                }
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public void pcc() {
    }

    public void pcc(gm gmVar) {
        this.sf.pcc(gmVar);
    }
}
