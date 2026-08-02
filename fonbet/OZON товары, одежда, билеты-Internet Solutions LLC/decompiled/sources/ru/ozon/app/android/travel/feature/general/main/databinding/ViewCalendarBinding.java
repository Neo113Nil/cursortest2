package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.R$layout;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarBottomView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDaysRoundControlView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.WeekRowLayout;

/* loaded from: classes4.dex */
public final class ViewCalendarBinding implements a {

    @NonNull
    public final CalendarBottomView calendarBottomView;

    @NonNull
    public final Barrier calendarDateControlBottomBarrier;

    @NonNull
    public final Group calendarDateControlGroup;

    @NonNull
    public final RecyclerView calendarDaysRv;

    @NonNull
    public final AppCompatTextView calendarEmptyDateTv;

    @NonNull
    public final CalendarDateControlView calendarReturnDateControl;

    @NonNull
    public final CalendarDateControlView calendarStartDateControl;

    @NonNull
    public final AppCompatTextView calendarTitleTv;

    @NonNull
    public final Group calendarTourDateControlGroup;

    @NonNull
    public final CalendarDaysRoundControlView calendarTourDaysRoundControl;

    @NonNull
    public final CalendarDateControlView calendarTourStartDateControl;

    @NonNull
    public final WeekRowLayout calendarWeekRow;

    @NonNull
    private final View rootView;

    private ViewCalendarBinding(@NonNull View view, @NonNull CalendarBottomView calendarBottomView, @NonNull Barrier barrier, @NonNull Group group, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull CalendarDateControlView calendarDateControlView, @NonNull CalendarDateControlView calendarDateControlView2, @NonNull AppCompatTextView appCompatTextView2, @NonNull Group group2, @NonNull CalendarDaysRoundControlView calendarDaysRoundControlView, @NonNull CalendarDateControlView calendarDateControlView3, @NonNull WeekRowLayout weekRowLayout) {
        this.rootView = view;
        this.calendarBottomView = calendarBottomView;
        this.calendarDateControlBottomBarrier = barrier;
        this.calendarDateControlGroup = group;
        this.calendarDaysRv = recyclerView;
        this.calendarEmptyDateTv = appCompatTextView;
        this.calendarReturnDateControl = calendarDateControlView;
        this.calendarStartDateControl = calendarDateControlView2;
        this.calendarTitleTv = appCompatTextView2;
        this.calendarTourDateControlGroup = group2;
        this.calendarTourDaysRoundControl = calendarDaysRoundControlView;
        this.calendarTourStartDateControl = calendarDateControlView3;
        this.calendarWeekRow = weekRowLayout;
    }

    @NonNull
    public static ViewCalendarBinding bind(@NonNull View view) {
        int i11 = R$id.calendarBottomView;
        CalendarBottomView calendarBottomView = (CalendarBottomView) C2548q.d(i11, view);
        if (calendarBottomView != null) {
            i11 = R$id.calendarDateControlBottomBarrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.calendarDateControlGroup;
                Group group = (Group) C2548q.d(i11, view);
                if (group != null) {
                    i11 = R$id.calendarDaysRv;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.calendarEmptyDateTv;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView != null) {
                            i11 = R$id.calendarReturnDateControl;
                            CalendarDateControlView calendarDateControlView = (CalendarDateControlView) C2548q.d(i11, view);
                            if (calendarDateControlView != null) {
                                i11 = R$id.calendarStartDateControl;
                                CalendarDateControlView calendarDateControlView2 = (CalendarDateControlView) C2548q.d(i11, view);
                                if (calendarDateControlView2 != null) {
                                    i11 = R$id.calendarTitleTv;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                    if (appCompatTextView2 != null) {
                                        i11 = R$id.calendarTourDateControlGroup;
                                        Group group2 = (Group) C2548q.d(i11, view);
                                        if (group2 != null) {
                                            i11 = R$id.calendarTourDaysRoundControl;
                                            CalendarDaysRoundControlView calendarDaysRoundControlView = (CalendarDaysRoundControlView) C2548q.d(i11, view);
                                            if (calendarDaysRoundControlView != null) {
                                                i11 = R$id.calendarTourStartDateControl;
                                                CalendarDateControlView calendarDateControlView3 = (CalendarDateControlView) C2548q.d(i11, view);
                                                if (calendarDateControlView3 != null) {
                                                    i11 = R$id.calendarWeekRow;
                                                    WeekRowLayout weekRowLayout = (WeekRowLayout) C2548q.d(i11, view);
                                                    if (weekRowLayout != null) {
                                                        return new ViewCalendarBinding(view, calendarBottomView, barrier, group, recyclerView, appCompatTextView, calendarDateControlView, calendarDateControlView2, appCompatTextView2, group2, calendarDaysRoundControlView, calendarDateControlView3, weekRowLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCalendarBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_calendar, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
