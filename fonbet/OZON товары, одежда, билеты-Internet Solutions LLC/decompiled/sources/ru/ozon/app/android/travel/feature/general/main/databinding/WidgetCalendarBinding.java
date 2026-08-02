package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarView;

/* loaded from: classes4.dex */
public final class WidgetCalendarBinding implements a {

    @NonNull
    public final CalendarView calendarView;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout travelCalendarProgressBar;

    private WidgetCalendarBinding(@NonNull FrameLayout frameLayout, @NonNull CalendarView calendarView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.calendarView = calendarView;
        this.travelCalendarProgressBar = frameLayout2;
    }

    @NonNull
    public static WidgetCalendarBinding bind(@NonNull View view) {
        int i11 = R$id.calendarView;
        CalendarView calendarView = (CalendarView) C2548q.d(i11, view);
        if (calendarView != null) {
            i11 = R$id.travelCalendarProgressBar;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                return new WidgetCalendarBinding((FrameLayout) view, calendarView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
