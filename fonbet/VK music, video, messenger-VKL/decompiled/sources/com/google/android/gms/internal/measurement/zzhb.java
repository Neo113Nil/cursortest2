package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.UserManager;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzhb {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzhb() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        int i;
        boolean z;
        if (zzb() && !zzb) {
            synchronized (zzhb.class) {
                try {
                    if (!zzb) {
                        i = 1;
                        while (true) {
                            if (i <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager != null) {
                                    if (userManager.isUserUnlocked()) {
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z = false;
                        if (z) {
                            zza = null;
                        }
                        if (z) {
                            zzb = true;
                        }
                        if (!z) {
                            return true;
                        }
                    }
                } catch (NullPointerException unused) {
                    zza = null;
                    i++;
                } finally {
                }
            }
        }
        return false;
    }

    public static boolean zzb() {
        return true;
    }
}
