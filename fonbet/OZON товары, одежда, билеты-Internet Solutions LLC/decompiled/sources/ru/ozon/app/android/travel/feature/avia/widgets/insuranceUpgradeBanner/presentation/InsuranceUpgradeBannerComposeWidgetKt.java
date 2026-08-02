package ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation;

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
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "InsuranceUpgradeBannerComposeWidget", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InsuranceUpgradeBannerComposeWidgetKt {
    public static final void InsuranceUpgradeBannerComposeWidget(@NotNull InsuranceUpgradeBannerComposeVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-960606695);
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
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            b11 = androidx.compose.foundation.e.b(C6988h.a(e11, h.b(dsSpacings.m1842getDp12D9Ej5fM())), C7811b0.b(state.getBackgroundColor()), y0.a());
            e j11 = T.j(b11, 0.0f, 0.0f, dsSpacings.m1842getDp12D9Ej5fM(), 0.0f, 11);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, j11);
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
            e a12 = M.a(GZ.e.c(u11, f11, aVar, 1.0f), EnumC9909s.Min);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, a12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            e g10 = T.g(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM());
            C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f14 = c.f(u11, g10);
            Function0 a15 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 g11 = b.g(u11, a14, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, g11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(state.getTitle(), T.j(aVar, 0.0f, 0.0f, 0.0f, dsSpacings.m1854getDp4D9Ej5fM(), 7), u11, 0, 0);
            DsTextAtomKt.DsTextAtom(state.getDescription(), T.j(aVar, 0.0f, 0.0f, 0.0f, dsSpacings.m1861getDp8D9Ej5fM(), 7), u11, 0, 0);
            ButtonV3DTO selectButton = state.getSelectButton();
            CommonControlSettings common = state.getSelectButton().getCommon();
            Function1 function1 = null;
            AtomAction atomAction = common != null ? common.toAtomAction() : null;
            u11.o(-1060193924);
            if (atomAction != null) {
                u11.o(1114155059);
                boolean z11 = (i12 & 112) == 32;
                Object C11 = u11.C();
                if (z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new InsuranceUpgradeBannerComposeWidgetKt$InsuranceUpgradeBannerComposeWidget$1$1$1$1$1$1(actionHandler);
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            u11.k();
            DsButtonAtomKt.DsButtonAtom(selectButton, new HorizontalAlignElement(InterfaceC6250b.a.k()), false, function1, u11, 0, 4);
            u11.f();
            DsImageAtomKt.DsImageAtom(state.getRightImage(), T.h(a0.f(a0.r(aVar, 114), UserVerificationMethods.USER_VERIFY_PATTERN).l0(new VerticalAlignElement(InterfaceC6250b.a.i())), 0.0f, dsSpacings.m1854getDp4D9Ej5fM(), 1), u11, 0, 0);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InsuranceUpgradeBannerComposeWidgetKt$InsuranceUpgradeBannerComposeWidget$2(state, actionHandler, i11));
        }
    }
}
