package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzkg implements d {
    static final zzkg zza = new zzkg();
    private static final c zzb = Im.a.b(1, c.a("imageFormat"));
    private static final c zzc = Im.a.b(2, c.a("originalImageSize"));
    private static final c zzd = Im.a.b(3, c.a("compressedImageSize"));
    private static final c zze = Im.a.b(4, c.a("isOdmlImage"));

    private zzkg() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqk zzqkVar = (zzqk) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzqkVar.zza());
        eVar.add(zzc, zzqkVar.zzb());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, (Object) null);
    }
}
