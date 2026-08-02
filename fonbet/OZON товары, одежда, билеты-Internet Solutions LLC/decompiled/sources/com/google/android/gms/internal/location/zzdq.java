package com.google.android.gms.internal.location;

/* loaded from: classes9.dex */
final class zzdq extends zzdo {
    private final zzds zza;

    zzdq(zzds zzdsVar, int i11) {
        super(zzdsVar.size(), i11);
        this.zza = zzdsVar;
    }

    @Override // com.google.android.gms.internal.location.zzdo
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}
