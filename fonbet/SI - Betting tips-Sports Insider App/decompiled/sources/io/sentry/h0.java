package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f16444h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16445a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16446b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f16447c = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    public a f16448d = null;

    /* renamed from: e, reason: collision with root package name */
    public a f16449e = null;

    /* renamed from: f, reason: collision with root package name */
    public a f16450f = null;

    /* renamed from: g, reason: collision with root package name */
    public o3 f16451g = null;

    static {
        HashMap hashMap = new HashMap();
        f16444h = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    public final void a() {
        r a7 = this.f16447c.a();
        try {
            Iterator it = this.f16445a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null && ((String) entry.getKey()).startsWith("sentry:")) {
                }
                it.remove();
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object b(String str) {
        r a7 = this.f16447c.a();
        try {
            Object obj = this.f16445a.get(str);
            a7.close();
            return obj;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object c(Class cls, String str) {
        r a7 = this.f16447c.a();
        try {
            Object obj = this.f16445a.get(str);
            if (cls.isInstance(obj)) {
                a7.close();
                return obj;
            }
            Class cls2 = (Class) f16444h.get(cls.getCanonicalName());
            if (obj != null && cls.isPrimitive() && cls2 != null) {
                if (cls2.isInstance(obj)) {
                    a7.close();
                    return obj;
                }
            }
            a7.close();
            return null;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void d(Object obj, String str) {
        r a7 = this.f16447c.a();
        try {
            this.f16445a.put(str, obj);
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
