package ru.ozon.app.android.pdp.widgets.selectCrossSale.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import Z1.h;
import a1.c;
import androidx.compose.foundation.layout.C5191n;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectCrossSale/presentation/SelectCrossSaleVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "SelectCrossSaleWidget", "(Lru/ozon/app/android/pdp/widgets/selectCrossSale/presentation/SelectCrossSaleVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "SelectCrossSaleContent", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCrossSaleWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectCrossSaleContent(SelectCrossSaleVI selectCrossSaleVI, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-845133377);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(selectCrossSaleVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(selectCrossSaleVI.getBackgroundColor(), u11, 0);
            u11.o(1199559949);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = h.a(Paddings.PADDING_500.m1867getDpD9Ej5fM());
                u11.x(C11);
            }
            float d11 = ((h) C11).d();
            u11.k();
            C5191n.a(Q1.a(e.f40358c0, "pdp.selectCrossSale.V1"), null, c.c(847222057, new SelectCrossSaleWidgetKt$SelectCrossSaleContent$1(d11, selectCrossSaleVI, function1, c7807z), u11), u11, 3078, 6);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SelectCrossSaleWidgetKt$SelectCrossSaleContent$2(selectCrossSaleVI, function1, i11));
        }
    }

    public static final void SelectCrossSaleWidget(@NotNull SelectCrossSaleVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(137935332);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(1839270584);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1973488077);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new SelectCrossSaleWidgetKt$SelectCrossSaleWidget$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            SelectCrossSaleContent(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SelectCrossSaleWidgetKt$SelectCrossSaleWidget$2(state, actionHandler, i11));
        }
    }
}
