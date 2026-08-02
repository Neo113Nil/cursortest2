package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;

/* loaded from: classes9.dex */
final class zzav<E> extends zzar<E> {
    static final zzav<Object> zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzav<>(objArr, 0, objArr, 0, 0);
    }

    zzav(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.zzb = objArr;
        this.zze = i11;
        this.zzc = objArr2;
        this.zzf = i12;
        this.zzg = i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zza2 = zzam.zza(obj.hashCode());
        while (true) {
            int i11 = zza2 & this.zzf;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zza2 = i11 + 1;
        }
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar, com.google.android.gms.internal.tapandpay.zzan, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zza(Object[] objArr, int i11) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar, com.google.android.gms.internal.tapandpay.zzan
    /* renamed from: zzd */
    public final zzax<E> iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar
    final zzaq<E> zzh() {
        return zzaq.zzh(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzar
    final boolean zzj() {
        return true;
    }
}
