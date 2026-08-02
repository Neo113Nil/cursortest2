package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import defpackage.bf3;
import defpackage.dtn;
import defpackage.fc6;
import defpackage.fsn;
import defpackage.mpi;
import defpackage.wt3;
import defpackage.zsn;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzckb extends zzcjs implements zzchv {
    public zzcku d;
    public String e;
    public boolean f;
    public boolean g;
    public zzcjk h;
    public long i;
    public long j;

    public static String r(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(wt3.h(str.length(), 1, String.valueOf(canonicalName).length(), 1, String.valueOf(message).length()));
        bf3.v(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void a(long j, boolean z) {
        zzcif zzcifVar = (zzcif) this.c.get();
        if (zzcifVar != null) {
            zzcgj.f.execute(new zsn(zzcifVar, z, j, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void c(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void d(IOException iOException) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzj("Precache exception", iOException);
        com.google.android.gms.ads.internal.zzt.zzh().e("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean g(String str) {
        return h(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean h(String str, String[] strArr) {
        String str2;
        String str3;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        zzckb zzckbVar = this;
        String str4 = str;
        zzckbVar.e = str4;
        String concat = "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str4)));
        String str5 = " ms";
        String str6 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzckbVar.d.y(uriArr, zzckbVar.b);
            zzcif zzcifVar = (zzcif) zzckbVar.c.get();
            if (zzcifVar != null) {
                zzcifVar.D(concat, zzckbVar);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long a = zzk.a();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r0)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q0)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue();
            long j8 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzk.a() - a > longValue2) {
                            String str7 = str6;
                            long j9 = longValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 27);
                            sb.append(str7);
                            sb.append(j9);
                            sb.append(str5);
                            throw new IOException(sb.toString());
                        }
                        if (zzckbVar.f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzckbVar.g) {
                            return true;
                        }
                        if (!zzckbVar.d.p()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long c = zzckbVar.d.i.c();
                        if (c > 0) {
                            long e = zzckbVar.d.i.e();
                            if (e != j8) {
                                if (e > 0) {
                                    j7 = longValue;
                                    j5 = c;
                                    z = true;
                                } else {
                                    j7 = longValue;
                                    j5 = c;
                                    z = false;
                                }
                                long t = booleanValue ? zzckbVar.d.t() : -1L;
                                try {
                                    long u = booleanValue ? zzckbVar.d.u() : -1L;
                                    j2 = intValue;
                                    str2 = str5;
                                    str3 = str6;
                                    j4 = j7;
                                    j6 = e;
                                    j = longValue2;
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new dtn(zzckbVar, str4, concat, j6, j5, t, u, booleanValue ? zzckbVar.d.v() : -1L, z, zzchw.a.get(), zzchw.b.get()));
                                    j8 = j6;
                                } catch (Throwable th) {
                                    th = th;
                                    zzckbVar = this;
                                    str4 = str;
                                }
                            } else {
                                str2 = str5;
                                str3 = str6;
                                j4 = longValue;
                                j2 = intValue;
                                j5 = c;
                                j6 = e;
                                j = longValue2;
                            }
                            if (j6 >= j5) {
                                try {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new mpi(3, j5, this, str, concat));
                                    return true;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zzckbVar = this;
                                    str4 = str;
                                    concat = concat;
                                }
                            } else {
                                zzckbVar = this;
                                str4 = str;
                                if (zzckbVar.d.m >= j2 && j6 > 0) {
                                    return true;
                                }
                                j3 = j4;
                            }
                        } else {
                            str2 = str5;
                            str3 = str6;
                            j = longValue2;
                            j2 = intValue;
                            j3 = longValue;
                        }
                        try {
                            zzckbVar.wait(j3);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                throw th;
                longValue = j3;
                longValue2 = j;
                intValue = j2;
                str5 = str2;
                str6 = str3;
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            String o = fc6.o(new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str4, " Exception: ", message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi(o);
            com.google.android.gms.ads.internal.zzt.zzh().e("VideoStreamExoPlayerCache.preload", e2);
            zzckbVar.release();
            zzckbVar.p(str4, concat, "error", r("error", e2));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean i(String str, String[] strArr, zzcjk zzcjkVar) {
        this.e = str;
        this.h = zzcjkVar;
        String concat = "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.d.y(uriArr, this.b);
            zzcif zzcifVar = (zzcif) this.c.get();
            if (zzcifVar != null) {
                zzcifVar.D(concat, this);
            }
            this.i = com.google.android.gms.ads.internal.zzt.zzk().a();
            this.j = -1L;
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new fsn(this, 4), 0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String o = fc6.o(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi(o);
            com.google.android.gms.ads.internal.zzt.zzh().e("VideoStreamExoPlayerCache.preload", e);
            release();
            p(str, concat, "error", r("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void j(int i) {
        this.d.s(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void k(int i) {
        this.d.r(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void l(int i) {
        this.d.C(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void n(int i) {
        this.d.D(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void o() {
        synchronized (this) {
            this.f = true;
            notify();
            release();
        }
        String str = this.e;
        if (str != null) {
            p(this.e, "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str))), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcku zzckuVar = this.d;
        if (zzckuVar != null) {
            zzckuVar.l = null;
            zzckuVar.A();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void b(int i, int i2) {
    }
}
