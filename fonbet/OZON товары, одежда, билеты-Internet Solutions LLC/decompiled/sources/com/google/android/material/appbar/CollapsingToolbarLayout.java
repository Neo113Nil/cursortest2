package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import com.google.android.material.appbar.AppBarLayout;
import i7.C7017a;
import j7.C7292a;
import q7.C8995a;
import ru.ozon.app.android.R;
import s7.C9608c;
import s7.C9609d;
import s7.C9619n;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    private int f57917A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f57918B;

    /* renamed from: a, reason: collision with root package name */
    private boolean f57919a;

    /* renamed from: b, reason: collision with root package name */
    private int f57920b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f57921c;

    /* renamed from: d, reason: collision with root package name */
    private View f57922d;

    /* renamed from: e, reason: collision with root package name */
    private View f57923e;

    /* renamed from: f, reason: collision with root package name */
    private int f57924f;

    /* renamed from: g, reason: collision with root package name */
    private int f57925g;

    /* renamed from: h, reason: collision with root package name */
    private int f57926h;

    /* renamed from: i, reason: collision with root package name */
    private int f57927i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f57928j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    final C9608c f57929k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57930l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f57931m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f57932n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f57933o;

    /* renamed from: p, reason: collision with root package name */
    private int f57934p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f57935q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f57936r;

    /* renamed from: s, reason: collision with root package name */
    private long f57937s;

    /* renamed from: t, reason: collision with root package name */
    private int f57938t;

    /* renamed from: u, reason: collision with root package name */
    private AppBarLayout.f f57939u;

    /* renamed from: v, reason: collision with root package name */
    int f57940v;

    /* renamed from: w, reason: collision with root package name */
    private int f57941w;

    /* renamed from: x, reason: collision with root package name */
    C5353y0 f57942x;

    /* renamed from: y, reason: collision with root package name */
    private int f57943y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f57944z;

    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        int f57945a;

        /* renamed from: b, reason: collision with root package name */
        float f57946b;

        public a(int i11) {
            super(-1, i11);
            this.f57945a = 0;
            this.f57946b = 0.5f;
        }

        public final void a(int i11) {
            this.f57945a = i11;
        }

        public final void b(float f7) {
            this.f57946b = f7;
        }
    }

    private class b implements AppBarLayout.f {
        b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f57940v = i11;
            C5353y0 c5353y0 = collapsingToolbarLayout.f57942x;
            int l11 = c5353y0 != null ? c5353y0.l() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = collapsingToolbarLayout.getChildAt(i12);
                a aVar = (a) childAt.getLayoutParams();
                k c11 = CollapsingToolbarLayout.c(childAt);
                int i13 = aVar.f57945a;
                if (i13 == 1) {
                    c11.e(com.google.common.primitives.e.b(-i11, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.c(childAt).b()) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((a) childAt.getLayoutParams())).bottomMargin));
                } else if (i13 == 2) {
                    c11.e(Math.round((-i11) * aVar.f57946b));
                }
            }
            collapsingToolbarLayout.h();
            if (collapsingToolbarLayout.f57933o != null && l11 > 0) {
                int i14 = Y.f42258g;
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = collapsingToolbarLayout.getHeight();
            int i15 = Y.f42258g;
            int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - l11;
            float f7 = minimumHeight;
            float min = Math.min(1.0f, (height - collapsingToolbarLayout.b()) / f7);
            C9608c c9608c = collapsingToolbarLayout.f57929k;
            c9608c.K(min);
            c9608c.z(collapsingToolbarLayout.f57940v + minimumHeight);
            c9608c.I(Math.abs(i11) / f7);
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        this.f57919a = true;
        this.f57928j = new Rect();
        this.f57938t = -1;
        this.f57943y = 0;
        this.f57917A = 0;
        Context context2 = getContext();
        C9608c c9608c = new C9608c(this);
        this.f57929k = c9608c;
        c9608c.R(C7292a.f69467e);
        c9608c.O();
        C8995a c8995a = new C8995a(context2);
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65945k, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        c9608c.E(e11.getInt(4, 8388691));
        c9608c.w(e11.getInt(0, 8388627));
        int dimensionPixelSize = e11.getDimensionPixelSize(5, 0);
        this.f57927i = dimensionPixelSize;
        this.f57926h = dimensionPixelSize;
        this.f57925g = dimensionPixelSize;
        this.f57924f = dimensionPixelSize;
        if (e11.hasValue(8)) {
            this.f57924f = e11.getDimensionPixelSize(8, 0);
        }
        if (e11.hasValue(7)) {
            this.f57926h = e11.getDimensionPixelSize(7, 0);
        }
        if (e11.hasValue(9)) {
            this.f57925g = e11.getDimensionPixelSize(9, 0);
        }
        if (e11.hasValue(6)) {
            this.f57927i = e11.getDimensionPixelSize(6, 0);
        }
        this.f57930l = e11.getBoolean(20, true);
        c9608c.Q(e11.getText(18));
        setContentDescription(this.f57930l ? c9608c.o() : null);
        c9608c.C(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        c9608c.u(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (e11.hasValue(10)) {
            c9608c.C(e11.getResourceId(10, 0));
        }
        if (e11.hasValue(1)) {
            c9608c.u(e11.getResourceId(1, 0));
        }
        if (e11.hasValue(11)) {
            c9608c.D(v7.c.a(context2, e11, 11));
        }
        if (e11.hasValue(2)) {
            c9608c.v(v7.c.a(context2, e11, 2));
        }
        this.f57938t = e11.getDimensionPixelSize(16, -1);
        if (e11.hasValue(14)) {
            c9608c.M(e11.getInt(14, 1));
        }
        if (e11.hasValue(21)) {
            c9608c.N(AnimationUtils.loadInterpolator(context2, e11.getResourceId(21, 0)));
        }
        this.f57937s = e11.getInt(15, 600);
        d(e11.getDrawable(3));
        g(e11.getDrawable(17));
        int i11 = e11.getInt(19, 0);
        this.f57941w = i11;
        boolean z11 = i11 == 1;
        c9608c.J(z11);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f57941w == 1) {
                appBarLayout.v();
            }
        }
        if (z11 && this.f57932n == null) {
            d(new ColorDrawable(c8995a.b(getResources().getDimension(R.dimen.design_appbar_elevation))));
        }
        this.f57920b = e11.getResourceId(22, -1);
        this.f57944z = e11.getBoolean(13, false);
        this.f57918B = e11.getBoolean(12, false);
        e11.recycle();
        setWillNotDraw(false);
        Y.J(this, new f(this));
    }

    private void a() {
        View view;
        if (this.f57919a) {
            ViewGroup viewGroup = null;
            this.f57921c = null;
            this.f57922d = null;
            int i11 = this.f57920b;
            if (i11 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i11);
                this.f57921c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view2 = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                        view2 = view2;
                    }
                    this.f57922d = view2;
                }
            }
            if (this.f57921c == null) {
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f57921c = viewGroup;
            }
            boolean z11 = this.f57930l;
            if (!z11 && (view = this.f57923e) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.f57923e);
                }
            }
            if (z11 && this.f57921c != null) {
                if (this.f57923e == null) {
                    this.f57923e = new View(getContext());
                }
                if (this.f57923e.getParent() == null) {
                    this.f57921c.addView(this.f57923e, -1, -1);
                }
            }
            this.f57919a = false;
        }
    }

    @NonNull
    static k c(@NonNull View view) {
        k kVar = (k) view.getTag(R.id.view_offset_helper);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(view);
        view.setTag(R.id.view_offset_helper, kVar2);
        return kVar2;
    }

    private void i(int i11, int i12, int i13, int i14, boolean z11) {
        View view;
        int i15;
        int i16;
        int i17;
        if (!this.f57930l || (view = this.f57923e) == null) {
            return;
        }
        int i18 = Y.f42258g;
        int i19 = 0;
        boolean z12 = view.isAttachedToWindow() && this.f57923e.getVisibility() == 0;
        this.f57931m = z12;
        if (z12 || z11) {
            boolean z13 = getLayoutDirection() == 1;
            View view2 = this.f57922d;
            if (view2 == null) {
                view2 = this.f57921c;
            }
            int height = ((getHeight() - c(view2).b()) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((a) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f57923e;
            Rect rect = this.f57928j;
            C9609d.a(this, view3, rect);
            ViewGroup viewGroup = this.f57921c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i19 = toolbar.getTitleMarginStart();
                i16 = toolbar.getTitleMarginEnd();
                i17 = toolbar.getTitleMarginTop();
                i15 = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                i19 = toolbar2.getTitleMarginStart();
                i16 = toolbar2.getTitleMarginEnd();
                i17 = toolbar2.getTitleMarginTop();
                i15 = toolbar2.getTitleMarginBottom();
            } else {
                i15 = 0;
                i16 = 0;
                i17 = 0;
            }
            int i21 = rect.left + (z13 ? i16 : i19);
            int i22 = rect.top + height + i17;
            int i23 = rect.right;
            if (!z13) {
                i19 = i16;
            }
            int i24 = i23 - i19;
            int i25 = (rect.bottom + height) - i15;
            C9608c c9608c = this.f57929k;
            c9608c.t(i21, i22, i24, i25);
            int i26 = this.f57924f;
            int i27 = this.f57926h;
            int i28 = z13 ? i27 : i26;
            int i29 = rect.top + this.f57925g;
            int i31 = i13 - i11;
            if (!z13) {
                i26 = i27;
            }
            c9608c.A(i28, i29, i31 - i26, (i14 - i12) - this.f57927i);
            c9608c.s(z11);
        }
    }

    private void j() {
        if (this.f57921c == null || !this.f57930l) {
            return;
        }
        C9608c c9608c = this.f57929k;
        if (TextUtils.isEmpty(c9608c.o())) {
            ViewGroup viewGroup = this.f57921c;
            c9608c.Q(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
            setContentDescription(this.f57930l ? c9608c.o() : null);
        }
    }

    public final int b() {
        int i11 = this.f57938t;
        if (i11 >= 0) {
            return i11 + this.f57943y + this.f57917A;
        }
        C5353y0 c5353y0 = this.f57942x;
        int l11 = c5353y0 != null ? c5353y0.l() : 0;
        int i12 = Y.f42258g;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + l11, getHeight()) : getHeight() / 3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Drawable drawable) {
        Drawable drawable2 = this.f57932n;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f57932n = mutate;
            if (mutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f57921c;
                if (this.f57941w == 1 && viewGroup != null && this.f57930l) {
                    height = viewGroup.getBottom();
                }
                mutate.setBounds(0, 0, width, height);
                this.f57932n.setCallback(this);
                this.f57932n.setAlpha(this.f57934p);
            }
            int i11 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f57921c == null && (drawable = this.f57932n) != null && this.f57934p > 0) {
            drawable.mutate().setAlpha(this.f57934p);
            this.f57932n.draw(canvas);
        }
        if (this.f57930l && this.f57931m) {
            ViewGroup viewGroup = this.f57921c;
            C9608c c9608c = this.f57929k;
            if (viewGroup == null || this.f57932n == null || this.f57934p <= 0 || this.f57941w != 1 || c9608c.l() >= c9608c.m()) {
                c9608c.d(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f57932n.getBounds(), Region.Op.DIFFERENCE);
                c9608c.d(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f57933o == null || this.f57934p <= 0) {
            return;
        }
        C5353y0 c5353y0 = this.f57942x;
        int l11 = c5353y0 != null ? c5353y0.l() : 0;
        if (l11 > 0) {
            this.f57933o.setBounds(0, -this.f57940v, getWidth(), l11 - this.f57940v);
            this.f57933o.mutate().setAlpha(this.f57934p);
            this.f57933o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11;
        View view2;
        Drawable drawable = this.f57932n;
        if (drawable == null || this.f57934p <= 0 || ((view2 = this.f57922d) == null || view2 == this ? view != this.f57921c : view != view2)) {
            z11 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f57941w == 1 && view != null && this.f57930l) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f57932n.mutate().setAlpha(this.f57934p);
            this.f57932n.draw(canvas);
            z11 = true;
        }
        return super.drawChild(canvas, view, j11) || z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f57933o;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f57932n;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        C9608c c9608c = this.f57929k;
        if (c9608c != null) {
            state |= c9608c.P(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    final void e(int i11) {
        ViewGroup viewGroup;
        if (i11 != this.f57934p) {
            if (this.f57932n != null && (viewGroup = this.f57921c) != null) {
                int i12 = Y.f42258g;
                viewGroup.postInvalidateOnAnimation();
            }
            this.f57934p = i11;
            int i13 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    public final void f() {
        this.f57937s = 300L;
    }

    public final void g(Drawable drawable) {
        Drawable drawable2 = this.f57933o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f57933o = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f57933o.setState(getDrawableState());
                }
                Drawable drawable3 = this.f57933o;
                int i11 = Y.f42258g;
                androidx.core.graphics.drawable.a.h(drawable3, getLayoutDirection());
                this.f57933o.setVisible(getVisibility() == 0, false);
                this.f57933o.setCallback(this);
                this.f57933o.setAlpha(this.f57934p);
            }
            int i12 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1);
    }

    final void h() {
        if (this.f57932n == null && this.f57933o == null) {
            return;
        }
        boolean z11 = getHeight() + this.f57940v < b();
        int i11 = Y.f42258g;
        boolean z12 = isLaidOut() && !isInEditMode();
        if (this.f57935q != z11) {
            if (z12) {
                int i12 = z11 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.f57936r;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f57936r = valueAnimator2;
                    valueAnimator2.setInterpolator(i12 > this.f57934p ? C7292a.f69465c : C7292a.f69466d);
                    this.f57936r.addUpdateListener(new g(this));
                } else if (valueAnimator.isRunning()) {
                    this.f57936r.cancel();
                }
                this.f57936r.setDuration(this.f57937s);
                this.f57936r.setIntValues(this.f57934p, i12);
                this.f57936r.start();
            } else {
                e(z11 ? 255 : 0);
            }
            this.f57935q = z11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f57941w == 1) {
                appBarLayout.v();
            }
            int i11 = Y.f42258g;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f57939u == null) {
                this.f57939u = new b();
            }
            appBarLayout.d(this.f57939u);
            Y.A(this);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f57929k.q(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.f fVar = this.f57939u;
        if (fVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).q(fVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C5353y0 c5353y0 = this.f57942x;
        if (c5353y0 != null) {
            int l11 = c5353y0.l();
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                int i16 = Y.f42258g;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < l11) {
                    childAt.offsetTopAndBottom(l11);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            c(getChildAt(i17)).d();
        }
        i(i11, i12, i13, i14, false);
        j();
        h();
        int childCount3 = getChildCount();
        for (int i18 = 0; i18 < childCount3; i18++) {
            c(getChildAt(i18)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i11, int i12) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        ViewGroup viewGroup;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        C5353y0 c5353y0 = this.f57942x;
        int l11 = c5353y0 != null ? c5353y0.l() : 0;
        if ((mode == 0 || this.f57944z) && l11 > 0) {
            this.f57943y = l11;
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + l11, 1073741824));
        }
        if (this.f57918B) {
            C9608c c9608c = this.f57929k;
            if (c9608c.n() > 1) {
                j();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.i(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i13 = c9608c.i();
                if (i13 > 1) {
                    collapsingToolbarLayout.f57917A = (i13 - 1) * Math.round(c9608c.j());
                    super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.f57917A, 1073741824));
                }
                viewGroup = collapsingToolbarLayout.f57921c;
                if (viewGroup == null) {
                    View view = collapsingToolbarLayout.f57922d;
                    if (view == null || view == collapsingToolbarLayout) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        setMinimumHeight(measuredHeight);
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    } else {
                        measuredHeight2 = view.getMeasuredHeight();
                    }
                    setMinimumHeight(measuredHeight2);
                    return;
                }
                return;
            }
        }
        collapsingToolbarLayout = this;
        viewGroup = collapsingToolbarLayout.f57921c;
        if (viewGroup == null) {
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        Drawable drawable = this.f57932n;
        if (drawable != null) {
            ViewGroup viewGroup = this.f57921c;
            if (this.f57941w == 1 && viewGroup != null && this.f57930l) {
                i12 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i11, i12);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f57933o;
        if (drawable != null && drawable.isVisible() != z11) {
            this.f57933o.setVisible(z11, false);
        }
        Drawable drawable2 = this.f57932n;
        if (drawable2 == null || drawable2.isVisible() == z11) {
            return;
        }
        this.f57932n.setVisible(z11, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f57932n || drawable == this.f57933o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a(-1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f57945a = 0;
        aVar.f57946b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65946l);
        aVar.f57945a = obtainStyledAttributes.getInt(0, 0);
        aVar.f57946b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = new a(layoutParams);
        aVar.f57945a = 0;
        aVar.f57946b = 0.5f;
        return aVar;
    }
}
