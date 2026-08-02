package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3VO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ScrollingTagListV3ViewHolder$showOnBoarding$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ScrollingTagListV3VO $item;
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ long $widgetId;
    final /* synthetic */ ScrollingTagListV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingTagListV3ViewHolder$showOnBoarding$1(ScrollingTagListV3VO scrollingTagListV3VO, ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder, OnBoardingDTO onBoardingDTO, long j11) {
        super(1);
        this.$item = scrollingTagListV3VO;
        this.this$0 = scrollingTagListV3ViewHolder;
        this.$onboarding = onBoardingDTO;
        this.$widgetId = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String pageTag) {
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        if (this.$item.getOnboardingIndex() == null) {
            this.this$0.showOldOnboardingForWidget(pageTag, this.$onboarding, this.$widgetId);
        } else {
            this.this$0.showOnBoardingForTag(pageTag, this.$onboarding, this.$item.getOnboardingIndex().intValue(), this.$widgetId);
        }
    }
}
