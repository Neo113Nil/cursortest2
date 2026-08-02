package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderV2BaseWidgetViewHolder$showOnboardingIfExist$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ NavigationSliderV2BaseWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV2BaseWidgetViewHolder$showOnboardingIfExist$1(NavigationSliderV2BaseWidgetViewHolder navigationSliderV2BaseWidgetViewHolder) {
        super(0);
        this.this$0 = navigationSliderV2BaseWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final View view;
        RecyclerView.o layoutManager = this.this$0.getBinding().itemsRv.getLayoutManager();
        NavigationSliderV2LayoutManager navigationSliderV2LayoutManager = layoutManager instanceof NavigationSliderV2LayoutManager ? (NavigationSliderV2LayoutManager) layoutManager : null;
        if (navigationSliderV2LayoutManager != null) {
            navigationSliderV2LayoutManager.scrollEnable(false);
        }
        view = this.this$0.containerView;
        final NavigationSliderV2BaseWidgetViewHolder navigationSliderV2BaseWidgetViewHolder = this.this$0;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder$showOnboardingIfExist$1$invoke$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Handler handler;
                if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                final View view2 = view;
                NavigationSliderV2VO boundedData = navigationSliderV2BaseWidgetViewHolder.getBoundedData();
                View onboardingView = (boundedData == null || boundedData.getOnboardingPosition() == -1) ? null : navigationSliderV2BaseWidgetViewHolder.getOnboardingView(boundedData.getOnboardingPosition());
                final Integer valueOf = onboardingView != null ? Integer.valueOf(onboardingView.getLeft()) : null;
                final Integer valueOf2 = onboardingView != null ? Integer.valueOf(onboardingView.getRight()) : null;
                if (valueOf != null && valueOf.intValue() >= 0 && valueOf2 != null) {
                    handler = navigationSliderV2BaseWidgetViewHolder.navsliderHandler;
                    final NavigationSliderV2BaseWidgetViewHolder navigationSliderV2BaseWidgetViewHolder2 = navigationSliderV2BaseWidgetViewHolder;
                    handler.postDelayed(new Runnable() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder$showOnboardingIfExist$1$1$1
                        /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
                        
                            r1 = r1.onboardingDelegate;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            boolean hasOpenedDialogFragment;
                            OnBoardingDelegate onBoardingDelegate;
                            NavigationSliderV2BaseWidgetViewHolder.Companion companion;
                            NavigationSliderV2BaseWidgetViewHolder.Companion companion2;
                            hasOpenedDialogFragment = NavigationSliderV2BaseWidgetViewHolder.this.hasOpenedDialogFragment();
                            if (hasOpenedDialogFragment || onBoardingDelegate == null) {
                                return;
                            }
                            NavigationSliderV2BaseWidgetViewHolder navigationSliderV2BaseWidgetViewHolder3 = NavigationSliderV2BaseWidgetViewHolder.this;
                            Integer num = valueOf;
                            Integer valueOf3 = Integer.valueOf(view2.getMeasuredWidth() - valueOf2.intValue());
                            companion = NavigationSliderV2BaseWidgetViewHolder.Companion;
                            Integer valueOf4 = Integer.valueOf(companion.getONBOARDING_VERTICAL_MARGIN());
                            companion2 = NavigationSliderV2BaseWidgetViewHolder.Companion;
                            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate, navigationSliderV2BaseWidgetViewHolder3, new OnBoardingCutConfig(num, null, valueOf3, null, valueOf4, null, Float.valueOf(companion2.getONBOARDING_CORNER_RADIUS()), false, 42, null), null, 4, null);
                        }
                    }, 500L);
                } else {
                    RecyclerView.o layoutManager2 = navigationSliderV2BaseWidgetViewHolder.getBinding().itemsRv.getLayoutManager();
                    NavigationSliderV2LayoutManager navigationSliderV2LayoutManager2 = layoutManager2 instanceof NavigationSliderV2LayoutManager ? (NavigationSliderV2LayoutManager) layoutManager2 : null;
                    if (navigationSliderV2LayoutManager2 != null) {
                        navigationSliderV2LayoutManager2.scrollEnable(true);
                    }
                }
            }
        });
    }
}
