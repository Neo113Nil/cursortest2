package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzln implements d {
    static final zzln zza = new zzln();
    private static final c zzb = G.e(1, c.a("inferenceCommonLogEvent"));
    private static final c zzc = G.e(2, c.a("imageInfo"));
    private static final c zzd = G.e(3, c.a("recognizerOptions"));

    private zzln() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzrz zzrzVar = (zzrz) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzrzVar.zzb());
        eVar.add(zzc, zzrzVar.zza());
        eVar.add(zzd, zzrzVar.zzc());
    }
}
