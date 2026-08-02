package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes9.dex */
final class zzlc implements zzfc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzll zzb;

    zzlc(zzll zzllVar, String str) {
        this.zzb = zzllVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        this.zzb.zzJ(i11, th2, bArr, this.zza);
    }
}
