package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzka implements d {
    static final zzka zza = new zzka();
    private static final c zzb = Im.a.b(1, c.a("maxMs"));
    private static final c zzc = Im.a.b(2, c.a("minMs"));
    private static final c zzd = Im.a.b(3, c.a("avgMs"));
    private static final c zze = Im.a.b(4, c.a("firstQuartileMs"));
    private static final c zzf = Im.a.b(5, c.a("medianMs"));
    private static final c zzg = Im.a.b(6, c.a("thirdQuartileMs"));

    private zzka() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqd zzqdVar = (zzqd) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzqdVar.zzc());
        eVar.add(zzc, zzqdVar.zze());
        eVar.add(zzd, zzqdVar.zza());
        eVar.add(zze, zzqdVar.zzb());
        eVar.add(zzf, zzqdVar.zzd());
        eVar.add(zzg, zzqdVar.zzf());
    }
}
