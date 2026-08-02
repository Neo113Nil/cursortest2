package nd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import kotlin.reflect.o;
import nd.J0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class F0<T, V> extends J0<V> implements kotlin.reflect.o<T, V> {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f76862n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f76863o;

    public static final class a<T, V> extends J0.b<V> implements o.a<T, V> {

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final F0<T, V> f76864j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull F0<T, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f76864j = property;
        }

        @Override // nd.J0.a
        public final J0 D() {
            return this.f76864j;
        }

        @Override // kotlin.reflect.m.a
        public final kotlin.reflect.m b() {
            return this.f76864j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final V invoke(T t2) {
            return this.f76864j.get(t2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(@NotNull AbstractC8537f0 container, @NotNull String name, @NotNull String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f76862n = Sc.k.a(nVar, new D0(this));
        this.f76863o = Sc.k.a(nVar, new E0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.J0
    public final J0.b I() {
        return (a) this.f76862n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.o
    public final V get(T t2) {
        return ((a) this.f76862n.getValue()).call(t2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.m
    public final m.b getGetter() {
        return (a) this.f76862n.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final V invoke(T t2) {
        return get(t2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.m
    public final o.a getGetter() {
        return (a) this.f76862n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(@NotNull AbstractC8537f0 container, @NotNull wd.Q descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f76862n = Sc.k.a(nVar, new D0(this));
        this.f76863o = Sc.k.a(nVar, new E0(this));
    }
}
