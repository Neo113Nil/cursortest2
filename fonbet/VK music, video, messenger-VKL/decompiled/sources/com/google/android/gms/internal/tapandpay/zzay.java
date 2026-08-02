package com.google.android.gms.internal.tapandpay;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzay<E> extends zzas<E> {
    private final transient E zza;
    private transient int zzb;

    public zzay(E e) {
        this.zza = (E) zzak.zza(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zza.hashCode();
        this.zzb = hashCode;
        return hashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas
    public final boolean zza() {
        return this.zzb != 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas, com.google.android.gms.internal.tapandpay.zzao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: zzb */
    public final zzax<E> iterator() {
        return new zzar(this.zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas
    public final zzan<E> zzg() {
        return zzan.zza(this.zza);
    }

    public zzay(E e, int i) {
        this.zza = e;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final int zzb(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }
}
