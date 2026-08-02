package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
final class E extends RecyclerView.g<a> {

    /* renamed from: a, reason: collision with root package name */
    private final h<?> f58211a;

    public static class a extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        final TextView f58212a;

        a(TextView textView) {
            super(textView);
            this.f58212a = textView;
        }
    }

    E(h<?> hVar) {
        this.f58211a = hVar;
    }

    final int g(int i11) {
        return i11 - this.f58211a.B().j().f58307c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return this.f58211a.B().k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NonNull a aVar, int i11) {
        a aVar2 = aVar;
        h<?> hVar = this.f58211a;
        int i12 = hVar.B().j().f58307c + i11;
        String string = aVar2.f58212a.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i12));
        TextView textView = aVar2.f58212a;
        textView.setText(format);
        textView.setContentDescription(String.format(string, Integer.valueOf(i12)));
        C5845c C11 = hVar.C();
        Calendar c11 = C.c();
        C5844b c5844b = c11.get(1) == i12 ? C11.f58238f : C11.f58236d;
        Iterator<Long> it = hVar.E().H0().iterator();
        while (it.hasNext()) {
            c11.setTimeInMillis(it.next().longValue());
            if (c11.get(1) == i12) {
                c5844b = C11.f58237e;
            }
        }
        c5844b.d(textView);
        textView.setOnClickListener(new D(this, i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
