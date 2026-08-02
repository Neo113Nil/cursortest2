package com.google.android.gms.internal.mlkit_common;

import Lh.b;
import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzgq implements d {
    static final zzgq zza = new zzgq();
    private static final c zzb = b.c(1, c.a("options"));
    private static final c zzc = b.c(2, c.a("roughDownloadDurationMs"));
    private static final c zzd = b.c(3, c.a("errorCode"));
    private static final c zze = b.c(4, c.a("exactDownloadDurationMs"));
    private static final c zzf = b.c(5, c.a("downloadStatus"));
    private static final c zzg = b.c(6, c.a("downloadFailureStatus"));
    private static final c zzh = b.c(7, c.a("mddDownloadErrorCodes"));

    private zzgq() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznc zzncVar = (zznc) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzncVar.zzc());
        eVar.add(zzc, zzncVar.zzf());
        eVar.add(zzd, zzncVar.zza());
        eVar.add(zze, zzncVar.zze());
        eVar.add(zzf, zzncVar.zzb());
        eVar.add(zzg, zzncVar.zzd());
        eVar.add(zzh, (Object) null);
    }
}
