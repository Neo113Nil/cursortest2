package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzlf implements d {
    static final zzlf zza = new zzlf();
    private static final c zzb = Im.a.b(1, c.a("inferenceCommonLogEvent"));
    private static final c zzc = Im.a.b(2, c.a("options"));
    private static final c zzd = Im.a.b(3, c.a("detectedBarcodeFormats"));
    private static final c zze = Im.a.b(4, c.a("detectedBarcodeValueTypes"));
    private static final c zzf = Im.a.b(5, c.a("imageInfo"));

    private zzlf() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzrr zzrrVar = (zzrr) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzrrVar.zzd());
        eVar.add(zzc, zzrrVar.zze());
        eVar.add(zzd, zzrrVar.zza());
        eVar.add(zze, zzrrVar.zzb());
        eVar.add(zzf, zzrrVar.zzc());
    }
}
