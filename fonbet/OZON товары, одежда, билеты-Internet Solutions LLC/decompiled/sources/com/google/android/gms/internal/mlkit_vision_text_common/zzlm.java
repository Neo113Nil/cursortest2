package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzlm implements d {
    static final zzlm zza = new zzlm();
    private static final c zzb = G.e(1, c.a("errorCode"));

    private zzlm() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((e) obj2).add(zzb, ((zzrw) obj).zza());
    }
}
