package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzgvf extends AbstractCollection {
    final /* synthetic */ zzgvg zza;

    /* synthetic */ zzgvf(zzgvg zzgvgVar, byte[] bArr) {
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgvg zzgvgVar = this.zza;
        Map zzc = zzgvgVar.zzc();
        return zzc != null ? zzc.values().iterator() : new zzgva(zzgvgVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
