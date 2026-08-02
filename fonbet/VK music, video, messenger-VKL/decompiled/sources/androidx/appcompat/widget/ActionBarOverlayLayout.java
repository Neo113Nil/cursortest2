package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.j;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bqx0;
import xsna.c0u0;
import xsna.h4x;
import xsna.iut0;
import xsna.qpx0;
import xsna.s8l;
import xsna.t160;
import xsna.t8l;
import xsna.u160;
import xsna.v160;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes11.dex */
public class ActionBarOverlayLayout extends ViewGroup implements s8l, t160, u160 {
    public static final int[] D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final bqx0 E;
    public static final Rect F;
    public final c A;
    public final v160 B;
    public final f C;
    public int b;
    public int c;
    public ContentFrameLayout d;
    public ActionBarContainer e;
    public t8l f;
    public Drawable g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public final Rect q;

    @NonNull
    public bqx0 r;

    @NonNull
    public bqx0 s;

    @NonNull
    public bqx0 t;

    @NonNull
    public bqx0 u;
    public d v;
    public OverScroller w;
    public ViewPropertyAnimator x;
    public final a y;
    public final b z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.k = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(actionBarOverlayLayout.y);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY(-actionBarOverlayLayout.e.getHeight()).setListener(actionBarOverlayLayout.y);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
    }

    public static final class f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        bqx0.h gVar = i >= 36 ? new bqx0.g() : i >= 35 ? new bqx0.f() : i >= 34 ? new bqx0.e() : i >= 31 ? new bqx0.d() : i >= 30 ? new bqx0.c() : i >= 29 ? new bqx0.b() : new bqx0.a();
        gVar.h(h4x.c(0, 1, 0, 1));
        E = gVar.b();
        F = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        bqx0 bqx0Var = bqx0.b;
        this.r = bqx0Var;
        this.s = bqx0Var;
        this.t = bqx0Var;
        this.u = bqx0Var;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        l(context);
        this.B = new v160();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.C = fVar;
        addView(fVar);
    }

    public static boolean j(@NonNull View view, @NonNull Rect rect, boolean z) {
        boolean z2;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // xsna.t160
    public final void H0(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // xsna.s8l
    public final boolean a() {
        m();
        return this.f.a();
    }

    @Override // xsna.u160
    public final void a2(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        H0(view, i, i2, i3, i4, i5);
    }

    @Override // xsna.s8l
    public final void b(Menu menu, j.a aVar) {
        m();
        this.f.b(menu, aVar);
    }

    @Override // xsna.s8l
    public final boolean c() {
        m();
        return this.f.c();
    }

    @Override // xsna.t160
    public final void c0(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // xsna.s8l
    public final boolean d() {
        m();
        return this.f.d();
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.g != null) {
            if (this.e.getVisibility() == 0) {
                i = (int) (this.e.getTranslationY() + this.e.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.g.setBounds(0, i, getWidth(), this.g.getIntrinsicHeight() + i);
            this.g.draw(canvas);
        }
    }

    @Override // xsna.s8l
    public final boolean e() {
        m();
        return this.f.e();
    }

    @Override // xsna.s8l
    public final boolean f() {
        m();
        return this.f.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // xsna.s8l
    public final void g() {
        m();
        this.f.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        m();
        return this.f.getTitle();
    }

    @Override // xsna.s8l
    public final void h(int i) {
        m();
        if (i == 2) {
            this.f.getClass();
        } else if (i == 5) {
            this.f.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // xsna.t160
    public final boolean h4(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // xsna.s8l
    public final void i() {
        m();
        this.f.l();
    }

    public final void k() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(D);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.w = new OverScroller(context);
    }

    @Override // xsna.t160
    public final void l0(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void m() {
        t8l wrapper;
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof t8l) {
                wrapper = (t8l) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        m();
        bqx0 h = bqx0.h(this, windowInsets);
        boolean j = j(this.e, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        Rect rect = this.n;
        iut0.d.b(this, h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        bqx0.q qVar = h.a;
        bqx0 r = qVar.r(i, i2, i3, i4);
        this.r = r;
        boolean z = true;
        if (!this.s.equals(r)) {
            this.s = this.r;
            j = true;
        }
        Rect rect2 = this.o;
        if (rect2.equals(rect)) {
            z = j;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return qVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m();
        measureChildWithMargins(this.e, i, 0, i2, 0);
        e eVar = (e) this.e.getLayoutParams();
        int max = Math.max(0, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.e.getMeasuredState());
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.b;
            if (this.i && this.e.getTabContainer() != null) {
                measuredHeight += this.b;
            }
        } else {
            measuredHeight = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        Rect rect = this.n;
        Rect rect2 = this.p;
        rect2.set(rect);
        this.t = this.r;
        if (!this.h && !z) {
            f fVar = this.C;
            bqx0 bqx0Var = E;
            Rect rect3 = this.q;
            iut0.d.b(fVar, bqx0Var, rect3);
            if (!rect3.equals(F)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.t = this.t.a.r(0, measuredHeight, 0, 0);
                j(this.d, rect2, true);
                if (!this.u.equals(this.t)) {
                    bqx0 bqx0Var2 = this.t;
                    this.u = bqx0Var2;
                    iut0.c(this.d, bqx0Var2);
                }
                measureChildWithMargins(this.d, i, 0, i2, 0);
                e eVar2 = (e) this.d.getLayoutParams();
                int max3 = Math.max(max, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                int max4 = Math.max(max2, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        h4x c2 = h4x.c(this.t.b(), this.t.d() + measuredHeight, this.t.c(), this.t.a());
        bqx0 bqx0Var3 = this.t;
        int i3 = Build.VERSION.SDK_INT;
        bqx0.h gVar = i3 >= 36 ? new bqx0.g(bqx0Var3) : i3 >= 35 ? new bqx0.f(bqx0Var3) : i3 >= 34 ? new bqx0.e(bqx0Var3) : i3 >= 31 ? new bqx0.d(bqx0Var3) : i3 >= 30 ? new bqx0.c(bqx0Var3) : i3 >= 29 ? new bqx0.b(bqx0Var3) : new bqx0.a(bqx0Var3);
        gVar.h(c2);
        this.t = gVar.b();
        j(this.d, rect2, true);
        if (!this.u.equals(this.t)) {
        }
        measureChildWithMargins(this.d, i, 0, i2, 0);
        e eVar22 = (e) this.d.getLayoutParams();
        int max32 = Math.max(max, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar22).leftMargin + ((ViewGroup.MarginLayoutParams) eVar22).rightMargin);
        int max42 = Math.max(max2, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar22).topMargin + ((ViewGroup.MarginLayoutParams) eVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.j || !z) {
            return false;
        }
        this.w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.w.getFinalY() > this.e.getHeight()) {
            k();
            this.A.run();
        } else {
            k();
            this.z.run();
        }
        this.k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.l + i2;
        this.l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        qpx0 qpx0Var;
        c0u0 c0u0Var;
        this.B.a = i;
        this.l = getActionBarHideOffset();
        k();
        d dVar = this.v;
        if (dVar == null || (c0u0Var = (qpx0Var = (qpx0) dVar).t) == null) {
            return;
        }
        c0u0Var.a();
        qpx0Var.t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.j || this.k) {
            return;
        }
        if (this.l <= this.e.getHeight()) {
            k();
            postDelayed(this.z, 600L);
        } else {
            k();
            postDelayed(this.A, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m();
        int i2 = this.m ^ i;
        this.m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.v;
        if (dVar != null) {
            qpx0 qpx0Var = (qpx0) dVar;
            qpx0Var.p = !z2;
            if (z || !z2) {
                if (qpx0Var.q) {
                    qpx0Var.q = false;
                    qpx0Var.A(true);
                }
            } else if (!qpx0Var.q) {
                qpx0Var.q = true;
                qpx0Var.A(true);
            }
        }
        if ((i2 & 256) == 0 || this.v == null) {
            return;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.c = i;
        d dVar = this.v;
        if (dVar != null) {
            ((qpx0) dVar).o = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        k();
        this.e.setTranslationY(-Math.max(0, Math.min(i, this.e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.v = dVar;
        if (getWindowToken() != null) {
            ((qpx0) this.v).o = this.c;
            int i = this.m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.j) {
            this.j = z;
            if (z) {
                return;
            }
            k();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m();
        this.f.setIcon(i);
    }

    public void setLogo(int i) {
        m();
        this.f.t(i);
    }

    public void setOverlayMode(boolean z) {
        this.h = z;
    }

    @Override // xsna.s8l
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f.setWindowCallback(callback);
    }

    @Override // xsna.s8l
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // xsna.t160
    public final void s1(View view, int i, int i2, int[] iArr, int i3) {
    }
}
