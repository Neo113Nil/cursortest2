package com.google.android.gms.internal.tapandpay;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzap extends zzan {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzan zzc;

    public zzap(zzan zzanVar, int i, int i2) {
        this.zzc = zzanVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzak.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzan, java.util.List
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzan subList(int i, int i2) {
        zzak.zza(i, i2, this.zzb);
        zzan zzanVar = this.zzc;
        int i3 = this.zza;
        return (zzan) zzanVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final Object[] zzd() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final int zze() {
        return this.zzc.zze() + this.zza;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final int zzf() {
        return this.zzc.zze() + this.zza + this.zzb;
    }
}
