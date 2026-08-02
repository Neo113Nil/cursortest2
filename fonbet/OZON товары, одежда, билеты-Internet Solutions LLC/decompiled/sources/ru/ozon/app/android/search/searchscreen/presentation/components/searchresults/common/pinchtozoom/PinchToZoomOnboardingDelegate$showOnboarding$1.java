package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PinchToZoomOnboardingDelegate$showOnboarding$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ConstraintLayout $containerView;
    final /* synthetic */ PinchToZoomOnboardingDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PinchToZoomOnboardingDelegate$showOnboarding$1(ConstraintLayout constraintLayout, PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate) {
        super(0);
        this.$containerView = constraintLayout;
        this.this$0 = pinchToZoomOnboardingDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PinchToZoomOnboardingView pinchToZoomOnboardingView;
        ConstraintLayout constraintLayout = this.$containerView;
        pinchToZoomOnboardingView = this.this$0.onboardingView;
        constraintLayout.removeView(pinchToZoomOnboardingView);
        this.this$0.onboardingView = null;
    }
}
