package nd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import kotlin.reflect.n;
import nd.J0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class C0<V> extends J0<V> implements kotlin.reflect.n<V> {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f76854n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f76855o;

    public static final class a<R> extends J0.b<R> implements n.a<R> {

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final C0<R> f76856j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull C0<? extends R> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f76856j = property;
        }

        @Override // nd.J0.a
        public final J0 D() {
            return this.f76856j;
        }

        @Override // kotlin.reflect.m.a
        public final kotlin.reflect.m b() {
            return this.f76856j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return this.f76856j.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(@NotNull AbstractC8537f0 container, @NotNull wd.Q descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f76854n = Sc.k.a(nVar, new A0(this));
        this.f76855o = Sc.k.a(nVar, new B0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.J0
    public final J0.b I() {
        return (a) this.f76854n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.n
    public final V get() {
        return (V) ((a) this.f76854n.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.m
    public final m.b getGetter() {
        return (a) this.f76854n.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final V invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.m
    public final n.a getGetter() {
        return (a) this.f76854n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(@NotNull AbstractC8537f0 container, @NotNull String name, @NotNull String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f76854n = Sc.k.a(nVar, new A0(this));
        this.f76855o = Sc.k.a(nVar, new B0(this));
    }
}
