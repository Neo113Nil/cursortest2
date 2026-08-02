package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzid extends zzhv {
    final /* synthetic */ zzie zza;

    public zzid(zzie zzieVar) {
        Objects.requireNonNull(zzieVar);
        this.zza = zzieVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzie zzieVar = this.zza;
        zzhd.zzb(i, zzieVar.zzn(), "index");
        int i2 = i + i;
        Object obj = zzieVar.zzm()[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzieVar.zzm()[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final boolean zzf() {
        return true;
    }
}
