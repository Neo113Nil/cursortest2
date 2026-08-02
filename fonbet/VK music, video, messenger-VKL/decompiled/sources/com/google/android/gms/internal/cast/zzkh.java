package com.google.android.gms.internal.cast;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzkh extends AbstractSet {
    final int zza;
    final /* synthetic */ zzki zzb;

    public zzkh(zzki zzkiVar, int i) {
        Objects.requireNonNull(zzkiVar);
        this.zzb = zzkiVar;
        this.zza = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb(), zza(), zzb(), obj, this.zza == -1 ? zzki.zza : zzkk.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzkg(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzb() - zza();
    }

    public final int zza() {
        if (this.zza == -1) {
            return 0;
        }
        return this.zzb.zzc()[0];
    }

    public final int zzb() {
        return this.zzb.zzc()[this.zza + 1];
    }
}
