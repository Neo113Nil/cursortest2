package com.vk.superapp.holders;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import xsna.cn70;
import xsna.fnj;
import xsna.iah0;

/* compiled from: TileScrollLayoutManager.kt */
/* loaded from: classes6.dex */
public final class TileScrollLayoutManager extends LinearLayoutManager {
    public static final int s = cn70.b(144);
    public final Rect r;

    public TileScrollLayoutManager(Context context) {
        super(0, false);
        this.r = new Rect();
    }

    public static boolean P(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.r);
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        int width = (int) (getWidth() / ((fnj.d(context) || iah0.r(view.getContext())) ? 4.4d : 2.3d));
        int i3 = s;
        if (width < i3) {
            width = i3;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        int childMeasureSpec = RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
        if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && P(view.getWidth(), makeMeasureSpec, ((ViewGroup.MarginLayoutParams) pVar).width) && P(view.getHeight(), childMeasureSpec, ((ViewGroup.MarginLayoutParams) pVar).height)) {
            return;
        }
        view.measure(makeMeasureSpec, childMeasureSpec);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        recyclerView.requestLayout();
    }
}
