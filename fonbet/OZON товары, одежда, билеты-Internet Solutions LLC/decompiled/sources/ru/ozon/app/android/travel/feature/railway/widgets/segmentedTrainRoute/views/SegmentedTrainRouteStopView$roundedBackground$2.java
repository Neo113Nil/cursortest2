package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SegmentedTrainRouteStopView$roundedBackground$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SegmentedTrainRouteStopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedTrainRouteStopView$roundedBackground$2(Context context, SegmentedTrainRouteStopView segmentedTrainRouteStopView) {
        super(0);
        this.$context = context;
        this.this$0 = segmentedTrainRouteStopView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        float f7;
        float f11;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        int themeColor = ThemeExtKt.themeColor(this.$context, R$attr.bgPrimary);
        f7 = this.this$0.dpf16;
        f11 = this.this$0.dpf16;
        return roundedBackgroundProducer.produce(themeColor, f11, f7, 0.0f, 0.0f);
    }
}
