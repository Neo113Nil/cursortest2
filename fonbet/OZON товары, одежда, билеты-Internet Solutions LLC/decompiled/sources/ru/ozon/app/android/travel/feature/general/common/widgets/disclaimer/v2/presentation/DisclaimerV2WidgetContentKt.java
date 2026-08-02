package ru.ozon.app.android.travel.feature.general.common.widgets.disclaimer.v2.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/presentation/DisclaimerV2VO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "DisclaimerV2WidgetContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/presentation/DisclaimerV2VO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclaimerV2WidgetContentKt {
    public static final void DisclaimerV2WidgetContent(@NotNull DisclaimerV2VO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1279159137);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            DisclaimerDTO disclaimerContent = state.getDisclaimerContent();
            e e11 = a0.e(e.f40358c0, 1.0f);
            C7807Z parseColorToken = TokenParserKt.parseColorToken(state.getBackgroundColor(), u11, 0);
            b11 = androidx.compose.foundation.e.b(e11, parseColorToken != null ? parseColorToken.w() : C7807Z.f72258l, y0.a());
            function1 = actionHandler;
            DsDisclaimerAtomKt.DsDisclaimerAtom(disclaimerContent, T.i(b11, state.getLeftPadding().m1867getDpD9Ej5fM(), state.getTopPadding().m1867getDpD9Ej5fM(), state.getRightPadding().m1867getDpD9Ej5fM(), state.getBottomPadding().m1867getDpD9Ej5fM()), function1, u11, DisclaimerDTO.$stable | ((i12 << 3) & 896), 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DisclaimerV2WidgetContentKt$DisclaimerV2WidgetContent$1(state, function1, i11));
        }
    }
}
