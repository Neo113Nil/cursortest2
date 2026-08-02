package nd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.i;
import kotlin.reflect.j;
import nd.J0;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8549l0<V> extends C0<V> implements kotlin.reflect.j<V> {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Object f76998p;

    /* renamed from: nd.l0$a */
    public static final class a<R> extends J0.c<R> implements j.a<R> {

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final C8549l0<R> f76999j;

        public a(@NotNull C8549l0<R> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f76999j = property;
        }

        @Override // nd.J0.a
        public final J0 D() {
            return this.f76999j;
        }

        @Override // kotlin.reflect.m.a
        public final kotlin.reflect.m b() {
            return this.f76999j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            this.f76999j.set(obj);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8549l0(@NotNull AbstractC8537f0 container, @NotNull wd.Q descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f76998p = Sc.k.a(Sc.n.PUBLICATION, new C8547k0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.i
    public final i.a getSetter() {
        return (a) this.f76998p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.j
    public final void set(V v11) {
        ((a) this.f76998p.getValue()).call(v11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.j, kotlin.reflect.i
    public final j.a getSetter() {
        return (a) this.f76998p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8549l0(@NotNull AbstractC8537f0 container, @NotNull String name, @NotNull String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f76998p = Sc.k.a(Sc.n.PUBLICATION, new C8547k0(this));
    }
}
