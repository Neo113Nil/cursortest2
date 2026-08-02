package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzfe implements Runnable {
    private final zzfc zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    /* synthetic */ zzfe(String str, zzfc zzfcVar, int i11, Throwable th2, byte[] bArr, Map map, zzfd zzfdVar) {
        Preconditions.checkNotNull(zzfcVar);
        this.zza = zzfcVar;
        this.zzb = i11;
        this.zzc = th2;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
