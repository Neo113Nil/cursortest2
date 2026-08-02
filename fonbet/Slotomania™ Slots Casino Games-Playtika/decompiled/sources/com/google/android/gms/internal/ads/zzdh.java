package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzdh {
    private static Executor zza;

    public static synchronized Executor zza() {
        Executor executor;
        synchronized (zzdh.class) {
            if (zza == null) {
                zza = zzfk.zzg("ExoPlayer:BackgroundExecutor");
            }
            executor = zza;
        }
        return executor;
    }
}
