package v0;

import B1.AbstractC2531a;
import B1.W;
import S0.InterfaceC3967k;
import b1.C5503f;
import b1.C5517t;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final float f101514a = 1;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C10157B f101515b = new C10157B(null, 0, false, 0.0f, new a(), 0.0f, false, xe.N.a(kotlin.coroutines.g.f71771a), Z1.f.b(), Z1.c.b(0, 0, 15), kotlin.collections.K.f71697a, 0, 0, 0, EnumC9142v.Vertical, 0, 0);

    public static final class a implements W {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<AbstractC2531a, Integer> f101516a = U.c();

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
            return this.f101516a;
        }

        @Override // B1.W
        public final void u() {
        }
    }

    @NotNull
    public static final I c(int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        Object[] objArr = new Object[0];
        C5517t c5517t = I.f101467x;
        boolean r11 = interfaceC3967k.r(i11) | interfaceC3967k.r(i12);
        Object C11 = interfaceC3967k.C();
        if (r11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new N(i11, i12);
            interfaceC3967k.x(C11);
        }
        return (I) C5503f.c(objArr, c5517t, (Function0) C11, interfaceC3967k, 0, 4);
    }
}
