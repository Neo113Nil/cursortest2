package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import CN.a;
import Sc.InterfaceC4008j;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import java.util.HashMap;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedBottomSheetDelegate;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0001/R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001bR\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R0\u0010.\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(j\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*`+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2CartButtonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "getAddToCartButtonsBinder", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "addToCartButtonsBinder", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerBinder;", "getAddToCartContainerBinder", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerBinder;", "addToCartContainerBinder", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedBottomSheetDelegate;", "getTileRelatedBottomSheetDelegate", "()LSc/j;", "tileRelatedBottomSheetDelegate", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "getTileDislikeInteractor", "()Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "getWishlistServiceLazy", "wishlistServiceLazy", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "getSelectionProductsEventManager", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "selectionProductsEventManager", "Ljava/util/HashMap;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "Lkotlin/collections/HashMap;", "getSelectionProductsEventsMap", "()Ljava/util/HashMap;", "selectionProductsEventsMap", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2CartButtonComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2CartButtonComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2CartButtonComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TileGrid2CartButtonComponent create$lambda$0(final C7475g c7475g) {
            return new TileGrid2CartButtonComponent() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent$Companion$create$1$1
                private final CartServiceApi cartServiceApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComponentApi;
                private final SelectionProductsEventManager selectionProductsEventManager;
                private final HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap;
                private final SelectionsCoreComponentApi selectionsCoreComponentApi;

                /* renamed from: tileDislikeInteractor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j tileDislikeInteractor;
                private final InterfaceC4008j<TileRelatedBottomSheetDelegate> tileRelatedBottomSheetDelegate;
                private final InterfaceC4008j<WishlistService> wishlistServiceLazy;

                {
                    this.cartServiceApi = (CartServiceApi) C7475g.this.getComponent(CartServiceApi.class);
                    this.networkComponentApi = (NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class);
                    SelectionsCoreComponentApi selectionsCoreComponentApi = (SelectionsCoreComponentApi) C7475g.this.getComponent(SelectionsCoreComponentApi.class);
                    this.selectionsCoreComponentApi = selectionsCoreComponentApi;
                    this.tileRelatedBottomSheetDelegate = LazyUtilsKt.unsafeLazy(TileGrid2CartButtonComponent$Companion$create$1$1$tileRelatedBottomSheetDelegate$1.INSTANCE);
                    this.tileDislikeInteractor = LazyUtilsKt.unsafeLazy(new TileGrid2CartButtonComponent$Companion$create$1$1$tileDislikeInteractor$2(C7475g.this));
                    this.wishlistServiceLazy = LazyUtilsKt.unsafeLazy(new TileGrid2CartButtonComponent$Companion$create$1$1$wishlistServiceLazy$1(C7475g.this));
                    this.selectionProductsEventManager = selectionsCoreComponentApi.getSelectionProductsEventManager();
                    this.selectionProductsEventsMap = new HashMap<>();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public AddToCartButtonsBinder getAddToCartButtonsBinder() {
                    return new AddToCartButtonsBinder(this.cartServiceApi.getCartService(), getFeatureChecker());
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public AddToCartContainerBinder getAddToCartContainerBinder() {
                    return new AddToCartContainerBinder(this.cartServiceApi.getCartService(), getFeatureChecker());
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public FrameBinder getFrameBinder() {
                    return ((RetainComposerPerformanceComponentApi) C7475g.this.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public SelectionProductsEventManager getSelectionProductsEventManager() {
                    return this.selectionProductsEventManager;
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public HashMap<SelectionProductsTileKey, SelectionProductEvent> getSelectionProductsEventsMap() {
                    return this.selectionProductsEventsMap;
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public TileDislikeInteractor getTileDislikeInteractor() {
                    return (TileDislikeInteractor) this.tileDislikeInteractor.getValue();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public InterfaceC4008j<TileRelatedBottomSheetDelegate> getTileRelatedBottomSheetDelegate() {
                    return this.tileRelatedBottomSheetDelegate;
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent
                public InterfaceC4008j<WishlistService> getWishlistServiceLazy() {
                    return this.wishlistServiceLazy;
                }
            };
        }

        @NotNull
        public final C7473e<TileGrid2CartButtonComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TileGrid2CartButtonComponent.class), new a(storage, 7));
        }
    }

    @NotNull
    AddToCartButtonsBinder getAddToCartButtonsBinder();

    @NotNull
    AddToCartContainerBinder getAddToCartContainerBinder();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    SelectionProductsEventManager getSelectionProductsEventManager();

    @NotNull
    HashMap<SelectionProductsTileKey, SelectionProductEvent> getSelectionProductsEventsMap();

    @NotNull
    TileDislikeInteractor getTileDislikeInteractor();

    @NotNull
    InterfaceC4008j<TileRelatedBottomSheetDelegate> getTileRelatedBottomSheetDelegate();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    InterfaceC4008j<WishlistService> getWishlistServiceLazy();
}
