package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.imageprefetchers.SkuGrid2PrefetchInfoProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/di/SkuGrid2PrefetchInfoProviderModule;", "", "<init>", "()V", "provideSkuGrid2Prefetcher", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/imageprefetchers/SkuGrid2PrefetchInfoProvider;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuGrid2PrefetchInfoProviderModule {

    @NotNull
    public static final SkuGrid2PrefetchInfoProviderModule INSTANCE = new SkuGrid2PrefetchInfoProviderModule();

    private SkuGrid2PrefetchInfoProviderModule() {
    }

    @NotNull
    public final SkuGrid2PrefetchInfoProvider provideSkuGrid2Prefetcher() {
        return new SkuGrid2PrefetchInfoProvider();
    }
}
