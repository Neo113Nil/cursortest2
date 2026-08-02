package com.vk.catalog2.feature.music.search.history.di;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.music.search.history.di.SearchHistoryRepoComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ewy;
import xsna.fpf0;
import xsna.fvh0;
import xsna.p1d0;
import xsna.qcy;
import xsna.rxh0;

/* compiled from: SearchHistoryProviderComponent.kt */
/* loaded from: classes16.dex */
public final class SearchHistoryProviderComponent implements DiScopedWithParamsComponent<rxh0, fvh0> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final fvh0 a;
    public final SearchHistoryRepoComponent b;
    public final ewy c = new ewy(new p1d0(this, 10));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SearchHistoryProviderComponent.class, IronSourceConstants.EVENTS_PROVIDER, "getProvider()Lcom/vk/catalog2/feature/music/search/history/provider/ObjectSearchHistoryProvider;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public SearchHistoryProviderComponent(fvh0 fvh0Var, SearchHistoryRepoComponent searchHistoryRepoComponent) {
        this.a = fvh0Var;
        this.b = searchHistoryRepoComponent;
    }
}
