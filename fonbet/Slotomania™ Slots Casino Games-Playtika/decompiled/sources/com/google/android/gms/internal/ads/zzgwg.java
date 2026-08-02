package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgwg extends zzgvv {
    private final transient zzgwh zza;

    zzgwg(zzgwh zzgwhVar) {
        this.zza = zzgwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwe(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    /* renamed from: zza */
    public final zzgyn iterator() {
        return new zzgwe(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgvv
    final int zzg(Object[] objArr, int i) {
        zzgyo listIterator = ((zzgvz) this.zza.map.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((zzgvv) listIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}
