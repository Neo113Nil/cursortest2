package com.google.android.gms.internal.tapandpay;

/* loaded from: classes9.dex */
final class zzau<E> extends zzaq<E> {
    static final zzaq<Object> zza = new zzau(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzau(Object[] objArr, int i11) {
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final E get(int i11) {
        zzaj.zza(i11, this.zzc, "index");
        E e11 = (E) this.zzb[i11];
        e11.getClass();
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq, com.google.android.gms.internal.tapandpay.zzan
    final int zza(Object[] objArr, int i11) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final Object[] zze() {
        return this.zzb;
    }
}
