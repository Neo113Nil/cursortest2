package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzakl implements zzao {
    public final float zza;
    public final zzakk zzb;
    public final zzakk zzc;

    private zzakl(float f, zzakk zzakkVar, zzakk zzakkVar2) {
        this.zza = f;
        this.zzb = zzakkVar;
        this.zzc = zzakkVar2;
    }

    public static zzakl zzb(float f, int i, int i2) {
        zzakk zza = zzakk.zza(i);
        zzakk zza2 = zzakk.zza(i2);
        if (f <= 0.0f && zza == null && zza2 == null) {
            return null;
        }
        return new zzakl(f, zza, zza2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakl)) {
            return false;
        }
        zzakl zzaklVar = (zzakl) obj;
        return Float.compare(this.zza, zzaklVar.zza) == 0 && Objects.equals(this.zzb, zzaklVar.zzb) && Objects.equals(this.zzc, zzaklVar.zzc);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.zza) * 31;
        zzakk zzakkVar = this.zzb;
        int hashCode2 = (hashCode + (zzakkVar != null ? zzakkVar.hashCode() : 0)) * 31;
        zzakk zzakkVar2 = this.zzc;
        return hashCode2 + (zzakkVar2 != null ? zzakkVar2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        float f = this.zza;
        int length = String.valueOf(f).length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf).length() + 10 + String.valueOf(valueOf2).length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f);
        sb.append(", field 1=");
        sb.append(valueOf);
        sb.append(", field 2=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
