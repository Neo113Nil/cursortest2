package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzht implements d {
    static final zzht zza = new zzht();
    private static final c zzb = G.e(1, c.a("maxMs"));
    private static final c zzc = G.e(2, c.a("minMs"));
    private static final c zzd = G.e(3, c.a("avgMs"));
    private static final c zze = G.e(4, c.a("firstQuartileMs"));
    private static final c zzf = G.e(5, c.a("medianMs"));
    private static final c zzg = G.e(6, c.a("thirdQuartileMs"));

    private zzht() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznw zznwVar = (zznw) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zznwVar.zzc());
        eVar.add(zzc, zznwVar.zze());
        eVar.add(zzd, zznwVar.zza());
        eVar.add(zze, zznwVar.zzb());
        eVar.add(zzf, zznwVar.zzd());
        eVar.add(zzg, zznwVar.zzf());
    }
}
