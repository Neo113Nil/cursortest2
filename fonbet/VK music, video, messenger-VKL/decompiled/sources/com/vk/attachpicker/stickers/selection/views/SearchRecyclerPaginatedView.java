package com.vk.attachpicker.stickers.selection.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.ee;
import xsna.tqh0;

/* compiled from: SearchRecyclerPaginatedView.kt */
/* loaded from: classes15.dex */
public final class SearchRecyclerPaginatedView extends RecyclerPaginatedView {
    public SearchRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return bwt0.I(R.layout.search_empty_view, this, false);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new tqh0(context, attributeSet, 0);
    }
}
