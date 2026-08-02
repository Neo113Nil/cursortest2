package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gx9 implements cx9 {
    public static gx9 m;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final ox9 k;
    public static final dti l = new dti(25);
    public static final AtomicBoolean n = new AtomicBoolean(false);
    public static final ConcurrentHashMap o = new ConcurrentHashMap();
    public static final ConcurrentHashMap p = new ConcurrentHashMap();
    public static final ConcurrentHashMap q = new ConcurrentHashMap();

    public gx9(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, ox9 ox9Var) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = method;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = ox9Var;
    }

    public static final ConcurrentHashMap b() {
        if (cw3.a.contains(gx9.class)) {
            return null;
        }
        try {
            return o;
        } catch (Throwable th) {
            cw3.a(gx9.class, th);
            return null;
        }
    }

    public static final ConcurrentHashMap c() {
        if (cw3.a.contains(gx9.class)) {
            return null;
        }
        try {
            return q;
        } catch (Throwable th) {
            cw3.a(gx9.class, th);
            return null;
        }
    }

    public static final ConcurrentHashMap d() {
        if (cw3.a.contains(gx9.class)) {
            return null;
        }
        try {
            return p;
        } catch (Throwable th) {
            cw3.a(gx9.class, th);
            return null;
        }
    }

    public static final void e() {
        cw3.a.contains(gx9.class);
    }

    @Override // defpackage.cx9
    public final void a(px9 px9Var, Runnable runnable) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            f(new p3(25, this, px9Var, runnable));
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void f(Runnable runnable) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            if (n.get()) {
                runnable.run();
            } else {
                h(runnable);
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final Object g() {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final void h(Runnable runnable) {
        Method z;
        Class cls = this.b;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            Class x = qx9.x("com.android.billingclient.api.BillingClientStateListener");
            if (x == null || (z = qx9.z(cls, "startConnection", x)) == null) {
                return;
            }
            qx9.B(cls, g(), z, Proxy.newProxyInstance(x.getClassLoader(), new Class[]{x}, new r02(runnable, 2)));
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
