package m3;

import E0.C2942q;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f74361a = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 != null) {
            synchronized (f74361a) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 == null) {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th3 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th3 = th3.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder e11 = C2942q.e(str, "\n  ");
        e11.append(replace.replace("\n", "\n  "));
        e11.append('\n');
        return e11.toString();
    }

    public static void b(String str, String str2) {
        synchronized (f74361a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f74361a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f74361a) {
            Log.e(str, a(str2, th2));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f74361a) {
            Log.i(str, a(str2, null));
        }
    }

    public static void f(String str, String str2) {
        synchronized (f74361a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        synchronized (f74361a) {
            Log.w(str, a(str2, th2));
        }
    }
}
