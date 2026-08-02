package ru.ozon.composer.ui.behavior;

import C10.e;
import C10.g;
import Q10.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.G;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import hd.C6915b;
import jk0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import o10.C8631b;
import org.jetbrains.annotations.NotNull;
import p10.C8833c;
import p10.InterfaceC8831a;
import p10.RunnableC8832b;
import ru.ozon.app.android.R;
import v10.C10183a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/composer/ui/behavior/ComposerListBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Lp10/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerListBehavior extends AppBarLayout.ScrollingViewBehavior implements InterfaceC8831a {

    /* renamed from: A, reason: collision with root package name */
    private View f94788A;

    /* renamed from: B, reason: collision with root package name */
    private ViewGroup f94789B;

    /* renamed from: C, reason: collision with root package name */
    private C8631b f94790C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private l f94791D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Rect f94792E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final Rect f94793F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private int[] f94794G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f94795H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f94796I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f94797J;

    /* renamed from: K, reason: collision with root package name */
    private Function1<? super l, Unit> f94798K;

    /* renamed from: g, reason: collision with root package name */
    private e f94799g;

    /* renamed from: h, reason: collision with root package name */
    private final String f94800h;

    /* renamed from: i, reason: collision with root package name */
    private g f94801i;

    /* renamed from: j, reason: collision with root package name */
    private int f94802j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f94803k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f94804l;

    /* renamed from: m, reason: collision with root package name */
    private int f94805m;

    /* renamed from: n, reason: collision with root package name */
    private int f94806n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C8833c f94807o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f94808p;

    /* renamed from: q, reason: collision with root package name */
    private CoordinatorLayout f94809q;

    /* renamed from: r, reason: collision with root package name */
    private AppBarLayout f94810r;

    /* renamed from: s, reason: collision with root package name */
    private LinearLayout f94811s;

    /* renamed from: t, reason: collision with root package name */
    private a f94812t;

    /* renamed from: u, reason: collision with root package name */
    private ViewGroup f94813u;

    /* renamed from: v, reason: collision with root package name */
    private LinearLayout f94814v;

    /* renamed from: w, reason: collision with root package name */
    private View f94815w;

    /* renamed from: x, reason: collision with root package name */
    private ViewGroup f94816x;

    /* renamed from: y, reason: collision with root package name */
    private RecyclerView f94817y;

    /* renamed from: z, reason: collision with root package name */
    private View f94818z;

    public ComposerListBehavior() {
        this(null, null);
    }

    private final void H(boolean z11) {
        l lVar = this.f94791D;
        boolean d11 = Intrinsics.d(this.f94793F, lVar.f());
        Rect e11 = lVar.e();
        Rect rect = this.f94792E;
        rect.set(e11);
        lVar.j();
        boolean equals = rect.equals(lVar.e());
        if (!d11 || !equals || z11) {
            RecyclerView recyclerView = this.f94817y;
            RecyclerView.g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
            if (c8042d == null) {
                return;
            }
            c8042d.l(lVar);
            View view = this.f94788A;
            if (view != null) {
                view.setTranslationY(lVar.e().bottom - lVar.f().bottom);
            }
        }
        Function1<? super l, Unit> function1 = this.f94798K;
        if (function1 != null) {
            function1.invoke(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(View view, boolean z11) {
        l lVar = this.f94791D;
        this.f94793F.set(lVar.f());
        if (view != null) {
            r(this, view, lVar.f(), false, 0, 0, 14);
        }
        if (z11) {
            H(false);
        }
    }

    private final int q() {
        LinearLayout linearLayout = this.f94814v;
        if (linearLayout == null || linearLayout.getChildCount() == 0) {
            return this.f94802j;
        }
        int childCount = linearLayout.getChildCount();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = linearLayout.getChildAt(i13);
            if (Intrinsics.d(childAt.getTag(), this.f94800h)) {
                i12 += childAt.getMeasuredHeight();
            }
        }
        int measuredHeight = linearLayout.getMeasuredHeight() - i12;
        if (linearLayout != null) {
            int childCount2 = linearLayout.getChildCount();
            int i14 = 0;
            loop1: while (true) {
                if (i14 >= childCount2) {
                    break;
                }
                View childAt2 = linearLayout.getChildAt(i14);
                if (childAt2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt2;
                    int childCount3 = viewGroup.getChildCount();
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt3 = viewGroup.getChildAt(i15);
                        if (Intrinsics.d(childAt3.getTag(), linearLayout.getContext().getString(R.string.common_tag_shadow))) {
                            i11 = childAt3.getHeight();
                            break loop1;
                        }
                    }
                }
                i14++;
            }
        }
        return ((measuredHeight - i11) + this.f94802j) - this.f94806n;
    }

    static void r(ComposerListBehavior composerListBehavior, View view, Rect rect, boolean z11, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            z11 = true;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        composerListBehavior.getClass();
        if (z11 && view.getGlobalVisibleRect(rect)) {
            if (i11 == 0 && i12 == 0) {
                return;
            }
            int i14 = rect.top + i11;
            rect.top = i14;
            int i15 = rect.bottom - i12;
            rect.bottom = i15;
            if (i14 < i15) {
                return;
            }
        }
        rect.setEmpty();
    }

    private final void t(View view, View view2) {
        C8631b c8631b = this.f94790C;
        int b11 = c8631b != null ? c8631b.b() : 0;
        C8631b c8631b2 = this.f94790C;
        int a11 = c8631b2 != null ? c8631b2.a() : view2 != null ? view2.getMeasuredHeight() : 0;
        C8833c c8833c = this.f94807o;
        c8833c.c(view);
        c8833c.b(a11);
        e eVar = this.f94799g;
        if (eVar != null) {
            eVar.d(a11);
        }
        r(this, view2, this.f94791D.b(), this.f94795H, 0, b11, 4);
        I(view, false);
    }

    private final void u(View view, boolean z11) {
        g gVar = this.f94801i;
        if (gVar != null) {
            gVar.setBottomOffset(q());
        }
        r(this, view, this.f94791D.d(), false, this.f94805m, 0, 10);
        if (z11) {
            H(false);
        }
    }

    private final void w(CoordinatorLayout coordinatorLayout, View view, View view2, boolean z11) {
        int measuredHeight = view2.getMeasuredHeight();
        C8833c c8833c = this.f94807o;
        c8833c.c(view);
        c8833c.d(measuredHeight);
        ViewGroup viewGroup = this.f94816x;
        if (viewGroup == null) {
            viewGroup = C10183a.m(coordinatorLayout);
            if (viewGroup == null) {
                viewGroup = C10183a.i(coordinatorLayout);
            }
            this.f94816x = viewGroup;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        boolean z12 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != 0;
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        if (z12 && marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = 0;
            viewGroup.setLayoutParams(marginLayoutParams2);
        }
        e eVar = this.f94799g;
        if (eVar != null) {
            eVar.g(measuredHeight);
        }
        r(this, view2, this.f94791D.i(), this.f94796I, 0, 0, 12);
        if (z11) {
            H(false);
        }
    }

    public final void A(boolean z11) {
        this.f94804l = z11;
        this.f94807o.getClass();
    }

    public final void B(int i11) {
        this.f94802j = i11;
    }

    public final void C(@NotNull Rect insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f94791D.h().set(insets);
    }

    public final void D(e eVar) {
        this.f94799g = eVar;
    }

    public final void E(Function1<? super l, Unit> function1) {
        this.f94798K = function1;
    }

    public final void F(boolean z11) {
        this.f94803k = z11;
    }

    public final void G(boolean z11, boolean z12) {
        LinearLayout linearLayout;
        AppBarLayout appBarLayout;
        boolean z13 = z11 != this.f94795H;
        boolean z14 = z12 != this.f94796I;
        if (z13 || z14) {
            this.f94795H = z11;
            this.f94796I = z12;
            l lVar = this.f94791D;
            if (z13 && (appBarLayout = this.f94810r) != null) {
                Rect b11 = lVar.b();
                C8631b c8631b = this.f94790C;
                r(this, appBarLayout, b11, z11, 0, c8631b != null ? c8631b.b() : 0, 4);
            }
            if (z14 && (linearLayout = this.f94811s) != null) {
                r(this, linearLayout, lVar.i(), z12, 0, 0, 12);
            }
            H(false);
        }
    }

    @Override // p10.InterfaceC8831a
    public final void a(@NotNull C8631b appBarSizeProvider) {
        AppBarLayout appBarLayout;
        Intrinsics.checkNotNullParameter(appBarSizeProvider, "appBarSizeProvider");
        this.f94790C = appBarSizeProvider;
        View view = this.f94815w;
        if (view == null || (appBarLayout = this.f94810r) == null) {
            return;
        }
        t(view, appBarLayout);
        H(false);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        int id2 = dependency.getId();
        return id2 == R.id.bottomBorder || id2 == R.id.bottomContainer || id2 == R.id.topContainer || id2 == R.id.stickyPlaceholder || (dependency instanceof AppBarLayout);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (this.f94804l) {
            child.setTop(0);
        }
        int id2 = dependency.getId();
        if (id2 == R.id.bottomBorder) {
            int[] iArr = this.f94794G;
            dependency.getLocationOnScreen(iArr);
            this.f94791D.m(Integer.valueOf(iArr[1]));
            H(false);
            return true;
        }
        if (id2 == R.id.bottomContainer) {
            u(dependency, true);
            return true;
        }
        if (id2 == R.id.topContainer) {
            w(parent, child, dependency, true);
            return true;
        }
        if (id2 == R.id.stickyPlaceholder) {
            return v(true);
        }
        if (id2 != R.id.appBarAbl) {
            super.onDependentViewChanged(parent, child, dependency);
            return false;
        }
        t(child, dependency);
        super.onDependentViewChanged(parent, child, dependency);
        I(child, true);
        return false;
    }

    @Override // com.google.android.material.appbar.j, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull View child, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f94808p) {
            this.f94809q = parent;
            this.f94815w = child;
            this.f94808p = false;
            AppBarLayout a11 = C10183a.a(parent);
            this.f94810r = a11;
            e eVar = this.f94799g;
            if (eVar != null) {
                C8631b c8631b = this.f94790C;
                eVar.d(c8631b != null ? c8631b.a() : a11 != null ? a11.getMeasuredHeight() : 0);
            }
            LinearLayout o11 = C10183a.o(parent);
            this.f94811s = o11;
            int measuredHeight = o11.getMeasuredHeight();
            e eVar2 = this.f94799g;
            if (eVar2 != null) {
                eVar2.g(measuredHeight);
            }
            this.f94813u = C10183a.l(parent);
            Intrinsics.checkNotNullParameter(parent, "<this>");
            KeyEvent.Callback findViewById = parent.findViewById(R.id.stickyContainer);
            this.f94812t = findViewById instanceof a ? (a) findViewById : null;
            if (this.f94817y == null) {
                this.f94817y = C10183a.i(child);
            }
            this.f94814v = C10183a.c(parent);
            this.f94818z = C10183a.b(parent);
            g gVar = this.f94801i;
            if (gVar != null) {
                gVar.setBottomOffset(q());
            }
            this.f94788A = parent.findViewById(R.id.pageDebugInfoIv);
            this.f94789B = C10183a.h(parent);
            H(false);
        }
        ViewGroup viewGroup = this.f94789B;
        if (viewGroup != null) {
            int visibility = viewGroup.getVisibility();
            l lVar = this.f94791D;
            if (visibility == 0) {
                lVar.a(viewGroup.getId());
            } else {
                lVar.k(viewGroup.getId());
            }
            H(false);
        }
        super.onLayoutChild(parent, child, i11);
        if (this.f94804l && child.getTop() != 0) {
            child.setTop(0);
        }
        if (!this.f94803k) {
            I(this.f94817y, true);
            return true;
        }
        this.f94797J = true;
        RecyclerView recyclerView = this.f94817y;
        if (recyclerView != null) {
            G.a(recyclerView, new RunnableC8832b(recyclerView, this));
        }
        return true;
    }

    @Override // com.google.android.material.appbar.i, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(@NotNull CoordinatorLayout parent, @NotNull View child, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        boolean onMeasureChild = super.onMeasureChild(parent, child, i11, i12, i13, i14);
        if (this.f94804l) {
            child.setTranslationY(0.0f);
        }
        return onMeasureChild;
    }

    /* renamed from: s, reason: from getter */
    public final int getF94802j() {
        return this.f94802j;
    }

    public final boolean v(boolean z11) {
        a aVar;
        ViewGroup viewGroup = this.f94813u;
        if (viewGroup == null || (aVar = this.f94812t) == null) {
            return false;
        }
        int c11 = C6915b.c(viewGroup.getY());
        this.f94791D.g().set(viewGroup.getLeft(), c11, viewGroup.getRight(), C6915b.c(aVar.d()) + c11);
        if (z11) {
            H(true);
        }
        return true;
    }

    public final void x() {
        View view;
        CoordinatorLayout coordinatorLayout = this.f94809q;
        if (coordinatorLayout == null || (view = this.f94815w) == null) {
            return;
        }
        View view2 = this.f94818z;
        if (view2 != null) {
            int[] iArr = this.f94794G;
            view2.getLocationOnScreen(iArr);
            this.f94791D.m(Integer.valueOf(iArr[1]));
        }
        LinearLayout linearLayout = this.f94814v;
        if (linearLayout != null) {
            u(linearLayout, false);
        }
        LinearLayout linearLayout2 = this.f94811s;
        if (linearLayout2 != null) {
            w(coordinatorLayout, view, linearLayout2, false);
        }
        v(false);
        AppBarLayout appBarLayout = this.f94810r;
        if (appBarLayout != null) {
            t(view, appBarLayout);
        }
        I(view, false);
        H(false);
    }

    public final void y(g gVar) {
        this.f94801i = gVar;
    }

    public final void z(int i11, int i12) {
        this.f94805m = Math.abs(i11);
        this.f94806n = Math.abs(i12);
        LinearLayout linearLayout = this.f94814v;
        if (linearLayout != null) {
            u(linearLayout, true);
        }
    }

    public ComposerListBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94800h = context != null ? context.getString(R.string.common_tag_not_affect_offset) : null;
        this.f94804l = true;
        this.f94807o = new C8833c();
        this.f94808p = true;
        this.f94791D = new l();
        this.f94792E = new Rect();
        this.f94793F = new Rect();
        this.f94794G = new int[2];
        this.f94795H = true;
        this.f94796I = true;
    }
}
