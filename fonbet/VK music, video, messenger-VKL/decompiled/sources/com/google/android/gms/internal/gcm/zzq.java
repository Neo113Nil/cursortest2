package com.google.android.gms.internal.gcm;

import com.vungle.ads.internal.protos.Sdk;
import java.io.PrintStream;

/* loaded from: classes12.dex */
public final class zzq {
    private static final zzr zzdq;
    private static final int zzdr;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
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
                StringBuilder sb = new StringBuilder(name.length() + Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
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
        zzdVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new zzu() : new zzd();
        zzdq = zzdVar;
        zzdr = num == null ? 1 : num.intValue();
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

    public static void zzd(Throwable th, Throwable th2) {
        zzdq.zzd(th, th2);
    }

    public static final class zzd extends zzr {
        @Override // com.google.android.gms.internal.gcm.zzr
        public final void zzd(Throwable th, Throwable th2) {
        }
    }
}
