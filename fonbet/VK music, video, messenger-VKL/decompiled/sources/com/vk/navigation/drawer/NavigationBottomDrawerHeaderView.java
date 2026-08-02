package com.vk.navigation.drawer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.links.LinkedTextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.abg0;
import xsna.an10;
import xsna.b0u0;
import xsna.ccr0;
import xsna.dhr0;
import xsna.f5h0;
import xsna.gp10;
import xsna.iah0;
import xsna.iut0;
import xsna.krv0;
import xsna.m33;
import xsna.njt;
import xsna.p0w0;
import xsna.too0;

/* compiled from: NavigationBottomDrawerHeaderView.kt */
/* loaded from: classes3.dex */
public final class NavigationBottomDrawerHeaderView extends ViewGroup implements too0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final float D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final a r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;
    public final VKImageView b;
    public final AppCompatImageView c;
    public final LinkedTextView d;
    public final ccr0 e;
    public GradientDrawable f;
    public final TextPaint g;
    public final Rect h;
    public final StringBuilder i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final Rect n;
    public final Rect o;
    public int p;
    public boolean q;

    /* compiled from: NavigationBottomDrawerHeaderView.kt */
    public static final class a {
        public static final float a(a aVar, float f) {
            return Resources.getSystem().getDisplayMetrics().density * f;
        }

        public static final int b(a aVar, int i) {
            return an10.b(Resources.getSystem().getDisplayMetrics().density * i);
        }
    }

    static {
        a aVar = new a();
        r = aVar;
        s = a.b(aVar, 20);
        t = a.b(aVar, 16);
        u = a.b(aVar, 24);
        v = a.b(aVar, 16);
        w = a.b(aVar, 56);
        x = a.b(aVar, 48);
        y = a.b(aVar, 72);
        z = a.b(aVar, 18);
        A = a.b(aVar, 14);
        B = a.b(aVar, 20);
        C = a.b(aVar, 6);
        D = a.a(aVar, 4.0f);
        E = a.b(aVar, 28);
        F = a.b(aVar, 2);
        G = an10.b(a.a(aVar, 12.5f));
        an10.b(a.a(aVar, 0.5f));
        H = a.b(aVar, 12);
        I = a.b(aVar, 40);
        J = a.b(aVar, 5);
    }

    public NavigationBottomDrawerHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        this.b = vKImageView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.c = appCompatImageView;
        LinkedTextView linkedTextView = new LinkedTextView(context, null, 6, 0);
        this.d = linkedTextView;
        ccr0 ccr0Var = new ccr0(context);
        this.e = ccr0Var;
        TextPaint textPaint = new TextPaint(1);
        this.g = textPaint;
        this.h = new Rect();
        this.i = new StringBuilder();
        this.j = -1;
        this.n = new Rect();
        this.o = new Rect();
        a aVar = r;
        this.p = a.b(aVar, 0);
        njt hierarchy = vKImageView.getHierarchy();
        if (hierarchy != null) {
            RoundingParams a2 = RoundingParams.a();
            a2.f = dhr0.t.c(R.attr.vk_ui_separator_primary_alpha);
            a2.d(a.a(aVar, 0.33f));
            a2.i = true;
            hierarchy.u(a2);
        }
        abg0 abg0Var = dhr0.t;
        Drawable a3 = abg0Var.a(R.drawable.user_placeholder);
        vKImageView.setPlaceholderImage(a3);
        ccr0Var.g.o(f5h0.g.a);
        ccr0Var.u(a3);
        int i = B;
        ccr0Var.m = i;
        ccr0Var.n = i;
        appCompatImageView.setImageDrawable(ccr0Var);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        linkedTextView.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        b.k(linkedTextView, FontFamily.REGULAR, Float.valueOf(15.0f), 4);
        linkedTextView.setMinimumHeight(a.b(aVar, 20));
        linkedTextView.setIncludeFontPadding(false);
        linkedTextView.setSingleLine(true);
        linkedTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(vKImageView);
        addView(appCompatImageView);
        addView(linkedTextView);
        textPaint.setColor(abg0Var.c(R.attr.vk_ui_text_primary));
        b.j(textPaint, context, FontFamily.MEDIUM, Float.valueOf(20.0f), 8);
    }

    public static int a(AppCompatImageView appCompatImageView) {
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static int b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static int d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static int g(View view, int i, int i2, int i3) {
        int b = b(view) + (((i2 - i) - view.getMeasuredWidth()) / 2) + i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int marginEnd = b - (marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0);
        int c = c(view) + i3;
        view.layout(marginEnd, c, view.getMeasuredWidth() + marginEnd, view.getMeasuredHeight() + c);
        return view.getBottom();
    }

    private final GradientDrawable getScrimDrawable() {
        GradientDrawable gradientDrawable = this.f;
        if (gradientDrawable != null) {
            return gradientDrawable;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        GradientDrawable gradientDrawable2 = new GradientDrawable(getLayoutDirection() == 1 ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, dhr0.t.c(R.attr.vk_ui_background_content)});
        this.f = gradientDrawable2;
        return gradientDrawable2;
    }

    public static void i(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    public static void j(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        int i;
        int i2;
        njt hierarchy;
        RoundingParams roundingParams;
        VKImageView vKImageView = this.b;
        if (vKImageView != null && (hierarchy = vKImageView.getHierarchy()) != null && (roundingParams = hierarchy.c) != null) {
            roundingParams.f = dhr0.t.c(R.attr.vk_ui_separator_primary_alpha);
        }
        abg0 abg0Var = dhr0.t;
        Drawable a2 = abg0Var.a(R.drawable.user_placeholder);
        if (vKImageView != null) {
            vKImageView.setPlaceholderImage(a2);
        }
        this.e.u(a2);
        this.d.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        this.g.setColor(abg0Var.c(R.attr.vk_ui_text_primary));
        k(true);
        if (this.f != null) {
            this.f = null;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            boolean z2 = getLayoutDirection() == 1;
            GradientDrawable scrimDrawable = getScrimDrawable();
            int i3 = I;
            Rect rect = this.h;
            if (z2) {
                i2 = rect.left + i3;
                i = i2 - i3;
            } else {
                int i4 = rect.right - i3;
                int i5 = i3 + i4;
                i = i4;
                i2 = i5;
            }
            scrimDrawable.setBounds(i, rect.top, i2, rect.bottom);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        return (this.j != 2 || this.k || this.l) ? false : true;
    }

    public final int f(View view, int i, int i2, int i3, int i4, int i5, boolean z2, int i6) {
        Rect rect = this.n;
        rect.set(i, i2, i3, i4);
        if (z2) {
            rect.right -= b(view);
        } else {
            rect.left = b(view) + rect.left;
        }
        rect.top = c(view) + rect.top;
        Gravity.apply(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), this.n, this.o, i5);
        Rect rect2 = this.o;
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        return rect2.bottom;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null ? new ViewGroup.LayoutParams(layoutParams) : generateDefaultLayoutParams();
    }

    public final void h(int i) {
        int b;
        int measuredWidth;
        Rect rect = this.h;
        AppCompatImageView appCompatImageView = this.c;
        if (i == 1) {
            measuredWidth = rect.left - b(appCompatImageView);
            b = measuredWidth - appCompatImageView.getMeasuredWidth();
        } else {
            b = b(appCompatImageView) + rect.right;
            measuredWidth = appCompatImageView.getMeasuredWidth() + b;
        }
        int i2 = rect.bottom;
        appCompatImageView.layout(b, i2 - appCompatImageView.getMeasuredHeight(), measuredWidth, i2);
    }

    public final void k(boolean z2) {
        if (this.q || z2) {
            boolean e = e();
            AppCompatImageView appCompatImageView = this.c;
            if (e) {
                appCompatImageView.setBackground(m33.a(R.drawable.white_oval, getContext()));
                appCompatImageView.setBackgroundTintList(ColorStateList.valueOf(krv0.l(R.attr.vk_ui_background_modal)));
                appCompatImageView.setElevation(D);
                appCompatImageView.setOutlineProvider(p0w0.a);
            } else {
                appCompatImageView.setBackground(null);
                appCompatImageView.setBackgroundTintList(null);
                appCompatImageView.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                appCompatImageView.setOutlineProvider(null);
            }
            this.q = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e.t();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.e.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3;
        int width;
        int i5;
        int i6 = this.j;
        Rect rect = this.n;
        Rect rect2 = this.h;
        int i7 = s;
        AppCompatImageView appCompatImageView = this.c;
        int i8 = v;
        VKImageView vKImageView = this.b;
        int i9 = u;
        LinkedTextView linkedTextView = this.d;
        if (i6 == 1 || this.k) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            int layoutDirection = getLayoutDirection();
            z3 = layoutDirection == 1;
            if (this.m) {
                i8 = i9;
            }
            int height = getHeight() - i9;
            boolean z4 = z3;
            f(vKImageView, 0, i8, getWidth(), height, layoutDirection, z4, 8388659);
            if (z4) {
                width = vKImageView.getLeft();
                i5 = i7;
            } else {
                int right = vKImageView.getRight();
                width = getWidth() - i7;
                i5 = right;
            }
            rect.set(i5, i8, width, height);
            rect2.set(rect);
            int i10 = rect2.bottom;
            if (appCompatImageView.getVisibility() != 8) {
                h(layoutDirection);
            }
            if (linkedTextView.getVisibility() != 8) {
                f(linkedTextView, i5, i10, width, height, layoutDirection, z4, 8388659);
                return;
            }
            return;
        }
        if (e()) {
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            int layoutDirection2 = getLayoutDirection();
            z3 = layoutDirection2 == 1;
            int width2 = getWidth() - i7;
            if (this.m) {
                i8 = i9;
            }
            int g = g(vKImageView, i7, width2, i8) + G;
            rect2.set(i7, g, width2, g);
            int i11 = rect2.bottom;
            if (linkedTextView.getVisibility() != 8) {
                g(linkedTextView, i7, width2, i11);
            }
            if (appCompatImageView.getVisibility() != 8) {
                f(appCompatImageView, vKImageView.getLeft() - b(appCompatImageView), vKImageView.getTop() - c(appCompatImageView), b(appCompatImageView) + vKImageView.getRight(), c(appCompatImageView) + vKImageView.getBottom(), layoutDirection2, z3, 8388693);
                return;
            }
            return;
        }
        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
        int layoutDirection3 = getLayoutDirection();
        z3 = layoutDirection3 == 1;
        int width3 = getWidth() - i7;
        if (this.m) {
            i8 = i9;
        }
        int height2 = getHeight() - i8;
        boolean z5 = z3;
        rect.set(i7, f(vKImageView, 0, i8, getWidth(), height2, layoutDirection3, z5, 8388659), width3, height2);
        rect2.set(rect);
        int i12 = rect2.bottom;
        if (appCompatImageView.getVisibility() != 8) {
            h(layoutDirection3);
        }
        if (linkedTextView.getVisibility() != 8) {
            f(linkedTextView, i7, i12, width3, height2, layoutDirection3, z5, 8388659);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i2);
        this.k = View.MeasureSpec.getSize(i) < iah0.a((float) 320);
        this.l = size <= iah0.a((float) 480);
        this.m = size > iah0.a((float) 640);
        int i8 = this.j;
        a aVar = r;
        StringBuilder sb = this.i;
        int i9 = B;
        int i10 = C;
        int i11 = v;
        int i12 = J;
        LinkedTextView linkedTextView = this.d;
        AppCompatImageView appCompatImageView = this.c;
        VKImageView vKImageView = this.b;
        if (i8 == 1 || this.k) {
            i(A, vKImageView);
            j(0, appCompatImageView);
            i(i10, appCompatImageView);
            j(i12, linkedTextView);
            i(H, linkedTextView);
            int i13 = t * 2;
            int i14 = i11 * 2;
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            int suggestedMinimumHeight = getSuggestedMinimumHeight();
            int a2 = gp10.a(i, suggestedMinimumWidth, Integer.MAX_VALUE, i13);
            int a3 = gp10.a(i2, suggestedMinimumHeight, Integer.MAX_VALUE, i14);
            int i15 = x;
            vKImageView.measure(gp10.c(i15, 1073741824), gp10.c(i15, 1073741824));
            int a4 = a(vKImageView) + vKImageView.getMeasuredWidth();
            int d = d(vKImageView) + vKImageView.getMeasuredHeight();
            if (appCompatImageView.getVisibility() != 8) {
                appCompatImageView.measure(gp10.c(i9, 1073741824), gp10.c(i9, 1073741824));
                appCompatImageView.getMeasuredWidth();
                a(appCompatImageView);
                i3 = appCompatImageView.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            int i16 = a2 - a4;
            sb.setLength(0);
            if (linkedTextView.getVisibility() != 8) {
                measureChildWithMargins(linkedTextView, gp10.c(i16, Integer.MIN_VALUE), 0, gp10.c(a3 - d, Integer.MIN_VALUE), 0);
                i4 = a.b(aVar, 1) + d(linkedTextView) + linkedTextView.getMeasuredHeight();
            } else {
                i4 = 0;
            }
            setMeasuredDimension(a2 + i13, (Math.max(d, Math.max(0, i3) + i4) + i14) - this.p);
        } else {
            boolean e = e();
            int i17 = u;
            int i18 = s;
            if (e) {
                i(0, vKImageView);
                int i19 = F;
                j(i19, appCompatImageView);
                i(i19, appCompatImageView);
                j(i12, linkedTextView);
                i(0, linkedTextView);
                int i20 = i18 * 2;
                int i21 = this.m ? i17 * 2 : i11 * 2;
                int suggestedMinimumWidth2 = getSuggestedMinimumWidth();
                int suggestedMinimumHeight2 = getSuggestedMinimumHeight();
                int a5 = gp10.a(i, suggestedMinimumWidth2, Integer.MAX_VALUE, i20);
                int a6 = gp10.a(i2, suggestedMinimumHeight2, Integer.MAX_VALUE, i21);
                int i22 = y;
                vKImageView.measure(gp10.c(i22, 1073741824), gp10.c(i22, 1073741824));
                int d2 = d(vKImageView) + vKImageView.getMeasuredHeight();
                if (appCompatImageView.getVisibility() != 8) {
                    int i23 = E;
                    appCompatImageView.measure(gp10.c(i23, 1073741824), gp10.c(i23, 1073741824));
                }
                sb.setLength(0);
                if (linkedTextView.getVisibility() != 8) {
                    measureChildWithMargins(linkedTextView, gp10.c(a5, Integer.MIN_VALUE), 0, gp10.c(a6 - d2, Integer.MIN_VALUE), 0);
                    i7 = a.b(aVar, 1) + d(linkedTextView) + linkedTextView.getMeasuredHeight();
                } else {
                    i7 = 0;
                }
                setMeasuredDimension(a5 + i20, ((d2 + i7) + i21) - this.p);
            } else {
                i(z, vKImageView);
                j(0, appCompatImageView);
                i(i10, appCompatImageView);
                j(i12, linkedTextView);
                i(0, linkedTextView);
                int i24 = i18 * 2;
                int i25 = this.m ? i17 * 2 : i11 * 2;
                int suggestedMinimumWidth3 = getSuggestedMinimumWidth();
                int suggestedMinimumHeight3 = getSuggestedMinimumHeight();
                int a7 = gp10.a(i, suggestedMinimumWidth3, Integer.MAX_VALUE, i24);
                int a8 = gp10.a(i2, suggestedMinimumHeight3, Integer.MAX_VALUE, i25);
                int i26 = w;
                vKImageView.measure(gp10.c(i26, 1073741824), gp10.c(i26, 1073741824));
                int d3 = d(vKImageView) + vKImageView.getMeasuredHeight();
                if (appCompatImageView.getVisibility() != 8) {
                    appCompatImageView.measure(gp10.c(i9, 1073741824), gp10.c(i9, 1073741824));
                    appCompatImageView.getMeasuredWidth();
                    a(appCompatImageView);
                    i5 = appCompatImageView.getMeasuredHeight();
                } else {
                    i5 = 0;
                }
                sb.setLength(0);
                if (linkedTextView.getVisibility() != 8) {
                    measureChildWithMargins(linkedTextView, gp10.c(a7, Integer.MIN_VALUE), 0, gp10.c(a8 - d3, Integer.MIN_VALUE), 0);
                    i6 = a.b(aVar, 1) + d(linkedTextView) + linkedTextView.getMeasuredHeight();
                } else {
                    i6 = 0;
                }
                setMeasuredDimension(a7 + i24, (((Math.max(0, i5) + d3) + i6) + i25) - this.p);
            }
        }
        this.g.setTextAlign(e() ? Paint.Align.CENTER : Paint.Align.LEFT);
        k(false);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.getSuperState());
            setMode(state.b);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = this.j;
        return state;
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.e.t();
    }

    public final void setHeightSubtraction(int i) {
        if (this.p != i) {
            this.p = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setImageStatusContentDescription(CharSequence charSequence) {
        this.c.setContentDescription(charSequence);
    }

    public final void setMode(int i) {
        if (this.j != i) {
            this.j = i;
            this.q = true;
            requestLayout();
            invalidate();
        }
    }

    public final void setOnImageStatusClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setOnSubtitleClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public final void setOnSubtitleLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.d.setOnLongClickListener(onLongClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        LinkedTextView linkedTextView = this.d;
        linkedTextView.setText(charSequence);
        linkedTextView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setSubtitleIsImportantForAccessibility(boolean z2) {
        this.d.setImportantForAccessibility(z2 ? 1 : 2);
    }

    /* compiled from: NavigationBottomDrawerHeaderView.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public int b;

        /* compiled from: NavigationBottomDrawerHeaderView.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
            this.b = -1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }

        public State(Parcel parcel) {
            super(parcel);
            this.b = -1;
            this.b = parcel.readInt();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
