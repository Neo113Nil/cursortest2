package u0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static long f65921a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f65922b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f65923c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f65924d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f65925e;

    public static class a {
        public static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f65921a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f65922b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f65923c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f65924d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f65925e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) f65922b.invoke(null, Long.valueOf(f65921a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
