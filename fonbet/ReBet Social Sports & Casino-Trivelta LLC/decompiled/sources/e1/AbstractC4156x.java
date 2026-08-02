package e1;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.net.UnknownHostException;

/* renamed from: e1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4156x {

    /* renamed from: b, reason: collision with root package name */
    public static int f45585b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f45586c = true;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f45584a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static a f45587d = a.f45588a;

    /* renamed from: e1.x$a */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45588a = new C0658a();

        /* renamed from: e1.x$a$a, reason: collision with other inner class name */
        public class C0658a implements a {
            @Override // e1.AbstractC4156x.a
            public void a(String str, String str2, Throwable th2) {
                AbstractC4156x.a(str2, th2);
            }

            @Override // e1.AbstractC4156x.a
            public void b(String str, String str2, Throwable th2) {
                Log.w(str, AbstractC4156x.a(str2, th2));
            }

            @Override // e1.AbstractC4156x.a
            public void c(String str, String str2, Throwable th2) {
                Log.e(str, AbstractC4156x.a(str2, th2));
            }

            @Override // e1.AbstractC4156x.a
            public void d(String str, String str2, Throwable th2) {
                Log.i(str, AbstractC4156x.a(str2, th2));
            }
        }

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void c(String str, String str2, Throwable th2);

        void d(String str, String str2, Throwable th2);
    }

    public static String a(String str, Throwable th2) {
        String f10 = f(th2);
        if (TextUtils.isEmpty(f10)) {
            return str;
        }
        return str + "\n  " + f10.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f45584a) {
            try {
                if (f45585b == 0) {
                    f45587d.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        synchronized (f45584a) {
            try {
                if (f45585b == 0) {
                    f45587d.a(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void d(String str, String str2) {
        synchronized (f45584a) {
            try {
                if (f45585b <= 3) {
                    f45587d.c(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        synchronized (f45584a) {
            try {
                if (f45585b <= 3) {
                    f45587d.c(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String f(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f45584a) {
            try {
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f45586c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void g(String str, String str2) {
        synchronized (f45584a) {
            try {
                if (f45585b <= 1) {
                    f45587d.d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f45584a) {
            try {
                if (f45585b <= 2) {
                    f45587d.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        synchronized (f45584a) {
            try {
                if (f45585b <= 2) {
                    f45587d.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
