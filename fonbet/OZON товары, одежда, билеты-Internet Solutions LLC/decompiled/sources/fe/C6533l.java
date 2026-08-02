package fe;

import Pd.h;
import ie.C7056e;
import ie.InterfaceC7060i;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import td.C9825P;
import td.InterfaceC9820K;
import td.InterfaceC9839e;
import td.d0;
import vd.InterfaceC10305b;

/* renamed from: fe.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6533l {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.b> f63216c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f63217d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6535n f63218a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i f63219b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fe.l$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Sd.b f63220a;

        /* renamed from: b, reason: collision with root package name */
        private final C6530i f63221b;

        public a(@NotNull Sd.b classId, C6530i c6530i) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f63220a = classId;
            this.f63221b = c6530i;
        }

        public final C6530i a() {
            return this.f63221b;
        }

        @NotNull
        public final Sd.b b() {
            return this.f63220a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.d(this.f63220a, ((a) obj).f63220a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f63220a.hashCode();
        }
    }

    static {
        Sd.c topLevelFqName = s.a.f81901c.l();
        Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        f63216c = e0.h(new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")));
    }

    public C6533l(@NotNull C6535n components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f63218a = components;
        this.f63219b = ((C7056e) components.u()).j(new C6532k(this));
    }

    static InterfaceC9839e b(C6533l c6533l, a key) {
        C6530i a11;
        Object obj;
        C6537p a12;
        Intrinsics.checkNotNullParameter(key, "key");
        c6533l.getClass();
        Sd.b b11 = key.b();
        C6535n c6535n = c6533l.f63218a;
        Iterator<InterfaceC10305b> it = c6535n.l().iterator();
        while (it.hasNext()) {
            InterfaceC9839e c11 = it.next().c(b11);
            if (c11 != null) {
                return c11;
            }
        }
        if (!f63216c.contains(b11) && ((a11 = key.a()) != null || (a11 = c6535n.e().a(b11)) != null)) {
            Pd.c a13 = a11.a();
            Nd.b b12 = a11.b();
            Pd.a c12 = a11.c();
            d0 d11 = a11.d();
            Sd.b e11 = b11.e();
            if (e11 != null) {
                InterfaceC9839e c13 = c6533l.c(e11, null);
                he.n nVar = c13 instanceof he.n ? (he.n) c13 : null;
                if (nVar != null && nVar.V0(b11.h())) {
                    a12 = nVar.P0();
                    return new he.n(a12, b12, a13, c12, d11);
                }
            } else {
                Iterator it2 = C9825P.c(c6535n.s(), b11.f()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    InterfaceC9820K interfaceC9820K = (InterfaceC9820K) obj;
                    if (!(interfaceC9820K instanceof r)) {
                        break;
                    }
                    r rVar = (r) interfaceC9820K;
                    Sd.f name = b11.h();
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    if (((he.z) ((AbstractC6541u) rVar).p()).o().contains(name)) {
                        break;
                    }
                }
                InterfaceC9820K interfaceC9820K2 = (InterfaceC9820K) obj;
                if (interfaceC9820K2 != null) {
                    Nd.s M02 = b12.M0();
                    Intrinsics.checkNotNullExpressionValue(M02, "getTypeTable(...)");
                    Pd.g gVar = new Pd.g(M02);
                    int i11 = Pd.h.f22262c;
                    Nd.v N02 = b12.N0();
                    Intrinsics.checkNotNullExpressionValue(N02, "getVersionRequirementTable(...)");
                    a12 = c6533l.f63218a.a(interfaceC9820K2, a13, gVar, h.a.a(N02), c12, null);
                    c12 = c12;
                    return new he.n(a12, b12, a13, c12, d11);
                }
            }
        }
        return null;
    }

    public final InterfaceC9839e c(@NotNull Sd.b classId, C6530i c6530i) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (InterfaceC9839e) this.f63219b.invoke(new a(classId, c6530i));
    }
}
