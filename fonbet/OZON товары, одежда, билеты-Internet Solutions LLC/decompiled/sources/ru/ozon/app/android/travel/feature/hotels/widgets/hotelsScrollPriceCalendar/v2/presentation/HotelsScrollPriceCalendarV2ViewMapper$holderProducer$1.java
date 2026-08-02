package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.di.HotelsScrollPriceCalendarV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view.HotelsScrollPriceCalendarV2View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2WidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsScrollPriceCalendarV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HotelsScrollPriceCalendarV2WidgetViewHolder> {
    final /* synthetic */ HotelsScrollPriceCalendarV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsScrollPriceCalendarV2ViewMapper$holderProducer$1(HotelsScrollPriceCalendarV2ViewMapper hotelsScrollPriceCalendarV2ViewMapper) {
        super(2);
        this.this$0 = hotelsScrollPriceCalendarV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HotelsScrollPriceCalendarV2WidgetViewHolder invoke(View view, ComposerReferences refs) {
        HotelsScrollPriceCalendarV2Component hotelsScrollPriceCalendarV2Component;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        hotelsScrollPriceCalendarV2Component = this.this$0.component;
        return new HotelsScrollPriceCalendarV2WidgetViewHolder((HotelsScrollPriceCalendarV2View) view, hotelsScrollPriceCalendarV2Component.getTokenizedAnalytics(), refs);
    }
}
