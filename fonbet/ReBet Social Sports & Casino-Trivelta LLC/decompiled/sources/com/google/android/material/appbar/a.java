package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
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
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.google.android.material.appbar.AppBarLayout;
import ia.l;
import ia.m;
import ja.AbstractC5104a;
import ka.g;
import l.i;
import n0.AbstractC5597a;
import s0.AbstractC6307a;
import sa.AbstractC6344a;
import va.C6680a;
import x0.AbstractC6773b;
import xa.AbstractC6816b;
import xa.C6815a;
import xa.h;

/* loaded from: classes3.dex */
public class a extends FrameLayout {

    /* renamed from: L, reason: collision with root package name */
    public static final int f34751L = l.f48576o;

    /* renamed from: A, reason: collision with root package name */
    public AppBarLayout.f f34752A;

    /* renamed from: B, reason: collision with root package name */
    public int f34753B;

    /* renamed from: C, reason: collision with root package name */
    public int f34754C;

    /* renamed from: D, reason: collision with root package name */
    public int f34755D;

    /* renamed from: E, reason: collision with root package name */
    public F0 f34756E;

    /* renamed from: F, reason: collision with root package name */
    public int f34757F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f34758G;

    /* renamed from: H, reason: collision with root package name */
    public int f34759H;

    /* renamed from: I, reason: collision with root package name */
    public int f34760I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f34761J;

    /* renamed from: K, reason: collision with root package name */
    public int f34762K;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34763a;

    /* renamed from: b, reason: collision with root package name */
    public int f34764b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f34765c;

    /* renamed from: d, reason: collision with root package name */
    public View f34766d;

    /* renamed from: e, reason: collision with root package name */
    public View f34767e;

    /* renamed from: f, reason: collision with root package name */
    public int f34768f;

    /* renamed from: g, reason: collision with root package name */
    public int f34769g;

    /* renamed from: h, reason: collision with root package name */
    public int f34770h;

    /* renamed from: i, reason: collision with root package name */
    public int f34771i;

    /* renamed from: j, reason: collision with root package name */
    public int f34772j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f34773k;

    /* renamed from: l, reason: collision with root package name */
    public final C6815a f34774l;

    /* renamed from: m, reason: collision with root package name */
    public final C6815a f34775m;

    /* renamed from: n, reason: collision with root package name */
    public final C6680a f34776n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34777o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34778p;

    /* renamed from: q, reason: collision with root package name */
    public final int f34779q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f34780r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f34781s;

    /* renamed from: t, reason: collision with root package name */
    public int f34782t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34783u;

    /* renamed from: v, reason: collision with root package name */
    public ValueAnimator f34784v;

    /* renamed from: w, reason: collision with root package name */
    public long f34785w;

    /* renamed from: x, reason: collision with root package name */
    public final TimeInterpolator f34786x;

    /* renamed from: y, reason: collision with root package name */
    public final TimeInterpolator f34787y;

    /* renamed from: z, reason: collision with root package name */
    public int f34788z;

    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    public class C0494a implements J {
        public C0494a() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            return a.this.p(f02);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class d implements AppBarLayout.f {
        public d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            a aVar = a.this;
            aVar.f34753B = i10;
            F0 f02 = aVar.f34756E;
            int m10 = f02 != null ? f02.m() : 0;
            int childCount = a.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = a.this.getChildAt(i11);
                c cVar = (c) childAt.getLayoutParams();
                g l10 = a.l(childAt);
                int i12 = cVar.f34791a;
                if (i12 == 1) {
                    l10.f(AbstractC6307a.b(-i10, 0, a.this.i(childAt)));
                } else if (i12 == 2) {
                    l10.f(Math.round((-i10) * cVar.f34792b));
                }
            }
            a.this.w();
            a aVar2 = a.this;
            if (aVar2.f34781s != null && m10 > 0) {
                aVar2.postInvalidateOnAnimation();
            }
            int height = a.this.getHeight();
            int minimumHeight = (height - a.this.getMinimumHeight()) - m10;
            int scrimVisibleHeightTrigger = height - a.this.getScrimVisibleHeightTrigger();
            int i13 = a.this.f34753B + minimumHeight;
            float f10 = minimumHeight;
            float abs = Math.abs(i10) / f10;
            float f11 = scrimVisibleHeightTrigger / f10;
            a.this.f34774l.F0(Math.min(1.0f, f11));
            a.this.f34774l.q0(i13);
            a.this.f34774l.D0(abs);
            a.this.f34775m.F0(Math.min(1.0f, f11));
            a.this.f34775m.q0(i13);
            a.this.f34775m.D0(abs);
        }
    }

    public interface e extends h {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f34751L;
        this.f34763a = true;
        this.f34773k = new Rect();
        this.f34788z = -1;
        this.f34757F = 0;
        this.f34759H = 0;
        this.f34760I = 0;
        this.f34762K = 0;
        Context context2 = getContext();
        this.f34754C = getResources().getConfiguration().orientation;
        C6815a c6815a = new C6815a(this);
        this.f34774l = c6815a;
        TimeInterpolator timeInterpolator = AbstractC5104a.f53862e;
        c6815a.P0(timeInterpolator);
        c6815a.L0(false);
        this.f34776n = new C6680a(context2);
        TypedArray i12 = xa.l.i(context2, attributeSet, m.CollapsingToolbarLayout, i10, i11, new int[0]);
        int i13 = i12.getInt(m.f48700L1, 8388691);
        int i14 = i12.getInt(m.f48630E1, 8388627);
        this.f34779q = i12.getInt(m.f48640F1, 1);
        c6815a.z0(i13);
        c6815a.m0(i14);
        int dimensionPixelSize = i12.getDimensionPixelSize(m.f48710M1, 0);
        this.f34771i = dimensionPixelSize;
        this.f34770h = dimensionPixelSize;
        this.f34769g = dimensionPixelSize;
        this.f34768f = dimensionPixelSize;
        if (i12.hasValue(m.f48740P1)) {
            this.f34768f = i12.getDimensionPixelSize(m.f48740P1, 0);
        }
        if (i12.hasValue(m.f48730O1)) {
            this.f34770h = i12.getDimensionPixelSize(m.f48730O1, 0);
        }
        if (i12.hasValue(m.f48750Q1)) {
            this.f34769g = i12.getDimensionPixelSize(m.f48750Q1, 0);
        }
        if (i12.hasValue(m.f48720N1)) {
            this.f34771i = i12.getDimensionPixelSize(m.f48720N1, 0);
        }
        if (i12.hasValue(m.f48760R1)) {
            this.f34772j = i12.getDimensionPixelSize(m.f48760R1, 0);
        }
        this.f34777o = i12.getBoolean(m.f48883e2, true);
        setTitle(i12.getText(m.f48863c2));
        c6815a.w0(l.f48565d);
        c6815a.j0(i.f55161e);
        if (i12.hasValue(m.f48770S1)) {
            c6815a.w0(i12.getResourceId(m.f48770S1, 0));
        }
        if (i12.hasValue(m.f48650G1)) {
            c6815a.j0(i12.getResourceId(m.f48650G1, 0));
        }
        if (i12.hasValue(m.f48913h2)) {
            setTitleEllipsize(b(i12.getInt(m.f48913h2, -1)));
        }
        if (i12.hasValue(m.f48779T1)) {
            c6815a.y0(Ca.c.a(context2, i12, m.f48779T1));
        }
        if (i12.hasValue(m.f48660H1)) {
            c6815a.l0(Ca.c.a(context2, i12, m.f48660H1));
        }
        this.f34788z = i12.getDimensionPixelSize(m.f48824Y1, -1);
        if (i12.hasValue(m.f48893f2)) {
            c6815a.v0(i12.getInt(m.f48893f2, 1));
        } else if (i12.hasValue(m.f48806W1)) {
            c6815a.v0(i12.getInt(m.f48806W1, 1));
        }
        if (i12.hasValue(m.f48903g2)) {
            c6815a.K0(AnimationUtils.loadInterpolator(context2, i12.getResourceId(m.f48903g2, 0)));
        }
        C6815a c6815a2 = new C6815a(this);
        this.f34775m = c6815a2;
        c6815a2.P0(timeInterpolator);
        c6815a2.L0(false);
        if (i12.hasValue(m.f48843a2)) {
            setSubtitle(i12.getText(m.f48843a2));
        }
        c6815a2.z0(i13);
        c6815a2.m0(i14);
        c6815a2.w0(i.f55159c);
        c6815a2.j0(i.f55160d);
        if (i12.hasValue(m.f48680J1)) {
            c6815a2.w0(i12.getResourceId(m.f48680J1, 0));
        }
        if (i12.hasValue(m.f48610C1)) {
            c6815a2.j0(i12.getResourceId(m.f48610C1, 0));
        }
        if (i12.hasValue(m.f48690K1)) {
            c6815a2.y0(Ca.c.a(context2, i12, m.f48690K1));
        }
        if (i12.hasValue(m.f48620D1)) {
            c6815a2.l0(Ca.c.a(context2, i12, m.f48620D1));
        }
        if (i12.hasValue(m.f48853b2)) {
            c6815a2.v0(i12.getInt(m.f48853b2, 1));
        }
        if (i12.hasValue(m.f48903g2)) {
            c6815a2.K0(AnimationUtils.loadInterpolator(context2, i12.getResourceId(m.f48903g2, 0)));
        }
        this.f34785w = i12.getInt(m.f48815X1, 600);
        this.f34786x = za.h.g(context2, ia.c.f48231e0, AbstractC5104a.f53860c);
        this.f34787y = za.h.g(context2, ia.c.f48231e0, AbstractC5104a.f53861d);
        setContentScrim(i12.getDrawable(m.f48670I1));
        setStatusBarScrim(i12.getDrawable(m.f48833Z1));
        setTitleCollapseMode(i12.getInt(m.f48873d2, 0));
        this.f34764b = i12.getResourceId(m.f48923i2, -1);
        this.f34758G = i12.getBoolean(m.f48797V1, false);
        this.f34761J = i12.getBoolean(m.f48788U1, false);
        i12.recycle();
        setWillNotDraw(false);
        AbstractC2082d0.x0(this, new C0494a());
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList g10 = AbstractC6344a.g(getContext(), ia.c.f48262u);
        if (g10 != null) {
            return g10.getDefaultColor();
        }
        return this.f34776n.d(getResources().getDimension(ia.e.f48334c));
    }

    public static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    public static CharSequence k(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    public static g l(View view) {
        g gVar = (g) view.getTag(ia.g.f48450p0);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(ia.g.f48450p0, gVar2);
        return gVar2;
    }

    public static boolean n(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    public final void a(int i10) {
        d();
        ValueAnimator valueAnimator = this.f34784v;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f34784v = valueAnimator2;
            valueAnimator2.setInterpolator(i10 > this.f34782t ? this.f34786x : this.f34787y);
            this.f34784v.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f34784v.cancel();
        }
        this.f34784v.setDuration(this.f34785w);
        this.f34784v.setIntValues(this.f34782t, i10);
        this.f34784v.start();
    }

    public final TextUtils.TruncateAt b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    public final void c(AppBarLayout appBarLayout) {
        if (m()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final void d() {
        if (this.f34763a) {
            ViewGroup viewGroup = null;
            this.f34765c = null;
            this.f34766d = null;
            int i10 = this.f34764b;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f34765c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f34766d = e(viewGroup2);
                }
            }
            if (this.f34765c == null) {
                int childCount = getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i11);
                    if (n(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i11++;
                }
                this.f34765c = viewGroup;
            }
            v();
            this.f34763a = false;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f34765c == null && (drawable = this.f34780r) != null && this.f34782t > 0) {
            drawable.mutate().setAlpha(this.f34782t);
            this.f34780r.draw(canvas);
        }
        if (this.f34777o && this.f34778p) {
            if (this.f34765c == null || this.f34780r == null || this.f34782t <= 0 || !m() || this.f34774l.H() >= this.f34774l.I()) {
                this.f34774l.k(canvas);
                this.f34775m.k(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f34780r.getBounds(), Region.Op.DIFFERENCE);
                this.f34774l.k(canvas);
                this.f34775m.k(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f34781s == null || this.f34782t <= 0) {
            return;
        }
        F0 f02 = this.f34756E;
        int m10 = f02 != null ? f02.m() : 0;
        if (m10 > 0) {
            this.f34781s.setBounds(0, -this.f34753B, getWidth(), m10 - this.f34753B);
            this.f34781s.mutate().setAlpha(this.f34782t);
            this.f34781s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f34780r == null || this.f34782t <= 0 || !o(view)) {
            z10 = false;
        } else {
            u(this.f34780r, view, getWidth(), getHeight());
            this.f34780r.mutate().setAlpha(this.f34782t);
            this.f34780r.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f34781s;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f34780r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        C6815a c6815a = this.f34774l;
        if (c6815a != null) {
            state |= c6815a.M0(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final View e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public float getCollapsedSubtitleTextSize() {
        return this.f34775m.u();
    }

    @NonNull
    public Typeface getCollapsedSubtitleTypeface() {
        return this.f34775m.v();
    }

    public int getCollapsedTitleGravity() {
        return this.f34774l.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f34774l.u();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f34774l.v();
    }

    public Drawable getContentScrim() {
        return this.f34780r;
    }

    public float getExpandedSubtitleTextSize() {
        return this.f34775m.F();
    }

    @NonNull
    public Typeface getExpandedSubtitleTypeface() {
        return this.f34775m.G();
    }

    public int getExpandedTitleGravity() {
        return this.f34774l.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f34771i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f34770h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f34768f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f34769g;
    }

    public int getExpandedTitleSpacing() {
        return this.f34772j;
    }

    public float getExpandedTitleTextSize() {
        return this.f34774l.F();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f34774l.G();
    }

    public int getHyphenationFrequency() {
        return this.f34774l.J();
    }

    public int getLineCount() {
        return this.f34774l.K();
    }

    public float getLineSpacingAdd() {
        return this.f34774l.L();
    }

    public float getLineSpacingMultiplier() {
        return this.f34774l.M();
    }

    public int getMaxLines() {
        return this.f34774l.A();
    }

    public int getScrimAlpha() {
        return this.f34782t;
    }

    public long getScrimAnimationDuration() {
        return this.f34785w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f34788z;
        if (i10 >= 0) {
            return i10 + this.f34757F + this.f34759H + this.f34760I + this.f34762K;
        }
        F0 f02 = this.f34756E;
        int m10 = f02 != null ? f02.m() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + m10, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f34781s;
    }

    public CharSequence getSubtitle() {
        if (this.f34777o) {
            return this.f34775m.P();
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.f34777o) {
            return this.f34774l.P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f34755D;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f34774l.O();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f34774l.S();
    }

    public final int i(View view) {
        return ((getHeight() - l(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    public final boolean m() {
        return this.f34755D == 1;
    }

    public final boolean o(View view) {
        View view2 = this.f34766d;
        return (view2 == null || view2 == this) ? view == this.f34765c : view == view2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f34752A == null) {
                this.f34752A = new d();
            }
            appBarLayout.d(this.f34752A);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f34774l.Z(configuration);
        if (this.f34754C != configuration.orientation && this.f34761J && this.f34774l.H() == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.f34754C = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.f fVar = this.f34752A;
        if (fVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).y(fVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        F0 f02 = this.f34756E;
        if (f02 != null) {
            int m10 = f02.m();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < m10) {
                    AbstractC2082d0.W(childAt, m10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            l(getChildAt(i15)).d();
        }
        x(i10, i11, i12, i13, false);
        y();
        w();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            l(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        a aVar;
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        F0 f02 = this.f34756E;
        int m10 = f02 != null ? f02.m() : 0;
        if ((mode == 0 || this.f34758G) && m10 > 0) {
            this.f34757F = m10;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m10, 1073741824));
        }
        y();
        if (!this.f34777o || TextUtils.isEmpty(this.f34774l.P())) {
            aVar = this;
        } else {
            int measuredHeight = getMeasuredHeight();
            aVar = this;
            aVar.x(0, 0, getMeasuredWidth(), measuredHeight, true);
            int B10 = (int) (aVar.f34757F + aVar.f34769g + aVar.f34774l.B() + (TextUtils.isEmpty(aVar.f34775m.P()) ? 0.0f : aVar.f34772j + aVar.f34775m.B()) + aVar.f34771i);
            if (B10 > measuredHeight) {
                aVar.f34762K = B10 - measuredHeight;
            } else {
                aVar.f34762K = 0;
            }
            if (aVar.f34761J) {
                if (aVar.f34774l.A() > 1) {
                    int z10 = aVar.f34774l.z();
                    if (z10 > 1) {
                        aVar.f34759H = Math.round(aVar.f34774l.B()) * (z10 - 1);
                    } else {
                        aVar.f34759H = 0;
                    }
                }
                if (aVar.f34775m.A() > 1) {
                    int z11 = aVar.f34775m.z();
                    if (z11 > 1) {
                        aVar.f34760I = Math.round(aVar.f34775m.B()) * (z11 - 1);
                    } else {
                        aVar.f34760I = 0;
                    }
                }
            }
            int i12 = aVar.f34762K;
            int i13 = aVar.f34759H;
            int i14 = aVar.f34760I;
            if (i12 + i13 + i14 > 0) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight + i12 + i13 + i14, 1073741824));
            }
        }
        ViewGroup viewGroup = aVar.f34765c;
        if (viewGroup != null) {
            View view = aVar.f34766d;
            if (view == null || view == aVar) {
                setMinimumHeight(h(viewGroup));
            } else {
                setMinimumHeight(h(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f34780r;
        if (drawable != null) {
            t(drawable, i10, i11);
        }
    }

    public F0 p(F0 f02) {
        F0 f03 = getFitsSystemWindows() ? f02 : null;
        if (!AbstractC6773b.a(this.f34756E, f03)) {
            this.f34756E = f03;
            requestLayout();
        }
        return f02.c();
    }

    public void q(boolean z10, boolean z11) {
        if (this.f34783u != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f34783u = z10;
        }
    }

    public final void r(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        View view = this.f34766d;
        if (view == null) {
            view = this.f34765c;
        }
        int i14 = i(view);
        AbstractC6816b.a(this, this.f34767e, this.f34773k);
        ViewGroup viewGroup = this.f34765c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i10 = toolbar.getTitleMarginStart();
            i12 = toolbar.getTitleMarginEnd();
            i13 = toolbar.getTitleMarginTop();
            i11 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i10 = toolbar2.getTitleMarginStart();
            i12 = toolbar2.getTitleMarginEnd();
            i13 = toolbar2.getTitleMarginTop();
            i11 = toolbar2.getTitleMarginBottom();
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        Rect rect = this.f34773k;
        int i15 = rect.left + (z10 ? i12 : i10);
        int i16 = rect.right - (z10 ? i10 : i12);
        int i17 = rect.top + i14 + i13;
        int i18 = (rect.bottom + i14) - i11;
        int m10 = (int) (i18 - this.f34775m.m());
        int m11 = (int) (i17 + this.f34774l.m());
        if (TextUtils.isEmpty(this.f34775m.P())) {
            this.f34774l.f0(i15, i17, i16, i18);
        } else {
            this.f34774l.f0(i15, i17, i16, m10);
            this.f34775m.f0(i15, m11, i16, i18);
        }
        if (this.f34779q == 0) {
            AbstractC6816b.a(this, this, this.f34773k);
            Rect rect2 = this.f34773k;
            int i19 = rect2.left + (z10 ? i12 : i10);
            int i20 = rect2.right;
            if (!z10) {
                i10 = i12;
            }
            int i21 = i20 - i10;
            if (TextUtils.isEmpty(this.f34775m.P())) {
                this.f34774l.h0(i19, i17, i21, i18);
            } else {
                this.f34774l.h0(i19, i17, i21, m10);
                this.f34775m.h0(i19, m11, i21, i18);
            }
        }
    }

    public final void s() {
        setContentDescription(getTitle());
    }

    public void setCollapsedSubtitleTextAppearance(int i10) {
        this.f34775m.j0(i10);
    }

    public void setCollapsedSubtitleTextColor(int i10) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedSubtitleTextSize(float f10) {
        this.f34775m.n0(f10);
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        this.f34775m.o0(typeface);
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f34774l.m0(i10);
        this.f34775m.m0(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f34774l.j0(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f34774l.n0(f10);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f34774l.o0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f34780r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f34780r = mutate;
            if (mutate != null) {
                t(mutate, getWidth(), getHeight());
                this.f34780r.setCallback(this);
                this.f34780r.setAlpha(this.f34782t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(getContext().getDrawable(i10));
    }

    public void setExpandedSubtitleColor(int i10) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedSubtitleTextAppearance(int i10) {
        this.f34775m.w0(i10);
    }

    public void setExpandedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f34775m.y0(colorStateList);
    }

    public void setExpandedSubtitleTextSize(float f10) {
        this.f34775m.A0(f10);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        this.f34775m.B0(typeface);
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f34774l.z0(i10);
        this.f34775m.z0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f34771i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f34770h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f34768f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f34769g = i10;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i10) {
        this.f34772j = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f34774l.w0(i10);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f34774l.y0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f34774l.A0(f10);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f34774l.B0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f34761J = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.f34758G = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f34774l.G0(i10);
    }

    public void setLineSpacingAdd(float f10) {
        this.f34774l.I0(f10);
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f34774l.J0(f10);
    }

    public void setMaxLines(int i10) {
        this.f34774l.v0(i10);
        this.f34775m.v0(i10);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f34774l.L0(z10);
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f34782t) {
            if (this.f34780r != null && (viewGroup = this.f34765c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.f34782t = i10;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f34785w = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f34788z != i10) {
            this.f34788z = i10;
            w();
        }
    }

    public void setScrimsShown(boolean z10) {
        q(z10, isLaidOut() && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        this.f34774l.N0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f34781s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f34781s = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f34781s.setState(getDrawableState());
                }
                AbstractC5597a.m(this.f34781s, getLayoutDirection());
                this.f34781s.setVisible(getVisibility() == 0, false);
                this.f34781s.setCallback(this);
                this.f34781s.setAlpha(this.f34782t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(getContext().getDrawable(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f34775m.O0(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f34774l.O0(charSequence);
        s();
    }

    public void setTitleCollapseMode(int i10) {
        this.f34755D = i10;
        boolean m10 = m();
        this.f34774l.E0(m10);
        this.f34775m.E0(m10);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (m10 && this.f34780r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.f34774l.Q0(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f34777o) {
            this.f34777o = z10;
            s();
            v();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f34774l.K0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f34781s;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f34781s.setVisible(z10, false);
        }
        Drawable drawable2 = this.f34780r;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.f34780r.setVisible(z10, false);
    }

    public final void t(Drawable drawable, int i10, int i11) {
        u(drawable, this.f34765c, i10, i11);
    }

    public final void u(Drawable drawable, View view, int i10, int i11) {
        if (m() && view != null && this.f34777o) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    public final void v() {
        View view;
        if (!this.f34777o && (view = this.f34767e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f34767e);
            }
        }
        if (!this.f34777o || this.f34765c == null) {
            return;
        }
        if (this.f34767e == null) {
            this.f34767e = new View(getContext());
        }
        if (this.f34767e.getParent() == null) {
            this.f34765c.addView(this.f34767e, -1, -1);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f34780r || drawable == this.f34781s;
    }

    public final void w() {
        if (this.f34780r == null && this.f34781s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f34753B < getScrimVisibleHeightTrigger());
    }

    public final void x(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.f34777o || (view = this.f34767e) == null) {
            return;
        }
        boolean z11 = view.isAttachedToWindow() && this.f34767e.getVisibility() == 0;
        this.f34778p = z11;
        if (z11 || z10) {
            boolean z12 = getLayoutDirection() == 1;
            r(z12);
            int i14 = z12 ? this.f34770h : this.f34768f;
            int i15 = this.f34773k.top + this.f34769g;
            int i16 = (i12 - i10) - (z12 ? this.f34768f : this.f34770h);
            int i17 = (i13 - i11) - this.f34771i;
            if (TextUtils.isEmpty(this.f34775m.P())) {
                this.f34774l.r0(i14, i15, i16, i17);
                this.f34774l.c0(z10);
            } else {
                this.f34774l.s0(i14, i15, i16, (int) ((i17 - (this.f34775m.B() + this.f34760I)) - this.f34772j), false);
                this.f34775m.s0(i14, (int) (i15 + this.f34774l.B() + this.f34759H + this.f34772j), i16, i17, false);
                this.f34774l.c0(z10);
                this.f34775m.c0(z10);
            }
        }
    }

    public final void y() {
        ViewGroup viewGroup = this.f34765c;
        if (viewGroup == null || !this.f34777o) {
            return;
        }
        CharSequence k10 = k(viewGroup);
        if (TextUtils.isEmpty(this.f34774l.P()) && !TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence j10 = j(this.f34765c);
        if (!TextUtils.isEmpty(this.f34775m.P()) || TextUtils.isEmpty(j10)) {
            return;
        }
        setSubtitle(j10);
    }

    public void setCollapsedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f34775m.l0(colorStateList);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f34774l.l0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f34791a;

        /* renamed from: b, reason: collision with root package name */
        public float f34792b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34791a = 0;
            this.f34792b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.CollapsingToolbarLayout_Layout);
            this.f34791a = obtainStyledAttributes.getInt(m.f48933j2, 0);
            c(obtainStyledAttributes.getFloat(m.f48943k2, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f34791a;
        }

        public void b(int i10) {
            this.f34791a = i10;
        }

        public void c(float f10) {
            this.f34792b = f10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f34791a = 0;
            this.f34792b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34791a = 0;
            this.f34792b = 0.5f;
        }
    }
}
