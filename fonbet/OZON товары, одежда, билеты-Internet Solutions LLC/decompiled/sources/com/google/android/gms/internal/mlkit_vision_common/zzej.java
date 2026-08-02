package com.google.android.gms.internal.mlkit_vision_common;

import Sh.a;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzej implements d {
    static final zzej zza = new zzej();
    private static final c zzb = a.c(1, c.a("durationMs"));
    private static final c zzc = a.c(2, c.a("imageSource"));
    private static final c zzd = a.c(3, c.a("imageFormat"));
    private static final c zze = a.c(4, c.a("imageByteSize"));
    private static final c zzf = a.c(5, c.a("imageWidth"));
    private static final c zzg = a.c(6, c.a("imageHeight"));
    private static final c zzh = a.c(7, c.a("rotationDegrees"));

    private zzej() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zziq zziqVar = (zziq) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zziqVar.zzg());
        eVar.add(zzc, zziqVar.zzb());
        eVar.add(zzd, zziqVar.zza());
        eVar.add(zze, zziqVar.zzc());
        eVar.add(zzf, zziqVar.zze());
        eVar.add(zzg, zziqVar.zzd());
        eVar.add(zzh, zziqVar.zzf());
    }
}
