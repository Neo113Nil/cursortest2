package com.google.android.gms.internal.fido;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes9.dex */
public final class zzfj {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzfn zzb;

    static {
        zzfn zzfoVar;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                zzfoVar = new zzfo();
                break;
            }
            try {
                zzfoVar = (zzfn) Class.forName(zza[i11]).asSubclass(zzfn.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzfoVar = null;
            }
            if (zzfoVar != null) {
                break;
            } else {
                i11++;
            }
        }
        zzb = zzfoVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i11) {
        zzfk.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
