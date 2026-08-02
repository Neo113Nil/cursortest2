package zd;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11099a {

    /* renamed from: a, reason: collision with root package name */
    private static C2346a f108813a;

    /* renamed from: zd.a$a, reason: collision with other inner class name */
    public static final class C2346a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f108814a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f108815b;

        public C2346a(Method method, Method method2) {
            this.f108814a = method;
            this.f108815b = method2;
        }

        public final Method a() {
            return this.f108815b;
        }

        public final Method b() {
            return this.f108814a;
        }
    }

    private static C2346a a(Object obj) {
        C2346a c2346a = f108813a;
        if (c2346a == null) {
            Class<?> cls = obj.getClass();
            try {
                c2346a = new C2346a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c2346a = new C2346a(null, null);
            }
            f108813a = c2346a;
        }
        return c2346a;
    }

    public static Method b(@NotNull Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method a11 = a(recordComponent).a();
        if (a11 == null) {
            return null;
        }
        Object invoke = a11.invoke(recordComponent, new Object[0]);
        Intrinsics.g(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    public static Class c(@NotNull Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method b11 = a(recordComponent).b();
        if (b11 == null) {
            return null;
        }
        Object invoke = b11.invoke(recordComponent, new Object[0]);
        Intrinsics.g(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
