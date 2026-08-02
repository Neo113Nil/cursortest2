package com.vk.music.player.presentation.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: SwipeBlockingViewPager.kt */
/* loaded from: classes3.dex */
public final class SwipeBlockingViewPager extends ViewPager {
    public boolean b;

    public SwipeBlockingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.b && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.b && super.onTouchEvent(motionEvent);
    }

    public final void setSwipeEnabled(boolean z) {
        this.b = z;
    }
}
