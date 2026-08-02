package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation;

import Pc.a;
import WZ.l;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder$dependencyHolder$2$1", "invoke", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder$dependencyHolder$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseSkuScrollViewHolder$dependencyHolder$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ a<AddToCartButtonBinder> $addToCartButtonBinderProvider;
    final /* synthetic */ ProductFavoriteDelegateProvider $productFavoriteDelegateProvider;
    final /* synthetic */ WiseSkuScrollViewHolder this$0;

    @Metadata(d1 = {"\u0000\u0091\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010.\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\n0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u000e¨\u0006>"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder$dependencyHolder$2$1", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticDataProvider", "Lkotlin/jvm/functions/Function0;", "getAnalyticDataProvider", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollLifecycle;", "", "setWiseSkuScrollObserver", "Lkotlin/jvm/functions/Function1;", "getSetWiseSkuScrollObserver", "()Lkotlin/jvm/functions/Function1;", "", "getPlayerPosition", "getGetPlayerPosition", "savePlayerPosition", "getSavePlayerPosition", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerProvider", "getOwnerProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "freshTileDelegateV2Provider", "getFreshTileDelegateV2Provider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureCheckerProvider", "getFeatureCheckerProvider", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "getRecyclerView", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "recyclerView", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "getAddToCartButtonBinder", "()Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "addToCartButtonBinder", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "getProductFavoriteDelegate", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "productFavoriteDelegate", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getWidgetInfo", "()Ll20/d;", "widgetInfo", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/uni/atoms/af/AtomAction;", "getActionHandler", "actionHandler", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "", "Lru/ozon/app/android/video/manager/ExoManager;", "getExoManagerProvider", "exoManagerProvider", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollViewHolder$dependencyHolder$2$1, reason: invalid class name */
    public static final class AnonymousClass1 implements WiseItemDependencyHolder {
        final /* synthetic */ a<AddToCartButtonBinder> $addToCartButtonBinderProvider;
        final /* synthetic */ ProductFavoriteDelegateProvider $productFavoriteDelegateProvider;
        private final Function0<AnalyticData> analyticDataProvider;
        private final Function0<FeatureChecker> featureCheckerProvider;
        private final Function0<FreshTileDelegateV2> freshTileDelegateV2Provider;
        private final Function0<Long> getPlayerPosition;
        private final Function0<C4911f> ownerProvider;
        private final Function1<Long, Unit> savePlayerPosition;
        private final Function1<WiseSkuScrollLifecycle, Unit> setWiseSkuScrollObserver;
        final /* synthetic */ WiseSkuScrollViewHolder this$0;

        AnonymousClass1(WiseSkuScrollViewHolder wiseSkuScrollViewHolder, a<AddToCartButtonBinder> aVar, ProductFavoriteDelegateProvider productFavoriteDelegateProvider) {
            Function0<FreshTileDelegateV2> function0;
            Function0<FeatureChecker> function02;
            this.this$0 = wiseSkuScrollViewHolder;
            this.$addToCartButtonBinderProvider = aVar;
            this.$productFavoriteDelegateProvider = productFavoriteDelegateProvider;
            this.analyticDataProvider = new WiseSkuScrollViewHolder$dependencyHolder$2$1$analyticDataProvider$1(wiseSkuScrollViewHolder);
            this.setWiseSkuScrollObserver = new WiseSkuScrollViewHolder$dependencyHolder$2$1$setWiseSkuScrollObserver$1(wiseSkuScrollViewHolder);
            this.getPlayerPosition = new WiseSkuScrollViewHolder$dependencyHolder$2$1$getPlayerPosition$1(wiseSkuScrollViewHolder);
            this.savePlayerPosition = new WiseSkuScrollViewHolder$dependencyHolder$2$1$savePlayerPosition$1(wiseSkuScrollViewHolder);
            this.ownerProvider = new WiseSkuScrollViewHolder$dependencyHolder$2$1$ownerProvider$1(wiseSkuScrollViewHolder);
            function0 = wiseSkuScrollViewHolder.freshTileDelegateV2Provider;
            this.freshTileDelegateV2Provider = function0;
            function02 = wiseSkuScrollViewHolder.featureCheckerProvider;
            this.featureCheckerProvider = function02;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function1<AtomAction, Unit> getActionHandler() {
            Function1<AtomAction, Unit> function1;
            function1 = this.this$0.actionHandler;
            return function1;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public AddToCartButtonBinder getAddToCartButtonBinder() {
            AddToCartButtonBinder addToCartButtonBinder = this.$addToCartButtonBinderProvider.get();
            Intrinsics.checkNotNullExpressionValue(addToCartButtonBinder, "get(...)");
            return addToCartButtonBinder;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function0<AnalyticData> getAnalyticDataProvider() {
            return this.analyticDataProvider;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function1<Boolean, ExoManager> getExoManagerProvider() {
            Function1<Boolean, ExoManager> function1;
            function1 = this.this$0.exoManagerProvider;
            return function1;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function0<FeatureChecker> getFeatureCheckerProvider() {
            return this.featureCheckerProvider;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function0<FreshTileDelegateV2> getFreshTileDelegateV2Provider() {
            return this.freshTileDelegateV2Provider;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function0<Long> getGetPlayerPosition() {
            return this.getPlayerPosition;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function0<C4911f> getOwnerProvider() {
            return this.ownerProvider;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public FavoriteProductDelegate getProductFavoriteDelegate() {
            ComposerReferences composerReferences;
            ProductFavoriteDelegateProvider productFavoriteDelegateProvider = this.$productFavoriteDelegateProvider;
            composerReferences = this.this$0.composerReferences;
            return productFavoriteDelegateProvider.get(composerReferences);
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public PullableHorizontalRecyclerView getRecyclerView() {
            PullableHorizontalRecyclerView pullableHorizontalRecyclerView;
            pullableHorizontalRecyclerView = this.this$0.containerView;
            return pullableHorizontalRecyclerView;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function1<Long, Unit> getSavePlayerPosition() {
            return this.savePlayerPosition;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public Function1<WiseSkuScrollLifecycle, Unit> getSetWiseSkuScrollObserver() {
            return this.setWiseSkuScrollObserver;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public l getTokenizedAnalytics() {
            l lVar;
            lVar = this.this$0.tokenizedAnalytics;
            return lVar;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public VideoController getVideoController() {
            VideoController videoController;
            videoController = this.this$0.videoController;
            return videoController;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder
        public d getWidgetInfo() {
            ru.ozon.composer.ui.widget.l viewItem = this.this$0.getViewItem();
            if (viewItem != null) {
                return viewItem.c();
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseSkuScrollViewHolder$dependencyHolder$2(WiseSkuScrollViewHolder wiseSkuScrollViewHolder, a<AddToCartButtonBinder> aVar, ProductFavoriteDelegateProvider productFavoriteDelegateProvider) {
        super(0);
        this.this$0 = wiseSkuScrollViewHolder;
        this.$addToCartButtonBinderProvider = aVar;
        this.$productFavoriteDelegateProvider = productFavoriteDelegateProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new AnonymousClass1(this.this$0, this.$addToCartButtonBinderProvider, this.$productFavoriteDelegateProvider);
    }
}
