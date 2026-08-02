package nd;

import kotlin.jvm.internal.AbstractC7724f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import kotlin.reflect.p;
import nd.J0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class I0<D, E, V> extends J0<V> implements kotlin.reflect.p<D, E, V> {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f76870n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f76871o;

    /* loaded from: classes10.dex */
    public static final class a<D, E, V> extends J0.b<V> implements p.a<D, E, V> {

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final I0<D, E, V> f76872j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull I0<D, E, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f76872j = property;
        }

        @Override // nd.J0.a
        public final J0 D() {
            return this.f76872j;
        }

        @Override // kotlin.reflect.m.a
        public final kotlin.reflect.m b() {
            return this.f76872j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final V invoke(D d11, E e11) {
            return this.f76872j.L(d11, e11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(@NotNull AbstractC8537f0 container, @NotNull String name, @NotNull String signature) {
        super(container, name, signature, AbstractC7724f.NO_RECEIVER);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f76870n = Sc.k.a(nVar, new G0(this));
        this.f76871o = Sc.k.a(nVar, new H0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.J0
    public final J0.b I() {
        return (a) this.f76870n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final V L(D d11, E e11) {
        return ((a) this.f76870n.getValue()).call(d11, e11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.m
    public final m.b getGetter() {
        return (a) this.f76870n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final V invoke(D d11, E e11) {
        return ((a) this.f76870n.getValue()).call(d11, e11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.m
    public final p.a getGetter() {
        return (a) this.f76870n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(@NotNull AbstractC8537f0 container, @NotNull wd.Q descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f76870n = Sc.k.a(nVar, new G0(this));
        this.f76871o = Sc.k.a(nVar, new H0(this));
    }
}
