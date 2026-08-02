package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.hrf;
import defpackage.lhk;
import defpackage.yia;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o extends androidx.recyclerview.widget.l {
    public final CalendarConstraints a;
    public final DateSelector b;
    public final d c;
    public final yia d;
    public final int e;
    public Month f;
    public int g = 0;

    public o(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, d dVar, yia yiaVar) {
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.compareTo(month3) > 0) {
            a70.p("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.compareTo(month2) > 0) {
            a70.p("currentPage cannot be after lastPage");
            throw null;
        }
        this.e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * k.f) + (MaterialDatePicker.t(android.R.attr.windowFullscreen, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.a = calendarConstraints;
        this.b = dateSelector;
        this.c = dVar;
        this.d = yiaVar;
        this.f = month3;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.a.g;
    }

    @Override // androidx.recyclerview.widget.l
    public final long getItemId(int i) {
        Calendar c = lhk.c(this.a.a.a);
        c.add(2, i);
        return new Month(c).a.getTimeInMillis();
    }

    public final Month o(int i) {
        Calendar c = lhk.c(this.a.a.a);
        c.add(2, i);
        return new Month(c);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        n nVar = (n) uVar;
        CalendarConstraints calendarConstraints = this.a;
        Calendar c = lhk.c(calendarConstraints.a.a);
        c.add(2, i);
        Month month = new Month(c);
        nVar.b.setText(month.d());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) nVar.c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !month.equals(materialCalendarGridView.b().a)) {
            k kVar = new k(month, this.b, calendarConstraints);
            materialCalendarGridView.setNumColumns(month.d);
            materialCalendarGridView.setAdapter((ListAdapter) kVar);
        } else {
            materialCalendarGridView.invalidate();
            k b = materialCalendarGridView.b();
            DateSelector dateSelector = b.b;
            Iterator it = b.c.iterator();
            while (it.hasNext()) {
                b.h(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                SingleDateSelector singleDateSelector = (SingleDateSelector) dateSelector;
                Iterator it2 = singleDateSelector.a().iterator();
                while (it2.hasNext()) {
                    b.h(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                b.c = singleDateSelector.a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new m(this, materialCalendarGridView));
        materialCalendarGridView.c = this.d;
        boolean t = MaterialDatePicker.t(android.R.attr.windowFullscreen, nVar.itemView.getContext());
        if (t || month.equals(this.f)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (t || !month.equals(this.f)) {
            return;
        }
        final int i2 = this.g;
        this.g = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: com.google.android.material.datepicker.l
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int a;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i3 = i2) == 0) {
                    return;
                }
                k b2 = materialCalendarGridView2.b();
                if (i3 == 1) {
                    a = b2.b(b2.f() + 1);
                    if (a == -1) {
                        a = b2.f();
                    }
                } else {
                    a = b2.a(b2.c() - 1);
                    if (a == -1) {
                        a = b2.c();
                    }
                }
                materialCalendarGridView2.setSelection(a);
            }
        });
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.t(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            return new n(linearLayout, false);
        }
        linearLayout.setLayoutParams(new hrf(-1, this.e));
        return new n(linearLayout, true);
    }

    public final int p(Month month) {
        return this.a.a.f(month);
    }
}
