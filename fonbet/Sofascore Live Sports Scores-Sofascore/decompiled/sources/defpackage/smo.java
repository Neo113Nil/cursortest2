package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.ads.interactivemedia.v3.internal.zzoo;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C4324ta;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class smo implements pno {
    public static smo q;
    public final Context a;
    public final axn b;
    public final n72 c;
    public final r0p d;
    public final ng2 e;
    public final en0 f;
    public final Executor g;
    public final mxn h;
    public final lso j;
    public final cso k;
    public volatile boolean n;
    public volatile boolean o;
    public final int p;
    public volatile long l = 0;
    public final Object m = new Object();
    public final CountDownLatch i = new CountDownLatch(1);

    public smo(Context context, en0 en0Var, axn axnVar, n72 n72Var, r0p r0pVar, ng2 ng2Var, Executor executor, xyo xyoVar, int i, lso lsoVar, cso csoVar) {
        this.o = false;
        this.a = context;
        this.f = en0Var;
        this.b = axnVar;
        this.c = n72Var;
        this.d = r0pVar;
        this.e = ng2Var;
        this.g = executor;
        this.p = i;
        this.j = lsoVar;
        this.k = csoVar;
        this.o = false;
        this.h = new mxn(15, this, xyoVar);
    }

    public static synchronized smo f(String str, Context context, Executor executor, boolean z, boolean z2) {
        smo j;
        synchronized (smo.class) {
            dzo dzoVar = new dzo();
            dzoVar.b = false;
            byte b = (byte) (dzoVar.f | 1);
            dzoVar.c = true;
            dzoVar.d = 100L;
            dzoVar.e = 300L;
            byte b2 = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
            dzoVar.f = b2;
            if (str == null) {
                throw new NullPointerException("Null clientVersion");
            }
            dzoVar.a = str;
            dzoVar.b = z;
            dzoVar.f = (byte) (b2 | 1);
            j = j(context, executor, dzoVar.a(), z2);
        }
        return j;
    }

    public static synchronized smo j(Context context, Executor executor, czo czoVar, boolean z) {
        smo smoVar;
        synchronized (smo.class) {
            try {
                if (q == null) {
                    en0 x = en0.x(context, executor, z);
                    hpo K = hpo.K(context);
                    lso a = lso.a(context, executor);
                    cso csoVar = new cso();
                    hro hroVar = new hro();
                    qpn qpnVar = new qpn(context, executor, x, new jzo());
                    qpnVar.e = Tasks.call(executor, new q7o(qpnVar, 21)).addOnFailureListener(executor, new fjn(qpnVar, 27));
                    jro jroVar = new jro(context);
                    ng2 ng2Var = new ng2(czoVar, qpnVar, new kso(context, jroVar), jroVar, K, a, csoVar, hroVar);
                    int O = nq8.O(context, x);
                    xyo xyoVar = new xyo();
                    smo smoVar2 = new smo(context, x, new axn(context, O), new n72(context, O, new fjn(x, 22), ((Boolean) bwo.e.c.a(exo.b)).booleanValue()), new r0p(context, ng2Var, x, xyoVar), ng2Var, executor, xyoVar, O, a, csoVar);
                    q = smoVar2;
                    smoVar2.g();
                    q.h();
                }
                smoVar = q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return smoVar;
    }

    @Override // defpackage.pno
    public final String a(Context context, View view, Activity activity) {
        String g;
        lso lsoVar = this.j;
        if (lsoVar.d) {
            lsoVar.b = System.currentTimeMillis();
        }
        this.k.a(context, view);
        h();
        utn b = this.d.b();
        if (b == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (b) {
            ng2 ng2Var = (ng2) b.d;
            HashMap i = ng2Var.i();
            hro hroVar = (hro) ng2Var.h;
            List list = hroVar.a;
            hroVar.a = Collections.EMPTY_LIST;
            i.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, list);
            i.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
            i.put("ctx", context);
            i.put(C4324ta.b, null);
            i.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
            i.put("act", activity);
            g = utn.g(b.h(i));
        }
        this.f.A(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - currentTimeMillis, null, g, null);
        return g;
    }

    @Override // defpackage.pno
    public final void b(MotionEvent motionEvent) {
        utn b = this.d.b();
        if (b != null) {
            try {
                b.b(motionEvent);
            } catch (q0p e) {
                this.f.z(e.a, -1L, e);
            }
        }
    }

    @Override // defpackage.pno
    public final void c(View view) {
        ((kso) this.e.c).a(view);
    }

    @Override // defpackage.pno
    public final String d(Context context, String str, View view, Activity activity) {
        String g;
        lso lsoVar = this.j;
        if (lsoVar.d) {
            lsoVar.b = System.currentTimeMillis();
        }
        cso csoVar = this.k;
        csoVar.h = csoVar.g;
        csoVar.g = SystemClock.uptimeMillis();
        h();
        utn b = this.d.b();
        if (b == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (b) {
            ng2 ng2Var = (ng2) b.d;
            kso ksoVar = (kso) ng2Var.c;
            HashMap i = ng2Var.i();
            if (ksoVar.l <= -2) {
                WeakReference weakReference = ksoVar.h;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    ksoVar.l = -3L;
                }
            }
            i.put("lts", Long.valueOf(ksoVar.l));
            i.put(InneractiveMediationDefs.GENDER_FEMALE, a.q);
            i.put("ctx", context);
            i.put("cs", str);
            i.put(C4324ta.b, null);
            i.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
            i.put("act", activity);
            g = utn.g(b.h(i));
        }
        this.f.A(5000, System.currentTimeMillis() - currentTimeMillis, null, g, null);
        return g;
    }

    @Override // defpackage.pno
    public final void e(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) bwo.e.c.a(exo.x)).booleanValue() || (displayMetrics = this.a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        b(obtain);
        obtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        b(obtain2);
        obtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        b(obtain3);
        obtain3.recycle();
    }

    public final synchronized void g() {
        long currentTimeMillis = System.currentTimeMillis();
        p03 k = k();
        if (k == null) {
            this.f.y(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.d.a(k)) {
            this.o = true;
            this.i.countDown();
        }
    }

    public final void h() {
        p03 p03Var;
        if (this.n) {
            return;
        }
        synchronized (this.m) {
            try {
                if (!this.n) {
                    if ((System.currentTimeMillis() / 1000) - this.l < 3600) {
                        return;
                    }
                    r0p r0pVar = this.d;
                    synchronized (r0pVar.f) {
                        utn utnVar = r0pVar.e;
                        p03Var = utnVar != null ? (p03) utnVar.b : null;
                    }
                    if (p03Var == null || ((xuo) p03Var.b).u() - (System.currentTimeMillis() / 1000) < 3600) {
                        int i = this.p - 1;
                        if (i == 2 || i == 4 || i == 5 || i == 6 || i == 7) {
                            this.g.execute(new x3o(this, 29));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public final void i() {
        String str;
        String str2;
        int length;
        boolean e;
        long currentTimeMillis = System.currentTimeMillis();
        p03 k = k();
        if (k != null) {
            str = ((xuo) k.b).s();
            str2 = ((xuo) k.b).t();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.a;
                int i = this.p;
                en0 en0Var = this.f;
                zzoo L = aba.L(context, i, str, str2, en0Var);
                byte[] bArr = L.b;
                if (bArr == null || (length = bArr.length) == 0) {
                    en0Var.y(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        e8n v = g8n.v(0, length, bArr);
                        z8n z8nVar = z8n.b;
                        int i2 = o7n.a;
                        tuo v2 = tuo.v(v, z8n.c);
                        if (!v2.s().s().isEmpty() && !v2.s().t().isEmpty() && v2.u().x().length != 0) {
                            p03 k2 = k();
                            if (k2 != null) {
                                xuo xuoVar = (xuo) k2.b;
                                if (v2.s().s().equals(xuoVar.s())) {
                                    if (!v2.s().t().equals(xuoVar.t())) {
                                    }
                                }
                            }
                            mxn mxnVar = this.h;
                            int i3 = L.c;
                            if (!((Boolean) bwo.e.c.a(exo.a)).booleanValue()) {
                                e = this.b.e(v2, mxnVar);
                            } else if (i3 == 3) {
                                e = this.c.v(v2);
                            } else {
                                if (i3 == 4) {
                                    e = this.c.t(v2, mxnVar);
                                }
                                this.f.y(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (e) {
                                p03 k3 = k();
                                if (k3 != null) {
                                    if (this.d.a(k3)) {
                                        this.o = true;
                                    }
                                    this.l = System.currentTimeMillis() / 1000;
                                }
                            }
                            this.f.y(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        this.f.y(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.f.y(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (lan e2) {
                this.f.z(4002, System.currentTimeMillis() - currentTimeMillis, e2);
            }
            this.i.countDown();
        } catch (Throwable th) {
            this.i.countDown();
            throw th;
        }
    }

    public final p03 k() {
        int i = this.p - 1;
        if (i != 2 && i != 4 && i != 5 && i != 6 && i != 7) {
            return null;
        }
        if (!((Boolean) bwo.e.c.a(exo.a)).booleanValue()) {
            axn axnVar = this.b;
            xuo f = axnVar.f(1);
            if (f == null) {
                return null;
            }
            String s = f.s();
            File R = tba.R(axnVar.g(), s, "pcam.jar");
            if (!R.exists()) {
                R = tba.R(axnVar.g(), s, "pcam");
            }
            return new p03(f, R, tba.R(axnVar.g(), s, "pcbc"), tba.R(axnVar.g(), s, "pcopt"));
        }
        n72 n72Var = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (n72.g) {
            try {
                xuo H = n72Var.H(1);
                if (H == null) {
                    n72Var.F(4022, currentTimeMillis);
                    return null;
                }
                File z = n72Var.z(H.s());
                File file = new File(z, "pcam.jar");
                if (!file.exists()) {
                    file = new File(z, "pcam");
                }
                File file2 = new File(z, "pcbc");
                File file3 = new File(z, "pcopt");
                n72Var.F(5016, currentTimeMillis);
                return new p03(H, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pno
    public final boolean zze() {
        boolean z;
        synchronized (this) {
            z = this.o;
        }
        return z;
    }

    @Override // defpackage.pno
    public final boolean zzf() {
        boolean z;
        try {
            this.i.await();
        } catch (InterruptedException unused) {
        }
        synchronized (this) {
            z = this.o;
        }
        return z;
    }

    @Override // defpackage.pno
    public final String zzl(Context context) {
        String g;
        lso lsoVar = this.j;
        if (lsoVar.d) {
            lsoVar.b = System.currentTimeMillis();
        }
        cso csoVar = this.k;
        csoVar.b = csoVar.a;
        csoVar.a = SystemClock.uptimeMillis();
        h();
        utn b = this.d.b();
        if (b == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (b) {
            HashMap i = ((ng2) b.d).i();
            i.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
            i.put("ctx", context);
            i.put(C4324ta.b, null);
            g = utn.g(b.h(i));
        }
        this.f.A(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - currentTimeMillis, null, g, null);
        return g;
    }
}
