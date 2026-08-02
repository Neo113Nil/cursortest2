package com.vk.core.view.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vkontakte.android.R;
import xsna.hbh0;
import xsna.krv0;

/* compiled from: ShimmerFrameLayout.kt */
/* loaded from: classes17.dex */
public final class ShimmerFrameLayout extends FrameLayout {
    public final Paint b;
    public final a c;
    public boolean d;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        e();
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
        this.d = true;
        d();
    }

    public final void d() {
        this.c.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            this.c.draw(canvas);
        }
    }

    public final void e() {
        a aVar = this.c;
        ValueAnimator valueAnimator = aVar.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        aVar.e.cancel();
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
            e();
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
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(false).i();
        cVar.k(krv0.l(R.attr.vk_ui_background_secondary));
        cVar.a.d = krv0.l(R.attr.vk_ui_track_background);
        b(((Shimmer.c) cVar.d()).f(hbh0.b(360, context)).a());
    }
}
