package com.vk.fave.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.common.views.fave.FavesEmptyListView;

/* compiled from: FavesSearchPaginatedView.kt */
/* loaded from: classes18.dex */
public final class FavesSearchPaginatedView extends RecyclerPaginatedView {
    public FavesSearchPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        FavesEmptyListView favesEmptyListView = new FavesEmptyListView(context, attributeSet);
        favesEmptyListView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        return favesEmptyListView;
    }
}
