package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter;

import Pc.a;
import Sc.InterfaceC4008j;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileFavoriteButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TilesOpenPdpOfflineProductMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh.TileScrollBannerViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh.TileScrollDefaultItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh.TileScrollTrailButtonViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.banner.TileScrollBannerView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.button.TrailedActionView;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DB¥\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b4\u00105R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u0018\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010:R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010<R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010=R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010@R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010AR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010BR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/adapter/TileScrollItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO;", "Ljk0/j;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LSc/j;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "widgetAnalytic", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "offlineWidgetsHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "tilesOpenPdpOfflineProductMapper", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinderProvider", "Lkotlin/Function0;", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Landroidx/recyclerview/widget/RecyclerView;LSc/j;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;LPc/a;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Landroidx/recyclerview/widget/RecyclerView;", "LSc/j;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "LPc/a;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollItemsAdapter extends i<TileScrollVO.ItemVO, j> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final BlurDelegateProvider blurDelegateProvider;

    @NotNull
    private final ProductFavoriteDelegateProvider favoriteDelegateProvider;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final Function0<f> getViewedPond;
    private final PdpOfflineScreenWidgetsData offlineWidgetsHandler;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final InterfaceC4008j<AnalyticData> widgetAnalytic;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/adapter/TileScrollItemsAdapter$Companion;", "", "<init>", "()V", "DEFAULT_TILE", "", "BANNER", "ALL_BUTTON", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TileScrollItemsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull J lifecycleOwner, @NotNull ProductFavoriteDelegateProvider favoriteDelegateProvider, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull FrameBinder frameBinder, @NotNull RecyclerView recyclerView, @NotNull InterfaceC4008j<AnalyticData> widgetAnalytic, @NotNull PlayerPreloader playerPreloader, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper, @NotNull a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider, @NotNull Function0<f> getViewedPond, @NotNull BlurDelegateProvider blurDelegateProvider, @NotNull AdultHandler adultHandler) {
        super(new TileScrollItemsDiffUtils(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(favoriteDelegateProvider, "favoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(widgetAnalytic, "widgetAnalytic");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(tilesOpenPdpOfflineProductMapper, "tilesOpenPdpOfflineProductMapper");
        Intrinsics.checkNotNullParameter(addToCartButtonBinderProvider, "addToCartButtonBinderProvider");
        Intrinsics.checkNotNullParameter(getViewedPond, "getViewedPond");
        Intrinsics.checkNotNullParameter(blurDelegateProvider, "blurDelegateProvider");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.actionHandler = actionHandler;
        this.favoriteDelegateProvider = favoriteDelegateProvider;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.frameBinder = frameBinder;
        this.recyclerView = recyclerView;
        this.widgetAnalytic = widgetAnalytic;
        this.playerPreloader = playerPreloader;
        this.offlineWidgetsHandler = pdpOfflineScreenWidgetsData;
        this.tilesOpenPdpOfflineProductMapper = tilesOpenPdpOfflineProductMapper;
        this.addToCartButtonBinderProvider = addToCartButtonBinderProvider;
        this.getViewedPond = getViewedPond;
        this.blurDelegateProvider = blurDelegateProvider;
        this.adultHandler = adultHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TileScrollVO.ItemVO item = getItem(position);
        if (item instanceof TileScrollVO.ItemVO.TileVO) {
            return 777777;
        }
        if (item instanceof TileScrollVO.ItemVO.BannerVO) {
            return 888888;
        }
        if (item instanceof TileScrollVO.ItemVO.TrailedActionVO) {
            return 999999;
        }
        throw new IllegalArgumentException("Invalid viewHolder type in TileScroll");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof TileScrollDefaultItemViewHolder) {
            TileScrollVO.ItemVO item = getItem(position);
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO.ItemVO.TileVO");
            ((TileScrollDefaultItemViewHolder) holder).bind((TileScrollVO.ItemVO.TileVO) item);
        } else if (holder instanceof TileScrollBannerViewHolder) {
            TileScrollVO.ItemVO item2 = getItem(position);
            Intrinsics.g(item2, "null cannot be cast to non-null type ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO.ItemVO.BannerVO");
            ((TileScrollBannerViewHolder) holder).bind((TileScrollVO.ItemVO.BannerVO) item2);
        } else if (holder instanceof TileScrollTrailButtonViewHolder) {
            TileScrollVO.ItemVO item3 = getItem(position);
            Intrinsics.g(item3, "null cannot be cast to non-null type ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO.ItemVO.TrailedActionVO");
            ((TileScrollTrailButtonViewHolder) holder).bind((TileScrollVO.ItemVO.TrailedActionVO) item3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType != 777777) {
            if (viewType == 888888) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new TileScrollBannerViewHolder(new TileScrollBannerView(context), this.actionHandler, this.frameBinder, this.recyclerView, this.widgetAnalytic.getValue(), this.tokenizedAnalytics, this.getViewedPond);
            }
            if (viewType != 999999) {
                throw new IllegalArgumentException("Invalid viewHolder type in TileScroll");
            }
            TrailedActionView.Companion companion = TrailedActionView.INSTANCE;
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new TileScrollTrailButtonViewHolder(TrailedActionView.Companion.create$default(companion, context2, null, null, this.actionHandler, 6, null));
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        SmallTileMoleculeView smallTileMoleculeView = new SmallTileMoleculeView(context3);
        Function0<f> function0 = this.getViewedPond;
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        FrameBinder frameBinder = this.frameBinder;
        RecyclerView recyclerView = this.recyclerView;
        l lVar = this.tokenizedAnalytics;
        PlayerPreloader playerPreloader = this.playerPreloader;
        InterfaceC4008j<AnalyticData> interfaceC4008j = this.widgetAnalytic;
        SmallTileFavoriteButtonBinder smallTileFavoriteButtonBinder = new SmallTileFavoriteButtonBinder(smallTileMoleculeView, this.favoriteDelegateProvider.get(this.refs));
        TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper = this.tilesOpenPdpOfflineProductMapper;
        PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData = this.offlineWidgetsHandler;
        SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder = this.addToCartButtonBinderProvider.get();
        Intrinsics.checkNotNullExpressionValue(smallTileAddToCartButtonBinder, "get(...)");
        return new TileScrollDefaultItemViewHolder(smallTileMoleculeView, new SmallTileMoleculeDelegate(smallTileMoleculeView, frameBinder, recyclerView, lVar, playerPreloader, pdpOfflineScreenWidgetsData, tilesOpenPdpOfflineProductMapper, smallTileAddToCartButtonBinder, smallTileFavoriteButtonBinder, this.blurDelegateProvider.provide(), this.adultHandler, interfaceC4008j, function1), function0);
    }
}
