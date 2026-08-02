package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di;

import BZ.e;
import Sc.InterfaceC4008j;
import Sg.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseSkuScrollDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 12\u00060\u0001j\u0002`\u0002:\u00011R0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseSkuScrollComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LPc/a;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "getAddToCartBinderProvider", "()LPc/a;", "addToCartBinderProvider", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getProductFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lkotlin/Function1;", "", "Lru/ozon/app/android/video/manager/ExoManager;", "getExoManagerProvider", "()Lkotlin/jvm/functions/Function1;", "exoManagerProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "getFreshTileDelegateV2", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "freshTileDelegateV2", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WiseSkuScrollComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u0018²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseSkuScrollComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseSkuScrollComponent;", "create", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WiseSkuScrollComponent create$lambda$6(C7475g c7475g) {
            return new WiseSkuScrollComponent$Companion$create$1$1(c7475g, LazyUtilsKt.unsafeLazy(new WiseSkuScrollComponent$Companion$create$1$cartService$2(c7475g)), LazyUtilsKt.unsafeLazy(new WiseSkuScrollComponent$Companion$create$1$favoriteManager$2(c7475g)), LazyUtilsKt.unsafeLazy(new WiseSkuScrollComponent$Companion$create$1$adultHandler$2(c7475g)), LazyUtilsKt.unsafeLazy(new WiseSkuScrollComponent$Companion$create$1$actionRepository$2(c7475g)), LazyUtilsKt.unsafeLazy(new WiseSkuScrollComponent$Companion$create$1$analyticsScreenStorage$2(c7475g)), LazyUtilsKt.unsafeLazy(new WiseSkuScrollComponent$Companion$create$1$miniAppConfigHolder$2(c7475g)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CartService create$lambda$6$lambda$0(InterfaceC4008j<? extends CartService> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AdultHandler create$lambda$6$lambda$1(InterfaceC4008j<? extends AdultHandler> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ActionV2Repository create$lambda$6$lambda$2(InterfaceC4008j<? extends ActionV2Repository> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a create$lambda$6$lambda$3(InterfaceC4008j<? extends a> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e create$lambda$6$lambda$4(InterfaceC4008j<e> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FavoriteManager create$lambda$6$lambda$5(InterfaceC4008j<? extends FavoriteManager> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @NotNull
        public final C7473e<WiseSkuScrollComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(WiseSkuScrollComponent.class), new JS.a(storage, 2));
        }
    }

    @NotNull
    Pc.a<AddToCartButtonBinder> getAddToCartBinderProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    Function1<Boolean, ExoManager> getExoManagerProvider();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FreshTileDelegateV2 getFreshTileDelegateV2();

    @NotNull
    Function2<WiseSkuScrollDTO, l20.d, List<WiseSkuScrollVO>> getMapper();

    @NotNull
    ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    VideoController getVideoController();
}
