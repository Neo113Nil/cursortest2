package com.vk.lists;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;

/* loaded from: classes3.dex */
public class CustomSwipeRefreshLayout extends SwipeDrawableRefreshLayout {
    public final int m0;
    public float n0;
    public boolean o0;

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.n0 = motionEvent.getX();
            this.o0 = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.n0);
            if (this.o0 || abs > this.m0) {
                this.o0 = true;
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
