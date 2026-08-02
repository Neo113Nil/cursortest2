package com.google.android.gms.internal.mlkit_common;

import Lh.b;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzgs implements d {
    static final zzgs zza = new zzgs();
    private static final c zzb = b.c(1, c.a("modelInfo"));
    private static final c zzc = b.c(2, c.a("initialDownloadConditions"));
    private static final c zzd = b.c(3, c.a("updateDownloadConditions"));
    private static final c zze = b.c(4, c.a("isModelUpdateEnabled"));

    private zzgs() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        e eVar = (e) obj2;
        eVar.add(zzb, ((zznl) obj).zza());
        eVar.add(zzc, (Object) null);
        eVar.add(zzd, (Object) null);
        eVar.add(zze, (Object) null);
    }
}
