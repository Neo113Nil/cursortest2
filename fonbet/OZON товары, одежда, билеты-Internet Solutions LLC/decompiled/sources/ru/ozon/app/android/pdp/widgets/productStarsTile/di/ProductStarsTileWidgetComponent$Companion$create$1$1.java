package ru.ozon.app.android.pdp.widgets.productStarsTile.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.widgets.productStarsTile.core.ProductStarsTileMapper;
import ru.ozon.app.android.pdp.widgets.productStarsTile.data.ProductStarsRepository;
import ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/pdp/widgets/productStarsTile/di/ProductStarsTileWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/productStarsTile/di/ProductStarsTileWidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/pdp/widgets/productStarsTile/data/ProductStarsRepository;", "starsRepository$delegate", "LSc/j;", "getStarsRepository", "()Lru/ozon/app/android/pdp/widgets/productStarsTile/data/ProductStarsRepository;", "starsRepository", "Lru/ozon/app/android/pdp/widgets/productStarsTile/core/ProductStarsTileMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/pdp/widgets/productStarsTile/core/ProductStarsTileMapper;", "mapper", "Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;", "viewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductStarsTileWidgetComponent$Companion$create$1$1 implements ProductStarsTileWidgetComponent {
    private final CartServiceApi cartServiceApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: starsRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j starsRepository = k.b(new ProductStarsTileWidgetComponent$Companion$create$1$1$starsRepository$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ProductStarsTileWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new ProductStarsTileWidgetComponent$Companion$create$1$1$viewModel$2(this));

    ProductStarsTileWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductStarsRepository getStarsRepository() {
        return (ProductStarsRepository) this.starsRepository.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.productStarsTile.di.ProductStarsTileWidgetComponent
    public ProductStarsTileMapper getMapper() {
        return (ProductStarsTileMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.productStarsTile.di.ProductStarsTileWidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.productStarsTile.di.ProductStarsTileWidgetComponent
    public ProductStarsTileWidgetViewModel getViewModel() {
        return (ProductStarsTileWidgetViewModel) this.viewModel.getValue();
    }
}
