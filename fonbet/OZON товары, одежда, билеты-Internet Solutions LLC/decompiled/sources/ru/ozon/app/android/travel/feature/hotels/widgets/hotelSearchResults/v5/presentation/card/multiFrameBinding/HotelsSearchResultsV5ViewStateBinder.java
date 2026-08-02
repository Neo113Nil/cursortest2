package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.ViewHolderLifecycle;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5ViewStateBinder;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/ViewHolderLifecycle;", "<init>", "()V", "", "bindAwardBadge", "bindImages", "bindTitle", "bindAddress", "bindReviews", "bindReviewsIcon", "bindRatingBadge", "bindPromoTitle", "bindPromoView", "bindImageBadges", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;", "itemView", "initView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "prepare", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "Lkotlin/jvm/functions/Function1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5ViewStateBinder implements ViewHolderLifecycle {
    private Function1<? super AtomAction, Unit> actionHandler;
    private HotelsSearchResultsV5CardVO item;
    private HotelsSearchResultsV5CardView itemView;

    public void bindAddress() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindAddress(hotelsSearchResultsV5CardVO.getAddress());
    }

    public void bindAwardBadge() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindAwardBadge(hotelsSearchResultsV5CardVO.getAwardBadge());
    }

    public void bindImageBadges() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindImageBadges(hotelsSearchResultsV5CardVO.getImageBadges(), hotelsSearchResultsV5CardVO.getIsImageBadgesVisible());
    }

    public void bindImages() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindImages(hotelsSearchResultsV5CardVO.getImages());
    }

    public void bindPromoTitle() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        HotelsSearchResultsV5CardVO.ItemHeaderVO marketingHeader = hotelsSearchResultsV5CardVO.getMarketingHeader();
        hotelsSearchResultsV5CardView.bindPromoTitle(marketingHeader != null ? marketingHeader.getTitle() : null);
    }

    public void bindPromoView() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        HotelsSearchResultsV5CardVO.ItemHeaderVO marketingHeader = hotelsSearchResultsV5CardVO.getMarketingHeader();
        hotelsSearchResultsV5CardView.bindBackground(marketingHeader != null ? marketingHeader.getBackgroundGradient() : null, hotelsSearchResultsV5CardVO.getCardBackgroundColor());
    }

    public void bindRatingBadge() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindRatingBadge(hotelsSearchResultsV5CardVO.getRating(), this.actionHandler);
    }

    public void bindReviews() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindReviews(hotelsSearchResultsV5CardVO.getReviews());
    }

    public void bindReviewsIcon() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindReviewsIcon(hotelsSearchResultsV5CardVO.getReviewsIcon());
    }

    public void bindTitle() {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = this.item;
        if (hotelsSearchResultsV5CardVO == null || (hotelsSearchResultsV5CardView = this.itemView) == null) {
            return;
        }
        hotelsSearchResultsV5CardView.bindTitle(hotelsSearchResultsV5CardVO.getTitle());
    }

    public final void initView(@NotNull HotelsSearchResultsV5CardView itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.itemView = itemView;
    }

    public void onAttach() {
        ViewHolderLifecycle.DefaultImpls.onAttach(this);
    }

    public void onDetach() {
        ViewHolderLifecycle.DefaultImpls.onDetach(this);
    }

    public void onOffscreenPositionChanged(float f7) {
        ViewHolderLifecycle.DefaultImpls.onOffscreenPositionChanged(this, f7);
    }

    public void onRecycle() {
        ViewHolderLifecycle.DefaultImpls.onRecycle(this);
    }

    public final void prepare(@NotNull HotelsSearchResultsV5CardVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.item = item;
        this.actionHandler = actionHandler;
    }
}
