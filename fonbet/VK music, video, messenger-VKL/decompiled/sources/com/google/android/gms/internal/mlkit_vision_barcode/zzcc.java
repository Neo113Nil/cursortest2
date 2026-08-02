package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
final class zzcc extends zzcd {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcd zzc;

    public zzcc(zzcd zzcdVar, int i, int i2) {
        this.zzc = zzcdVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzaq.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcd, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzcd subList(int i, int i2) {
        zzaq.zzc(i, i2, this.zzb);
        zzcd zzcdVar = this.zzc;
        int i3 = this.zza;
        return zzcdVar.subList(i + i3, i2 + i3);
    }
}
