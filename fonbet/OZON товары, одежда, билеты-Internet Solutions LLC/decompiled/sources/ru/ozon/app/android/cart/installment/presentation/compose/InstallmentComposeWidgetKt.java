package ru.ozon.app.android.cart.installment.presentation.compose;

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
import Z1.h;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
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
import ru.ozon.app.android.cart.installment.presentation.InstallmentVO;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a\u001d\u0010\f\u001a\u00020\t*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\t*\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "InstallmentComposeWidget", "(Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "InstalmentInternal", "Landroidx/compose/ui/e;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "containerSettings", "installmentBackground", "(Landroidx/compose/ui/e;Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;LS0/k;I)Landroidx/compose/ui/e;", "cornerWithTopDivider", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentComposeWidgetKt {
    public static final void InstallmentComposeWidget(@NotNull InstallmentVO state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Integer horizontalMarginDp;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-274933055);
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
        } else {
            InstallmentVO.ContainerSettingsVO widgetContainerSettings = state.getWidgetContainerSettings();
            h a11 = (widgetContainerSettings == null || (horizontalMarginDp = widgetContainerSettings.getHorizontalMarginDp()) == null) ? null : h.a(horizontalMarginDp.intValue());
            if (a11 != null) {
                u11.o(-1684587713);
                e h11 = T.h(e.f40358c0, a11.d(), 0.0f, 2);
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, h11);
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
                F1.b(u11, f11, InterfaceC2801g.a.f());
                InstalmentInternal(state, actionHandler, u11, (i12 & 112) | CellDTO.$stable | (i12 & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(-1684437797);
                InstalmentInternal(state, actionHandler, u11, (i12 & 112) | CellDTO.$stable | (i12 & 14));
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentComposeWidgetKt$InstallmentComposeWidget$2(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstalmentInternal(InstallmentVO installmentVO, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super b, Unit> function12;
        C3969l u11 = interfaceC3967k.u(1303110896);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(installmentVO) : u11.F(installmentVO) ? 4 : 2) | i11;
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
            u11.o(-881630911);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = InstallmentComposeWidgetKt$InstalmentInternal$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            e i13 = T.i(installmentBackground(i.c(aVar, false, null, null, (Function0) C11, 6), installmentVO.getWidgetContainerSettings(), u11, 0), installmentVO.getMargins().getLeftDp(), installmentVO.getMargins().getTopDp(), installmentVO.getMargins().getRightDp(), installmentVO.getMargins().getBottomDp());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, i13);
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
            function12 = function1;
            DsCellAtomKt.DsCellAtom(installmentVO.getCell(), null, function12, u11, CellDTO.$stable | ((i12 << 3) & 896), 2);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentComposeWidgetKt$InstalmentInternal$3(installmentVO, function12, i11));
        }
    }

    private static final e cornerWithTopDivider(e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-188866580);
        long graphicDisabled = UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicDisabled();
        interfaceC3967k.o(-714036469);
        boolean s11 = interfaceC3967k.s(graphicDisabled);
        Object C11 = interfaceC3967k.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new InstallmentComposeWidgetKt$cornerWithTopDivider$1$1(graphicDisabled);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e d11 = androidx.compose.ui.draw.c.d(eVar, (Function1) C11);
        interfaceC3967k.k();
        return d11;
    }

    private static final e installmentBackground(e eVar, InstallmentVO.ContainerSettingsVO containerSettingsVO, InterfaceC3967k interfaceC3967k, int i11) {
        e cornerWithTopDivider;
        e b11;
        interfaceC3967k.o(-717738817);
        Integer cornerRadiusDp = containerSettingsVO != null ? containerSettingsVO.getCornerRadiusDp() : null;
        interfaceC3967k.o(917162152);
        if (cornerRadiusDp != null) {
            float intValue = cornerRadiusDp.intValue();
            cornerWithTopDivider = C6988h.a(eVar, A0.h.d(intValue, intValue, 0.0f, 0.0f, 12));
        } else {
            cornerWithTopDivider = cornerWithTopDivider(eVar, interfaceC3967k, i11 & 14);
        }
        interfaceC3967k.k();
        C7807Z c7807z = TokenParserKt.tokenToColor(containerSettingsVO != null ? containerSettingsVO.getBackgroundColor() : null, interfaceC3967k, 0);
        b11 = androidx.compose.foundation.e.b(cornerWithTopDivider, c7807z == null ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getLayerFloor1() : c7807z.w(), y0.a());
        interfaceC3967k.k();
        return b11;
    }
}
