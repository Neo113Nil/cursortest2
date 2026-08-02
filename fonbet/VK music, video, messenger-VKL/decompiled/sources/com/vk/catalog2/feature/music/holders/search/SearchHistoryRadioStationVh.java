package com.vk.catalog2.feature.music.holders.search;

import android.content.Context;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.music.MusicTrack;
import kotlin.NoWhenBranchMatchedException;
import xsna.b5a;
import xsna.cfp0;
import xsna.fo6;
import xsna.mba;
import xsna.qwp0;
import xsna.u2b0;
import xsna.vp4;

/* compiled from: SearchHistoryRadioStationVh.kt */
/* loaded from: classes16.dex */
public final class SearchHistoryRadioStationVh extends SearchHistoryPlayableItemVh {
    public final Context k;
    public final b5a l;
    public final vp4 m;

    public SearchHistoryRadioStationVh(Context context, mba mbaVar, u2b0 u2b0Var, b5a b5aVar, vp4 vp4Var) {
        super(context, mbaVar, u2b0Var);
        this.k = context;
        this.l = b5aVar;
        this.m = vp4Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) {
            this.d = (UIBlockSearchHistory) uIBlock;
            g(new fo6(23, ((UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) uIBlock).B, this));
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void a(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        MusicAnalyticsInfo.ClickTarget clickTarget;
        UIBlockSearchHistory.UIBlockSearchHistoryRadioStation uIBlockSearchHistoryRadioStation = uIBlockSearchHistory instanceof UIBlockSearchHistory.UIBlockSearchHistoryRadioStation ? (UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) uIBlockSearchHistory : null;
        if (uIBlockSearchHistoryRadioStation == null) {
            return;
        }
        boolean z = uIBlockSearchHistoryRadioStation.B.g;
        if (z) {
            clickTarget = MusicAnalyticsInfo.ClickTarget.Unsubscribe;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            clickTarget = MusicAnalyticsInfo.ClickTarget.Subscribe;
        }
        this.l.a(new cfp0(uIBlockSearchHistoryRadioStation, new MusicAnalyticsInfo(clickTarget)));
        this.m.invoke(context, uIBlockSearchHistoryRadioStation);
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void b(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        MusicTrack b;
        MusicTrack b2;
        UIBlockSearchHistory.UIBlockSearchHistoryRadioStation uIBlockSearchHistoryRadioStation = uIBlockSearchHistory instanceof UIBlockSearchHistory.UIBlockSearchHistoryRadioStation ? (UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) uIBlockSearchHistory : null;
        if (uIBlockSearchHistoryRadioStation == null) {
            return;
        }
        RadioStation radioStation = uIBlockSearchHistoryRadioStation.B;
        u2b0 u2b0Var = this.g;
        this.l.a(new cfp0(uIBlockSearchHistoryRadioStation, new MusicAnalyticsInfo((u2b0Var.h() && (b = u2b0Var.b()) != null && b.Wb() && (b2 = u2b0Var.b()) != null && b2.b == radioStation.b) ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
        h(qwp0.a(radioStation), uIBlockSearchHistoryRadioStation);
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void d(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
    }
}
