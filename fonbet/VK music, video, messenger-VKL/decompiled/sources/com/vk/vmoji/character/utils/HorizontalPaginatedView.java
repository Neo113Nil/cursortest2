package com.vk.vmoji.character.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;

/* compiled from: HorizontalPaginatedView.kt */
/* loaded from: classes7.dex */
public final class HorizontalPaginatedView extends RecyclerPaginatedView {

    /* compiled from: HorizontalPaginatedView.kt */
    public static final class a extends AbstractPaginatedView.h {
    }

    public HorizontalPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        this.x = new NestedScrollableRecyclerView(context, attributeSet);
        this.w = new a();
        return this.x;
    }
}
