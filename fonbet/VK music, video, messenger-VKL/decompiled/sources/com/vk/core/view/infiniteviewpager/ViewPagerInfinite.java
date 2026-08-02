package com.vk.core.view.infiniteviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;
import com.vk.libuilight.R$styleable;
import xsna.lzt0;
import xsna.tj60;
import xsna.x160;

/* loaded from: classes17.dex */
public class ViewPagerInfinite extends lzt0 implements Runnable, AbsListView.OnScrollListener {
    public final int d;
    public final int e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public final x160 j;

    public ViewPagerInfinite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.i = 0;
        this.j = new x160(this, new tj60(this, 20));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f);
        if (obtainStyledAttributes != null) {
            this.d = obtainStyledAttributes.getInteger(0, 0);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            obtainStyledAttributes.recycle();
        }
        setPageMargin(this.e);
        addOnPageChangeListener(new a());
    }

    public final void b() {
        if (this.d > 0 && this.i == 0 && this.h == 0 && this.g) {
            removeCallbacks(this);
            postDelayed(this, r0 * 1000);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
        b();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f = false;
        super.onDetachedFromWindow();
        removeCallbacks(this);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.j.b(motionEvent);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.i = i;
        if (i == 0) {
            b();
        } else {
            removeCallbacks(this);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getAdapter() == null || getCurrentItem() + 1 < getAdapter().getCount()) {
            setCurrentItem(getCurrentItem() + 1, false);
            setCurrentItem(getCurrentItem() - 1, false);
        } else {
            setCurrentItem(getCurrentItem() - 1, false);
            setCurrentItem(getCurrentItem() + 1, false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            setCurrentItem(getCurrentItem() + 1, true);
            b();
        }
    }

    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            ViewPagerInfinite viewPagerInfinite = ViewPagerInfinite.this;
            viewPagerInfinite.h = i;
            if (i == 0) {
                viewPagerInfinite.b();
            } else {
                viewPagerInfinite.removeCallbacks(viewPagerInfinite);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
