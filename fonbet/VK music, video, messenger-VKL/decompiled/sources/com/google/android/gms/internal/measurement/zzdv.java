package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import xsna.fh9;
import xsna.gd01;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdv extends zzch {
    private final gd01 zza;

    public zzdv(gd01 gd01Var) {
        this.zza = gd01Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        ((fh9) this.zza).e(str, str2, bundle, j);
    }
}
