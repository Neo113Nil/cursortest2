package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzazl;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfzf;
import com.google.android.gms.internal.ads.zzfzz;
import com.google.android.gms.internal.ads.zzhcy;
import defpackage.gln;
import defpackage.sao;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzk implements Runnable, zzbay {
    public static final long p = System.currentTimeMillis();
    public boolean d;
    public final boolean e;
    public final boolean f;
    public final ExecutorService g;
    public final zzfyi h;
    public Context i;
    public final Context j;
    public VersionInfoParcel k;
    public final VersionInfoParcel l;
    public final boolean m;
    public int o;
    public final Vector a = new Vector();
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final CountDownLatch n = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.i = context;
        this.j = context;
        this.k = versionInfoParcel;
        this.l = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.g = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.s3)).booleanValue();
        this.m = booleanValue;
        this.h = zzfyi.a(context, newCachedThreadPool, booleanValue);
        this.e = ((Boolean) zzba.zzc().a(zzbjg.p3)).booleanValue();
        this.f = ((Boolean) zzba.zzc().a(zzbjg.t3)).booleanValue();
        if (((Boolean) zzba.zzc().a(zzbjg.r3)).booleanValue()) {
            this.o = 2;
        } else {
            this.o = 1;
        }
        if (!((Boolean) zzba.zzc().a(zzbjg.x4)).booleanValue()) {
            this.d = a();
        }
        if (((Boolean) zzba.zzc().a(zzbjg.t4)).booleanValue()) {
            zzcgj.a.execute(this);
            return;
        }
        zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            zzcgj.a.execute(this);
        } else {
            run();
        }
    }

    public static final zzbav e(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzbav d;
        zzaxb H = zzaxc.H();
        H.n();
        ((zzaxc) H.b).J(z);
        String str = versionInfoParcel.afmaVersion;
        H.n();
        ((zzaxc) H.b).I(str);
        zzaxc zzaxcVar = (zzaxc) H.o();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (zzbav.class) {
            sao saoVar = new sao();
            saoVar.b = false;
            byte b = (byte) (saoVar.f | 1);
            saoVar.c = true;
            saoVar.d = 100L;
            saoVar.e = 300L;
            saoVar.f = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
            String D = zzaxcVar.D();
            if (D == null) {
                throw new NullPointerException("Null clientVersion");
            }
            saoVar.a = D;
            saoVar.b = zzaxcVar.E();
            saoVar.f = (byte) (saoVar.f | 1);
            d = zzbav.d(context, Executors.newCachedThreadPool(), saoVar.a(), z2);
        }
        return d;
    }

    public final boolean a() {
        Context context = this.i;
        zzh zzhVar = new zzh(this);
        zzfzz zzfzzVar = new zzfzz(context, zzfzf.b(context, this.h), zzhVar, ((Boolean) zzba.zzc().a(zzbjg.q3)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzfzz.f) {
            try {
                zzber f = zzfzzVar.f(1);
                if (f == null) {
                    zzfzzVar.e(4025, currentTimeMillis);
                    return false;
                }
                File c = zzfzzVar.c(f.D());
                if (!new File(c, "pcam.jar").exists()) {
                    zzfzzVar.e(4026, currentTimeMillis);
                    return false;
                }
                if (new File(c, "pcbc").exists()) {
                    zzfzzVar.e(5019, currentTimeMillis);
                    return true;
                }
                zzfzzVar.e(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        zzbay d = d();
        Vector vector = this.a;
        if (vector.isEmpty() || d == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            try {
                int length = objArr.length;
                if (length == 1) {
                    d.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    d.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void c(boolean z) {
        String str = this.k.afmaVersion;
        Context context = this.i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        zzaxb H = zzaxc.H();
        H.n();
        ((zzaxc) H.b).J(z);
        H.n();
        ((zzaxc) H.b).I(str);
        zzbba zzbbaVar = new zzbba((zzaxc) H.o());
        synchronized (zzbbb.class) {
            if (!zzbbb.y) {
                zzbbb.z = System.currentTimeMillis() / 1000;
                zzbaz.u = zzbbb.h(context, zzbbaVar.a);
                zzbbb.A = zzbbj.a(context);
                ExecutorService executorService = zzbaz.u.b;
                zzbbb.B = zzbcp.a(context, executorService);
                zzbbb.C = new zzbch();
                zzbbg zzbbgVar = new zzbbg(context, executorService);
                zzbbb.E = zzbbgVar;
                zzbbb.D = new zzbaa(context, executorService, zzbbaVar.c, zzbbgVar);
                zzbbb.y = true;
            }
        }
        this.b.set(new zzbbc(context, zzbbaVar));
    }

    public final zzbay d() {
        return ((!this.e || this.d) ? this.o : 1) == 2 ? (zzbay) this.c.get() : (zzbay) this.b.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            if (((Boolean) zzba.zzc().a(zzbjg.x4)).booleanValue()) {
                this.d = a();
            }
            boolean z2 = this.k.isClientJar;
            final boolean z3 = false;
            if (!((Boolean) zzba.zzc().a(zzbjg.N1)).booleanValue() && z2) {
                z3 = true;
            }
            if (((!this.e || this.d) ? this.o : 1) == 1) {
                c(z3);
                if (this.o == 2) {
                    this.g.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzk zzkVar = zzk.this;
                            boolean z4 = z3;
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                zzk.e(zzkVar.j, zzkVar.l, z4, zzkVar.m).b();
                            } catch (NullPointerException e) {
                                zzkVar.h.c(2027, System.currentTimeMillis() - currentTimeMillis, e);
                            }
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzbav e = e(this.i, this.k, z3, this.m);
                    this.c.set(e);
                    if (this.f) {
                        synchronized (e) {
                            z = e.q;
                        }
                        if (!z) {
                            this.o = 1;
                            c(z3);
                        }
                    }
                } catch (NullPointerException e2) {
                    this.o = 1;
                    c(z3);
                    this.h.c(2031, System.currentTimeMillis() - currentTimeMillis, e2);
                }
            }
            this.n.countDown();
            this.i = null;
            this.k = null;
        } catch (Throwable th) {
            this.n.countDown();
            this.i = null;
            this.k = null;
            throw th;
        }
    }

    public final boolean zza() {
        try {
            this.n.await();
            return true;
        } catch (InterruptedException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzbay d;
        if (!zza() || (d = d()) == null) {
            return "";
        }
        b();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return d.zzl(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String zzc() {
        int i = this.o;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? "2" : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzd(MotionEvent motionEvent) {
        zzbay d = d();
        if (d == null) {
            this.a.add(new Object[]{motionEvent});
            return;
        }
        b();
        try {
            d.zzd(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zze(int i, int i2, int i3) {
        zzbay d = d();
        if (d == null) {
            this.a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            b();
            try {
                d.zze(i, i2, i3);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zza()) {
            return "";
        }
        zzbay d = d();
        if (((Boolean) zzba.zzc().a(zzbjg.nc)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, 4, null);
        }
        if (d == null) {
            return "";
        }
        b();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return d.zzf(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzh(View view) {
        zzbay d = d();
        if (d != null) {
            try {
                d.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbay d;
        zzbay d2;
        try {
            if (((Boolean) zzba.zzc().a(zzbjg.M3)).booleanValue()) {
                if (this.n.getCount() != 0 || (d2 = d()) == null) {
                    return;
                }
                d2.zzi(stackTraceElementArr);
                return;
            }
            if (!zza() || (d = d()) == null) {
                return;
            }
            d.zzi(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) zzba.zzc().a(zzbjg.mc)).booleanValue()) {
                zzbay d = d();
                if (((Boolean) zzba.zzc().a(zzbjg.nc)).booleanValue()) {
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
                }
                return d != null ? d.zzj(context, view, activity) : "";
            }
            if (!zza()) {
                return "";
            }
            zzbay d2 = d();
            if (((Boolean) zzba.zzc().a(zzbjg.nc)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
            }
            return d2 != null ? d2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(final Context context) {
        try {
            return (String) zzhcy.c(this.g, new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzk.this.zzb(context, null);
                }
            }).get(((Integer) zzba.zzc().a(zzbjg.G3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.l.afmaVersion;
            long j = p;
            try {
                zzazl D = zzazm.D();
                D.n();
                ((zzazm) D.b).F(str);
                D.n();
                ((zzazm) D.b).E("0.828153725");
                String packageName = context.getPackageName();
                D.n();
                ((zzazm) D.b).H(packageName);
                long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                D.n();
                ((zzazm) D.b).J(currentTimeMillis);
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                D.n();
                ((zzazm) D.b).G(currentTimeMillis2);
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    D.n();
                    ((zzazm) D.b).I(j2);
                } catch (PackageManager.NameNotFoundException unused3) {
                    D.n();
                    ((zzazm) D.b).I(-1L);
                }
                zzazs b = gln.b(null, ((zzazm) D.o()).d());
                b.n();
                ((zzazt) b.b).G(5);
                b.n();
                ((zzazt) b.b).H(2);
                return Base64.encodeToString(((zzazt) b.o()).d(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        return zzb(context, null);
    }
}
