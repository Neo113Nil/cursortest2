package com.google.android.gms.internal.tapandpay;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzat<E> extends zzan<E> {
    static final zzan<Object> zza = new zzat(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzat(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzak.zza(i, this.zzc);
        return (E) this.zzb[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan, com.google.android.gms.internal.tapandpay.zzao
    public final int zzb(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final Object[] zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final int zzf() {
        return this.zzc;
    }
}
