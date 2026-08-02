package com.vk.photoviewer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import xsna.atf0;
import xsna.m33;
import xsna.s3q0;
import xsna.swe0;
import xsna.wzs;

/* compiled from: PickPositionOverlayView.kt */
/* loaded from: classes3.dex */
public final class PickPositionOverlayView extends View {
    public PhotoViewer.d b;
    public wzs<? super Float, ? super Float, s3q0> c;
    public final RectF d;
    public float e;
    public float f;
    public atf0 g;
    public boolean h;
    public final Drawable i;

    public PickPositionOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = new RectF(-1.0f, -1.0f, -1.0f, -1.0f);
        this.e = -1.0f;
        this.f = -1.0f;
        Drawable a = m33.a(R.drawable.position_marker, context);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.i = a;
        a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
    }

    public final void a(float f, float f2) {
        RectF rectF = this.d;
        float f3 = rectF.left;
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.e = swe0.f(f - f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.width());
        this.f = swe0.f(f2 - rectF.top, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.height());
        invalidate();
        wzs<? super Float, ? super Float, s3q0> wzsVar = this.c;
        if (wzsVar != null) {
            wzsVar.invoke(Float.valueOf(getMarkerXAsFraction()), Float.valueOf(getMarkerYAsFraction()));
        }
    }

    public final PhotoViewer.d getDisplayRectProvider() {
        return this.b;
    }

    public final wzs<Float, Float, s3q0> getMarkerFractionPositionListener() {
        return this.c;
    }

    public final float getMarkerXAsFraction() {
        if (this.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return -1.0f;
        }
        RectF rectF = this.d;
        if (rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this.e / rectF.width();
        }
        return -1.0f;
    }

    public final float getMarkerYAsFraction() {
        if (this.f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return -1.0f;
        }
        RectF rectF = this.d;
        if (rectF.height() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this.f / rectF.height();
        }
        return -1.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.d;
        if (rectF.left < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.save();
        Drawable drawable = this.i;
        canvas.translate((rectF.left + this.e) - (drawable.getBounds().width() / 2), (rectF.top + this.f) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF a;
        super.onLayout(z, i, i2, i3, i4);
        PhotoViewer.d dVar = this.b;
        if (dVar != null && (a = dVar.a()) != null) {
            this.d.set(a);
        }
        atf0 atf0Var = this.g;
        if (atf0Var != null) {
            setRelativePoint(atf0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r0 != 3) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.h) {
                        a(motionEvent.getX(), motionEvent.getY());
                        return true;
                    }
                }
            }
            if (this.h) {
                this.h = false;
                return true;
            }
        } else {
            if (this.d.contains(motionEvent.getX(), motionEvent.getY())) {
                a(motionEvent.getX(), motionEvent.getY());
                this.h = true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }

    public final void setDisplayRectProvider(PhotoViewer.d dVar) {
        this.b = dVar;
    }

    public final void setMarkerFractionPositionListener(wzs<? super Float, ? super Float, s3q0> wzsVar) {
        this.c = wzsVar;
    }

    public final void setRelativePoint(atf0 atf0Var) {
        RectF rectF = this.d;
        if (rectF.left < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.g = atf0Var;
            return;
        }
        this.g = null;
        this.e = swe0.f(rectF.width() * atf0Var.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.width());
        this.f = swe0.f(rectF.height() * atf0Var.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.height());
        invalidate();
        wzs<? super Float, ? super Float, s3q0> wzsVar = this.c;
        if (wzsVar != null) {
            wzsVar.invoke(Float.valueOf(getMarkerXAsFraction()), Float.valueOf(getMarkerYAsFraction()));
        }
    }
}
