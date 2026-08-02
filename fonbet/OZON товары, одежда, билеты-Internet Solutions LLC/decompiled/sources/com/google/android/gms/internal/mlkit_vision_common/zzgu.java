package com.google.android.gms.internal.mlkit_vision_common;

import Sh.a;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzgu implements d {
    static final zzgu zza = new zzgu();
    private static final c zzb = a.c(1, c.a("appId"));
    private static final c zzc = a.c(2, c.a("appVersion"));
    private static final c zzd = a.c(3, c.a("firebaseProjectId"));
    private static final c zze = a.c(4, c.a("mlSdkVersion"));
    private static final c zzf = a.c(5, c.a("tfliteSchemaVersion"));
    private static final c zzg = a.c(6, c.a("gcmSenderId"));
    private static final c zzh = a.c(7, c.a("apiKey"));
    private static final c zzi = a.c(8, c.a("languages"));
    private static final c zzj = a.c(9, c.a("mlSdkInstanceId"));
    private static final c zzk = a.c(10, c.a("isClearcutClient"));
    private static final c zzl = a.c(11, c.a("isStandaloneMlkit"));
    private static final c zzm = a.c(12, c.a("isJsonLogging"));
    private static final c zzn = a.c(13, c.a("buildLevel"));
    private static final c zzo = a.c(14, c.a("optionalModuleVersion"));

    private zzgu() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzla zzlaVar = (zzla) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzlaVar.zzg());
        eVar.add(zzc, zzlaVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzlaVar.zzj());
        eVar.add(zzf, zzlaVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzlaVar.zza());
        eVar.add(zzj, zzlaVar.zzi());
        eVar.add(zzk, zzlaVar.zzb());
        eVar.add(zzl, zzlaVar.zzd());
        eVar.add(zzm, zzlaVar.zzc());
        eVar.add(zzn, zzlaVar.zze());
        eVar.add(zzo, zzlaVar.zzf());
    }
}
