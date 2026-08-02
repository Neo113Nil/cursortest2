package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CarouselLayoutManager.kt */
/* loaded from: classes2.dex */
public final class CarouselLayoutManager extends LinearLayoutManager {
    public boolean r;

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        if (this.r) {
            recyclerView.requestLayout();
            this.r = false;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        this.r = true;
    }
}
