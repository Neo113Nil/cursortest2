package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import Pc.a;
import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.adapter.TileScrollBlockItemAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/TileScrollBlockItemAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileScrollBlockView$rvAdapter$2 extends AbstractC7737t implements Function0<TileScrollBlockItemAdapter> {
    final /* synthetic */ a<SmallTileAddToCartButtonBinder> $addToCartButtonBinderProvider;
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ BlurDelegateProvider $blurDelegateProvider;
    final /* synthetic */ PdpOfflineScreenWidgetsData $pdpOfflineScreenWidgetsData;
    final /* synthetic */ PlayerPreloader $playerPreloader;
    final /* synthetic */ ProductFavoriteDelegateProvider $productFavoriteDelegateProvider;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ TileScrollBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollBlockView$rvAdapter$2(TileScrollBlockView tileScrollBlockView, PlayerPreloader playerPreloader, BlurDelegateProvider blurDelegateProvider, AdultHandler adultHandler, a<SmallTileAddToCartButtonBinder> aVar, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, ProductFavoriteDelegateProvider productFavoriteDelegateProvider, l lVar) {
        super(0);
        this.this$0 = tileScrollBlockView;
        this.$playerPreloader = playerPreloader;
        this.$blurDelegateProvider = blurDelegateProvider;
        this.$adultHandler = adultHandler;
        this.$addToCartButtonBinderProvider = aVar;
        this.$pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.$productFavoriteDelegateProvider = productFavoriteDelegateProvider;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileScrollBlockItemAdapter invoke() {
        d dVar;
        Function1 function1;
        TileScrollBlockViewModel tileScrollBlockViewModel;
        dVar = this.this$0.references;
        function1 = this.this$0.actionHandler;
        tileScrollBlockViewModel = this.this$0.viewModel;
        return new TileScrollBlockItemAdapter(tileScrollBlockViewModel, this.$playerPreloader, this.$blurDelegateProvider, this.$adultHandler, this.$addToCartButtonBinderProvider, this.$pdpOfflineScreenWidgetsData, dVar, this.$productFavoriteDelegateProvider, this.$tokenizedAnalytics, function1);
    }
}
