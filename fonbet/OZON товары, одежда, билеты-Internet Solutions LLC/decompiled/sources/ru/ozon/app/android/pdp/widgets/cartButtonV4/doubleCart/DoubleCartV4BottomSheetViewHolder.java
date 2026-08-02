package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.HapticsActionEnabledFlag;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4BottomSheetViewHolder;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartV4BottomSheetViewHolder;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/core/BaseDoubleCartV4BottomSheetViewHolder;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "binder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "mode", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "LSc/j;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "doubleCartViewLazy", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;Landroidx/coordinatorlayout/widget/CoordinatorLayout;LSc/j;LWZ/l;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartV4BottomSheetViewHolder extends BaseDoubleCartV4BottomSheetViewHolder {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewV4;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartV4BottomSheetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<DoubleCartViewV4> {
        final /* synthetic */ i $container;
        final /* synthetic */ FeatureChecker $featureChecker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i iVar, FeatureChecker featureChecker) {
            super(0);
            this.$container = iVar;
            this.$featureChecker = featureChecker;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DoubleCartViewV4 invoke() {
            Context L11 = this.$container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            return new DoubleCartViewV4(L11, this.$featureChecker.isEnabled(HapticsActionEnabledFlag.INSTANCE));
        }
    }

    public /* synthetic */ DoubleCartV4BottomSheetViewHolder(i iVar, DoubleCartViewBinder doubleCartViewBinder, FeatureChecker featureChecker, DoubleCartVO.CartMode cartMode, CoordinatorLayout coordinatorLayout, InterfaceC4008j interfaceC4008j, l lVar, PDPOnBoardingViewModel pDPOnBoardingViewModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, doubleCartViewBinder, featureChecker, cartMode, coordinatorLayout, (i11 & 32) != 0 ? k.b(new AnonymousClass1(iVar, featureChecker)) : interfaceC4008j, lVar, pDPOnBoardingViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleCartV4BottomSheetViewHolder(@NotNull i container, @NotNull DoubleCartViewBinder binder, @NotNull FeatureChecker featureChecker, @NotNull DoubleCartVO.CartMode mode, @NotNull CoordinatorLayout parent, @NotNull InterfaceC4008j<? extends DoubleCartView> doubleCartViewLazy, @NotNull l tokenizedAnalytics, @NotNull PDPOnBoardingViewModel pdpOnBoardingViewModel) {
        super(container, binder, featureChecker, mode, parent, doubleCartViewLazy, tokenizedAnalytics, pdpOnBoardingViewModel);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(doubleCartViewLazy, "doubleCartViewLazy");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(pdpOnBoardingViewModel, "pdpOnBoardingViewModel");
    }
}
