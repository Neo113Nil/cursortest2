package com.vk.photos.root.photoflow.tags.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.ee;
import xsna.u1o0;

/* compiled from: TagsRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class TagsRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public TagsRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return bwt0.I(R.layout.photo_tags_empty_view, this, false);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new u1o0(context, attributeSet);
    }
}
