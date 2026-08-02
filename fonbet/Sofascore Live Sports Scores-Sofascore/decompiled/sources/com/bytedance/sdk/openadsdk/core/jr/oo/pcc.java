package com.bytedance.sdk.openadsdk.core.jr.oo;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.vy;
import com.bytedance.sdk.openadsdk.component.reward.view.kj;
import com.bytedance.sdk.openadsdk.core.gbb.wh;
import com.bytedance.sdk.openadsdk.core.jr.oo.gm;
import com.bytedance.sdk.openadsdk.core.jr.sf.vj;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.jr.oo;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.utils.lrr;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fem;
import defpackage.kwm;
import defpackage.ltm;
import defpackage.nem;
import defpackage.owm;
import defpackage.rtm;
import defpackage.stm;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.sdk.openadsdk.core.jr.pcc.pcc {
    private final Runnable fmh;
    private boolean hpk;
    private boolean iv;
    private final qf kun;
    private long lrr;
    protected long nn;
    private final AtomicBoolean ri;
    private long rj;
    protected boolean rnn;
    final gm.sf tsx;
    private final int xb;
    private InterfaceC0088pcc zsj;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.oo.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0088pcc {
        void pcc(int i);
    }

    public pcc(Context context, ViewGroup viewGroup, of ofVar, qf qfVar) {
        super(context, ofVar, viewGroup);
        this.rj = 0L;
        this.lrr = 0L;
        this.iv = false;
        this.nn = 0L;
        this.rnn = false;
        this.ri = new AtomicBoolean(false);
        this.tsx = new AnonymousClass1();
        this.fmh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).tsz != null) {
                    pcc.this.dax();
                    ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).tsz.pcc();
                }
            }
        };
        this.kun = qfVar;
        this.xb = ofVar.kot();
        if (ofVar.ixc() && this.qy != null) {
            wh whVar = this.mk;
            if (whVar == null) {
                whVar = wh.pcc();
                this.mk = whVar;
            }
            whVar.pcc(this.qy, ofVar);
        }
        vj vjVar = new vj(context.getApplicationContext(), new oo(context), true, 17, this.kj, this);
        this.qf = vjVar;
        vjVar.pcc(this);
    }

    private boolean hpk() {
        boolean pcc = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.kj.rt());
        of ofVar = this.kj;
        return rnn() == null || this.wh == null || (!pcc ? ofVar.kx() != null : ofVar.uae() != null) || this.kj.pv() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iv() {
        int i = this.of.wh;
        int fmh = (i == 2 || i == 1) ? lu.oo().fmh() * 1000 : i == 4 ? lu.oo().ork(String.valueOf(this.xb)) : 5000;
        this.gm.removeCallbacks(this.fmh);
        this.gm.postDelayed(this.fmh, fmh);
    }

    private void lrr() {
        this.wh.gm(lq());
        this.wh.pcc(this.of);
        this.rj = System.currentTimeMillis();
        this.qf.gm(8);
        this.qf.gm(0);
        pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).wh == null) {
                    return;
                }
                pcc.this.rj = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.oo(0);
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).wh.pcc(true, ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).vy, ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).dax);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri() {
        return this.kj.zx() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rj() {
        sf(this.kun);
        this.of.vj = this.wh.fum();
        ye();
        this.lo.set(false);
        this.ri.set(false);
        pcc(this.kun);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(float f, float f2) {
        pcc pccVar;
        float f3;
        float f4;
        float f5;
        float f6;
        try {
            Objects.toString(this.kj.gqd());
            if (hpk()) {
                return;
            }
            int[] sf = rj.sf(lu.pcc());
            boolean z = false;
            boolean z2 = this.kj.ial() == 1;
            float f7 = sf[0];
            float f8 = sf[1];
            try {
                if (!z2) {
                    pccVar = this;
                    f3 = f;
                    f4 = f2;
                    if (f3 < f4) {
                        pccVar.pcc(f7, f8, f3, f4, false);
                        return;
                    }
                } else if (f > f2) {
                    pcc(f7, f8, f, f2, true);
                    return;
                } else {
                    pccVar = this;
                    f3 = f;
                    f4 = f2;
                }
                float f9 = f3 / f4;
                float f10 = f7 / f8;
                if (z2) {
                    if (f10 < 0.5625f && f9 == 0.5625f) {
                        f6 = (f8 * 9.0f) / 16.0f;
                        z = true;
                        f5 = f8;
                    }
                    f6 = f3;
                    f5 = f4;
                } else {
                    if (f10 > 1.7777778f && f9 == 1.7777778f) {
                        f5 = (f7 * 9.0f) / 16.0f;
                        z = true;
                        f6 = f7;
                    }
                    f6 = f3;
                    f5 = f4;
                }
                if (z) {
                    f7 = f6;
                    f8 = f5;
                }
                int i = (int) f7;
                int i2 = (int) f8;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                layoutParams.addRule(13);
                if (pccVar.rnn() != null) {
                    if (pccVar.rnn() instanceof TextureView) {
                        ((TextureView) pccVar.rnn()).setLayoutParams(layoutParams);
                    } else if (pccVar.rnn() instanceof SurfaceView) {
                        ((SurfaceView) pccVar.rnn()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = pccVar.qy.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i2;
                        layoutParams2.width = i;
                        pccVar.qy.setLayoutParams(layoutParams2);
                    }
                }
            } catch (Throwable th) {
                th = th;
                lo.pcc(this.pcc, "changeSize error", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xb() {
        if (this.qf == null) {
            return;
        }
        this.gm.removeCallbacks(this.fmh);
        this.qf.sf();
        this.lrr = System.currentTimeMillis() - this.rj;
        if (!this.iv) {
            this.iv = true;
            long j = this.pq;
            sf(j, j);
            long j2 = this.pq;
            this.vy = j2;
            this.ork = j2;
            sf(this.kun);
        }
        fem femVar = this.tsz;
        if (femVar != null) {
            femVar.pcc(this.lrr, rtm.a(this.vy, this.pq));
        }
        this.gbb = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void gm() {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc();
            this.qf.jr();
            this.qf.lu();
        }
        gm gmVar = this.wh;
        if (gmVar != null) {
            if (!gmVar.qf()) {
                this.wh.pcc(false, this.vy, this.dax);
            } else if (!this.hc) {
                sf(this.mu);
            } else if (ork.lo()) {
                this.wh.sf(3);
                gm gmVar2 = this.wh;
                gmVar2.pcc(false, gmVar2.lu(), this.dax);
            } else {
                lo();
            }
        }
        if (this.iv || !this.lo.get()) {
            return;
        }
        mk();
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.kj.gto();
        if (gto == null || (pcc = gto.pcc()) == null) {
            return;
        }
        pcc.gm(wh());
    }

    public void kun() {
        wh whVar = this.mk;
        if (whVar != null) {
            whVar.pcc(13);
        }
    }

    public void mu() {
        this.tsx.pcc((stm) null, 0, 0);
    }

    public void nn() {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        if (this.iv || !this.lo.get()) {
            return;
        }
        mk();
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.kj.gto();
        if (gto == null || (pcc = gto.pcc()) == null) {
            return;
        }
        pcc.gm(wh());
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void oo() {
        gm gmVar = this.wh;
        if (gmVar == null) {
            return;
        }
        gmVar.tmg();
        this.wh = null;
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.vy();
        }
        this.gm.removeCallbacks(this.fmh);
        this.gm.removeCallbacksAndMessages(null);
        wh whVar = this.mk;
        if (whVar != null) {
            whVar.oo();
        }
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.kj, this.ye.get(), this.rj);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public boolean pcc(@NonNull nem nemVar) {
        super.pcc(nemVar);
        if (this.wh != null) {
            return false;
        }
        nemVar.dax();
        if (TextUtils.isEmpty(nemVar.dax())) {
            return false;
        }
        nemVar.sf(com.bytedance.sdk.openadsdk.yt.vj.pcc("player_force_raw_url", 0) == 1);
        sf(nemVar);
        nemVar.oo(1);
        this.rnn = !nemVar.dax().startsWith("http");
        if (this.mk != null) {
            int i = this.of.wh;
            of ofVar = this.kj;
            int quq = i == 1 ? ofVar.quq() : ofVar.bm();
            if (this.qy != null) {
                try {
                    int tqg = this.kj.tqg();
                    if (tqg != 7 && tqg != 8) {
                        if (tqg == 3) {
                            Iterator<View> it = lrr.pcc(this.qy, 2).iterator();
                            while (it.hasNext()) {
                                this.mk.pcc(it.next(), FriendlyObstructionPurpose.OTHER);
                            }
                        }
                    }
                    View pcc = lrr.pcc(this.qy, (Class<? extends View>) kj.class);
                    if (pcc != null) {
                        View findViewById = pcc.findViewById(nac.gbb);
                        View findViewById2 = pcc.findViewById(nac.wke);
                        View findViewById3 = pcc.findViewById(nac.jk);
                        wh whVar = this.mk;
                        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                        whVar.pcc(findViewById2, friendlyObstructionPurpose);
                        this.mk.pcc(findViewById, friendlyObstructionPurpose);
                        this.mk.pcc(findViewById3, friendlyObstructionPurpose);
                        if (this.hpk) {
                            View pcc2 = lrr.pcc(this.qy, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.hc.sf.wh.pcc.class);
                            if (pcc2 instanceof com.bytedance.sdk.openadsdk.core.hc.sf.wh.pcc) {
                                this.mk.pcc(((com.bytedance.sdk.openadsdk.core.hc.sf.wh.pcc) pcc2).getMarkView(), friendlyObstructionPurpose);
                            }
                        }
                    }
                    Iterator<View> it2 = lrr.pcc(this.qy, 1).iterator();
                    while (it2.hasNext()) {
                        this.mk.pcc(it2.next(), FriendlyObstructionPurpose.OTHER);
                    }
                } catch (Throwable unused) {
                }
            }
            this.mk.pcc(quq > 0, quq / 1000.0f);
        }
        ye();
        if (nemVar.ork() > 0) {
            long ork = nemVar.ork();
            this.vy = ork;
            this.ork = Math.max(this.ork, ork);
        }
        if (this.vy == this.pq) {
            this.vy = 0L;
        }
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc();
            this.qf.qf();
            this.qf.gm(nemVar.kj(), nemVar.vy());
            this.qf.gm(this.qy);
        }
        gm gmVar = new gm();
        this.wh = gmVar;
        gmVar.pcc(this.tsx);
        lu();
        this.lrr = 0L;
        lrr();
        return true;
    }

    public owm rnn() {
        vj vjVar = this.qf;
        if (vjVar != null) {
            return vjVar.hc();
        }
        return null;
    }

    public void tsx() {
        wh whVar = this.mk;
        if (whVar != null) {
            whVar.pcc(2);
        }
    }

    public void dax() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public boolean qy() {
        return true;
    }

    public void wh(boolean z) {
        this.hpk = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void vj() {
        oo();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.oo.pcc$1, reason: invalid class name */
    public class AnonymousClass1 implements gm.sf {
        private boolean sf = true;

        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void gm(stm stmVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void oo(stm stmVar) {
            com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
            com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj.gto();
            if (gto != null && (pcc = gto.pcc()) != null) {
                pcc.sf(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).vy);
            }
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 3);
            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk.pcc(0);
            }
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(stm stmVar, ltm ltmVar) {
            com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
            int i = ltmVar.a;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.removeCallbacks(pcc.this.fmh);
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.sf();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).tsz != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).tsz.sf(pcc.this.lrr, rtm.a(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).vy, ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pq));
                    }
                }
            });
            pcc.this.pcc(ltmVar);
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 6);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj);
            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk.pcc(14);
            }
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(4);
            }
            com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj.gto();
            if (gto == null || (pcc = gto.pcc()) == null) {
                return;
            }
            pcc.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void sf(stm stmVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.removeCallbacks(pcc.this.fmh);
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.sf();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void vj(stm stmVar) {
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 0);
            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk.pcc(1);
            }
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void sf(stm stmVar, int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(stm stmVar, long j) {
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).yt = false;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.removeCallbacks(pcc.this.fmh);
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.sf();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).lo.get()) {
                pcc pccVar = pcc.this;
                pccVar.nn = j;
                pccVar.pcc(pccVar.kun);
                pcc.this.pq();
            }
            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk.gm();
            }
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 0);
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(stm stmVar) {
            com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
            if (pcc.this.ri.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk.pcc(9);
                            } catch (Exception unused2) {
                            }
                        }
                        pcc.this.xb();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj.gto();
                if (gto != null && (pcc = gto.pcc()) != null) {
                    long wh = pcc.this.wh();
                    pcc.oo(wh);
                    pcc.vj(wh);
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 5);
                com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 5);
                if (pcc.this.zsj != null) {
                    pcc.this.zsj.pcc(3);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(stm stmVar, boolean z) {
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.removeCallbacks(pcc.this.fmh);
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.sf();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(stm stmVar, int i, int i2) {
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
            vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).wh == null) {
                        return;
                    }
                    try {
                        final float oo = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).wh.oo();
                        final float vj = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).wh.vj();
                        if (oo == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || vj == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean ri = pcc.this.ri();
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                if (!ri) {
                                    pcc.this.pcc(oo, vj);
                                    return;
                                }
                                if (com.bytedance.sdk.openadsdk.core.model.lo.sf(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj) || ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).of.wh == 4) {
                                    pcc.this.pcc(true, oo, vj);
                                    return;
                                }
                                boolean gm = com.bytedance.sdk.openadsdk.core.model.lo.gm(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj);
                                AnonymousClass6 anonymousClass62 = AnonymousClass6.this;
                                if (gm) {
                                    pcc.this.pcc(true, oo, vj);
                                    return;
                                }
                                int bbd = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj.bbd();
                                AnonymousClass6 anonymousClass63 = AnonymousClass6.this;
                                if (bbd == 3) {
                                    pcc.this.pcc(true, oo, vj);
                                    return;
                                }
                                int bbd2 = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj.bbd();
                                AnonymousClass6 anonymousClass64 = AnonymousClass6.this;
                                if (bbd2 == 0) {
                                    pcc.this.gm(oo, vj);
                                } else {
                                    pcc.this.sf(oo, vj);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        lo.gm(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(stm stmVar, int i, int i2, int i3) {
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).yt = true;
            pcc.this.iv();
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.nac();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 3);
            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk.pcc(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(stm stmVar, int i) {
            String unused = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).yt = false;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.removeCallbacks(pcc.this.fmh);
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.sf();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj, 0);
            if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk.pcc(5);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf, defpackage.gtm
        public void pcc(final stm stmVar, long j, long j2) {
            long j3;
            long j4;
            com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
            if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).vy) < 50) {
                return;
            }
            pcc pccVar = pcc.this;
            pccVar.pcc(pccVar.kun);
            pcc.this.pcc(j, j2);
            pcc.this.sf(j, j2);
            com.bytedance.sdk.openadsdk.core.model.oo gto = ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).kj.gto();
            if (gto == null || (pcc = gto.pcc()) == null) {
                j3 = j;
                j4 = j2;
            } else {
                j3 = j;
                j4 = j2;
                pcc.pcc(j3, j4, ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).mk);
            }
            if (!this.sf || j4 - j3 >= 500) {
                return;
            }
            this.sf = false;
            ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).gm.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.9
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.pcc(stmVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf
        public void pcc(int i, int i2) {
            pcc.this.rj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(float f, float f2) {
        try {
            if (rnn() != null && this.wh != null) {
                boolean z = this.kj.ial() == 1;
                int[] sf = rj.sf(lu.pcc());
                pcc(sf[0], sf[1], f, f2, z);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(final long j, final long j2) {
        this.kj.oo(j);
        this.vy = j;
        this.pq = j2;
        final int a = rtm.a(j, j2);
        this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.pcc(j, j2);
                ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).qf.pcc(a);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).tsz != null) {
                        ((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).tsz.pcc(j, j2);
                    }
                } catch (Throwable th) {
                    lo.pcc(((com.bytedance.sdk.openadsdk.core.jr.pcc.pcc) pcc.this).pcc, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    public void pcc(boolean z, float f, float f2) {
        try {
            Objects.toString(this.kj.gqd());
            if (!hpk() || z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (rnn() != null) {
                    if (rnn() instanceof TextureView) {
                        ((TextureView) rnn()).setLayoutParams(layoutParams);
                    } else if (rnn() instanceof SurfaceView) {
                        ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.qy.getLayoutParams();
                    if (this.qy.getHeight() > 0) {
                        float min = Math.min(this.qy.getWidth() / f, this.qy.getHeight() / f2);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f * min);
                            layoutParams.height = (int) (f2 * min);
                            if (rnn() instanceof TextureView) {
                                ((TextureView) rnn()).setLayoutParams(layoutParams);
                            } else if (rnn() instanceof SurfaceView) {
                                ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                            }
                            if (this.of.wh == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.qy.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            lo.pcc(this.pcc, "changeSize error", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public void pcc(boolean z, int i) {
        oo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(float f, float f2) {
        ViewGroup viewGroup;
        try {
            if (rnn() != null && this.wh != null && (viewGroup = this.qy) != null) {
                float width = viewGroup.getWidth();
                float f3 = f / (width * 1.0f);
                float height = this.qy.getHeight();
                if (f3 <= f2 / (1.0f * height)) {
                    width = (height / f2) * f;
                } else {
                    height = (width / f) * f2;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (rnn() instanceof TextureView) {
                    ((TextureView) rnn()).setLayoutParams(layoutParams);
                } else if (rnn() instanceof SurfaceView) {
                    ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            lo.pcc(this.pcc, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private void pcc(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                f3 = this.kj.kez().b;
                f4 = this.kj.kez().a;
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (z) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (rnn() != null) {
                if (rnn() instanceof TextureView) {
                    ((TextureView) rnn()).setLayoutParams(layoutParams);
                } else if (rnn() instanceof SurfaceView) {
                    ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.qy.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.oo.sf.pcc(lu.pcc()) || this.qy.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.qy.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public void pcc(kwm kwmVar, View view) {
        gm gmVar = this.wh;
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
        gm();
        vj vjVar3 = this.qf;
        if (vjVar3 != null) {
            vjVar3.sf(false, false);
        }
    }

    public void pcc(InterfaceC0088pcc interfaceC0088pcc) {
        this.zsj = interfaceC0088pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, defpackage.oem
    public void pcc() {
        if (this.wh != null) {
            rj();
            this.wh.vy();
        }
    }
}
