package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzon implements d {
    static final zzon zza = new zzon();
    private static final c zzb = Im.a.b(1, c.a("appId"));
    private static final c zzc = Im.a.b(2, c.a("appVersion"));
    private static final c zzd = Im.a.b(3, c.a("firebaseProjectId"));
    private static final c zze = Im.a.b(4, c.a("mlSdkVersion"));
    private static final c zzf = Im.a.b(5, c.a("tfliteSchemaVersion"));
    private static final c zzg = Im.a.b(6, c.a("gcmSenderId"));
    private static final c zzh = Im.a.b(7, c.a("apiKey"));
    private static final c zzi = Im.a.b(8, c.a("languages"));
    private static final c zzj = Im.a.b(9, c.a("mlSdkInstanceId"));
    private static final c zzk = Im.a.b(10, c.a("isClearcutClient"));
    private static final c zzl = Im.a.b(11, c.a("isStandaloneMlkit"));
    private static final c zzm = Im.a.b(12, c.a("isJsonLogging"));
    private static final c zzn = Im.a.b(13, c.a("buildLevel"));
    private static final c zzo = Im.a.b(14, c.a("optionalModuleVersion"));

    private zzon() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzvd zzvdVar = (zzvd) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzvdVar.zzg());
        eVar.add(zzc, zzvdVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzvdVar.zzj());
        eVar.add(zzf, zzvdVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzvdVar.zza());
        eVar.add(zzj, zzvdVar.zzi());
        eVar.add(zzk, zzvdVar.zzb());
        eVar.add(zzl, zzvdVar.zzd());
        eVar.add(zzm, zzvdVar.zzc());
        eVar.add(zzn, zzvdVar.zze());
        eVar.add(zzo, zzvdVar.zzf());
    }
}
