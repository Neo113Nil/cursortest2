package com.google.android.gms.internal.cast;

import androidx.annotation.Nullable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzu {

    @Nullable
    private static zzu zza;

    private zzu(zzj zzjVar, String str) {
        new ConcurrentHashMap();
    }

    public static synchronized void zza(zzj zzjVar, String str) {
        synchronized (zzu.class) {
            if (zza == null) {
                zza = new zzu(zzjVar, str);
            }
        }
    }
}
