package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import xsna.l2r0;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ j b;
    public final /* synthetic */ c c;

    public f(c cVar, j jVar) {
        this.c = cVar;
        this.b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.c;
        int v = ((LinearLayoutManager) cVar.q.getLayoutManager()).v() + 1;
        if (v < cVar.q.getAdapter().getItemCount()) {
            Calendar c = l2r0.c(this.b.c.b.b);
            c.add(2, v);
            cVar.un(new Month(c));
        }
    }
}
