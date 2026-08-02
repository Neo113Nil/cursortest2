package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di;

import BZ.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sg.a;
import Vg.d;
import WZ.l;
import java.util.List;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.ProductMediaDelegate;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseSkuScrollDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

@Metadata(d1 = {"\u0000y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R7\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010'\u001a\u00060#j\u0002`$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u00104\u001a\u000600j\u0002`18VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseSkuScrollComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseSkuScrollComponent;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "mapper$delegate", "LSc/j;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "kotlin.jvm.PlatformType", "addToCartBinderProvider", "LPc/a;", "getAddToCartBinderProvider", "()LPc/a;", "Lkotlin/Function1;", "", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManagerProvider", "Lkotlin/jvm/functions/Function1;", "getExoManagerProvider", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getProductFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "getFreshTileDelegateV2", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "freshTileDelegateV2", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseSkuScrollComponent$Companion$create$1$1 implements WiseSkuScrollComponent {
    final /* synthetic */ InterfaceC4008j<ActionV2Repository> $actionRepository$delegate;
    final /* synthetic */ InterfaceC4008j<AdultHandler> $adultHandler$delegate;
    final /* synthetic */ InterfaceC4008j<a> $analyticsScreenStorage$delegate;
    final /* synthetic */ InterfaceC4008j<CartService> $cartService$delegate;
    final /* synthetic */ InterfaceC4008j<FavoriteManager> $favoriteManager$delegate;
    final /* synthetic */ InterfaceC4008j<e> $miniAppConfigHolder$delegate;
    final /* synthetic */ C7475g $storage;
    private final Pc.a<AddToCartButtonBinder> addToCartBinderProvider;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(WiseSkuScrollComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final Function1<Boolean, ExoManager> exoManagerProvider = new WiseSkuScrollComponent$Companion$create$1$1$exoManagerProvider$1(this);

    /* JADX WARN: Multi-variable type inference failed */
    WiseSkuScrollComponent$Companion$create$1$1(final C7475g c7475g, final InterfaceC4008j<? extends CartService> interfaceC4008j, InterfaceC4008j<? extends FavoriteManager> interfaceC4008j2, InterfaceC4008j<? extends AdultHandler> interfaceC4008j3, InterfaceC4008j<? extends ActionV2Repository> interfaceC4008j4, InterfaceC4008j<? extends a> interfaceC4008j5, InterfaceC4008j<e> interfaceC4008j6) {
        this.$storage = c7475g;
        this.$cartService$delegate = interfaceC4008j;
        this.$favoriteManager$delegate = interfaceC4008j2;
        this.$adultHandler$delegate = interfaceC4008j3;
        this.$actionRepository$delegate = interfaceC4008j4;
        this.$analyticsScreenStorage$delegate = interfaceC4008j5;
        this.$miniAppConfigHolder$delegate = interfaceC4008j6;
        this.addToCartBinderProvider = new Pc.a() { // from class: Kw.a
            @Override // Pc.a
            public final Object get() {
                AddToCartButtonBinder addToCartBinderProvider$lambda$0;
                addToCartBinderProvider$lambda$0 = WiseSkuScrollComponent$Companion$create$1$1.addToCartBinderProvider$lambda$0(C7475g.this, interfaceC4008j);
                return addToCartBinderProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartButtonBinder addToCartBinderProvider$lambda$0(C7475g c7475g, InterfaceC4008j interfaceC4008j) {
        CartService create$lambda$6$lambda$0;
        create$lambda$6$lambda$0 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$0(interfaceC4008j);
        return new AddToCartButtonBinder(create$lambda$6$lambda$0, ((CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class)).getDispatcherProvider());
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public Pc.a<AddToCartButtonBinder> getAddToCartBinderProvider() {
        return this.addToCartBinderProvider;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public Function1<Boolean, ExoManager> getExoManagerProvider() {
        return this.exoManagerProvider;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public FeatureChecker getFeatureChecker() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getFeatureChecker();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public FreshTileDelegateV2 getFreshTileDelegateV2() {
        FavoriteManager create$lambda$6$lambda$5;
        AdultHandler create$lambda$6$lambda$1;
        ActionV2Repository create$lambda$6$lambda$2;
        a create$lambda$6$lambda$3;
        e create$lambda$6$lambda$4;
        AdultHandler create$lambda$6$lambda$12;
        CartService create$lambda$6$lambda$0;
        AdultHandler create$lambda$6$lambda$13;
        l tokenizedAnalytics = getTokenizedAnalytics();
        create$lambda$6$lambda$5 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$5(this.$favoriteManager$delegate);
        create$lambda$6$lambda$1 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$1(this.$adultHandler$delegate);
        create$lambda$6$lambda$2 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$2(this.$actionRepository$delegate);
        create$lambda$6$lambda$3 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$3(this.$analyticsScreenStorage$delegate);
        create$lambda$6$lambda$4 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$4(this.$miniAppConfigHolder$delegate);
        FreshFavoriteDelegate freshFavoriteDelegate = new FreshFavoriteDelegate(create$lambda$6$lambda$5, create$lambda$6$lambda$1, create$lambda$6$lambda$2, create$lambda$6$lambda$3, create$lambda$6$lambda$4, getTokenizedAnalytics());
        l tokenizedAnalytics2 = getTokenizedAnalytics();
        create$lambda$6$lambda$12 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$1(this.$adultHandler$delegate);
        create$lambda$6$lambda$0 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$0(this.$cartService$delegate);
        ProductActionBarDelegate productActionBarDelegate = new ProductActionBarDelegate(tokenizedAnalytics2, create$lambda$6$lambda$12, create$lambda$6$lambda$0);
        create$lambda$6$lambda$13 = WiseSkuScrollComponent.Companion.create$lambda$6$lambda$1(this.$adultHandler$delegate);
        return new FreshTileDelegateV2(tokenizedAnalytics, freshFavoriteDelegate, productActionBarDelegate, new ProductMediaDelegate(create$lambda$6$lambda$13));
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public Function2<WiseSkuScrollDTO, l20.d, List<WiseSkuScrollVO>> getMapper() {
        return (Function2) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider() {
        return ((FavoriteComponentApi) this.$storage.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent
    public VideoController getVideoController() {
        return ((VideoComponentApi) this.$storage.getComponent(VideoComponentApi.class)).getVideoController();
    }
}
