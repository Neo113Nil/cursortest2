package com.bytedance.sdk.openadsdk.core.jr.sf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.component.utils.vy;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.tsz;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import defpackage.cem;
import defpackage.fem;
import defpackage.gtm;
import defpackage.jem;
import defpackage.kwm;
import defpackage.ltm;
import defpackage.nem;
import defpackage.owm;
import defpackage.rtm;
import defpackage.stm;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends com.bytedance.sdk.openadsdk.core.jr.pcc.pcc {
    private boolean bg;
    private int erj;
    private int fmh;
    private sf gd;
    private final Runnable hoh;
    private int hpk;
    private boolean iv;
    private final String kun;
    private final boolean lrr;
    private long nn;
    private int ptr;
    private final jsj.pcc qcw;
    private WeakReference<pcc> ri;
    private final boolean rj;
    private long rnn;
    private final gtm se;
    private final boolean tsx;
    private int vr;
    private WeakReference<cem> xb;
    private qf zsj;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(int i);

        void wh();
    }

    public gm(Context context, ViewGroup viewGroup, of ofVar, String str, boolean z, boolean z2, boolean z3, qf qfVar) {
        super(context, ofVar, viewGroup);
        this.nn = 0L;
        this.rnn = 0L;
        this.iv = true;
        this.hpk = 0;
        this.fmh = 0;
        this.se = new gtm() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1
            @Override // defpackage.gtm
            public void oo(stm stmVar) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj.gto();
                if (gto != null && (pcc2 = gto.pcc()) != null) {
                    pcc2.sf(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).vy);
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, 3);
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk != null) {
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk.pcc(0);
                }
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar, final ltm ltmVar) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).pcc;
                int i = ltmVar.a;
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ltm ltmVar2 = ltmVar;
                        int i2 = ltmVar2.a;
                        int i3 = ltmVar2.b;
                        if (!gm.this.tsz() || i3 == -1004) {
                            if (gm.this.oo(i2, i3)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).pcc;
                                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, (WeakReference<Context>) null, false);
                                gm.this.sf(true);
                                gm.this.vj();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf != null) {
                                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.sf();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).tsz != null) {
                                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).tsz.sf(gm.this.rnn, rtm.a(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).vy, ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).pq));
                            }
                            if (gm.this.xb == null || gm.this.xb.get() == null || gm.this.tsz()) {
                                return;
                            }
                            ((cem) gm.this.xb.get()).pcc(i2, i3);
                        }
                    }
                });
                gm.this.pcc(ltmVar);
                com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj.gto();
                if (gto != null && (pcc2 = gto.pcc()) != null) {
                    pcc2.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, 6);
                com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj);
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk != null) {
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk.pcc(14);
                }
            }

            @Override // defpackage.gtm
            public void sf(stm stmVar) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.removeCallbacks(gm.this.hoh);
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (gm.this.xb != null && gm.this.xb.get() != null) {
                            gm.this.xb.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf != null) {
                            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.sf();
                        }
                    }
                });
                if (gm.this.tsx) {
                    return;
                }
                gm gmVar = gm.this;
                gmVar.pcc(gmVar.zsj);
            }

            @Override // defpackage.gtm
            public void vj(stm stmVar) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj.gto();
                if (gto != null && (pcc2 = gto.pcc()) != null) {
                    pcc2.gm(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).vy);
                }
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk != null) {
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk.pcc(1);
                }
            }

            @Override // defpackage.gtm
            public void gm(stm stmVar) {
            }

            @Override // defpackage.gtm
            public void sf(stm stmVar, int i) {
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar, long j) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).yt = false;
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.removeCallbacks(gm.this.hoh);
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf != null) {
                            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.sf();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).jr || gm.this.ri == null || gm.this.ri.get() == null) {
                            return;
                        }
                        ((pcc) gm.this.ri.get()).wh();
                    }
                });
                gm.this.pq();
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, 0);
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk != null) {
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk.gm();
                }
                gm gmVar = gm.this;
                gmVar.pcc(gmVar.zsj);
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, 5);
                            com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, 5);
                            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk != null) {
                                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk.pcc(9);
                            }
                        } catch (Exception unused) {
                        }
                        gm.this.kun();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj.gto();
                if (gto == null || (pcc2 = gto.pcc()) == null) {
                    return;
                }
                pcc2.oo(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).vy);
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar, boolean z4) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf != null) {
                            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.sf();
                        }
                    }
                });
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar, int i, int i2) {
                vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.lrr();
                    }
                });
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar, int i, int i2, int i3) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).yt = true;
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf != null) {
                            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.nac();
                            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.postDelayed(gm.this.hoh, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, 2);
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk != null) {
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk.pcc(4);
                }
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar, int i) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).yt = false;
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.removeCallbacks(gm.this.hoh);
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.sf();
                    }
                });
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, 0);
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk != null) {
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).mk.pcc(5);
                }
            }

            @Override // defpackage.gtm
            public void pcc(stm stmVar, final long j, final long j2) {
                if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).vy) < 50) {
                    return;
                }
                gm gmVar = gm.this;
                gmVar.pcc(gmVar.zsj);
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.pcc(j, j2);
                        gm.this.sf(j, j2);
                    }
                });
            }
        };
        this.ptr = 0;
        this.hoh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf != null) {
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).kj, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.sf();
                    gm.this.sf(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).pcc;
                }
            }
        };
        this.qcw = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.6
            @Override // com.bytedance.sdk.component.utils.jsj.pcc
            public void pcc(Context context2, Intent intent, boolean z4, final int i) {
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.wh(i);
                    }
                });
            }
        };
        this.bg = false;
        this.vr = lu.gm(context);
        pcc(z);
        this.kun = str;
        try {
            this.hpk = viewGroup.getWidth();
            this.fmh = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        pcc(context);
        this.tsx = true;
        this.rj = z2;
        this.lrr = z3;
        if (qfVar != null) {
            this.zsj = qfVar;
        }
    }

    private boolean gm(int i, int i2) {
        if (i2 == 0) {
            sf();
            this.nac = true;
            vj vjVar = this.qf;
            if (vjVar != null) {
                vjVar.pcc(this.kj, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            vj vjVar2 = this.qf;
            if (vjVar2 != null) {
                vjVar2.pcc();
            }
            sf();
            this.nac = true;
            this.lu = false;
            vj vjVar3 = this.qf;
            if (vjVar3 != null) {
                return vjVar3.pcc(i, this.kj.kez(), this.lrr);
            }
        } else if (i2 == 4) {
            this.nac = false;
            vj vjVar4 = this.qf;
            if (vjVar4 != null) {
                vjVar4.jr();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public owm iv() {
        vj vjVar;
        if (this.vh.getResources().getConfiguration().orientation != 1 || (vjVar = this.qf) == null) {
            return null;
        }
        return vjVar.hc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kun() {
        this.ptr++;
        vj vjVar = this.qf;
        if (vjVar == null) {
            return;
        }
        vjVar.sf();
        fem femVar = this.tsz;
        if (femVar != null) {
            femVar.pcc(this.rnn, rtm.a(this.vy, this.pq));
        }
        this.rnn = System.currentTimeMillis() - this.nn;
        if (this.iv) {
            this.qf.pcc(this.kj, (WeakReference<Context>) null, true);
        }
        if (!this.fum) {
            this.fum = true;
            long j = this.pq;
            sf(j, j);
            long j2 = this.pq;
            this.vy = j2;
            this.ork = j2;
            sf(this.zsj);
        }
        if (!this.jr && this.gpj) {
            vj(this.qf, null);
        }
        this.gbb = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lrr() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar;
        int i;
        int i2;
        try {
            if (iv() != null && (gmVar = this.wh) != null && this.qy != null) {
                int oo = gmVar.oo();
                int vj = this.wh.vj();
                final int width = this.qy.getWidth();
                final int height = this.qy.getHeight();
                if (width > 0 && height > 0 && vj > 0 && oo > 0) {
                    if (oo == vj) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (oo > vj) {
                        i2 = (int) ((width * 1.0d) / ((oo * 1.0f) / vj));
                        i = width;
                    } else {
                        i = (int) ((height * 1.0d) / ((vj * 1.0f) / oo));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                boolean z = gm.this.iv() instanceof TextureView;
                                gm gmVar2 = gm.this;
                                if (z) {
                                    ((TextureView) gmVar2.iv()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).pcc;
                                } else if (gmVar2.iv() instanceof SurfaceView) {
                                    ((SurfaceView) gm.this.iv()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).pcc;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).pcc;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.vh);
            Objects.toString(iv());
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oo(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    private void rj() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            if (!gmVar.qf()) {
                this.wh.pcc(false, this.vy, this.dax);
            } else if (this.hc) {
                lo();
            } else {
                sf(this.mu);
            }
        }
        if (this.lo.get()) {
            mk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(long j, long j2) {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
        this.kj.oo(j);
        this.vy = j;
        this.pq = j2;
        this.qf.pcc(j, j2);
        this.qf.pcc(rtm.a(j, j2));
        try {
            fem femVar = this.tsz;
            if (femVar != null) {
                femVar.pcc(j, j2);
            }
        } catch (Throwable th) {
            lo.pcc(this.pcc, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.kj.gto();
        if (gto == null || (pcc2 = gto.pcc()) == null) {
            return;
        }
        pcc2.pcc(j, j2, this.mk);
    }

    private void vj(int i) {
        if (this.vr == i) {
            return;
        }
        this.vr = i;
        if (i != 4 && i != 0) {
            this.lu = false;
        }
        if (!this.lu && !hc() && this.rj) {
            gm(2, i);
        }
        WeakReference<pcc> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().pcc(this.vr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh(int i) {
        vj(i);
        if (i == 4) {
            this.nac = false;
        }
    }

    public void dax() {
        if (this.bg || !this.tz) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.lu.pcc().getApplicationContext();
        this.bg = true;
        jsj.pcc(this.qcw, applicationContext);
    }

    public void mu() {
        if (this.bg && this.tz) {
            this.bg = false;
            jsj.pcc(this.qcw);
        }
    }

    public void nn() {
        com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.mk;
        if (whVar != null) {
            whVar.pcc(13);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public boolean pcc(nem nemVar) {
        super.pcc(nemVar);
        if (this.wh != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(nemVar.dax())) {
            return false;
        }
        sf(false);
        nemVar.dax();
        nemVar.sf(com.bytedance.sdk.openadsdk.yt.vj.pcc("player_force_raw_url", 0) == 1);
        int i = this.erj + 1;
        this.erj = i;
        nemVar.vj = i;
        sf(nemVar);
        ye();
        com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.mk;
        if (whVar != null) {
            whVar.pcc(false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (!tsz.sf(this.kun) || this.vy <= 0) {
            this.vy = nemVar.ork();
        }
        if (tsz.sf(this.kun) && this.vy == this.pq) {
            this.vy = 0L;
        }
        if (nemVar.ork() <= 0) {
            this.fum = false;
            this.lo.set(false);
        } else {
            long ork = nemVar.ork();
            this.vy = ork;
            this.ork = Math.max(this.ork, ork);
        }
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc();
            if (this.ptr == 0) {
                this.qf.qf();
            }
            this.qf.gm(nemVar.kj(), nemVar.vy());
            this.qf.gm(this.qy);
            this.qf.pcc(nemVar.kj(), nemVar.vy());
        }
        if (this.wh == null) {
            com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = new com.bytedance.sdk.openadsdk.core.jr.oo.gm();
            this.wh = gmVar;
            gmVar.pcc(this.se);
        }
        lu();
        this.rnn = 0L;
        try {
            gm(nemVar);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            ltm ltmVar = new ltm();
            ltmVar.a = -10;
            ltmVar.b = 0;
            ltmVar.c = message;
            pcc(ltmVar);
            lo.gm(this.pcc, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    public void qf(boolean z) {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc();
        }
        vj vjVar2 = this.qf;
        if (vjVar2 != null && z) {
            vjVar2.lu();
        }
        rj();
    }

    public void rnn() {
        if (this.wh != null) {
            sf(false);
            ye();
            this.lo.set(false);
            this.fum = false;
            pcc(this.zsj);
            this.wh.vy();
        }
    }

    public int tsx() {
        return this.erj;
    }

    public void wh(boolean z) {
        this.iv = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void oo() {
        pcc(true, 3);
    }

    public void oo(int i) {
        this.erj = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void vj() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.tmg();
            this.wh = null;
        }
        if (this.iv) {
            boolean equals = "embeded_ad".equals(this.kun);
            vj vjVar = this.qf;
            if (!equals) {
                vjVar.pcc(this.kj, (WeakReference<Context>) null, true);
            } else {
                vjVar.lo();
            }
            this.gm.removeCallbacksAndMessages(null);
            this.tmg.clear();
            if (this.jr) {
                mu();
            }
        }
    }

    public void sf(int i, int i2) {
        pcc(i, i2);
        vj vjVar = this.qf;
        if (vjVar == null || i <= 0 || i2 <= 0) {
            return;
        }
        vjVar.gm(i, i2);
        this.qf.pcc(i, i2);
        lrr();
    }

    private void gm(nem nemVar) {
        nemVar.oo(0);
        this.wh.pcc(nemVar);
        this.nn = System.currentTimeMillis();
        this.qf.gm(8);
        this.qf.gm(0);
        pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).wh == null) {
                    return;
                }
                gm.this.nn = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).qf.oo(0);
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).wh.pcc(true, ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).vy, ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) gm.this).dax);
            }
        });
        if (this.jr) {
            dax();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void gm() {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc();
        }
        vj vjVar2 = this.qf;
        if (vjVar2 != null) {
            vjVar2.lu();
        }
        rj();
    }

    public void gm(int i) {
        vj(i);
        if (i == 4) {
            this.nac = false;
            gm();
        }
    }

    public void pcc(final wh.pcc pccVar) {
        vj vjVar;
        if (!this.jr || (vjVar = this.qf) == null) {
            return;
        }
        vjVar.pcc(new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.2
            @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.pcc
            public void pcc(View view, int i) {
                wh.pcc pccVar2 = pccVar;
                if (pccVar2 != null) {
                    pccVar2.pcc(view, i);
                }
            }
        });
    }

    public void pcc(PAGNativeAd pAGNativeAd) {
        vj vjVar;
        if (!this.jr || (vjVar = this.qf) == null) {
            return;
        }
        vjVar.pcc(pAGNativeAd);
    }

    public void pcc(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.hpk = i;
        this.fmh = i2;
    }

    public void pcc(sf sfVar) {
        this.gd = sfVar;
    }

    private void pcc(Context context) {
        ViewGroup gmVar;
        gm gmVar2;
        vj ooVar;
        if (this.jr) {
            gmVar = new com.bytedance.sdk.openadsdk.jr.oo(context);
        } else {
            gmVar = new com.bytedance.sdk.openadsdk.jr.gm(context);
        }
        ViewGroup viewGroup = gmVar;
        boolean z = this.jr;
        of ofVar = this.kj;
        if (z) {
            gmVar2 = this;
            ooVar = new vj(context, viewGroup, true, 17, ofVar, gmVar2, tz());
            gmVar2.qf = ooVar;
        } else {
            gmVar2 = this;
            ooVar = new oo(context, viewGroup, true, 17, ofVar, gmVar2, false);
            gmVar2.qf = ooVar;
        }
        ooVar.pcc(gmVar2);
    }

    public com.bytedance.sdk.openadsdk.core.gbb.wh pcc(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.kj.ixc()) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.mk;
        if (whVar == null) {
            whVar = com.bytedance.sdk.openadsdk.core.gbb.wh.pcc();
            this.mk = whVar;
        }
        whVar.pcc(view, this.kj);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.mk.pcc((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.mk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public void pcc(cem cemVar) {
        this.xb = new WeakReference<>(cemVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void pcc() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public void pcc(boolean z, int i) {
        if (!this.fum && this.lo.get()) {
            if (z) {
                pcc(i, false);
                this.fum = false;
            } else {
                atb();
            }
        }
        vj();
        com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.mk;
        if (whVar != null) {
            whVar.oo();
        }
    }

    public final void pcc(int i, boolean z) {
        if (z || this.zti) {
            if (z) {
                this.zti = false;
            }
            if (this.fum || !this.lo.get()) {
                return;
            }
            jr.pcc pccVar = new jr.pcc();
            pccVar.sf(wh());
            pccVar.oo(vy());
            pccVar.gm(qf());
            pccVar.gm(i);
            pccVar.oo(kj());
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.qf, pccVar, this.zsj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public void pcc(kwm kwmVar, View view) {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar == null) {
            return;
        }
        if (gmVar.wh()) {
            sf();
            this.qf.sf(true, false);
            this.qf.wh();
            return;
        }
        if (!this.wh.qf()) {
            vj vjVar = this.qf;
            if (vjVar != null) {
                vjVar.gm(this.qy);
            }
            vj(this.vy);
            vj vjVar2 = this.qf;
            if (vjVar2 != null) {
                vjVar2.sf(false, false);
                return;
            }
            return;
        }
        qf(false);
        vj vjVar3 = this.qf;
        if (vjVar3 != null) {
            vjVar3.sf(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public void pcc(kwm kwmVar, View view, boolean z) {
        gm(!this.gpj);
        if (this.vh instanceof Activity) {
            vj vjVar = this.qf;
            if (vjVar != null) {
                vjVar.sf(this.qy);
                this.qf.gm(false);
            }
            pcc(1);
            WeakReference<jem> weakReference = this.jsj;
            jem jemVar = weakReference != null ? weakReference.get() : null;
            if (jemVar != null) {
                jemVar.pcc(this.gpj);
            }
        }
    }

    public void pcc(pcc pccVar) {
        this.ri = new WeakReference<>(pccVar);
    }
}
