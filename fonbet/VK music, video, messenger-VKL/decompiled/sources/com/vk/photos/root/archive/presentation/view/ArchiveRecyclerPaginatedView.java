package com.vk.photos.root.archive.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.bga0;
import xsna.bwt0;
import xsna.ee;

/* compiled from: ArchiveRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class ArchiveRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public ArchiveRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        removeView(this.d);
        addView(this.d);
        removeView(this.c);
        addView(this.c);
        this.e.setVisibility(0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return bwt0.I(R.layout.photo_archive_empty_view, this, false);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new bga0(context, attributeSet, 4);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void e0() {
    }
}
