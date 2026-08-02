package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import Ve.ViewOnClickListenerC4465n7;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.R$styleable;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarDayVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0004\b\u0018\u0010\u0019R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010#R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010#R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarWeekLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView;", "newCalendarDayView", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView;", "dayView", "", "setUpClickListener", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "item", "getTextColor", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;)I", "", "days", "showDays", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "onDateClickListener", "Lkotlin/jvm/functions/Function1;", "getOnDateClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnDateClickListener", "(Lkotlin/jvm/functions/Function1;)V", "minHeight", "I", "padding", "", "calendarDays", "[Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDayView;", "selectedTextColor", "darkThemeNotTodayDateSelectedTextColor", "todayDateTextColor", "workDateTextColor", "weekendDateTextColor", "unavailableTextColor", "", "isDarkThemeActive", "Z", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarWeekLayout extends LinearLayout {

    @NotNull
    private final CalendarDayView[] calendarDays;
    private int darkThemeNotTodayDateSelectedTextColor;
    private final boolean isDarkThemeActive;
    private final int minHeight;
    private Function1<? super LocalDate, Unit> onDateClickListener;
    private final int padding;
    private int selectedTextColor;
    private int todayDateTextColor;
    private int unavailableTextColor;
    private int weekendDateTextColor;
    private int workDateTextColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarWeekLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getTextColor(CalendarDayVO item) {
        if (!C7714v.b0(CalendarDayVO.DayState.SINGLE_SELECTION, CalendarDayVO.DayState.START_INTERVAL, CalendarDayVO.DayState.MEDIUM_INTERVAL, CalendarDayVO.DayState.END_INTERVAL, CalendarDayVO.DayState.MATCHED).contains(item.getState())) {
            return item.getIsTodayDate() ? this.todayDateTextColor : (item.getIsAvailable() && item.getIsWeekend()) ? this.weekendDateTextColor : item.getIsAvailable() ? this.workDateTextColor : this.unavailableTextColor;
        }
        if (!item.getIsTodayDate() && this.isDarkThemeActive) {
            return this.darkThemeNotTodayDateSelectedTextColor;
        }
        return this.selectedTextColor;
    }

    private final CalendarDayView newCalendarDayView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CalendarDayView calendarDayView = new CalendarDayView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        calendarDayView.setLayoutParams(layoutParams);
        calendarDayView.setMinimumHeight(this.minHeight);
        int i11 = this.padding;
        calendarDayView.setPadding(i11, i11, i11, i11);
        return calendarDayView;
    }

    private final void setUpClickListener(CalendarDayView dayView) {
        dayView.setOnClickListener(new ViewOnClickListenerC4465n7(2, dayView, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpClickListener$lambda$9(CalendarDayView calendarDayView, CalendarWeekLayout calendarWeekLayout, View view) {
        Function1<? super LocalDate, Unit> function1;
        Object tag = calendarDayView.getTag();
        LocalDate localDate = tag instanceof LocalDate ? (LocalDate) tag : null;
        if (localDate == null || (function1 = calendarWeekLayout.onDateClickListener) == null) {
            return;
        }
        function1.invoke(localDate);
    }

    public final void setOnDateClickListener(Function1<? super LocalDate, Unit> function1) {
        this.onDateClickListener = function1;
    }

    public final void showDays(@NotNull List<CalendarDayVO> days) {
        Intrinsics.checkNotNullParameter(days, "days");
        CalendarDayView[] calendarDayViewArr = this.calendarDays;
        int length = calendarDayViewArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            CalendarDayView calendarDayView = calendarDayViewArr[i11];
            int i13 = i12 + 1;
            CalendarDayVO calendarDayVO = days.get(i12);
            boolean z11 = calendarDayVO.getIsAvailable() && !h.K(calendarDayVO.getText());
            calendarDayView.setClickable(z11);
            calendarDayView.setFocusable(z11);
            calendarDayView.setTag(calendarDayVO.getDate());
            AppCompatTextView calendarDayTextView = calendarDayView.getCalendarDayTextView();
            calendarDayTextView.setText(calendarDayVO.getText());
            calendarDayTextView.setTextColor(getTextColor(calendarDayVO));
            calendarDayView.bind(calendarDayVO);
            i11++;
            i12 = i13;
        }
    }

    public /* synthetic */ CalendarWeekLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarWeekLayout(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.minHeight = ResourceExtKt.toPx(36, context);
        this.padding = ResourceExtKt.toPx(8, context);
        CalendarDayView[] calendarDayViewArr = new CalendarDayView[7];
        for (int i13 = 0; i13 < 7; i13++) {
            calendarDayViewArr[i13] = newCalendarDayView();
        }
        this.calendarDays = calendarDayViewArr;
        this.selectedTextColor = ThemeExtKt.themeColor(context, R$attr.bgLightKey);
        this.darkThemeNotTodayDateSelectedTextColor = ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable);
        this.todayDateTextColor = ThemeExtKt.themeColor(context, R$attr.textPrimary);
        this.workDateTextColor = ThemeExtKt.themeColor(context, R$attr.textPrimary);
        this.weekendDateTextColor = ThemeExtKt.themeColor(context, R$attr.textSecondary);
        this.unavailableTextColor = ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable);
        this.isDarkThemeActive = ThemeExtKt.isDarkThemeActive(context);
        setOrientation(0);
        for (CalendarDayView calendarDayView : calendarDayViewArr) {
            addView(calendarDayView);
            setUpClickListener(calendarDayView);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TravelCalendarWeekLayout, 0, 0);
            try {
                this.selectedTextColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarWeekLayout_calendarDaySelectedTextColor, this.selectedTextColor);
                this.darkThemeNotTodayDateSelectedTextColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarWeekLayout_darkThemeNotTodayDateSelectedTextColor, this.darkThemeNotTodayDateSelectedTextColor);
                this.todayDateTextColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarWeekLayout_calendarDayTodayDateTextColor, this.todayDateTextColor);
                this.workDateTextColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarWeekLayout_calendarDayWorkDateTextColor, this.workDateTextColor);
                this.weekendDateTextColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarWeekLayout_calendarDayWeekendDateTextColor, this.weekendDateTextColor);
                this.unavailableTextColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarWeekLayout_calendarDayUnavailableTextColor, this.unavailableTextColor);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
