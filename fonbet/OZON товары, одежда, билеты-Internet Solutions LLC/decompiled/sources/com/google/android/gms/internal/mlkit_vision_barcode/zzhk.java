package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzhk implements d {
    static final zzhk zza = new zzhk();
    private static final c zzb = Im.a.b(1, c.a("logEventKey"));
    private static final c zzc = Im.a.b(2, c.a("eventCount"));
    private static final c zzd = Im.a.b(3, c.a("inferenceDurationStats"));

    private zzhk() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzfv zzfvVar = (zzfv) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzfvVar.zza());
        eVar.add(zzc, zzfvVar.zzc());
        eVar.add(zzd, zzfvVar.zzb());
    }
}
