package Sc;

import Sc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C2068x;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.appbar.a;
import com.swmansion.rnscreens.gamma.stack.header.StackHeaderScrollingViewBehavior;
import dd.AbstractC4059f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC5335a;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: v, reason: collision with root package name */
    public static final a f10716v = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10717a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f10718b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f10719c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.view.d f10720d;

    /* renamed from: e, reason: collision with root package name */
    public Sc.a f10721e;

    /* renamed from: f, reason: collision with root package name */
    public Tc.e f10722f;

    /* renamed from: g, reason: collision with root package name */
    public Tc.f f10723g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10724h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10725i;

    /* renamed from: j, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.d f10726j;

    /* renamed from: k, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.d f10727k;

    /* renamed from: l, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.d f10728l;

    /* renamed from: m, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.d f10729m;

    /* renamed from: n, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.c f10730n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f10731o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f10732p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f10733q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f10734r;

    /* renamed from: s, reason: collision with root package name */
    public C2068x f10735s;

    /* renamed from: t, reason: collision with root package name */
    public final AppBarLayout.f f10736t;

    /* renamed from: u, reason: collision with root package name */
    public final View.OnLayoutChangeListener f10737u;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public f(Context context, boolean z10, Function1 onHeaderHeightChanged, Function0 onNavigationIconClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onHeaderHeightChanged, "onHeaderHeightChanged");
        Intrinsics.checkNotNullParameter(onNavigationIconClick, "onNavigationIconClick");
        this.f10717a = z10;
        this.f10718b = onHeaderHeightChanged;
        this.f10719c = onNavigationIconClick;
        this.f10720d = new androidx.appcompat.view.d(context, ia.l.f48571j);
        this.f10736t = new AppBarLayout.f() { // from class: Sc.d
            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void a(AppBarLayout appBarLayout, int i10) {
                f.f(f.this, appBarLayout, i10);
            }
        };
        this.f10737u = new View.OnLayoutChangeListener() { // from class: Sc.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                f.e(f.this, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
    }

    public static final Unit E(f fVar, int i10, View view) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        fVar.f10718b.invoke(Integer.valueOf(i10));
        return Unit.INSTANCE;
    }

    public static final void e(f fVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fVar.F();
    }

    public static final void f(f fVar, AppBarLayout appBarLayout, int i10) {
        fVar.F();
    }

    public static final void h(f fVar, View view) {
        fVar.f10719c.invoke();
    }

    public final void A(l lVar) {
        G(lVar);
        z(lVar);
        lVar.requestLayout();
    }

    public final boolean B(Tc.e eVar) {
        if (eVar.getType() != this.f10723g || eVar.getHidden() != this.f10724h || eVar.getTransparent() != this.f10725i || eVar.getLeadingSubview() != this.f10726j || eVar.getCenterSubview() != this.f10727k || eVar.getTrailingSubview() != this.f10728l || eVar.getBackgroundSubview() != this.f10729m) {
            return true;
        }
        if (!(this.f10721e instanceof a.C0206a)) {
            return false;
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d backgroundSubview = eVar.getBackgroundSubview();
        return (backgroundSubview != null ? backgroundSubview.getCollapseMode() : null) != this.f10730n;
    }

    public final Drawable C() {
        return AbstractC4059f.a(this.f10720d, AbstractC5335a.f54969B);
    }

    public final void D(l lVar) {
        ViewGroup.LayoutParams layoutParams = lVar.getStackScreenWrapper$react_native_screens_release().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        if (fVar.f() == null) {
            fVar.o(new StackHeaderScrollingViewBehavior(new Function2() { // from class: Sc.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit E10;
                    E10 = f.E(f.this, ((Integer) obj).intValue(), (View) obj2);
                    return E10;
                }
            }));
            lVar.getStackScreenWrapper$react_native_screens_release().setLayoutParams(fVar);
            lVar.getStackScreenWrapper$react_native_screens_release().requestLayout();
        }
    }

    public final void F() {
        Sc.a aVar;
        Tc.e eVar = this.f10722f;
        if (eVar == null || (aVar = this.f10721e) == null) {
            return;
        }
        eVar.j(aVar.getWidth(), aVar.getHeight(), eVar.getTransparent() ? aVar.getTop() : aVar.getTop() - aVar.getBottom());
        J(aVar, eVar);
    }

    public final void G(l lVar) {
        s();
        Sc.a aVar = this.f10721e;
        if (aVar != null) {
            r(aVar);
            lVar.removeView(aVar);
        }
        this.f10721e = null;
        this.f10735s = null;
        this.f10731o = null;
        this.f10732p = null;
        this.f10733q = null;
        this.f10734r = null;
        o();
    }

    public final void H(l lVar, Tc.e eVar) {
        if (B(eVar)) {
            y(lVar, eVar);
        }
        k(eVar);
    }

    public final void I(com.swmansion.rnscreens.gamma.stack.header.subview.d dVar, Sc.a aVar) {
        View view = dVar.getView();
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        aVar.getLocationInWindow(iArr);
        view.getLocationInWindow(iArr2);
        dVar.l(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
    }

    public final void J(Sc.a aVar, Tc.e eVar) {
        com.swmansion.rnscreens.gamma.stack.header.subview.d leadingSubview = eVar.getLeadingSubview();
        if (leadingSubview != null) {
            I(leadingSubview, aVar);
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d centerSubview = eVar.getCenterSubview();
        if (centerSubview != null) {
            I(centerSubview, aVar);
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d trailingSubview = eVar.getTrailingSubview();
        if (trailingSubview != null) {
            I(trailingSubview, aVar);
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d backgroundSubview = eVar.getBackgroundSubview();
        if (backgroundSubview != null) {
            I(backgroundSubview, aVar);
        }
    }

    public final void K(Tc.e eVar) {
        if ((eVar.getScrollFlagEnterAlways() || eVar.getScrollFlagEnterAlwaysCollapsed() || eVar.getScrollFlagExitUntilCollapsed() || eVar.getScrollFlagSnap()) && !eVar.getScrollFlagScroll()) {
            Log.e("StackHeaderCoordinator", "[RNScreens] scrollFlag* requires scrollFlagScroll to take effect.");
        }
        if (!eVar.getScrollFlagEnterAlwaysCollapsed() || eVar.getScrollFlagEnterAlways()) {
            return;
        }
        Log.e("StackHeaderCoordinator", "[RNScreens] scrollFlagEnterAlwaysCollapsed requires scrollFlagEnterAlways to take effect.");
    }

    public final void g(MaterialToolbar materialToolbar, Tc.e eVar) {
        boolean z10 = this.f10717a && !eVar.getBackButtonHidden();
        boolean areEqual = Intrinsics.areEqual(Boolean.valueOf(z10), this.f10731o);
        boolean z11 = eVar.getBackButtonIcon() != this.f10733q;
        boolean areEqual2 = Intrinsics.areEqual(eVar.getBackButtonTintColor(), this.f10732p);
        if (areEqual && !z11 && areEqual2) {
            return;
        }
        this.f10731o = Boolean.valueOf(z10);
        this.f10733q = eVar.getBackButtonIcon();
        this.f10732p = eVar.getBackButtonTintColor();
        if (!z10) {
            materialToolbar.setNavigationIcon((Drawable) null);
            materialToolbar.setNavigationOnClickListener(null);
            return;
        }
        materialToolbar.T();
        Drawable backButtonIcon = eVar.getBackButtonIcon();
        if (backButtonIcon == null) {
            backButtonIcon = C();
        }
        materialToolbar.setNavigationIcon(backButtonIcon);
        Integer backButtonTintColor = eVar.getBackButtonTintColor();
        if (backButtonTintColor != null) {
            materialToolbar.setNavigationIconTint(backButtonTintColor.intValue());
        }
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: Sc.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.h(f.this, view);
            }
        });
    }

    public final void i(Tc.e eVar) {
        int b10;
        com.swmansion.rnscreens.gamma.stack.header.subview.d backgroundSubview = eVar.getBackgroundSubview();
        if (backgroundSubview == null) {
            return;
        }
        ViewParent parent = backgroundSubview.getView().getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        a.c cVar = layoutParams instanceof a.c ? (a.c) layoutParams : null;
        if (cVar == null || cVar.a() == (b10 = backgroundSubview.getCollapseMode().b())) {
            return;
        }
        cVar.b(b10);
    }

    public final void j(l coordinatorLayout, Tc.e eVar) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        this.f10722f = eVar;
        if (eVar != null) {
            H(coordinatorLayout, eVar);
        } else {
            A(coordinatorLayout);
        }
    }

    public final void k(Tc.e eVar) {
        Sc.a aVar = this.f10721e;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof a.c) {
            C2068x c2068x = this.f10735s;
            if (c2068x != null) {
                c2068x.setText(eVar.getTitle());
            }
            C2068x c2068x2 = this.f10735s;
            if (c2068x2 != null) {
                c2068x2.requestLayout();
            }
        } else {
            if (!(aVar instanceof a.C0206a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((a.C0206a) aVar).getCollapsingToolbarLayout$react_native_screens_release().setTitle(eVar.getTitle());
            i(eVar);
        }
        l(aVar, eVar);
        g(aVar.getToolbar(), eVar);
    }

    public final void l(Sc.a aVar, Tc.e eVar) {
        View collapsingToolbarLayout$react_native_screens_release;
        int p10 = p(eVar);
        Integer num = this.f10734r;
        if (num != null && p10 == num.intValue()) {
            return;
        }
        this.f10734r = Integer.valueOf(p10);
        K(eVar);
        if (aVar instanceof a.c) {
            collapsingToolbarLayout$react_native_screens_release = ((a.c) aVar).getToolbar();
        } else {
            if (!(aVar instanceof a.C0206a)) {
                throw new NoWhenBranchMatchedException();
            }
            collapsingToolbarLayout$react_native_screens_release = ((a.C0206a) aVar).getCollapsingToolbarLayout$react_native_screens_release();
        }
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout$react_native_screens_release.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        AppBarLayout.e eVar2 = (AppBarLayout.e) layoutParams;
        eVar2.g(p10);
        collapsingToolbarLayout$react_native_screens_release.setLayoutParams(eVar2);
        aVar.A(true, false);
    }

    public final void m(Sc.a aVar) {
        aVar.d(this.f10736t);
        aVar.addOnLayoutChangeListener(this.f10737u);
    }

    public final void n(Tc.e eVar) {
        this.f10723g = eVar.getType();
        this.f10724h = eVar.getHidden();
        this.f10725i = eVar.getTransparent();
        this.f10726j = eVar.getLeadingSubview();
        this.f10727k = eVar.getCenterSubview();
        this.f10728l = eVar.getTrailingSubview();
        this.f10729m = eVar.getBackgroundSubview();
        com.swmansion.rnscreens.gamma.stack.header.subview.d backgroundSubview = eVar.getBackgroundSubview();
        this.f10730n = backgroundSubview != null ? backgroundSubview.getCollapseMode() : null;
    }

    public final void o() {
        this.f10723g = null;
        this.f10724h = false;
        this.f10725i = false;
        this.f10726j = null;
        this.f10727k = null;
        this.f10728l = null;
        this.f10729m = null;
        this.f10730n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int p(Tc.e eVar) {
        boolean scrollFlagScroll = eVar.getScrollFlagScroll();
        boolean z10 = scrollFlagScroll;
        if (eVar.getScrollFlagEnterAlways()) {
            z10 = (scrollFlagScroll ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (eVar.getScrollFlagEnterAlwaysCollapsed()) {
            z11 = (z10 ? 1 : 0) | '\b';
        }
        ?? r02 = z11;
        if (eVar.getScrollFlagExitUntilCollapsed()) {
            r02 = (z11 ? 1 : 0) | 2;
        }
        return eVar.getScrollFlagSnap() ? r02 | 16 : r02;
    }

    public final C2068x q(Toolbar toolbar) {
        C2068x c2068x = new C2068x(toolbar.getContext());
        c2068x.setSingleLine();
        c2068x.setEllipsize(TextUtils.TruncateAt.END);
        C0.j.m(c2068x, ia.l.f48567f);
        Toolbar.g gVar = new Toolbar.g(-2, -2, 8388611);
        gVar.setMarginStart(toolbar.getTitleMarginStart() + toolbar.getContentInsetStart());
        gVar.setMarginEnd(toolbar.getTitleMarginEnd());
        ((ViewGroup.MarginLayoutParams) gVar).topMargin = toolbar.getTitleMarginTop();
        ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = toolbar.getTitleMarginBottom();
        c2068x.setLayoutParams(gVar);
        return c2068x;
    }

    public final void r(Sc.a aVar) {
        aVar.y(this.f10736t);
        aVar.removeOnLayoutChangeListener(this.f10737u);
    }

    public final void s() {
        com.swmansion.rnscreens.gamma.stack.header.subview.d dVar;
        Sc.a aVar = this.f10721e;
        if (aVar == null) {
            return;
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d dVar2 = this.f10726j;
        if (dVar2 != null) {
            aVar.getToolbar().removeView(dVar2.getView());
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d dVar3 = this.f10727k;
        if (dVar3 != null) {
            aVar.getToolbar().removeView(dVar3.getView());
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d dVar4 = this.f10728l;
        if (dVar4 != null) {
            aVar.getToolbar().removeView(dVar4.getView());
        }
        if (!(aVar instanceof a.C0206a) || (dVar = this.f10729m) == null) {
            return;
        }
        ViewParent parent = dVar.getView().getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeView(dVar.getView());
        ((a.C0206a) aVar).getCollapsingToolbarLayout$react_native_screens_release().removeView(frameLayout);
    }

    public final void t(l lVar, Tc.e eVar, Sc.a aVar) {
        if ((aVar instanceof a.C0206a) && eVar.a()) {
            aVar.measure(View.MeasureSpec.makeMeasureSpec(lVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            u(((a.C0206a) aVar).getToolbar());
        }
    }

    public final void u(Toolbar toolbar) {
        int childCount = toolbar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (!(childAt instanceof com.swmansion.rnscreens.gamma.stack.header.subview.b)) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                toolbar.removeViewAt(i10);
                toolbar.addView(childAt, 0, layoutParams);
                return;
            }
        }
    }

    public final void v(Sc.a aVar, Tc.e eVar) {
        MaterialToolbar toolbar = aVar.getToolbar();
        com.swmansion.rnscreens.gamma.stack.header.subview.d leadingSubview = eVar.getLeadingSubview();
        if (leadingSubview != null) {
            Nc.c.a(leadingSubview.getView());
            toolbar.addView(leadingSubview.getView(), new Toolbar.g(-2, -2, 8388611));
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.d trailingSubview = eVar.getTrailingSubview();
        if (trailingSubview != null) {
            Nc.c.a(trailingSubview.getView());
            toolbar.addView(trailingSubview.getView(), new Toolbar.g(-2, -2, 8388613));
        }
        x(aVar, toolbar, eVar);
        w(aVar, eVar);
    }

    public final void w(Sc.a aVar, Tc.e eVar) {
        com.swmansion.rnscreens.gamma.stack.header.subview.d backgroundSubview = eVar.getBackgroundSubview();
        if (backgroundSubview == null) {
            return;
        }
        if (!(aVar instanceof a.C0206a)) {
            Log.e("StackHeaderCoordinator", "[RNScreens] Background subview is supported only for collapsing header types (medium, large).");
            return;
        }
        Nc.c.a(backgroundSubview.getView());
        a.C0206a c0206a = (a.C0206a) aVar;
        FrameLayout frameLayout = new FrameLayout(c0206a.getContext());
        frameLayout.setFitsSystemWindows(true);
        frameLayout.addView(backgroundSubview.getView(), new FrameLayout.LayoutParams(-1, -1));
        com.google.android.material.appbar.a collapsingToolbarLayout$react_native_screens_release = c0206a.getCollapsingToolbarLayout$react_native_screens_release();
        a.c cVar = new a.c(-1, -1);
        cVar.b(backgroundSubview.getCollapseMode().b());
        Unit unit = Unit.INSTANCE;
        collapsingToolbarLayout$react_native_screens_release.addView(frameLayout, 0, cVar);
    }

    public final void x(Sc.a aVar, Toolbar toolbar, Tc.e eVar) {
        com.swmansion.rnscreens.gamma.stack.header.subview.d centerSubview = eVar.getCenterSubview();
        if (centerSubview == null) {
            if (aVar instanceof a.c) {
                C2068x q10 = q(toolbar);
                this.f10735s = q10;
                toolbar.addView(q10, eVar.a() ? 0 : -1, new Toolbar.g(-2, -2, 8388611));
                return;
            }
            return;
        }
        if (!(aVar instanceof a.c)) {
            Log.e("StackHeaderCoordinator", "[RNScreens] Center subview is supported only for small header type.");
            return;
        }
        toolbar.removeView(this.f10735s);
        this.f10735s = null;
        Nc.c.a(centerSubview.getView());
        toolbar.addView(centerSubview.getView(), new Toolbar.g(-2, -2, 1));
    }

    public final void y(l lVar, Tc.e eVar) {
        G(lVar);
        if (eVar.getHidden()) {
            z(lVar);
            lVar.requestLayout();
        } else {
            Sc.a a10 = Sc.a.f10707B.a(this.f10720d, eVar.getType());
            this.f10721e = a10;
            if (eVar.getTransparent()) {
                z(lVar);
                lVar.addView(a10);
            } else {
                lVar.addView(a10, 0);
                D(lVar);
            }
            a10.requestApplyInsets();
            m(a10);
            v(a10, eVar);
            t(lVar, eVar, a10);
            a10.getToolbar().requestLayout();
        }
        n(eVar);
    }

    public final void z(l lVar) {
        ViewGroup.LayoutParams layoutParams = lVar.getStackScreenWrapper$react_native_screens_release().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        if (fVar.f() != null) {
            fVar.o(null);
            lVar.getStackScreenWrapper$react_native_screens_release().setLayoutParams(fVar);
            this.f10718b.invoke(0);
            lVar.getStackScreenWrapper$react_native_screens_release().requestLayout();
        }
    }
}
