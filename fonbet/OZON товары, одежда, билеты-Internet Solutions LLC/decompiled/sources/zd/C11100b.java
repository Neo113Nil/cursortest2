package zd;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C11100b {

    /* renamed from: a, reason: collision with root package name */
    private static a f108816a;

    /* renamed from: zd.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f108817a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f108818b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f108819c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f108820d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f108817a = method;
            this.f108818b = method2;
            this.f108819c = method3;
            this.f108820d = method4;
        }

        public final Method a() {
            return this.f108818b;
        }

        public final Method b() {
            return this.f108820d;
        }

        public final Method c() {
            return this.f108819c;
        }

        public final Method d() {
            return this.f108817a;
        }
    }

    private static a a() {
        a aVar;
        a aVar2 = f108816a;
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            aVar = new a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            aVar = new a(null, null, null, null);
        }
        f108816a = aVar;
        return aVar;
    }

    public static Class[] b(@NotNull Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method a11 = a().a();
        if (a11 == null) {
            return null;
        }
        Object invoke = a11.invoke(clazz, new Object[0]);
        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    public static Object[] c(@NotNull Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method b11 = a().b();
        if (b11 == null) {
            return null;
        }
        return (Object[]) b11.invoke(clazz, new Object[0]);
    }

    public static Boolean d(@NotNull Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method c11 = a().c();
        if (c11 == null) {
            return null;
        }
        Object invoke = c11.invoke(clazz, new Object[0]);
        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    public static Boolean e(@NotNull Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method d11 = a().d();
        if (d11 == null) {
            return null;
        }
        Object invoke = d11.invoke(clazz, new Object[0]);
        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
