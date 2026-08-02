package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import W10.c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jq\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView;", "productInfoView", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ProductInfo;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favDelegateFactory", "Lru/ozon/composer/ui/widget/l;", "viewItem", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "cartButtonContainerBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "analytics", "", "widgetId", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ProductInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/composer/ui/widget/l;LW10/c;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;LWZ/l;Ljava/lang/Long;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductInfoViewHolder extends RecyclerView.C {

    @NotNull
    private final ProductInfoView productInfoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductInfoViewHolder(@NotNull ProductInfoView productInfoView) {
        super(productInfoView);
        Intrinsics.checkNotNullParameter(productInfoView, "productInfoView");
        this.productInfoView = productInfoView;
    }

    public final void bind(@NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo item, Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<? extends FavoriteProductV4Delegate> favDelegateFactory, l viewItem, @NotNull c trackingData, @NotNull ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder, WZ.l analytics, Long widgetId) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(favDelegateFactory, "favDelegateFactory");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(cartButtonContainerBinder, "cartButtonContainerBinder");
        this.productInfoView.bind(item, actionHandler, favDelegateFactory, viewItem, trackingData, analytics, widgetId, cartButtonContainerBinder);
    }
}
