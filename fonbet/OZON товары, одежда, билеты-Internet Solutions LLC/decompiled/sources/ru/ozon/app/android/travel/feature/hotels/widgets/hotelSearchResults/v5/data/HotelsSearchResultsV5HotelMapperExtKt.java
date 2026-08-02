package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data;

import WZ.t;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2ExtKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncConfig;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradients;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\f\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u000eH\u0002¨\u0006\u000f"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO;", "context", "Landroid/content/Context;", "asyncConfig", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO$ItemHeaderVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$ItemHeader;", "toGradientVO", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "", "toFavoriteProductMolecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5HotelMapperExtKt {
    private static final FavoriteProductMolecule toFavoriteProductMolecule(Object obj) {
        if (obj == null || !(obj instanceof FavoriteProductMoleculeV2)) {
            return null;
        }
        return FavoriteProductMoleculeV2ExtKt.mapToV1$default((FavoriteProductMoleculeV2) obj, false, 1, null);
    }

    private static final Color.Gradient toGradientVO(String str, Context context) {
        Color.Gradient gradient;
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(str);
        return (gradientByToken == null || (gradient = TokensExtKt.toGradient(gradientByToken, context)) == null) ? TokensExtKt.toGradient(UniGradients.GR_GIFT.getGradient(), context) : gradient;
    }

    @NotNull
    public static final HotelsSearchResultsV5CardVO toVO(@NotNull HotelsSearchResultsV5DTO.HotelItemDTO hotelItemDTO, @NotNull Context context, AsyncConfig asyncConfig) {
        long hashCode;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(hotelItemDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Long y02 = h.y0(hotelItemDTO.getHotelId());
        if (y02 != null) {
            hashCode = y02.longValue();
        } else {
            OzonSpannableString text = hotelItemDTO.getTitle().getText();
            OzonSpannableString text2 = hotelItemDTO.getAddress().getText();
            PriceDTO mainPrice = hotelItemDTO.getMainPrice();
            hashCode = (((Object) text) + " " + ((Object) text2) + " " + (mainPrice != null ? mainPrice.getPrice() : null)).hashCode();
        }
        long j11 = hashCode;
        TextDTO title = hotelItemDTO.getTitle();
        List<String> images = hotelItemDTO.getImages();
        TextDTO address = hotelItemDTO.getAddress();
        BadgeDTO rating = hotelItemDTO.getRating();
        PriceDTO mainPrice2 = hotelItemDTO.getMainPrice();
        TextDTO priceDescription = hotelItemDTO.getPriceDescription();
        PriceDTO marketingPrice = hotelItemDTO.getMarketingPrice();
        BadgeDTO premiumBadge = hotelItemDTO.getPremiumBadge();
        List<BadgeDTO> imageBadges = hotelItemDTO.getImageBadges();
        CommonControlSettings common = hotelItemDTO.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, hotelItemDTO.getCommon().getTrackingInfo());
        String cardBackgroundColor = hotelItemDTO.getCardBackgroundColor();
        HotelsSearchResultsV5DTO.HotelItemDTO.ItemHeader marketingHeader = hotelItemDTO.getMarketingHeader();
        HotelsSearchResultsV5CardVO.ItemHeaderVO vo = marketingHeader != null ? toVO(marketingHeader, context) : null;
        StockBar stockBar = hotelItemDTO.getStockBar();
        boolean z11 = !hotelItemDTO.getImageBadges().isEmpty();
        boolean isShimmerState = hotelItemDTO.isShimmerState();
        CommonControlSettings common2 = hotelItemDTO.getCommon();
        t mapToTokenizedEvent$default = (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        TextDTO priceErrorMessage = hotelItemDTO.getPriceErrorMessage();
        boolean z12 = hotelItemDTO.getPriceErrorMessage() != null;
        FavoriteProductMolecule favoriteProductMolecule = toFavoriteProductMolecule(hotelItemDTO.getFavoriteButton());
        boolean canShowOnboarding = hotelItemDTO.getCanShowOnboarding();
        IconDTO reviewsIcon = hotelItemDTO.getReviewsIcon();
        TextDTO reviews = hotelItemDTO.getReviews();
        TextDTO remainingOptions = hotelItemDTO.getRemainingOptions();
        HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant layoutVariant = hotelItemDTO.getLayoutVariant();
        AwardBadgeDTO awardBadge = hotelItemDTO.getAwardBadge();
        return new HotelsSearchResultsV5CardVO(j11, images, title, address, rating, mainPrice2, priceDescription, marketingPrice, premiumBadge, imageBadges, z11, atomAction, cardBackgroundColor, vo, stockBar, isShimmerState, mapToTokenizedEvent$default, priceErrorMessage, z12, favoriteProductMolecule, asyncConfig, canShowOnboarding, reviewsIcon, reviews, remainingOptions, layoutVariant, awardBadge != null ? MapperExtKt.toVI(awardBadge) : null);
    }

    public static /* synthetic */ HotelsSearchResultsV5CardVO toVO$default(HotelsSearchResultsV5DTO.HotelItemDTO hotelItemDTO, Context context, AsyncConfig asyncConfig, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            asyncConfig = null;
        }
        return toVO(hotelItemDTO, context, asyncConfig);
    }

    private static final HotelsSearchResultsV5CardVO.ItemHeaderVO toVO(HotelsSearchResultsV5DTO.HotelItemDTO.ItemHeader itemHeader, Context context) {
        return new HotelsSearchResultsV5CardVO.ItemHeaderVO(itemHeader.getTitle(), toGradientVO(itemHeader.getBackgroundGradientToken(), context));
    }
}
