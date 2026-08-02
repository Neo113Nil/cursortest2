package com.google.android.gms.internal.measurement;

import B0.A0;
import Nk.a;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzbj extends zzaw {
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzh(str)) {
            throw new IllegalArgumentException(a.b("Command not found: ", str));
        }
        zzap zzd = zzgVar.zzd(str);
        if (zzd instanceof zzai) {
            return ((zzai) zzd).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(A0.b("Function ", str, " is not defined"));
    }
}
