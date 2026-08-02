package com.vk.dialogslist.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import xsna.bpn0;
import xsna.ipq0;
import xsna.rww;
import xsna.s3q0;
import xsna.wjf0;

/* compiled from: ViewPager2NestedRecyclerView.kt */
/* loaded from: classes18.dex */
public final class ViewPager2NestedRecyclerView extends RecyclerView {
    public static final /* synthetic */ int c = 0;
    public final bpn0 b;

    public ViewPager2NestedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new bpn0(new ipq0(this, 10));
    }

    public static s3q0 a(ViewPager2NestedRecyclerView viewPager2NestedRecyclerView, boolean z) {
        RecyclerView pagerRV = viewPager2NestedRecyclerView.getPagerRV();
        if (pagerRV != null) {
            pagerRV.suppressLayout(z);
        }
        return s3q0.a;
    }

    private final RecyclerView getPagerRV() {
        return (RecyclerView) this.b.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        getParent().requestDisallowInterceptTouchEvent(onInterceptTouchEvent);
        RecyclerView pagerRV = getPagerRV();
        if (pagerRV != null) {
            wjf0.c(pagerRV, new rww(this, onInterceptTouchEvent, 1));
        }
        return onInterceptTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            RecyclerView pagerRV = getPagerRV();
            if (pagerRV != null) {
                wjf0.c(pagerRV, new rww(this, false, 1));
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
