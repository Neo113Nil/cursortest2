package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.adapter;

import Pc.a;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockViewModel;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile.MessengerTileDataBinder;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile.MessengerTileView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileFavoriteButtonBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010.\u001a\u00020\u00192\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0018\u0010\u0016\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00108R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020,0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/TileScrollBlockItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/MessengerTileViewHolder;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;", "viewModel", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinderProvider", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lru/ozon/android/messenger/framework/core/d;", "references", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LPc/a;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/android/messenger/framework/core/d;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/MessengerTileViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/MessengerTileViewHolder;I)V", "onViewRecycled", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/MessengerTileViewHolder;)V", "getItemCount", "()I", "", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "list", "submitList", "(Ljava/util/List;)V", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "LPc/a;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/android/messenger/framework/core/d;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "", "items", "Ljava/util/List;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBlockItemAdapter extends RecyclerView.g<MessengerTileViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final BlurDelegateProvider blurDelegateProvider;

    @NotNull
    private final List<TileScrollBlockVO.TileVO> items;
    private final PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ProductFavoriteDelegateProvider productFavoriteDelegateProvider;

    @NotNull
    private final d references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TileScrollBlockViewModel viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public TileScrollBlockItemAdapter(@NotNull TileScrollBlockViewModel viewModel, @NotNull PlayerPreloader playerPreloader, @NotNull BlurDelegateProvider blurDelegateProvider, @NotNull AdultHandler adultHandler, @NotNull a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull d references, @NotNull ProductFavoriteDelegateProvider productFavoriteDelegateProvider, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(blurDelegateProvider, "blurDelegateProvider");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(addToCartButtonBinderProvider, "addToCartButtonBinderProvider");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(productFavoriteDelegateProvider, "productFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.viewModel = viewModel;
        this.playerPreloader = playerPreloader;
        this.blurDelegateProvider = blurDelegateProvider;
        this.adultHandler = adultHandler;
        this.addToCartButtonBinderProvider = addToCartButtonBinderProvider;
        this.pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.references = references;
        this.productFavoriteDelegateProvider = productFavoriteDelegateProvider;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void submitList(@NotNull List<TileScrollBlockVO.TileVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MessengerTileViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MessengerTileViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MessengerTileView messengerTileView = new MessengerTileView(context);
        TileScrollBlockViewModel tileScrollBlockViewModel = this.viewModel;
        PlayerPreloader playerPreloader = this.playerPreloader;
        BlurMoleculeDelegate provide = this.blurDelegateProvider.provide();
        AdultHandler adultHandler = this.adultHandler;
        SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder = this.addToCartButtonBinderProvider.get();
        Intrinsics.checkNotNullExpressionValue(smallTileAddToCartButtonBinder, "get(...)");
        return new MessengerTileViewHolder(messengerTileView, new MessengerTileDataBinder(messengerTileView, tileScrollBlockViewModel, playerPreloader, this.pdpOfflineScreenWidgetsData, provide, adultHandler, smallTileAddToCartButtonBinder, new SmallTileFavoriteButtonBinder(messengerTileView, this.productFavoriteDelegateProvider.provideMessengerDelegate(this.references.d(), this.actionHandler, new TileScrollBlockItemAdapter$onCreateViewHolder$1(this))), this.tokenizedAnalytics, this.actionHandler, new TileScrollBlockItemAdapter$onCreateViewHolder$2(this)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NotNull MessengerTileViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onRecycle();
    }
}
