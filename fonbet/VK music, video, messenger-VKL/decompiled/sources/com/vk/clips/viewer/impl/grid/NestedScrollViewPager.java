package com.vk.clips.viewer.impl.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import xsna.o160;
import xsna.x160;

/* compiled from: NestedScrollViewPager.kt */
/* loaded from: classes17.dex */
public final class NestedScrollViewPager extends ViewPager {
    public final x160 b;

    public NestedScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new x160(this, new o160(this));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.b.b(motionEvent);
    }
}
