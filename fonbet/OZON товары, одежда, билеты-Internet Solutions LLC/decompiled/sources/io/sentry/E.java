package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final HashMap f66609h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap f66610a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f66611b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66612c = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    private C7125b f66613d = null;

    /* renamed from: e, reason: collision with root package name */
    private C7125b f66614e = null;

    /* renamed from: f, reason: collision with root package name */
    private C7125b f66615f = null;

    /* renamed from: g, reason: collision with root package name */
    private C7194q1 f66616g = null;

    static {
        HashMap hashMap = new HashMap();
        f66609h = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    public final void a(C7125b c7125b) {
        this.f66611b.add(c7125b);
    }

    public final void b(List<C7125b> list) {
        if (list != null) {
            this.f66611b.addAll(list);
        }
    }

    public final void c() {
        InterfaceC7097a0 a11 = this.f66612c.a();
        try {
            Iterator it = this.f66610a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null && ((String) entry.getKey()).startsWith("sentry:")) {
                }
                it.remove();
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object d(@NotNull String str) {
        InterfaceC7097a0 a11 = this.f66612c.a();
        try {
            Object obj = this.f66610a.get(str);
            a11.close();
            return obj;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object e(@NotNull Class cls, @NotNull String str) {
        InterfaceC7097a0 a11 = this.f66612c.a();
        try {
            Object obj = this.f66610a.get(str);
            if (cls.isInstance(obj)) {
                a11.close();
                return obj;
            }
            Class cls2 = (Class) f66609h.get(cls.getCanonicalName());
            if (obj != null && cls.isPrimitive() && cls2 != null) {
                if (cls2.isInstance(obj)) {
                    a11.close();
                    return obj;
                }
            }
            a11.close();
            return null;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public final ArrayList f() {
        return new ArrayList(this.f66611b);
    }

    public final C7194q1 g() {
        return this.f66616g;
    }

    public final C7125b h() {
        return this.f66613d;
    }

    public final C7125b i() {
        return this.f66615f;
    }

    public final C7125b j() {
        return this.f66614e;
    }

    public final void k(Object obj, @NotNull String str) {
        InterfaceC7097a0 a11 = this.f66612c.a();
        try {
            this.f66610a.put(str, obj);
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(C7194q1 c7194q1) {
        this.f66616g = c7194q1;
    }

    public final void m(C7125b c7125b) {
        this.f66613d = c7125b;
    }

    public final void n(C7125b c7125b) {
        this.f66615f = c7125b;
    }

    public final void o(C7125b c7125b) {
        this.f66614e = c7125b;
    }
}
