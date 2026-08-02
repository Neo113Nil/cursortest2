package com.google.android.gms.internal.mlkit_common;

import Lh.b;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzfk implements d {
    static final zzfk zza = new zzfk();
    private static final c zzb = b.c(1, c.a("modelType"));
    private static final c zzc = b.c(2, c.a("isSuccessful"));
    private static final c zzd = b.c(3, c.a("modelName"));

    private zzfk() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzlo zzloVar = (zzlo) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzloVar.zza());
        eVar.add(zzc, zzloVar.zzb());
        eVar.add(zzd, (Object) null);
    }
}
