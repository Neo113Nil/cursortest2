package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgxu extends zzgvz {
    static final zzgvz zza = new zzgxu(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzgxu(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzgsw.zzm(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        return Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvz, com.google.android.gms.internal.ads.zzgvv
    final int zzg(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }
}
