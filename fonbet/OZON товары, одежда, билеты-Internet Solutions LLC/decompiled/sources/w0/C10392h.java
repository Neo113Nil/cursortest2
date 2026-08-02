package w0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import b1.C5503f;
import b1.C5517t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l0.m0;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.C9129i;
import u0.C9915y;

/* renamed from: w0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10392h {
    public static final void a(@NotNull C10386b c10386b, androidx.compose.ui.e eVar, O o11, C9915y c9915y, C5179b.l lVar, C5179b.e eVar2, C9129i c9129i, boolean z11, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        C5517t c5517t;
        O o12;
        C5179b.l g10;
        C9129i c9129i2;
        int i12;
        C9915y c9915y2;
        O o13;
        C9915y c9915y3;
        C9129i c9129i3;
        C5179b.l lVar2;
        C3969l u11 = interfaceC3967k.u(1485410512);
        int i13 = i11 | (u11.n(c10386b) ? 4 : 2) | (u11.n(eVar) ? 32 : 16) | 93312 | (u11.n(eVar2) ? 1048576 : 524288) | 4194304 | (u11.F(function1) ? 536870912 : 268435456);
        if ((306783379 & i13) == 306783378 && u11.b()) {
            u11.j();
            o13 = o11;
            c9915y3 = c9915y;
            lVar2 = lVar;
            c9129i3 = c9129i;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                int i14 = S.f103245b;
                Object[] objArr = new Object[0];
                c5517t = O.f103208t;
                boolean r11 = u11.r(0) | u11.r(0);
                Object C11 = u11.C();
                if (r11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new T(0);
                    u11.x(C11);
                }
                o12 = (O) C5503f.c(objArr, c5517t, (Function0) C11, u11, 0, 4);
                float f7 = 0;
                C9915y c9915y4 = new C9915y(f7, f7, f7, f7);
                g10 = C5179b.g();
                InterfaceC7976A b11 = m0.b(u11);
                boolean n11 = u11.n(b11);
                Object C12 = u11.C();
                if (n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C9129i(b11);
                    u11.x(C12);
                }
                c9129i2 = (C9129i) C12;
                i12 = i13 & (-29819777);
                c9915y2 = c9915y4;
            } else {
                u11.j();
                i12 = i13 & (-29819777);
                o12 = o11;
                c9915y2 = c9915y;
                g10 = lVar;
                c9129i2 = c9129i;
            }
            u11.j0();
            int i15 = i12 >> 3;
            int i16 = (i12 & 14) | ((i12 >> 15) & 112) | 384;
            boolean z12 = ((((i16 & 14) ^ 6) > 4 && u11.n(c10386b)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && u11.n(eVar2)) || (i16 & 48) == 32);
            Object C13 = u11.C();
            if (z12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C10388d(new C10391g(c9915y2, c10386b, eVar2));
                u11.x(C13);
            }
            o13 = o12;
            C9129i c9129i4 = c9129i2;
            z.a(eVar, o13, (M) C13, c9915y2, c9129i4, z11, g10, eVar2, function1, u11, (i15 & 14) | 12807168 | ((i12 << 9) & 1879048192), (i12 >> 27) & 14);
            u11 = u11;
            c9915y3 = c9915y2;
            c9129i3 = c9129i4;
            lVar2 = g10;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C10390f(c10386b, eVar, o13, c9915y3, lVar2, eVar2, c9129i3, z11, function1, i11));
        }
    }
}
