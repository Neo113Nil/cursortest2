package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ScrollingTagListV3ViewHolder$showOldOnboardingForWidget$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ String $onboardingKey;
    final /* synthetic */ long $widgetId;
    final /* synthetic */ ScrollingTagListV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingTagListV3ViewHolder$showOldOnboardingForWidget$1(ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder, OnBoardingDTO onBoardingDTO, long j11, String str) {
        super(0);
        this.this$0 = scrollingTagListV3ViewHolder;
        this.$onboarding = onBoardingDTO;
        this.$widgetId = j11;
        this.$onboardingKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder) {
        OnBoardingDelegate onBoardingDelegate;
        ScrollingTagListV3ViewHolder.Companion companion;
        ScrollingTagListV3ViewHolder.Companion companion2;
        onBoardingDelegate = scrollingTagListV3ViewHolder.onboardingDelegate;
        if (onBoardingDelegate != null) {
            companion = ScrollingTagListV3ViewHolder.Companion;
            Integer valueOf = Integer.valueOf(companion.getONBOARDING_HORIZONTAL_MARGIN());
            companion2 = ScrollingTagListV3ViewHolder.Companion;
            onBoardingDelegate.bind(scrollingTagListV3ViewHolder, new OnBoardingCutConfig(null, null, null, null, null, valueOf, Float.valueOf(companion2.getONBOARDING_CORNER_RADIUS()), false, 31, null), ScrollingTagListV3ViewHolder$showOldOnboardingForWidget$1$1$1.INSTANCE);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        Handler handler;
        CommonOnboardingRepository commonOnboardingRepository;
        onBoardingDelegate = this.this$0.onboardingDelegate;
        if (onBoardingDelegate == null) {
            this.this$0.initDelegate(this.$onboarding, this.$widgetId, this.$onboardingKey);
        }
        handler = this.this$0.onboardingHandler;
        final ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder = this.this$0;
        handler.post(new Runnable() { // from class: ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.a
            @Override // java.lang.Runnable
            public final void run() {
                ScrollingTagListV3ViewHolder$showOldOnboardingForWidget$1.invoke$lambda$0(ScrollingTagListV3ViewHolder.this);
            }
        });
        commonOnboardingRepository = this.this$0.onboardingRepository;
        commonOnboardingRepository.onStartShowOnboarding();
        Unit unit = Unit.f71690a;
        this.this$0.enableComposerRvScroll();
    }
}
