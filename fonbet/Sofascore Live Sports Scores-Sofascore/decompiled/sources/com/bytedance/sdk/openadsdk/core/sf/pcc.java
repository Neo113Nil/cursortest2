package com.bytedance.sdk.openadsdk.core.sf;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.lu.gm;
import com.bytedance.sdk.openadsdk.lu.oo;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.vj;
import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements of.pcc {
    private final boolean gm;
    private final of.pcc pcc;
    private final AdSlot sf;

    public pcc(of.pcc pccVar, AdSlot adSlot, boolean z) {
        this.pcc = pccVar;
        this.sf = adSlot;
        this.gm = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.of.pcc
    public void pcc(final int i, final String str) {
        AdSlot adSlot;
        if (this.pcc != null) {
            if (rnn.wh() || !((adSlot = this.sf) == null || adSlot.getDurationSlotType() == 5 || vj.pcc("getads_callback_async", 0) != 1)) {
                this.pcc.pcc(i, str);
            } else {
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sf.pcc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pcc.this.pcc.pcc(i, str);
                    }
                });
            }
            if (!this.gm || this.sf == null) {
                return;
            }
            gm.gm(new oo() { // from class: com.bytedance.sdk.openadsdk.core.sf.pcc.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("load_ad");
                    e.gm(pcc.this.sf.getCodeId());
                    e.oo(kun.gm(pcc.this.sf.getDurationSlotType()));
                    e.qf(kun.pcc(pcc.this.sf).toString());
                    return e;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.of.pcc
    public void pcc(final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, final com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
        AdSlot adSlot;
        if (this.pcc != null) {
            if (!rnn.wh() && ((adSlot = this.sf) == null || adSlot.getDurationSlotType() == 5 || vj.pcc("getads_callback_async", 0) != 1)) {
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sf.pcc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        pcc.this.pcc.pcc(pccVar, gmVar);
                    }
                });
            } else {
                this.pcc.pcc(pccVar, gmVar);
            }
            if (!this.gm || this.sf == null) {
                return;
            }
            gm.sf(new oo() { // from class: com.bytedance.sdk.openadsdk.core.sf.pcc.4
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("load_ad");
                    e.gm(pcc.this.sf.getCodeId());
                    e.oo(kun.gm(pcc.this.sf.getDurationSlotType()));
                    e.qf(kun.pcc(pcc.this.sf).toString());
                    return e;
                }
            });
        }
    }
}
