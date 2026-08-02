package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.c;
import java.util.Iterator;
import xsna.pb80;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes13.dex */
public final class i implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView b;
    public final /* synthetic */ j c;

    public i(j jVar, MaterialCalendarGridView materialCalendarGridView) {
        this.c = jVar;
        this.b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.b;
        h a = materialCalendarGridView.a();
        if (i < a.a() || i > a.c()) {
            return;
        }
        c.C0120c c0120c = this.c.f;
        long longValue = materialCalendarGridView.a().getItem(i).longValue();
        c cVar = c.this;
        if (cVar.k.d.Z6(longValue)) {
            cVar.j.B8(longValue);
            Iterator it = cVar.h.iterator();
            while (it.hasNext()) {
                ((pb80) it.next()).b(cVar.j.q8());
            }
            cVar.q.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = cVar.p;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
