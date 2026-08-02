package com.vk.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: FrameLayoutWithInterceptTouchEvent.kt */
/* loaded from: classes17.dex */
public final class FrameLayoutWithInterceptTouchEvent extends FrameLayout {
    public View.OnTouchListener b;

    public FrameLayoutWithInterceptTouchEvent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final View.OnTouchListener getInterceptTouchEventListener() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.b;
        return (onTouchListener != null ? onTouchListener.onTouch(this, motionEvent) : false) || super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.b = onTouchListener;
    }
}
