package nd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.i;
import kotlin.reflect.k;
import nd.J0;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8553n0<T, V> extends F0<T, V> implements kotlin.reflect.k<T, V> {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Object f77009p;

    /* renamed from: nd.n0$a */
    /* loaded from: classes10.dex */
    public static final class a<T, V> extends J0.c<V> implements k.a<T, V> {

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final C8553n0<T, V> f77010j;

        public a(@NotNull C8553n0<T, V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f77010j = property;
        }

        @Override // nd.J0.a
        public final J0 D() {
            return this.f77010j;
        }

        @Override // kotlin.reflect.m.a
        public final kotlin.reflect.m b() {
            return this.f77010j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Object obj2) {
            this.f77010j.y(obj, obj2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8553n0(@NotNull AbstractC8537f0 container, @NotNull String name, @NotNull String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f77009p = Sc.k.a(Sc.n.PUBLICATION, new C8551m0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.i
    public final i.a getSetter() {
        return (a) this.f77009p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.k
    public final void y(T t2, V v11) {
        ((a) this.f77009p.getValue()).call(t2, v11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.k, kotlin.reflect.i
    public final k.a getSetter() {
        return (a) this.f77009p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8553n0(@NotNull AbstractC8537f0 container, @NotNull wd.Q descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f77009p = Sc.k.a(Sc.n.PUBLICATION, new C8551m0(this));
    }
}
