package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.bsk;
import defpackage.ckj;
import defpackage.dc;
import defpackage.e9l;
import defpackage.eb;
import defpackage.f9l;
import defpackage.fb;
import defpackage.g9l;
import defpackage.gb;
import defpackage.h9l;
import defpackage.hb;
import defpackage.i9l;
import defpackage.ib;
import defpackage.j9l;
import defpackage.k9l;
import defpackage.l9l;
import defpackage.okj;
import defpackage.pm4;
import defpackage.q9d;
import defpackage.r8l;
import defpackage.r9d;
import defpackage.srk;
import defpackage.td4;
import defpackage.u4a;
import defpackage.u9l;
import defpackage.uif;
import defpackage.uuk;
import defpackage.vec;
import defpackage.x9l;
import defpackage.xfc;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements q9d, r9d {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final x9l D;
    public static final Rect E;
    public final uif A;
    public final ib B;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public pm4 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public x9l q;
    public x9l r;
    public x9l s;
    public x9l t;
    public gb u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final eb x;
    public final fb y;
    public final fb z;

    static {
        int i = Build.VERSION.SDK_INT;
        l9l k9lVar = i >= 36 ? new k9l() : i >= 35 ? new j9l() : i >= 34 ? new i9l() : i >= 31 ? new h9l() : i >= 30 ? new g9l() : i >= 29 ? new f9l() : new e9l();
        k9lVar.h(u4a.c(0, 1, 0, 1));
        D = k9lVar.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x9l x9lVar = x9l.b;
        this.q = x9lVar;
        this.r = x9lVar;
        this.s = x9lVar;
        this.t = x9lVar;
        this.x = new eb(this, 0);
        this.y = new fb(this, 0);
        this.z = new fb(this, 1);
        f(context);
        this.A = new uif((byte) 0, 9);
        ib ibVar = new ib(context, 0);
        ibVar.setWillNotDraw(true);
        this.B = ibVar;
        addView(ibVar);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        hb hbVar = (hb) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) hbVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) hbVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) hbVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) hbVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) hbVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) hbVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) hbVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) hbVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.q9d
    public final void b(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.q9d
    public final void c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hb;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f.setBounds(0, i, getWidth(), this.f.getIntrinsicHeight() + i);
            this.f.draw(canvas);
        }
    }

    public final void e() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void f(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.v = new OverScroller(context);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.r9d
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        h(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hb(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hb(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        uif uifVar = this.A;
        return uifVar.c | uifVar.b;
    }

    public CharSequence getTitle() {
        k();
        return ((okj) this.e).a.getTitle();
    }

    @Override // defpackage.q9d
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.q9d
    public final boolean i(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            this.e.getClass();
        } else if (i == 5) {
            this.e.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        pm4 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof pm4) {
                wrapper = (pm4) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    a70.r("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(vec vecVar, xfc xfcVar) {
        k();
        okj okjVar = (okj) this.e;
        Toolbar toolbar = okjVar.a;
        dc dcVar = okjVar.m;
        if (dcVar == null) {
            dcVar = new dc(toolbar.getContext());
            okjVar.m = dcVar;
        }
        dcVar.e = xfcVar;
        if (vecVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        vec vecVar2 = toolbar.a.a;
        if (vecVar2 == vecVar) {
            return;
        }
        if (vecVar2 != null) {
            vecVar2.r(toolbar.L);
            vecVar2.r(toolbar.M);
        }
        if (toolbar.M == null) {
            toolbar.M = new ckj(toolbar);
        }
        dcVar.o = true;
        Context context = toolbar.j;
        if (vecVar != null) {
            vecVar.b(dcVar, context);
            vecVar.b(toolbar.M, toolbar.j);
        } else {
            dcVar.i(context, null);
            toolbar.M.i(toolbar.j, null);
            dcVar.f();
            toolbar.M.f();
        }
        toolbar.a.setPopupTheme(toolbar.k);
        toolbar.a.setPresenter(dcVar);
        toolbar.L = dcVar;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        x9l h = x9l.h(this, windowInsets);
        boolean a = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = bsk.a;
        Rect rect = this.m;
        srk.b(this, h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u9l u9lVar = h.a;
        x9l r = u9lVar.r(i, i2, i3, i4);
        this.q = r;
        boolean z = true;
        if (!this.r.equals(r)) {
            this.r = this.q;
            a = true;
        }
        Rect rect2 = this.n;
        if (rect2.equals(rect)) {
            z = a;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return u9lVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f(getContext());
        WeakHashMap weakHashMap = bsk.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                hb hbVar = (hb) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) hbVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) hbVar).topMargin + paddingTop;
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
        k();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        hb hbVar = (hb) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) hbVar).leftMargin + ((ViewGroup.MarginLayoutParams) hbVar).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hbVar).topMargin + ((ViewGroup.MarginLayoutParams) hbVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = bsk.a;
        boolean z = (getWindowSystemUiVisibility() & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.m;
        Rect rect2 = this.o;
        rect2.set(rect);
        this.s = this.q;
        if (!this.g && !z) {
            ib ibVar = this.B;
            x9l x9lVar = D;
            Rect rect3 = this.p;
            srk.b(ibVar, x9lVar, rect3);
            if (!rect3.equals(E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.s = this.s.a.r(0, measuredHeight, 0, 0);
                a(this.c, rect2, true);
                if (!this.t.equals(this.s)) {
                    x9l x9lVar2 = this.s;
                    this.t = x9lVar2;
                    bsk.c(this.c, x9lVar2);
                }
                measureChildWithMargins(this.c, i, 0, i2, 0);
                hb hbVar2 = (hb) this.c.getLayoutParams();
                int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) hbVar2).leftMargin + ((ViewGroup.MarginLayoutParams) hbVar2).rightMargin);
                int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hbVar2).topMargin + ((ViewGroup.MarginLayoutParams) hbVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        u4a c = u4a.c(this.s.b(), this.s.d() + measuredHeight, this.s.c(), this.s.a());
        x9l x9lVar3 = this.s;
        int i3 = Build.VERSION.SDK_INT;
        l9l k9lVar = i3 >= 36 ? new k9l(x9lVar3) : i3 >= 35 ? new j9l(x9lVar3) : i3 >= 34 ? new i9l(x9lVar3) : i3 >= 31 ? new h9l(x9lVar3) : i3 >= 30 ? new g9l(x9lVar3) : i3 >= 29 ? new f9l(x9lVar3) : new e9l(x9lVar3);
        k9lVar.h(c);
        this.s = k9lVar.b();
        a(this.c, rect2, true);
        if (!this.t.equals(this.s)) {
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        hb hbVar22 = (hb) this.c.getLayoutParams();
        int max32 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) hbVar22).leftMargin + ((ViewGroup.MarginLayoutParams) hbVar22).rightMargin);
        int max42 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hbVar22).topMargin + ((ViewGroup.MarginLayoutParams) hbVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.v.getFinalY() > this.d.getHeight()) {
            e();
            this.z.run();
        } else {
            e();
            this.y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        r8l r8lVar;
        uuk uukVar;
        this.A.b = i;
        this.k = getActionBarHideOffset();
        e();
        gb gbVar = this.u;
        if (gbVar == null || (uukVar = (r8lVar = (r8l) gbVar).F) == null) {
            return;
        }
        uukVar.a();
        r8lVar.F = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.k <= this.d.getHeight()) {
            e();
            postDelayed(this.y, 600L);
        } else {
            e();
            postDelayed(this.z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.l ^ i;
        this.l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        gb gbVar = this.u;
        if (gbVar != null) {
            r8l r8lVar = (r8l) gbVar;
            r8lVar.B = !z2;
            if (z || !z2) {
                if (r8lVar.C) {
                    r8lVar.C = false;
                    r8lVar.C0(true);
                }
            } else if (!r8lVar.C) {
                r8lVar.C = true;
                r8lVar.C0(true);
            }
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 || this.u == null) {
            return;
        }
        WeakHashMap weakHashMap = bsk.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        gb gbVar = this.u;
        if (gbVar != null) {
            ((r8l) gbVar).A = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        e();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(gb gbVar) {
        this.u = gbVar;
        if (getWindowToken() != null) {
            ((r8l) this.u).A = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = bsk.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            e();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        okj okjVar = (okj) this.e;
        okjVar.d = i != 0 ? td4.d0(i, okjVar.a.getContext()) : null;
        okjVar.e();
    }

    public void setLogo(int i) {
        k();
        okj okjVar = (okj) this.e;
        okjVar.e = i != 0 ? td4.d0(i, okjVar.a.getContext()) : null;
        okjVar.e();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((okj) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        okj okjVar = (okj) this.e;
        if (okjVar.g) {
            return;
        }
        Toolbar toolbar = okjVar.a;
        okjVar.h = charSequence;
        if ((okjVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (okjVar.g) {
                bsk.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hb(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        okj okjVar = (okj) this.e;
        okjVar.d = drawable;
        okjVar.e();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.q9d
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
