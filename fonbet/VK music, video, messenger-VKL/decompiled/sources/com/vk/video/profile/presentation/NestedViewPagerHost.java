package com.vk.video.profile.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import xsna.awt0;
import xsna.y160;

/* compiled from: NestedViewPagerHost.kt */
/* loaded from: classes6.dex */
public final class NestedViewPagerHost extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final int b;
    public float c;
    public float d;

    public NestedViewPagerHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getInnerViewPager() {
        return awt0.l(this, new y160(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewPager2 getParentViewPager() {
        View view;
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null && !(view instanceof ViewPager2)) {
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            if (view instanceof ViewPager2) {
                return (ViewPager2) view;
            }
            return null;
        }
        view = null;
    }

    public final boolean a(float f, int i) {
        int i2 = -((int) Math.signum(f));
        if (i == 0) {
            View innerViewPager = getInnerViewPager();
            if (innerViewPager != null) {
                return innerViewPager.canScrollHorizontally(i2);
            }
            return false;
        }
        if (i != 1) {
            throw new IllegalArgumentException();
        }
        View innerViewPager2 = getInnerViewPager();
        if (innerViewPager2 != null) {
            return innerViewPager2.canScrollVertically(i2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            if (a(-1.0f, orientation) || a(1.0f, orientation)) {
                if (motionEvent.getAction() == 0) {
                    this.c = motionEvent.getX();
                    this.d = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.c;
                    float y = motionEvent.getY() - this.d;
                    boolean z = orientation == 0;
                    float abs = Math.abs(x) * (z ? 0.5f : 1.0f);
                    float abs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
                    float f = this.b;
                    if (abs > f || abs2 > f) {
                        if (z == (abs2 > abs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (!z) {
                                x = y;
                            }
                            if (a(x, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
