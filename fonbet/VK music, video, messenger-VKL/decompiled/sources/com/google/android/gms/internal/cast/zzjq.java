package com.google.android.gms.internal.cast;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzjq extends zzjm {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzjl zzc;

    /* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
    final class zza {
        public static boolean zza() {
            return zzjq.zzp();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z = true;
        if (str != null && !"robolectric".equals(str)) {
            z = false;
        }
        zzb = z;
        zzc = new zzjl() { // from class: com.google.android.gms.internal.cast.zzjq.1
            @Override // com.google.android.gms.internal.cast.zzjl
            public String zza(Class cls) {
                StackTraceElement zza2;
                if (zzjq.zza) {
                    try {
                        if (cls.equals(zzjq.zzr())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzjq.zzb || (zza2 = zzkl.zza(cls, 1)) == null) {
                    return null;
                }
                return zza2.getClassName();
            }

            @Override // com.google.android.gms.internal.cast.zzjl
            public zzis zzb(Class<?> cls, int i) {
                return zzis.zza;
            }
        };
    }

    public static boolean zzp() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> zzr() {
        return VMStack.getStackClass2();
    }

    @Override // com.google.android.gms.internal.cast.zzjm
    public zzjl zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzjm
    public zzix zze(String str) {
        return zzju.zzb(str);
    }

    @Override // com.google.android.gms.internal.cast.zzjm
    public zzjz zzg() {
        return zzjv.zza();
    }

    @Override // com.google.android.gms.internal.cast.zzjm
    public String zzn() {
        return "platform: Android";
    }
}
