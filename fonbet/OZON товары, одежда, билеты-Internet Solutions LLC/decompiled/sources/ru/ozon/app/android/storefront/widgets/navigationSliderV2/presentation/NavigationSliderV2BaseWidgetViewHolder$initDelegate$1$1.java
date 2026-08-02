package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderV2BaseWidgetViewHolder$initDelegate$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ NavigationSliderV2BaseWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV2BaseWidgetViewHolder$initDelegate$1$1(NavigationSliderV2BaseWidgetViewHolder navigationSliderV2BaseWidgetViewHolder) {
        super(1);
        this.this$0 = navigationSliderV2BaseWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        OnBoardingDelegate onBoardingDelegate;
        if (z11) {
            onBoardingDelegate = this.this$0.onboardingDelegate;
            if (onBoardingDelegate != null) {
                onBoardingDelegate.unbind();
            }
            RecyclerView.o layoutManager = this.this$0.getBinding().itemsRv.getLayoutManager();
            NavigationSliderV2LayoutManager navigationSliderV2LayoutManager = layoutManager instanceof NavigationSliderV2LayoutManager ? (NavigationSliderV2LayoutManager) layoutManager : null;
            if (navigationSliderV2LayoutManager != null) {
                navigationSliderV2LayoutManager.scrollEnable(true);
            }
        }
    }
}
