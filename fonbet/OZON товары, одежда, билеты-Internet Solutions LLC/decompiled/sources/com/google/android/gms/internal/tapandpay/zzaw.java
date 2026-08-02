package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;

/* loaded from: classes9.dex */
final class zzaw<E> extends zzar<E> {
    final transient E zza;

    zzaw(E e11) {
        e11.getClass();
        this.zza = e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar, com.google.android.gms.internal.tapandpay.zzan, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzas(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zza(Object[] objArr, int i11) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar, com.google.android.gms.internal.tapandpay.zzan
    /* renamed from: zzd */
    public final zzax<E> iterator() {
        return new zzas(this.zza);
    }
}
