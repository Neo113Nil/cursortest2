package ru.ozon.app.android.marketing.widgets.sellerCarousel.core;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerCarouselDTO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselVO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselViewHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerCarouselDTO;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselVO;", "sellerMapper", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerMapper;", "sellerFavoriteService", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "<init>", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerMapper;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;)V", "layout", "", "getLayout", "()Ljava/lang/Integer;", "mapper", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselMapper;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerCarouselViewMapper extends WidgetViewMapper<SellerCarouselDTO, SellerCarouselVO> {

    @NotNull
    private final Function2<View, ComposerReferences, SellerCarouselViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final SellerCarouselMapper mapper;

    public SellerCarouselViewMapper(@NotNull SellerMapper sellerMapper, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull FavoriteEventManager favoriteEventManager) {
        Intrinsics.checkNotNullParameter(sellerMapper, "sellerMapper");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        this.layout = R$layout.widget_seller_carousel;
        this.mapper = new SellerCarouselMapper(sellerMapper);
        this.holderProducer = new SellerCarouselViewMapper$holderProducer$1(sellerFavoriteService, adultHandler, featureChecker, favoriteEventManager);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SellerCarouselVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SellerCarouselDTO, d, List<SellerCarouselVO>> getMapper() {
        return this.mapper;
    }
}
