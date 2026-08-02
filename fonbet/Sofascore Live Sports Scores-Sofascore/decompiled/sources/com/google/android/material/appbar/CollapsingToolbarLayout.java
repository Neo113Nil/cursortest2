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
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b13;
import defpackage.bsk;
import defpackage.by4;
import defpackage.c13;
import defpackage.d13;
import defpackage.dj5;
import defpackage.e13;
import defpackage.e80;
import defpackage.eq3;
import defpackage.m6k;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.sa0;
import defpackage.srk;
import defpackage.w3a;
import defpackage.wz1;
import defpackage.x2a;
import defpackage.x9l;
import defpackage.yfa;
import defpackage.ytk;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public d13 A;
    public int B;
    public int C;
    public int D;
    public x9l E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Rect k;
    public final b13 l;
    public final b13 m;
    public final dj5 n;
    public boolean o;
    public boolean p;
    public final int q;
    public Drawable r;
    public Drawable s;
    public int t;
    public boolean u;
    public ValueAnimator v;
    public long w;
    public final TimeInterpolator x;
    public final TimeInterpolator y;
    public int z;

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        ColorStateList x;
        ColorStateList x2;
        this.a = true;
        this.k = new Rect();
        this.z = -1;
        this.F = 0;
        this.H = 0;
        this.I = 0;
        this.K = 0;
        Context context2 = getContext();
        this.C = getResources().getConfiguration().orientation;
        b13 b13Var = new b13(this);
        this.l = b13Var;
        DecelerateInterpolator decelerateInterpolator = e80.e;
        b13Var.X = decelerateInterpolator;
        b13Var.l(false);
        b13Var.K = false;
        this.n = new dj5(context2);
        m6k.v(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = pjf.k;
        m6k.w(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int i = obtainStyledAttributes.getInt(9, 8388691);
        int i2 = obtainStyledAttributes.getInt(2, 8388627);
        this.q = obtainStyledAttributes.getInt(3, 1);
        b13Var.x(i);
        b13Var.s(i2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(13)) {
            this.f = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.h = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.g = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.i = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.o = obtainStyledAttributes.getBoolean(28, true);
        setTitle(obtainStyledAttributes.getText(26));
        b13Var.w(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        b13Var.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(16)) {
            b13Var.w(obtainStyledAttributes.getResourceId(16, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            b13Var.q(obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.hasValue(31)) {
            int i3 = obtainStyledAttributes.getInt(31, -1);
            setTitleEllipsize(i3 != 0 ? i3 != 1 ? i3 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (obtainStyledAttributes.hasValue(17) && b13Var.o != (x2 = w3a.x(context2, obtainStyledAttributes, 17))) {
            b13Var.o = x2;
            b13Var.l(false);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            b13Var.r(w3a.x(context2, obtainStyledAttributes, 5));
        }
        this.z = obtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (obtainStyledAttributes.hasValue(29)) {
            b13Var.v(obtainStyledAttributes.getInt(29, 1));
        } else if (obtainStyledAttributes.hasValue(20)) {
            b13Var.v(obtainStyledAttributes.getInt(20, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            b13Var.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            b13Var.l(false);
        }
        b13 b13Var2 = new b13(this);
        this.m = b13Var2;
        b13Var2.X = decelerateInterpolator;
        b13Var2.l(false);
        b13Var2.K = false;
        if (obtainStyledAttributes.hasValue(24)) {
            setSubtitle(obtainStyledAttributes.getText(24));
        }
        b13Var2.x(i);
        b13Var2.s(i2);
        b13Var2.w(R.style.TextAppearance_AppCompat_Headline);
        b13Var2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (obtainStyledAttributes.hasValue(7)) {
            b13Var2.w(obtainStyledAttributes.getResourceId(7, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            b13Var2.q(obtainStyledAttributes.getResourceId(0, 0));
        }
        if (obtainStyledAttributes.hasValue(8) && b13Var2.o != (x = w3a.x(context2, obtainStyledAttributes, 8))) {
            b13Var2.o = x;
            b13Var2.l(false);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            b13Var2.r(w3a.x(context2, obtainStyledAttributes, 1));
        }
        if (obtainStyledAttributes.hasValue(25)) {
            b13Var2.v(obtainStyledAttributes.getInt(25, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            b13Var2.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            b13Var2.l(false);
        }
        this.w = obtainStyledAttributes.getInt(21, 600);
        this.x = yfa.E(context2, R.attr.motionEasingStandardInterpolator, e80.c);
        this.y = yfa.E(context2, R.attr.motionEasingStandardInterpolator, e80.d);
        setContentScrim(obtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(obtainStyledAttributes.getInt(27, 0));
        this.b = obtainStyledAttributes.getResourceId(32, -1);
        this.G = obtainStyledAttributes.getBoolean(19, false);
        this.J = obtainStyledAttributes.getBoolean(18, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        sa0 sa0Var = new sa0(this, 6);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(this, sa0Var);
    }

    public static ytk b(View view) {
        ytk ytkVar = (ytk) view.getTag(R.id.view_offset_helper);
        if (ytkVar != null) {
            return ytkVar;
        }
        ytk ytkVar2 = new ytk(view);
        view.setTag(R.id.view_offset_helper, ytkVar2);
        return ytkVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateList;
        Context context = getContext();
        TypedValue K = x2a.K(context.getTheme(), R.attr.colorSurfaceContainer);
        if (K != null) {
            int i = K.resourceId;
            if (i != 0) {
                colorStateList = eq3.q(i, context);
            } else {
                int i2 = K.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
            if (colorStateList == null) {
                return colorStateList.getDefaultColor();
            }
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            dj5 dj5Var = this.n;
            return dj5Var.a(dimension, dj5Var.d);
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public final void a() {
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
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
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.o && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.o || this.c == null) {
            return;
        }
        View view2 = this.e;
        if (view2 == null) {
            view2 = new View(getContext());
            this.e = view2;
        }
        if (view2.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c13;
    }

    public final void d() {
        if (this.r == null && this.s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.r) != null && this.t > 0) {
            drawable.mutate().setAlpha(this.t);
            this.r.draw(canvas);
        }
        if (this.o && this.p) {
            ViewGroup viewGroup = this.c;
            b13 b13Var = this.m;
            b13 b13Var2 = this.l;
            if (viewGroup == null || this.r == null || this.t <= 0 || this.D != 1 || b13Var2.b >= b13Var2.e) {
                b13Var2.f(canvas);
                b13Var.f(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                b13Var2.f(canvas);
                b13Var.f(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.s == null || this.t <= 0) {
            return;
        }
        x9l x9lVar = this.E;
        int d = x9lVar != null ? x9lVar.d() : 0;
        if (d > 0) {
            this.s.setBounds(0, -this.B, getWidth(), d - this.B);
            this.s.mutate().setAlpha(this.t);
            this.s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.r;
        if (drawable == null || this.t <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.D == 1 && view != null && this.o) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.r.mutate().setAlpha(this.t);
            this.r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        b13 b13Var = this.l;
        if (b13Var != null) {
            b13Var.S = drawableState;
            ColorStateList colorStateList2 = b13Var.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = b13Var.o) != null && colorStateList.isStateful())) {
                b13Var.l(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int i5;
        int i6;
        int i7;
        if (!this.o || (view = this.e) == null) {
            return;
        }
        int i8 = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.p = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((c13) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            Rect rect = this.k;
            by4.a(this, view3, rect);
            ViewGroup viewGroup = this.c;
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
            int i10 = rect.right - (z3 ? i8 : i6);
            int i11 = rect.top + height + i7;
            int i12 = (rect.bottom + height) - i5;
            b13 b13Var = this.m;
            TextPaint textPaint = b13Var.V;
            textPaint.setTextSize(b13Var.n);
            textPaint.setTypeface(b13Var.x);
            textPaint.setLetterSpacing(b13Var.g0);
            int descent = (int) (i12 - (textPaint.descent() + (-textPaint.ascent())));
            b13 b13Var2 = this.l;
            TextPaint textPaint2 = b13Var2.V;
            textPaint2.setTextSize(b13Var2.n);
            textPaint2.setTypeface(b13Var2.x);
            textPaint2.setLetterSpacing(b13Var2.g0);
            int descent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i11);
            if (TextUtils.isEmpty(b13Var.H)) {
                b13Var2.o(i9, i11, i10, i12);
            } else {
                b13Var2.o(i9, i11, i10, descent);
                b13Var.o(i9, descent2, i10, i12);
            }
            if (this.q == 0) {
                by4.a(this, this, rect);
                int i13 = rect.left + (z3 ? i6 : i8);
                int i14 = rect.right;
                if (!z3) {
                    i8 = i6;
                }
                int i15 = i14 - i8;
                if (TextUtils.isEmpty(b13Var.H)) {
                    b13Var2.p(i13, i11, i15, i12);
                } else {
                    b13Var2.p(i13, i11, i15, descent);
                    b13Var.p(i13, descent2, i15, i12);
                }
            }
            int i16 = z3 ? this.h : this.f;
            int i17 = rect.top + this.g;
            int i18 = (i3 - i) - (z3 ? this.f : this.h);
            int i19 = (i4 - i2) - this.i;
            boolean isEmpty = TextUtils.isEmpty(b13Var.H);
            b13 b13Var3 = this.l;
            if (isEmpty) {
                b13Var3.u(i16, i17, i18, i19, true);
                b13Var2.l(z);
            } else {
                b13Var3.u(i16, i17, i18, (int) ((i19 - (b13Var.i() + this.I)) - this.j), false);
                this.m.u(i16, (int) (b13Var2.i() + this.H + i17 + this.j), i18, i19, false);
                b13Var2.l(z);
                b13Var.l(z);
            }
        }
    }

    public final void f() {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || !this.o) {
            return;
        }
        CharSequence charSequence = null;
        CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        if (TextUtils.isEmpty(this.l.H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 instanceof Toolbar) {
            charSequence = ((Toolbar) viewGroup2).getSubtitle();
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            charSequence = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.m.H) || TextUtils.isEmpty(charSequence)) {
            return;
        }
        setSubtitle(charSequence);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c13 c13Var = new c13(-1, -1);
        c13Var.a = 0;
        c13Var.b = 0.5f;
        return c13Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c13 c13Var = new c13(context, attributeSet);
        c13Var.a = 0;
        c13Var.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.l);
        c13Var.a = obtainStyledAttributes.getInt(0, 0);
        c13Var.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return c13Var;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.m.n;
    }

    @NonNull
    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.m.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.l.l;
    }

    public float getCollapsedTitleTextSize() {
        return this.l.n;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.l.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.r;
    }

    public float getExpandedSubtitleTextSize() {
        return this.m.m;
    }

    @NonNull
    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.m.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.l.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public int getExpandedTitleSpacing() {
        return this.j;
    }

    public float getExpandedTitleTextSize() {
        return this.l.m;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.l.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.l.s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.l.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.l.j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.l.j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.l.o0;
    }

    public int getScrimAlpha() {
        return this.t;
    }

    public long getScrimAnimationDuration() {
        return this.w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.z;
        if (i >= 0) {
            return i + this.F + this.H + this.I + this.K;
        }
        x9l x9lVar = this.E;
        int d = x9lVar != null ? x9lVar.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.s;
    }

    @Nullable
    public CharSequence getSubtitle() {
        if (this.o) {
            return this.m.H;
        }
        return null;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.o) {
            return this.l.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.D;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.l.W;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.l.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.D == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            d13 d13Var = this.A;
            if (d13Var == null) {
                d13Var = new d13(this);
                this.A = d13Var;
            }
            appBarLayout.a(d13Var);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b13 b13Var = this.l;
        b13Var.k(configuration);
        if (this.C != configuration.orientation && this.J && b13Var.b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.C = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        d13 d13Var = this.A;
        if (d13Var != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).f(d13Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x9l x9lVar = this.E;
        if (x9lVar != null) {
            int d = x9lVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    WeakHashMap weakHashMap = bsk.a;
                    childAt.offsetTopAndBottom(d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            ytk b = b(getChildAt(i6));
            View view = b.a;
            b.b = view.getTop();
            b.c = view.getLeft();
        }
        e(i, i2, i3, i4, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        x9l x9lVar = this.E;
        int d = x9lVar != null ? x9lVar.d() : 0;
        if ((mode == 0 || this.G) && d > 0) {
            this.F = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        f();
        boolean z = this.o;
        b13 b13Var = this.l;
        if (!z || TextUtils.isEmpty(b13Var.H)) {
            collapsingToolbarLayout = this;
        } else {
            int measuredHeight3 = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.e(0, 0, getMeasuredWidth(), measuredHeight3, true);
            float i3 = b13Var.i() + collapsingToolbarLayout.F + collapsingToolbarLayout.g;
            b13 b13Var2 = collapsingToolbarLayout.m;
            int i4 = (int) (i3 + (TextUtils.isEmpty(b13Var2.H) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : collapsingToolbarLayout.j + b13Var2.i()) + collapsingToolbarLayout.i);
            if (i4 > measuredHeight3) {
                collapsingToolbarLayout.K = i4 - measuredHeight3;
            } else {
                collapsingToolbarLayout.K = 0;
            }
            if (collapsingToolbarLayout.J) {
                if (b13Var.o0 > 1) {
                    int i5 = b13Var.q;
                    if (i5 > 1) {
                        collapsingToolbarLayout.H = (i5 - 1) * Math.round(b13Var.i());
                    } else {
                        collapsingToolbarLayout.H = 0;
                    }
                }
                if (b13Var2.o0 > 1) {
                    int i6 = b13Var2.q;
                    if (i6 > 1) {
                        collapsingToolbarLayout.I = (i6 - 1) * Math.round(b13Var2.i());
                    } else {
                        collapsingToolbarLayout.I = 0;
                    }
                }
            }
            int i7 = collapsingToolbarLayout.K;
            int i8 = collapsingToolbarLayout.H;
            int i9 = collapsingToolbarLayout.I;
            if (i7 + i8 + i9 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight3 + i7 + i8 + i9, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.d;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                } else {
                    measuredHeight2 = view.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
            }
        }
        if (collapsingToolbarLayout.J && b13Var.o0 > 1 && b13Var.b == 1.0f) {
            ViewParent parent = collapsingToolbarLayout.getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.D == 1 && viewGroup != null && this.o) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.m.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        b13 b13Var = this.m;
        if (b13Var.n != f) {
            b13Var.n = f;
            b13Var.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(@Nullable Typeface typeface) {
        b13 b13Var = this.m;
        if (b13Var.t(typeface)) {
            b13Var.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.l.s(i);
        this.m.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.l.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        b13 b13Var = this.l;
        if (b13Var.n != f) {
            b13Var.n = f;
            b13Var.l(false);
        }
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        b13 b13Var = this.l;
        if (b13Var.t(typeface)) {
            b13Var.l(false);
        }
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.r = mutate;
            if (mutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.D == 1 && viewGroup != null && this.o) {
                    height = viewGroup.getBottom();
                }
                mutate.setBounds(0, 0, width, height);
                this.r.setCallback(this);
                this.r.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.m.w(i);
    }

    public void setExpandedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        b13 b13Var = this.m;
        if (b13Var.o != colorStateList) {
            b13Var.o = colorStateList;
            b13Var.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.m.y(f);
    }

    public void setExpandedSubtitleTypeface(@Nullable Typeface typeface) {
        b13 b13Var = this.m;
        if (b13Var.z(typeface)) {
            b13Var.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.l.x(i);
        this.m.x(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.l.w(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        b13 b13Var = this.l;
        if (b13Var.o != colorStateList) {
            b13Var.o = colorStateList;
            b13Var.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        this.l.y(f);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        b13 b13Var = this.l;
        if (b13Var.z(typeface)) {
            b13Var.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.J = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.G = z;
    }

    public void setHyphenationFrequency(int i) {
        this.l.s0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.l.q0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.l.r0 = f;
    }

    public void setMaxLines(int i) {
        this.l.v(i);
        this.m.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.l.K = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.t) {
            if (this.r != null && (viewGroup = this.c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.t = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.w = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.z != i) {
            this.z = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.u != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.v = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.t ? this.x : this.y);
                    this.v.addUpdateListener(new wz1(this, 1));
                } else if (valueAnimator.isRunning()) {
                    this.v.cancel();
                }
                this.v.setDuration(this.w);
                this.v.setIntValues(this.t, i);
                this.v.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.u = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(@Nullable e13 e13Var) {
        b13 b13Var = this.l;
        b13Var.getClass();
        if (e13Var != null) {
            b13Var.l(true);
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.s = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                this.s.setLayoutDirection(getLayoutDirection());
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
                this.s.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(@Nullable CharSequence charSequence) {
        this.m.B(charSequence);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.l.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.D = i;
        boolean z = i == 1;
        this.l.c = z;
        this.m.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.D == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        b13 b13Var = this.l;
        b13Var.G = truncateAt;
        b13Var.l(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        b13 b13Var = this.l;
        b13Var.W = timeInterpolator;
        b13Var.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.s;
        if (drawable != null && drawable.isVisible() != z) {
            this.s.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.r.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.s;
    }

    public void setCollapsedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.m.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.l.r(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        c13 c13Var = new c13(-1, -1);
        c13Var.a = 0;
        c13Var.b = 0.5f;
        return c13Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        c13 c13Var = new c13(layoutParams);
        c13Var.a = 0;
        c13Var.b = 0.5f;
        return c13Var;
    }
}
