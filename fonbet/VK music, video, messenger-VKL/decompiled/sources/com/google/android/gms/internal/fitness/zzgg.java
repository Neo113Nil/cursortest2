package com.google.android.gms.internal.fitness;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzgg extends zzga {
    private final transient zzfz zza;
    private final transient zzfw zzb;

    public zzgg(zzfz zzfzVar, zzfw zzfwVar) {
        this.zza = zzfzVar;
        this.zzb = zzfwVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzft, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.fitness.zzga, com.google.android.gms.internal.fitness.zzft, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.fitness.zzft
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.fitness.zzga, com.google.android.gms.internal.fitness.zzft
    /* renamed from: zzd */
    public final zzgm iterator() {
        return this.zzb.listIterator(0);
    }
}
