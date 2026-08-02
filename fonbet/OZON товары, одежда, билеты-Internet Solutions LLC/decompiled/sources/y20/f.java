package y20;

import K1.A;
import K1.T;
import S0.B1;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import S0.O;
import S1.p;
import Sc.o;
import V1.f;
import a1.C4912a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final O f105972a = new O(b.f105975b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final B1 f105973b = new B1(a.f105974b);

    static final class a extends AbstractC7737t implements Function0<z20.g> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f105974b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final z20.g invoke() {
            return z20.e.f106969a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f105975b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t2;
            t2 = T.f15012d;
            return T.c(t2, 0L, 0L, null, null, null, 0L, null, null, 0L, new A(), new V1.f(f.a.f27910a, 0), 15204351);
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105976a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105976a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i iVar, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object obj;
        C3969l u11 = interfaceC3967k.u(1000681209);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            int i13 = c.f105976a[iVar.ordinal()];
            if (i13 == 1) {
                obj = z20.e.f106969a;
            } else {
                if (i13 != 2) {
                    throw new o();
                }
                obj = z20.c.f106947a;
            }
            C3996z.a(f105973b.c(obj), a1.c.c(-1177697351, new d(c4912a), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new e(iVar, c4912a, i11));
        }
    }

    public static final void b(boolean z11, @NotNull C4912a content, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1413541323);
        if (((i11 | 2) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                z11 = p.a(u11);
            } else {
                u11.j();
            }
            u11.j0();
            a(z11 ? i.Dark : i.Light, content, u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new y20.b(z11, content, i11));
        }
    }

    public static final void d(T t2, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1884753997);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(t2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            O o11 = f105972a;
            C3996z.a(o11.c(((T) u11.m(o11)).E(t2)), c4912a, u11, (i12 & 112) | 8);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(t2, c4912a, i11));
        }
    }

    @NotNull
    public static final B1 e() {
        return f105973b;
    }

    @NotNull
    public static final O f() {
        return f105972a;
    }
}
