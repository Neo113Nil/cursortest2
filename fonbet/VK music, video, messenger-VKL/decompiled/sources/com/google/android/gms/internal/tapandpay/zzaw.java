package com.google.android.gms.internal.tapandpay;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzaw<E> extends zzas<E> {
    static final zzaw<Object> zza = new zzaw<>(new Object[0], 0, null, 0, 0);
    private final transient Object[] zzb;
    private final transient Object[] zzc;
    private final transient int zzd;
    private final transient int zze;
    private final transient int zzf;

    public zzaw(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zzc = objArr2;
        this.zzd = i2;
        this.zze = i;
        this.zzf = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr == null) {
            return false;
        }
        int zza2 = zzal.zza(obj.hashCode());
        while (true) {
            int i = zza2 & this.zzd;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zza2 = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas, com.google.android.gms.internal.tapandpay.zzao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: zzb */
    public final zzax<E> iterator() {
        return (zzax) zzc().iterator();
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
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzas
    public final zzan<E> zzg() {
        return zzan.zza(this.zzb, this.zzf);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final int zzb(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzf);
        return this.zzf;
    }
}
