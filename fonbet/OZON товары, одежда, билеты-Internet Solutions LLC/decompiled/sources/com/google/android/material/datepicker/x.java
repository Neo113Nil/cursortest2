package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
final class x extends RecyclerView.g<a> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C5843a f58320a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5846d<?> f58321b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c f58322c;

    /* renamed from: d, reason: collision with root package name */
    private final int f58323d;

    public static class a extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        final TextView f58324a;

        /* renamed from: b, reason: collision with root package name */
        final MaterialCalendarGridView f58325b;

        a(@NonNull LinearLayout linearLayout, boolean z11) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f58324a = textView;
            Y.D(textView, true);
            this.f58325b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z11) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    x(@NonNull ContextThemeWrapper contextThemeWrapper, InterfaceC5846d interfaceC5846d, @NonNull C5843a c5843a, h.c cVar) {
        u j11 = c5843a.j();
        u g10 = c5843a.g();
        u i11 = c5843a.i();
        if (j11.compareTo(i11) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (i11.compareTo(g10) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f58323d = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * v.f58312f) + (p.E(android.R.attr.windowFullscreen, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f58320a = c5843a;
        this.f58321b = interfaceC5846d;
        this.f58322c = cVar;
        setHasStableIds(true);
    }

    @NonNull
    final u g(int i11) {
        return this.f58320a.j().j(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return this.f58320a.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i11) {
        return this.f58320a.j().j(i11).i();
    }

    final int h(@NonNull u uVar) {
        return this.f58320a.j().k(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NonNull a aVar, int i11) {
        a aVar2 = aVar;
        C5843a c5843a = this.f58320a;
        u j11 = c5843a.j().j(i11);
        aVar2.f58324a.setText(j11.h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f58325b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !j11.equals(materialCalendarGridView.a().f58313a)) {
            v vVar = new v(j11, this.f58321b, c5843a);
            materialCalendarGridView.setNumColumns(j11.f58308d);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().f(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!p.E(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f58323d));
        return new a(linearLayout, true);
    }
}
