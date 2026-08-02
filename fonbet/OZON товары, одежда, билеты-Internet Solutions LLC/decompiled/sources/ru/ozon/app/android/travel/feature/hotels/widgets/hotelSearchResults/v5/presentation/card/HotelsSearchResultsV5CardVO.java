package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import G.g;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.molecules.view.awardBadge.AwardBadgeVI;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncConfig;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b<\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001sB\u0093\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u0012\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010&\u001a\u00020\u0013\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100JÒ\u0002\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00132\u0010\b\u0002\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010!\u001a\u00020\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u00132\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bE\u0010DR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bL\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bM\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bN\u0010HR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bO\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\b\u0014\u0010QR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\bV\u00104R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u001c\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010P\u001a\u0004\b\u001c\u0010QR\u001f\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010 \u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010B\u001a\u0004\b`\u0010DR\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b!\u0010P\u001a\u0004\b!\u0010QR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010d\u001a\u0004\be\u0010fR\u0017\u0010&\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b&\u0010P\u001a\u0004\bg\u0010QR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010)\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bk\u0010DR\u0019\u0010*\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bl\u0010DR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010m\u001a\u0004\bn\u0010oR\u0019\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010p\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "", "images", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rating", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "mainPrice", "priceDescription", "marketingPrice", "premiumBadge", "imageBadges", "", "isImageBadgesVisible", "Lru/ozon/uni/atoms/af/AtomAction;", "selectAction", "cardBackgroundColor", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO$ItemHeaderVO;", "marketingHeader", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "stockBar", "isShimmerState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "priceErrorMessage", "isPriceErrorMessageVisible", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteButton", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;", "asyncConfig", "canShowOnboarding", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "reviewsIcon", "reviews", "remainingOptions", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "layoutVariant", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "awardBadge", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;ZLru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO$ItemHeaderVO;Lru/ozon/app/android/atoms/data/stock/StockBar;ZLWZ/t;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;ZLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;ZLru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO$ItemHeaderVO;Lru/ozon/app/android/atoms/data/stock/StockBar;ZLWZ/t;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;ZLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAddress", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRating", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getMainPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceDescription", "getMarketingPrice", "getPremiumBadge", "getImageBadges", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getCardBackgroundColor", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO$ItemHeaderVO;", "getMarketingHeader", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO$ItemHeaderVO;", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "getPriceErrorMessage", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;", "getAsyncConfig", "()Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;", "getCanShowOnboarding", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getReviewsIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getReviews", "getRemainingOptions", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "getLayoutVariant", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "getAwardBadge", "()Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "ItemHeaderVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsSearchResultsV5CardVO implements c {

    @NotNull
    private final TextDTO address;
    private final AsyncConfig asyncConfig;
    private final AwardBadgeVI awardBadge;
    private final boolean canShowOnboarding;
    private final String cardBackgroundColor;
    private final FavoriteProductMolecule favoriteButton;
    private final long id;

    @NotNull
    private final List<BadgeDTO> imageBadges;

    @NotNull
    private final List<String> images;
    private final boolean isImageBadgesVisible;
    private final boolean isPriceErrorMessageVisible;
    private final boolean isShimmerState;

    @NotNull
    private final HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant layoutVariant;
    private final PriceDTO mainPrice;
    private final ItemHeaderVO marketingHeader;
    private final PriceDTO marketingPrice;
    private final BadgeDTO premiumBadge;
    private final TextDTO priceDescription;
    private final TextDTO priceErrorMessage;
    private final BadgeDTO rating;
    private final TextDTO remainingOptions;
    private final TextDTO reviews;
    private final IconDTO reviewsIcon;
    private final AtomAction selectAction;
    private final StockBar stockBar;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO$ItemHeaderVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "backgroundGradient", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/android/uikitsdk/Color$Gradient;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getBackgroundGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemHeaderVO {

        @NotNull
        private final Color.Gradient backgroundGradient;

        @NotNull
        private final TextDTO title;

        public ItemHeaderVO(@NotNull TextDTO title, @NotNull Color.Gradient backgroundGradient) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundGradient, "backgroundGradient");
            this.title = title;
            this.backgroundGradient = backgroundGradient;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemHeaderVO)) {
                return false;
            }
            ItemHeaderVO itemHeaderVO = (ItemHeaderVO) other;
            return Intrinsics.d(this.title, itemHeaderVO.title) && Intrinsics.d(this.backgroundGradient, itemHeaderVO.backgroundGradient);
        }

        @NotNull
        public final Color.Gradient getBackgroundGradient() {
            return this.backgroundGradient;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.backgroundGradient.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ItemHeaderVO(title=" + this.title + ", backgroundGradient=" + this.backgroundGradient + ")";
        }
    }

    public HotelsSearchResultsV5CardVO(long j11, @NotNull List<String> images, @NotNull TextDTO title, @NotNull TextDTO address, BadgeDTO badgeDTO, PriceDTO priceDTO, TextDTO textDTO, PriceDTO priceDTO2, BadgeDTO badgeDTO2, @NotNull List<BadgeDTO> imageBadges, boolean z11, AtomAction atomAction, String str, ItemHeaderVO itemHeaderVO, StockBar stockBar, boolean z12, t tVar, TextDTO textDTO2, boolean z13, FavoriteProductMolecule favoriteProductMolecule, AsyncConfig asyncConfig, boolean z14, IconDTO iconDTO, TextDTO textDTO3, TextDTO textDTO4, @NotNull HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant layoutVariant, AwardBadgeVI awardBadgeVI) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(imageBadges, "imageBadges");
        Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
        this.id = j11;
        this.images = images;
        this.title = title;
        this.address = address;
        this.rating = badgeDTO;
        this.mainPrice = priceDTO;
        this.priceDescription = textDTO;
        this.marketingPrice = priceDTO2;
        this.premiumBadge = badgeDTO2;
        this.imageBadges = imageBadges;
        this.isImageBadgesVisible = z11;
        this.selectAction = atomAction;
        this.cardBackgroundColor = str;
        this.marketingHeader = itemHeaderVO;
        this.stockBar = stockBar;
        this.isShimmerState = z12;
        this.viewEvent = tVar;
        this.priceErrorMessage = textDTO2;
        this.isPriceErrorMessageVisible = z13;
        this.favoriteButton = favoriteProductMolecule;
        this.asyncConfig = asyncConfig;
        this.canShowOnboarding = z14;
        this.reviewsIcon = iconDTO;
        this.reviews = textDTO3;
        this.remainingOptions = textDTO4;
        this.layoutVariant = layoutVariant;
        this.awardBadge = awardBadgeVI;
    }

    public static /* synthetic */ HotelsSearchResultsV5CardVO copy$default(HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO, long j11, List list, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, PriceDTO priceDTO, TextDTO textDTO3, PriceDTO priceDTO2, BadgeDTO badgeDTO2, List list2, boolean z11, AtomAction atomAction, String str, ItemHeaderVO itemHeaderVO, StockBar stockBar, boolean z12, t tVar, TextDTO textDTO4, boolean z13, FavoriteProductMolecule favoriteProductMolecule, AsyncConfig asyncConfig, boolean z14, IconDTO iconDTO, TextDTO textDTO5, TextDTO textDTO6, HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant cardLayoutVariant, AwardBadgeVI awardBadgeVI, int i11, Object obj) {
        AwardBadgeVI awardBadgeVI2;
        HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant cardLayoutVariant2;
        long j12 = (i11 & 1) != 0 ? hotelsSearchResultsV5CardVO.id : j11;
        List list3 = (i11 & 2) != 0 ? hotelsSearchResultsV5CardVO.images : list;
        TextDTO textDTO7 = (i11 & 4) != 0 ? hotelsSearchResultsV5CardVO.title : textDTO;
        TextDTO textDTO8 = (i11 & 8) != 0 ? hotelsSearchResultsV5CardVO.address : textDTO2;
        BadgeDTO badgeDTO3 = (i11 & 16) != 0 ? hotelsSearchResultsV5CardVO.rating : badgeDTO;
        PriceDTO priceDTO3 = (i11 & 32) != 0 ? hotelsSearchResultsV5CardVO.mainPrice : priceDTO;
        TextDTO textDTO9 = (i11 & 64) != 0 ? hotelsSearchResultsV5CardVO.priceDescription : textDTO3;
        PriceDTO priceDTO4 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hotelsSearchResultsV5CardVO.marketingPrice : priceDTO2;
        BadgeDTO badgeDTO4 = (i11 & 256) != 0 ? hotelsSearchResultsV5CardVO.premiumBadge : badgeDTO2;
        List list4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hotelsSearchResultsV5CardVO.imageBadges : list2;
        boolean z15 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? hotelsSearchResultsV5CardVO.isImageBadgesVisible : z11;
        AtomAction atomAction2 = (i11 & 2048) != 0 ? hotelsSearchResultsV5CardVO.selectAction : atomAction;
        String str2 = (i11 & 4096) != 0 ? hotelsSearchResultsV5CardVO.cardBackgroundColor : str;
        long j13 = j12;
        ItemHeaderVO itemHeaderVO2 = (i11 & 8192) != 0 ? hotelsSearchResultsV5CardVO.marketingHeader : itemHeaderVO;
        StockBar stockBar2 = (i11 & 16384) != 0 ? hotelsSearchResultsV5CardVO.stockBar : stockBar;
        boolean z16 = (i11 & 32768) != 0 ? hotelsSearchResultsV5CardVO.isShimmerState : z12;
        t tVar2 = (i11 & 65536) != 0 ? hotelsSearchResultsV5CardVO.viewEvent : tVar;
        TextDTO textDTO10 = (i11 & 131072) != 0 ? hotelsSearchResultsV5CardVO.priceErrorMessage : textDTO4;
        boolean z17 = (i11 & 262144) != 0 ? hotelsSearchResultsV5CardVO.isPriceErrorMessageVisible : z13;
        FavoriteProductMolecule favoriteProductMolecule2 = (i11 & 524288) != 0 ? hotelsSearchResultsV5CardVO.favoriteButton : favoriteProductMolecule;
        AsyncConfig asyncConfig2 = (i11 & 1048576) != 0 ? hotelsSearchResultsV5CardVO.asyncConfig : asyncConfig;
        boolean z18 = (i11 & 2097152) != 0 ? hotelsSearchResultsV5CardVO.canShowOnboarding : z14;
        IconDTO iconDTO2 = (i11 & 4194304) != 0 ? hotelsSearchResultsV5CardVO.reviewsIcon : iconDTO;
        TextDTO textDTO11 = (i11 & 8388608) != 0 ? hotelsSearchResultsV5CardVO.reviews : textDTO5;
        TextDTO textDTO12 = (i11 & 16777216) != 0 ? hotelsSearchResultsV5CardVO.remainingOptions : textDTO6;
        HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant cardLayoutVariant3 = (i11 & 33554432) != 0 ? hotelsSearchResultsV5CardVO.layoutVariant : cardLayoutVariant;
        if ((i11 & 67108864) != 0) {
            cardLayoutVariant2 = cardLayoutVariant3;
            awardBadgeVI2 = hotelsSearchResultsV5CardVO.awardBadge;
        } else {
            awardBadgeVI2 = awardBadgeVI;
            cardLayoutVariant2 = cardLayoutVariant3;
        }
        return hotelsSearchResultsV5CardVO.copy(j13, list3, textDTO7, textDTO8, badgeDTO3, priceDTO3, textDTO9, priceDTO4, badgeDTO4, list4, z15, atomAction2, str2, itemHeaderVO2, stockBar2, z16, tVar2, textDTO10, z17, favoriteProductMolecule2, asyncConfig2, z18, iconDTO2, textDTO11, textDTO12, cardLayoutVariant2, awardBadgeVI2);
    }

    @NotNull
    public final HotelsSearchResultsV5CardVO copy(long id2, @NotNull List<String> images, @NotNull TextDTO title, @NotNull TextDTO address, BadgeDTO rating, PriceDTO mainPrice, TextDTO priceDescription, PriceDTO marketingPrice, BadgeDTO premiumBadge, @NotNull List<BadgeDTO> imageBadges, boolean isImageBadgesVisible, AtomAction selectAction, String cardBackgroundColor, ItemHeaderVO marketingHeader, StockBar stockBar, boolean isShimmerState, t viewEvent, TextDTO priceErrorMessage, boolean isPriceErrorMessageVisible, FavoriteProductMolecule favoriteButton, AsyncConfig asyncConfig, boolean canShowOnboarding, IconDTO reviewsIcon, TextDTO reviews, TextDTO remainingOptions, @NotNull HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant layoutVariant, AwardBadgeVI awardBadge) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(imageBadges, "imageBadges");
        Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
        return new HotelsSearchResultsV5CardVO(id2, images, title, address, rating, mainPrice, priceDescription, marketingPrice, premiumBadge, imageBadges, isImageBadgesVisible, selectAction, cardBackgroundColor, marketingHeader, stockBar, isShimmerState, viewEvent, priceErrorMessage, isPriceErrorMessageVisible, favoriteButton, asyncConfig, canShowOnboarding, reviewsIcon, reviews, remainingOptions, layoutVariant, awardBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsSearchResultsV5CardVO)) {
            return false;
        }
        HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = (HotelsSearchResultsV5CardVO) other;
        return this.id == hotelsSearchResultsV5CardVO.id && Intrinsics.d(this.images, hotelsSearchResultsV5CardVO.images) && Intrinsics.d(this.title, hotelsSearchResultsV5CardVO.title) && Intrinsics.d(this.address, hotelsSearchResultsV5CardVO.address) && Intrinsics.d(this.rating, hotelsSearchResultsV5CardVO.rating) && Intrinsics.d(this.mainPrice, hotelsSearchResultsV5CardVO.mainPrice) && Intrinsics.d(this.priceDescription, hotelsSearchResultsV5CardVO.priceDescription) && Intrinsics.d(this.marketingPrice, hotelsSearchResultsV5CardVO.marketingPrice) && Intrinsics.d(this.premiumBadge, hotelsSearchResultsV5CardVO.premiumBadge) && Intrinsics.d(this.imageBadges, hotelsSearchResultsV5CardVO.imageBadges) && this.isImageBadgesVisible == hotelsSearchResultsV5CardVO.isImageBadgesVisible && Intrinsics.d(this.selectAction, hotelsSearchResultsV5CardVO.selectAction) && Intrinsics.d(this.cardBackgroundColor, hotelsSearchResultsV5CardVO.cardBackgroundColor) && Intrinsics.d(this.marketingHeader, hotelsSearchResultsV5CardVO.marketingHeader) && Intrinsics.d(this.stockBar, hotelsSearchResultsV5CardVO.stockBar) && this.isShimmerState == hotelsSearchResultsV5CardVO.isShimmerState && Intrinsics.d(this.viewEvent, hotelsSearchResultsV5CardVO.viewEvent) && Intrinsics.d(this.priceErrorMessage, hotelsSearchResultsV5CardVO.priceErrorMessage) && this.isPriceErrorMessageVisible == hotelsSearchResultsV5CardVO.isPriceErrorMessageVisible && Intrinsics.d(this.favoriteButton, hotelsSearchResultsV5CardVO.favoriteButton) && Intrinsics.d(this.asyncConfig, hotelsSearchResultsV5CardVO.asyncConfig) && this.canShowOnboarding == hotelsSearchResultsV5CardVO.canShowOnboarding && Intrinsics.d(this.reviewsIcon, hotelsSearchResultsV5CardVO.reviewsIcon) && Intrinsics.d(this.reviews, hotelsSearchResultsV5CardVO.reviews) && Intrinsics.d(this.remainingOptions, hotelsSearchResultsV5CardVO.remainingOptions) && this.layoutVariant == hotelsSearchResultsV5CardVO.layoutVariant && Intrinsics.d(this.awardBadge, hotelsSearchResultsV5CardVO.awardBadge);
    }

    @NotNull
    public final TextDTO getAddress() {
        return this.address;
    }

    public final AsyncConfig getAsyncConfig() {
        return this.asyncConfig;
    }

    public final AwardBadgeVI getAwardBadge() {
        return this.awardBadge;
    }

    public final boolean getCanShowOnboarding() {
        return this.canShowOnboarding;
    }

    public final String getCardBackgroundColor() {
        return this.cardBackgroundColor;
    }

    public final FavoriteProductMolecule getFavoriteButton() {
        return this.favoriteButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<BadgeDTO> getImageBadges() {
        return this.imageBadges;
    }

    @NotNull
    public final List<String> getImages() {
        return this.images;
    }

    @NotNull
    public final HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant getLayoutVariant() {
        return this.layoutVariant;
    }

    public final PriceDTO getMainPrice() {
        return this.mainPrice;
    }

    public final ItemHeaderVO getMarketingHeader() {
        return this.marketingHeader;
    }

    public final PriceDTO getMarketingPrice() {
        return this.marketingPrice;
    }

    public final BadgeDTO getPremiumBadge() {
        return this.premiumBadge;
    }

    public final TextDTO getPriceDescription() {
        return this.priceDescription;
    }

    public final TextDTO getPriceErrorMessage() {
        return this.priceErrorMessage;
    }

    public final BadgeDTO getRating() {
        return this.rating;
    }

    public final TextDTO getRemainingOptions() {
        return this.remainingOptions;
    }

    public final TextDTO getReviews() {
        return this.reviews;
    }

    public final IconDTO getReviewsIcon() {
        return this.reviewsIcon;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AtomAction getSelectAction() {
        return this.selectAction;
    }

    public final StockBar getStockBar() {
        return this.stockBar;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.address, b.a(this.title, g.b(Long.hashCode(this.id) * 31, 31, this.images), 31), 31);
        BadgeDTO badgeDTO = this.rating;
        int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.mainPrice;
        int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        TextDTO textDTO = this.priceDescription;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        PriceDTO priceDTO2 = this.marketingPrice;
        int hashCode4 = (hashCode3 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.premiumBadge;
        int a12 = C3532b.a(g.b((hashCode4 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31, 31, this.imageBadges), 31, this.isImageBadgesVisible);
        AtomAction atomAction = this.selectAction;
        int hashCode5 = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.cardBackgroundColor;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        ItemHeaderVO itemHeaderVO = this.marketingHeader;
        int hashCode7 = (hashCode6 + (itemHeaderVO == null ? 0 : itemHeaderVO.hashCode())) * 31;
        StockBar stockBar = this.stockBar;
        int a13 = C3532b.a((hashCode7 + (stockBar == null ? 0 : stockBar.hashCode())) * 31, 31, this.isShimmerState);
        t tVar = this.viewEvent;
        int hashCode8 = (a13 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TextDTO textDTO2 = this.priceErrorMessage;
        int a14 = C3532b.a((hashCode8 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.isPriceErrorMessageVisible);
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        int hashCode9 = (a14 + (favoriteProductMolecule == null ? 0 : favoriteProductMolecule.hashCode())) * 31;
        AsyncConfig asyncConfig = this.asyncConfig;
        int a15 = C3532b.a((hashCode9 + (asyncConfig == null ? 0 : asyncConfig.hashCode())) * 31, 31, this.canShowOnboarding);
        IconDTO iconDTO = this.reviewsIcon;
        int hashCode10 = (a15 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        TextDTO textDTO3 = this.reviews;
        int hashCode11 = (hashCode10 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        TextDTO textDTO4 = this.remainingOptions;
        int hashCode12 = (this.layoutVariant.hashCode() + ((hashCode11 + (textDTO4 == null ? 0 : textDTO4.hashCode())) * 31)) * 31;
        AwardBadgeVI awardBadgeVI = this.awardBadge;
        return hashCode12 + (awardBadgeVI != null ? awardBadgeVI.hashCode() : 0);
    }

    /* renamed from: isImageBadgesVisible, reason: from getter */
    public final boolean getIsImageBadgesVisible() {
        return this.isImageBadgesVisible;
    }

    /* renamed from: isPriceErrorMessageVisible, reason: from getter */
    public final boolean getIsPriceErrorMessageVisible() {
        return this.isPriceErrorMessageVisible;
    }

    /* renamed from: isShimmerState, reason: from getter */
    public final boolean getIsShimmerState() {
        return this.isShimmerState;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<String> list = this.images;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.address;
        BadgeDTO badgeDTO = this.rating;
        PriceDTO priceDTO = this.mainPrice;
        TextDTO textDTO3 = this.priceDescription;
        PriceDTO priceDTO2 = this.marketingPrice;
        BadgeDTO badgeDTO2 = this.premiumBadge;
        List<BadgeDTO> list2 = this.imageBadges;
        boolean z11 = this.isImageBadgesVisible;
        AtomAction atomAction = this.selectAction;
        String str = this.cardBackgroundColor;
        ItemHeaderVO itemHeaderVO = this.marketingHeader;
        StockBar stockBar = this.stockBar;
        boolean z12 = this.isShimmerState;
        t tVar = this.viewEvent;
        TextDTO textDTO4 = this.priceErrorMessage;
        boolean z13 = this.isPriceErrorMessageVisible;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        AsyncConfig asyncConfig = this.asyncConfig;
        boolean z14 = this.canShowOnboarding;
        IconDTO iconDTO = this.reviewsIcon;
        TextDTO textDTO5 = this.reviews;
        TextDTO textDTO6 = this.remainingOptions;
        HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant cardLayoutVariant = this.layoutVariant;
        AwardBadgeVI awardBadgeVI = this.awardBadge;
        StringBuilder b11 = Lh.b.b(j11, "HotelsSearchResultsV5CardVO(id=", ", images=", list);
        D3.g.i(", title=", ", address=", b11, textDTO, textDTO2);
        b11.append(", rating=");
        b11.append(badgeDTO);
        b11.append(", mainPrice=");
        b11.append(priceDTO);
        b11.append(", priceDescription=");
        b11.append(textDTO3);
        b11.append(", marketingPrice=");
        b11.append(priceDTO2);
        b11.append(", premiumBadge=");
        b11.append(badgeDTO2);
        b11.append(", imageBadges=");
        b11.append(list2);
        b11.append(", isImageBadgesVisible=");
        b11.append(z11);
        b11.append(", selectAction=");
        b11.append(atomAction);
        b11.append(", cardBackgroundColor=");
        b11.append(str);
        b11.append(", marketingHeader=");
        b11.append(itemHeaderVO);
        b11.append(", stockBar=");
        b11.append(stockBar);
        b11.append(", isShimmerState=");
        b11.append(z12);
        b11.append(", viewEvent=");
        b11.append(tVar);
        b11.append(", priceErrorMessage=");
        b11.append(textDTO4);
        b11.append(", isPriceErrorMessageVisible=");
        b11.append(z13);
        b11.append(", favoriteButton=");
        b11.append(favoriteProductMolecule);
        b11.append(", asyncConfig=");
        b11.append(asyncConfig);
        b11.append(", canShowOnboarding=");
        b11.append(z14);
        b11.append(", reviewsIcon=");
        b11.append(iconDTO);
        b11.append(", reviews=");
        b11.append(textDTO5);
        b11.append(", remainingOptions=");
        b11.append(textDTO6);
        b11.append(", layoutVariant=");
        b11.append(cardLayoutVariant);
        b11.append(", awardBadge=");
        b11.append(awardBadgeVI);
        b11.append(")");
        return b11.toString();
    }
}
