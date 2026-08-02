package com.google.android.gms.internal.mlkit_vision_common;

import Sh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import r8.c;
import r8.d;

/* loaded from: classes9.dex */
final class zzeq implements d {
    static final zzeq zza = new zzeq();
    private static final c zzb = a.c(1, c.a(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final c zzc = a.c(2, c.a("version"));
    private static final c zzd = a.c(3, c.a("source"));
    private static final c zze = a.c(4, c.a("uri"));
    private static final c zzf = a.c(5, c.a("hash"));
    private static final c zzg = a.c(6, c.a("modelType"));
    private static final c zzh = a.c(7, c.a("size"));
    private static final c zzi = a.c(8, c.a("hasLabelMap"));
    private static final c zzj = a.c(9, c.a("isManifestModel"));

    private zzeq() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
