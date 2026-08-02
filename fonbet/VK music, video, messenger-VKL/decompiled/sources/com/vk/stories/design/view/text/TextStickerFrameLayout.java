package com.vk.stories.design.view.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.iah0;

/* compiled from: TextStickerFrameLayout.kt */
/* loaded from: classes6.dex */
public final class TextStickerFrameLayout extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener, GestureDetector.OnGestureListener {
    public static final int h = iah0.a(30);
    public static final int i = iah0.a(60);
    public a b;
    public b c;
    public final ScaleGestureDetector d;
    public final GestureDetector e;
    public float f;
    public float g;

    /* compiled from: TextStickerFrameLayout.kt */
    public interface a {
        void a(float f);
    }

    /* compiled from: TextStickerFrameLayout.kt */
    public interface b {
        boolean a();

        boolean b();
    }

    public TextStickerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ScaleGestureDetector(getContext(), this);
        this.e = new GestureDetector(getContext(), this);
    }

    public final a getOnScaleListener() {
        return this.b;
    }

    public final b getOnSwipeListener() {
        return this.c;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(x) <= Math.abs(y) || Math.abs(x) <= i || Math.abs(f) <= 80.0f) {
            return false;
        }
        if (x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            b bVar = this.c;
            if (bVar != null) {
                return bVar.a();
            }
            return false;
        }
        b bVar2 = this.c;
        if (bVar2 != null) {
            return bVar2.b();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.d.onTouchEvent(motionEvent);
        this.e.onTouchEvent(motionEvent);
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && motionEvent.getPointerCount() == 1) {
            this.f = motionEvent.getX();
            this.g = motionEvent.getY();
        }
        boolean z = motionEvent.getPointerCount() > 1;
        if (motionEvent.getActionMasked() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f);
            float abs2 = Math.abs(motionEvent.getY() - this.g);
            if (abs >= h && abs / 2 > abs2) {
                z = true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent) || z;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a aVar = this.b;
        if (aVar == null) {
            return true;
        }
        aVar.a(scaleGestureDetector.getScaleFactor());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || this.d.onTouchEvent(motionEvent) || this.e.onTouchEvent(motionEvent);
    }

    public final void setOnScaleListener(a aVar) {
        this.b = aVar;
    }

    public final void setOnSwipeListener(b bVar) {
        this.c = bVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
