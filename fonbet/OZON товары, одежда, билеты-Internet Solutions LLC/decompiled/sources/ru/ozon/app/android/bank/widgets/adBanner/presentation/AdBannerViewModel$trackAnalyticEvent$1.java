package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import WZ.e;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.bank.widgets.adBanner.data.AnalyticEventType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdBannerViewModel$trackAnalyticEvent$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AdBannerItemVO $adBannerItemVO;
    final /* synthetic */ AnalyticEventType $analyticEventType;
    final /* synthetic */ Function2<t, e, Unit> $trackComposerAnalytics;
    final /* synthetic */ AdBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdBannerViewModel$trackAnalyticEvent$1(AnalyticEventType analyticEventType, AdBannerItemVO adBannerItemVO, AdBannerViewModel adBannerViewModel, Function2<? super t, ? super e, Unit> function2) {
        super(0);
        this.$analyticEventType = analyticEventType;
        this.$adBannerItemVO = adBannerItemVO;
        this.this$0 = adBannerViewModel;
        this.$trackComposerAnalytics = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t tokenizedEvent;
        if (this.$analyticEventType == AnalyticEventType.VIEW && (tokenizedEvent = this.$adBannerItemVO.getTokenizedEvent()) != null) {
            this.$trackComposerAnalytics.invoke(tokenizedEvent, null);
        }
        this.this$0.sendSetBannerActionRequest(this.$analyticEventType, this.$adBannerItemVO);
    }
}
