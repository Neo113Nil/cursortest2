package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzne implements zzgc {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zznc zzb;

    zzne(zznc zzncVar, String str) {
        this.zza = str;
        this.zzb = zzncVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgc
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzb.zza(true, i, th, bArr, this.zza);
    }
}
