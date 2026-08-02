package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbd {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbd(String str, double d, double d2, double d3, int i) {
        this.zza = str;
        this.zzc = d;
        this.zzb = d2;
        this.zzd = d3;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return Objects.a(this.zza, zzbdVar.zza) && this.zzb == zzbdVar.zzb && this.zzc == zzbdVar.zzc && this.zze == zzbdVar.zze && Double.compare(this.zzd, zzbdVar.zzd) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.zza, "name");
        toStringHelper.a(Double.valueOf(this.zzc), "minBound");
        toStringHelper.a(Double.valueOf(this.zzb), "maxBound");
        toStringHelper.a(Double.valueOf(this.zzd), "percent");
        toStringHelper.a(Integer.valueOf(this.zze), "count");
        return toStringHelper.toString();
    }
}
