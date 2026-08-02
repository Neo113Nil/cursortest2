package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class w implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MaterialCalendarGridView f58318a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f58319b;

    w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f58319b = xVar;
        this.f58318a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        h.e eVar;
        C5843a c5843a;
        InterfaceC5846d interfaceC5846d;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        InterfaceC5846d interfaceC5846d2;
        MaterialCalendarGridView materialCalendarGridView = this.f58318a;
        v a11 = materialCalendarGridView.a();
        if (i11 < a11.f58313a.e() || i11 > a11.c()) {
            return;
        }
        eVar = this.f58319b.f58322c;
        long longValue = materialCalendarGridView.a().getItem(i11).longValue();
        h hVar = h.this;
        c5843a = hVar.f58249d;
        if (c5843a.f().R(longValue)) {
            interfaceC5846d = hVar.f58248c;
            interfaceC5846d.B();
            Iterator it = hVar.f58326a.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                interfaceC5846d2 = hVar.f58248c;
                yVar.a(interfaceC5846d2.m());
            }
            hVar.f58254i.getAdapter().notifyDataSetChanged();
            recyclerView = hVar.f58253h;
            if (recyclerView != null) {
                recyclerView2 = hVar.f58253h;
                recyclerView2.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
