package ru.ozon.app.android.ugc.core.widgets.textIconWidget.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.factory.DSComposeAtomsFactory;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "TextIconWidget", "(Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "TextIconWidgetContent", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextIconWidgetKt {
    public static final void TextIconWidget(@NotNull TextIconWidgetVO state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1636911734);
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
            u11.o(1835703210);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(73661477);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new TextIconWidgetKt$TextIconWidget$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            TextIconWidgetContent(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TextIconWidgetKt$TextIconWidget$2(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextIconWidgetContent(TextIconWidgetVO textIconWidgetVO, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(-1665961569);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(textIconWidgetVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(textIconWidgetVO.getBackgroundColor(), u11, 0);
            u11.o(-1252411047);
            long clearLightKey0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0() : c7807z.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), clearLightKey0, y0.a());
            e i14 = T.i(b11, textIconWidgetVO.getPaddings().getLeftPadding().m1867getDpD9Ej5fM(), textIconWidgetVO.getPaddings().getTopPadding().m1867getDpD9Ej5fM(), textIconWidgetVO.getPaddings().getRightPadding().m1867getDpD9Ej5fM(), textIconWidgetVO.getPaddings().getBottomPadding().m1867getDpD9Ej5fM());
            Y b12 = X.b(textIconWidgetVO.getArrangement(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, i14);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(397406196);
            List<AtomDTO> atoms = textIconWidgetVO.getAtoms();
            int size = atoms.size();
            int i15 = 0;
            while (i15 < size) {
                AtomDTO atomDTO = atoms.get(i15);
                int i16 = i15;
                DSComposeAtomsFactory dSComposeAtomsFactory = DSComposeAtomsFactory.INSTANCE;
                e.a aVar = e.f40358c0;
                u11.o(1116385065);
                boolean F11 = u11.F(textIconWidgetVO) | ((i13 & 112) == 32);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new TextIconWidgetKt$TextIconWidgetContent$1$1$1$1(textIconWidgetVO, function1);
                    u11.x(C11);
                }
                u11.k();
                e b13 = androidx.compose.foundation.i.b(aVar, null, null, false, null, null, (Function0) C11, 28);
                if (atomDTO instanceof TextDTO) {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                    b13 = b13.l0(new LayoutWeightElement(1.0f, false));
                }
                dSComposeAtomsFactory.CreateAtom(false, atomDTO, b13, function1, u11, (AtomDTO.$stable << 3) | 6 | ((i13 << 6) & 7168) | (DSComposeAtomsFactory.$stable << 12), 0);
                i15 = i16 + 1;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TextIconWidgetKt$TextIconWidgetContent$2(textIconWidgetVO, function1, i11));
        }
    }
}
