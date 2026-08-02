package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.composable;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.C4912a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.viewItem.AtomElementVO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.viewItem.DisclaimerWrapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.viewItem.DisclaimerWrapperKt;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014\"\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/AtomElementVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "AtomElementComposable", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/AtomElementVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/DisclaimerWrapper;", "onAction", "DisclaimerComposable", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/DisclaimerWrapper;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "SmallBorderlessButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "LZ1/h;", "ATOMS_SPACING", "F", "DISCLAIMER_TOP_MARGIN", "TOP_PADDING", "DISCLAIMER_HORIZONTAL_MARGINS", "DISCLAIMER_TOP_PADDING", "DISCLAIMER_BOTTOM_PADDING", "DISCLAIMER_INNER_SPACING", "DISCLAIMER_ICON_SIZE", "BUTTON_TOP_PADDING", "BUTTON_BOTTOM_PADDING", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomElementComposableKt {
    private static final float ATOMS_SPACING;
    private static final float BUTTON_BOTTOM_PADDING;
    private static final float BUTTON_TOP_PADDING;
    private static final float DISCLAIMER_BOTTOM_PADDING;
    private static final float DISCLAIMER_HORIZONTAL_MARGINS = 16;
    private static final float DISCLAIMER_ICON_SIZE = 24;
    private static final float DISCLAIMER_INNER_SPACING;
    private static final float DISCLAIMER_TOP_MARGIN;
    private static final float DISCLAIMER_TOP_PADDING;
    private static final float TOP_PADDING;

    static {
        float f7 = 4;
        ATOMS_SPACING = f7;
        float f11 = 8;
        DISCLAIMER_TOP_MARGIN = f11;
        TOP_PADDING = f7;
        float f12 = 12;
        DISCLAIMER_TOP_PADDING = f12;
        float f13 = 7;
        DISCLAIMER_BOTTOM_PADDING = f13;
        DISCLAIMER_INNER_SPACING = f12;
        BUTTON_TOP_PADDING = f13;
        BUTTON_BOTTOM_PADDING = f11;
    }

    public static final void AtomElementComposable(@NotNull AppType appType, @NotNull AtomElementVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1796409659);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(appType) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(item) : u11.F(item) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e j11 = T.j(a0.e(aVar, 1.0f), item.getHorizontalPadding().getLeft().m1867getDpD9Ej5fM(), TOP_PADDING, item.getHorizontalPadding().getRight().m1867getDpD9Ej5fM(), 0.0f, 8);
            u11.o(-1994186480);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            q qVar = (q) C11;
            u11.k();
            u11.o(-1994184648);
            int i13 = i12 & 896;
            boolean z11 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && u11.F(item))) | (i13 == 256);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new AtomElementComposableKt$AtomElementComposable$2$1(item, actionHandler);
                u11.x(C12);
            }
            u11.k();
            e b11 = i.b(j11, qVar, null, false, null, null, (Function0) C12, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            AtomDTO atom = item.getAtom();
            if (atom instanceof TextDTO) {
                u11.o(1690110499);
                DsTextAtomKt.DsTextAtom((TextDTO) item.getAtom(), null, u11, 0, 2);
                u11.k();
            } else if (atom instanceof DisclaimerAtom) {
                u11.o(1690112758);
                e e11 = a0.e(aVar, 1.0f);
                C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = c.f(u11, e11);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 g10 = b.g(u11, a12, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, g10);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                u0.E.a(u11, a0.n(aVar, DISCLAIMER_TOP_MARGIN));
                DisclaimerComposable(appType, DisclaimerWrapperKt.mapToDisclaimerWrapper((DisclaimerAtom) item.getAtom()), actionHandler, u11, i12 & 910);
                u11.f();
                u11.k();
            } else if (atom instanceof CellDTO) {
                u11.o(1690124061);
                DsCellAtomKt.DsCellAtom((CellDTO) item.getAtom(), null, actionHandler, u11, CellDTO.$stable | i13, 2);
                u11.k();
            } else {
                u11.o(854299194);
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AtomElementComposableKt$AtomElementComposable$4(appType, item, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisclaimerComposable(AppType appType, DisclaimerWrapper disclaimerWrapper, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e.a aVar;
        Unit unit;
        C3969l u11 = interfaceC3967k.u(1468803109);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(appType) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(disclaimerWrapper) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            A0.g b11 = h.b((appType == AppType.SELECT ? CornerRadius.RADIUS_500 : CornerRadius.RADIUS_400).m1866getDpD9Ej5fM());
            e.a aVar2 = e.f40358c0;
            e e11 = a0.e(aVar2, 1.0f);
            C7807Z c7807z = TokenParserKt.tokenToColor(disclaimerWrapper.getBackgroundColor(), u11, 0);
            u11.o(436703769);
            long bgSecondary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : c7807z.w();
            u11.k();
            e b12 = androidx.compose.foundation.e.b(e11, bgSecondary, b11);
            float f7 = DISCLAIMER_TOP_PADDING;
            float f11 = DISCLAIMER_HORIZONTAL_MARGINS;
            e i13 = T.i(b12, f11, f7, f11, DISCLAIMER_BOTTOM_PADDING);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, i13);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f14);
            }
            e c11 = GZ.e.c(u11, f13, aVar2, 1.0f);
            int i14 = C5179b.f39454h;
            Y b13 = X.b(C5179b.n(DISCLAIMER_INNER_SPACING), InterfaceC6250b.a.l(), u11, 6);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f15 = c.f(u11, c11);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            DsIconAtomKt.DsIconAtom(disclaimerWrapper.getIcon(), a0.n(aVar2, DISCLAIMER_ICON_SIZE), u11, IconDTO.$stable | 48, 0);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f16 = c.f(u11, layoutWeightElement);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a13, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, g10);
            }
            F1.b(u11, f16, InterfaceC2801g.a.f());
            TextDTO header = disclaimerWrapper.getHeader();
            u11.o(-1122850909);
            if (header != null) {
                u0.E.a(u11, a0.n(aVar2, 1));
                DsTextAtomKt.DsTextAtom(header, a0.e(aVar2, 1.0f), u11, 48, 0);
                u0.E.a(u11, a0.n(aVar2, 6));
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(disclaimerWrapper.getBody(), a0.e(aVar2, 1.0f), u11, 48, 0);
            List<ButtonV3Atom.SmallBorderlessButton> buttons = disclaimerWrapper.getButtons();
            u11.o(-1122835808);
            if (buttons == null) {
                unit = null;
                aVar = aVar2;
            } else {
                e e12 = a0.e(aVar2, 1.0f);
                C4912a c12 = a1.c.c(796270819, new AtomElementComposableKt$DisclaimerComposable$1$1$1$2$1(buttons, function1), u11);
                aVar = aVar2;
                B.a(e12, null, null, 0, 0, null, c12, u11, 1572870, 62);
                unit = Unit.f71690a;
            }
            u11.k();
            u11.o(-1122836156);
            if (unit == null) {
                u0.E.a(u11, a0.n(aVar, 5));
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AtomElementComposableKt$DisclaimerComposable$2(appType, disclaimerWrapper, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SmallBorderlessButton(ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-282332970);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(smallBorderlessButton) : u11.F(smallBorderlessButton) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            TextDTO textDTO = new TextDTO(smallBorderlessButton.getText(), null, null, null, null, null, TextPreset.PRESET_CUSTOM, "tsCompact400Large", UniTheme.INSTANCE.getColorTokens().getTextAction().getId(), null, null, null, null, false, null, null, null, null, 1, 261694, null);
            e j11 = T.j(e.f40358c0, 0.0f, BUTTON_TOP_PADDING, 0.0f, BUTTON_BOTTOM_PADDING, 5);
            u11.o(544991174);
            boolean z11 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(smallBorderlessButton))) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AtomElementComposableKt$SmallBorderlessButton$1$1(smallBorderlessButton, function1);
                u11.x(C11);
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(textDTO, i.b(j11, null, null, false, null, null, (Function0) C11, 28), u11, 0, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AtomElementComposableKt$SmallBorderlessButton$2(smallBorderlessButton, function1, i11));
        }
    }
}
