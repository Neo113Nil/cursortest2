package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzof implements d {
    static final zzof zza = new zzof();
    private static final c zzb = Im.a.b(1, c.a("xMin"));
    private static final c zzc = Im.a.b(2, c.a("yMin"));
    private static final c zzd = Im.a.b(3, c.a("xMax"));
    private static final c zze = Im.a.b(4, c.a("yMax"));
    private static final c zzf = Im.a.b(5, c.a("confidenceScore"));

    private zzof() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzur zzurVar = (zzur) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzurVar.zzc());
        eVar.add(zzc, zzurVar.zze());
        eVar.add(zzd, zzurVar.zzb());
        eVar.add(zze, zzurVar.zzd());
        eVar.add(zzf, zzurVar.zza());
    }
}
