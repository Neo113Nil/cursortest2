package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyPromoBannerViewHolder$onWidgetCreated$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ StickyPromoBannerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyPromoBannerViewHolder$onWidgetCreated$2(StickyPromoBannerViewHolder stickyPromoBannerViewHolder) {
        super(0);
        this.this$0 = stickyPromoBannerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction clickAction;
        Function1 actionHandler;
        t tokenizedEvent;
        l tokenizedAnalytics;
        StickyPromoBannerVO stickyPromoBannerVO = (StickyPromoBannerVO) this.this$0.getBoundData();
        if (stickyPromoBannerVO != null && (tokenizedEvent = stickyPromoBannerVO.getTokenizedEvent()) != null) {
            tokenizedAnalytics = this.this$0.getTokenizedAnalytics();
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        StickyPromoBannerVO stickyPromoBannerVO2 = (StickyPromoBannerVO) this.this$0.getBoundData();
        if (stickyPromoBannerVO2 == null || (clickAction = stickyPromoBannerVO2.getClickAction()) == null) {
            return;
        }
        actionHandler = this.this$0.getActionHandler();
        actionHandler.invoke(clickAction);
    }
}
