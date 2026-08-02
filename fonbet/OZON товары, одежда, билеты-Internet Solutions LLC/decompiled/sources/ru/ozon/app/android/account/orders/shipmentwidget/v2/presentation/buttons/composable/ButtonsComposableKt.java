package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable;

import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.viewItem.ButtonsVO;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a+\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\t\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/viewItem/ButtonsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "ButtonsComposable", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/viewItem/ButtonsVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "OneTextButtonAndIconButton", "TwoTextButtonAndIconButton", "LZ1/h;", "BUTTONS_SPACING", "F", "TOP_PADDING", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonsComposableKt {
    private static final float BUTTONS_SPACING;
    private static final float TOP_PADDING;

    static {
        float f7 = 8;
        BUTTONS_SPACING = f7;
        TOP_PADDING = f7;
    }

    public static final void ButtonsComposable(@NotNull ButtonsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-716811082);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(item) : u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (item.getSecondButton() == null) {
            u11.o(-219476614);
            OneTextButtonAndIconButton(item, actionHandler, u11, (i12 & 112) | IconButtonV3DTO.$stable | HorizontalPadding.$stable | (i12 & 14));
            u11.k();
        } else {
            u11.o(-219408166);
            TwoTextButtonAndIconButton(item, actionHandler, u11, (i12 & 112) | IconButtonV3DTO.$stable | HorizontalPadding.$stable | (i12 & 14));
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ButtonsComposableKt$ButtonsComposable$1(item, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OneTextButtonAndIconButton(ButtonsVO buttonsVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super AtomAction, Unit> function12;
        C3969l u11 = interfaceC3967k.u(1666042721);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(buttonsVO) : u11.F(buttonsVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            e.a aVar = e.f40358c0;
            e j11 = T.j(a0.e(aVar, 1.0f), buttonsVO.getHorizontalPadding().getLeft().m1867getDpD9Ej5fM(), TOP_PADDING, buttonsVO.getHorizontalPadding().getRight().m1867getDpD9Ej5fM(), 0.0f, 8);
            int i13 = C5179b.f39454h;
            Y b11 = X.b(C5179b.n(BUTTONS_SPACING), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, j11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f12 = c.f(u11, layoutWeightElement);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            int i14 = (i12 << 6) & 7168;
            function12 = function1;
            DsButtonAtomKt.DsButtonAtom(buttonsVO.getFirstButton(), a0.e(aVar, 1.0f), false, function12, u11, i14 | 48, 4);
            u11.f();
            IconButtonV3DTO iconButton = buttonsVO.getIconButton();
            u11.o(872899990);
            if (iconButton != null) {
                DsIconButtonAtomKt.DsIconButtonAtom(iconButton, null, false, function12, u11, IconButtonV3DTO.$stable | i14, 6);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ButtonsComposableKt$OneTextButtonAndIconButton$2(buttonsVO, function12, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TwoTextButtonAndIconButton(ButtonsVO buttonsVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1454776901);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(buttonsVO) : u11.F(buttonsVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (buttonsVO.getSecondButton() == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ButtonsComposableKt$TwoTextButtonAndIconButton$1(buttonsVO, function1, i11));
                    return;
                }
                return;
            }
            IconButtonV3DTO iconButton = buttonsVO.getIconButton();
            u11.o(568015780);
            C4912a c11 = iconButton == null ? null : a1.c.c(-1395180235, new ButtonsComposableKt$TwoTextButtonAndIconButton$iconButton$1$1(buttonsVO, function1), u11);
            u11.k();
            e j11 = T.j(a0.e(e.f40358c0, 1.0f), buttonsVO.getHorizontalPadding().getLeft().m1867getDpD9Ej5fM(), TOP_PADDING, buttonsVO.getHorizontalPadding().getRight().m1867getDpD9Ej5fM(), 0.0f, 8);
            float f7 = BUTTONS_SPACING;
            AdaptiveTwoButtonsAndIconButtonKt.m465AdaptiveTwoButtonsAndIconButtonLayoutZUYZQmM(j11, f7, f7, a1.c.c(1210162545, new ButtonsComposableKt$TwoTextButtonAndIconButton$2(buttonsVO, function1), u11), a1.c.c(-938238286, new ButtonsComposableKt$TwoTextButtonAndIconButton$3(buttonsVO, function1), u11), c11, u11, 28080, 0);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new ButtonsComposableKt$TwoTextButtonAndIconButton$4(buttonsVO, function1, i11));
        }
    }
}
