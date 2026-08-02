package com.google.android.gms.internal.mlkit_common;

import Lh.b;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzkh implements d {
    static final zzkh zza = new zzkh();
    private static final c zzb = b.c(1, c.a("appId"));
    private static final c zzc = b.c(2, c.a("appVersion"));
    private static final c zzd = b.c(3, c.a("firebaseProjectId"));
    private static final c zze = b.c(4, c.a("mlSdkVersion"));
    private static final c zzf = b.c(5, c.a("tfliteSchemaVersion"));
    private static final c zzg = b.c(6, c.a("gcmSenderId"));
    private static final c zzh = b.c(7, c.a("apiKey"));
    private static final c zzi = b.c(8, c.a("languages"));
    private static final c zzj = b.c(9, c.a("mlSdkInstanceId"));
    private static final c zzk = b.c(10, c.a("isClearcutClient"));
    private static final c zzl = b.c(11, c.a("isStandaloneMlkit"));
    private static final c zzm = b.c(12, c.a("isJsonLogging"));
    private static final c zzn = b.c(13, c.a("buildLevel"));
    private static final c zzo = b.c(14, c.a("optionalModuleVersion"));

    private zzkh() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqv zzqvVar = (zzqv) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzqvVar.zzg());
        eVar.add(zzc, zzqvVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzqvVar.zzj());
        eVar.add(zzf, zzqvVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzqvVar.zza());
        eVar.add(zzj, zzqvVar.zzi());
        eVar.add(zzk, zzqvVar.zzb());
        eVar.add(zzl, zzqvVar.zzd());
        eVar.add(zzm, zzqvVar.zzc());
        eVar.add(zzn, zzqvVar.zze());
        eVar.add(zzo, zzqvVar.zzf());
    }
}
