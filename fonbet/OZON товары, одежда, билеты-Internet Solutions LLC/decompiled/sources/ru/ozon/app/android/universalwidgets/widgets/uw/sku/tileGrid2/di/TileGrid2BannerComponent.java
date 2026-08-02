package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2BannerComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModelImpl;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.TileGrid2RootBgColorCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.helper.TileBackgroundHolder;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2BannerComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lk20/g;", "Lru/ozon/app/android/ads/data/pixel/di/PixelRepositoryComponentApi;", "pixelRepositoryComponentApi", "Lru/ozon/app/android/ads/data/pixel/di/PixelRepositoryComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewModelImpl;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "tileGrid2RootBgColorCache$delegate", "LSc/j;", "getTileGrid2RootBgColorCache", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "tileGrid2RootBgColorCache", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/helper/TileBackgroundHolder;", "getTileBackgroundHolder", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/helper/TileBackgroundHolder;", "tileBackgroundHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BannerComponent implements InterfaceC6958a {

    @NotNull
    private final NetworkComponentApi networkComponentApi;

    @NotNull
    private final PixelRepositoryComponentApi pixelRepositoryComponentApi;

    @NotNull
    private final RetainComposerComponentApi retainComponentApi;

    @NotNull
    private final C7475g storage;

    /* renamed from: tileGrid2RootBgColorCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tileGrid2RootBgColorCache;

    @NotNull
    private final a<TileGrid2BannerViewModelImpl> viewModelProvider;

    public TileGrid2BannerComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.pixelRepositoryComponentApi = (PixelRepositoryComponentApi) storage.getComponent(PixelRepositoryComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
        this.viewModelProvider = new a() { // from class: cY.b
            @Override // Pc.a
            public final Object get() {
                TileGrid2BannerViewModelImpl viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = TileGrid2BannerComponent.viewModelProvider$lambda$0(TileGrid2BannerComponent.this);
                return viewModelProvider$lambda$0;
            }
        };
        this.tileGrid2RootBgColorCache = k.b(TileGrid2BannerComponent$tileGrid2RootBgColorCache$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TileGrid2BannerViewModelImpl viewModelProvider$lambda$0(TileGrid2BannerComponent tileGrid2BannerComponent) {
        return new TileGrid2BannerViewModelImpl(tileGrid2BannerComponent.pixelRepositoryComponentApi.getPixelRepository());
    }

    @NotNull
    public final FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @NotNull
    public final FrameBinder getFrameBinder() {
        return ((RetainComposerPerformanceComponentApi) this.storage.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
    }

    @NotNull
    public final TileBackgroundHolder getTileBackgroundHolder() {
        return new TileBackgroundHolder(getTileGrid2RootBgColorCache());
    }

    @NotNull
    public final TileGrid2RootBgColorCache getTileGrid2RootBgColorCache() {
        return (TileGrid2RootBgColorCache) this.tileGrid2RootBgColorCache.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @NotNull
    public final a<TileGrid2BannerViewModelImpl> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
