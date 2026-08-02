package defpackage;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hx9 implements cx9 {
    public static hx9 I;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Class j;
    public final Class k;
    public final Class l;
    public final Class m;
    public final Class n;
    public final Class o;
    public final Method p;
    public final Method q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;
    public final Method w;
    public final Method x;
    public final Method y;
    public final Method z;
    public static final ex9 G = new ex9(1);
    public static final AtomicBoolean H = new AtomicBoolean(false);
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public static final ConcurrentHashMap K = new ConcurrentHashMap();
    public static final ConcurrentHashMap L = new ConcurrentHashMap();

    public hx9(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = cls6;
        this.h = cls7;
        this.i = cls8;
        this.j = cls9;
        this.k = cls10;
        this.l = cls11;
        this.m = cls12;
        this.n = cls13;
        this.o = cls14;
        this.p = method;
        this.q = method2;
        this.r = method3;
        this.s = method4;
        this.t = method5;
        this.u = method6;
        this.v = method7;
        this.w = method8;
        this.x = method9;
        this.y = method10;
        this.z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    public static final void b() {
        cw3.a.contains(hx9.class);
    }

    @Override // defpackage.cx9
    public final void a(px9 px9Var, Runnable runnable) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            c(new p3(26, this, px9Var, runnable));
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void c(Runnable runnable) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            if (H.get()) {
                runnable.run();
            } else {
                l(runnable);
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final Object d() {
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

    public final String e(String str) {
        if (!cw3.a.contains(this)) {
            try {
                txb b = new Regex("jsonString='(.*?)'").b(str);
                if (b != null) {
                    return (String) CollectionsKt.a0(1, b.a());
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final Object f(px9 px9Var, ArrayList arrayList) {
        Class cls = this.j;
        Class cls2 = this.l;
        if (!cw3.a.contains(this)) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object B = qx9.B(cls2, qx9.B(cls2, qx9.B(cls2, qx9.B(this.f, null, this.z, new Object[0]), this.B, (String) it.next()), this.C, px9Var.a), this.A, new Object[0]);
                        if (B != null) {
                            arrayList2.add(B);
                        }
                    }
                    return qx9.B(cls, qx9.B(cls, qx9.B(this.h, null, this.w, new Object[0]), this.y, arrayList2), this.x, new Object[0]);
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final Object g(px9 px9Var) {
        Class cls = this.k;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            return qx9.B(cls, qx9.B(cls, qx9.B(this.i, null, this.r, new Object[0]), this.t, px9Var.a), this.s, new Object[0]);
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final void h(Object[] objArr, Object[] objArr2) {
        if (cw3.a.contains(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (Intrinsics.c(qx9.B(this.g, objArr2[0], this.F, new Object[0]), 0)) {
                H.set(true);
                if (objArr.length == 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void i(Object[] objArr, Object[] objArr2) {
        String e;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            Object F = ph0.F(0, objArr);
            Object F2 = objArr2 != null ? ph0.F(1, objArr2) : null;
            if (F2 != null && (F2 instanceof List)) {
                Iterator it = ((List) F2).iterator();
                while (it.hasNext()) {
                    try {
                        Object B = qx9.B(this.d, it.next(), this.D, new Object[0]);
                        String str = B instanceof String ? (String) B : null;
                        if (str != null && (e = e(str)) != null) {
                            JSONObject jSONObject = new JSONObject(e);
                            if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                ConcurrentHashMap concurrentHashMap = L;
                                string.getClass();
                                concurrentHashMap.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (F == null || !(F instanceof Runnable)) {
                    return;
                }
                ((Runnable) F).run();
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void j(Object[] objArr, Object[] objArr2) {
        hx9 hx9Var;
        Throwable th;
        Object F;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            Object F2 = ph0.F(0, objArr);
            if (F2 != null && (F2 instanceof px9)) {
                Object F3 = ph0.F(1, objArr);
                if (F3 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            F = ph0.F(1, objArr2);
                        } catch (Throwable th2) {
                            th = th2;
                            hx9Var = this;
                            cw3.a(hx9Var, th);
                        }
                    } else {
                        F = null;
                    }
                    if (F != null && (F instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) F).iterator();
                        while (it.hasNext()) {
                            try {
                                Object B = qx9.B(this.e, it.next(), this.u, new Object[0]);
                                String str = B instanceof String ? (String) B : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                        String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                        if (!L.containsKey(string)) {
                                            string.getClass();
                                            arrayList.add(string);
                                        }
                                        if (F2 == px9.INAPP) {
                                            ConcurrentHashMap concurrentHashMap = J;
                                            string.getClass();
                                            concurrentHashMap.put(string, jSONObject);
                                        } else {
                                            ConcurrentHashMap concurrentHashMap2 = K;
                                            string.getClass();
                                            concurrentHashMap2.put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            hx9Var = this;
                            try {
                                ((Runnable) F3).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                cw3.a(hx9Var, th);
                            }
                        }
                        px9 px9Var = (px9) F2;
                        Runnable runnable = (Runnable) F3;
                        try {
                            try {
                                if (cw3.a.contains(this)) {
                                    return;
                                }
                                try {
                                    hx9Var = this;
                                    try {
                                        hx9Var.c(new kx0(hx9Var, runnable, px9Var, arrayList, 5));
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            cw3.a(hx9Var, th);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                            cw3.a(hx9Var, th);
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    hx9Var = this;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                hx9Var = this;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            hx9Var = this;
                        }
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
            hx9Var = this;
        }
    }

    public final void k(Object[] objArr, Object[] objArr2) {
        hx9 hx9Var;
        Throwable th;
        Object F;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            Object F2 = ph0.F(0, objArr);
            if (F2 != null && (F2 instanceof px9)) {
                Object F3 = ph0.F(1, objArr);
                if (F3 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            F = ph0.F(1, objArr2);
                        } catch (Throwable th2) {
                            th = th2;
                            hx9Var = this;
                            cw3.a(hx9Var, th);
                        }
                    } else {
                        F = null;
                    }
                    if (F != null && (F instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) F).iterator();
                        while (it.hasNext()) {
                            Object B = qx9.B(this.c, it.next(), this.p, new Object[0]);
                            String str = B instanceof String ? (String) B : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                    if (!L.containsKey(string)) {
                                        string.getClass();
                                        arrayList.add(string);
                                    }
                                    if (F2 == px9.INAPP) {
                                        ConcurrentHashMap concurrentHashMap = J;
                                        string.getClass();
                                        concurrentHashMap.put(string, jSONObject);
                                    } else {
                                        ConcurrentHashMap concurrentHashMap2 = K;
                                        string.getClass();
                                        concurrentHashMap2.put(string, jSONObject);
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            hx9Var = this;
                            try {
                                ((Runnable) F3).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                cw3.a(hx9Var, th);
                            }
                        }
                        px9 px9Var = (px9) F2;
                        Runnable runnable = (Runnable) F3;
                        try {
                            try {
                                if (cw3.a.contains(this)) {
                                    return;
                                }
                                try {
                                    hx9Var = this;
                                    try {
                                        hx9Var.c(new kx0(hx9Var, runnable, px9Var, arrayList, 5));
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            cw3.a(hx9Var, th);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                            cw3.a(hx9Var, th);
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    hx9Var = this;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                hx9Var = this;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            hx9Var = this;
                        }
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
            hx9Var = this;
        }
    }

    public final void l(Runnable runnable) {
        Class cls = this.m;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fx9(this, new Object[]{runnable}, 1));
            qx9.B(this.b, d(), this.E, newProxyInstance);
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
