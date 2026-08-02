package com.vk.catalog2.common.ui.mvp.holder.music;

import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.tba;
import xsna.u4a;
import xsna.xp40;

/* compiled from: MusicOfflineVerticalListVh.kt */
/* loaded from: classes16.dex */
public final class MusicOfflineVerticalListVh extends VerticalListVh {
    public final MobileOfficialAppsCoreNavStat$EventScreen G;
    public final boolean H;

    public MusicOfflineVerticalListVh(xp40 xp40Var, c.h hVar, tba tbaVar, u4a u4aVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z) {
        super(xp40Var, hVar, tbaVar, u4aVar, null, false, 0, null, VideoRecord.DEFAULT_MAX_DIMENSION);
        this.G = mobileOfficialAppsCoreNavStat$EventScreen;
        this.H = z;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final void o(RecyclerPaginatedView recyclerPaginatedView) {
        super.o(recyclerPaginatedView);
        if (this.H) {
            return;
        }
        recyclerPaginatedView.setFooterLoadingViewProvider(null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        super.y(uiTrackingScreen);
        uiTrackingScreen.a = this.G;
    }
}
