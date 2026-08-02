package com.vk.photoviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import xsna.bv9;
import xsna.izs;
import xsna.s6x;

/* compiled from: PhotoViewPager.kt */
/* loaded from: classes3.dex */
public final class PhotoViewPager extends ViewPager {
    public static final /* synthetic */ int c = 0;
    public izs<? super Integer, Boolean> b;

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new s6x(17);
    }

    public final izs<Integer, Boolean> getPagingEnabled() {
        return this.b;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.b.invoke(Integer.valueOf(getCurrentItem())).booleanValue()) {
            return false;
        }
        try {
            z = super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return z;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i - getPageMargin(), i2, i3 - getPageMargin(), i4);
        getHandler().post(new bv9(this, 8));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.b.invoke(Integer.valueOf(getCurrentItem())).booleanValue()) {
            return false;
        }
        try {
            z = super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return z;
    }

    public final void setPagingEnabled(izs<? super Integer, Boolean> izsVar) {
        this.b = izsVar;
    }
}
