package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.hut0;
import xsna.iut0;
import xsna.l2r0;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes13.dex */
public final class j extends RecyclerView.Adapter<a> {

    @NonNull
    public final CalendarConstraints c;
    public final DateSelector<?> d;

    @Nullable
    public final DayViewDecorator e;
    public final c.C0120c f;
    public final int g;

    /* compiled from: MonthsPagerAdapter.java */
    public static class a extends RecyclerView.e0 {
        public final TextView l;
        public final MaterialCalendarGridView m;

        public a(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R$id.month_title);
            this.l = textView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            new hut0().d(textView, Boolean.TRUE);
            this.m = (MaterialCalendarGridView) linearLayout.findViewById(R$id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public j(@NonNull ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator, c.C0120c c0120c) {
        Month month = calendarConstraints.b;
        Month month2 = calendarConstraints.c;
        Month month3 = calendarConstraints.e;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * h.h) + (g.Fn(R.attr.windowFullscreen, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) : 0);
        this.c = calendarConstraints;
        this.d = dateSelector;
        this.e = dayViewDecorator;
        this.f = c0120c;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Calendar c = l2r0.c(this.c.b.b);
        c.add(2, i);
        return new Month(c).b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        CalendarConstraints calendarConstraints = this.c;
        Calendar c = l2r0.c(calendarConstraints.b.b);
        c.add(2, i);
        Month month = new Month(c);
        aVar2.l.setText(month.i());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.m.findViewById(R$id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().b)) {
            h hVar = new h(month, this.d, calendarConstraints, this.e);
            materialCalendarGridView.setNumColumns(month.e);
            materialCalendarGridView.setAdapter((ListAdapter) hVar);
        } else {
            materialCalendarGridView.invalidate();
            h a2 = materialCalendarGridView.a();
            DateSelector<?> dateSelector = a2.c;
            Iterator<Long> it = a2.d.iterator();
            while (it.hasNext()) {
                a2.e(materialCalendarGridView, it.next().longValue());
            }
            if (dateSelector != null) {
                Iterator it2 = dateSelector.x3().iterator();
                while (it2.hasNext()) {
                    a2.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                a2.d = dateSelector.x3();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new i(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!g.Fn(R.attr.windowFullscreen, viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.g));
        return new a(linearLayout, true);
    }
}
