package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import WZ.l;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.composer.flags.ComposerSnapshotOutsideScreenEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.CartButtonV4RelatedProductsBottomSheetCloseAfterScrollFlag;
import ru.ozon.app.android.pdp.flags.CartButtonV4RelatedProductsBottomSheetReturnFlag;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5WidgetViewHolder$bottomSheetView$2 extends AbstractC7737t implements Function0<RelatedProductsBottomSheetView> {
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$bottomSheetView$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder) {
            super(1);
            this.this$0 = cartButtonV5WidgetViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            PDPOnBoardingViewModel pDPOnBoardingViewModel;
            pDPOnBoardingViewModel = this.this$0.pdpOnBoardingViewModel;
            pDPOnBoardingViewModel.setEnableState(!z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5WidgetViewHolder$bottomSheetView$2(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, FeatureChecker featureChecker) {
        super(0);
        this.this$0 = cartButtonV5WidgetViewHolder;
        this.$featureChecker = featureChecker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RelatedProductsBottomSheetView invoke() {
        l lVar;
        Context L11 = this.this$0.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        i iVar = this.this$0.container;
        CartButtonV5ButtonsContainerViewGroup cartButtonV5ButtonsContainerViewGroup = this.this$0.view;
        boolean isEnabled = this.$featureChecker.isEnabled(CartButtonV4RelatedProductsBottomSheetCloseAfterScrollFlag.INSTANCE);
        boolean isEnabled2 = this.$featureChecker.isEnabled(CartButtonV4RelatedProductsBottomSheetReturnFlag.INSTANCE);
        lVar = this.this$0.tokenizedAnalytics;
        return new RelatedProductsBottomSheetView(L11, iVar, cartButtonV5ButtonsContainerViewGroup, isEnabled2, isEnabled, lVar, this.$featureChecker.isEnabled(ComposerSnapshotOutsideScreenEnabled.INSTANCE), new AnonymousClass1(this.this$0));
    }
}
