package com.vk.photos.root.albumssettings.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.bga0;
import xsna.bwt0;
import xsna.ee;

/* compiled from: AlbumsSettingsRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class AlbumsSettingsRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public AlbumsSettingsRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return bwt0.I(R.layout.albums_empty_view_owner, this, false);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        bga0 bga0Var = new bga0(context, attributeSet, 4);
        bga0Var.setErrorText(context.getString(R.string.albums_loading_error));
        return bga0Var;
    }
}
