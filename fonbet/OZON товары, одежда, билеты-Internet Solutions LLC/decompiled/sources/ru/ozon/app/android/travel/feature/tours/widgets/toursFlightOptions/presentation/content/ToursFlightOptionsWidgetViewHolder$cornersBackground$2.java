package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/RippleDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursFlightOptionsWidgetViewHolder$cornersBackground$2 extends AbstractC7737t implements Function0<RippleDrawable> {
    final /* synthetic */ ToursFlightOptionsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursFlightOptionsWidgetViewHolder$cornersBackground$2(ToursFlightOptionsWidgetViewHolder toursFlightOptionsWidgetViewHolder) {
        super(0);
        this.this$0 = toursFlightOptionsWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RippleDrawable invoke() {
        ColorStateList colorStateList;
        int i11;
        float f7;
        colorStateList = this.this$0.rippleColor;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        i11 = this.this$0.bgColor;
        f7 = this.this$0.dpf24;
        return new RippleDrawable(colorStateList, roundedBackgroundProducer.produce(i11, f7), null);
    }
}
