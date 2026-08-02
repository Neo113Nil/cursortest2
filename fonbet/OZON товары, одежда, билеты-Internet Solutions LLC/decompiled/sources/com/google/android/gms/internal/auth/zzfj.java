package com.google.android.gms.internal.auth;

/* loaded from: classes9.dex */
final class zzfj extends zzfl {
    /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(Object obj, long j11) {
        ((zzez) zzhj.zzf(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(Object obj, Object obj2, long j11) {
        zzez zzezVar = (zzez) zzhj.zzf(obj, j11);
        zzez zzezVar2 = (zzez) zzhj.zzf(obj2, j11);
        int size = zzezVar.size();
        int size2 = zzezVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVar.zzc()) {
                zzezVar = zzezVar.zzd(size2 + size);
            }
            zzezVar.addAll(zzezVar2);
        }
        if (size > 0) {
            zzezVar2 = zzezVar;
        }
        zzhj.zzp(obj, j11, zzezVar2);
    }

    private zzfj() {
        super(null);
    }
}
