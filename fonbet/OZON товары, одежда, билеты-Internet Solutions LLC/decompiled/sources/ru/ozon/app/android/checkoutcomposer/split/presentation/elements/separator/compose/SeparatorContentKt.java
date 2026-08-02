package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.SeparatorVO;
import ru.ozon.app.android.checkoutgeo.checkout.data.PaddingsKt;
import ru.ozon.uni.atoms.data.common.Spacings;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorVO;", "state", "", "SeparatorContent", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorVO;LS0/k;I)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SeparatorContentKt {
    public static final void SeparatorContent(@NotNull SeparatorVO state, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-697894345);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(state.getColor(), u11, 0);
            u11.o(305947919);
            long graphicNeutral = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(PaddingsKt.setupPaddings(a0.f(a0.e(e.f40358c0, 1.0f), Spacings.SPACING_1.getPx()), state.getPaddings()), graphicNeutral, y0.a());
            C5185h.a(b11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SeparatorContentKt$SeparatorContent$1(state, i11));
        }
    }
}
