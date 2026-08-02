package com.vk.catalog2.feature.music.holders.search;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.movika.tools.controls.seekbar.p;
import xsna.b5a;
import xsna.cfp0;
import xsna.jp5;
import xsna.mba;
import xsna.yi4;

/* compiled from: SearchHistoryVideoVh.kt */
/* loaded from: classes16.dex */
public final class SearchHistoryVideoVh extends SearchHistoryItemVh {
    public final b5a g;
    public final p h;
    public final yi4 i;

    public SearchHistoryVideoVh(Context context, mba mbaVar, b5a b5aVar, p pVar, yi4 yi4Var) {
        super(context, mbaVar);
        this.g = b5aVar;
        this.h = pVar;
        this.i = yi4Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryVideo) {
            this.d = (UIBlockSearchHistory) uIBlock;
            g(new jp5(23, this, ((UIBlockSearchHistory.UIBlockSearchHistoryVideo) uIBlock).A));
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void a(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        this.i.invoke(context, this.g, (UIBlockSearchHistory.UIBlockSearchHistoryVideo) uIBlockSearchHistory);
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void b(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        UIBlockSearchHistory.UIBlockSearchHistoryVideo uIBlockSearchHistoryVideo = uIBlockSearchHistory instanceof UIBlockSearchHistory.UIBlockSearchHistoryVideo ? (UIBlockSearchHistory.UIBlockSearchHistoryVideo) uIBlockSearchHistory : null;
        if (uIBlockSearchHistoryVideo == null) {
            return;
        }
        this.g.a(new cfp0(uIBlockSearchHistoryVideo, new VideoAnalyticsInfo(VideoAnalyticsInfo.ClickTarget.Open)));
        this.h.invoke(context, uIBlockSearchHistoryVideo);
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void d(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
    }
}
