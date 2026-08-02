package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzkk implements d {
    static final zzkk zza = new zzkk();
    private static final c zzb = Im.a.b(1, c.a("durationMs"));
    private static final c zzc = Im.a.b(2, c.a("errorCode"));
    private static final c zzd = Im.a.b(3, c.a("isColdCall"));
    private static final c zze = Im.a.b(4, c.a("autoManageModelOnBackground"));
    private static final c zzf = Im.a.b(5, c.a("autoManageModelOnLowMemory"));
    private static final c zzg = Im.a.b(6, c.a("isNnApiEnabled"));
    private static final c zzh = Im.a.b(7, c.a("eventsCount"));
    private static final c zzi = Im.a.b(8, c.a("otherErrors"));
    private static final c zzj = Im.a.b(9, c.a("remoteConfigValueForAcceleration"));
    private static final c zzk = Im.a.b(10, c.a("isAccelerated"));

    private zzkk() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqq zzqqVar = (zzqq) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzqqVar.zze());
        eVar.add(zzc, zzqqVar.zza());
        eVar.add(zzd, zzqqVar.zzd());
        eVar.add(zze, zzqqVar.zzb());
        eVar.add(zzf, zzqqVar.zzc());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, (Object) null);
        eVar.add(zzj, (Object) null);
        eVar.add(zzk, (Object) null);
    }
}
