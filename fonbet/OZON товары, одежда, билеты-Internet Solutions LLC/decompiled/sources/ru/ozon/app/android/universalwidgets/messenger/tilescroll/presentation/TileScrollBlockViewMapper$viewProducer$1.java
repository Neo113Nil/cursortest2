package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import Pc.a;
import WZ.l;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockViewModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;", "binding", "Lru/ozon/android/messenger/framework/core/d;", "references", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockView;", "invoke", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;Lru/ozon/android/messenger/framework/core/d;)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockView;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TileScrollBlockViewMapper$viewProducer$1 extends AbstractC7737t implements Function2<TileScrollBlockViewBinding, d, TileScrollBlockView> {
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ BlurDelegateProvider $blurDelegateProvider;
    final /* synthetic */ PdpOfflineScreenWidgetsData $pdpOfflineScreenWidgetsData;
    final /* synthetic */ PlayerPreloader $playerPreloader;
    final /* synthetic */ ProductFavoriteDelegateProvider $productFavoriteDelegateProvider;
    final /* synthetic */ a<SmallTileAddToCartButtonBinder> $smallTileAddToCartButtonBinderProvier;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ TileScrollBlockViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollBlockViewMapper$viewProducer$1(TileScrollBlockViewMapper tileScrollBlockViewMapper, PlayerPreloader playerPreloader, BlurDelegateProvider blurDelegateProvider, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, AdultHandler adultHandler, ProductFavoriteDelegateProvider productFavoriteDelegateProvider, a<SmallTileAddToCartButtonBinder> aVar, l lVar) {
        super(2);
        this.this$0 = tileScrollBlockViewMapper;
        this.$playerPreloader = playerPreloader;
        this.$blurDelegateProvider = blurDelegateProvider;
        this.$pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.$adultHandler = adultHandler;
        this.$productFavoriteDelegateProvider = productFavoriteDelegateProvider;
        this.$smallTileAddToCartButtonBinderProvier = aVar;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TileScrollBlockView invoke(TileScrollBlockViewBinding binding, d references) {
        TileScrollBlockViewModel.MyViewModelFactory myViewModelFactory;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ComponentCallbacksC5392m d11 = references.d();
        myViewModelFactory = this.this$0.viewModelFactory;
        return new TileScrollBlockView((TileScrollBlockViewModel) new z0(d11, myViewModelFactory).a(TileScrollBlockViewModel.class), binding, references, this.$playerPreloader, this.$blurDelegateProvider, this.$pdpOfflineScreenWidgetsData, this.$adultHandler, this.$productFavoriteDelegateProvider, this.$smallTileAddToCartButtonBinderProvier, this.$tokenizedAnalytics);
    }
}
