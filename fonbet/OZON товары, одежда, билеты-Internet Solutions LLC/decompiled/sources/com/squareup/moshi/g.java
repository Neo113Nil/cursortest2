package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public abstract class g<T> {

    public static final class a {

        /* renamed from: com.squareup.moshi.g$a$a, reason: collision with other inner class name */
        public static final class C0917a extends g<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Constructor<? extends Object> f60403a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Class<?> f60404b;

            C0917a(Constructor<? extends Object> constructor, Class<?> cls) {
                this.f60403a = constructor;
                this.f60404b = cls;
            }

            @Override // com.squareup.moshi.g
            public final T a() {
                return (T) this.f60403a.newInstance(new Object[0]);
            }

            public final String toString() {
                return this.f60404b.getName();
            }
        }

        public static final class b extends g<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Method f60405a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f60406b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Class<?> f60407c;

            b(Method method, Object obj, Class<?> cls) {
                this.f60405a = method;
                this.f60406b = obj;
                this.f60407c = cls;
            }

            @Override // com.squareup.moshi.g
            public final T a() {
                return (T) this.f60405a.invoke(this.f60406b, this.f60407c);
            }

            public final String toString() {
                return this.f60407c.getName();
            }
        }

        public static final class c extends g<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Method f60408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Class<?> f60409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f60410c;

            c(Method method, Class<?> cls, int i11) {
                this.f60408a = method;
                this.f60409b = cls;
                this.f60410c = i11;
            }

            @Override // com.squareup.moshi.g
            public final T a() {
                return (T) this.f60408a.invoke(null, this.f60409b, Integer.valueOf(this.f60410c));
            }

            public final String toString() {
                return this.f60409b.getName();
            }
        }

        public static final class d extends g<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Method f60411a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Class<?> f60412b;

            d(Class cls, Method method) {
                this.f60411a = method;
                this.f60412b = cls;
            }

            @Override // com.squareup.moshi.g
            public final T a() {
                return (T) this.f60411a.invoke(null, this.f60412b, Object.class);
            }

            public final String toString() {
                return this.f60412b.getName();
            }
        }

        @NotNull
        public static g a(@NotNull Class rawType) {
            Intrinsics.checkNotNullParameter(rawType, "rawType");
            try {
                Constructor<T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return new C0917a(declaredConstructor, rawType);
            } catch (NoSuchMethodException unused) {
                try {
                    try {
                        try {
                            Class<?> cls = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            return new b(cls.getMethod("allocateInstance", Class.class), declaredField.get(null), rawType);
                        } catch (Exception unused2) {
                            throw new IllegalArgumentException("cannot construct instances of ".concat(rawType.getName()));
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        Object invoke = declaredMethod.invoke(null, Object.class);
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) invoke).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new c(declaredMethod2, rawType, intValue);
                    } catch (IllegalAccessException unused4) {
                        throw new AssertionError();
                    }
                } catch (IllegalAccessException unused5) {
                    throw new AssertionError();
                } catch (NoSuchMethodException unused6) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new d(rawType, declaredMethod3);
                } catch (InvocationTargetException e11) {
                    Y9.c.n(e11);
                    throw null;
                }
            }
        }
    }

    public abstract T a();
}
