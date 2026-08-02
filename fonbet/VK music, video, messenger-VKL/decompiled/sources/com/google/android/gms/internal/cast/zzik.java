package com.google.android.gms.internal.cast;

import com.ironsource.X3;
import java.util.Iterator;
import xsna.tdj;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzik extends zzhz {
    final transient Object zza;

    public zzik(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.cast.zzhz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.cast.zzhz, com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzia(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        return tdj.a(new StringBuilder(String.valueOf(obj).length() + 2), X3.j.d, obj, X3.j.e);
    }

    @Override // com.google.android.gms.internal.cast.zzhz, com.google.android.gms.internal.cast.zzhr
    /* renamed from: zza */
    public final zzil iterator() {
        return new zzia(this.zza);
    }

    @Override // com.google.android.gms.internal.cast.zzhz, com.google.android.gms.internal.cast.zzhr
    public final zzhv zze() {
        int i = zzhv.zzd;
        Object[] objArr = {this.zza};
        zzib.zza(objArr, 1);
        return zzhv.zzk(objArr, 1);
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int zzg(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }
}
