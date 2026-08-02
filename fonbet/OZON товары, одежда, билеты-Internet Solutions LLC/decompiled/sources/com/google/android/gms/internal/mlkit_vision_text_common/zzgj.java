package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzgj implements d {
    static final zzgj zza = new zzgj();
    private static final c zzb = G.e(1, c.a("logEventKey"));
    private static final c zzc = G.e(2, c.a("eventCount"));
    private static final c zzd = G.e(3, c.a("inferenceDurationStats"));

    private zzgj() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzeu zzeuVar = (zzeu) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzeuVar.zza());
        eVar.add(zzc, zzeuVar.zzc());
        eVar.add(zzd, zzeuVar.zzb());
    }
}
