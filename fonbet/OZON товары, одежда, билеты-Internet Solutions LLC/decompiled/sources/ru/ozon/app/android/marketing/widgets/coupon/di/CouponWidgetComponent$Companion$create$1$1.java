package ru.ozon.app.android.marketing.widgets.coupon.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentApi;
import ru.ozon.app.android.marketing.coupon.domain.CouponInteractor;
import ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressMapper;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponMapper;
import ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewModel;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsMapper;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperParser;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u008d\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00107\u001a\u000603j\u0002`48BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"ru/ozon/app/android/marketing/widgets/coupon/di/CouponWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/marketing/widgets/coupon/di/CouponWidgetComponent;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/marketing/coupon/di/CouponComponentApi;", "couponComponentApi", "Lru/ozon/app/android/marketing/coupon/di/CouponComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperParser;", "parser$delegate", "LSc/j;", "getParser", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperParser;", "parser", "Lru/ozon/app/android/marketing/widgets/coupon/core/CouponMapper;", "couponMapper$delegate", "getCouponMapper", "()Lru/ozon/app/android/marketing/widgets/coupon/core/CouponMapper;", "couponMapper", "Lru/ozon/app/android/marketing/widgets/highlightProducts/core/HighlightProductsMapper;", "highlightProductsMapper$delegate", "getHighlightProductsMapper", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/core/HighlightProductsMapper;", "highlightProductsMapper", "Lru/ozon/app/android/marketing/widgets/actionProgress/core/ActionProgressMapper;", "actionMapper$delegate", "getActionMapper", "()Lru/ozon/app/android/marketing/widgets/actionProgress/core/ActionProgressMapper;", "actionMapper", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "stateManager$delegate", "getStateManager", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "stateManager", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "getAsyncWidgetRepository", "()Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponViewModel;", "getCouponViewModel", "()Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponViewModel;", "couponViewModel", "Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;", "getInteractor", "()Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;", "interactor", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "getCouponStorage", "()Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "couponStorage", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponWidgetComponent$Companion$create$1$1 implements CouponWidgetComponent {
    private final CartServiceApi cartServiceApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final CouponComponentApi couponComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: parser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j parser = k.b(new CouponWidgetComponent$Companion$create$1$1$parser$2(this));

    /* renamed from: couponMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j couponMapper = k.b(CouponWidgetComponent$Companion$create$1$1$couponMapper$2.INSTANCE);

    /* renamed from: highlightProductsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j highlightProductsMapper = k.b(CouponWidgetComponent$Companion$create$1$1$highlightProductsMapper$2.INSTANCE);

    /* renamed from: actionMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionMapper = k.b(CouponWidgetComponent$Companion$create$1$1$actionMapper$2.INSTANCE);

    /* renamed from: stateManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stateManager = k.b(new CouponWidgetComponent$Companion$create$1$1$stateManager$2(this));

    CouponWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.couponComponentApi = (CouponComponentApi) c7475g.getComponent(CouponComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerAsyncWidgetRepository getAsyncWidgetRepository() {
        return this.composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartService getCartService() {
        return this.cartServiceApi.getCartService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonParser getJsonDeserializer() {
        return this.networkComponentApi.getJsonDeserializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HighlightsWrapperParser getParser() {
        return (HighlightsWrapperParser) this.parser.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent
    public ActionProgressMapper getActionMapper() {
        return (ActionProgressMapper) this.actionMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent
    public CouponMapper getCouponMapper() {
        return (CouponMapper) this.couponMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent
    public CouponStorage getCouponStorage() {
        return this.couponComponentApi.getCouponStorage();
    }

    @Override // ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent
    public CouponViewModel getCouponViewModel() {
        return new CouponViewModel(this.storageComponentApi.getAuthStateStorage(), getStateManager());
    }

    @Override // ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent
    public HighlightProductsMapper getHighlightProductsMapper() {
        return (HighlightProductsMapper) this.highlightProductsMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent
    public CouponInteractor getInteractor() {
        return this.couponComponentApi.getCouponInteractor();
    }

    @Override // ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent
    public HighlightsWrapperStateManager getStateManager() {
        return (HighlightsWrapperStateManager) this.stateManager.getValue();
    }
}
