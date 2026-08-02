package com.google.android.gms.internal.gcm;

import java.io.PrintStream;

/* loaded from: classes7.dex */
public final class zzq {
    private static final zzr zzdq;
    private static final int zzdr;

    static final class zzd extends zzr {
        zzd() {
        }

        @Override // com.google.android.gms.internal.gcm.zzr
        public final void zzd(Throwable th, Throwable th2) {
        }
    }

    public static void zzd(Throwable th, Throwable th2) {
        zzdq.zzd(th, th2);
    }

    private static Integer zzac() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    static {
        Integer num;
        zzr zzdVar;
        try {
            num = zzac();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = zzd.class.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
                sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                zzdVar = new zzd();
                zzdq = zzdVar;
                zzdr = num == null ? 1 : num.intValue();
            }
            if (num.intValue() >= 19) {
                zzdVar = new zzv();
                zzdq = zzdVar;
                zzdr = num == null ? 1 : num.intValue();
            }
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            zzdVar = new zzu();
        } else {
            zzdVar = new zzd();
        }
        zzdq = zzdVar;
        zzdr = num == null ? 1 : num.intValue();
    }
}
