package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzgvd extends AbstractSet {
    final /* synthetic */ zzgvg zza;

    /* synthetic */ zzgvd(zzgvg zzgvgVar, byte[] bArr) {
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgvg zzgvgVar = this.zza;
        Map zzc = zzgvgVar.zzc();
        return zzc != null ? zzc.keySet().iterator() : new zzguy(zzgvgVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        zzgvg zzgvgVar = this.zza;
        Map zzc = zzgvgVar.zzc();
        if (zzc != null) {
            return zzc.keySet().remove(obj);
        }
        Object zzj = zzgvgVar.zzj(obj);
        obj2 = zzgvg.zzd;
        return zzj != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
