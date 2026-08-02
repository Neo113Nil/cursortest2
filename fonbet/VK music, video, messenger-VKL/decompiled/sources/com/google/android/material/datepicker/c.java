package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.g;
import xsna.a09;
import xsna.am;
import xsna.f6k0;
import xsna.hk;
import xsna.iut0;
import xsna.tl10;
import xsna.ul10;
import xsna.vl10;
import xsna.wha0;
import xsna.wl10;
import xsna.z1l;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class c<S> extends wha0<S> {
    public int i;

    @Nullable
    public DateSelector<S> j;

    @Nullable
    public CalendarConstraints k;

    @Nullable
    public DayViewDecorator l;

    @Nullable
    public Month m;
    public d n;
    public a09 o;
    public RecyclerView p;
    public RecyclerView q;
    public View r;
    public View s;
    public View t;
    public View u;

    /* compiled from: MaterialCalendar.java */
    public class a extends hk {
        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.p(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    public class b extends f6k0 {
        public final /* synthetic */ int r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2) {
            super(i, false);
            this.r = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void o(@NonNull RecyclerView.a0 a0Var, @NonNull int[] iArr) {
            int i = this.r;
            c cVar = c.this;
            if (i == 0) {
                iArr[0] = cVar.q.getWidth();
                iArr[1] = cVar.q.getWidth();
            } else {
                iArr[0] = cVar.q.getHeight();
                iArr[1] = cVar.q.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.c$c, reason: collision with other inner class name */
    public class C0120c {
        public C0120c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MaterialCalendar.java */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d DAY;
        public static final d YEAR;

        static {
            d dVar = new d("DAY", 0);
            DAY = dVar;
            d dVar2 = new d("YEAR", 1);
            YEAR = dVar2;
            $VALUES = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.i = bundle.getInt("THEME_RES_ID_KEY");
        this.j = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.k = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.l = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.m = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo2getContext(), this.i);
        this.o = new a09(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.k.b;
        if (g.Fn(R.attr.windowFullscreen, contextThemeWrapper)) {
            i = R$layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R$layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R$dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_days_of_week_height);
        int i3 = h.h;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R$id.mtrl_calendar_days_of_week);
        iut0.q(gridView, new a());
        int i4 = this.k.f;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new z1l(i4) : new z1l()));
        gridView.setNumColumns(month.e);
        gridView.setEnabled(false);
        this.q = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_months);
        mo2getContext();
        this.q.setLayoutManager(new b(i2, i2));
        this.q.setTag("MONTHS_VIEW_GROUP_TAG");
        j jVar = new j(contextThemeWrapper, this.j, this.k, this.l, new C0120c());
        this.q.setAdapter(jVar);
        int integer = contextThemeWrapper.getResources().getInteger(R$integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
        this.p = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.p.setLayoutManager(new GridLayoutManager(integer, 1));
            this.p.setAdapter(new l(this));
            this.p.addItemDecoration(new com.google.android.material.datepicker.d(this));
        }
        if (inflate.findViewById(R$id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R$id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            iut0.q(materialButton, new vl10(this));
            View findViewById = inflate.findViewById(R$id.month_navigation_previous);
            this.r = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R$id.month_navigation_next);
            this.s = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.t = inflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
            this.u = inflate.findViewById(R$id.mtrl_calendar_day_selector_frame);
            vn(d.DAY);
            materialButton.setText(this.m.i());
            this.q.addOnScrollListener(new e(this, jVar, materialButton));
            materialButton.setOnClickListener(new wl10(this));
            this.s.setOnClickListener(new f(this, jVar));
            this.r.setOnClickListener(new com.google.android.material.datepicker.b(this, jVar));
        }
        if (!g.Fn(R.attr.windowFullscreen, contextThemeWrapper)) {
            new g0().attachToRecyclerView(this.q);
        }
        this.q.scrollToPosition(jVar.c.b.j(this.m));
        iut0.q(this.q, new ul10());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.i);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.j);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.k);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.l);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.m);
    }

    @Override // xsna.wha0
    public final void tn(@NonNull g.c cVar) {
        this.h.add(cVar);
    }

    public final void un(Month month) {
        j jVar = (j) this.q.getAdapter();
        int j = jVar.c.b.j(month);
        int j2 = j - jVar.c.b.j(this.m);
        boolean z = Math.abs(j2) > 3;
        boolean z2 = j2 > 0;
        this.m = month;
        if (z && z2) {
            this.q.scrollToPosition(j - 3);
            this.q.post(new tl10(this, j, 0));
        } else if (!z) {
            this.q.post(new tl10(this, j, 0));
        } else {
            this.q.scrollToPosition(j + 3);
            this.q.post(new tl10(this, j, 0));
        }
    }

    public final void vn(d dVar) {
        this.n = dVar;
        if (dVar == d.YEAR) {
            this.p.getLayoutManager().scrollToPosition(this.m.d - ((l) this.p.getAdapter()).c.k.b.d);
            this.t.setVisibility(0);
            this.u.setVisibility(8);
            this.r.setVisibility(8);
            this.s.setVisibility(8);
            return;
        }
        if (dVar == d.DAY) {
            this.t.setVisibility(8);
            this.u.setVisibility(0);
            this.r.setVisibility(0);
            this.s.setVisibility(0);
            un(this.m);
        }
    }
}
