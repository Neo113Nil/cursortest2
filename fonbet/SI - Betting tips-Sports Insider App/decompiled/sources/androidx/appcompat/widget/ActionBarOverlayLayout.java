package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import com.sports.insider.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements v1, androidx.core.view.u, androidx.core.view.v {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final androidx.core.view.k2 D;
    public static final Rect E;
    public final androidx.core.view.w A;
    public final h B;

    /* renamed from: a, reason: collision with root package name */
    public int f589a;

    /* renamed from: b, reason: collision with root package name */
    public int f590b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f591c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f592d;

    /* renamed from: e, reason: collision with root package name */
    public w1 f593e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f594f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f595g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f596h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f597i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f598k;

    /* renamed from: l, reason: collision with root package name */
    public int f599l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f600m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f601n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f602o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f603p;
    public androidx.core.view.k2 q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.core.view.k2 f604r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.core.view.k2 f605s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.core.view.k2 f606t;

    /* renamed from: u, reason: collision with root package name */
    public f f607u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f608v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f609w;

    /* renamed from: x, reason: collision with root package name */
    public final d f610x;

    /* renamed from: y, reason: collision with root package name */
    public final e f611y;

    /* renamed from: z, reason: collision with root package name */
    public final e f612z;

    static {
        int i5 = Build.VERSION.SDK_INT;
        androidx.core.view.z1 y1Var = i5 >= 34 ? new androidx.core.view.y1() : i5 >= 31 ? new androidx.core.view.x1() : i5 >= 30 ? new androidx.core.view.w1() : i5 >= 29 ? new androidx.core.view.v1() : new androidx.core.view.t1();
        y1Var.g(g0.d.c(0, 1, 0, 1));
        D = y1Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f590b = 0;
        this.f600m = new Rect();
        this.f601n = new Rect();
        this.f602o = new Rect();
        this.f603p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        androidx.core.view.k2 k2Var = androidx.core.view.k2.f1348b;
        this.q = k2Var;
        this.f604r = k2Var;
        this.f605s = k2Var;
        this.f606t = k2Var;
        this.f610x = new d(0, this);
        this.f611y = new e(this, 0);
        this.f612z = new e(this, 1);
        c(context);
        this.A = new androidx.core.view.w();
        h hVar = new h(context);
        hVar.setWillNotDraw(true);
        this.B = hVar;
        addView(hVar);
    }

    public static boolean a(View view, Rect rect, boolean z5) {
        boolean z7;
        g gVar = (g) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
        int i10 = rect.left;
        if (i5 != i10) {
            ((ViewGroup.MarginLayoutParams) gVar).leftMargin = i10;
            z7 = true;
        } else {
            z7 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) gVar).topMargin = i12;
            z7 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) gVar).rightMargin = i14;
            z7 = true;
        }
        if (z5) {
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = i16;
                return true;
            }
        }
        return z7;
    }

    public final void b() {
        removeCallbacks(this.f611y);
        removeCallbacks(this.f612z);
        ViewPropertyAnimator viewPropertyAnimator = this.f609w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f589a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f594f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f608v = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    public final void d(int i5) {
        e();
        if (i5 == 2) {
            ((m4) this.f593e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i5 == 5) {
            ((m4) this.f593e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i5 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i5;
        super.draw(canvas);
        if (this.f594f != null) {
            if (this.f592d.getVisibility() == 0) {
                i5 = (int) (this.f592d.getTranslationY() + this.f592d.getBottom() + 0.5f);
            } else {
                i5 = 0;
            }
            this.f594f.setBounds(0, i5, getWidth(), this.f594f.getIntrinsicHeight() + i5);
            this.f594f.draw(canvas);
        }
    }

    public final void e() {
        w1 wrapper;
        if (this.f591c == null) {
            this.f591c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f592d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof w1) {
                wrapper = (w1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f593e = wrapper;
        }
    }

    public final void f(Menu menu, androidx.appcompat.view.menu.y yVar) {
        e();
        m4 m4Var = (m4) this.f593e;
        Toolbar toolbar = m4Var.f821a;
        if (m4Var.f832m == null) {
            n nVar = new n(toolbar.getContext());
            m4Var.f832m = nVar;
            nVar.f843i = R.id.action_menu_presenter;
        }
        n nVar2 = m4Var.f832m;
        nVar2.f839e = yVar;
        toolbar.setMenu((androidx.appcompat.view.menu.n) menu, nVar2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f592d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        androidx.core.view.w wVar = this.A;
        return wVar.f1405b | wVar.f1404a;
    }

    public CharSequence getTitle() {
        e();
        return ((m4) this.f593e).f821a.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        androidx.core.view.k2 h10 = androidx.core.view.k2.h(this, windowInsets);
        boolean a7 = a(this.f592d, new Rect(h10.b(), h10.d(), h10.c(), h10.a()), false);
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        Rect rect = this.f600m;
        androidx.core.view.q0.b(this, h10, rect);
        int i5 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        androidx.core.view.h2 h2Var = h10.f1349a;
        androidx.core.view.k2 m6 = h2Var.m(i5, i10, i11, i12);
        this.q = m6;
        boolean z5 = true;
        if (!this.f604r.equals(m6)) {
            this.f604r = this.q;
            a7 = true;
        }
        Rect rect2 = this.f601n;
        if (rect2.equals(rect)) {
            z5 = a7;
        } else {
            rect2.set(rect);
        }
        if (z5) {
            requestLayout();
        }
        return h2Var.a().f1349a.c().f1349a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        androidx.core.view.o0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i10) {
        int measuredHeight;
        e();
        measureChildWithMargins(this.f592d, i5, 0, i10, 0);
        g gVar = (g) this.f592d.getLayoutParams();
        int max = Math.max(0, this.f592d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
        int max2 = Math.max(0, this.f592d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f592d.getMeasuredState());
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        boolean z5 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z5) {
            measuredHeight = this.f589a;
            if (this.f596h && this.f592d.getTabContainer() != null) {
                measuredHeight += this.f589a;
            }
        } else {
            measuredHeight = this.f592d.getVisibility() != 8 ? this.f592d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f600m;
        Rect rect2 = this.f602o;
        rect2.set(rect);
        this.f605s = this.q;
        if (!this.f595g && !z5) {
            h hVar = this.B;
            androidx.core.view.k2 k2Var = D;
            Rect rect3 = this.f603p;
            androidx.core.view.q0.b(hVar, k2Var, rect3);
            if (!rect3.equals(E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f605s = this.f605s.f1349a.m(0, measuredHeight, 0, 0);
                a(this.f591c, rect2, true);
                if (!this.f606t.equals(this.f605s)) {
                    androidx.core.view.k2 k2Var2 = this.f605s;
                    this.f606t = k2Var2;
                    androidx.core.view.z0.b(this.f591c, k2Var2);
                }
                measureChildWithMargins(this.f591c, i5, 0, i10, 0);
                g gVar2 = (g) this.f591c.getLayoutParams();
                int max3 = Math.max(max, this.f591c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar2).leftMargin + ((ViewGroup.MarginLayoutParams) gVar2).rightMargin);
                int max4 = Math.max(max2, this.f591c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f591c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i5, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
            }
        }
        g0.d c2 = g0.d.c(this.f605s.b(), this.f605s.d() + measuredHeight, this.f605s.c(), this.f605s.a());
        androidx.core.view.k2 k2Var3 = this.f605s;
        int i11 = Build.VERSION.SDK_INT;
        androidx.core.view.z1 y1Var = i11 >= 34 ? new androidx.core.view.y1(k2Var3) : i11 >= 31 ? new androidx.core.view.x1(k2Var3) : i11 >= 30 ? new androidx.core.view.w1(k2Var3) : i11 >= 29 ? new androidx.core.view.v1(k2Var3) : new androidx.core.view.t1(k2Var3);
        y1Var.g(c2);
        this.f605s = y1Var.b();
        a(this.f591c, rect2, true);
        if (!this.f606t.equals(this.f605s)) {
        }
        measureChildWithMargins(this.f591c, i5, 0, i10, 0);
        g gVar22 = (g) this.f591c.getLayoutParams();
        int max32 = Math.max(max, this.f591c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar22).leftMargin + ((ViewGroup.MarginLayoutParams) gVar22).rightMargin);
        int max42 = Math.max(max2, this.f591c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar22).topMargin + ((ViewGroup.MarginLayoutParams) gVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f591c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i5, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i10, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z5) {
        if (!this.f597i || !z5) {
            return false;
        }
        this.f608v.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f608v.getFinalY() > this.f592d.getHeight()) {
            b();
            this.f612z.run();
        } else {
            b();
            this.f611y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr) {
    }

    @Override // androidx.core.view.v
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12, int i13, int[] iArr) {
        onNestedScroll(view, i5, i10, i11, i12, i13);
    }

    @Override // androidx.core.view.u
    public final void onNestedScrollAccepted(View view, View view2, int i5, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // androidx.core.view.u
    public final boolean onStartNestedScroll(View view, View view2, int i5, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i5);
    }

    @Override // androidx.core.view.u
    public final void onStopNestedScroll(View view, int i5) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i5) {
        super.onWindowSystemUiVisibilityChanged(i5);
        e();
        int i10 = this.f599l ^ i5;
        this.f599l = i5;
        boolean z5 = (i5 & 4) == 0;
        boolean z7 = (i5 & 256) != 0;
        f fVar = this.f607u;
        if (fVar != null) {
            androidx.appcompat.app.y0 y0Var = (androidx.appcompat.app.y0) fVar;
            y0Var.f395o = !z7;
            if (z5 || !z7) {
                if (y0Var.f396p) {
                    y0Var.f396p = false;
                    y0Var.f(true);
                }
            } else if (!y0Var.f396p) {
                y0Var.f396p = true;
                y0Var.f(true);
            }
        }
        if ((i10 & 256) == 0 || this.f607u == null) {
            return;
        }
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        androidx.core.view.o0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        this.f590b = i5;
        f fVar = this.f607u;
        if (fVar != null) {
            ((androidx.appcompat.app.y0) fVar).f394n = i5;
        }
    }

    public void setActionBarHideOffset(int i5) {
        b();
        this.f592d.setTranslationY(-Math.max(0, Math.min(i5, this.f592d.getHeight())));
    }

    public void setActionBarVisibilityCallback(f fVar) {
        this.f607u = fVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.y0) this.f607u).f394n = this.f590b;
            int i5 = this.f599l;
            if (i5 != 0) {
                onWindowSystemUiVisibilityChanged(i5);
                WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                androidx.core.view.o0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f596h = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f597i) {
            this.f597i = z5;
            if (z5) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i5) {
        e();
        m4 m4Var = (m4) this.f593e;
        m4Var.f824d = i5 != 0 ? h8.b.n(m4Var.f821a.getContext(), i5) : null;
        m4Var.c();
    }

    public void setLogo(int i5) {
        e();
        m4 m4Var = (m4) this.f593e;
        m4Var.f825e = i5 != 0 ? h8.b.n(m4Var.f821a.getContext(), i5) : null;
        m4Var.c();
    }

    public void setOverlayMode(boolean z5) {
        this.f595g = z5;
    }

    @Override // androidx.appcompat.widget.v1
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((m4) this.f593e).f830k = callback;
    }

    @Override // androidx.appcompat.widget.v1
    public void setWindowTitle(CharSequence charSequence) {
        e();
        m4 m4Var = (m4) this.f593e;
        if (m4Var.f827g) {
            return;
        }
        Toolbar toolbar = m4Var.f821a;
        m4Var.f828h = charSequence;
        if ((m4Var.f822b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (m4Var.f827g) {
                androidx.core.view.z0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.u
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr, int i11) {
    }

    @Override // androidx.core.view.u
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i5, i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        androidx.appcompat.app.y0 y0Var;
        n.j jVar;
        this.A.f1404a = i5;
        this.f598k = getActionBarHideOffset();
        b();
        f fVar = this.f607u;
        if (fVar == null || (jVar = (y0Var = (androidx.appcompat.app.y0) fVar).f398s) == null) {
            return;
        }
        jVar.a();
        y0Var.f398s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        if ((i5 & 2) == 0 || this.f592d.getVisibility() != 0) {
            return false;
        }
        return this.f597i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f597i || this.j) {
            return;
        }
        if (this.f598k <= this.f592d.getHeight()) {
            b();
            postDelayed(this.f611y, 600L);
        } else {
            b();
            postDelayed(this.f612z, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12) {
        int i13 = this.f598k + i10;
        this.f598k = i13;
        setActionBarHideOffset(i13);
    }

    public void setIcon(Drawable drawable) {
        e();
        m4 m4Var = (m4) this.f593e;
        m4Var.f824d = drawable;
        m4Var.c();
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i5) {
    }
}
