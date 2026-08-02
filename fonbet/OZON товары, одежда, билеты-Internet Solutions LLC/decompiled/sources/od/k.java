package od;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import od.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class k implements h<Method> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Method f78057a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Type> f78058b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class f78059c;

    public static final class a extends k implements g {

        /* renamed from: d, reason: collision with root package name */
        private final Object f78060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Method unboxMethod, Object obj) {
            super(unboxMethod, K.f71697a);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
            this.f78060d = obj;
        }

        @Override // od.h
        public final Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            h.a.a(this, args);
            return c(args, this.f78060d);
        }
    }

    public static final class b extends k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Method unboxMethod) {
            super(unboxMethod, C7714v.a0(unboxMethod.getDeclaringClass()));
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
        }

        @Override // od.h
        public final Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            h.a.a(this, args);
            return c(args.length <= 1 ? new Object[0] : C7705l.w(1, args.length, args), args[0]);
        }
    }

    public k(Method method, List list) {
        this.f78057a = method;
        this.f78058b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.f78059c = returnType;
    }

    @Override // od.h
    @NotNull
    public final List<Type> a() {
        return this.f78058b;
    }

    @Override // od.h
    public final /* bridge */ /* synthetic */ Method b() {
        return null;
    }

    protected final Object c(@NotNull Object[] args, Object obj) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f78057a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    @Override // od.h
    @NotNull
    public final Type getReturnType() {
        return this.f78059c;
    }
}
