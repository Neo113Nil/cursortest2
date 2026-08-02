package ru.ozon.app.android.travel.feature.general.main.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarWeekLayout;

/* loaded from: classes4.dex */
public final class ItemCalendarMonthWeekV1Binding implements a {

    @NonNull
    public final CalendarWeekLayout calendarWeekLayout;

    @NonNull
    private final CalendarWeekLayout rootView;

    private ItemCalendarMonthWeekV1Binding(@NonNull CalendarWeekLayout calendarWeekLayout, @NonNull CalendarWeekLayout calendarWeekLayout2) {
        this.rootView = calendarWeekLayout;
        this.calendarWeekLayout = calendarWeekLayout2;
    }

    @NonNull
    public static ItemCalendarMonthWeekV1Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CalendarWeekLayout calendarWeekLayout = (CalendarWeekLayout) view;
        return new ItemCalendarMonthWeekV1Binding(calendarWeekLayout, calendarWeekLayout);
    }

    @Override // X4.a
    @NonNull
    public CalendarWeekLayout getRoot() {
        return this.rootView;
    }
}
