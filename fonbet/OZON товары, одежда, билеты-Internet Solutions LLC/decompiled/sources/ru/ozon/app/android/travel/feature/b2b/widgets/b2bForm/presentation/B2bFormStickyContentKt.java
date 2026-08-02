package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import e1.InterfaceC6250b;
import j1.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormVI;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "B2bFormStickyContent", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "Ll1/Z;", "color", "LZ1/h;", "strokeWidth", "cornerRadius", "topAndSidesBorder-y6ga9Xk", "(Landroidx/compose/ui/e;JFF)Landroidx/compose/ui/e;", "topAndSidesBorder", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class B2bFormStickyContentKt {
    public static final void B2bFormStickyContent(@NotNull B2bFormVI.ButtonSectionVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        TravelWidgetSettingsDTO.CornersSetting corners;
        CornerRadius topRadius;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(223607229);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            P1 p12 = (P1) u11.m(K0.o());
            i iVar = (i) u11.m(K0.f());
            u11.o(1639845696);
            boolean F11 = u11.F(iVar) | u11.n(p12);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new B2bFormStickyContentKt$B2bFormStickyContent$hideKeyboardAndClearFocus$1$1(iVar, p12);
                u11.x(C11);
            }
            Function0 function0 = (Function0) C11;
            u11.k();
            TravelWidgetSettingsDTO settings = state.getSettings();
            e m1087topAndSidesBordery6ga9Xk = m1087topAndSidesBordery6ga9Xk(a0.e(e.f40358c0, 1.0f), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicStrokeSticky(), 1, (settings == null || (corners = settings.getCorners()) == null || (topRadius = corners.getTopRadius()) == null) ? 0 : topRadius.m1866getDpD9Ej5fM());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, m1087topAndSidesBordery6ga9Xk);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            B2bFormContentKt.ButtonSection(state, function0, actionHandler, u11, ((i12 << 3) & 896) | (i12 & 14));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFormStickyContentKt$B2bFormStickyContent$2(state, actionHandler, i11));
        }
    }

    /* renamed from: topAndSidesBorder-y6ga9Xk, reason: not valid java name */
    private static final e m1087topAndSidesBordery6ga9Xk(e eVar, long j11, float f7, float f11) {
        return androidx.compose.ui.draw.c.c(eVar, new B2bFormStickyContentKt$topAndSidesBorder$1(f7, f11, j11));
    }
}
