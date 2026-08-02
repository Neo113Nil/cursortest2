package com.vk.photos.root.photoflow.settings.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.bga0;
import xsna.bwt0;
import xsna.ee;
import xsna.qcy;

/* compiled from: PhotoFlowSettingsRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class PhotoFlowSettingsRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public PhotoFlowSettingsRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.albums_empty_view_owner, (ViewGroup) this, false);
        ((TextView) inflate.findViewById(R.id.text)).setText(R.string.no_albums_in_photo_flow_settings_dialog);
        return inflate;
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        bga0 bga0Var = new bga0(context, attributeSet, 4);
        bga0Var.setErrorText(context.getString(R.string.albums_loading_error));
        return bga0Var;
    }
}
