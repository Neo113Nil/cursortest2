package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.AbstractC2082d0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;

/* loaded from: classes3.dex */
public class r extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public final CalendarConstraints f35426a;

    /* renamed from: b, reason: collision with root package name */
    public final DateSelector f35427b;

    /* renamed from: c, reason: collision with root package name */
    public final j.m f35428c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35429d;

    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f35430a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f35430a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f35430a.getAdapter().r(i10)) {
                r.this.f35428c.a(this.f35430a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f35432a;

        /* renamed from: b, reason: collision with root package name */
        public final MaterialCalendarGridView f35433b;

        public b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ia.g.f48399G);
            this.f35432a = textView;
            AbstractC2082d0.m0(textView, true);
            this.f35433b = (MaterialCalendarGridView) linearLayout.findViewById(ia.g.f48395C);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public r(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, j.m mVar) {
        Month l10 = calendarConstraints.l();
        Month h10 = calendarConstraints.h();
        Month k10 = calendarConstraints.k();
        if (l10.compareTo(k10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (k10.compareTo(h10) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f35429d = (q.f35419f * j.v0(context)) + (n.v0(context) ? j.v0(context) : 0);
        this.f35426a = calendarConstraints;
        this.f35427b = dateSelector;
        this.f35428c = mVar;
        setHasStableIds(true);
    }

    public Month d(int i10) {
        return this.f35426a.l().j(i10);
    }

    public CharSequence e(int i10) {
        return d(i10).h();
    }

    public int f(Month month) {
        return this.f35426a.l().k(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        Month j10 = this.f35426a.l().j(i10);
        bVar.f35432a.setText(j10.h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f35433b.findViewById(ia.g.f48395C);
        if (materialCalendarGridView.getAdapter() == null || !j10.equals(materialCalendarGridView.getAdapter().f35421a)) {
            q qVar = new q(j10, this.f35427b, this.f35426a, null);
            materialCalendarGridView.setNumColumns(j10.f35278d);
            materialCalendarGridView.setAdapter((ListAdapter) qVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f35426a.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f35426a.l().j(i10).i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ia.i.f48490w, viewGroup, false);
        if (!n.v0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f35429d));
        return new b(linearLayout, true);
    }
}
