package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.CrashUtils;

/* loaded from: classes9.dex */
final class zzgt {
    public static void zza(String str, Context context) {
        zzhl.zza(str);
        if (CrashUtils.addDynamiteErrorToDropBox(context, new RuntimeException(str))) {
            zzhl.zzd("Crash reported successfully.");
        } else {
            zzhl.zzd("Failed to report crash");
        }
    }

    public static void zzb(String str, Throwable th2, Context context) {
        zzhl.zzb(str, th2);
        if (CrashUtils.addDynamiteErrorToDropBox(context, th2)) {
            zzhl.zzd("Crash reported successfully.");
        } else {
            zzhl.zzd("Failed to report crash");
        }
    }

    public static void zzc(String str, Context context) {
        zzhl.zze(str);
        if (CrashUtils.addDynamiteErrorToDropBox(context, new RuntimeException(str))) {
            zzhl.zzd("Crash reported successfully.");
        } else {
            zzhl.zzd("Failed to report crash");
        }
    }
}
