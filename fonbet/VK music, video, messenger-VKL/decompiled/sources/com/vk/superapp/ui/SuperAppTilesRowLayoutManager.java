package com.vk.superapp.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vungle.ads.internal.protos.Sdk;
import xsna.iah0;
import xsna.ncn0;
import xsna.y8n0;

/* compiled from: SuperAppTilesRowLayoutManager.kt */
/* loaded from: classes6.dex */
public final class SuperAppTilesRowLayoutManager extends RecyclerView.o {
    public static final int f = iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
    public static final int g = iah0.a(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
    public final int b;
    public final ncn0.a c;
    public boolean d;
    public int e = 2;

    public SuperAppTilesRowLayoutManager(int i, ncn0.a aVar) {
        this.b = i;
        this.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean isAutoMeasureEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeAndRecycleAllViews(vVar);
        vVar.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        detachAndScrapAttachedViews(vVar);
        int i = 12 / this.e;
        int b = a0Var.b();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            View f2 = vVar.f(i4);
            addView(f2);
            int d = vVar.d(i4);
            if (d == -1) {
                d = i4;
            }
            boolean z = this.c.c.c(d) instanceof y8n0;
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int i5 = width / 12;
            int i6 = i5 * i;
            int i7 = this.b;
            int i8 = i7 * 2;
            measureChildWithMargins(f2, (width - i6) + i8, 0);
            int measuredHeight = f2.getMeasuredHeight() + i8;
            if (!z) {
                i3 = 0;
            }
            int i9 = i3 * measuredHeight;
            int paddingLeft = (i5 * i2) + getPaddingLeft();
            int i10 = i6 + paddingLeft;
            int i11 = measuredHeight + i9;
            i3 = (!z || this.d) ? 0 : (i3 + 1) % 2;
            if (i3 == 0) {
                i2 += i;
            }
            if (f2.getLayoutParams() instanceof RecyclerView.p) {
                layoutDecorated(f2, paddingLeft + i7, i9 + i7, i10 - i7, i11 - i7);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onMeasure(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.b * 2) + (this.d ? g : f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
    }
}
