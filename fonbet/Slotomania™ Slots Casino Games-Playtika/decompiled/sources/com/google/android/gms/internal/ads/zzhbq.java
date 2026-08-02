package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhbq {
    private final zzgtv zza = new zzgtv();
    private final String zzb;
    private volatile Logger zzc;

    zzhbq(Class cls) {
        this.zzb = cls.getName();
    }

    final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
