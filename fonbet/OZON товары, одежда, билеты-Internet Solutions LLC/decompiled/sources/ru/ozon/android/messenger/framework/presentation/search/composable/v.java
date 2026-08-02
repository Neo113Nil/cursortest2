package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.search.C9525e;
import ru.ozon.android.messenger.framework.presentation.search.L;

/* loaded from: classes10.dex */
public final class v {
    public static final void a(androidx.compose.ui.e eVar, @NotNull C9525e state, ru.ozon.android.messenger.framework.core.d dVar, L l11, @NotNull Function1 onItemClickListener, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e eVar2;
        C9525e c9525e;
        ru.ozon.android.messenger.framework.core.d dVar2;
        L l12;
        Function1 function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        C3969l u11 = interfaceC3967k.u(479000863);
        if ((((u11.n(state) ? 32 : 16) | i11 | (u11.F(dVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(l11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.F(onItemClickListener) ? 16384 : 8192)) & 9363) == 9362 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            c9525e = state;
            dVar2 = dVar;
            l12 = l11;
            function1 = onItemClickListener;
        } else {
            eVar2 = eVar;
            c9525e = state;
            dVar2 = dVar;
            l12 = l11;
            function1 = onItemClickListener;
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.t.a(null, a1.c.c(1159248155, new t(eVar2, c9525e, dVar2, l12, function1), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            Function1 function12 = function1;
            L l13 = l12;
            m02.G(new u(eVar2, c9525e, dVar2, l13, function12, i11));
        }
    }
}
