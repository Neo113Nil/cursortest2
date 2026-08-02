package com.vk.superapp.browser.internal.ui.menu.action;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.an10;

/* compiled from: DefaultWidthSpreaderLayoutManager.kt */
/* loaded from: classes6.dex */
public final class DefaultWidthSpreaderLayoutManager extends LinearLayoutManager {
    public final void P(RecyclerView.p pVar) {
        int i = this.b;
        if (i == 0) {
            ((ViewGroup.MarginLayoutParams) pVar).width = an10.a(((getWidth() - getPaddingRight()) - getPaddingLeft()) / getItemCount());
        } else if (i == 1) {
            ((ViewGroup.MarginLayoutParams) pVar).height = an10.a(((getHeight() - getPaddingBottom()) - getPaddingTop()) / getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        RecyclerView.p generateDefaultLayoutParams = super.generateDefaultLayoutParams();
        P(generateDefaultLayoutParams);
        return generateDefaultLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        RecyclerView.p generateLayoutParams = super.generateLayoutParams(layoutParams);
        P(generateLayoutParams);
        return generateLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        RecyclerView.p generateLayoutParams = super.generateLayoutParams(context, attributeSet);
        P(generateLayoutParams);
        return generateLayoutParams;
    }
}
