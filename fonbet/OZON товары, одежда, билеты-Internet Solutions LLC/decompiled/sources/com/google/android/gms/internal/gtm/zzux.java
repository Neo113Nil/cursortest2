package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzwk;

/* loaded from: classes9.dex */
public final class zzux<ContainingType extends zzwk, Type> extends zzuh<ContainingType, Type> {
    final ContainingType zza;
    final Type zzb;
    final zzwk zzc;
    final zzuw zzd;

    zzux(ContainingType containingtype, Type type, zzwk zzwkVar, zzuw zzuwVar, Class cls) {
        if (containingtype == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (zzuwVar.zzc == zzye.zzk && zzwkVar == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.zza = containingtype;
        this.zzb = type;
        this.zzc = zzwkVar;
        this.zzd = zzuwVar;
    }

    public final boolean zza() {
        boolean z11 = this.zzd.zzd;
        return false;
    }
}
