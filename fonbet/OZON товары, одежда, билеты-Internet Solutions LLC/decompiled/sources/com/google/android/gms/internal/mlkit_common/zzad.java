package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes.dex */
final class zzad extends zzv {
    private final zzaf zza;

    zzad(zzaf zzafVar, int i11) {
        super(zzafVar.size(), i11);
        this.zza = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzv
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}
