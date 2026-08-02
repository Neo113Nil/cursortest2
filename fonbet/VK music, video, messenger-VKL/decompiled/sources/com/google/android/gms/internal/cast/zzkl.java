package com.google.android.gms.internal.cast;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzkl {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzkp zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.cast.zzkp] */
    static {
        zzkq zzkqVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzkqVar = new zzkq();
                break;
            }
            zzkqVar = null;
            try {
                zzkqVar = (zzkp) Class.forName(zza[i]).asSubclass(zzkp.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzkqVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzkqVar;
    }

    public static StackTraceElement zza(Class cls, int i) {
        zzkm.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
