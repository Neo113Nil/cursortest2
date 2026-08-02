package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.wh;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lq;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.tz;
import com.bytedance.sdk.openadsdk.core.vy;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsx;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements tsz.pcc {
    private final wh gm;
    private int kj;
    private final Context pcc;
    private PAGAppOpenAdLoadListener qf;
    private final of<com.bytedance.sdk.openadsdk.oo.pcc> sf;
    private boolean vh;
    private AdSlot wh;
    private final AtomicBoolean oo = new AtomicBoolean(false);
    private int vj = 0;
    private volatile int vy = 0;
    private final lq ork = new lq();

    public qf(Context context) {
        Context pcc;
        if (context != null) {
            pcc = context.getApplicationContext();
            this.pcc = pcc;
        } else {
            pcc = lu.pcc();
            this.pcc = pcc;
        }
        this.sf = lu.gm();
        this.gm = wh.pcc(pcc);
    }

    private void gm(final AdSlot adSlot) {
        final tsx sf = tsx.sf();
        com.bytedance.sdk.openadsdk.core.model.tsz tszVar = new com.bytedance.sdk.openadsdk.core.model.tsz();
        tszVar.vh = this.ork;
        tszVar.oo = 1;
        tszVar.vy = 2;
        this.sf.pcc(adSlot, tszVar, 3, new tz() { // from class: com.bytedance.sdk.openadsdk.component.qf.1
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                qf.this.vy = 3;
                qf.this.pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                qf.this.pcc(pccVar, gmVar, adSlot, sf);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar, AdSlot adSlot, tsx tsxVar) {
        this.vy = 2;
        if (pccVar == null || pccVar.vj() == null || pccVar.vj().size() == 0) {
            this.vy = 3;
            pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(2, 100, Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE, vy.pcc(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)));
            gmVar.pcc(-3);
            gmVar.gm(3);
            com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
            return;
        }
        final com.bytedance.sdk.openadsdk.core.model.of ofVar = pccVar.vj().get(0);
        long qcw = ofVar.qcw();
        lq lqVar = this.ork;
        lqVar.sf = qcw;
        ofVar.gm(lqVar.ork());
        boolean wh = com.bytedance.sdk.openadsdk.core.model.of.wh(ofVar);
        if (ofVar.ye()) {
            pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar));
            return;
        }
        if (wh || ofVar.duh()) {
            pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar));
            if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar)) {
                pcc(ofVar, adSlot, false, pccVar);
                return;
            } else {
                pcc(ofVar, false, pccVar);
                return;
            }
        }
        if (!com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar)) {
            lq lqVar2 = this.ork;
            lqVar2.sf = -1L;
            lqVar2.pcc(3);
            pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar));
            pcc(ofVar, false, pccVar);
            return;
        }
        boolean wh2 = com.bytedance.sdk.openadsdk.component.qf.pcc.wh();
        lq lqVar3 = this.ork;
        if (wh2) {
            lqVar3.sf = -1L;
            lqVar3.pcc(3);
            pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar));
            pcc(ofVar, adSlot, false, pccVar);
            return;
        }
        pcc(ofVar, adSlot, !lqVar3.pcc, pccVar);
        if (this.ork.pcc) {
            com.bytedance.sdk.openadsdk.dax.oo.pcc(ofVar, tsxVar.oo());
            if (qcw != 0) {
                jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.qf.2
                    @Override // java.lang.Runnable
                    public void run() {
                        qf.this.ork.pcc(2);
                        qf.this.pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar));
                    }
                }, qcw);
            } else {
                this.ork.pcc(2);
                pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        final tsx sf = tsx.sf();
        com.bytedance.sdk.openadsdk.core.model.tsz tszVar = new com.bytedance.sdk.openadsdk.core.model.tsz();
        tszVar.vh = this.ork;
        tszVar.oo = 1;
        tszVar.vy = 2;
        this.vy = 1;
        this.sf.pcc(this.wh, tszVar, 3, new tz() { // from class: com.bytedance.sdk.openadsdk.component.qf.4
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                com.bytedance.sdk.openadsdk.core.model.of qf;
                if (pccVar != null && pccVar.wh() && (qf = pccVar.qf()) != null) {
                    boolean vj = com.bytedance.sdk.openadsdk.core.model.of.vj(qf);
                    if (qf.ye() || !vj || com.bytedance.sdk.openadsdk.component.qf.pcc.wh()) {
                        this.pcc = !qf.this.gm.sf(qf.gqd());
                    } else if (TextUtils.isEmpty(qf.this.gm.pcc(qf))) {
                        this.pcc = false;
                        com.bytedance.sdk.openadsdk.component.oo.sf.sf(pccVar.qf());
                    } else {
                        this.pcc = !qf.this.gm.sf(qf.gqd());
                    }
                    com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc(qf);
                }
                return this.pcc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                if (!com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
                    return qf.this.gm.gm(qf.this.vj);
                }
                com.bytedance.sdk.openadsdk.component.vj.sf pcc = com.bytedance.sdk.openadsdk.common.lu.pcc().pcc(qf.this.wh);
                if (pcc == null) {
                    return null;
                }
                qf.this.wh.setCacheTime(pcc.oo());
                return pcc.sf();
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                qf.this.vy = 3;
                qf.this.pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                com.bytedance.sdk.openadsdk.core.model.of qf;
                if (pccVar == null || (qf = pccVar.qf()) == null) {
                    return;
                }
                qf.gm(qf.this.ork.ork());
                boolean z = this.pcc;
                qf qfVar = qf.this;
                if (z) {
                    qfVar.gm.pcc(qf.gqd(), qf.qxv());
                    qf.this.pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(1, 101, qf, (com.bytedance.sdk.openadsdk.core.model.pcc) null));
                } else {
                    qfVar.pcc(pccVar, gmVar, qfVar.wh, sf);
                }
            }
        });
    }

    private void sf(@NonNull AdSlot adSlot) {
        this.vy = 1;
        gm(adSlot);
    }

    public static qf pcc(Context context) {
        return new qf(context);
    }

    public void pcc(@NonNull AdSlot adSlot, com.bytedance.sdk.openadsdk.common.qf qfVar, int i) {
        if (qfVar == null) {
            return;
        }
        if (i <= 0) {
            i = com.bytedance.sdk.openadsdk.component.qf.pcc.qf();
        }
        this.wh = adSlot;
        adSlot.setCacheScene(0);
        this.ork.pcc = !TextUtils.isEmpty(this.wh.getBidAdm());
        if (qfVar instanceof PAGAppOpenAdLoadListener) {
            this.qf = (PAGAppOpenAdLoadListener) qfVar;
        }
        this.vj = pcc(this.wh);
        this.kj = i;
        this.ork.pcc(tsx.sf());
        this.ork.sf(com.bytedance.sdk.openadsdk.component.qf.pcc.sf());
        this.ork.sf(com.bytedance.sdk.openadsdk.component.qf.pcc.gm());
        if (this.ork.pcc) {
            sf(this.wh);
        } else {
            new tsz(jr.sf().getLooper(), this).sendEmptyMessageDelayed(1, i);
            pcc();
        }
    }

    private void pcc() {
        rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.qf.3
            @Override // java.lang.Runnable
            public void run() {
                qf.this.sf();
            }
        });
    }

    private void pcc(@NonNull final com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.gm.pcc(ofVar, adSlot, this.ork, new wh.sf() { // from class: com.bytedance.sdk.openadsdk.component.qf.5
            @Override // com.bytedance.sdk.openadsdk.component.wh.sf
            public void pcc() {
                if (z) {
                    qf.this.vy = 4;
                    com.bytedance.sdk.openadsdk.component.vj.gm gmVar = new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar);
                    gmVar.pcc(true);
                    qf.this.pcc(gmVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.wh.sf
            public void pcc(int i, String str) {
                if (z) {
                    qf.this.vy = 5;
                    qf.this.pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(2, 100, 10003, vy.pcc(10003)));
                }
            }
        });
    }

    private void pcc(@NonNull final com.bytedance.sdk.openadsdk.core.model.of ofVar, final boolean z, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.gm.pcc(ofVar, this.ork, new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.component.qf.6
            @Override // com.bytedance.sdk.openadsdk.component.wh.pcc
            public void pcc(com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
                if (z) {
                    qf.this.vy = 4;
                    com.bytedance.sdk.openadsdk.component.vj.gm gmVar = new com.bytedance.sdk.openadsdk.component.vj.gm(1, 100, ofVar, pccVar);
                    gmVar.pcc(true);
                    qf.this.pcc(gmVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.wh.pcc
            public void pcc() {
                if (z) {
                    qf.this.vy = 5;
                    qf.this.pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(2, 100, 10003, vy.pcc(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.component.vj.gm gmVar) {
        int sf = gmVar.sf();
        int gm = gmVar.gm();
        com.bytedance.sdk.openadsdk.component.oo.sf.pcc(this.ork, gm, sf);
        if (!this.oo.compareAndSet(false, true)) {
            if (sf == 1 && gm == 100 && !this.ork.pcc) {
                wh.pcc(lu.pcc()).pcc(new com.bytedance.sdk.openadsdk.component.vj.pcc(this.vj, gmVar.oo(), gmVar.pcc()));
                if (this.vh) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.oo.sf.pcc(gmVar.oo(), 1, this.ork);
                return;
            }
            return;
        }
        if (sf != 1) {
            if (sf == 2 || sf == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.qf;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(gmVar.vj(), gmVar.wh());
                }
                if (sf == 3) {
                    com.bytedance.sdk.openadsdk.component.oo.sf.pcc(this.vy, this.kj, this.ork);
                    return;
                }
                return;
            }
            return;
        }
        if (gm == 100 && !this.ork.pcc) {
            this.gm.pcc(new com.bytedance.sdk.openadsdk.component.vj.pcc(this.vj, gmVar.oo(), gmVar.pcc()));
        }
        if (this.qf != null) {
            this.qf.onAdLoaded(new oo(this.pcc, gmVar.oo(), gm == 101, this.wh));
        }
        if (gm == 101) {
            com.bytedance.sdk.openadsdk.component.oo.sf.pcc(gmVar.oo(), this.ork.pcc().oo());
        } else if (gm == 100) {
            com.bytedance.sdk.openadsdk.component.oo.sf.pcc(gmVar.oo(), 0, this.ork);
            this.vh = true;
        }
    }

    public int pcc(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message.what != 1 || this.oo.get()) {
            return;
        }
        pcc(new com.bytedance.sdk.openadsdk.component.vj.gm(3, 102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, vy.pcc(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
