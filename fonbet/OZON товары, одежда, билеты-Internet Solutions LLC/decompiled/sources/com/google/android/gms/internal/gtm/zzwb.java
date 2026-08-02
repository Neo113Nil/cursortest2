package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzwb implements zzwi {
    private final zzwi[] zza;

    zzwb(zzwi... zzwiVarArr) {
        this.zza = zzwiVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzwi
    public final zzwh zzb(Class<?> cls) {
        zzwi[] zzwiVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            zzwi zzwiVar = zzwiVarArr[i11];
            if (zzwiVar.zzc(cls)) {
                return zzwiVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.gtm.zzwi
    public final boolean zzc(Class<?> cls) {
        zzwi[] zzwiVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzwiVarArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
