package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.iah0;

/* compiled from: DownloadsLayoutManager.kt */
/* loaded from: classes16.dex */
public final class DownloadsLayoutManager extends LinearLayoutManager {
    public final void P(RecyclerView.p pVar) {
        ((ViewGroup.MarginLayoutParams) pVar).width = (int) ((((getWidth() - getPaddingStart()) - getPaddingEnd()) - iah0.a(8)) * (getItemCount() > 1 ? 0.85f : 1.0f));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        RecyclerView.p generateDefaultLayoutParams = super.generateDefaultLayoutParams();
        P(generateDefaultLayoutParams);
        return generateDefaultLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        RecyclerView.p generateLayoutParams = super.generateLayoutParams(context, attributeSet);
        P(generateLayoutParams);
        return generateLayoutParams;
    }
}
