package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
public final class zzmq extends AbstractList implements RandomAccess, zzkr {
    private final zzkr zza;

    public zzmq(zzkr zzkrVar) {
        this.zza = zzkrVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((zzkq) this.zza).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzmp(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new zzmo(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final zzkr zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final Object zzf(int i11) {
        return this.zza.zzf(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final void zzi(zzjb zzjbVar) {
        throw new UnsupportedOperationException();
    }
}
