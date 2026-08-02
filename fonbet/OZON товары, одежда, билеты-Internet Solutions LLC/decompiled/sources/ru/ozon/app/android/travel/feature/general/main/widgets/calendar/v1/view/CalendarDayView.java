package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import hd.C6915b;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.R$styleable;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarDayVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001-B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J(\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0014J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0014J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u001aR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "drawingCommands", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO$DayState;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "selectedDayColor", "selectedTodayDayColor", "rangePartDayColor", "dayDefaultColor", "selectionCornerRadius", "", "backgroundPath", "Landroid/graphics/Path;", "backgroundPaint", "Landroid/graphics/Paint;", "boundedData", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "calendarDayTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getCalendarDayTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "item", "DrawDay", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarDayView extends FrameLayout {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Path backgroundPath;

    @NotNull
    private CalendarDayVO boundedData;

    @NotNull
    private final AppCompatTextView calendarDayTextView;
    private int dayDefaultColor;

    @NotNull
    private final Map<CalendarDayVO.DayState, DrawDay> drawingCommands;
    private int rangePartDayColor;
    private int selectedDayColor;
    private int selectedTodayDayColor;
    private float selectionCornerRadius;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\b\u001e\u001f !\"#$%B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004JH\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0004JP\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004JP\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004R$\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\b&'()*+,-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "", "<init>", "()V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "drawSquare", "view", "Landroid/view/View;", "canvas", "paint", "Landroid/graphics/Paint;", "color", "", "cornerRadius", "", "drawPath", "path", "Landroid/graphics/Path;", "startX", "startY", "endX", "endY", "drawPathWithLeftSquaredCorners", "drawPathWithRightSquaredCorners", "AsSelected", "AsStartInterval", "AsEndInterval", "AsMediumInterval", "AsPart", "AsStartPart", "AsEndPart", "ByDefault", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsEndInterval;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsEndPart;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsMediumInterval;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsPart;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsSelected;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsStartInterval;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsStartPart;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$ByDefault;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class DrawDay {

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsEndInterval;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "intervalColor", "", "selectedDayColor", "selectedTodayDayColor", "cornerRadius", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IIIF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsEndInterval extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsEndInterval(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, int i12, int i13, float f7) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsEndInterval$drawCommand$1(this, path, paint, view, i11, i13, i12, f7);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsEndPart;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "color", "", "cornerRadius", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsEndPart extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsEndPart(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, float f7) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsEndPart$drawCommand$1(this, path, paint, view, i11, f7);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsMediumInterval;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "intervalColor", "", "selectedDayColor", "selectedTodayDayColor", "cornerRadius", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IIIF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsMediumInterval extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsMediumInterval(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, int i12, int i13, float f7) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsMediumInterval$drawCommand$1(this, path, paint, view, i11, i13, i12, f7);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsPart;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "color", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;I)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsPart extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsPart(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsPart$drawCommand$1(this, path, paint, view, i11);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsSelected;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "paint", "Landroid/graphics/Paint;", "selectedDayColor", "", "selectedTodayDayColor", "cornerRadius", "", "<init>", "(Landroid/view/View;Landroid/graphics/Paint;IIF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsSelected extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsSelected(@NotNull View view, @NotNull Paint paint, int i11, int i12, float f7) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsSelected$drawCommand$1(this, view, paint, i12, i11, f7);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsStartInterval;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "intervalColor", "", "selectedDayColor", "selectedTodayDayColor", "cornerRadius", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IIIF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsStartInterval extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsStartInterval(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, int i12, int i13, float f7) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsStartInterval$drawCommand$1(this, path, paint, view, i11, i13, i12, f7);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$AsStartPart;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "color", "", "cornerRadius", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsStartPart extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsStartPart(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, float f7) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsStartPart$drawCommand$1(this, path, paint, view, i11, f7);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay$ByDefault;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "color", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;I)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ByDefault extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ByDefault(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$ByDefault$drawCommand$1(this, path, paint, view, i11);
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        public /* synthetic */ DrawDay(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        protected final void drawPath(@NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, float startX, float startY, float endX, float endY, int color) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            path.reset();
            path.moveTo(startX, startY);
            path.lineTo(endX, startY);
            path.lineTo(endX, endY);
            path.lineTo(startX, endY);
            path.lineTo(startX, startY);
            canvas.drawPath(path, paint);
        }

        protected final void drawPathWithLeftSquaredCorners(@NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, float startX, float startY, float endX, float endY, int color, float cornerRadius) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            path.reset();
            path.moveTo(endX, startY);
            path.lineTo(endX, endY);
            path.lineTo(startX + cornerRadius, endY);
            float f7 = 2 * cornerRadius;
            float f11 = startX + f7;
            path.arcTo(startX, endY - f7, f11, endY, 90.0f, 90.0f, false);
            path.lineTo(startX, startY + cornerRadius);
            path.arcTo(startX, startY, f11, startY + f7, 180.0f, 90.0f, false);
            path.lineTo(endX, startY);
            canvas.drawPath(path, paint);
        }

        protected final void drawPathWithRightSquaredCorners(@NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, float startX, float startY, float endX, float endY, int color, float cornerRadius) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            path.reset();
            path.moveTo(startX, startY);
            path.lineTo(endX - cornerRadius, startY);
            float f7 = 2 * cornerRadius;
            float f11 = endX - f7;
            path.arcTo(f11, startY, endX, startY + f7, 270.0f, 90.0f, false);
            path.lineTo(endX, endY - cornerRadius);
            path.arcTo(f11, endY - f7, endX, endY, 0.0f, 90.0f, false);
            path.lineTo(startX, endY);
            path.lineTo(startX, startY);
            canvas.drawPath(path, paint);
        }

        protected final void drawSquare(@NotNull View view, @NotNull Canvas canvas, @NotNull Paint paint, int color, float cornerRadius) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(paint, "paint");
            float width = view.getWidth() / 2.0f;
            float height = view.getHeight() / 2.0f;
            paint.setColor(color);
            canvas.drawRoundRect(width - height, 0.0f, height + width, view.getHeight(), cornerRadius, cornerRadius, paint);
        }

        @NotNull
        public abstract Function2<Canvas, CalendarDayVO, Unit> getDrawCommand();

        private DrawDay() {
        }
    }

    public /* synthetic */ CalendarDayView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull CalendarDayVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        invalidate();
    }

    @NotNull
    public final AppCompatTextView getCalendarDayTextView() {
        return this.calendarDayTextView;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Function2<Canvas, CalendarDayVO, Unit> drawCommand;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        DrawDay drawDay = this.drawingCommands.get(this.boundedData.getState());
        if (drawDay == null || (drawCommand = drawDay.getDrawCommand()) == null) {
            return;
        }
        drawCommand.invoke(canvas, this.boundedData);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(C6915b.c(Math.max(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec))), 1073741824), heightMeasureSpec);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        DrawDay.AsSelected asSelected = new DrawDay.AsSelected(this, this.backgroundPaint, this.selectedDayColor, this.selectedTodayDayColor, this.selectionCornerRadius);
        this.drawingCommands.put(CalendarDayVO.DayState.SINGLE_SELECTION, asSelected);
        this.drawingCommands.put(CalendarDayVO.DayState.MATCHED, asSelected);
        this.drawingCommands.put(CalendarDayVO.DayState.START_INTERVAL, new DrawDay.AsStartInterval(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectedDayColor, this.selectedTodayDayColor, this.selectionCornerRadius));
        this.drawingCommands.put(CalendarDayVO.DayState.END_INTERVAL, new DrawDay.AsEndInterval(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectedDayColor, this.selectedTodayDayColor, this.selectionCornerRadius));
        this.drawingCommands.put(CalendarDayVO.DayState.MEDIUM_INTERVAL, new DrawDay.AsMediumInterval(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectedDayColor, this.selectedTodayDayColor, this.selectionCornerRadius));
        this.drawingCommands.put(CalendarDayVO.DayState.PART, new DrawDay.AsPart(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor));
        this.drawingCommands.put(CalendarDayVO.DayState.START_PART, new DrawDay.AsStartPart(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectionCornerRadius));
        this.drawingCommands.put(CalendarDayVO.DayState.END_PART, new DrawDay.AsEndPart(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectionCornerRadius));
        this.drawingCommands.put(CalendarDayVO.DayState.DEFAULT, new DrawDay.ByDefault(this, this.backgroundPath, this.backgroundPaint, this.dayDefaultColor));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDayView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.drawingCommands = new EnumMap(CalendarDayVO.DayState.class);
        this.selectedDayColor = ThemeExtKt.themeColor(context, R$attr.graphicPrimary);
        this.selectedTodayDayColor = ThemeExtKt.themeColor(context, R$attr.bgActionPrimary);
        this.rangePartDayColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.dayDefaultColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.selectionCornerRadius = ResourceExtKt.toPxF(6, context);
        this.backgroundPath = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        this.boundedData = CalendarDayVO.INSTANCE.newEmptyDay();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L);
        this.calendarDayTextView = appCompatTextView;
        addView(appCompatTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TravelCalendarDayView, 0, 0);
            try {
                this.selectedDayColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarDayView_calendarDaySelectedColor, this.selectedDayColor);
                this.selectedTodayDayColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarDayView_calendarDaySelectedTodayDayColor, this.selectedTodayDayColor);
                this.rangePartDayColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarDayView_calendarDayRangePartColor, this.rangePartDayColor);
                this.dayDefaultColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarDayView_calendarDayDefaultColor, this.dayDefaultColor);
                this.selectionCornerRadius = obtainStyledAttributes.getDimension(R$styleable.TravelCalendarDayView_calendarDayDefaultColor, this.selectionCornerRadius);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
