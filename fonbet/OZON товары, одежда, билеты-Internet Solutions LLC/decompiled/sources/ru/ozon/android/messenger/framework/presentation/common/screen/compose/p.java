package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final float f91102a = (float) 0.5d;

    public static final void a(androidx.compose.ui.e eVar, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1685833532);
        int i12 = (u11.n(eVar) ? 4 : 2) | i11 | (u11.s(j11) ? 32 : 16);
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            b(eVar, j11, u11, (i12 & 112) | (i12 & 14) | 384);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new n(eVar, j11, i11));
        }
    }

    public static final void b(@NotNull androidx.compose.ui.e modifier, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(-1939120900);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        int i13 = i11 & 384;
        float f7 = f91102a;
        if (i13 == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            b11 = androidx.compose.foundation.e.b(a0.f(a0.e(modifier, 1.0f), f7), j11, y0.a());
            C5185h.a(b11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new o(modifier, j11, f7, i11));
        }
    }
}
