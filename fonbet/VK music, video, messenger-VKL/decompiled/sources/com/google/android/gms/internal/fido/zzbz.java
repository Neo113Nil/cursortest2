package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
final class zzbz extends zzbu {
    private final zzcc zza;

    public zzbz(zzcc zzccVar, int i) {
        super(zzccVar.size(), i);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbu
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
