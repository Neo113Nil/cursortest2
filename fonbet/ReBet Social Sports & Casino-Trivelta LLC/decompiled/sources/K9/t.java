package K9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.lang.reflect.Method;
import l0.AbstractC5338c;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6419a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f6420b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f6421c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f6422d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f6423e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f6424f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f6425g;

    /* renamed from: h, reason: collision with root package name */
    public static final Method f6426h;

    /* renamed from: i, reason: collision with root package name */
    public static final Method f6427i;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f6428j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f6419a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f6420b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f6421c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f6422d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f6423e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f6424f = method5;
        if (n.f()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
            f6425g = method6;
            if (n.f()) {
                try {
                    method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
                } catch (Exception e11) {
                    Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                }
                f6426h = method7;
                if (n.f()) {
                    try {
                        method8 = WorkSource.class.getMethod("isEmpty", null);
                        try {
                            method8.setAccessible(true);
                        } catch (Exception unused6) {
                        }
                    } catch (Exception unused7) {
                    }
                    f6427i = method8;
                    f6428j = null;
                }
                method8 = null;
                f6427i = method8;
                f6428j = null;
            }
            method7 = null;
            f6426h = method7;
            if (n.f()) {
            }
            method8 = null;
            f6427i = method8;
            f6428j = null;
        }
        method6 = null;
        f6425g = method6;
        if (n.f()) {
        }
        method7 = null;
        f6426h = method7;
        if (n.f()) {
        }
        method8 = null;
        f6427i = method8;
        f6428j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f6421c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f6420b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c10 = M9.e.a(context).c(str, 0);
                if (c10 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = c10.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        synchronized (t.class) {
            Boolean bool = f6428j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z10 = AbstractC5338c.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
            f6428j = Boolean.valueOf(z10);
            return z10;
        }
    }

    public static boolean d(WorkSource workSource) {
        Method method = f6427i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                AbstractC3191o.m(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return e(workSource) == 0;
    }

    public static int e(WorkSource workSource) {
        Method method = f6422d;
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, null);
            AbstractC3191o.m(invoke);
            return ((Integer) invoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
