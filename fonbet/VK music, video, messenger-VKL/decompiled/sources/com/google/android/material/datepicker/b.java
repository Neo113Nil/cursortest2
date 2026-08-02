package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import xsna.l2r0;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ j b;
    public final /* synthetic */ c c;

    public b(c cVar, j jVar) {
        this.c = cVar;
        this.b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.c;
        int x = ((LinearLayoutManager) cVar.q.getLayoutManager()).x() - 1;
        if (x >= 0) {
            Calendar c = l2r0.c(this.b.c.b.b);
            c.add(2, x);
            cVar.un(new Month(c));
        }
    }
}
