package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;
import xsna.exc0;
import xsna.fx10;
import xsna.o100;
import xsna.ub9;
import xsna.ugz;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzbt implements fx10.e {
    private static final o100 zza = new o100("MediaRouterOPTListener", null);
    private final zzce zzb;
    private final Handler zzc;

    public zzbt(zzce zzceVar) {
        exc0.i(zzceVar);
        this.zzb = zzceVar;
        this.zzc = new zzfk(Looper.getMainLooper());
    }

    @Override // xsna.fx10.e
    public final ugz onPrepareTransfer(final fx10.h hVar, final fx10.h hVar2) {
        zza.a("Prepare transfer from Route(%s) to Route(%s)", hVar, hVar2);
        return ub9.a(new ub9.c() { // from class: com.google.android.gms.internal.cast.zzbs
            @Override // xsna.ub9.c
            public final /* synthetic */ Object attachCompleter(ub9.a aVar) {
                return zzbt.this.zza(hVar, hVar2, aVar);
            }
        });
    }

    public final /* synthetic */ Object zza(final fx10.h hVar, final fx10.h hVar2, final ub9.a aVar) {
        return Boolean.valueOf(this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbt.this.zzb(hVar, hVar2, aVar);
            }
        }));
    }

    public final /* synthetic */ void zzb(fx10.h hVar, fx10.h hVar2, ub9.a aVar) {
        this.zzb.zze(hVar, hVar2, aVar);
    }
}
