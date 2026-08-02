package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.beo0;
import xsna.fpo0;
import xsna.iut0;
import xsna.rq2;
import xsna.ubo0;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes13.dex */
public final class a extends Drawable implements beo0.b {
    public static final int o = R$style.Widget_MaterialComponents_Badge;
    public static final int p = R$attr.badgeStyle;

    @NonNull
    public final WeakReference<Context> b;

    @NonNull
    public final MaterialShapeDrawable c;

    @NonNull
    public final beo0 d;

    @NonNull
    public final Rect e;

    @NonNull
    public final BadgeState f;
    public float g;
    public float h;
    public final int i;
    public float j;
    public float k;
    public float l;

    @Nullable
    public WeakReference<View> m;

    @Nullable
    public WeakReference<FrameLayout> n;

    public a(@NonNull Context context, @Nullable BadgeState.State state) {
        ubo0 ubo0Var;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.b = weakReference;
        fpo0.c(context, "Theme.MaterialComponents", fpo0.b);
        this.e = new Rect();
        beo0 beo0Var = new beo0(this);
        this.d = beo0Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = beo0Var.a;
        textPaint.setTextAlign(align);
        BadgeState badgeState = new BadgeState(context, state);
        this.f = badgeState;
        boolean f = f();
        BadgeState.State state2 = badgeState.b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(com.google.android.material.shape.a.a(f ? state2.h.intValue() : state2.f.intValue(), f() ? state2.i.intValue() : state2.g.intValue(), context).a());
        this.c = materialShapeDrawable;
        h();
        Context context2 = weakReference.get();
        if (context2 != null && beo0Var.g != (ubo0Var = new ubo0(context2, state2.e.intValue()))) {
            beo0Var.c(ubo0Var, context2);
            textPaint.setColor(state2.d.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = state2.m;
        if (i != -2) {
            this.i = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.i = state2.n;
        }
        beo0Var.e = true;
        j();
        invalidateSelf();
        beo0Var.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(state2.c.intValue());
        if (materialShapeDrawable.getFillColor() != valueOf) {
            materialShapeDrawable.setFillColor(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.d.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.m;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.m.get();
            WeakReference<FrameLayout> weakReference3 = this.n;
            i(view, weakReference3 != null ? weakReference3.get() : null);
        }
        j();
        setVisible(state2.u.booleanValue(), false);
    }

    @Override // xsna.beo0.b
    public final void a() {
        invalidateSelf();
    }

    @Nullable
    public final String b() {
        BadgeState badgeState = this.f;
        BadgeState.State state = badgeState.b;
        BadgeState.State state2 = badgeState.b;
        String str = state.k;
        WeakReference<Context> weakReference = this.b;
        if (str == null) {
            if (!g()) {
                return null;
            }
            if (this.i == -2 || e() <= this.i) {
                return NumberFormat.getInstance(state2.o).format(e());
            }
            Context context = weakReference.get();
            return context == null ? "" : String.format(state2.o, context.getString(R$string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.i), "+");
        }
        int i = state.m;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R$string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    @Nullable
    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        BadgeState badgeState = this.f;
        BadgeState.State state = badgeState.b;
        BadgeState.State state2 = badgeState.b;
        if (state.k != null) {
            CharSequence charSequence = state.p;
            return charSequence != null ? charSequence : badgeState.b.k;
        }
        if (!g()) {
            return state2.q;
        }
        if (state2.r == 0 || (context = this.b.get()) == null) {
            return null;
        }
        if (this.i != -2) {
            int e = e();
            int i = this.i;
            if (e > i) {
                return context.getString(state2.s, Integer.valueOf(i));
            }
        }
        return context.getResources().getQuantityString(state2.r, e(), Integer.valueOf(e()));
    }

    @Nullable
    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        String b;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.c.draw(canvas);
        if (!f() || (b = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        beo0 beo0Var = this.d;
        beo0Var.a.getTextBounds(b, 0, b.length(), rect);
        float exactCenterY = this.h - rect.exactCenterY();
        canvas.drawText(b, this.g, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), beo0Var.a);
    }

    public final int e() {
        int i = this.f.b.l;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.f.b.k != null || g();
    }

    public final boolean g() {
        BadgeState.State state = this.f.b;
        return state.k == null && state.l != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = this.b.get();
        if (context == null) {
            return;
        }
        boolean f = f();
        BadgeState badgeState = this.f;
        this.c.setShapeAppearanceModel(com.google.android.material.shape.a.a(f ? badgeState.b.h.intValue() : badgeState.b.f.intValue(), f() ? badgeState.b.i.intValue() : badgeState.b.g.intValue(), context).a());
        invalidateSelf();
    }

    public final void i(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.m = new WeakReference<>(view);
        this.n = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        float f;
        float f2;
        float y;
        float x;
        float height;
        float width;
        float f3;
        WeakReference<Context> weakReference = this.b;
        Context context = weakReference.get();
        WeakReference<View> weakReference2 = this.m;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.e;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference3 = this.n;
        FrameLayout frameLayout = weakReference3 != null ? weakReference3.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean f4 = f();
        BadgeState badgeState = this.f;
        float f5 = f4 ? badgeState.d : badgeState.c;
        this.j = f5;
        if (f5 != -1.0f) {
            this.k = f5;
            this.l = f5;
        } else {
            this.k = Math.round((f() ? badgeState.g : badgeState.e) / 2.0f);
            this.l = Math.round((f() ? badgeState.h : badgeState.f) / 2.0f);
        }
        if (f()) {
            String b = b();
            float f6 = this.k;
            beo0 beo0Var = this.d;
            this.k = Math.max(f6, (beo0Var.a(b) / 2.0f) + badgeState.b.v.intValue());
            float f7 = this.l;
            if (beo0Var.e) {
                beo0Var.b(b);
                f3 = beo0Var.d;
            } else {
                f3 = beo0Var.d;
            }
            float max = Math.max(f7, (f3 / 2.0f) + badgeState.b.w.intValue());
            this.l = max;
            this.k = Math.max(this.k, max);
        }
        BadgeState.State state = badgeState.b;
        BadgeState.State state2 = badgeState.b;
        int i = badgeState.k;
        int intValue = state.y.intValue();
        if (f()) {
            intValue = state.A.intValue();
            Context context2 = weakReference.get();
            if (context2 != null) {
                intValue = rq2.c(intValue, intValue - state.D.intValue(), rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (i == 0) {
            intValue -= Math.round(this.l);
        }
        int intValue2 = state.C.intValue() + intValue;
        int intValue3 = state2.t.intValue();
        if (intValue3 == 8388691 || intValue3 == 8388693) {
            this.h = rect3.bottom - intValue2;
        } else {
            this.h = rect3.top + intValue2;
        }
        int intValue4 = f() ? state.z.intValue() : state2.x.intValue();
        if (i == 1) {
            intValue4 += f() ? badgeState.j : badgeState.i;
        }
        int intValue5 = state.B.intValue() + intValue4;
        int intValue6 = state2.t.intValue();
        if (intValue6 == 8388659 || intValue6 == 8388691) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            this.g = view.getLayoutDirection() == 0 ? (rect3.left - this.k) + intValue5 : (rect3.right + this.k) - intValue5;
        } else {
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            this.g = view.getLayoutDirection() == 0 ? (rect3.right + this.k) - intValue5 : (rect3.left - this.k) + intValue5;
        }
        if (state.E.booleanValue()) {
            View d = d();
            if (d != null) {
                FrameLayout d2 = d();
                if (d2 == null || d2.getId() != R$id.mtrl_anchor_parent) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else if (d.getParent() instanceof View) {
                    f = d.getY();
                    f2 = d.getX();
                    d = (View) d.getParent();
                }
                y = d.getY() + (this.h - this.l) + f;
                x = d.getX() + (this.g - this.k) + f2;
                if (!(d.getParent() instanceof View)) {
                }
                if (!(d.getParent() instanceof View)) {
                }
                if (y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
            } else if (view.getParent() instanceof View) {
                float y2 = view.getY();
                f2 = view.getX();
                View view2 = (View) view.getParent();
                f = y2;
                d = view2;
                y = d.getY() + (this.h - this.l) + f;
                x = d.getX() + (this.g - this.k) + f2;
                height = !(d.getParent() instanceof View) ? ((this.h + this.l) - (((View) d.getParent()).getHeight() - d.getY())) + f : 0.0f;
                width = !(d.getParent() instanceof View) ? ((this.g + this.k) - (((View) d.getParent()).getWidth() - d.getX())) + f2 : 0.0f;
                if (y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.h = Math.abs(y) + this.h;
                }
                if (x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.g = Math.abs(x) + this.g;
                }
                if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.h -= Math.abs(height);
                }
                if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.g -= Math.abs(width);
                }
            }
        }
        float f8 = this.g;
        float f9 = this.h;
        float f10 = this.k;
        float f11 = this.l;
        rect2.set((int) (f8 - f10), (int) (f9 - f11), (int) (f8 + f10), (int) (f9 + f11));
        float f12 = this.j;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        if (f12 != -1.0f) {
            materialShapeDrawable.setCornerSize(f12);
        }
        if (rect.equals(rect2)) {
            return;
        }
        materialShapeDrawable.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, xsna.beo0.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        BadgeState badgeState = this.f;
        badgeState.a.j = i;
        badgeState.b.j = i;
        this.d.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
