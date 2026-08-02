package com.google.android.gms.internal.location;

/* loaded from: classes9.dex */
final class zzdr extends zzds {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzds zzc;

    zzdr(zzds zzdsVar, int i11, int i12) {
        this.zzc = zzdsVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzdm.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.location.zzds, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzds subList(int i11, int i12) {
        zzdm.zzc(i11, i12, this.zzb);
        zzds zzdsVar = this.zzc;
        int i13 = this.zza;
        return zzdsVar.subList(i11 + i13, i12 + i13);
    }
}
