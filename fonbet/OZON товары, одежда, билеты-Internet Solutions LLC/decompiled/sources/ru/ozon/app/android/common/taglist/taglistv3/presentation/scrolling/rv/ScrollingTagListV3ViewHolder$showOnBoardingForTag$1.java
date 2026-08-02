package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder;
import ru.ozon.app.android.common.ui.taglist.databinding.WidgetScrollingTagListBinding;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ScrollingTagListV3ViewHolder$showOnBoardingForTag$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ int $onboardingIndex;
    final /* synthetic */ String $onboardingKey;
    final /* synthetic */ long $widgetId;
    final /* synthetic */ ScrollingTagListV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingTagListV3ViewHolder$showOnBoardingForTag$1(ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder, OnBoardingDTO onBoardingDTO, long j11, String str, int i11) {
        super(0);
        this.this$0 = scrollingTagListV3ViewHolder;
        this.$onboarding = onBoardingDTO;
        this.$widgetId = j11;
        this.$onboardingKey = str;
        this.$onboardingIndex = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        WidgetScrollingTagListBinding widgetScrollingTagListBinding;
        onBoardingDelegate = this.this$0.onboardingDelegate;
        if (onBoardingDelegate == null) {
            this.this$0.initDelegate(this.$onboarding, this.$widgetId, this.$onboardingKey);
        }
        widgetScrollingTagListBinding = this.this$0.binding;
        final RecyclerView constraintLayout = widgetScrollingTagListBinding.getConstraintLayout();
        final ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder = this.this$0;
        final int i11 = this.$onboardingIndex;
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder$showOnBoardingForTag$1$invoke$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                final View onboardingItemView;
                Handler handler;
                if (constraintLayout.getMeasuredWidth() <= 0 || constraintLayout.getMeasuredHeight() <= 0) {
                    return;
                }
                constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                final RecyclerView recyclerView = (RecyclerView) constraintLayout;
                onboardingItemView = scrollingTagListV3ViewHolder.getOnboardingItemView(Integer.valueOf(i11));
                if (onboardingItemView == null) {
                    return;
                }
                handler = scrollingTagListV3ViewHolder.onboardingHandler;
                final ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder2 = scrollingTagListV3ViewHolder;
                handler.post(new Runnable() { // from class: ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder$showOnBoardingForTag$1$1$1

                    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder$showOnBoardingForTag$1$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
                        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                        AnonymousClass1() {
                            super(0);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f71690a;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        OnBoardingDelegate onBoardingDelegate2;
                        CommonOnboardingRepository commonOnboardingRepository;
                        ScrollingTagListV3ViewHolder.Companion companion;
                        WidgetScrollingTagListBinding widgetScrollingTagListBinding2;
                        WidgetScrollingTagListBinding widgetScrollingTagListBinding3;
                        onBoardingDelegate2 = ScrollingTagListV3ViewHolder.this.onboardingDelegate;
                        if (onBoardingDelegate2 != null) {
                            ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder3 = ScrollingTagListV3ViewHolder.this;
                            int left = onboardingItemView.getLeft();
                            int measuredWidth = recyclerView.getMeasuredWidth() - onboardingItemView.getRight();
                            companion = ScrollingTagListV3ViewHolder.Companion;
                            float onboarding_corner_radius = companion.getONBOARDING_CORNER_RADIUS();
                            widgetScrollingTagListBinding2 = ScrollingTagListV3ViewHolder.this.binding;
                            int paddingTop = widgetScrollingTagListBinding2.getConstraintLayout().getPaddingTop();
                            widgetScrollingTagListBinding3 = ScrollingTagListV3ViewHolder.this.binding;
                            onBoardingDelegate2.bind(scrollingTagListV3ViewHolder3, new OnBoardingCutConfig(Integer.valueOf(left), Integer.valueOf(paddingTop), Integer.valueOf(measuredWidth), Integer.valueOf(widgetScrollingTagListBinding3.getConstraintLayout().getPaddingBottom()), null, null, Float.valueOf(onboarding_corner_radius), false, 48, null), AnonymousClass1.INSTANCE);
                        }
                        commonOnboardingRepository = ScrollingTagListV3ViewHolder.this.onboardingRepository;
                        commonOnboardingRepository.onStartShowOnboarding();
                        Unit unit = Unit.f71690a;
                        ScrollingTagListV3ViewHolder.this.enableComposerRvScroll();
                    }
                });
            }
        });
    }
}
