package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public class x extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public final j f35440a;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35441a;

        public a(int i10) {
            this.f35441a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x.this.f35440a.B0(x.this.f35440a.r0().f(Month.b(this.f35441a, x.this.f35440a.t0().f35276b)));
            x.this.f35440a.C0(j.l.DAY);
            x.this.f35440a.A0();
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f35443a;

        public b(TextView textView) {
            super(textView);
            this.f35443a = textView;
        }
    }

    public x(j jVar) {
        this.f35440a = jVar;
    }

    public final View.OnClickListener d(int i10) {
        return new a(i10);
    }

    public int e(int i10) {
        return i10 - this.f35440a.r0().l().f35277c;
    }

    public int f(int i10) {
        return this.f35440a.r0().l().f35277c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        int f10 = f(i10);
        bVar.f35443a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(f10)));
        TextView textView = bVar.f35443a;
        textView.setContentDescription(h.i(textView.getContext(), f10));
        com.google.android.material.datepicker.b s02 = this.f35440a.s0();
        Calendar k10 = w.k();
        com.google.android.material.datepicker.a aVar = k10.get(1) == f10 ? s02.f35299f : s02.f35297d;
        Iterator it = this.f35440a.u0().T().iterator();
        while (it.hasNext()) {
            k10.setTimeInMillis(((Long) it.next()).longValue());
            if (k10.get(1) == f10) {
                aVar = s02.f35298e;
            }
        }
        aVar.d(bVar.f35443a);
        bVar.f35443a.setSelected(aVar == s02.f35298e);
        bVar.f35443a.setOnClickListener(d(f10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f35440a.r0().m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ia.i.f48492y, viewGroup, false));
    }
}
