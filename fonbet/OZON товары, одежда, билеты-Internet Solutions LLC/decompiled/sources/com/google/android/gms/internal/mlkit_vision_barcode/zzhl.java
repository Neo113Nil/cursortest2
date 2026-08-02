package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzhl implements d {
    static final zzhl zza = new zzhl();
    private static final c zzb = Im.a.b(1, c.a("errorCode"));
    private static final c zzc = Im.a.b(2, c.a("hasResult"));
    private static final c zzd = Im.a.b(3, c.a("isColdCall"));
    private static final c zze = Im.a.b(4, c.a("imageInfo"));
    private static final c zzf = Im.a.b(5, c.a("options"));
    private static final c zzg = Im.a.b(6, c.a("detectedBarcodeFormats"));
    private static final c zzh = Im.a.b(7, c.a("detectedBarcodeValueTypes"));

    private zzhl() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzft zzftVar = (zzft) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzftVar.zzc());
        eVar.add(zzc, (Object) null);
        eVar.add(zzd, zzftVar.zze());
        eVar.add(zze, (Object) null);
        eVar.add(zzf, zzftVar.zzd());
        eVar.add(zzg, zzftVar.zza());
        eVar.add(zzh, zzftVar.zzb());
    }
}
