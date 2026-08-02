package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcig {
    public static final boolean r;
    public final Context a;
    public final String b;
    public final VersionInfoParcel c;
    public final zzbjs d;
    public final zzbjv e;
    public final com.google.android.gms.ads.internal.util.zzbf f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public zzchl n;
    public boolean o;
    public boolean p;
    public long q;

    static {
        r = com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.se)).intValue();
    }

    public zzcig(Context context, VersionInfoParcel versionInfoParcel, String str, zzbjv zzbjvVar, zzbjs zzbjsVar) {
        com.google.android.gms.ads.internal.util.zzbe zzbeVar = new com.google.android.gms.ads.internal.util.zzbe();
        zzbeVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbeVar.zza("1_5", 1.0d, 5.0d);
        zzbeVar.zza("5_10", 5.0d, 10.0d);
        zzbeVar.zza("10_20", 10.0d, 20.0d);
        zzbeVar.zza("20_30", 20.0d, 30.0d);
        zzbeVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f = zzbeVar.zzb();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = versionInfoParcel;
        this.b = str;
        this.e = zzbjvVar;
        this.d = zzbjsVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t0);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        int length = split.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void a(zzchl zzchlVar) {
        zzbjs zzbjsVar = this.d;
        zzbjv zzbjvVar = this.e;
        zzbjn.a(zzbjvVar, zzbjsVar, "vpc2");
        this.i = true;
        zzbjvVar.c("vpn", zzchlVar.h());
        this.n = zzchlVar;
    }

    public final void b() {
        if (!r || this.o) {
            return;
        }
        Bundle f = bf3.f("type", "native-player-metrics");
        f.putString("request", this.b);
        f.putString(SearchResponseKt.PLAYER_ENTITY, this.n.h());
        for (com.google.android.gms.ads.internal.util.zzbd zzbdVar : this.f.zzb()) {
            String str = zzbdVar.zza;
            String valueOf = String.valueOf(str);
            f.putString("fps_c_".concat(valueOf), Integer.toString(zzbdVar.zze));
            String valueOf2 = String.valueOf(str);
            f.putString("fps_p_".concat(valueOf2), Double.toString(zzbdVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.g;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzc().zzg(this.a, this.c.afmaVersion, "gmob-apps", f, true);
                this.o = true;
                return;
            }
            String str2 = this.h[i];
            if (str2 != null) {
                Long valueOf3 = Long.valueOf(jArr[i]);
                new StringBuilder(valueOf3.toString().length() + 3);
                f.putString("fh_".concat(valueOf3.toString()), str2);
            }
            i++;
        }
    }

    public final void c(zzchl zzchlVar) {
        if (this.k && !this.l) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.l) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbjn.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long b = com.google.android.gms.ads.internal.zzt.zzk().b();
        if (this.m && this.p) {
            if (this.q != -1) {
                this.f.zza(1.0E9d / (b - r6));
            }
        }
        this.p = this.m;
        this.q = b;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u0)).longValue();
        long o = zzchlVar.o();
        int i = 0;
        while (true) {
            String[] strArr = this.h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(o - this.g[i])) {
                int i2 = 8;
                Bitmap bitmap = zzchlVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }

    public final void d() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        zzbjn.a(this.e, this.d, "vfp2");
        this.k = true;
    }
}
