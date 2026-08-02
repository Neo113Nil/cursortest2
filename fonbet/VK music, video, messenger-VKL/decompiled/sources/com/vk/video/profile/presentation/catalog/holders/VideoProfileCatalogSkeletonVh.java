package com.vk.video.profile.presentation.catalog.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.video.profile.presentation.views.VideoProfileCatalogSkeletonView;

/* compiled from: VideoProfileCatalogSkeletonVh.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCatalogSkeletonVh extends ProgressVh {
    public VideoProfileCatalogSkeletonVh() {
        super((Object) null);
    }

    @Override // com.vk.catalog2.common.ui.holders.ProgressVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoProfileCatalogSkeletonView videoProfileCatalogSkeletonView = new VideoProfileCatalogSkeletonView(layoutInflater.getContext(), null, 6);
        this.c = videoProfileCatalogSkeletonView;
        return videoProfileCatalogSkeletonView;
    }
}
