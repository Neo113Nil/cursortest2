package ru.ozon.app.android.travel.calendar.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.calendar.view.CalendarDayView;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarDayVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "canvas", "Landroid/graphics/Canvas;", "dayVO", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CalendarDayView$DrawDay$AsStartInterval$drawCommand$1 extends AbstractC7737t implements Function2<Canvas, CalendarDayVO, Unit> {
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ int $intervalColor;
    final /* synthetic */ Paint $paint;
    final /* synthetic */ Path $path;
    final /* synthetic */ int $selectedDayColor;
    final /* synthetic */ float $sidePadding;
    final /* synthetic */ View $view;
    final /* synthetic */ CalendarDayView.DrawDay.AsStartInterval this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarDayView$DrawDay$AsStartInterval$drawCommand$1(CalendarDayView.DrawDay.AsStartInterval asStartInterval, Path path, Paint paint, View view, int i11, int i12, float f7, float f11) {
        super(2);
        this.this$0 = asStartInterval;
        this.$path = path;
        this.$paint = paint;
        this.$view = view;
        this.$intervalColor = i11;
        this.$selectedDayColor = i12;
        this.$cornerRadius = f7;
        this.$sidePadding = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, CalendarDayVO calendarDayVO) {
        invoke2(canvas, calendarDayVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Canvas canvas, CalendarDayVO dayVO) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(dayVO, "dayVO");
        CalendarDayVO.DayState state = dayVO.getState();
        CalendarDayVO.DayState.StartInterval startInterval = state instanceof CalendarDayVO.DayState.StartInterval ? (CalendarDayVO.DayState.StartInterval) state : null;
        if (startInterval != null && startInterval.getIsNotBorder()) {
            this.this$0.drawPath(canvas, this.$path, this.$paint, this.$view.getWidth() / 2.0f, 0.0f, this.$view.getWidth(), this.$view.getHeight(), this.$intervalColor);
        }
        this.this$0.drawSquare(this.$view, canvas, this.$paint, this.$selectedDayColor, this.$cornerRadius, this.$sidePadding);
    }
}
