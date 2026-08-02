package zd;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11101c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C11101c f108821a = new C11101c();

    /* renamed from: b, reason: collision with root package name */
    private static a f108822b;

    /* renamed from: zd.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f108823a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f108824b;

        public a(Method method, Method method2) {
            this.f108823a = method;
            this.f108824b = method2;
        }

        public final Method a() {
            return this.f108824b;
        }

        public final Method b() {
            return this.f108823a;
        }
    }

    @NotNull
    public static a a(@NotNull Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), C11104f.f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final ArrayList b(@NotNull Member member) {
        Method a11;
        Intrinsics.checkNotNullParameter(member, "member");
        a aVar = f108822b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f108822b;
                if (aVar == null) {
                    aVar = a(member);
                    f108822b = aVar;
                }
            }
        }
        Method b11 = aVar.b();
        if (b11 == null || (a11 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b11.invoke(member, new Object[0]);
        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a11.invoke(obj, new Object[0]);
            Intrinsics.g(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
