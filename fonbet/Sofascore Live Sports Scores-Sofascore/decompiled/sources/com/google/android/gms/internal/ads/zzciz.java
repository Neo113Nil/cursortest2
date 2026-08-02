package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import defpackage.is8;
import defpackage.zmn;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzciz implements zzhs {
    public final Context a;
    public final zzid b;
    public final String c;
    public final int d;
    public final boolean e;
    public InputStream f;
    public boolean g;
    public Uri h;
    public volatile zzbhr i;
    public boolean j = false;
    public boolean k = false;
    public zzhw l;

    public zzciz(Context context, zzid zzidVar, String str, int i) {
        this.a = context;
        this.b = zzidVar;
        this.c = str;
        this.d = i;
        new AtomicLong(-1L);
        this.e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        if (this.g) {
            is8.e("Attempt to open an already open CacheDataSource.");
            return 0L;
        }
        this.g = true;
        Uri uri = zzhwVar.a;
        this.h = uri;
        this.l = zzhwVar;
        this.i = zzbhr.Y0(uri);
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s5)).booleanValue();
        zzbhr zzbhrVar = this.i;
        zzbho zzbhoVar = null;
        if (!booleanValue) {
            if (zzbhrVar != null) {
                this.i.h = zzhwVar.c;
                zzbhr zzbhrVar2 = this.i;
                String str = this.c;
                zzbhrVar2.i = str != null ? str : "";
                this.i.j = this.d;
                zzbhoVar = com.google.android.gms.ads.internal.zzt.zzj().b(this.i);
            }
            if (zzbhoVar != null && zzbhoVar.zza()) {
                this.j = zzbhoVar.Z0();
                this.k = zzbhoVar.zze();
                if (!k()) {
                    this.f = zzbhoVar.Y0();
                    return -1L;
                }
            }
        } else if (zzbhrVar != null) {
            this.i.h = zzhwVar.c;
            zzbhr zzbhrVar3 = this.i;
            String str2 = this.c;
            zzbhrVar3.i = str2 != null ? str2 : "";
            this.i.j = this.d;
            long longValue = (this.i.g ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u5) : (Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t5)).longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            zmn a = zzbic.a(this.a, this.i);
            try {
                try {
                    zzbid zzbidVar = (zzbid) a.get(longValue, TimeUnit.MILLISECONDS);
                    boolean z = zzbidVar.b;
                    this.j = zzbidVar.c;
                    this.k = zzbidVar.e;
                    if (!k()) {
                        this.f = zzbidVar.a;
                    }
                } catch (InterruptedException unused) {
                    a.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    a.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.i != null) {
            zzhv zzhvVar = new zzhv(zzhwVar);
            zzhvVar.a = Uri.parse(this.i.a);
            this.l = zzhvVar.a();
        }
        return this.b.a(this.l);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (this.g) {
            InputStream inputStream = this.f;
            return inputStream != null ? inputStream.read(bArr, i, i2) : this.b.b(i, i2, bArr);
        }
        is8.e("Attempt to read closed CacheDataSource.");
        return 0;
    }

    public final boolean k() {
        if (!this.e) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v5)).booleanValue() || this.j) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w5)).booleanValue() && !this.k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        if (!this.g) {
            is8.e("Attempt to close an already closed CacheDataSource.");
            return;
        }
        this.g = false;
        this.h = null;
        InputStream inputStream = this.f;
        if (inputStream == null) {
            this.b.zzd();
        } else {
            IOUtils.a(inputStream);
            this.f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void c(zziq zziqVar) {
    }
}
