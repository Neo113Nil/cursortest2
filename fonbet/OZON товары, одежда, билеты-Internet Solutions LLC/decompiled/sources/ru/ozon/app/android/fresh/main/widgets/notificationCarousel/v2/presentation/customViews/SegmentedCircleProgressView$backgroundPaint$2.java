package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews;

import android.content.Context;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews.SegmentedCircleProgressView;
import ru.ozon.uni.android.uikitsdk.ext.ColorExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SegmentedCircleProgressView$backgroundPaint$2 extends AbstractC7737t implements Function0<Paint> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedCircleProgressView$backgroundPaint$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Paint invoke() {
        SegmentedCircleProgressView.Companion companion;
        Paint paint = new Paint(1);
        paint.setColor(ColorExtKt.toColorInt(UniColors.CLEAR_LIGHT_KEY_400.getResId(), this.$context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        companion = SegmentedCircleProgressView.Companion;
        paint.setStrokeWidth(companion.getDEFAULT_CIRCLE_WIDTH());
        return paint;
    }
}
