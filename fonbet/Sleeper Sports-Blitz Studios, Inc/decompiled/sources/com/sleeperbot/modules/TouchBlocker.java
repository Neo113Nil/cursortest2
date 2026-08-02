package com.sleeperbot.modules;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public class TouchBlocker extends ViewGroup {
    public static final String TAG = "TouchBlocker";
    private boolean blockAllTouch;
    private boolean blockHorizontalInteraction;
    private boolean blockVerticalInteraction;
    boolean isLastEventIntercepted;
    int lastEvent;
    private float lastX;
    private float lastY;
    private float xDistance;
    private float yDistance;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setBlockAllTouch(boolean z) {
        this.blockAllTouch = z;
    }

    public void setBlockVerticalInteraction(boolean z) {
        this.blockVerticalInteraction = z;
    }

    public void setBlockHorizontalInteraction(boolean z) {
        this.blockHorizontalInteraction = z;
    }

    public TouchBlocker(Context context) {
        super(context);
        this.blockAllTouch = false;
        this.blockVerticalInteraction = false;
        this.blockHorizontalInteraction = false;
        this.lastEvent = -1;
        this.isLastEventIntercepted = false;
        setTag(TAG);
    }

    public TouchBlocker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.blockAllTouch = false;
        this.blockVerticalInteraction = false;
        this.blockHorizontalInteraction = false;
        this.lastEvent = -1;
        this.isLastEventIntercepted = false;
        setTag(TAG);
    }

    public TouchBlocker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.blockAllTouch = false;
        this.blockVerticalInteraction = false;
        this.blockHorizontalInteraction = false;
        this.lastEvent = -1;
        this.isLastEventIntercepted = false;
        setTag(TAG);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.blockAllTouch) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (this.blockVerticalInteraction || this.blockHorizontalInteraction) {
            int action = motionEvent.getAction();
            float f = 0.0f;
            if (action == 0) {
                this.yDistance = 0.0f;
                this.xDistance = 0.0f;
                this.lastX = motionEvent.getX();
                this.lastY = motionEvent.getY();
            } else if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.xDistance += Math.abs(x - this.lastX);
                float abs = this.yDistance + Math.abs(y - this.lastY);
                this.yDistance = abs;
                this.lastX = x;
                this.lastY = y;
                if (this.isLastEventIntercepted && this.lastEvent == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                if (this.blockVerticalInteraction) {
                    abs = this.xDistance;
                    f = abs;
                } else if (this.blockHorizontalInteraction) {
                    f = this.xDistance;
                } else {
                    abs = 0.0f;
                }
                if (f > abs) {
                    this.isLastEventIntercepted = true;
                    this.lastEvent = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
            }
            this.lastEvent = motionEvent.getAction();
            this.isLastEventIntercepted = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean isAtTop() {
        return getChildAt(0).getScrollY() == 0;
    }
}
