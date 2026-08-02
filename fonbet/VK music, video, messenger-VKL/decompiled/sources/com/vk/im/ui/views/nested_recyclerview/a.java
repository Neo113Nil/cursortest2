package com.vk.im.ui.views.nested_recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer;
import xsna.s160;

/* compiled from: NestedVerticalRecyclerViewContainer.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.t {
    public final /* synthetic */ NestedVerticalRecyclerViewContainer b;

    public a(NestedVerticalRecyclerViewContainer nestedVerticalRecyclerViewContainer) {
        this.b = nestedVerticalRecyclerViewContainer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        NestedVerticalRecyclerViewContainer nestedVerticalRecyclerViewContainer = this.b;
        s160 s160Var = nestedVerticalRecyclerViewContainer.c;
        if (i == 0) {
            if (s160Var.f(0)) {
                nestedVerticalRecyclerViewContainer.stopNestedScroll(0);
            }
            if (s160Var.f(1)) {
                nestedVerticalRecyclerViewContainer.stopNestedScroll(1);
            }
        }
        NestedVerticalRecyclerViewContainer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        NestedVerticalRecyclerViewContainer.b b = NestedVerticalRecyclerViewContainer.b(recyclerView);
        if (b != null) {
            b.L();
        }
    }
}
