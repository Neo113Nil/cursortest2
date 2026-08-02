package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.i;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import l.AbstractC5335a;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements C, androidx.core.view.G, androidx.core.view.H {
    static final int[] ATTRS = {AbstractC5335a.f54987b, R.attr.windowContentOverlay};

    /* renamed from: G, reason: collision with root package name */
    public static final F0 f16824G = new F0.a().d(androidx.core.graphics.e.c(0, 1, 0, 1)).a();

    /* renamed from: H, reason: collision with root package name */
    public static final Rect f16825H = new Rect();

    /* renamed from: A, reason: collision with root package name */
    public ViewPropertyAnimator f16826A;

    /* renamed from: B, reason: collision with root package name */
    public final AnimatorListenerAdapter f16827B;

    /* renamed from: C, reason: collision with root package name */
    public final Runnable f16828C;

    /* renamed from: D, reason: collision with root package name */
    public final Runnable f16829D;

    /* renamed from: E, reason: collision with root package name */
    public final androidx.core.view.I f16830E;

    /* renamed from: F, reason: collision with root package name */
    public final f f16831F;

    /* renamed from: a, reason: collision with root package name */
    public int f16832a;

    /* renamed from: b, reason: collision with root package name */
    public int f16833b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f16834c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f16835d;

    /* renamed from: e, reason: collision with root package name */
    public D f16836e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f16837f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16839h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16840i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16841j;

    /* renamed from: k, reason: collision with root package name */
    public int f16842k;

    /* renamed from: l, reason: collision with root package name */
    public int f16843l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f16844m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f16845n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f16846o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f16847p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f16848q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f16849r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f16850s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f16851t;

    /* renamed from: u, reason: collision with root package name */
    public F0 f16852u;

    /* renamed from: v, reason: collision with root package name */
    public F0 f16853v;

    /* renamed from: w, reason: collision with root package name */
    public F0 f16854w;

    /* renamed from: x, reason: collision with root package name */
    public F0 f16855x;

    /* renamed from: y, reason: collision with root package name */
    public d f16856y;

    /* renamed from: z, reason: collision with root package name */
    public OverScroller f16857z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f16826A = null;
            actionBarOverlayLayout.f16841j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f16826A = null;
            actionBarOverlayLayout.f16841j = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f16826A = actionBarOverlayLayout.f16835d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f16827B);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f16826A = actionBarOverlayLayout.f16835d.animate().translationY(-ActionBarOverlayLayout.this.f16835d.getHeight()).setListener(ActionBarOverlayLayout.this.f16827B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16833b = 0;
        this.f16844m = new Rect();
        this.f16845n = new Rect();
        this.f16846o = new Rect();
        this.f16847p = new Rect();
        this.f16848q = new Rect();
        this.f16849r = new Rect();
        this.f16850s = new Rect();
        this.f16851t = new Rect();
        F0 f02 = F0.f19136b;
        this.f16852u = f02;
        this.f16853v = f02;
        this.f16854w = f02;
        this.f16855x = f02;
        this.f16827B = new a();
        this.f16828C = new b();
        this.f16829D = new c();
        q(context);
        this.f16830E = new androidx.core.view.I(this);
        f fVar = new f(context);
        this.f16831F = fVar;
        addView(fVar);
    }

    public final void a() {
        p();
        this.f16829D.run();
    }

    @Override // androidx.appcompat.widget.C
    public boolean b() {
        u();
        return this.f16836e.b();
    }

    @Override // androidx.appcompat.widget.C
    public boolean c() {
        u();
        return this.f16836e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.C
    public boolean d() {
        u();
        return this.f16836e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f16837f != null) {
            int bottom = this.f16835d.getVisibility() == 0 ? (int) (this.f16835d.getBottom() + this.f16835d.getTranslationY() + 0.5f) : 0;
            this.f16837f.setBounds(0, bottom, getWidth(), this.f16837f.getIntrinsicHeight() + bottom);
            this.f16837f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.C
    public void e(Menu menu, i.a aVar) {
        u();
        this.f16836e.e(menu, aVar);
    }

    @Override // androidx.appcompat.widget.C
    public boolean f() {
        u();
        return this.f16836e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.C
    public void g() {
        u();
        this.f16836e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f16835d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f16830E.a();
    }

    public CharSequence getTitle() {
        u();
        return this.f16836e.getTitle();
    }

    @Override // androidx.appcompat.widget.C
    public boolean h() {
        u();
        return this.f16836e.h();
    }

    @Override // androidx.appcompat.widget.C
    public void i(int i10) {
        u();
        if (i10 == 2) {
            this.f16836e.q();
        } else if (i10 == 5) {
            this.f16836e.y();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.C
    public void j() {
        u();
        this.f16836e.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
                if (z11) {
                    int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    int i13 = rect.top;
                    if (i12 != i13) {
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                        z14 = true;
                    }
                }
                if (z13) {
                    int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    int i15 = rect.right;
                    if (i14 != i15) {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                        z14 = true;
                    }
                }
                if (z12) {
                    int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    int i17 = rect.bottom;
                    if (i16 != i17) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                        return true;
                    }
                }
                return z14;
            }
        }
        z14 = false;
        if (z11) {
        }
        if (z13) {
        }
        if (z12) {
        }
        return z14;
    }

    public final boolean l() {
        AbstractC2082d0.g(this.f16831F, f16824G, this.f16847p);
        return !this.f16847p.equals(f16825H);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final D o(View view) {
        if (view instanceof D) {
            return (D) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        u();
        F0 z10 = F0.z(windowInsets, this);
        boolean k10 = k(this.f16835d, new Rect(z10.k(), z10.m(), z10.l(), z10.j()), true, true, false, true);
        AbstractC2082d0.g(this, z10, this.f16844m);
        Rect rect = this.f16844m;
        F0 n10 = z10.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f16852u = n10;
        boolean z11 = true;
        if (!this.f16853v.equals(n10)) {
            this.f16853v = this.f16852u;
            k10 = true;
        }
        if (this.f16845n.equals(this.f16844m)) {
            z11 = k10;
        } else {
            this.f16845n.set(this.f16844m);
        }
        if (z11) {
            requestLayout();
        }
        return z10.a().c().b().x();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(getContext());
        AbstractC2082d0.i0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        u();
        measureChildWithMargins(this.f16835d, i10, 0, i11, 0);
        e eVar = (e) this.f16835d.getLayoutParams();
        int max = Math.max(0, this.f16835d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f16835d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f16835d.getMeasuredState());
        boolean z10 = (AbstractC2082d0.L(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f16832a;
            if (this.f16839h && this.f16835d.getTabContainer() != null) {
                measuredHeight += this.f16832a;
            }
        } else {
            measuredHeight = this.f16835d.getVisibility() != 8 ? this.f16835d.getMeasuredHeight() : 0;
        }
        this.f16846o.set(this.f16844m);
        this.f16854w = this.f16852u;
        if (this.f16838g || z10 || !l()) {
            this.f16854w = new F0.a(this.f16854w).d(androidx.core.graphics.e.c(this.f16854w.k(), this.f16854w.m() + measuredHeight, this.f16854w.l(), this.f16854w.j())).a();
        } else {
            Rect rect = this.f16846o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f16854w = this.f16854w.n(0, measuredHeight, 0, 0);
        }
        k(this.f16834c, this.f16846o, true, true, true, true);
        if (!this.f16855x.equals(this.f16854w)) {
            F0 f02 = this.f16854w;
            this.f16855x = f02;
            AbstractC2082d0.h(this.f16834c, f02);
        }
        measureChildWithMargins(this.f16834c, i10, 0, i11, 0);
        e eVar2 = (e) this.f16834c.getLayoutParams();
        int max3 = Math.max(max, this.f16834c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f16834c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f16834c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f16840i || !z10) {
            return false;
        }
        if (w(f11)) {
            a();
        } else {
            v();
        }
        this.f16841j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // androidx.core.view.H
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.G
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.G
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // androidx.core.view.G
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        u();
        int i11 = this.f16843l ^ i10;
        this.f16843l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f16856y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f16856y.a();
            } else {
                this.f16856y.d();
            }
        }
        if ((i11 & 256) == 0 || this.f16856y == null) {
            return;
        }
        AbstractC2082d0.i0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f16833b = i10;
        d dVar = this.f16856y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public void p() {
        removeCallbacks(this.f16828C);
        removeCallbacks(this.f16829D);
        ViewPropertyAnimator viewPropertyAnimator = this.f16826A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void q(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        this.f16832a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f16837f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f16857z = new OverScroller(context);
    }

    public boolean r() {
        return this.f16838g;
    }

    public final void s() {
        p();
        postDelayed(this.f16829D, 600L);
    }

    public void setActionBarHideOffset(int i10) {
        p();
        this.f16835d.setTranslationY(-Math.max(0, Math.min(i10, this.f16835d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f16856y = dVar;
        if (getWindowToken() != null) {
            this.f16856y.onWindowVisibilityChanged(this.f16833b);
            int i10 = this.f16843l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                AbstractC2082d0.i0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f16839h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f16840i) {
            this.f16840i = z10;
            if (z10) {
                return;
            }
            p();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        u();
        this.f16836e.setIcon(i10);
    }

    public void setLogo(int i10) {
        u();
        this.f16836e.u(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f16838g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.C
    public void setWindowCallback(Window.Callback callback) {
        u();
        this.f16836e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.C
    public void setWindowTitle(CharSequence charSequence) {
        u();
        this.f16836e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        p();
        postDelayed(this.f16828C, 600L);
    }

    public void u() {
        if (this.f16834c == null) {
            this.f16834c = (ContentFrameLayout) findViewById(l.f.f55097b);
            this.f16835d = (ActionBarContainer) findViewById(l.f.f55098c);
            this.f16836e = o(findViewById(l.f.f55096a));
        }
    }

    public final void v() {
        p();
        this.f16828C.run();
    }

    public final boolean w(float f10) {
        this.f16857z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f16857z.getFinalY() > this.f16835d.getHeight();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.G
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f16830E.b(view, view2, i10);
        this.f16842k = getActionBarHideOffset();
        p();
        d dVar = this.f16856y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f16835d.getVisibility() != 0) {
            return false;
        }
        return this.f16840i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f16840i && !this.f16841j) {
            if (this.f16842k <= this.f16835d.getHeight()) {
                t();
            } else {
                s();
            }
        }
        d dVar = this.f16856y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f16842k + i11;
        this.f16842k = i14;
        setActionBarHideOffset(i14);
    }

    public void setIcon(Drawable drawable) {
        u();
        this.f16836e.setIcon(drawable);
    }
}
