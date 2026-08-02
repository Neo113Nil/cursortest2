package com.vk.photo.editor.views.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.views.shimmer.Shimmer;
import com.vkontakte.android.R;
import xsna.lhg;

/* compiled from: ShimmerFrameLayout.kt */
/* loaded from: classes4.dex */
public final class ShimmerFrameLayout extends FrameLayout {
    public final Paint b;
    public final a c;
    public final boolean d;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new Paint();
        a aVar = new a();
        this.c = aVar;
        this.d = true;
        setWillNotDraw(false);
        aVar.setCallback(this);
        Shimmer.b bVar = new Shimmer.b();
        Shimmer shimmer = bVar.a;
        shimmer.j = false;
        shimmer.getClass();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.editorSkeletonColor, typedValue, true);
        bVar.e(typedValue.data);
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.editorSkeletonHighlightColor, typedValue2, true);
        shimmer.d = typedValue2.data;
        Shimmer.b bVar2 = (Shimmer.b) bVar.c();
        int floor = (int) Math.floor(360 * Resources.getSystem().getDisplayMetrics().density);
        if (floor < 0) {
            throw new IllegalArgumentException(lhg.a(floor, "Given invalid width: ").toString());
        }
        bVar2.a.f = floor;
        a(bVar2.a());
    }

    public final void a(Shimmer shimmer) {
        boolean z;
        ValueAnimator valueAnimator;
        a aVar = this.c;
        aVar.f = shimmer;
        Paint paint = aVar.b;
        Shimmer shimmer2 = aVar.f;
        if (shimmer2 == null) {
            shimmer2 = null;
        }
        paint.setXfermode(new PorterDuffXfermode(shimmer2.k ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        aVar.b();
        ValueAnimator valueAnimator2 = aVar.e;
        if (valueAnimator2 != null) {
            z = valueAnimator2.isStarted();
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        } else {
            z = false;
        }
        Shimmer shimmer3 = aVar.f;
        if (shimmer3 == null) {
            shimmer3 = null;
        }
        long j = shimmer3.n;
        ValueAnimator valueAnimator3 = shimmer3.q;
        if (valueAnimator3 == null) {
            valueAnimator3 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (shimmer3.o / j) + 1.0f);
            valueAnimator3.setRepeatMode(shimmer3.m);
            valueAnimator3.setRepeatCount(shimmer3.l);
            valueAnimator3.setDuration(j);
            valueAnimator3.setInterpolator(shimmer3.p);
            shimmer3.q = valueAnimator3;
        }
        aVar.e = valueAnimator3;
        valueAnimator3.addUpdateListener(aVar.a);
        if (z && (valueAnimator = aVar.e) != null) {
            valueAnimator.start();
        }
        aVar.invalidateSelf();
        if (shimmer.i) {
            setLayerType(2, this.b);
        } else {
            setLayerType(0, null);
        }
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
        a aVar = this.c;
        ValueAnimator valueAnimator = aVar.e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        aVar.e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }
}
