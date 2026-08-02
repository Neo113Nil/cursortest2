package com.google.android.gms.internal.fido;

/* loaded from: classes9.dex */
final class zzca extends zzcc {
    private final transient zzcc zza;

    zzca(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    private final int zzl(int i11) {
        return (this.zza.size() - 1) - i11;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbm.zza(i11, this.zza.size(), "index");
        return this.zza.get(zzl(i11));
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzl(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzl(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzcc subList(int i11, int i12) {
        zzbm.zze(i11, i12, this.zza.size());
        zzcc zzccVar = this.zza;
        return zzccVar.subList(zzccVar.size() - i12, this.zza.size() - i11).zzf();
    }
}
