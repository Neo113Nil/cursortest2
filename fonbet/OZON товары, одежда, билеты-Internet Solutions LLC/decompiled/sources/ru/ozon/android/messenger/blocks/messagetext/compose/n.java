package ru.ozon.android.messenger.blocks.messagetext.compose;

import B0.C2510t;
import B1.V;
import D1.InterfaceC2801g;
import K1.C3422b;
import K1.M;
import K1.N;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.s;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes10.dex */
public final class n {
    public static final void a(androidx.compose.ui.e eVar, @NotNull C3422b text, long j11, T t2, C9915y c9915y, InterfaceC3967k interfaceC3967k, int i11) {
        C9915y c9915y2;
        androidx.compose.ui.e eVar2;
        C9915y c9915y3;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(-268387364);
        int i12 = i11 | 6 | (u11.n(text) ? 32 : 16) | (u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(t2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | 113246208;
        if ((38347923 & i12) == 38347922 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            c9915y3 = c9915y;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C9915y a11 = androidx.compose.foundation.layout.T.a(0.0f, 3, 0.0f);
            M a12 = N.a(u11);
            s sVar = (s) u11.m(K0.k());
            u11.o(107177604);
            boolean n11 = ((i12 & 112) == 32) | u11.n(sVar) | u11.n(a12) | ((i12 & 7168) == 2048);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                Object kVar = new k(a11, sVar, a12, text, t2);
                c9915y2 = a11;
                u11.x(kVar);
                C11 = kVar;
            } else {
                c9915y2 = a11;
            }
            V v11 = (V) C11;
            u11.k();
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f11);
            }
            U7.i.b(u11, f7, 1622509786);
            boolean z11 = (i12 & 896) == 256;
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new l(j11);
                u11.x(C12);
            }
            u11.k();
            C2510t.a(text, null, t2, null, 3, true, 0, 0, null, (InterfaceC7813c0) C12, u11, ((i12 >> 3) & 910) | 224256, 450);
            u11.f();
            eVar2 = aVar;
            c9915y3 = c9915y2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new m(eVar2, text, j11, t2, c9915y3, i11));
        }
    }
}
