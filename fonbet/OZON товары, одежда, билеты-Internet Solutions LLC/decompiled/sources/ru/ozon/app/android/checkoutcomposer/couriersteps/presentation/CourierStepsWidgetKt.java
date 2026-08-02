package ru.ozon.app.android.checkoutcomposer.couriersteps.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import Z1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.couriersteps.composable.SegmentedProgressBarKt;
import ru.ozon.app.android.checkoutcomposer.couriersteps.data.CourierStepsDTO;
import ru.ozon.app.android.checkoutcomposer.couriersteps.presentation.vo.CourierStepsVO;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0010\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "CourierStepsWidget", "(Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "LZ1/h;", "strokeWidth", "Ll1/Z;", "color", "cornerRadiusDp", "semiBorder-caE2ViU", "(Landroidx/compose/ui/e;FJFLS0/k;I)Landroidx/compose/ui/e;", "semiBorder", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierStepsWidgetKt {
    public static final void CourierStepsWidget(@NotNull CourierStepsVO state, @NotNull Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        CornerRadius cornerRadius;
        CornerRadius cornerRadius2;
        CornerRadius cornerRadius3;
        e b11;
        e b12;
        int i13;
        float f7;
        CourierStepsDTO.Padding padding;
        CommonCellSettings.LayoutPadding bottom;
        h dp;
        CourierStepsDTO.Padding padding2;
        CommonCellSettings.LayoutPadding right;
        h dp2;
        CourierStepsDTO.Padding padding3;
        CommonCellSettings.LayoutPadding top;
        h dp3;
        CourierStepsDTO.Padding padding4;
        CommonCellSettings.LayoutPadding left;
        h dp4;
        CourierStepsDTO.Padding outerPadding;
        CommonCellSettings.LayoutPadding bottom2;
        h dp5;
        CourierStepsDTO.Padding outerPadding2;
        CommonCellSettings.LayoutPadding right2;
        h dp6;
        CourierStepsDTO.Padding outerPadding3;
        CommonCellSettings.LayoutPadding top2;
        h dp7;
        CourierStepsDTO.Padding outerPadding4;
        CommonCellSettings.LayoutPadding left2;
        h dp8;
        Function1<? super AtomAction, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1470193107);
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
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-1845977903);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CourierStepsWidgetKt$CourierStepsWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            CourierStepsVO.SettingsVO settings = state.getSettings();
            C7807Z c7807z = TokenParserKt.tokenToColor(settings != null ? settings.getTopBorderColor() : null, u11, 0);
            u11.o(-1845974603);
            long graphicStrokeSticky = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicStrokeSticky() : c7807z.w();
            u11.k();
            CourierStepsVO.SettingsVO settings2 = state.getSettings();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(settings2 != null ? settings2.getOuterBgColor() : null, u11, 0);
            u11.o(-1845970901);
            long layerFloor1 = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z2.w();
            u11.k();
            int i14 = i12;
            e.a aVar2 = e.f40358c0;
            long j11 = layerFloor1;
            e e11 = a0.e(aVar2, 1.0f);
            float f11 = 1;
            CourierStepsVO.SettingsVO settings3 = state.getSettings();
            if (settings3 == null || (cornerRadius = settings3.getTopCornerRadius()) == null) {
                cornerRadius = CornerRadius.RADIUS_600;
            }
            e m565semiBordercaE2ViU = m565semiBordercaE2ViU(e11, f11, graphicStrokeSticky, cornerRadius.m1866getDpD9Ej5fM(), u11, 54);
            CourierStepsVO.SettingsVO settings4 = state.getSettings();
            if (settings4 == null || (cornerRadius2 = settings4.getTopCornerRadius()) == null) {
                cornerRadius2 = CornerRadius.RADIUS_600;
            }
            float m1866getDpD9Ej5fM = cornerRadius2.m1866getDpD9Ej5fM();
            CourierStepsVO.SettingsVO settings5 = state.getSettings();
            if (settings5 == null || (cornerRadius3 = settings5.getTopCornerRadius()) == null) {
                cornerRadius3 = CornerRadius.RADIUS_600;
            }
            b11 = androidx.compose.foundation.e.b(C6988h.a(m565semiBordercaE2ViU, A0.h.d(m1866getDpD9Ej5fM, cornerRadius3.m1866getDpD9Ej5fM(), 0.0f, 0.0f, 12)), j11, y0.a());
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, b11);
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
            F1.b(u11, f13, InterfaceC2801g.a.f());
            CourierStepsVO.SettingsVO settings6 = state.getSettings();
            C7807Z c7807z3 = TokenParserKt.tokenToColor(settings6 != null ? settings6.getBgColor() : null, u11, 0);
            u11.o(-1782616603);
            long bgSecondary = c7807z3 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : c7807z3.w();
            u11.k();
            e e12 = a0.e(aVar2, 1.0f);
            CourierStepsVO.SettingsVO settings7 = state.getSettings();
            float m1867getDpD9Ej5fM = (settings7 == null || (outerPadding4 = settings7.getOuterPadding()) == null || (left2 = outerPadding4.getLeft()) == null || (dp8 = CommonCellSettingsKt.getDp(left2)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp8.d();
            CourierStepsVO.SettingsVO settings8 = state.getSettings();
            float m1867getDpD9Ej5fM2 = (settings8 == null || (outerPadding3 = settings8.getOuterPadding()) == null || (top2 = outerPadding3.getTop()) == null || (dp7 = CommonCellSettingsKt.getDp(top2)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp7.d();
            CourierStepsVO.SettingsVO settings9 = state.getSettings();
            float m1867getDpD9Ej5fM3 = (settings9 == null || (outerPadding2 = settings9.getOuterPadding()) == null || (right2 = outerPadding2.getRight()) == null || (dp6 = CommonCellSettingsKt.getDp(right2)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp6.d();
            CourierStepsVO.SettingsVO settings10 = state.getSettings();
            b12 = androidx.compose.foundation.e.b(C6988h.a(T.i(e12, m1867getDpD9Ej5fM, m1867getDpD9Ej5fM2, m1867getDpD9Ej5fM3, (settings10 == null || (outerPadding = settings10.getOuterPadding()) == null || (bottom2 = outerPadding.getBottom()) == null || (dp5 = CommonCellSettingsKt.getDp(bottom2)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp5.d()), A0.h.b(CornerRadius.RADIUS_500.m1866getDpD9Ej5fM())), bgSecondary, y0.a());
            V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f16 = c.f(u11, b12);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f17 = E.f(u11, f15, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f17);
            }
            F1.b(u11, f16, InterfaceC2801g.a.f());
            CourierStepsVO.SettingsVO settings11 = state.getSettings();
            float m1867getDpD9Ej5fM4 = (settings11 == null || (padding4 = settings11.getPadding()) == null || (left = padding4.getLeft()) == null || (dp4 = CommonCellSettingsKt.getDp(left)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp4.d();
            CourierStepsVO.SettingsVO settings12 = state.getSettings();
            float m1867getDpD9Ej5fM5 = (settings12 == null || (padding3 = settings12.getPadding()) == null || (top = padding3.getTop()) == null || (dp3 = CommonCellSettingsKt.getDp(top)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp3.d();
            CourierStepsVO.SettingsVO settings13 = state.getSettings();
            float m1867getDpD9Ej5fM6 = (settings13 == null || (padding2 = settings13.getPadding()) == null || (right = padding2.getRight()) == null || (dp2 = CommonCellSettingsKt.getDp(right)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp2.d();
            CourierStepsVO.SettingsVO settings14 = state.getSettings();
            e e13 = a0.e(T.i(aVar2, m1867getDpD9Ej5fM4, m1867getDpD9Ej5fM5, m1867getDpD9Ej5fM6, (settings14 == null || (padding = settings14.getPadding()) == null || (bottom = padding.getBottom()) == null || (dp = CommonCellSettingsKt.getDp(bottom)) == null) ? Paddings.NONE.m1867getDpD9Ej5fM() : dp.d()), 1.0f);
            C5194q a13 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), u11, 54);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f18 = c.f(u11, e13);
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
            e c11 = GZ.e.c(u11, f18, aVar2, 1.0f);
            Y b13 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            int I14 = u11.I();
            A0 d14 = u11.d();
            e f19 = c.f(u11, c11);
            Function0 a15 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d14);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                a.d(I14, u11, I14, h11);
            }
            F1.b(u11, f19, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(state.getTitle(), null, u11, 0, 2);
            IconButtonV3DTO titleIcon = state.getTitleIcon();
            u11.o(-944529837);
            if (titleIcon == null) {
                actionHandler = function1;
                f7 = 1.0f;
                i13 = 0;
            } else {
                i13 = 0;
                f7 = 1.0f;
                actionHandler = function1;
                DsIconButtonAtomKt.DsIconButtonAtom(titleIcon, aVar2, false, actionHandler, u11, IconButtonV3DTO.$stable | 48 | ((i14 << 6) & 7168), 4);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.f();
            CourierStepsVO.StepsVO steps = state.getSteps();
            u11.o(1039630551);
            if (steps != null) {
                e j12 = T.j(a0.e(aVar2, f7), 0.0f, Paddings.PADDING_250.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13);
                Y b14 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                int I15 = u11.I();
                A0 d15 = u11.d();
                e f21 = c.f(u11, j12);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a16);
                } else {
                    u11.e();
                }
                Function2 h12 = Cm.e.h(u11, b14, u11, d15);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                    a.d(I15, u11, I15, h12);
                }
                F1.b(u11, f21, InterfaceC2801g.a.f());
                C7807Z c7807z4 = TokenParserKt.tokenToColor(state.getSteps().getTotal().getBgColor(), u11, i13);
                u11.o(-106056858);
                long graphicNeutral = c7807z4 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z4.w();
                u11.k();
                C7807Z c7807z5 = TokenParserKt.tokenToColor(state.getSteps().getActive().getBgColor(), u11, i13);
                u11.o(-106053043);
                long graphicActionPrimary = c7807z5 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicActionPrimary() : c7807z5.w();
                u11.k();
                SegmentedProgressBarKt.m564SegmentedProgressBarIRUPcdc(null, steps.getTotal().getCount(), steps.getActive().getCount(), 0.0f, graphicNeutral, graphicActionPrimary, u11, 0, 9);
                u11 = u11;
                u11.f();
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CourierStepsWidgetKt$CourierStepsWidget$3(state, actionHandler, i11));
        }
    }

    @NotNull
    /* renamed from: semiBorder-caE2ViU, reason: not valid java name */
    public static final e m565semiBordercaE2ViU(@NotNull e semiBorder, float f7, long j11, float f11, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Intrinsics.checkNotNullParameter(semiBorder, "$this$semiBorder");
        interfaceC3967k.o(18793900);
        b11 = c.b(semiBorder, C5236c1.a(), new CourierStepsWidgetKt$semiBorder$1(j11, f7, f11));
        interfaceC3967k.k();
        return b11;
    }
}
