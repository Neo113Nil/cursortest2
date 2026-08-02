package com.google.android.gms.internal.gtm;

import U7.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zzwu<E> extends zzsj<E> implements RandomAccess {
    private static final zzwu<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzwu<Object> zzwuVar = new zzwu<>(new Object[0], 0);
        zza = zzwuVar;
        zzwuVar.zzb();
    }

    zzwu() {
        this(new Object[10], 0);
    }

    public static <E> zzwu<E> zze() {
        return (zzwu<E>) zza;
    }

    private final String zzf(int i11) {
        int i12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i11);
        sb2.append(", Size:");
        sb2.append(i12);
        return sb2.toString();
    }

    private final void zzg(int i11) {
        if (i11 < 0 || i11 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i11));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        int i12;
        zza();
        if (i11 < 0 || i11 > (i12 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i11));
        }
        E[] eArr = this.zzb;
        if (i12 < eArr.length) {
            System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
        } else {
            E[] eArr2 = (E[]) new Object[i.a(i12, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i11);
            System.arraycopy(this.zzb, i11, eArr2, i11 + 1, this.zzc - i11);
            this.zzb = eArr2;
        }
        this.zzb[i11] = e11;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        zzg(i11);
        return this.zzb[i11];
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final E remove(int i11) {
        zza();
        zzg(i11);
        E[] eArr = this.zzb;
        E e11 = eArr[i11];
        if (i11 < this.zzc - 1) {
            System.arraycopy(eArr, i11 + 1, eArr, i11, (r2 - i11) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        zza();
        zzg(i11);
        E[] eArr = this.zzb;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzvh
    public final /* bridge */ /* synthetic */ zzvh zzd(int i11) {
        if (i11 >= this.zzc) {
            return new zzwu(Arrays.copyOf(this.zzb, i11), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzwu(E[] eArr, int i11) {
        this.zzb = eArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e11) {
        zza();
        int i11 = this.zzc;
        E[] eArr = this.zzb;
        if (i11 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i11 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        eArr2[i12] = e11;
        ((AbstractList) this).modCount++;
        return true;
    }
}
