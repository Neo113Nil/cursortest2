package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "position", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "invoke", "(ILWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsGalleryFullV2WidgetViewHolder$previewAdapter$1 extends AbstractC7737t implements Function2<Integer, t, Unit> {
    final /* synthetic */ HotelsGalleryFullV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullV2WidgetViewHolder$previewAdapter$1(HotelsGalleryFullV2WidgetViewHolder hotelsGalleryFullV2WidgetViewHolder) {
        super(2);
        this.this$0 = hotelsGalleryFullV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, t tVar) {
        invoke(num.intValue(), tVar);
        return Unit.f71690a;
    }

    public final void invoke(int i11, t tVar) {
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.this$0.tokenizedAnalytics, tVar, null, 2, null);
        }
        this.this$0.setSelectedFullItem(i11, true);
    }
}
