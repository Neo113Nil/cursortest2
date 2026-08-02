package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
final class zzjk {
    private static volatile ExecutorService zza;

    private zzjk() {
    }

    public static ExecutorService zza(Context context) {
        if (zza == null) {
            synchronized (zzjk.class) {
                try {
                    if (zza == null) {
                        zza = new zzgy(context, 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new zzjj());
                    }
                } finally {
                }
            }
        }
        return zza;
    }
}
