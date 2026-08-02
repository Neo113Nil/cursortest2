package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzoe implements d {
    static final zzoe zza = new zzoe();
    private static final c zzb = Im.a.b(1, c.a("appName"));
    private static final c zzc = Im.a.b(2, c.a("sessionId"));
    private static final c zzd = Im.a.b(3, c.a("startZoomLevel"));
    private static final c zze = Im.a.b(4, c.a("endZoomLevel"));
    private static final c zzf = Im.a.b(5, c.a("durationMs"));
    private static final c zzg = Im.a.b(6, c.a("predictedArea"));

    private zzoe() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzut zzutVar = (zzut) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzutVar.zze());
        eVar.add(zzc, zzutVar.zzf());
        eVar.add(zzd, zzutVar.zzc());
        eVar.add(zze, zzutVar.zzb());
        eVar.add(zzf, zzutVar.zzd());
        eVar.add(zzg, zzutVar.zza());
    }
}
