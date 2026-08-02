package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import xsna.l2r0;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class e extends RecyclerView.t {
    public final /* synthetic */ j b;
    public final /* synthetic */ MaterialButton c;
    public final /* synthetic */ c d;

    public e(c cVar, j jVar, MaterialButton materialButton) {
        this.d = cVar;
        this.b = jVar;
        this.c = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.c.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        CalendarConstraints calendarConstraints = this.b.c;
        c cVar = this.d;
        int v = i < 0 ? ((LinearLayoutManager) cVar.q.getLayoutManager()).v() : ((LinearLayoutManager) cVar.q.getLayoutManager()).x();
        Calendar c = l2r0.c(calendarConstraints.b.b);
        c.add(2, v);
        cVar.m = new Month(c);
        Calendar c2 = l2r0.c(calendarConstraints.b.b);
        c2.add(2, v);
        this.c.setText(new Month(c2).i());
    }
}
