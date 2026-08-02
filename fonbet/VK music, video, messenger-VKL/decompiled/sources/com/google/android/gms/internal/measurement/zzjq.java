package com.google.android.gms.internal.measurement;

import com.facebook.soloader.MinElf;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes12.dex */
final class zzjq {
    private final Object zza;
    private final int zzb;

    public zzjq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return this.zza == zzjqVar.zza && this.zzb == zzjqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * MinElf.PN_XNUM) + this.zzb;
    }
}
