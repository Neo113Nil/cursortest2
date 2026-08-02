package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation;

import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursFlightDetailsWidgetViewHolder$topCornersBackground$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ ToursFlightDetailsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursFlightDetailsWidgetViewHolder$topCornersBackground$2(ToursFlightDetailsWidgetViewHolder toursFlightDetailsWidgetViewHolder) {
        super(0);
        this.this$0 = toursFlightDetailsWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        int i11;
        float f7;
        float f11;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        i11 = this.this$0.backgroundColor;
        f7 = this.this$0.radius;
        f11 = this.this$0.radius;
        return RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, i11, f7, f11, 0.0f, 0.0f, 24, null);
    }
}
