package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes9.dex */
public final class h<S> extends z<S> {

    /* renamed from: b, reason: collision with root package name */
    private int f58247b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5846d<S> f58248c;

    /* renamed from: d, reason: collision with root package name */
    private C5843a f58249d;

    /* renamed from: e, reason: collision with root package name */
    private u f58250e;

    /* renamed from: f, reason: collision with root package name */
    private d f58251f;

    /* renamed from: g, reason: collision with root package name */
    private C5845c f58252g;

    /* renamed from: h, reason: collision with root package name */
    private RecyclerView f58253h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView f58254i;

    /* renamed from: j, reason: collision with root package name */
    private View f58255j;

    /* renamed from: k, reason: collision with root package name */
    private View f58256k;

    final class a extends C5305a {
        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull y2.q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            qVar.M(null);
        }
    }

    final class b extends A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, int i11, int i12) {
            super(context, i11, false);
            this.f58257a = i12;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected final void calculateExtraLayoutSpace(@NonNull RecyclerView.A a11, @NonNull int[] iArr) {
            h hVar = h.this;
            if (this.f58257a == 0) {
                iArr[0] = hVar.f58254i.getWidth();
                iArr[1] = hVar.f58254i.getWidth();
            } else {
                iArr[0] = hVar.f58254i.getHeight();
                iArr[1] = hVar.f58254i.getHeight();
            }
        }
    }

    final class c implements e {
        c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class d {
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

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    interface e {
    }

    final C5843a B() {
        return this.f58249d;
    }

    final C5845c C() {
        return this.f58252g;
    }

    final u D() {
        return this.f58250e;
    }

    public final InterfaceC5846d<S> E() {
        return this.f58248c;
    }

    @NonNull
    final LinearLayoutManager F() {
        return (LinearLayoutManager) this.f58254i.getLayoutManager();
    }

    final void G(u uVar) {
        x xVar = (x) this.f58254i.getAdapter();
        int h11 = xVar.h(uVar);
        int h12 = h11 - xVar.h(this.f58250e);
        boolean z11 = Math.abs(h12) > 3;
        boolean z12 = h12 > 0;
        this.f58250e = uVar;
        if (z11 && z12) {
            this.f58254i.scrollToPosition(h11 - 3);
            this.f58254i.post(new g(this, h11));
        } else if (!z11) {
            this.f58254i.post(new g(this, h11));
        } else {
            this.f58254i.scrollToPosition(h11 + 3);
            this.f58254i.post(new g(this, h11));
        }
    }

    final void H(d dVar) {
        this.f58251f = dVar;
        if (dVar == d.YEAR) {
            this.f58253h.getLayoutManager().scrollToPosition(((E) this.f58253h.getAdapter()).g(this.f58250e.f58307c));
            this.f58255j.setVisibility(0);
            this.f58256k.setVisibility(8);
        } else if (dVar == d.DAY) {
            this.f58255j.setVisibility(8);
            this.f58256k.setVisibility(0);
            G(this.f58250e);
        }
    }

    final void I() {
        d dVar = this.f58251f;
        d dVar2 = d.YEAR;
        if (dVar == dVar2) {
            H(d.DAY);
        } else if (dVar == d.DAY) {
            H(dVar2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f58247b = bundle.getInt("THEME_RES_ID_KEY");
        this.f58248c = (InterfaceC5846d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f58249d = (C5843a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f58250e = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        int i12;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f58247b);
        this.f58252g = new C5845c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u j11 = this.f58249d.j();
        if (p.E(R.attr.windowFullscreen, contextThemeWrapper)) {
            i11 = ru.ozon.app.android.R.layout.mtrl_calendar_vertical;
            i12 = 1;
        } else {
            i11 = ru.ozon.app.android.R.layout.mtrl_calendar_horizontal;
            i12 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ru.ozon.app.android.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(ru.ozon.app.android.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(ru.ozon.app.android.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(ru.ozon.app.android.R.dimen.mtrl_calendar_days_of_week_height);
        int i13 = v.f58312f;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(ru.ozon.app.android.R.dimen.mtrl_calendar_month_vertical_padding) * (i13 - 1)) + (resources.getDimensionPixelSize(ru.ozon.app.android.R.dimen.mtrl_calendar_day_height) * i13) + resources.getDimensionPixelOffset(ru.ozon.app.android.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(ru.ozon.app.android.R.id.mtrl_calendar_days_of_week);
        Y.C(gridView, new a());
        gridView.setAdapter((ListAdapter) new f());
        gridView.setNumColumns(j11.f58308d);
        gridView.setEnabled(false);
        this.f58254i = (RecyclerView) inflate.findViewById(ru.ozon.app.android.R.id.mtrl_calendar_months);
        this.f58254i.setLayoutManager(new b(getContext(), i12, i12));
        this.f58254i.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f58248c, this.f58249d, new c());
        this.f58254i.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(ru.ozon.app.android.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ru.ozon.app.android.R.id.mtrl_calendar_year_selector_frame);
        this.f58253h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f58253h.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer, 1));
            this.f58253h.setAdapter(new E(this));
            this.f58253h.addItemDecoration(new i(this));
        }
        if (inflate.findViewById(ru.ozon.app.android.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(ru.ozon.app.android.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            Y.C(materialButton, new j(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(ru.ozon.app.android.R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(ru.ozon.app.android.R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f58255j = inflate.findViewById(ru.ozon.app.android.R.id.mtrl_calendar_year_selector_frame);
            this.f58256k = inflate.findViewById(ru.ozon.app.android.R.id.mtrl_calendar_day_selector_frame);
            H(d.DAY);
            materialButton.setText(this.f58250e.h());
            this.f58254i.addOnScrollListener(new k(this, xVar, materialButton));
            materialButton.setOnClickListener(new l(this));
            materialButton3.setOnClickListener(new m(this, xVar));
            materialButton2.setOnClickListener(new n(this, xVar));
        }
        if (!p.E(R.attr.windowFullscreen, contextThemeWrapper)) {
            new androidx.recyclerview.widget.x().attachToRecyclerView(this.f58254i);
        }
        this.f58254i.scrollToPosition(xVar.h(this.f58250e));
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f58247b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f58248c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f58249d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f58250e);
    }

    @Override // com.google.android.material.datepicker.z
    public final void t(@NonNull y yVar) {
        this.f58326a.add(yVar);
    }
}
