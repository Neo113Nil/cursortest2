package com.google.android.gms.internal.mlkit_common;

import Lh.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzgr implements d {
    static final zzgr zza = new zzgr();
    private static final c zzb = b.c(1, c.a(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final c zzc = b.c(2, c.a("version"));
    private static final c zzd = b.c(3, c.a("source"));
    private static final c zze = b.c(4, c.a("uri"));
    private static final c zzf = b.c(5, c.a("hash"));
    private static final c zzg = b.c(6, c.a("modelType"));
    private static final c zzh = b.c(7, c.a("size"));
    private static final c zzi = b.c(8, c.a("hasLabelMap"));
    private static final c zzj = b.c(9, c.a("isManifestModel"));

    private zzgr() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznh zznhVar = (zznh) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zznhVar.zzd());
        eVar.add(zzc, (Object) null);
        eVar.add(zzd, zznhVar.zzb());
        eVar.add(zze, (Object) null);
        eVar.add(zzf, zznhVar.zzc());
        eVar.add(zzg, zznhVar.zza());
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, (Object) null);
        eVar.add(zzj, (Object) null);
    }
}
