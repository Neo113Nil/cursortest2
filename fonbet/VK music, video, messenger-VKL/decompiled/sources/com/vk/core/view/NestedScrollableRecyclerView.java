package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import xsna.ozl;

/* compiled from: NestedScrollableRecyclerView.kt */
@ozl
/* loaded from: classes17.dex */
public final class NestedScrollableRecyclerView extends RecyclerView {
    public float b;
    public float c;

    public NestedScrollableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 != 3) goto L51;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    RecyclerView.o layoutManager = getLayoutManager();
                    if (layoutManager != null && (!layoutManager.canScrollVertically() ? !(Math.abs(this.c - y) / 2 <= Math.abs(this.b - x) && ((x <= this.b || computeHorizontalScrollOffset() != 0) && (this.b <= x || computeHorizontalScrollOffset() <= computeHorizontalScrollRange() - getWidth()))) : !(Math.abs(this.b - x) / 2 <= Math.abs(this.c - y) && ((y <= this.c || computeVerticalScrollOffset() != 0) && (this.c <= y || computeVerticalScrollOffset() <= computeVerticalScrollRange() - getHeight()))))) {
                        z = true;
                    }
                    getParent().requestDisallowInterceptTouchEvent(!z);
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            RecyclerView.o layoutManager2 = getLayoutManager();
            if (layoutManager2 != null) {
                if (layoutManager2.canScrollVertically()) {
                }
            }
            getParent().requestDisallowInterceptTouchEvent(z);
        }
        this.b = motionEvent.getX();
        this.c = motionEvent.getY();
        return super.onInterceptTouchEvent(motionEvent);
    }
}
