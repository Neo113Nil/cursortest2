package nd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9847m;
import td.InterfaceC9857w;
import wd.AbstractC10518d;
import wd.AbstractC10523i;
import wd.AbstractC10527m;
import wd.C10513E;
import wd.C10528n;

/* renamed from: nd.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8544j implements InterfaceC9847m<AbstractC8504A<?>, Unit> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC8537f0 f76988a;

    public C8544j(@NotNull AbstractC8537f0 container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f76988a = container;
    }

    @Override // td.InterfaceC9847m
    public final Object a(AbstractC10523i abstractC10523i, StringBuilder sb2) {
        return null;
    }

    @Override // td.InterfaceC9847m
    public Object b(C10528n c10528n, Object obj) {
        return i(c10528n, obj);
    }

    @Override // td.InterfaceC9847m
    public final Object c(wd.Q descriptor, Object obj) {
        Unit data = (Unit) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = (descriptor.c0() != null ? 1 : 0) + (descriptor.d0() != null ? 1 : 0);
        boolean B11 = descriptor.B();
        AbstractC8537f0 abstractC8537f0 = this.f76988a;
        if (B11) {
            if (i11 == 0) {
                return new C8549l0(abstractC8537f0, descriptor);
            }
            if (i11 == 1) {
                return new C8553n0(abstractC8537f0, descriptor);
            }
            if (i11 == 2) {
                return new C8557p0(abstractC8537f0, descriptor);
            }
        } else {
            if (i11 == 0) {
                return new C0(abstractC8537f0, descriptor);
            }
            if (i11 == 1) {
                return new F0(abstractC8537f0, descriptor);
            }
            if (i11 == 2) {
                return new I0(abstractC8537f0, descriptor);
            }
        }
        throw new V0("Unsupported property: " + descriptor);
    }

    @Override // td.InterfaceC9847m
    public final Object d(AbstractC10527m abstractC10527m, StringBuilder sb2) {
        return null;
    }

    @Override // td.InterfaceC9847m
    public final Object e(wd.G g10, StringBuilder sb2) {
        return null;
    }

    @Override // td.InterfaceC9847m
    public final Object f(AbstractC10518d abstractC10518d, StringBuilder sb2) {
        return null;
    }

    @Override // td.InterfaceC9847m
    public final Object g(wd.N n11, StringBuilder sb2) {
        return null;
    }

    @Override // td.InterfaceC9847m
    public final Object h(C10513E c10513e, StringBuilder sb2) {
        return null;
    }

    @Override // td.InterfaceC9847m
    public final AbstractC8504A<?> i(InterfaceC9857w descriptor, Unit unit) {
        Unit data = unit;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C8545j0(this.f76988a, descriptor);
    }

    @Override // td.InterfaceC9847m
    public final Object j(wd.S s11, Object obj) {
        return i(s11, obj);
    }

    @Override // td.InterfaceC9847m
    public final Object k(wd.T t2, Object obj) {
        return i(t2, obj);
    }

    @Override // td.InterfaceC9847m
    public final Object l(wd.L l11, StringBuilder sb2) {
        return null;
    }

    @Override // td.InterfaceC9847m
    public final Object m(wd.c0 c0Var, StringBuilder sb2) {
        return null;
    }
}
