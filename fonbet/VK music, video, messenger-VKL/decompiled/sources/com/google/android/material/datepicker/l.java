package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import xsna.a09;
import xsna.l2r0;
import xsna.tz8;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes13.dex */
public final class l extends RecyclerView.Adapter<a> {
    public final c<?> c;

    /* compiled from: YearGridAdapter.java */
    public static class a extends RecyclerView.e0 {
        public final TextView l;

        public a(TextView textView) {
            super(textView);
            this.l = textView;
        }
    }

    public l(c<?> cVar) {
        this.c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.k.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        c<?> cVar = this.c;
        int i2 = cVar.k.b.d + i;
        aVar2.l.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = aVar2.l;
        Context context = textView.getContext();
        textView.setContentDescription(l2r0.d().get(1) == i2 ? String.format(context.getString(R$string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R$string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        a09 a09Var = cVar.o;
        Calendar d = l2r0.d();
        tz8 tz8Var = d.get(1) == i2 ? a09Var.f : a09Var.d;
        Iterator it = cVar.j.x3().iterator();
        while (it.hasNext()) {
            d.setTimeInMillis(((Long) it.next()).longValue());
            if (d.get(1) == i2) {
                tz8Var = a09Var.e;
            }
        }
        tz8Var.b(textView);
        textView.setOnClickListener(new k(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_year, viewGroup, false));
    }
}
