package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.InterfaceC3211a4;

/* loaded from: classes2.dex */
final class zzes extends zzcz {
    private final InterfaceC3211a4 zza;

    public zzes(InterfaceC3211a4 interfaceC3211a4) {
        this.zza = interfaceC3211a4;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
