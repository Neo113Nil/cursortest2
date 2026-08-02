package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.rnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static boolean pcc(final com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        com.bytedance.sdk.openadsdk.activity.single.sf sfVar2;
        int i = 0;
        if (sfVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar = sfVar.ywp;
        if (kjVar == null || kjVar.rj() == null) {
            sfVar2 = null;
        } else {
            sfVar2 = sfVar.ywp.rj();
            if (sfVar2 != null) {
                i = sfVar2.zti();
            }
        }
        boolean pcc = rnn.pcc(sfVar.rnn, sfVar.sf, sfVar.vj, sfVar.oo ? 7 : 5, i);
        if (pcc) {
            if (sfVar.sf != null) {
                atb.pcc().pcc(sfVar.sf, new atb.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.2
                    @Override // com.bytedance.sdk.openadsdk.core.atb.sf
                    public void pcc() {
                        com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar3;
                        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar4 = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this;
                        if (sfVar4 == null || (sfVar3 = sfVar4.tsx) == null) {
                            return;
                        }
                        sfVar3.qcw();
                    }
                });
            }
            if (sfVar2 != null && sfVar2.jsj()) {
                sfVar2.atb();
            }
        }
        return pcc;
    }

    public static void pcc(final of ofVar, final boolean z, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.1
            @Override // java.lang.Runnable
            public void run() {
                of ofVar2 = of.this;
                if (ofVar2 == null || ofVar2.duh() || of.wh(of.this)) {
                    return;
                }
                try {
                    Context pcc = com.bytedance.sdk.openadsdk.core.lu.pcc();
                    AdSlot gqd = of.this.gqd();
                    if (gqd != null) {
                        boolean oo = com.bytedance.sdk.openadsdk.utils.sf.oo();
                        boolean z3 = z2;
                        if (oo) {
                            if (z3) {
                                lu.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                            } else {
                                qf.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                            }
                        } else if (z3) {
                            nac.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                        } else {
                            wh.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                        }
                        if (z) {
                            boolean z4 = z2;
                            if (oo) {
                                if (z4) {
                                    lu.pcc(pcc).pcc(gqd);
                                    return;
                                } else {
                                    qf.pcc(pcc).pcc(gqd);
                                    return;
                                }
                            }
                            if (z4) {
                                nac.pcc(pcc).pcc(gqd);
                            } else {
                                wh.pcc(pcc).pcc(gqd);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
