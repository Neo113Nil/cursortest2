package y0;

import B1.AbstractC2531a;
import S0.InterfaceC3967k;
import b1.C5503f;
import b1.C5517t;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import s0.InterfaceC9574q;

/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f105774a = 56;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final N f105775b = new N(kotlin.collections.K.f71697a, 0, 0, 0, EnumC9142v.Horizontal, 0, 0, 0, InterfaceC9574q.a.f98090a, new a(), xe.N.a(kotlin.coroutines.g.f71771a));

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final b f105776c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f105777d = 0;

    public static final class a implements B1.W {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<AbstractC2531a, Integer> f105778a = kotlin.collections.U.c();

        a() {
        }

        @Override // B1.W
        public final int getHeight() {
            return 0;
        }

        @Override // B1.W
        public final int getWidth() {
            return 0;
        }

        @Override // B1.W
        @NotNull
        public final Map<AbstractC2531a, Integer> s() {
            return this.f105778a;
        }

        @Override // B1.W
        public final void u() {
        }
    }

    public static final class b implements Z1.d {
        @Override // Z1.d
        public final float g() {
            return 1.0f;
        }

        @Override // Z1.k
        public final float u1() {
            return 1.0f;
        }
    }

    public static final long b(@NotNull InterfaceC10793C interfaceC10793C, int i11) {
        long pageSize = (i11 * (interfaceC10793C.getPageSize() + interfaceC10793C.g())) + interfaceC10793C.c() + interfaceC10793C.b();
        int a11 = (int) (interfaceC10793C.getOrientation() == EnumC9142v.Horizontal ? interfaceC10793C.a() >> 32 : interfaceC10793C.a() & 4294967295L);
        interfaceC10793C.d().getClass();
        long e11 = pageSize - (a11 - kotlin.ranges.h.e(0, 0, a11));
        if (e11 < 0) {
            return 0L;
        }
        return e11;
    }

    public static final float c() {
        return f105774a;
    }

    @NotNull
    public static final N d() {
        return f105775b;
    }

    @NotNull
    public static final b0 e(@NotNull Function0 function0, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        C5517t c5517t;
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        Object[] objArr = new Object[0];
        c5517t = C10795b.f105735J;
        boolean r11 = interfaceC3967k.r(i11) | interfaceC3967k.q(0.0f) | interfaceC3967k.n(function0);
        Object C11 = interfaceC3967k.C();
        if (r11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new e0(i11, function0);
            interfaceC3967k.x(C11);
        }
        C10795b c10795b = (C10795b) C5503f.c(objArr, c5517t, (Function0) C11, interfaceC3967k, 0, 4);
        c10795b.Y().setValue(function0);
        return c10795b;
    }
}
