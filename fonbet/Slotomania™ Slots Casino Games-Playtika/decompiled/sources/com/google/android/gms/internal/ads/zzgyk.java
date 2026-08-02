package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgyk extends zzgwj {
    final transient Object zza;

    zzgyk(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwr(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append(X3.j.d);
        sb.append(obj);
        sb.append(X3.j.e);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv
    /* renamed from: zza */
    public final zzgyn iterator() {
        return new zzgwr(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv
    public final zzgvz zze() {
        return zzgvz.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }
}
