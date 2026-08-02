package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.c;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes13.dex */
public final class k implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ l c;

    public k(l lVar, int i) {
        this.c = lVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.c;
        Month b = Month.b(this.b, lVar.c.m.c);
        CalendarConstraints calendarConstraints = lVar.c.k;
        Month month = calendarConstraints.c;
        Month month2 = calendarConstraints.b;
        if (b.compareTo(month2) < 0) {
            b = month2;
        } else if (b.compareTo(month) > 0) {
            b = month;
        }
        lVar.c.un(b);
        lVar.c.vn(c.d.DAY);
    }
}
