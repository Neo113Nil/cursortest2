package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzmg implements d {
    static final zzmg zza = new zzmg();
    private static final c zzb = G.e(1, c.a("appId"));
    private static final c zzc = G.e(2, c.a("appVersion"));
    private static final c zzd = G.e(3, c.a("firebaseProjectId"));
    private static final c zze = G.e(4, c.a("mlSdkVersion"));
    private static final c zzf = G.e(5, c.a("tfliteSchemaVersion"));
    private static final c zzg = G.e(6, c.a("gcmSenderId"));
    private static final c zzh = G.e(7, c.a("apiKey"));
    private static final c zzi = G.e(8, c.a("languages"));
    private static final c zzj = G.e(9, c.a("mlSdkInstanceId"));
    private static final c zzk = G.e(10, c.a("isClearcutClient"));
    private static final c zzl = G.e(11, c.a("isStandaloneMlkit"));
    private static final c zzm = G.e(12, c.a("isJsonLogging"));
    private static final c zzn = G.e(13, c.a("buildLevel"));
    private static final c zzo = G.e(14, c.a("optionalModuleVersion"));

    private zzmg() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzst zzstVar = (zzst) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzstVar.zzg());
        eVar.add(zzc, zzstVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzstVar.zzj());
        eVar.add(zzf, zzstVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzstVar.zza());
        eVar.add(zzj, zzstVar.zzi());
        eVar.add(zzk, zzstVar.zzb());
        eVar.add(zzl, zzstVar.zzd());
        eVar.add(zzm, zzstVar.zzc());
        eVar.add(zzn, zzstVar.zze());
        eVar.add(zzo, zzstVar.zzf());
    }
}
