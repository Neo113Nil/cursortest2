package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.search.L;
import v0.C10164d;
import v0.I;
import v0.M;

/* loaded from: classes10.dex */
public final class r {
    public static final void a(androidx.compose.ui.e eVar, @NotNull List searchItems, ru.ozon.android.messenger.framework.core.d dVar, L l11, @NotNull Function1 onItemClickListener, @NotNull Function1 onItemView, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(searchItems, "searchItems");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        Intrinsics.checkNotNullParameter(onItemView, "onItemView");
        C3969l u11 = interfaceC3967k.u(-1680587549);
        int i12 = i11 | (u11.n(searchItems) ? 32 : 16) | (u11.F(dVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(l11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.F(onItemClickListener) ? 16384 : 8192) | (u11.F(onItemView) ? 131072 : 65536);
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            I c11 = M.c(0, 0, u11, 3);
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            u11.o(940534813);
            if (l11 != null) {
                ru.ozon.android.messenger.framework.presentation.common.view.recycler.z.a(c11, l11, 10, u11, 384);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.o(940546470);
            boolean F11 = ((i12 & 112) == 32) | ((57344 & i12) == 16384) | u11.F(context) | ((i12 & 458752) == 131072) | u11.F(dVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                p pVar = new p(searchItems, onItemClickListener, context, onItemView, dVar);
                u11.x(pVar);
                C11 = pVar;
            }
            u11.k();
            C10164d.a(eVar, c11, null, null, null, null, false, (Function1) C11, u11, 6, 252);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new q(eVar, searchItems, dVar, l11, onItemClickListener, onItemView, i11));
        }
    }
}
