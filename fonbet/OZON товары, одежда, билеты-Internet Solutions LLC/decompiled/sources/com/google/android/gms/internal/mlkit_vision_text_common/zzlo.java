package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzlo implements d {
    static final zzlo zza = new zzlo();
    private static final c zzb = G.e(3, c.a("languageOption"));
    private static final c zzc = G.e(4, c.a("isUsingLegacyApi"));
    private static final c zzd = G.e(5, c.a("sdkVersion"));

    private zzlo() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        e eVar = (e) obj2;
        eVar.add(zzb, ((zzsd) obj).zza());
        eVar.add(zzc, (Object) null);
        eVar.add(zzd, (Object) null);
    }
}
