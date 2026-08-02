package ru.ozon.app.android.travel.calendar.view;

import FV.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarDayVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.calendar.view.vo.IndicatorColor;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001b\u001a\u00020\u000f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\"J7\u0010(\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0014¢\u0006\u0004\b(\u0010)J/\u0010,\u001a\u00020\n2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0*2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b,\u0010-R0\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0014\u0010=\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u0010>\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R\u0014\u0010?\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010@\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00107R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00107R\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00107R\u0014\u0010C\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00107R\u0014\u0010D\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarWeekLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView;", "newCalendarDayView", "()Lru/ozon/app/android/travel/calendar/view/CalendarDayView;", "dayView", "", "setUpClickListener", "(Lru/ozon/app/android/travel/calendar/view/CalendarDayView;)V", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "item", "", "getTextColor", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;)I", "", "isMin", "getPriceIndicatorColor", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;Z)Ljava/lang/Integer;", "", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/IndicatorColor;", "indicatorColors", "colorIndicator", "getColorIndicatorColor", "(Ljava/util/Map;Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;)I", "getTextIndicatorColor", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;)Ljava/lang/Integer;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "", "days", "showDays", "(Ljava/util/List;Ljava/util/Map;)V", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "onDateClickListener", "Lkotlin/jvm/functions/Function1;", "getOnDateClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnDateClickListener", "(Lkotlin/jvm/functions/Function1;)V", "minHeight", "I", "padding", "", "calendarDays", "[Lru/ozon/app/android/travel/calendar/view/CalendarDayView;", "selectedTextIndicatorColor", "selectedMinPriceIndicatorColor", "selectedTextColorLight", "selectedTextColorDark", "workWeekDateTextColor", "unavailableWorkWeekDateTextColor", "weekendDateTextColor", "unavailableWeekendDateTextColor", "isDarkThemeActive", "Z", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarWeekLayout extends ViewGroup {

    @NotNull
    private final CalendarDayView[] calendarDays;
    private final boolean isDarkThemeActive;
    private final int minHeight;
    private Function1<? super LocalDate, Unit> onDateClickListener;
    private final int padding;
    private final int selectedMinPriceIndicatorColor;
    private final int selectedTextColorDark;
    private final int selectedTextColorLight;
    private final int selectedTextIndicatorColor;
    private final int unavailableWeekendDateTextColor;
    private final int unavailableWorkWeekDateTextColor;
    private final int weekendDateTextColor;
    private final int workWeekDateTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarWeekLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.minHeight = ResourceExtKt.toPx(44, context);
        this.padding = ResourceExtKt.toPx(4, context);
        CalendarDayView[] calendarDayViewArr = new CalendarDayView[7];
        for (int i11 = 0; i11 < 7; i11++) {
            calendarDayViewArr[i11] = newCalendarDayView();
        }
        this.calendarDays = calendarDayViewArr;
        this.selectedTextIndicatorColor = ThemeExtKt.themeColor(context, R$attr.textTertiaryInverted);
        this.selectedMinPriceIndicatorColor = ThemeExtKt.themeColor(context, R$attr.textPositiveInverted);
        this.selectedTextColorLight = ThemeExtKt.themeColor(context, R$attr.textLightKey);
        this.selectedTextColorDark = ThemeExtKt.themeColor(context, R$attr.textDarkKey);
        this.workWeekDateTextColor = ThemeExtKt.themeColor(context, R$attr.textPrimary);
        this.unavailableWorkWeekDateTextColor = ThemeExtKt.themeColor(context, R$attr.textTertiary);
        this.weekendDateTextColor = ThemeExtKt.themeColor(context, R$attr.textAccent);
        this.unavailableWeekendDateTextColor = ThemeExtKt.themeColor(context, R$attr.textDiscountUnavialable);
        this.isDarkThemeActive = ThemeExtKt.isDarkThemeActive(context);
        for (CalendarDayView calendarDayView : calendarDayViewArr) {
            addView(calendarDayView);
            setUpClickListener(calendarDayView);
        }
    }

    private final int getColorIndicatorColor(Map<Indicator.ColorIndicator, IndicatorColor> indicatorColors, CalendarDayVO item, Indicator.ColorIndicator colorIndicator) {
        String color;
        IndicatorColor indicatorColor = indicatorColors.get(colorIndicator);
        if (indicatorColor == null) {
            return 0;
        }
        if (item.getState() instanceof CalendarDayVO.SelectedDayState) {
            color = indicatorColor.getSelectedColor();
            if (color == null) {
                color = indicatorColor.getColor();
            }
        } else {
            color = indicatorColor.getColor();
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        if (parseColor != null) {
            return parseColor.intValue();
        }
        return 0;
    }

    private final Integer getPriceIndicatorColor(CalendarDayVO item, boolean isMin) {
        if (item.getState() instanceof CalendarDayVO.SelectedDayState) {
            return isMin ? Integer.valueOf(this.selectedMinPriceIndicatorColor) : this.isDarkThemeActive ? Integer.valueOf(this.selectedTextColorDark) : Integer.valueOf(this.selectedTextColorLight);
        }
        return null;
    }

    private final int getTextColor(CalendarDayVO item) {
        return item.getState() instanceof CalendarDayVO.SelectedDayState ? this.isDarkThemeActive ? this.selectedTextColorDark : this.selectedTextColorLight : (item.getIsAvailable() && item.getIsWorkday()) ? this.workWeekDateTextColor : item.getIsAvailable() ? this.weekendDateTextColor : item.getIsWorkday() ? this.unavailableWorkWeekDateTextColor : this.unavailableWeekendDateTextColor;
    }

    private final Integer getTextIndicatorColor(CalendarDayVO item) {
        if (item.getState() instanceof CalendarDayVO.SelectedDayState) {
            return Integer.valueOf(this.selectedTextIndicatorColor);
        }
        return null;
    }

    private final CalendarDayView newCalendarDayView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CalendarDayView calendarDayView = new CalendarDayView(context);
        int i11 = this.padding;
        calendarDayView.setPadding(i11, i11, i11, i11);
        return calendarDayView;
    }

    private final void setUpClickListener(CalendarDayView dayView) {
        dayView.setOnClickListener(new c(2, dayView, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpClickListener$lambda$7(CalendarDayView calendarDayView, CalendarWeekLayout calendarWeekLayout, View view) {
        Function1<? super LocalDate, Unit> function1;
        Object tag = calendarDayView.getTag();
        LocalDate localDate = tag instanceof LocalDate ? (LocalDate) tag : null;
        if (localDate == null || (function1 = calendarWeekLayout.onDateClickListener) == null) {
            return;
        }
        function1.invoke(localDate);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingEnd = (((right - left) - getPaddingEnd()) - getPaddingStart()) / this.calendarDays.length;
        int paddingTop = getPaddingTop();
        int paddingBottom = (bottom - top) - getPaddingBottom();
        CalendarDayView[] calendarDayViewArr = this.calendarDays;
        int length = calendarDayViewArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            CalendarDayView calendarDayView = calendarDayViewArr[i11];
            int i13 = i12 + 1;
            int paddingStart = (i12 * paddingEnd) + getPaddingStart();
            calendarDayView.layout(paddingStart, paddingTop, paddingStart + paddingEnd, paddingBottom);
            i11++;
            i12 = i13;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize / this.calendarDays.length, 1073741824);
        int i11 = this.minHeight;
        for (CalendarDayView calendarDayView : this.calendarDays) {
            measureChild(calendarDayView, makeMeasureSpec, heightMeasureSpec);
            i11 = Math.max(i11, calendarDayView.getMeasuredHeight());
        }
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + defaultSize, getPaddingBottom() + getPaddingTop() + i11);
    }

    public final void setOnDateClickListener(Function1<? super LocalDate, Unit> function1) {
        this.onDateClickListener = function1;
    }

    public final void showDays(@NotNull List<CalendarDayVO> days, @NotNull Map<Indicator.ColorIndicator, IndicatorColor> indicatorColors) {
        Intrinsics.checkNotNullParameter(days, "days");
        Intrinsics.checkNotNullParameter(indicatorColors, "indicatorColors");
        CalendarDayView[] calendarDayViewArr = this.calendarDays;
        int length = calendarDayViewArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            CalendarDayView calendarDayView = calendarDayViewArr[i11];
            int i13 = i12 + 1;
            CalendarDayVO calendarDayVO = days.get(i12);
            boolean z11 = calendarDayVO.getIsAvailable() && calendarDayVO.getIsEnabled();
            calendarDayView.setClickable(z11);
            calendarDayView.setFocusable(z11);
            calendarDayView.setTag(calendarDayVO.getDate());
            calendarDayView.bindTitle(calendarDayVO.getText(), getTextColor(calendarDayVO));
            if (calendarDayVO.getIsIndicatorVisible()) {
                Indicator indicator = calendarDayVO.getIndicator();
                if (indicator instanceof Indicator.PriceIndicator) {
                    calendarDayView.bindTextIndicator(((Indicator.PriceIndicator) calendarDayVO.getIndicator()).getPrice(), getPriceIndicatorColor(calendarDayVO, ((Indicator.PriceIndicator) calendarDayVO.getIndicator()).getIsMin()));
                    calendarDayView.hideColorIndicator();
                } else if (indicator instanceof Indicator.ColorIndicator) {
                    calendarDayView.hideTextIndicator();
                    calendarDayView.bindColorIndicator(getColorIndicatorColor(indicatorColors, calendarDayVO, (Indicator.ColorIndicator) calendarDayVO.getIndicator()));
                } else if (indicator instanceof Indicator.TextIndicator) {
                    calendarDayView.bindTextIndicator(((Indicator.TextIndicator) calendarDayVO.getIndicator()).getText(), getTextIndicatorColor(calendarDayVO));
                    calendarDayView.hideColorIndicator();
                } else {
                    calendarDayView.hideTextIndicator();
                    calendarDayView.hideColorIndicator();
                }
            } else {
                calendarDayView.hideTextIndicator();
                calendarDayView.hideColorIndicator();
            }
            if (calendarDayVO.getIsIndicatorSupported()) {
                calendarDayView.showIndicatorContainer();
            } else {
                calendarDayView.hideIndicatorContainer();
            }
            calendarDayView.bind(calendarDayVO);
            i11++;
            i12 = i13;
        }
    }
}
