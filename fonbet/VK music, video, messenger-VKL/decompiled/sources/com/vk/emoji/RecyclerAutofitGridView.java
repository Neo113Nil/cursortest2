package com.vk.emoji;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerAutofitGridView.kt */
/* loaded from: classes18.dex */
public final class RecyclerAutofitGridView extends RecyclerView {
    public final GridLayoutManager b;

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(5);
        this.b = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
    }

    public final void setDefaultColumns(int i) {
        this.b.setSpanCount(i);
        requestLayout();
    }

    public final void setSpanSizeLookup(GridLayoutManager.c cVar) {
        this.b.x = cVar;
    }
}
