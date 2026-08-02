package com.vk.core.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.epx;

/* compiled from: FrameLayoutWithTouchInterceptor.kt */
/* loaded from: classes.dex */
public final class FrameLayoutWithTouchInterceptor extends FrameLayout {
    public boolean b;
    public View.OnTouchListener c;
    public MotionEvent d;
    public boolean e;
    public final float f;

    public FrameLayoutWithTouchInterceptor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = true;
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final View.OnTouchListener getOnInterceptTouchEventListener() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (xsna.epx.d(r0 != null ? java.lang.Float.valueOf(r0.getY()) : null, r6.getY()) == false) goto L31;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
                this.e = true;
            }
            return false;
        }
        if (this.b) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = MotionEvent.obtain(motionEvent);
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        MotionEvent motionEvent2 = this.d;
        if (motionEvent2 != null) {
            if (epx.d(motionEvent2 != null ? Float.valueOf(motionEvent2.getX()) : null, motionEvent.getX())) {
                MotionEvent motionEvent3 = this.d;
            }
            float x = motionEvent.getX();
            MotionEvent motionEvent4 = this.d;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float abs = Math.abs(x - (motionEvent4 != null ? motionEvent4.getX() : 0.0f));
            float f2 = this.f;
            if (abs <= f2) {
                float y = motionEvent.getY();
                MotionEvent motionEvent5 = this.d;
                if (motionEvent5 != null) {
                    f = motionEvent5.getY();
                }
                if (Math.abs(y - f) <= f2) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            return false;
        }
        if (this.b) {
            return true;
        }
        MotionEvent motionEvent2 = this.d;
        if (motionEvent2 == null) {
            View.OnTouchListener onTouchListener = this.c;
            if (onTouchListener != null) {
                return onTouchListener.onTouch(this, motionEvent);
            }
            return false;
        }
        View.OnTouchListener onTouchListener2 = this.c;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(this, motionEvent2);
        }
        View.OnTouchListener onTouchListener3 = this.c;
        boolean onTouch = onTouchListener3 != null ? onTouchListener3.onTouch(this, motionEvent) : false;
        if (!onTouch) {
            this.e = false;
            dispatchTouchEvent(motionEvent2);
            onTouch |= dispatchTouchEvent(motionEvent);
            this.e = !onTouch;
        }
        motionEvent2.recycle();
        this.d = null;
        return onTouch;
    }

    public final void setDisableTouch(boolean z) {
        this.b = z;
    }

    public final void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }
}
