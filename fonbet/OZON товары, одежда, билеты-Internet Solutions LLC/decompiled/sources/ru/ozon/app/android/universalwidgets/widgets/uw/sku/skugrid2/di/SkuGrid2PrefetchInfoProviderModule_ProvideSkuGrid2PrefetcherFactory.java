package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.imageprefetchers.SkuGrid2PrefetchInfoProvider;

/* loaded from: classes2.dex */
public final class SkuGrid2PrefetchInfoProviderModule_ProvideSkuGrid2PrefetcherFactory implements e<SkuGrid2PrefetchInfoProvider> {
    public static SkuGrid2PrefetchInfoProvider provideSkuGrid2Prefetcher() {
        SkuGrid2PrefetchInfoProvider provideSkuGrid2Prefetcher = SkuGrid2PrefetchInfoProviderModule.INSTANCE.provideSkuGrid2Prefetcher();
        j.d(provideSkuGrid2Prefetcher);
        return provideSkuGrid2Prefetcher;
    }
}
