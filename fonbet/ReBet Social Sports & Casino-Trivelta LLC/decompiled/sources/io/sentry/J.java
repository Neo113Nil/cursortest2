package io.sentry;

import io.sentry.util.C4843a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class J {

    /* renamed from: i, reason: collision with root package name */
    public static final Map f50392i;

    /* renamed from: a, reason: collision with root package name */
    public final Map f50393a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List f50394b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C4843a f50395c = new C4843a();

    /* renamed from: d, reason: collision with root package name */
    public C4724b f50396d = null;

    /* renamed from: e, reason: collision with root package name */
    public C4724b f50397e = null;

    /* renamed from: f, reason: collision with root package name */
    public C4724b f50398f = null;

    /* renamed from: g, reason: collision with root package name */
    public C4724b f50399g = null;

    /* renamed from: h, reason: collision with root package name */
    public H1 f50400h = null;

    static {
        HashMap hashMap = new HashMap();
        f50392i = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    public void a(C4724b c4724b) {
        if (c4724b != null) {
            this.f50394b.add(c4724b);
        }
    }

    public void b(List list) {
        if (list != null) {
            this.f50394b.addAll(list);
        }
    }

    public void c() {
        InterfaceC4765j0 d10 = this.f50395c.d();
        try {
            Iterator it = this.f50393a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null && ((String) entry.getKey()).startsWith("sentry:")) {
                }
                it.remove();
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Object d(String str) {
        InterfaceC4765j0 d10 = this.f50395c.d();
        try {
            Object obj = this.f50393a.get(str);
            if (d10 != null) {
                d10.close();
            }
            return obj;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Object e(String str, Class cls) {
        InterfaceC4765j0 d10 = this.f50395c.d();
        try {
            Object obj = this.f50393a.get(str);
            if (cls.isInstance(obj)) {
                if (d10 != null) {
                    d10.close();
                    return obj;
                }
            } else {
                if (!l(obj, cls)) {
                    if (d10 != null) {
                        d10.close();
                    }
                    return null;
                }
                if (d10 != null) {
                    d10.close();
                }
            }
            return obj;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public List f() {
        return new ArrayList(this.f50394b);
    }

    public H1 g() {
        return this.f50400h;
    }

    public C4724b h() {
        return this.f50396d;
    }

    public C4724b i() {
        return this.f50398f;
    }

    public C4724b j() {
        return this.f50399g;
    }

    public C4724b k() {
        return this.f50397e;
    }

    public final boolean l(Object obj, Class cls) {
        Class cls2 = (Class) f50392i.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void m(String str, Object obj) {
        InterfaceC4765j0 d10 = this.f50395c.d();
        try {
            this.f50393a.put(str, obj);
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void n(H1 h12) {
        this.f50400h = h12;
    }

    public void o(C4724b c4724b) {
        this.f50396d = c4724b;
    }

    public void p(C4724b c4724b) {
        this.f50398f = c4724b;
    }

    public void q(C4724b c4724b) {
        this.f50399g = c4724b;
    }

    public void r(C4724b c4724b) {
        this.f50397e = c4724b;
    }
}
