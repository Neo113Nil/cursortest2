package com.vk.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import xsna.gv2;

/* compiled from: VKViewPager.kt */
/* loaded from: classes17.dex */
public final class VKViewPager extends ViewPager {
    public static final /* synthetic */ int c = 0;
    public boolean b;

    public VKViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    public final boolean getSupportSwipe() {
        return this.b;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i - getPageMargin(), i2, i3 - getPageMargin(), i4);
        getHandler().post(new gv2(this, 17));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setSupportSwipe(boolean z) {
        this.b = z;
    }
}
