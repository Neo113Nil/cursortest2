package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint a;
    public final e b;
    public final boolean c;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.a = new Paint();
        e eVar = new e();
        this.b = eVar;
        this.c = true;
        setWillNotDraw(false);
        eVar.setCallback(this);
        if (attributeSet == null) {
            a(new b(0).a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                bVar = new b(1);
                bVar.a.p = false;
            } else {
                bVar = new b(0);
            }
            switch (bVar.b) {
                case 1:
                    c cVar = bVar.a;
                    bVar.b(obtainStyledAttributes);
                    if (obtainStyledAttributes.hasValue(2)) {
                        cVar.e = (obtainStyledAttributes.getColor(2, cVar.e) & 16777215) | (cVar.e & (-16777216));
                    }
                    if (obtainStyledAttributes.hasValue(12)) {
                        cVar.d = obtainStyledAttributes.getColor(12, cVar.d);
                        break;
                    }
                    break;
                default:
                    bVar = bVar.b(obtainStyledAttributes);
                    break;
            }
            a(bVar.a());
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(c cVar) {
        boolean z;
        e eVar = this.b;
        eVar.f = cVar;
        if (cVar != null) {
            eVar.b.setXfermode(new PorterDuffXfermode(eVar.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        eVar.b();
        if (eVar.f != null) {
            ValueAnimator valueAnimator = eVar.e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                eVar.e.cancel();
                eVar.e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            c cVar2 = eVar.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (cVar2.t / cVar2.s) + 1.0f);
            eVar.e = ofFloat;
            ofFloat.setRepeatMode(eVar.f.r);
            eVar.e.setRepeatCount(eVar.f.q);
            ValueAnimator valueAnimator2 = eVar.e;
            c cVar3 = eVar.f;
            valueAnimator2.setDuration(cVar3.s + cVar3.t);
            eVar.e.addUpdateListener(eVar.a);
            if (z) {
                eVar.e.start();
            }
        }
        eVar.invalidateSelf();
        if (cVar == null || !cVar.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.b;
        ValueAnimator valueAnimator = eVar.e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        eVar.e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
