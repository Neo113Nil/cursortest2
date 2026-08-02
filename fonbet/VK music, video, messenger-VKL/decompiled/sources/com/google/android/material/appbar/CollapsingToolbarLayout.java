package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.vkontakte.android.R;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.anj;
import xsna.b0u0;
import xsna.bqx0;
import xsna.bzt0;
import xsna.d4g;
import xsna.e4g;
import xsna.fpo0;
import xsna.ibp;
import xsna.iut0;
import xsna.j1m;
import xsna.jl10;
import xsna.qm10;
import xsna.rq2;
import xsna.tb30;
import xsna.u080;
import xsna.u11;
import xsna.xwk;
import xsna.zm10;

/* loaded from: classes13.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int G = R$style.Widget_Design_CollapsingToolbar;
    public int A;

    @Nullable
    public bqx0 B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean b;
    public final int c;

    @Nullable
    public ViewGroup d;

    @Nullable
    public View e;
    public View f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Rect k;

    @NonNull
    public final d4g l;

    @NonNull
    public final ibp m;
    public boolean n;
    public boolean o;

    @Nullable
    public Drawable p;

    @Nullable
    public Drawable q;
    public int r;
    public boolean s;
    public ValueAnimator t;
    public long u;
    public final TimeInterpolator v;
    public final TimeInterpolator w;
    public int x;
    public c y;
    public int z;

    public class a implements u080 {
        public a() {
        }

        @Override // xsna.u080
        public final bqx0 b(View view, @NonNull bqx0 bqx0Var) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            bqx0 bqx0Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? bqx0Var : null;
            if (!Objects.equals(collapsingToolbarLayout.B, bqx0Var2)) {
                collapsingToolbarLayout.B = bqx0Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return bqx0Var.a.c();
        }
    }

    public static class b extends FrameLayout.LayoutParams {
        public int a;
        public float b;
    }

    public class c implements AppBarLayout.f {
        public c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            d4g d4gVar = collapsingToolbarLayout.l;
            collapsingToolbarLayout.z = i;
            bqx0 bqx0Var = collapsingToolbarLayout.B;
            int d = bqx0Var != null ? bqx0Var.d() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = collapsingToolbarLayout.getChildAt(i2);
                b bVar = (b) childAt.getLayoutParams();
                bzt0 c = CollapsingToolbarLayout.c(childAt);
                int i3 = bVar.a;
                if (i3 == 1) {
                    c.d(xwk.b(-i, 0, collapsingToolbarLayout.b(childAt)));
                } else if (i3 == 2) {
                    c.d(Math.round((-i) * bVar.b));
                }
            }
            collapsingToolbarLayout.e();
            if (collapsingToolbarLayout.q != null && d > 0) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - d;
            float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            float f = minimumHeight;
            float min = Math.min(1.0f, scrimVisibleHeightTrigger / f);
            d4gVar.d = min;
            d4gVar.e = u11.b(1.0f, min, 0.5f, min);
            d4gVar.f = collapsingToolbarLayout.z + minimumHeight;
            d4gVar.p(Math.abs(i) / f);
        }
    }

    public interface d {
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.collapsingToolbarLayoutStyle);
    }

    @NonNull
    public static bzt0 c(@NonNull View view) {
        bzt0 bzt0Var = (bzt0) view.getTag(R$id.view_offset_helper);
        if (bzt0Var != null) {
            return bzt0Var;
        }
        bzt0 bzt0Var2 = new bzt0(view);
        view.setTag(R$id.view_offset_helper, bzt0Var2);
        return bzt0Var2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue a2 = jl10.a(R$attr.colorSurfaceContainer, context);
        ColorStateList colorStateList = null;
        if (a2 != null) {
            int i = a2.resourceId;
            if (i != 0) {
                colorStateList = anj.b(i, context);
            } else {
                int i2 = a2.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        float dimension = getResources().getDimension(R$dimen.design_appbar_elevation);
        ibp ibpVar = this.m;
        return ibpVar.a(dimension, ibpVar.d);
    }

    public final void a() {
        if (this.b) {
            ViewGroup viewGroup = null;
            this.d = null;
            this.e = null;
            int i = this.c;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.d = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.e = view;
                }
            }
            if (this.d == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.d = viewGroup;
            }
            d();
            this.b = false;
        }
    }

    public final int b(@NonNull View view) {
        return ((getHeight() - c(view).b) - view.getHeight()) - ((FrameLayout.LayoutParams) ((b) view.getLayoutParams())).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public final void d() {
        View view;
        if (!this.n && (view = this.f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f);
            }
        }
        if (!this.n || this.d == null) {
            return;
        }
        if (this.f == null) {
            this.f = new View(getContext());
        }
        if (this.f.getParent() == null) {
            this.d.addView(this.f, -1, -1);
        }
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.d == null && (drawable = this.p) != null && this.r > 0) {
            drawable.mutate().setAlpha(this.r);
            this.p.draw(canvas);
        }
        if (this.n && this.o) {
            ViewGroup viewGroup = this.d;
            d4g d4gVar = this.l;
            if (viewGroup == null || this.p == null || this.r <= 0 || this.A != 1 || d4gVar.b >= d4gVar.e) {
                d4gVar.d(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.p.getBounds(), Region.Op.DIFFERENCE);
                d4gVar.d(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.q == null || this.r <= 0) {
            return;
        }
        bqx0 bqx0Var = this.B;
        int d2 = bqx0Var != null ? bqx0Var.d() : 0;
        if (d2 > 0) {
            this.q.setBounds(0, -this.z, getWidth(), d2 - this.z);
            this.q.mutate().setAlpha(this.r);
            this.q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.p;
        if (drawable == null || this.r <= 0 || ((view2 = this.e) == null || view2 == this ? view != this.d : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.A == 1 && view != null && this.n) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.p.mutate().setAlpha(this.r);
            this.p.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.p;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        d4g d4gVar = this.l;
        if (d4gVar != null) {
            d4gVar.R = drawableState;
            ColorStateList colorStateList2 = d4gVar.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = d4gVar.n) != null && colorStateList.isStateful())) {
                d4gVar.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() {
        if (this.p == null && this.q == null) {
            return;
        }
        setScrimsShown(getHeight() + this.z < getScrimVisibleHeightTrigger());
    }

    public final void f(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int i5;
        int i6;
        int i7;
        if (!this.n || (view = this.f) == null) {
            return;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int i8 = 0;
        boolean z2 = view.isAttachedToWindow() && this.f.getVisibility() == 0;
        this.o = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.e;
            if (view2 == null) {
                view2 = this.d;
            }
            int b2 = b(view2);
            View view3 = this.f;
            Rect rect = this.k;
            j1m.a(this, view3, rect);
            ViewGroup viewGroup = this.d;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i8 = toolbar.getTitleMarginStart();
                i6 = toolbar.getTitleMarginEnd();
                i7 = toolbar.getTitleMarginTop();
                i5 = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                i8 = toolbar2.getTitleMarginStart();
                i6 = toolbar2.getTitleMarginEnd();
                i7 = toolbar2.getTitleMarginTop();
                i5 = toolbar2.getTitleMarginBottom();
            } else {
                i5 = 0;
                i6 = 0;
                i7 = 0;
            }
            int i9 = rect.left + (z3 ? i6 : i8);
            int i10 = rect.top + b2 + i7;
            int i11 = rect.right;
            if (!z3) {
                i8 = i6;
            }
            int i12 = i11 - i8;
            int i13 = (rect.bottom + b2) - i5;
            d4g d4gVar = this.l;
            Rect rect2 = d4gVar.h;
            if (rect2.left != i9 || rect2.top != i10 || rect2.right != i12 || rect2.bottom != i13) {
                rect2.set(i9, i10, i12, i13);
                d4gVar.S = true;
            }
            int i14 = z3 ? this.i : this.g;
            int i15 = rect.top + this.h;
            int i16 = (i3 - i) - (z3 ? this.g : this.i);
            int i17 = (i4 - i2) - this.j;
            Rect rect3 = d4gVar.g;
            if (rect3.left != i14 || rect3.top != i15 || rect3.right != i16 || rect3.bottom != i17) {
                rect3.set(i14, i15, i16, i17);
                d4gVar.S = true;
            }
            d4gVar.i(z);
        }
    }

    public final void g() {
        if (this.d != null && this.n && TextUtils.isEmpty(this.l.G)) {
            ViewGroup viewGroup = this.d;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        b bVar = new b(-1, -1);
        bVar.a = 0;
        bVar.b = 0.5f;
        return bVar;
    }

    public int getCollapsedTitleGravity() {
        return this.l.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.l.m;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.l.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.p;
    }

    public int getExpandedTitleGravity() {
        return this.l.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.i;
    }

    public int getExpandedTitleMarginStart() {
        return this.g;
    }

    public int getExpandedTitleMarginTop() {
        return this.h;
    }

    public float getExpandedTitleTextSize() {
        return this.l.l;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.l.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.l.q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.l.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.l.i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.l.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.l.n0;
    }

    public int getScrimAlpha() {
        return this.r;
    }

    public long getScrimAnimationDuration() {
        return this.u;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.x;
        if (i >= 0) {
            return i + this.C + this.E;
        }
        bqx0 bqx0Var = this.B;
        int d2 = bqx0Var != null ? bqx0Var.d() : 0;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d2, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.q;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.n) {
            return this.l.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.A;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.l.V;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.l.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.y == null) {
                this.y = new c();
            }
            appBarLayout.a(this.y);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        c cVar = this.y;
        if (cVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).f(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bqx0 bqx0Var = this.B;
        if (bqx0Var != null) {
            int d2 = bqx0Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d2) {
                    childAt.offsetTopAndBottom(d2);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            c(getChildAt(i6)).c();
        }
        f(i, i2, i3, i4, false);
        g();
        e();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            c(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        ViewGroup viewGroup;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        bqx0 bqx0Var = this.B;
        int d2 = bqx0Var != null ? bqx0Var.d() : 0;
        if ((mode == 0 || this.D) && d2 > 0) {
            this.C = d2;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d2, 1073741824));
        }
        if (this.F) {
            d4g d4gVar = this.l;
            if (d4gVar.n0 > 1) {
                g();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.f(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i3 = d4gVar.p;
                if (i3 > 1) {
                    TextPaint textPaint = d4gVar.U;
                    textPaint.setTextSize(d4gVar.l);
                    textPaint.setTypeface(d4gVar.z);
                    textPaint.setLetterSpacing(d4gVar.g0);
                    collapsingToolbarLayout.E = (i3 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.E, 1073741824));
                }
                viewGroup = collapsingToolbarLayout.d;
                if (viewGroup == null) {
                    View view = collapsingToolbarLayout.e;
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
        viewGroup = collapsingToolbarLayout.d;
        if (viewGroup == null) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.p;
        if (drawable != null) {
            ViewGroup viewGroup = this.d;
            if (this.A == 1 && viewGroup != null && this.n) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.l.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.l.k(i);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        d4g d4gVar = this.l;
        if (d4gVar.o != colorStateList) {
            d4gVar.o = colorStateList;
            d4gVar.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        d4g d4gVar = this.l;
        if (d4gVar.m != f) {
            d4gVar.m = f;
            d4gVar.i(false);
        }
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        d4g d4gVar = this.l;
        if (d4gVar.m(typeface)) {
            d4gVar.i(false);
        }
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.p = mutate;
            if (mutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.d;
                if (this.A == 1 && viewGroup != null && this.n) {
                    height = viewGroup.getBottom();
                }
                mutate.setBounds(0, 0, width, height);
                this.p.setCallback(this);
                this.p.setAlpha(this.r);
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        d4g d4gVar = this.l;
        if (d4gVar.j != i) {
            d4gVar.j = i;
            d4gVar.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.j = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.l.n(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        d4g d4gVar = this.l;
        if (d4gVar.n != colorStateList) {
            d4gVar.n = colorStateList;
            d4gVar.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        d4g d4gVar = this.l;
        if (d4gVar.l != f) {
            d4gVar.l = f;
            d4gVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        d4g d4gVar = this.l;
        if (d4gVar.o(typeface)) {
            d4gVar.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.F = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.D = z;
    }

    public void setHyphenationFrequency(int i) {
        this.l.q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.l.o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.l.p0 = f;
    }

    public void setMaxLines(int i) {
        d4g d4gVar = this.l;
        if (i != d4gVar.n0) {
            d4gVar.n0 = i;
            Bitmap bitmap = d4gVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                d4gVar.K = null;
            }
            d4gVar.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.l.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.r) {
            if (this.p != null && (viewGroup = this.d) != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.r = i;
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.u = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.x != i) {
            this.x = i;
            e();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.s != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.t = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.r ? this.v : this.w);
                    this.t.addUpdateListener(new e4g(this));
                } else if (valueAnimator.isRunning()) {
                    this.t.cancel();
                }
                this.t.setDuration(this.u);
                this.t.setIntValues(this.r, i);
                this.t.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.s = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(@Nullable d dVar) {
        d4g d4gVar = this.l;
        if (dVar != null) {
            d4gVar.i(true);
        } else {
            d4gVar.getClass();
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                Drawable drawable3 = this.q;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        d4g d4gVar = this.l;
        if (charSequence == null || !TextUtils.equals(d4gVar.G, charSequence)) {
            d4gVar.G = charSequence;
            d4gVar.H = null;
            Bitmap bitmap = d4gVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                d4gVar.K = null;
            }
            d4gVar.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.A = i;
        boolean z = i == 1;
        this.l.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.p == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        d4g d4gVar = this.l;
        d4gVar.F = truncateAt;
        d4gVar.i(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            setContentDescription(getTitle());
            d();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        d4g d4gVar = this.l;
        d4gVar.V = timeInterpolator;
        d4gVar.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != z) {
            this.q.setVisible(z, false);
        }
        Drawable drawable2 = this.p;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.p.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p || drawable == this.q;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(zm10.a(context, attributeSet, i, r4), attributeSet, i);
        int i2;
        ColorStateList a2;
        ColorStateList a3;
        int i3 = G;
        this.b = true;
        this.k = new Rect();
        this.x = -1;
        this.C = 0;
        this.E = 0;
        Context context2 = getContext();
        d4g d4gVar = new d4g(this);
        this.l = d4gVar;
        d4gVar.W = rq2.e;
        d4gVar.i(false);
        d4gVar.J = false;
        this.m = new ibp(context2);
        int[] iArr = R$styleable.CollapsingToolbarLayout;
        fpo0.a(context2, attributeSet, i, i3);
        fpo0.b(context2, attributeSet, iArr, i, i3, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i3);
        int i4 = obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (d4gVar.j != i4) {
            d4gVar.j = i4;
            d4gVar.i(false);
        }
        d4gVar.l(obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.g = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.i = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.n = obtainStyledAttributes.getBoolean(R$styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(obtainStyledAttributes.getText(R$styleable.CollapsingToolbarLayout_title));
        d4gVar.n(R$style.TextAppearance_Design_CollapsingToolbar_Expanded);
        d4gVar.k(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            d4gVar.n(obtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            d4gVar.k(obtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            int i5 = obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_titleTextEllipsize, -1);
            setTitleEllipsize(i5 != 0 ? i5 != 1 ? i5 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleTextColor) && d4gVar.n != (a3 = qm10.a(context2, obtainStyledAttributes, R$styleable.CollapsingToolbarLayout_expandedTitleTextColor))) {
            d4gVar.n = a3;
            d4gVar.i(false);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_collapsedTitleTextColor) && d4gVar.o != (a2 = qm10.a(context2, obtainStyledAttributes, R$styleable.CollapsingToolbarLayout_collapsedTitleTextColor))) {
            d4gVar.o = a2;
            d4gVar.i(false);
        }
        this.x = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_maxLines) && (i2 = obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_maxLines, 1)) != d4gVar.n0) {
            d4gVar.n0 = i2;
            Bitmap bitmap = d4gVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                d4gVar.K = null;
            }
            d4gVar.i(false);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            d4gVar.V = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            d4gVar.i(false);
        }
        this.u = obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.v = tb30.d(context2, R$attr.motionEasingStandardInterpolator, rq2.c);
        this.w = tb30.d(context2, R$attr.motionEasingStandardInterpolator, rq2.d);
        setContentScrim(obtainStyledAttributes.getDrawable(R$styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(R$styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.c = obtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.D = obtainStyledAttributes.getBoolean(R$styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.F = obtainStyledAttributes.getBoolean(R$styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        a aVar = new a();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(this, aVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        b bVar = new b(context, attributeSet);
        bVar.a = 0;
        bVar.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CollapsingToolbarLayout_Layout);
        bVar.a = obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        bVar.b = obtainStyledAttributes.getFloat(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        b bVar = new b(-1, -1);
        bVar.a = 0;
        bVar.b = 0.5f;
        return bVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b bVar = new b(layoutParams);
        bVar.a = 0;
        bVar.b = 0.5f;
        return bVar;
    }
}
