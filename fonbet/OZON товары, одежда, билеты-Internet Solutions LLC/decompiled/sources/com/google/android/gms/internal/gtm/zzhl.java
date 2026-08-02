package com.google.android.gms.internal.gtm;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes9.dex */
public final class zzhl {

    @VisibleForTesting
    static final zzgu zza = new zzgu();

    public static void zza(String str) {
        if (zzgu.zza(6)) {
            Log.e("GoogleTagManager", str);
        }
    }

    public static void zzb(String str, Throwable th2) {
        if (zzgu.zza(6)) {
            Log.e("GoogleTagManager", str, th2);
        }
    }

    public static void zzc(String str) {
        if (zzgu.zza(4)) {
            Log.i("GoogleTagManager", str);
        }
    }

    public static void zzd(String str) {
        if (zzgu.zza(2)) {
            Log.v("GoogleTagManager", str);
        }
    }

    public static void zze(String str) {
        if (zzgu.zza(5)) {
            Log.w("GoogleTagManager", str);
        }
    }

    public static void zzf(String str, Throwable th2) {
        if (zzgu.zza(5)) {
            Log.w("GoogleTagManager", str, th2);
        }
    }
}
