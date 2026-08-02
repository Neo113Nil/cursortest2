package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzid implements d {
    static final zzid zza = new zzid();
    private static final c zzb = G.e(1, c.a("durationMs"));
    private static final c zzc = G.e(2, c.a("errorCode"));
    private static final c zzd = G.e(3, c.a("isColdCall"));
    private static final c zze = G.e(4, c.a("autoManageModelOnBackground"));
    private static final c zzf = G.e(5, c.a("autoManageModelOnLowMemory"));
    private static final c zzg = G.e(6, c.a("isNnApiEnabled"));
    private static final c zzh = G.e(7, c.a("eventsCount"));
    private static final c zzi = G.e(8, c.a("otherErrors"));
    private static final c zzj = G.e(9, c.a("remoteConfigValueForAcceleration"));
    private static final c zzk = G.e(10, c.a("isAccelerated"));

    private zzid() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzoj zzojVar = (zzoj) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzojVar.zze());
        eVar.add(zzc, zzojVar.zza());
        eVar.add(zzd, zzojVar.zzd());
        eVar.add(zze, zzojVar.zzb());
        eVar.add(zzf, zzojVar.zzc());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, (Object) null);
        eVar.add(zzj, (Object) null);
        eVar.add(zzk, (Object) null);
    }
}
