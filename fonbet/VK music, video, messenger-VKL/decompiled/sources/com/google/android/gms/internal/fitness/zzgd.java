package com.google.android.gms.internal.fitness;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzgd extends zzfw {
    static final zzfw zza = new zzgd(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzgd(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfo.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fitness.zzfw, com.google.android.gms.internal.fitness.zzft
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fitness.zzft
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fitness.zzft
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fitness.zzft
    public final Object[] zze() {
        return this.zzb;
    }
}
