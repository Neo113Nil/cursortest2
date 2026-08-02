package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.pqd;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ o b;

    public m(o oVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = oVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        k b = materialCalendarGridView.b();
        if (i < b.c() || i > b.f()) {
            return;
        }
        d dVar = this.b.c;
        Long item = materialCalendarGridView.b().getItem(i);
        long longValue = item.longValue();
        MaterialCalendar materialCalendar = dVar.a;
        if (longValue >= ((DateValidatorPointForward) materialCalendar.d.c).a) {
            ((SingleDateSelector) materialCalendar.c).a = item;
            Iterator it = materialCalendar.a.iterator();
            while (it.hasNext()) {
                ((pqd) it.next()).b(((SingleDateSelector) materialCalendar.c).a);
            }
            materialCalendar.i.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = materialCalendar.h;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
