package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
final class zzla implements zzlh {
    private final zzlh[] zza;

    zzla(zzlh... zzlhVarArr) {
        this.zza = zzlhVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlg zzb(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            zzlh zzlhVar = zzlhVarArr[i11];
            if (zzlhVar.zzc(cls)) {
                return zzlhVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean zzc(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzlhVarArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
