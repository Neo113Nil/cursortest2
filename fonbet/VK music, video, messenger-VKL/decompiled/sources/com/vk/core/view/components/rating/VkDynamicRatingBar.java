package com.vk.core.view.components.rating;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vk.core.view.components.extra.R$styleable;
import com.vk.core.view.components.rating.VkDynamicRatingBar;
import com.vk.core.view.components.rating.a;
import com.vkontakte.android.R;
import xsna.iut0;
import xsna.izs;
import xsna.krv0;
import xsna.l8g;
import xsna.lxe0;
import xsna.pqu0;
import xsna.s3q0;
import xsna.sxe0;
import xsna.vxe0;

/* compiled from: VkDynamicRatingBar.kt */
/* loaded from: classes17.dex */
public final class VkDynamicRatingBar extends View {
    public static final /* synthetic */ int j = 0;
    public final lxe0 b;
    public int c;
    public sxe0 d;
    public RatingBar$Size e;
    public boolean f;
    public izs<? super Integer, s3q0> g;
    public final AccessibilityManager h;
    public pqu0 i;

    /* compiled from: VkDynamicRatingBar.kt */
    public static final class a extends View.AccessibilityDelegate {
        public a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int i = VkDynamicRatingBar.j;
            VkDynamicRatingBar.this.b();
        }
    }

    public VkDynamicRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int a(float f) {
        sxe0 sxe0Var = this.d;
        int i = ((sxe0Var == null ? null : sxe0Var).d / 2) + (sxe0Var == null ? null : sxe0Var).a;
        int i2 = (sxe0Var == null ? null : sxe0Var).a;
        if (sxe0Var == null) {
            sxe0Var = null;
        }
        int i3 = i2 + sxe0Var.d;
        float f2 = i;
        if (f < f2) {
            return 1;
        }
        if (f > (i3 * 3) + i) {
            return 5;
        }
        return ((int) ((f - f2) / i3)) + 2;
    }

    public final void b() {
        setContentDescription((this.f && isEnabled()) ? getResources().getString(R.string.ds_internal_dynamic_rating_bar_content_description_accessibility) : null);
        iut0.t(this, getContext().getString(R.string.ds_internal_static_rating_view_content_description, Float.valueOf(this.c)));
    }

    public final int getRating() {
        return this.c;
    }

    public final RatingBar$Size getSize() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, xsna.pqu0] */
    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ?? r0 = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: xsna.pqu0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                int i = VkDynamicRatingBar.j;
                VkDynamicRatingBar.this.getClass();
            }
        };
        this.h.addAccessibilityStateChangeListener(r0);
        this.i = r0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        pqu0 pqu0Var = this.i;
        if (pqu0Var != null) {
            this.h.removeAccessibilityStateChangeListener(pqu0Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.b.a(canvas, getWidth(), isEnabled());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Size b = this.b.b();
        setMeasuredDimension(b.getWidth(), b.getHeight());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lxe0 lxe0Var = this.b;
        Bitmap bitmap = lxe0Var.g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        lxe0Var.h = new Canvas(createBitmap);
        lxe0Var.g = createBitmap;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (this.f && isEnabled()) {
                z = true;
                if (action == 1) {
                    setRating(a(motionEvent.getX()));
                    izs<? super Integer, s3q0> izsVar = this.g;
                    if (izsVar != null) {
                        izsVar.invoke(Integer.valueOf(this.c));
                    }
                } else if (action == 2) {
                    setRating(a(motionEvent.getX()));
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        b();
    }

    public final void setInteractionEnabled(boolean z) {
        this.f = z;
        b();
    }

    public final void setOnRatingChanged(izs<? super Integer, s3q0> izsVar) {
        this.g = izsVar;
    }

    public final void setRating(int i) {
        this.c = i;
        this.b.a = i;
        invalidate();
    }

    public final void setSize(RatingBar$Size ratingBar$Size) {
        this.e = ratingBar$Size;
        sxe0 a2 = b.a(ratingBar$Size);
        this.d = a2;
        lxe0 lxe0Var = this.b;
        lxe0Var.c = a2;
        Context context = getContext();
        sxe0 sxe0Var = this.d;
        if (sxe0Var == null) {
            sxe0Var = null;
        }
        lxe0Var.e = krv0.e(sxe0Var.b, context);
        b();
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkDynamicRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        lxe0 lxe0Var = new lxe0();
        lxe0Var.b = new a.b();
        lxe0Var.d = new vxe0(l8g.f(0.4f, krv0.m(R.attr.vk_ui_icon_tertiary, context)), krv0.m(R.attr.vk_ui_accent_orange_peach, context));
        this.b = lxe0Var;
        RatingBar$Size ratingBar$Size = RatingBar$Size.Medium;
        this.e = ratingBar$Size;
        this.f = true;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.h = accessibilityManager;
        accessibilityManager.isTouchExplorationEnabled();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.i, 0, 0);
        setRating(obtainStyledAttributes.getInt(0, 0));
        setSize((RatingBar$Size) RatingBar$Size.h().get(obtainStyledAttributes.getInt(2, ratingBar$Size.ordinal())));
        setInteractionEnabled(obtainStyledAttributes.getBoolean(1, true));
        obtainStyledAttributes.recycle();
        setAccessibilityDelegate(new a());
    }
}
