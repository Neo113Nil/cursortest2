package ru.ozon.app.android.regulardraw.widgets.daily.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.daily.ui.DailyBackground;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DailyBackground$drawMainColorRect$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Canvas $this_drawMainColorRect;
    final /* synthetic */ DailyBackground this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyBackground$drawMainColorRect$1(Canvas canvas, DailyBackground dailyBackground) {
        super(0);
        this.$this_drawMainColorRect = canvas;
        this.this$0 = dailyBackground;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        DailyBackground.Companion companion;
        DailyBackground.Companion companion2;
        DailyBackgroundPalette dailyBackgroundPalette;
        Canvas canvas = this.$this_drawMainColorRect;
        rectF = this.this$0.rectF;
        float f7 = rectF.left;
        rectF2 = this.this$0.rectF;
        float f11 = rectF2.top;
        rectF3 = this.this$0.rectF;
        float f12 = rectF3.right;
        rectF4 = this.this$0.rectF;
        float f13 = rectF4.bottom;
        companion = DailyBackground.Companion;
        float cornerRadius = companion.getCornerRadius();
        companion2 = DailyBackground.Companion;
        float cornerRadius2 = companion2.getCornerRadius();
        dailyBackgroundPalette = this.this$0.palette;
        canvas.drawRoundRect(f7, f11, f12, f13, cornerRadius, cornerRadius2, dailyBackgroundPalette.getBgPaint());
    }
}
