package com.zoho.livechat.android.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes4.dex */
public class CustomViewPager extends ViewPager {

    /* renamed from: Q4, reason: collision with root package name */
    public boolean f44318Q4;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44318Q4 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f44318Q4 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f44318Q4 && super.onTouchEvent(motionEvent);
    }

    public void setPagingEnabled(boolean z10) {
        this.f44318Q4 = z10;
    }
}
