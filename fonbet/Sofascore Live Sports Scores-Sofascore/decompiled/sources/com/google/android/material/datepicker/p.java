package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public p(q qVar, int i) {
        this.b = qVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.b.a;
        Month b = Month.b(this.a, materialCalendar.e.b);
        CalendarConstraints calendarConstraints = materialCalendar.d;
        Month month = calendarConstraints.b;
        Month month2 = calendarConstraints.a;
        if (b.compareTo(month2) < 0) {
            b = month2;
        } else if (b.compareTo(month) > 0) {
            b = month;
        }
        materialCalendar.l(b);
        materialCalendar.m(1);
        MaterialButton materialButton = materialCalendar.n;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
