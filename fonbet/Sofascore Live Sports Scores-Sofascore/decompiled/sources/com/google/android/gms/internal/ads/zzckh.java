package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import defpackage.d1l;
import defpackage.ddb;
import defpackage.is8;
import defpackage.x5n;
import defpackage.zmn;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzckh extends zzhk {
    public final Context e;
    public final zzhs f;
    public final d1l g;
    public final String h;
    public final int i;
    public final boolean j;
    public InputStream k;
    public boolean l;
    public Uri m;
    public volatile zzbhr n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public ddb t;
    public final AtomicLong u;

    public zzckh(Context context, zzhs zzhsVar, String str, int i, zziq zziqVar, d1l d1lVar) {
        super(false);
        this.e = context;
        this.f = zzhsVar;
        this.g = d1lVar;
        this.h = str;
        this.i = i;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = 0L;
        this.u = new AtomicLong(-1L);
        this.t = null;
        this.j = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue();
        c(zziqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    @Override // com.google.android.gms.internal.ads.zzhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zzhw zzhwVar) {
        zzbho zzbhoVar;
        boolean z;
        long j;
        long elapsedRealtime;
        StringBuilder sb;
        zzbid zzbidVar;
        if (this.l) {
            is8.e("Attempt to open an already open GcacheDataSource.");
            return 0L;
        }
        boolean z2 = true;
        this.l = true;
        Uri uri = zzhwVar.a;
        this.m = uri;
        boolean z3 = this.j;
        if (!z3) {
            l(zzhwVar);
        }
        this.n = zzbhr.Y0(uri);
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s5)).booleanValue();
        zzbhr zzbhrVar = this.n;
        if (!booleanValue) {
            if (zzbhrVar != null) {
                this.n.h = zzhwVar.c;
                zzbhr zzbhrVar2 = this.n;
                String str = this.h;
                zzbhrVar2.i = str != null ? str : "";
                this.n.j = this.i;
                zzbhoVar = com.google.android.gms.ads.internal.zzt.zzj().b(this.n);
            } else {
                zzbhoVar = null;
            }
            if (zzbhoVar != null && zzbhoVar.zza()) {
                synchronized (zzbhoVar) {
                    z = zzbhoVar.b;
                }
                this.o = z;
                this.q = zzbhoVar.Z0();
                this.r = zzbhoVar.zze();
                synchronized (zzbhoVar) {
                    j = zzbhoVar.d;
                }
                this.s = j;
                this.p = true;
                if (!o()) {
                    this.k = zzbhoVar.Y0();
                    if (this.j) {
                        l(zzhwVar);
                    }
                    return -1L;
                }
            }
        } else if (zzbhrVar != null) {
            this.n.h = zzhwVar.c;
            zzbhr zzbhrVar3 = this.n;
            String str2 = this.h;
            zzbhrVar3.i = str2 != null ? str2 : "";
            this.n.j = this.i;
            long longValue = (this.n.g ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u5) : (Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t5)).longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            zmn a = zzbic.a(this.e, this.n);
            try {
                try {
                    zzbidVar = (zzbid) a.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z2 = z3;
                }
            } catch (InterruptedException unused) {
                z3 = false;
            } catch (ExecutionException | TimeoutException unused2) {
                z3 = false;
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
            }
            try {
                this.o = zzbidVar.b;
                this.q = zzbidVar.c;
                this.r = zzbidVar.e;
                this.s = zzbidVar.d;
            } catch (InterruptedException unused3) {
                z3 = true;
                a.cancel(true);
                Thread.currentThread().interrupt();
                elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.g.m(elapsedRealtime, z3);
                this.p = z3;
                sb = new StringBuilder(x5n.f(24, elapsedRealtime));
                sb.append("Cache connection took ");
                sb.append(elapsedRealtime);
                sb.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                this.p = false;
                if (this.n != null) {
                }
                return this.f.a(zzhwVar);
            } catch (ExecutionException | TimeoutException unused4) {
                z3 = true;
                a.cancel(true);
                elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.g.m(elapsedRealtime, z3);
                this.p = z3;
                sb = new StringBuilder(x5n.f(24, elapsedRealtime));
                sb.append("Cache connection took ");
                sb.append(elapsedRealtime);
                sb.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                this.p = false;
                if (this.n != null) {
                }
                return this.f.a(zzhwVar);
            } catch (Throwable th3) {
                th = th3;
                long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.g.m(elapsedRealtime3, z2);
                this.p = z2;
                StringBuilder sb2 = new StringBuilder(x5n.f(24, elapsedRealtime3));
                sb2.append("Cache connection took ");
                sb2.append(elapsedRealtime3);
                sb2.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                throw th;
            }
            if (!o()) {
                this.k = zzbidVar.a;
                if (z3) {
                    l(zzhwVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.g.m(elapsedRealtime4, true);
                this.p = true;
                StringBuilder sb3 = new StringBuilder(x5n.f(24, elapsedRealtime4));
                sb3.append("Cache connection took ");
                sb3.append(elapsedRealtime4);
                sb3.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
            this.g.m(elapsedRealtime5, true);
            this.p = true;
            sb = new StringBuilder(x5n.f(24, elapsedRealtime5));
            sb.append("Cache connection took ");
            sb.append(elapsedRealtime5);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        this.p = false;
        if (this.n != null) {
            zzhv zzhvVar = new zzhv(zzhwVar);
            zzhvVar.a = Uri.parse(this.n.a);
            zzhwVar = zzhvVar.a();
        }
        return this.f.a(zzhwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (!this.l) {
            is8.e("Attempt to read closed GcacheDataSource.");
            return 0;
        }
        InputStream inputStream = this.k;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f.b(i, i2, bArr);
        if (this.j && this.k == null) {
            return read;
        }
        m(read);
        return read;
    }

    public final boolean o() {
        if (!this.j) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v5)).booleanValue() || this.q) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w5)).booleanValue() && !this.r;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        if (!this.l) {
            is8.e("Attempt to close an already closed GcacheDataSource.");
            return;
        }
        this.l = false;
        this.m = null;
        boolean z = (this.j && this.k == null) ? false : true;
        InputStream inputStream = this.k;
        if (inputStream != null) {
            IOUtils.a(inputStream);
            this.k = null;
        } else {
            this.f.zzd();
        }
        if (z) {
            n();
        }
    }
}
