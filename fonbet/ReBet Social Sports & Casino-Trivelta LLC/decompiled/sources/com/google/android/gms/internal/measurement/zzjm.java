package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes2.dex */
public final class zzjm {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzjm() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return zza() && !zzd(context);
    }

    public static boolean zzc(Context context) {
        return !zza() || zzd(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    @TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzd(Context context) {
        boolean z10;
        if (zzb) {
            return true;
        }
        synchronized (zzjm.class) {
            try {
                if (zzb) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    z10 = false;
                    if (i10 > 2) {
                        break;
                    }
                    if (zza == null) {
                        zza = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zza;
                    if (userManager == null) {
                        z10 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e10) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                        zza = null;
                        i10++;
                    }
                }
                if (z10) {
                    zza = null;
                }
                if (z10) {
                    zzb = true;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
