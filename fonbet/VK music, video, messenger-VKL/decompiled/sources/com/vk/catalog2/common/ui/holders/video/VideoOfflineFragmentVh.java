package com.vk.catalog2.common.ui.holders.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;
import xsna.zt70;

/* compiled from: VideoOfflineFragmentVh.kt */
/* loaded from: classes16.dex */
public final class VideoOfflineFragmentVh extends ErrorStateVh {
    public FragmentContainerView f;

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.f = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh
    public final void b(Throwable th) {
        if (BuildInfo.s()) {
            boolean z = th instanceof VideoPinnedSectionOfflineException;
            FragmentContainerView fragmentContainerView = this.f;
            Object fragment = fragmentContainerView != null ? fragmentContainerView.getFragment() : null;
            zt70 zt70Var = fragment instanceof zt70 ? (zt70) fragment : null;
            if (zt70Var != null) {
                zt70Var.ia(!z);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_video_offline_fragment, viewGroup, false);
        this.f = (FragmentContainerView) inflate.findViewById(R.id.offline_fragment);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }
}
