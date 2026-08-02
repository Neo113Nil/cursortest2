package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5191n;
import androidx.compose.foundation.layout.a0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import l1.C7807Z;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class j {
    public static final void a(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1540038719);
        if ((i11 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.t.a(null, a1.c.c(-596856517, new C9520b(eVar), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C9521c(eVar, i11));
        }
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    private static final void b(androidx.compose.ui.e eVar, List list, float f7, int i11, int i12, float f11, C5179b.k kVar, InterfaceC3967k interfaceC3967k, int i13) {
        int i14;
        C5179b.k kVar2;
        int i15;
        int i16;
        C4912a c4912a = C9519a.f91646a;
        C3969l u11 = interfaceC3967k.u(-643378050);
        if ((i13 & 6) == 0) {
            i14 = i13 | (u11.n(eVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= u11.n(list) ? 32 : 16;
        }
        int i17 = i14 | 28032;
        if ((i13 & 196608) == 0) {
            i17 |= u11.q(f11) ? 131072 : 65536;
        }
        int i18 = i17 | 1572864;
        if ((i13 & 12582912) == 0) {
            i18 |= u11.F(c4912a) ? 8388608 : 4194304;
        }
        if ((4793491 & i18) == 4793490 && u11.b()) {
            u11.j();
            i15 = i11;
            i16 = i12;
            kVar2 = kVar;
        } else {
            f7 = 100;
            C5179b.k g10 = C5179b.g();
            C5191n.a(a0.d(eVar), null, a1.c.c(708100180, new C9523e(g10, f11, f7, list), u11), u11, 3072, 6);
            kVar2 = g10;
            i15 = 1300;
            i16 = 300;
        }
        float f12 = f7;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(eVar, list, f12, i15, i16, f11, kVar2, i13));
        }
    }

    public static final /* synthetic */ void c(androidx.compose.ui.e eVar, List list, float f7, int i11, int i12, float f11, C5179b.k kVar, InterfaceC3967k interfaceC3967k, int i13) {
        C4912a c4912a = C9519a.f91646a;
        b(eVar, list, f7, i11, i12, f11, kVar, interfaceC3967k, i13);
    }

    public static final void d(androidx.compose.ui.e eVar, float f7, A1 a12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1138372084);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.q(f7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(a12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.e d11 = a0.d(eVar);
            u11.o(1652467749);
            boolean z11 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g(a12, f7);
                u11.x(C11);
            }
            u11.k();
            u0.E.a(u11, androidx.compose.ui.draw.c.b(d11, (Function1) C11));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new h(eVar, f7, a12, i11));
        }
    }

    public static final void e(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e eVar2;
        C3969l u11 = interfaceC3967k.u(520736657);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            C4912a c4912a = C9519a.f91646a;
            eVar2 = eVar;
            b(eVar2, C7714v.b0(C7807Z.m(uniTheme.getColors(u11, i13).getBgPrimary()), C7807Z.m(uniTheme.getColors(u11, i13).getLayerFloor1()), C7807Z.m(uniTheme.getColors(u11, i13).getBgPrimary())), 0.0f, 0, 0, 0, null, u11, (i12 & 14) | 12779520);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new i(eVar2, i11));
        }
    }
}
