package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation;

import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.favorites.seller.api.SellerActionResponse;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.ui.R$drawable;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/account/favorites/seller/api/SellerActionResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/account/favorites/seller/api/SellerActionResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerCarouselAdapter$SellerViewHolder$onFavoritesClick$1 extends AbstractC7737t implements Function1<SellerActionResponse, Unit> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ SellerCarouselAdapter.SellerViewHolder this$0;
    final /* synthetic */ SellerCarouselAdapter this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerCarouselAdapter$SellerViewHolder$onFavoritesClick$1(SellerCarouselAdapter.SellerViewHolder sellerViewHolder, C4911f c4911f, SellerCarouselAdapter sellerCarouselAdapter) {
        super(1);
        this.this$0 = sellerViewHolder;
        this.$container = c4911f;
        this.this$1 = sellerCarouselAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SellerActionResponse sellerActionResponse) {
        invoke2(sellerActionResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SellerActionResponse sellerActionResponse) {
        FavoriteEventManager favoriteEventManager;
        this.this$0.showMessage(sellerActionResponse.getMessage(), R$drawable.ic_favourites_tabbar, this.$container);
        favoriteEventManager = this.this$1.favoriteEventManager;
        favoriteEventManager.onFavStateUpdated(FavoriteEvent.FavoriteStateUpdated.INSTANCE);
    }
}
