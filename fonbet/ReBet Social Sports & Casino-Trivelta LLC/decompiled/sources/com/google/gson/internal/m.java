package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f38310a = c();

    public class a extends m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f38311b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f38312c;

        public a(Method method, Object obj) {
            this.f38311b = method;
            this.f38312c = obj;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f38311b.invoke(this.f38312c, cls);
        }
    }

    public class b extends m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f38313b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38314c;

        public b(Method method, int i10) {
            this.f38313b = method;
            this.f38314c = i10;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f38313b.invoke(null, cls, Integer.valueOf(this.f38314c));
        }
    }

    public class c extends m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f38315b;

        public c(Method method) {
            this.f38315b = method;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f38315b.invoke(null, cls, Object.class);
        }
    }

    public class d extends m {
        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void b(Class cls) {
        String a10 = com.google.gson.internal.c.a(cls);
        if (a10 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a10);
    }

    public static m c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, intValue);
        }
    }

    public abstract Object d(Class cls);
}
