package com.vk.im.ui.components.bot_actions.bot_snackbar_action;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: WrapContentRecyclerView.kt */
/* loaded from: classes2.dex */
public final class WrapContentRecyclerView extends RecyclerView {
    public boolean b;

    /* compiled from: WrapContentRecyclerView.kt */
    public static final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            WrapContentRecyclerView.this.b = true;
        }
    }

    /* compiled from: WrapContentRecyclerView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            WrapContentRecyclerView wrapContentRecyclerView = (WrapContentRecyclerView) this.receiver;
            if (wrapContentRecyclerView.b) {
                wrapContentRecyclerView.b = false;
                wrapContentRecyclerView.requestLayout();
            }
            return s3q0.a;
        }
    }

    public WrapContentRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setItemAnimator(new g());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        int height = childAt != null ? childAt.getHeight() : 0;
        if (!this.b || height <= 0) {
            return;
        }
        int measuredHeight = getMeasuredHeight() + height;
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(RecyclerView.l lVar) {
        super.setItemAnimator(lVar != null ? new p(lVar, new b(0, this, WrapContentRecyclerView.class, "onAnimationFinished", "onAnimationFinished()V", 0)) : null);
    }
}
