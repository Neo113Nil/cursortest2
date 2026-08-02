package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di;

import WZ.l;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollLifecycle;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001a0\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010!R \u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001a0\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u001e\u00106\u001a\f\u0012\b\u0012\u000603j\u0002`40\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010!R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002070\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010!R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010!¨\u0006="}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;", "", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "getRecyclerView", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "recyclerView", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "getAddToCartButtonBinder", "()Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "addToCartButtonBinder", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "getProductFavoriteDelegate", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "productFavoriteDelegate", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getWidgetInfo", "()Ll20/d;", "widgetInfo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "getAnalyticDataProvider", "()Lkotlin/jvm/functions/Function0;", "analyticDataProvider", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollLifecycle;", "getSetWiseSkuScrollObserver", "setWiseSkuScrollObserver", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "", "Lru/ozon/app/android/video/manager/ExoManager;", "getExoManagerProvider", "exoManagerProvider", "", "getGetPlayerPosition", "getPlayerPosition", "getSavePlayerPosition", "savePlayerPosition", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "getOwnerProvider", "ownerProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "getFreshTileDelegateV2Provider", "freshTileDelegateV2Provider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureCheckerProvider", "featureCheckerProvider", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WiseItemDependencyHolder {
    @NotNull
    Function1<AtomAction, Unit> getActionHandler();

    @NotNull
    AddToCartButtonBinder getAddToCartButtonBinder();

    @NotNull
    Function0<AnalyticData> getAnalyticDataProvider();

    @NotNull
    Function1<Boolean, ExoManager> getExoManagerProvider();

    @NotNull
    Function0<FeatureChecker> getFeatureCheckerProvider();

    @NotNull
    Function0<FreshTileDelegateV2> getFreshTileDelegateV2Provider();

    @NotNull
    Function0<Long> getGetPlayerPosition();

    @NotNull
    Function0<C4911f> getOwnerProvider();

    @NotNull
    FavoriteProductDelegate getProductFavoriteDelegate();

    @NotNull
    PullableHorizontalRecyclerView getRecyclerView();

    @NotNull
    Function1<Long, Unit> getSavePlayerPosition();

    @NotNull
    Function1<WiseSkuScrollLifecycle, Unit> getSetWiseSkuScrollObserver();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    VideoController getVideoController();

    d getWidgetInfo();
}
