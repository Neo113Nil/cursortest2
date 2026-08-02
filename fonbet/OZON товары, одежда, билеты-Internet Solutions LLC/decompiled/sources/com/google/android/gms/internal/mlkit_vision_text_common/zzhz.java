package com.google.android.gms.internal.mlkit_vision_text_common;

import F3.G;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzhz implements d {
    static final zzhz zza = new zzhz();
    private static final c zzb = G.e(1, c.a("imageFormat"));
    private static final c zzc = G.e(2, c.a("originalImageSize"));
    private static final c zzd = G.e(3, c.a("compressedImageSize"));
    private static final c zze = G.e(4, c.a("isOdmlImage"));

    private zzhz() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzod zzodVar = (zzod) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzodVar.zza());
        eVar.add(zzc, zzodVar.zzb());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, (Object) null);
    }
}
