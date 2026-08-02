package com.bytedance.sdk.openadsdk.core.jr.pcc;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.gbb.wh;
import com.bytedance.sdk.openadsdk.core.jr.oo.gm;
import com.bytedance.sdk.openadsdk.core.jr.sf.vj;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.lo;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import defpackage.bsm;
import defpackage.cem;
import defpackage.fem;
import defpackage.jem;
import defpackage.kwm;
import defpackage.ltm;
import defpackage.nem;
import defpackage.oea;
import defpackage.oem;
import defpackage.rtm;
import defpackage.stm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc implements oem, tsz.pcc, com.bytedance.sdk.openadsdk.core.jr.sf.pcc {
    protected boolean atb;
    protected boolean dax;
    protected boolean fum;
    protected WeakReference<jem> jsj;

    @NonNull
    protected final of kj;
    protected long lq;
    protected wh mk;
    private long nn;
    protected sf of;
    protected SurfaceHolder oo;
    protected long pq;
    protected vj qf;
    protected final ViewGroup qy;
    protected fem tsz;

    @NonNull
    protected final Context vh;
    protected SurfaceTexture vj;
    protected gm wh;
    protected boolean yt;
    protected String pcc = "TTAD.VideoController";
    protected final int sf = 100;
    protected final tsz gm = new tsz(Looper.getMainLooper(), this);
    protected long vy = 0;
    protected long ork = 0;
    protected final List<Runnable> tmg = new ArrayList();
    protected boolean hc = false;
    protected boolean gbb = false;
    protected boolean jr = true;
    protected boolean nac = false;
    protected boolean lu = false;
    protected boolean gpj = false;
    protected AtomicBoolean lo = new AtomicBoolean(false);
    protected boolean tz = true;
    protected AtomicInteger ye = new AtomicInteger(0);
    protected boolean zti = false;
    protected Runnable mu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z = pcc.this.hc;
            pcc.this.lo();
        }
    };
    private long rnn = 0;
    private boolean tsx = true;
    private int kun = 1;
    private final AtomicBoolean rj = new AtomicBoolean(false);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[lo.pcc.values().length];
            pcc = iArr;
            try {
                iArr[lo.pcc.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[lo.pcc.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[lo.pcc.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public pcc(Context context, @NonNull of ofVar, ViewGroup viewGroup) {
        this.kj = ofVar;
        this.vh = context;
        this.qy = viewGroup;
        this.pcc += hashCode();
    }

    private boolean dax() {
        vj vjVar = this.qf;
        if (vjVar != null) {
            return vjVar.hc() instanceof bsm;
        }
        return false;
    }

    private void mu() {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.oo(0);
            this.qf.pcc(false, false);
            this.qf.gm(false);
            this.qf.vj();
            this.qf.qf();
        }
    }

    public final void atb() {
        this.zti = true;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy() / lq());
        pccVar.gm(qf());
        pccVar.pcc(nac());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.qf, pccVar);
    }

    @Override // defpackage.oem
    /* renamed from: fum, reason: merged with bridge method [inline-methods] */
    public final vj tmg() {
        return this.qf;
    }

    @Override // defpackage.oem
    public final boolean gbb() {
        return this.yt;
    }

    @Override // defpackage.oem
    public abstract /* synthetic */ void gm();

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void gm(kwm kwmVar, View view) {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.vy();
        }
        pcc(true, 3);
    }

    public void gpj() {
        if (this.tmg.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.tmg).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.tmg.clear();
    }

    @Override // defpackage.oem
    public boolean hc() {
        return this.gbb;
    }

    @Override // defpackage.oem
    public boolean jr() {
        return true;
    }

    public final boolean jsj() {
        gm gmVar = this.wh;
        return gmVar == null || gmVar.sf();
    }

    @Override // defpackage.oem
    public final int kj() {
        gm gmVar = this.wh;
        if (gmVar == null) {
            return 0;
        }
        return gmVar.dax();
    }

    public void lo() {
        this.gm.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                pcc pccVar = pcc.this;
                if (pccVar.wh != null) {
                    boolean z = pccVar.hc;
                    pcc.this.wh.ork();
                }
            }
        });
    }

    public int lq() {
        return this.kun;
    }

    public void lu() {
        if (this.wh == null) {
            return;
        }
        if (dax()) {
            SurfaceTexture surfaceTexture = this.vj;
            if (surfaceTexture == null || surfaceTexture == this.wh.lo()) {
                return;
            }
            this.wh.pcc(this.vj);
            return;
        }
        SurfaceHolder surfaceHolder = this.oo;
        if (surfaceHolder == null || surfaceHolder == this.wh.gpj()) {
            return;
        }
        this.wh.pcc(this.oo);
    }

    public final void mk() {
        this.zti = true;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy() / lq());
        pccVar.gm(qf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(tmg(), pccVar);
    }

    public long nac() {
        return this.lq;
    }

    public boolean of() {
        return this.nac;
    }

    @Override // defpackage.oem
    public abstract /* synthetic */ void oo();

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void oo(kwm kwmVar, View view) {
        if (!this.gpj) {
            pcc(true, 3);
            return;
        }
        gm(false);
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.sf(this.qy);
        }
        pcc(1);
    }

    @Override // defpackage.oem
    public final int ork() {
        return rtm.a(this.ork, this.pq);
    }

    @Override // defpackage.oem
    public abstract /* synthetic */ void pcc();

    public final void pcc(qf qfVar) {
        boolean z = false;
        if (this.lo.compareAndSet(false, true)) {
            this.zti = true;
            wh whVar = this.mk;
            if (whVar != null) {
                whVar.pcc(vy(), yt());
            }
            jr.pcc pccVar = new jr.pcc();
            pccVar.pcc(qy());
            pccVar.oo(vy());
            gm gmVar = this.wh;
            if (gmVar != null && gmVar.gbb()) {
                z = true;
            }
            pccVar.sf(z);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(lu.pcc(), this.qf, pccVar, qfVar);
        }
    }

    public abstract /* synthetic */ void pcc(kwm kwmVar, View view);

    public abstract /* synthetic */ void pcc(boolean z, int i);

    public final void pq() {
        com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(this.kj.pzh(), true, this.kj), 5, this.kj.esn());
    }

    @Override // defpackage.oem
    public final long qf() {
        gm gmVar = this.wh;
        if (gmVar == null) {
            return 0L;
        }
        return gmVar.jr();
    }

    public boolean qy() {
        return this.tsx;
    }

    public final void sf(kwm kwmVar, View view, boolean z, boolean z2) {
        gm(!this.gpj);
        Context context = this.vh;
        if (context != null && (context instanceof Activity)) {
            if (this.gpj) {
                pcc(z ? 8 : 0);
                vj vjVar = this.qf;
                if (vjVar != null) {
                    vjVar.pcc(this.qy);
                    this.qf.gm(false);
                }
            } else {
                pcc(1);
                vj vjVar2 = this.qf;
                if (vjVar2 != null) {
                    vjVar2.sf(this.qy);
                    this.qf.gm(false);
                }
            }
            WeakReference<jem> weakReference = this.jsj;
            jem jemVar = weakReference != null ? weakReference.get() : null;
            if (jemVar != null) {
                jemVar.pcc(this.gpj);
            }
        }
    }

    public final boolean tsz() {
        gm gmVar = this.wh;
        return gmVar != null && gmVar.wh();
    }

    public boolean tz() {
        return this.jr;
    }

    @Override // defpackage.oem
    public stm vh() {
        return this.wh;
    }

    @Override // defpackage.oem
    public abstract /* synthetic */ void vj();

    public final void vj(long j) {
        this.vy = j;
        this.ork = Math.max(this.ork, j);
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc();
        }
        gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(true, this.vy, this.dax);
        }
    }

    @Override // defpackage.oem
    public final long vy() {
        gm gmVar = this.wh;
        if (gmVar == null) {
            return 0L;
        }
        return gmVar.nac();
    }

    @Override // defpackage.oem
    public long wh() {
        return this.vy;
    }

    public final void ye() {
        this.zti = true;
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.kj, this.qf, this.of);
    }

    public boolean yt() {
        return this.dax;
    }

    public final long zti() {
        return qf() + wh();
    }

    public void gm(long j) {
        this.rnn = j;
    }

    public void gm(boolean z) {
        this.gpj = z;
    }

    private boolean gm(int i) {
        return this.qf.sf(i);
    }

    public void oo(long j) {
        this.pq = j;
    }

    public final void oo(boolean z) {
        this.tsx = z;
    }

    public void vj(boolean z) {
        this.tz = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc, defpackage.mtm
    public final void vj(kwm kwmVar, View view) {
        pcc(kwmVar, view, false);
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
    }

    @Override // defpackage.oem
    public boolean pcc(nem nemVar) {
        return false;
    }

    public void pcc(Runnable runnable) {
        if (this.qf.tz() && this.hc) {
            runnable.run();
        } else {
            sf(runnable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public void pcc(kwm kwmVar, SurfaceHolder surfaceHolder) {
        this.hc = true;
        this.oo = surfaceHolder;
        gm gmVar = this.wh;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(surfaceHolder);
        gpj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public void pcc(kwm kwmVar, SurfaceTexture surfaceTexture) {
        this.hc = true;
        this.vj = surfaceTexture;
        gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(surfaceTexture);
            this.wh.pcc(this.hc);
        }
        gpj();
    }

    public void sf(Runnable runnable) {
        this.tmg.add(runnable);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public void sf(kwm kwmVar, SurfaceHolder surfaceHolder) {
        this.hc = false;
        this.oo = null;
        gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(false);
        }
    }

    public void pcc(boolean z) {
        this.jr = z;
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.oo(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public void sf(kwm kwmVar, SurfaceTexture surfaceTexture) {
        this.hc = false;
        gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(false);
        }
        this.vj = null;
        gpj();
    }

    @Override // defpackage.oem
    public final void pcc(final boolean z, String str) {
        this.dax = z;
        gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.sf(z);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.qf, z, str);
        }
        if (this.mk != null) {
            if (oea.s()) {
                this.mk.pcc(z);
            } else {
                this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        pcc.this.mk.pcc(z);
                    }
                });
            }
        }
    }

    public final void sf(boolean z) {
        this.gbb = z;
    }

    public void sf(nem nemVar) {
        sf sfVar = (sf) nemVar;
        this.of = sfVar;
        this.dax = sfVar.vh();
        nemVar.oo(String.valueOf(this.kj.kot()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void sf(kwm kwmVar, View view) {
        sf(kwmVar, view, false, false);
    }

    public final void pcc(jem jemVar) {
        this.jsj = new WeakReference<>(jemVar);
    }

    public void sf(long j) {
        this.vy = j;
        this.ork = Math.max(this.ork, j);
    }

    public void pcc(kwm kwmVar, View view, boolean z) {
    }

    public final void pcc(int i) {
        Context context = this.vh;
        if (context == null) {
            return;
        }
        boolean z = i == 0 || i == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
            if (!z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void sf(kwm kwmVar, int i) {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.wh();
        }
    }

    public final void sf(qf qfVar) {
        this.zti = true;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy() / lq());
        pccVar.gm(qf());
        pccVar.oo(kj());
        pccVar.pcc(nac());
        pccVar.gm(this.atb);
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(this.qf, pccVar, qfVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void pcc(kwm kwmVar, View view, boolean z, boolean z2) {
        if (this.jr) {
            sf();
        }
        if (z && !this.jr && !jsj()) {
            this.qf.sf(!tsz(), false);
            this.qf.pcc(z2, true, false);
        }
        gm gmVar = this.wh;
        if (gmVar != null && gmVar.wh()) {
            this.qf.wh();
            this.qf.vj();
        } else {
            this.qf.wh();
        }
    }

    public void sf(int i) {
        this.kun = i;
    }

    @Override // defpackage.oem
    public final void sf() {
        gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.vh();
        }
        if (this.fum || !this.lo.get()) {
            return;
        }
        atb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void pcc(kwm kwmVar, int i, boolean z) {
        if (this.vh == null) {
            return;
        }
        long j = (long) (((i * r0) * 1.0f) / 100.0f);
        long j2 = 0;
        if (this.pq > 0) {
            j2 = (int) j;
            this.nn = j2;
        } else {
            this.nn = 0L;
        }
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc(j2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void pcc(kwm kwmVar, int i) {
        if (this.wh == null) {
            return;
        }
        pcc(this.nn, gm(i));
    }

    private void pcc(long j, boolean z) {
        if (this.wh == null) {
            return;
        }
        if (z) {
            mu();
        }
        this.wh.pcc(j);
    }

    public final void pcc(ltm ltmVar) {
        this.zti = true;
        jr.pcc pccVar = new jr.pcc();
        pccVar.gm(qf());
        pccVar.oo(vy() / lq());
        pccVar.sf(wh());
        pccVar.pcc(ltmVar);
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.gm(tmg(), pccVar);
    }

    @Override // defpackage.oem
    public final void pcc(fem femVar) {
        this.tsz = femVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void pcc(lo.pcc pccVar, String str) {
        int i = AnonymousClass4.pcc[pccVar.ordinal()];
        if (i == 1) {
            sf();
            return;
        }
        if (i == 2) {
            oo();
        } else {
            if (i != 3) {
                return;
            }
            gm();
            this.nac = false;
            this.lu = true;
        }
    }

    public void pcc(cem cemVar) {
    }

    @Override // defpackage.oem
    public void pcc(long j) {
        this.lq = j;
    }

    @Override // defpackage.oem
    public boolean pcc(float f) {
        gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.pcc(f);
        }
        return false;
    }

    public void pcc(long j, long j2) {
        if (!this.rj.get() && com.bytedance.sdk.openadsdk.wh.pcc.pcc().gm() && (j * 1.0d) / j2 > 0.3d) {
            this.rj.set(true);
            if (this.kj != null) {
                com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoPercent30", this.kj);
            }
        }
    }

    @Override // defpackage.oem
    public void pcc(SurfaceTexture surfaceTexture) {
        this.atb = true;
        this.ye.incrementAndGet();
    }
}
