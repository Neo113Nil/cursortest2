package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import Pc.a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2BannerButtonComponent$Companion$create$1$1;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModelImpl;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2BannerButtonComponent$Companion$create$1$1", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2BannerButtonComponent;", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewModelImpl;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BannerButtonComponent$Companion$create$1$1 implements TileGrid2BannerButtonComponent {
    final /* synthetic */ C7475g $storage;
    private final a<TileGrid2BannerViewModelImpl> viewModelProvider;

    TileGrid2BannerButtonComponent$Companion$create$1$1(final C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new a() { // from class: cY.a
            @Override // Pc.a
            public final Object get() {
                TileGrid2BannerViewModelImpl viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = TileGrid2BannerButtonComponent$Companion$create$1$1.viewModelProvider$lambda$0(C7475g.this);
                return viewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TileGrid2BannerViewModelImpl viewModelProvider$lambda$0(C7475g c7475g) {
        return new TileGrid2BannerViewModelImpl(((PixelRepositoryComponentApi) c7475g.getComponent(PixelRepositoryComponentApi.class)).getPixelRepository());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2BannerButtonComponent
    public FrameBinder getFrameBinder() {
        return ((RetainComposerPerformanceComponentApi) this.$storage.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2BannerButtonComponent
    public a<TileGrid2BannerViewModelImpl> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
