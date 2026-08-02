package com.google.android.gms.internal.ads;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzgrz {
    private final Mutex zza = MutexKt.Mutex$default(false, 1, null);

    public final Mutex zza() {
        return this.zza;
    }
}
