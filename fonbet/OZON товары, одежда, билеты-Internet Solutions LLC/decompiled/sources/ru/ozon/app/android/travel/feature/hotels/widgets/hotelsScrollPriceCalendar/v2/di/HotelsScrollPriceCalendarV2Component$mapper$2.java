package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.data.HotelsScrollPriceCalendarV2Mapper;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsScrollPriceCalendarV2Component$mapper$2 extends AbstractC7737t implements Function0<HotelsScrollPriceCalendarV2Mapper> {
    final /* synthetic */ HotelsScrollPriceCalendarV2Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsScrollPriceCalendarV2Component$mapper$2(HotelsScrollPriceCalendarV2Component hotelsScrollPriceCalendarV2Component) {
        super(0);
        this.this$0 = hotelsScrollPriceCalendarV2Component;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HotelsScrollPriceCalendarV2Mapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        ContextComponentDependencies contextComponentDependencies2;
        contextComponentDependencies = this.this$0.contextComponentApi;
        Context context = contextComponentDependencies.getContext();
        int px = CornerRadius.RADIUS_500.getPx();
        contextComponentDependencies2 = this.this$0.contextComponentApi;
        return new HotelsScrollPriceCalendarV2Mapper(context, ResourceExtKt.toPxF(px, contextComponentDependencies2.getContext()));
    }
}
