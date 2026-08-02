package ru.ozon.app.android.travel.calendar.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.calendar.view.CalendarDayView;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarDayVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "canvas", "Landroid/graphics/Canvas;", "<unused var>", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CalendarDayView$DrawDay$AsToday$drawCommand$1 extends AbstractC7737t implements Function2<Canvas, CalendarDayVO, Unit> {
    final /* synthetic */ int $borderColor;
    final /* synthetic */ Paint $borderPaint;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $sidePadding;
    final /* synthetic */ View $view;
    final /* synthetic */ CalendarDayView.DrawDay.AsToday this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarDayView$DrawDay$AsToday$drawCommand$1(CalendarDayView.DrawDay.AsToday asToday, View view, Paint paint, int i11, float f7, float f11) {
        super(2);
        this.this$0 = asToday;
        this.$view = view;
        this.$borderPaint = paint;
        this.$borderColor = i11;
        this.$cornerRadius = f7;
        this.$sidePadding = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, CalendarDayVO calendarDayVO) {
        invoke2(canvas, calendarDayVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Canvas canvas, CalendarDayVO calendarDayVO) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(calendarDayVO, "<unused var>");
        this.this$0.drawSquare(this.$view, canvas, this.$borderPaint, this.$borderColor, this.$cornerRadius, this.$sidePadding);
    }
}
