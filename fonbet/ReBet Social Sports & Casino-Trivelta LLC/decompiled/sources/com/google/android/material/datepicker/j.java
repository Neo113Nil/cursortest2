package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import x0.C6774c;
import y0.z;

/* loaded from: classes3.dex */
public final class j<S> extends t {

    /* renamed from: B, reason: collision with root package name */
    public static final Object f35320B = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: C, reason: collision with root package name */
    public static final Object f35321C = "NAVIGATION_PREV_TAG";

    /* renamed from: D, reason: collision with root package name */
    public static final Object f35322D = "NAVIGATION_NEXT_TAG";

    /* renamed from: E, reason: collision with root package name */
    public static final Object f35323E = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A, reason: collision with root package name */
    public AccessibilityManager f35324A;

    /* renamed from: n, reason: collision with root package name */
    public int f35325n;

    /* renamed from: o, reason: collision with root package name */
    public DateSelector f35326o;

    /* renamed from: p, reason: collision with root package name */
    public CalendarConstraints f35327p;

    /* renamed from: q, reason: collision with root package name */
    public Month f35328q;

    /* renamed from: r, reason: collision with root package name */
    public l f35329r;

    /* renamed from: s, reason: collision with root package name */
    public com.google.android.material.datepicker.b f35330s;

    /* renamed from: t, reason: collision with root package name */
    public RecyclerView f35331t;

    /* renamed from: u, reason: collision with root package name */
    public RecyclerView f35332u;

    /* renamed from: v, reason: collision with root package name */
    public View f35333v;

    /* renamed from: w, reason: collision with root package name */
    public View f35334w;

    /* renamed from: x, reason: collision with root package name */
    public View f35335x;

    /* renamed from: y, reason: collision with root package name */
    public View f35336y;

    /* renamed from: z, reason: collision with root package name */
    public MaterialButton f35337z;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f35338a;

        public a(r rVar) {
            this.f35338a = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.B0(this.f35338a.d(j.this.x0().q2() - 1));
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35340a;

        public b(int i10) {
            this.f35340a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f35332u.G1(this.f35340a);
        }
    }

    public class c extends C2075a {
        public c() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.y0(null);
        }
    }

    public class d extends u {

        /* renamed from: H, reason: collision with root package name */
        public final /* synthetic */ int f35343H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f35343H = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void a2(RecyclerView.B b10, int[] iArr) {
            if (this.f35343H == 0) {
                iArr[0] = j.this.f35332u.getWidth();
                iArr[1] = j.this.f35332u.getWidth();
            } else {
                iArr[0] = j.this.f35332u.getHeight();
                iArr[1] = j.this.f35332u.getHeight();
            }
        }
    }

    public class e implements m {
        public e() {
        }

        @Override // com.google.android.material.datepicker.j.m
        public void a(long j10) {
            if (j.this.f35327p.g().isValid(j10)) {
                j.this.f35326o.c0(j10);
                Iterator it = j.this.f35434m.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).b(j.this.f35326o.W());
                }
                j.this.f35332u.getAdapter().notifyDataSetChanged();
                if (j.this.f35331t != null) {
                    j.this.f35331t.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public class f extends C2075a {
        public f() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.T0(false);
        }
    }

    public class g extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final Calendar f35347a = w.m();

        /* renamed from: b, reason: collision with root package name */
        public final Calendar f35348b = w.m();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                x xVar = (x) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C6774c c6774c : j.this.f35326o.G()) {
                    Object obj = c6774c.f67817a;
                    if (obj != null && c6774c.f67818b != null) {
                        this.f35347a.setTimeInMillis(((Long) obj).longValue());
                        this.f35348b.setTimeInMillis(((Long) c6774c.f67818b).longValue());
                        int e10 = xVar.e(this.f35347a.get(1));
                        int e11 = xVar.e(this.f35348b.get(1));
                        View S10 = gridLayoutManager.S(e10);
                        View S11 = gridLayoutManager.S(e11);
                        int x32 = e10 / gridLayoutManager.x3();
                        int x33 = e11 / gridLayoutManager.x3();
                        int i10 = x32;
                        while (i10 <= x33) {
                            if (gridLayoutManager.S(gridLayoutManager.x3() * i10) != null) {
                                canvas.drawRect((i10 != x32 || S10 == null) ? 0 : S10.getLeft() + (S10.getWidth() / 2), r9.getTop() + j.this.f35330s.f35297d.c(), (i10 != x33 || S11 == null) ? recyclerView.getWidth() : S11.getLeft() + (S11.getWidth() / 2), r9.getBottom() - j.this.f35330s.f35297d.b(), j.this.f35330s.f35301h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public class h extends C2075a {
        public h() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.b(new z.a(16, j.this.f35336y.getVisibility() == 0 ? j.this.getString(ia.k.f48518X) : j.this.getString(ia.k.f48516V)));
        }
    }

    public class i extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f35351a;

        public i(r rVar) {
            this.f35351a = rVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int n22 = i10 < 0 ? j.this.x0().n2() : j.this.x0().q2();
            Month d10 = this.f35351a.d(n22);
            j.this.f35328q = d10;
            j.this.f35337z.setText(this.f35351a.e(n22));
            j.this.F0(this.f35351a.f(d10));
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    public class ViewOnClickListenerC0499j implements View.OnClickListener {
        public ViewOnClickListenerC0499j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.E0();
        }
    }

    public class k implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f35354a;

        public k(r rVar) {
            this.f35354a = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.B0(this.f35354a.d(j.this.x0().n2() + 1));
        }
    }

    public enum l {
        DAY,
        YEAR
    }

    public interface m {
        void a(long j10);
    }

    public static int v0(Context context) {
        return context.getResources().getDimensionPixelSize(ia.e.f48349j0);
    }

    public static int w0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ia.e.f48363q0) + resources.getDimensionPixelOffset(ia.e.f48365r0) + resources.getDimensionPixelOffset(ia.e.f48361p0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ia.e.f48353l0);
        int i10 = q.f35419f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ia.e.f48349j0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ia.e.f48359o0)) + resources.getDimensionPixelOffset(ia.e.f48345h0);
    }

    public static j y0(DateSelector dateSelector, int i10, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.k());
        jVar.setArguments(bundle);
        return jVar;
    }

    public void A0() {
        MaterialButton materialButton = this.f35337z;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    public void B0(Month month) {
        r rVar = (r) this.f35332u.getAdapter();
        int f10 = rVar.f(month);
        AccessibilityManager accessibilityManager = this.f35324A;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int f11 = f10 - rVar.f(this.f35328q);
            boolean z10 = Math.abs(f11) > 3;
            boolean z11 = f11 > 0;
            this.f35328q = month;
            if (z10 && z11) {
                this.f35332u.x1(f10 - 3);
                z0(f10);
            } else if (z10) {
                this.f35332u.x1(f10 + 3);
                z0(f10);
            } else {
                z0(f10);
            }
        } else {
            this.f35328q = month;
            this.f35332u.x1(f10);
        }
        F0(f10);
    }

    public void C0(l lVar) {
        this.f35329r = lVar;
        if (lVar == l.YEAR) {
            this.f35331t.getLayoutManager().L1(((x) this.f35331t.getAdapter()).e(this.f35328q.f35277c));
            this.f35335x.setVisibility(0);
            this.f35336y.setVisibility(8);
            this.f35333v.setVisibility(8);
            this.f35334w.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f35335x.setVisibility(8);
            this.f35336y.setVisibility(0);
            this.f35333v.setVisibility(0);
            this.f35334w.setVisibility(0);
            B0(this.f35328q);
        }
    }

    public final void D0() {
        AbstractC2082d0.l0(this.f35332u, new f());
    }

    public void E0() {
        l lVar = this.f35329r;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            C0(l.DAY);
            this.f35332u.announceForAccessibility(getString(ia.k.f48519Y));
        } else if (lVar == l.DAY) {
            C0(lVar2);
            this.f35331t.announceForAccessibility(getString(ia.k.f48520Z));
        }
    }

    public final void F0(int i10) {
        this.f35334w.setEnabled(i10 + 1 < this.f35332u.getAdapter().getItemCount());
        this.f35333v.setEnabled(i10 - 1 >= 0);
    }

    @Override // com.google.android.material.datepicker.t
    public boolean d0(s sVar) {
        return super.d0(sVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f35325n = bundle.getInt("THEME_RES_ID_KEY");
        this.f35326o = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f35327p = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f35328q = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f35325n);
        this.f35330s = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f35324A = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month l10 = this.f35327p.l();
        if (n.v0(contextThemeWrapper)) {
            i10 = ia.i.f48491x;
            i11 = 1;
        } else {
            i10 = ia.i.f48489v;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        inflate.setMinimumHeight(w0(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(ia.g.f48401I);
        AbstractC2082d0.l0(gridView, new c());
        int i12 = this.f35327p.i();
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new com.google.android.material.datepicker.i(i12) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(l10.f35278d);
        gridView.setEnabled(false);
        this.f35332u = (RecyclerView) inflate.findViewById(ia.g.f48404L);
        this.f35332u.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f35332u.setTag(f35320B);
        r rVar = new r(contextThemeWrapper, this.f35326o, this.f35327p, null, new e());
        this.f35332u.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(ia.h.f48463c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ia.g.f48405M);
        this.f35331t = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f35331t.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f35331t.setAdapter(new x(this));
            this.f35331t.j(q0());
        }
        if (inflate.findViewById(ia.g.f48396D) != null) {
            p0(inflate, rVar);
        }
        if (!n.v0(contextThemeWrapper)) {
            new androidx.recyclerview.widget.t().b(this.f35332u);
        }
        this.f35332u.x1(rVar.f(this.f35328q));
        D0();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f35325n);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f35326o);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f35327p);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f35328q);
    }

    public final void p0(View view, r rVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ia.g.f48396D);
        this.f35337z = materialButton;
        materialButton.setTag(f35323E);
        AbstractC2082d0.l0(this.f35337z, new h());
        View findViewById = view.findViewById(ia.g.f48398F);
        this.f35333v = findViewById;
        findViewById.setTag(f35321C);
        View findViewById2 = view.findViewById(ia.g.f48397E);
        this.f35334w = findViewById2;
        findViewById2.setTag(f35322D);
        this.f35335x = view.findViewById(ia.g.f48405M);
        this.f35336y = view.findViewById(ia.g.f48400H);
        C0(l.DAY);
        this.f35337z.setText(this.f35328q.h());
        this.f35332u.n(new i(rVar));
        this.f35337z.setOnClickListener(new ViewOnClickListenerC0499j());
        this.f35334w.setOnClickListener(new k(rVar));
        this.f35333v.setOnClickListener(new a(rVar));
        F0(rVar.f(this.f35328q));
    }

    public final RecyclerView.p q0() {
        return new g();
    }

    public CalendarConstraints r0() {
        return this.f35327p;
    }

    public com.google.android.material.datepicker.b s0() {
        return this.f35330s;
    }

    public Month t0() {
        return this.f35328q;
    }

    public DateSelector u0() {
        return this.f35326o;
    }

    public LinearLayoutManager x0() {
        return (LinearLayoutManager) this.f35332u.getLayoutManager();
    }

    public final void z0(int i10) {
        this.f35332u.post(new b(i10));
    }
}
