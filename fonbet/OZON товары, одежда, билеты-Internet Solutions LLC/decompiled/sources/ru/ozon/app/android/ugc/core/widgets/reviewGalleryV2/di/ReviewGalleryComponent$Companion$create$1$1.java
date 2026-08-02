package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di;

import BZ.e;
import Gt.d;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vs.C4829a;
import WZ.l;
import android.content.SharedPreferences;
import cV.b;
import cV.c;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ProductReviewRepository;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModelImpl;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000±\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001b\u00102\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0018\u0010K\u001a\u00060Gj\u0002`H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/di/ReviewGalleryComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/di/ReviewGalleryComponent;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController$delegate", "LSc/j;", "getSoundController", "()Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "productReviewRepository$delegate", "getProductReviewRepository", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "productReviewRepository", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModelImpl;", "playerPoolViewModel$delegate", "getPlayerPoolViewModel", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModelImpl;", "playerPoolViewModel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryMapper;", "reviewGalleryMapper$delegate", "getReviewGalleryMapper", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryMapper;", "reviewGalleryMapper", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "cartButtonBinder", "LPc/a;", "getCartButtonBinder", "()LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "cartButtonContainerBinder", "getCartButtonContainerBinder", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModel", "getUgcCachedActionsSharedViewModel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModelImpl;", "mainViewModel", "getMainViewModel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModelImpl;", "reviewGalleryV2ViewModel", "getReviewGalleryV2ViewModel", "LBZ/e;", "miniAppConfigHolder$delegate", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "getSubscribeAuthorsIdStorage", "()Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favMoleculeDelegateProvider", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryComponent$Companion$create$1$1 implements ReviewGalleryComponent {
    final /* synthetic */ ActionComponentApi $actionComponentApi;
    final /* synthetic */ CartServiceApi $cartServiceApi;
    final /* synthetic */ CustomActionHandlersComponentApi $customActionHandlersComponentApi;
    final /* synthetic */ NetworkComponentApi $networkComponentApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerComponentApi;
    final /* synthetic */ RetainComposerPerformanceComponentApi $retainComposerPerformanceComponentApi;
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ StorageComponentApi $storageComponentApi;
    final /* synthetic */ VideoComponentApi $videoComponentApi;
    private final a<ReviewGalleryV2ProductButtonBinder> cartButtonBinder;
    private final a<ReviewGalleryV2MainViewModelImpl> mainViewModel;

    /* renamed from: miniAppConfigHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j miniAppConfigHolder;

    /* renamed from: productReviewRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productReviewRepository;

    /* renamed from: reviewGalleryMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j reviewGalleryMapper;

    /* renamed from: soundController$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j soundController;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(ReviewGalleryComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: playerPoolViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j playerPoolViewModel = k.b(ReviewGalleryComponent$Companion$create$1$1$playerPoolViewModel$2.INSTANCE);
    private final a<ReviewGalleryV2ProductContainerButtonBinder> cartButtonContainerBinder = new d(this, 1);
    private final a<UgcCachedActionsSharedViewModel> ugcCachedActionsSharedViewModel = new b();
    private final a<ReviewGalleryV2ViewModelImpl> reviewGalleryV2ViewModel = new C4829a(this, 1);

    ReviewGalleryComponent$Companion$create$1$1(VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi, CartServiceApi cartServiceApi, ActionComponentApi actionComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, StorageComponentApi storageComponentApi, RetainComposerComponentApi retainComposerComponentApi, final AppType appType, SharedPreferences sharedPreferences, C7475g c7475g) {
        this.$videoComponentApi = videoComponentApi;
        this.$networkComponentApi = networkComponentApi;
        this.$cartServiceApi = cartServiceApi;
        this.$actionComponentApi = actionComponentApi;
        this.$retainComposerPerformanceComponentApi = retainComposerPerformanceComponentApi;
        this.$customActionHandlersComponentApi = customActionHandlersComponentApi;
        this.$storageComponentApi = storageComponentApi;
        this.$retainComposerComponentApi = retainComposerComponentApi;
        this.$storage = c7475g;
        this.soundController = k.b(new ReviewGalleryComponent$Companion$create$1$1$soundController$2(videoComponentApi));
        this.productReviewRepository = k.b(new ReviewGalleryComponent$Companion$create$1$1$productReviewRepository$2(this, networkComponentApi));
        this.reviewGalleryMapper = k.b(new ReviewGalleryComponent$Companion$create$1$1$reviewGalleryMapper$2(appType));
        this.cartButtonBinder = new a() { // from class: cV.a
            @Override // Pc.a
            public final Object get() {
                ReviewGalleryV2ProductButtonBinder cartButtonBinder$lambda$0;
                cartButtonBinder$lambda$0 = ReviewGalleryComponent$Companion$create$1$1.cartButtonBinder$lambda$0(ReviewGalleryComponent$Companion$create$1$1.this, appType);
                return cartButtonBinder$lambda$0;
            }
        };
        this.mainViewModel = new c(0, this, sharedPreferences);
        this.miniAppConfigHolder = k.b(new ReviewGalleryComponent$Companion$create$1$1$miniAppConfigHolder$2(c7475g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewGalleryV2ProductButtonBinder cartButtonBinder$lambda$0(ReviewGalleryComponent$Companion$create$1$1 reviewGalleryComponent$Companion$create$1$1, AppType appType) {
        return new ReviewGalleryV2ProductButtonBinder(reviewGalleryComponent$Companion$create$1$1.getCartService(), appType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder$lambda$1(ReviewGalleryComponent$Companion$create$1$1 reviewGalleryComponent$Companion$create$1$1) {
        return new ReviewGalleryV2ProductContainerButtonBinder(reviewGalleryComponent$Companion$create$1$1.getCartService());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Repository getActionV2Repository() {
        return this.$actionComponentApi.getActionRepository();
    }

    private final CartService getCartService() {
        return this.$cartServiceApi.getCartService();
    }

    private final ProductReviewRepository getProductReviewRepository() {
        return (ProductReviewRepository) this.productReviewRepository.getValue();
    }

    private final SoundController getSoundController() {
        return (SoundController) this.soundController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewGalleryV2MainViewModelImpl mainViewModel$lambda$3(ReviewGalleryComponent$Companion$create$1$1 reviewGalleryComponent$Companion$create$1$1, SharedPreferences sharedPreferences) {
        return new ReviewGalleryV2MainViewModelImpl(reviewGalleryComponent$Companion$create$1$1.getSoundController(), sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewGalleryV2ViewModelImpl reviewGalleryV2ViewModel$lambda$4(ReviewGalleryComponent$Companion$create$1$1 reviewGalleryComponent$Companion$create$1$1) {
        return new ReviewGalleryV2ViewModelImpl(reviewGalleryComponent$Companion$create$1$1.getActionV2Repository(), reviewGalleryComponent$Companion$create$1$1.getProductReviewRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel$lambda$2() {
        return new UgcCachedActionsSharedViewModel();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public a<ReviewGalleryV2ProductButtonBinder> getCartButtonBinder() {
        return this.cartButtonBinder;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public a<ReviewGalleryV2ProductContainerButtonBinder> getCartButtonContainerBinder() {
        return this.cartButtonContainerBinder;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public Vg.d getCustomActionHandlersStoreFactory() {
        return this.$customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public ProductFavoriteDelegateProvider getFavMoleculeDelegateProvider() {
        return ((FavoriteComponentApi) this.$storage.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public FrameBinder getFrameBinder() {
        return this.$retainComposerPerformanceComponentApi.getFrameBinder();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public a<ReviewGalleryV2MainViewModelImpl> getMainViewModel() {
        return this.mainViewModel;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public e getMiniAppConfigHolder() {
        return (e) this.miniAppConfigHolder.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public ReviewGalleryV2PlayerPoolViewModelImpl getPlayerPoolViewModel() {
        return (ReviewGalleryV2PlayerPoolViewModelImpl) this.playerPoolViewModel.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public PlayerPreloader getPlayerPreloader() {
        return this.$videoComponentApi.getPlayerPreloader();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public ReviewGalleryMapper getReviewGalleryMapper() {
        return (ReviewGalleryMapper) this.reviewGalleryMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public a<ReviewGalleryV2ViewModelImpl> getReviewGalleryV2ViewModel() {
        return this.reviewGalleryV2ViewModel;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage() {
        return this.$storageComponentApi.getSubscribeAuthorsIdStorage();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public a<UgcCachedActionsSharedViewModel> getUgcCachedActionsSharedViewModel() {
        return this.ugcCachedActionsSharedViewModel;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent
    public VideoController getVideoController() {
        return this.$videoComponentApi.getVideoController();
    }
}
