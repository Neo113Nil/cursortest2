package com.google.android.gms.internal.tapandpay;

/* loaded from: classes9.dex */
final class zzap extends zzaq {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaq zzc;

    zzap(zzaq zzaqVar, int i11, int i12) {
        this.zzc = zzaqVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzaj.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq, java.util.List
    /* renamed from: zzf */
    public final zzaq subList(int i11, int i12) {
        zzaj.zzc(i11, i12, this.zzb);
        zzaq zzaqVar = this.zzc;
        int i13 = this.zza;
        return zzaqVar.subList(i11 + i13, i12 + i13);
    }
}
