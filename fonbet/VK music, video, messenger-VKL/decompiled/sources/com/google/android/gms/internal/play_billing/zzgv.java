package com.google.android.gms.internal.play_billing;

import com.facebook.soloader.MinElf;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes12.dex */
final class zzgv {
    private final Object zza;
    private final int zzb;

    public zzgv(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgv)) {
            return false;
        }
        zzgv zzgvVar = (zzgv) obj;
        return this.zza == zzgvVar.zza && this.zzb == zzgvVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * MinElf.PN_XNUM) + this.zzb;
    }
}
