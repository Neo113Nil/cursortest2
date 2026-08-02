package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzgk implements d {
    static final zzgk zza = new zzgk();
    private static final c zzb = G.e(1, c.a("errorCode"));
    private static final c zzc = G.e(2, c.a("hasResult"));
    private static final c zzd = G.e(3, c.a("isColdCall"));
    private static final c zze = G.e(4, c.a("imageInfo"));
    private static final c zzf = G.e(5, c.a("recognizerOptions"));

    private zzgk() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzes zzesVar = (zzes) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzesVar.zza());
        eVar.add(zzc, (Object) null);
        eVar.add(zzd, zzesVar.zzc());
        eVar.add(zze, (Object) null);
        eVar.add(zzf, zzesVar.zzb());
    }
}
