package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dpo;
import defpackage.ewm;
import defpackage.f2n;
import defpackage.mpo;
import defpackage.n72;
import defpackage.ohn;
import defpackage.q7o;
import defpackage.xao;
import defpackage.yln;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbav implements zzbay {
    public static zzbav r;
    public final Context a;
    public final zzfzs b;
    public final zzfzz c;
    public final zzgab d;
    public final yln e;
    public final zzfyi f;
    public final Executor g;
    public final zzbei h;
    public final ohn i;
    public final zzbcp k;
    public final zzbch l;
    public final zzbby m;
    public volatile boolean p;
    public volatile boolean q;
    public volatile long n = 0;
    public final Object o = new Object();
    public final CountDownLatch j = new CountDownLatch(1);

    public zzbav(Context context, zzfyi zzfyiVar, zzfzs zzfzsVar, zzfzz zzfzzVar, zzgab zzgabVar, yln ylnVar, Executor executor, zzfyd zzfydVar, zzbei zzbeiVar, zzbcp zzbcpVar, zzbch zzbchVar, zzbby zzbbyVar) {
        this.q = false;
        this.a = context;
        this.f = zzfyiVar;
        this.b = zzfzsVar;
        this.c = zzfzzVar;
        this.d = zzgabVar;
        this.e = ylnVar;
        this.g = executor;
        this.h = zzbeiVar;
        this.k = zzbcpVar;
        this.l = zzbchVar;
        this.m = zzbbyVar;
        this.q = false;
        this.i = new ohn(1, this, zzfydVar);
    }

    public static synchronized zzbav d(Context context, ExecutorService executorService, zzfyk zzfykVar, boolean z) {
        zzbav zzbavVar;
        synchronized (zzbav.class) {
            try {
                if (r == null) {
                    zzfyi a = zzfyi.a(context, executorService, z);
                    zzbbj a2 = zzbbj.a(context);
                    zzbcp a3 = zzbcp.a(context, executorService);
                    zzbch zzbchVar = new zzbch();
                    zzbby zzbbyVar = new zzbby();
                    zzfyy zzfyyVar = new zzfyy(context, executorService, a, new xao());
                    zzfyyVar.d = Tasks.call(executorService, new q7o(zzfyyVar, 10)).addOnFailureListener(executorService, new ohn(zzfyyVar, 20));
                    zzbbz zzbbzVar = new zzbbz(context);
                    yln ylnVar = new yln(zzfykVar, zzfyyVar, new zzbcn(context, zzbbzVar), zzbbzVar, a2, a3, zzbchVar, zzbbyVar);
                    zzbei b = zzfzf.b(context, a);
                    zzfyd zzfydVar = new zzfyd();
                    zzbav zzbavVar2 = new zzbav(context, a, new zzfzs(context, b), new zzfzz(context, b, new ewm(a, 5), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q3)).booleanValue()), new zzgab(context, ylnVar, a, zzfydVar, false), ylnVar, executorService, zzfydVar, b, a3, zzbchVar, zzbbyVar);
                    r = zzbavVar2;
                    zzbavVar2.a();
                    r.b();
                }
                zzbavVar = r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbavVar;
    }

    public final synchronized void a() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfzr e = e();
        if (e == null) {
            this.f.b(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.d.a(e)) {
            this.q = true;
            this.j.countDown();
        }
    }

    public final void b() {
        zzfzr zzfzrVar;
        if (this.p) {
            return;
        }
        synchronized (this.o) {
            try {
                if (!this.p) {
                    if ((System.currentTimeMillis() / 1000) - this.n < 3600) {
                        return;
                    }
                    zzgab zzgabVar = this.d;
                    synchronized (zzgabVar.g) {
                        try {
                            n72 n72Var = zzgabVar.f;
                            zzfzrVar = n72Var != null ? (zzfzr) n72Var.c : null;
                        } finally {
                        }
                    }
                    if ((zzfzrVar == null || zzfzrVar.a.F() - (System.currentTimeMillis() / 1000) < 3600) && zzfzf.a(this.h)) {
                        this.g.execute(new f2n(this, 11));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        String str;
        String str2;
        int length;
        boolean a;
        long currentTimeMillis = System.currentTimeMillis();
        zzfzr e = e();
        if (e != null) {
            str = e.a.D();
            str2 = e.a.E();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.a;
                zzbei zzbeiVar = this.h;
                zzfyi zzfyiVar = this.f;
                zzfzw a2 = zzfyr.a(context, zzbeiVar, str, str2, zzfyiVar);
                byte[] bArr = a2.b;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfyiVar.b(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        mpo B = zziei.B(0, length, bArr);
                        zziew zziewVar = zziew.b;
                        int i = dpo.a;
                        zzbek G = zzbek.G(B, zziew.c);
                        if (!G.D().D().isEmpty()) {
                            if (!G.D().E().isEmpty()) {
                                if (G.F().d().length != 0) {
                                    zzfzr e2 = e();
                                    if (e2 != null) {
                                        zzber zzberVar = e2.a;
                                        if (zzberVar != null) {
                                            if (G.D().D().equals(zzberVar.D())) {
                                                if (!G.D().E().equals(zzberVar.E())) {
                                                }
                                            }
                                        }
                                    }
                                    ohn ohnVar = this.i;
                                    int i2 = a2.c;
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o3)).booleanValue()) {
                                        a = this.b.a(G, ohnVar);
                                    } else if (i2 == 3) {
                                        a = this.c.b(G);
                                    } else {
                                        if (i2 == 4) {
                                            a = this.c.a(G, ohnVar);
                                        }
                                        this.f.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (a) {
                                        zzfzr e3 = e();
                                        if (e3 != null) {
                                            if (this.d.a(e3)) {
                                                this.q = true;
                                            }
                                            this.n = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.f.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.f.b(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.f.b(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (Throwable th) {
                this.j.countDown();
                throw th;
            }
        } catch (zzige e4) {
            this.f.c(4002, System.currentTimeMillis() - currentTimeMillis, e4);
        }
        this.j.countDown();
    }

    public final zzfzr e() {
        if (zzfzf.a(this.h)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o3)).booleanValue()) {
                zzfzz zzfzzVar = this.c;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (zzfzz.f) {
                    try {
                        zzber f = zzfzzVar.f(1);
                        if (f == null) {
                            zzfzzVar.e(4022, currentTimeMillis);
                            return null;
                        }
                        File c = zzfzzVar.c(f.D());
                        File file = new File(c, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(c, "pcam");
                        }
                        File file2 = new File(c, "pcbc");
                        File file3 = new File(c, "pcopt");
                        zzfzzVar.e(5016, currentTimeMillis);
                        return new zzfzr(f, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzfzs zzfzsVar = this.b;
            zzber b = zzfzsVar.b(1);
            if (b != null) {
                String D = b.D();
                File a = zzfzt.a(zzfzsVar.c(), D, "pcam.jar");
                if (!a.exists()) {
                    a = zzfzt.a(zzfzsVar.c(), D, "pcam");
                }
                return new zzfzr(b, a, zzfzt.a(zzfzsVar.c(), D, "pcbc"), zzfzt.a(zzfzsVar.c(), D, "pcopt"));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzd(MotionEvent motionEvent) {
        n72 b = this.d.b();
        if (b != null) {
            try {
                b.x(motionEvent);
            } catch (zzgaa e) {
                this.f.c(e.a, -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Gd)).booleanValue() || (displayMetrics = this.a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        zzd(obtain);
        obtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        zzd(obtain2);
        obtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        zzd(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzbcp zzbcpVar = this.k;
        if (zzbcpVar.d) {
            zzbcpVar.b = System.currentTimeMillis();
        }
        zzbch zzbchVar = this.l;
        zzbchVar.h = zzbchVar.g;
        zzbchVar.g = SystemClock.uptimeMillis();
        b();
        n72 b = this.d.b();
        if (b == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String w = b.w(context, str, view, activity);
        this.f.e(5000, System.currentTimeMillis() - currentTimeMillis, null, w, null);
        return w;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzh(View view) {
        this.e.c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.m.a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, View view, Activity activity) {
        zzbcp zzbcpVar = this.k;
        if (zzbcpVar.d) {
            zzbcpVar.b = System.currentTimeMillis();
        }
        this.l.a(context, view);
        b();
        n72 b = this.d.b();
        if (b == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String u = b.u(context, view, activity);
        this.f.e(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - currentTimeMillis, null, u, null);
        return u;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        zzbcp zzbcpVar = this.k;
        if (zzbcpVar.d) {
            zzbcpVar.b = System.currentTimeMillis();
        }
        zzbch zzbchVar = this.l;
        zzbchVar.b = zzbchVar.a;
        zzbchVar.a = SystemClock.uptimeMillis();
        b();
        n72 b = this.d.b();
        if (b == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String o = b.o(context);
        this.f.e(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - currentTimeMillis, null, o, null);
        return o;
    }
}
