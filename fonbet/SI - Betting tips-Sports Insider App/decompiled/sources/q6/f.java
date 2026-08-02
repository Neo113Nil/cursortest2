package q6;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import g6.v;
import io.sentry.android.core.w0;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f22051a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f22052b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f22053c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f22054d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f22055e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f22051a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f22052b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f22053c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e7) {
                w0.n("WorkSourceUtil", "Missing WorkChain API createWorkChain", e7);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e9) {
                w0.n("WorkSourceUtil", "Missing WorkChain class", e9);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
            f22054d = method4;
            f22055e = null;
        }
        method4 = null;
        f22054d = method4;
        f22055e = null;
    }

    public static void a(WorkSource workSource, int i5, String str) {
        Method method = f22052b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i5), str);
                return;
            } catch (Exception e7) {
                w0.o("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                return;
            }
        }
        Method method2 = f22051a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i5));
            } catch (Exception e9) {
                w0.o("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
            }
        }
    }

    public static synchronized boolean b(Context context) {
        synchronized (f.class) {
            Boolean bool = f22055e;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z5 = d0.c.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
            f22055e = Boolean.valueOf(z5);
            return z5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(WorkSource workSource) {
        int intValue;
        Method method = f22054d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                v.h(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e7) {
                w0.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e7);
            }
        }
        Method method2 = f22053c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                v.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e9) {
                w0.o("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
            }
            return intValue != 0;
        }
        intValue = 0;
        if (intValue != 0) {
        }
    }
}
