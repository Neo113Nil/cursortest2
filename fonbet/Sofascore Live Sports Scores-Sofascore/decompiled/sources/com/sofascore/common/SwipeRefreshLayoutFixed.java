package com.sofascore.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class SwipeRefreshLayoutFixed extends SwipeRefreshLayout {
    public final int N;
    public float O;

    public SwipeRefreshLayoutFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final boolean a() {
        View childAt = getChildAt(0);
        if (!(childAt instanceof ViewGroup)) {
            return childAt.canScrollVertically(-1);
        }
        ViewGroup viewGroup = (ViewGroup) childAt;
        if (viewGroup instanceof AbsListView) {
            return viewGroup.canScrollVertically(-1);
        }
        if (viewGroup instanceof ScrollView) {
            return viewGroup.canScrollVertically(-1);
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).canScrollVertically(-1)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.O = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.O) > this.N * 2) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
