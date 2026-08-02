package com.google.android.gms.internal.mlkit_common;

import Lh.b;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzgh implements d {
    static final zzgh zza = new zzgh();
    private static final c zzb = b.c(1, c.a("modelType"));
    private static final c zzc = b.c(2, c.a("isDownloaded"));
    private static final c zzd = b.c(3, c.a("modelName"));

    private zzgh() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmj zzmjVar = (zzmj) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzmjVar.zza());
        eVar.add(zzc, zzmjVar.zzb());
        eVar.add(zzd, (Object) null);
    }
}
