package ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation.ButtonsGroupVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.C9915y;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a7\u0010\u000e\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "ButtonsGroup", "(Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "ButtonsGroupContent", "Lu0/C;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ButtonItem;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.BUTTON_ITEM_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "dto", "ButtonWithLayout", "(Lu0/C;Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ButtonItem;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonsGroupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonWithLayout(InterfaceC9890C interfaceC9890C, ButtonsGroupVO.ButtonItem buttonItem, ButtonV3DTO buttonV3DTO, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        ButtonV3DTO buttonV3DTO2;
        Function1<? super b, Unit> function12;
        C3969l u11 = interfaceC3967k.u(-2002926336);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9890C) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(buttonItem) : u11.F(buttonItem) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(buttonV3DTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            buttonV3DTO2 = buttonV3DTO;
            function12 = function1;
        } else if (buttonItem.getIsFullWidth()) {
            u11.o(-815686149);
            e.a aVar = e.f40358c0;
            e a11 = interfaceC9890C.a(aVar, 1.0f, true);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            buttonV3DTO2 = buttonV3DTO;
            function12 = function1;
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO2, GZ.e.c(u11, f11, aVar, 1.0f), false, function12, u11, ((i12 >> 6) & 14) | 48 | (i12 & 7168), 4);
            u11.f();
            u11.k();
        } else {
            buttonV3DTO2 = buttonV3DTO;
            function12 = function1;
            u11.o(-815472404);
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO2, null, false, function12, u11, ((i12 >> 6) & 14) | (i12 & 7168), 6);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ButtonsGroupKt$ButtonWithLayout$2(interfaceC9890C, buttonItem, buttonV3DTO2, function12, i11));
        }
    }

    public static final void ButtonsGroup(@NotNull ButtonsGroupVO state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(10389622);
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
            u11.o(389945522);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(470236461);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new ButtonsGroupKt$ButtonsGroup$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            ButtonsGroupContent(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ButtonsGroupKt$ButtonsGroup$2(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonsGroupContent(ButtonsGroupVO buttonsGroupVO, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Function1<? super b, Unit> function12;
        Function1<? super b, Unit> function13;
        C3969l u11 = interfaceC3967k.u(721917495);
        int i12 = (i11 & 6) == 0 ? (u11.F(buttonsGroupVO) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(buttonsGroupVO.getBackgroundColor(), u11, 0);
            u11.o(1306673497);
            long clearLightKey0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0() : c7807z.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), clearLightKey0, y0.a());
            e e11 = T.e(b11, new C9915y(buttonsGroupVO.getPaddings().getLeftPadding().m1867getDpD9Ej5fM(), buttonsGroupVO.getPaddings().getTopPadding().m1867getDpD9Ej5fM(), buttonsGroupVO.getPaddings().getRightPadding().m1867getDpD9Ej5fM(), buttonsGroupVO.getPaddings().getBottomPadding().m1867getDpD9Ej5fM()));
            Y b12 = X.b(buttonsGroupVO.getArrangement(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
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
            C9891D c9891d = C9891D.f99599a;
            u11.o(1373912837);
            for (ButtonsGroupVO.ButtonItem buttonItem : buttonsGroupVO.getButtons()) {
                ButtonsGroupVO.ItemVO item = buttonItem.getItem();
                if (item instanceof ButtonsGroupVO.ItemVO.ButtonWrapper) {
                    u11.o(783331091);
                    function13 = function1;
                    ButtonWithLayout(c9891d, buttonItem, ((ButtonsGroupVO.ItemVO.ButtonWrapper) item).getButton(), function13, u11, 6 | ((i12 << 6) & 7168));
                    u11.k();
                } else {
                    function13 = function1;
                    C9891D c9891d2 = c9891d;
                    if (item instanceof ButtonsGroupVO.ItemVO.IconButtonWrapper) {
                        u11.o(783338533);
                        DsIconButtonAtomKt.DsIconButtonAtom(((ButtonsGroupVO.ItemVO.IconButtonWrapper) item).getIconButton(), null, false, function13, u11, IconButtonV3DTO.$stable | ((i12 << 6) & 7168), 6);
                        u11.k();
                        c9891d = c9891d2;
                    } else if (item instanceof ButtonsGroupVO.ItemVO.ButtonSelector) {
                        u11.o(-1486117671);
                        ButtonsGroupVO.ItemVO.ButtonSelector buttonSelector = (ButtonsGroupVO.ItemVO.ButtonSelector) item;
                        ButtonV3DTO selected = buttonSelector.getSelected();
                        if (!buttonSelector.getIsSelected()) {
                            selected = null;
                        }
                        if (selected == null) {
                            selected = buttonSelector.getNormal();
                        }
                        u11.G(783348043, buttonItem);
                        c9891d = c9891d2;
                        ButtonWithLayout(c9891d, buttonItem, selected, function13, u11, 6 | ((i12 << 6) & 7168));
                        u11.J();
                        u11.k();
                    } else {
                        c9891d = c9891d2;
                        u11.o(783357453);
                        u11.k();
                    }
                }
                function1 = function13;
            }
            function12 = function1;
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ButtonsGroupKt$ButtonsGroupContent$2(buttonsGroupVO, function12, i11));
        }
    }
}
