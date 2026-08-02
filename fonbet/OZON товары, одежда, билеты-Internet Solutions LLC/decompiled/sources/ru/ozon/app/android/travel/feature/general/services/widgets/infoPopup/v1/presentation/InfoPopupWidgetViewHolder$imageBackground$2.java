package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.presentation;

import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InfoPopupWidgetViewHolder$imageBackground$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ InfoPopupWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoPopupWidgetViewHolder$imageBackground$2(InfoPopupWidgetViewHolder infoPopupWidgetViewHolder) {
        super(0);
        this.this$0 = infoPopupWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        float f7;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        f7 = this.this$0.bgCornerRadius;
        return roundedBackgroundProducer.produce(0, f7);
    }
}
