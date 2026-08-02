package ru.ozon.app.android.marketing.widgets.sellerCarousel.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselViewHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SellerCarouselViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SellerCarouselViewHolder> {
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ FavoriteEventManager $favoriteEventManager;
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ SellerFavoriteService $sellerFavoriteService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerCarouselViewMapper$holderProducer$1(SellerFavoriteService sellerFavoriteService, AdultHandler adultHandler, FeatureChecker featureChecker, FavoriteEventManager favoriteEventManager) {
        super(2);
        this.$sellerFavoriteService = sellerFavoriteService;
        this.$adultHandler = adultHandler;
        this.$featureChecker = featureChecker;
        this.$favoriteEventManager = favoriteEventManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SellerCarouselViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        return new SellerCarouselViewHolder(view, ref.getTokenizedAnalytics(), this.$sellerFavoriteService, this.$adultHandler, this.$featureChecker, this.$favoriteEventManager, ref.getContainer(), ref);
    }
}
