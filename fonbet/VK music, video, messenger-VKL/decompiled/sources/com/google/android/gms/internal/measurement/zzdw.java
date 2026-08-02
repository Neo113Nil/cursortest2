package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import xsna.hd01;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
final class zzdw extends zzch {
    private final hd01 zza;

    public zzdw(hd01 hd01Var) {
        this.zza = hd01Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.zza.a(str, str2, bundle, j);
    }
}
