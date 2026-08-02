package nd;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nd.J0;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8557p0<D, E, V> extends I0<D, E, V> implements kotlin.reflect.i {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Object f77024p;

    /* renamed from: nd.p0$a */
    public static final class a<D, E, V> extends J0.c<V> implements InterfaceC6511n {

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final C8557p0<D, E, V> f77025j;

        public a(@NotNull C8557p0<D, E, V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f77025j = property;
        }

        @Override // nd.J0.a
        public final J0 D() {
            return this.f77025j;
        }

        @Override // kotlin.reflect.m.a
        public final kotlin.reflect.m b() {
            return this.f77025j;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            this.f77025j.getSetter().call(obj, obj2, obj3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8557p0(@NotNull AbstractC8537f0 container, @NotNull wd.Q descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f77024p = Sc.k.a(Sc.n.PUBLICATION, new C8555o0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.i
    @NotNull
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final a<D, E, V> getSetter() {
        return (a) this.f77024p.getValue();
    }
}
