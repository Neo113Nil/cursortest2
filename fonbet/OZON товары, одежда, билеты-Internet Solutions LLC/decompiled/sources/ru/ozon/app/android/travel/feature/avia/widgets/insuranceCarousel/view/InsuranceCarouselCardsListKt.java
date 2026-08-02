package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import WZ.l;
import Z1.d;
import a1.c;
import androidx.compose.ui.platform.K0;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselScrollState;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools.CenterItemByIndexToolsKt;
import ru.ozon.app.android.travel.utils.compose.MeasureMaxItemHeightKt;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.I;
import v0.M;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselScrollState;", "scrollState", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModelAction;", "onAction", "InsuranceCarouselCardsList", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselScrollState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsuranceCarouselCardsListKt {
    public static final void InsuranceCarouselCardsList(@NotNull InsuranceCarouselVI state, @NotNull InsuranceCarouselScrollState scrollState, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super InsuranceCarouselViewModelAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super InsuranceCarouselViewModelAction, Unit> onAction = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(-1800883229);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(scrollState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onAction) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            I c11 = M.c(scrollState.getFirstVisibleItemIndex(), scrollState.getFirstVisibleItemScrollOffset(), u11, 0);
            CenterItemByIndexToolsKt.CenterItemByIndexAfterListUpdate(c11, state.getSelectedCardIndex(), scrollState.getLastSelectedIndex(), ((d) u11.m(K0.e())).Y0(220), function1, u11, (i13 << 3) & 57344);
            onAction = function1;
            Integer valueOf = Integer.valueOf(state.getSelectedCardIndex());
            u11.o(2008615508);
            boolean n11 = u11.n(c11) | ((i13 & 7168) == 2048);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$2$1(onAction, c11);
                u11.x(C11);
            }
            u11.k();
            Q.b(valueOf, c11, (Function1) C11, u11);
            List<InsuranceCarouselVI.InsuranceCarouselCardVI> insurances = state.getInsurances();
            u11.o(2008626791);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$3$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            MeasureMaxItemHeightKt.WithMaxItemHeight(insurances, (Function0) C12, null, c.c(1961359762, new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$4(actionHandler), u11), c.c(-1704440178, new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5(c11, state, lVar, actionHandler), u11), u11, 27696, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$6(state, scrollState, actionHandler, onAction, i11));
        }
    }
}
