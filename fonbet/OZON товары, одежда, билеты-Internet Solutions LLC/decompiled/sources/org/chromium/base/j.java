package org.chromium.base;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class j {
    public static void a(String str, String str2) {
        Log.e(c(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        Log.e(c(str), str2, th2);
    }

    public static String c(String str) {
        return Nk.a.b("cn_", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Object... objArr) {
        Throwable th2;
        if (!Log.isLoggable("CommandLine", 2)) {
            return;
        }
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th2 = (Throwable) obj;
                String format = ((th2 == null && objArr.length > 0) || objArr.length > 1) ? String.format(Locale.US, "Switched to native command-line", objArr) : "Switched to native command-line";
                String c11 = c("CommandLine");
                if (th2 != null) {
                    Log.v(c11, format, th2);
                    return;
                } else {
                    Log.v(c11, format);
                    return;
                }
            }
        }
        th2 = null;
        if (th2 == null) {
            String c112 = c("CommandLine");
            if (th2 != null) {
            }
        }
        String c1122 = c("CommandLine");
        if (th2 != null) {
        }
    }
}
