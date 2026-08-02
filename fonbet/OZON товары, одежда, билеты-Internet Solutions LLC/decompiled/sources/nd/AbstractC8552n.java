package nd;

import Rd.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8552n {

    /* renamed from: nd.n$a */
    /* loaded from: classes10.dex */
    public static final class a extends AbstractC8552n {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Method> f77002a;

        /* renamed from: nd.n$a$a, reason: collision with other inner class name */
        public static final class C1297a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(((Method) t2).getName(), ((Method) t11).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<?> jClass) {
            super(0);
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Object[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            C1297a comparator = new C1297a();
            Intrinsics.checkNotNullParameter(declaredMethods, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            Intrinsics.checkNotNullParameter(declaredMethods, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            if (declaredMethods.length != 0) {
                declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
                Intrinsics.checkNotNullExpressionValue(declaredMethods, "copyOf(...)");
                C7705l.a0(declaredMethods, comparator);
            }
            this.f77002a = C7705l.e(declaredMethods);
        }

        @Override // nd.AbstractC8552n
        @NotNull
        public final String a() {
            return C7714v.V(this.f77002a, "", "<init>(", ")V", C8550m.f77000a, 24);
        }

        @NotNull
        public final List<Method> b() {
            return this.f77002a;
        }
    }

    /* renamed from: nd.n$b */
    /* loaded from: classes10.dex */
    public static final class b extends AbstractC8552n {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Constructor<?> f77003a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Constructor<?> constructor) {
            super(0);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            this.f77003a = constructor;
        }

        @Override // nd.AbstractC8552n
        @NotNull
        public final String a() {
            Class<?>[] parameterTypes = this.f77003a.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return C7705l.P(parameterTypes, "", "<init>(", ")V", C8554o.f77011a, 24);
        }

        @NotNull
        public final Constructor<?> b() {
            return this.f77003a;
        }
    }

    /* renamed from: nd.n$c */
    /* loaded from: classes10.dex */
    public static final class c extends AbstractC8552n {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Method f77004a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Method method) {
            super(0);
            Intrinsics.checkNotNullParameter(method, "method");
            this.f77004a = method;
        }

        @Override // nd.AbstractC8552n
        @NotNull
        public final String a() {
            return e1.a(this.f77004a);
        }

        @NotNull
        public final Method b() {
            return this.f77004a;
        }
    }

    /* renamed from: nd.n$d */
    public static final class d extends AbstractC8552n {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d.b f77005a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f77006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull d.b signature) {
            super(0);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f77005a = signature;
            this.f77006b = signature.a();
        }

        @Override // nd.AbstractC8552n
        @NotNull
        public final String a() {
            return this.f77006b;
        }

        @NotNull
        public final String b() {
            return this.f77005a.c();
        }
    }

    /* renamed from: nd.n$e */
    public static final class e extends AbstractC8552n {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d.b f77007a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f77008b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull d.b signature) {
            super(0);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f77007a = signature;
            this.f77008b = signature.a();
        }

        @Override // nd.AbstractC8552n
        @NotNull
        public final String a() {
            return this.f77008b;
        }

        @NotNull
        public final String b() {
            return this.f77007a.c();
        }

        @NotNull
        public final String c() {
            return this.f77007a.d();
        }
    }

    public AbstractC8552n(int i11) {
    }

    @NotNull
    public abstract String a();
}
