package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselScrollState;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModel;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModel;", "viewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "InsuranceCarouselWidgetContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModel;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselScrollState;", "scrollState", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsuranceCarouselWidgetContentKt {
    public static final void InsuranceCarouselWidgetContent(@NotNull InsuranceCarouselVI state, @NotNull InsuranceCarouselViewModel viewModel, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        InsuranceCarouselVI insuranceCarouselVI;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(340536080);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            insuranceCarouselVI = state;
            function1 = actionHandler;
        } else {
            InterfaceC3978p0 c11 = C6285b.c(viewModel.getState(), u11, 0);
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(579788197);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new InsuranceCarouselWidgetContentKt$InsuranceCarouselWidgetContent$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            e h11 = T.h(b11, 0.0f, DsSpacings.INSTANCE.m1845getDp16D9Ej5fM(), 1);
            TestInfo testInfo = state.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            e a11 = Q1.a(h11, automatizationId);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, a11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            InsuranceCarouselHeaderKt.InsuranceCarouselHeader(null, state.getTitle(), state.getSubtitle(), state.getLogoImage(), u11, 0, 1);
            InsuranceCarouselScrollState InsuranceCarouselWidgetContent$lambda$0 = InsuranceCarouselWidgetContent$lambda$0(c11);
            u11.o(273614569);
            boolean F12 = u11.F(viewModel);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new InsuranceCarouselWidgetContentKt$InsuranceCarouselWidgetContent$2$1$1(viewModel);
                u11.x(C12);
            }
            u11.k();
            insuranceCarouselVI = state;
            function1 = actionHandler;
            InsuranceCarouselCardsListKt.InsuranceCarouselCardsList(insuranceCarouselVI, InsuranceCarouselWidgetContent$lambda$0, function1, (Function1) ((h) C12), u11, i12 & 910);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InsuranceCarouselWidgetContentKt$InsuranceCarouselWidgetContent$3(insuranceCarouselVI, viewModel, function1, i11));
        }
    }

    private static final InsuranceCarouselScrollState InsuranceCarouselWidgetContent$lambda$0(A1<InsuranceCarouselScrollState> a12) {
        return a12.getValue();
    }
}
