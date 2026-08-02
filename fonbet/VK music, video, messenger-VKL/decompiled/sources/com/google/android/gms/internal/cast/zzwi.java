package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import xsna.ugz;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzwi extends zzwg implements ugz {
    @Override // xsna.ugz
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.cast.zzwg
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract ugz zzc();
}
