package com.vk.superapp.ui.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vkontakte.android.R;
import xsna.b6g;
import xsna.iah0;
import xsna.ozl;

/* compiled from: ShimmerFrameLayout.kt */
@ozl
/* loaded from: classes11.dex */
public final class ShimmerFrameLayout extends FrameLayout {
    public final Paint b;
    public final a c;
    public boolean d;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        d();
        this.d = false;
        invalidate();
    }

    public final void b(Shimmer shimmer) {
        this.c.b(shimmer);
        if (shimmer.j) {
            setLayerType(2, this.b);
        } else {
            setLayerType(0, null);
        }
    }

    public final void c() {
        a aVar = this.c;
        ValueAnimator valueAnimator = aVar.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && aVar.getCallback() != null) {
                aVar.e.start();
            }
        }
    }

    public final void d() {
        a aVar = this.c;
        ValueAnimator valueAnimator = aVar.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        aVar.e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            this.c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.c.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.c.a();
        } else {
            if (i != 8) {
                return;
            }
            d();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = new Paint();
        a aVar = new a();
        this.c = aVar;
        this.d = true;
        setWillNotDraw(false);
        aVar.setCallback(this);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(false).j();
        cVar.k(b6g.a(R.attr.vk_ui_vkontakte_color_im_bubble_incoming, context));
        cVar.a.d = b6g.a(R.attr.vk_ui_track_background, context);
        b(cVar.d(1.0f).g(iah0.a(360)).a());
    }
}
