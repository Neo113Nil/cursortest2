package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import defpackage.bsk;
import defpackage.cb;
import defpackage.euk;
import defpackage.fl4;
import defpackage.kzb;
import defpackage.ng2;
import defpackage.pvd;
import defpackage.q61;
import defpackage.qkj;
import defpackage.tyb;
import defpackage.uyb;
import defpackage.vyb;
import defpackage.yia;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public int b;
    public DateSelector c;
    public CalendarConstraints d;
    public Month e;
    public int f;
    public ng2 g;
    public RecyclerView h;
    public RecyclerView i;
    public View j;
    public View k;
    public View l;
    public View m;
    public MaterialButton n;
    public AccessibilityManager o;
    public androidx.recyclerview.widget.i p;
    public boolean q;

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void j(kzb kzbVar) {
        this.a.add(kzbVar);
    }

    public final boolean k(boolean z) {
        Month month;
        if (this.q) {
            return false;
        }
        if (this.i.getScrollState() != 0) {
            return true;
        }
        o oVar = (o) this.i.getAdapter();
        if (oVar == null || (month = this.e) == null) {
            return false;
        }
        int p = oVar.p(month) + (z ? 1 : -1);
        if (p < 0 || p >= oVar.a.g) {
            return false;
        }
        oVar.g = z ? 2 : 1;
        l(oVar.o(p));
        return true;
    }

    public final void l(Month month) {
        o oVar = (o) this.i.getAdapter();
        int p = oVar.p(month);
        AccessibilityManager accessibilityManager = this.o;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int p2 = p - oVar.p(this.e);
            int i = 3;
            boolean z = Math.abs(p2) > 3;
            boolean z2 = p2 > 0;
            this.e = month;
            if (z && z2) {
                this.i.scrollToPosition(p - 3);
                this.i.post(new q61(this, p, i));
            } else {
                RecyclerView recyclerView = this.i;
                if (z) {
                    recyclerView.scrollToPosition(p + 3);
                    this.i.post(new q61(this, p, i));
                } else {
                    recyclerView.post(new q61(this, p, i));
                }
            }
        } else {
            this.e = month;
            this.i.scrollToPosition(p);
        }
        o();
        p(p);
    }

    public final void m(int i) {
        this.f = i;
        if (i == 2) {
            this.h.getLayoutManager().scrollToPosition(this.e.c - ((q) this.h.getAdapter()).a.d.a.c);
            this.l.setVisibility(0);
            this.m.setVisibility(8);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.l.setVisibility(8);
            this.m.setVisibility(0);
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            l(this.e);
        }
    }

    public final void n(View view) {
        if (view == null) {
            return;
        }
        int i = this.f;
        if (i == 2) {
            bsk.r(view, getString(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            bsk.r(view, getString(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void o() {
        Month month;
        o oVar = (o) this.i.getAdapter();
        if (oVar == null || this.q || (month = this.e) == null || month.equals(oVar.f)) {
            return;
        }
        int p = oVar.p(oVar.f);
        oVar.f = month;
        int p2 = oVar.p(month);
        oVar.notifyItemChanged(p);
        oVar.notifyItemChanged(p2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.e = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            pvd.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.g = new ng2(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.o = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month month = this.d.a;
        boolean t = MaterialDatePicker.t(android.R.attr.windowFullscreen, contextThemeWrapper);
        this.q = t;
        int i3 = 0;
        int i4 = 1;
        if (t) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = k.f;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        bsk.q(gridView, new uyb(0));
        int i6 = this.d.e;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new fl4(i6) : new fl4()));
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.i = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.i.setLayoutManager(new vyb(this, i2, i2));
        this.i.setTag("MONTHS_VIEW_GROUP_TAG");
        o oVar = new o(contextThemeWrapper, this.c, this.d, new d(this), new yia(this, 2));
        this.i.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.h.setLayoutManager(new GridLayoutManager(integer, 0));
            this.h.setAdapter(new q(this));
            this.h.addItemDecoration(new e(this));
        }
        if (!this.q) {
            androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i();
            this.p = iVar;
            iVar.attachToRecyclerView(this.i);
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.n = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            bsk.q(this.n, new euk(this, 5));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.j = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            qkj.a(this.j, getString(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.k = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            qkj.a(this.k, getString(R.string.mtrl_picker_next_month_tooltip));
            this.l = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.m = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m(1);
            this.n.setText(this.e.d());
            this.i.addOnScrollListener(new f(this, oVar));
            this.n.setOnClickListener(new cb(this, 3));
            this.k.setOnClickListener(new tyb(this, oVar, i3));
            this.j.setOnClickListener(new tyb(this, oVar, i4));
            p(oVar.p(this.e));
        }
        this.i.scrollToPosition(oVar.p(this.e));
        bsk.q(this.i, new uyb(1));
        n(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.e);
    }

    public final void p(int i) {
        View view = this.k;
        if (view != null) {
            view.setEnabled(i + 1 < this.i.getAdapter().getItemCount());
        }
        View view2 = this.j;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }
}
