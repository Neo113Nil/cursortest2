package com.google.android.gms.internal.measurement;

import java.util.List;
import xsna.go9;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzbj extends zzaw {
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzh(str)) {
            throw new IllegalArgumentException(go9.b("Command not found: ", str));
        }
        zzap zzd = zzgVar.zzd(str);
        if (zzd instanceof zzai) {
            return ((zzai) zzd).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(zr.a("Function ", str, " is not defined"));
    }
}
