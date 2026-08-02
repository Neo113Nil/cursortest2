package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import G.g;
import Nh.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\t\u00108\u001a\u00020\u0016HÆ\u0003J¯\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010:\u001a\u00020\u00162\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010+¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/CardInfoDTO;", "", "id", "", "images", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "rating", "ratingBackgroundColor", "reviewsText", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceText", "badgeText", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "galleryTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isOzonChoice", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;Ljava/util/Map;Z)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getTitle", "getRating", "getRatingBackgroundColor", "getReviewsText", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceText", "getBadgeText", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "getGalleryTrackingInfo", "()Ljava/util/Map;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CardInfoDTO {
    private final String badgeText;
    private final CommonControlSettings common;
    private final FavoriteProductMoleculeV4 favoriteButton;
    private final Map<String, TokenizedTrackingInfo> galleryTrackingInfo;

    @NotNull
    private final String id;

    @NotNull
    private final List<String> images;
    private final boolean isOzonChoice;
    private final PriceDTO price;
    private final String priceText;
    private final String rating;
    private final String ratingBackgroundColor;
    private final String reviewsText;

    @NotNull
    private final String title;

    public CardInfoDTO(@NotNull String id2, @NotNull List<String> images, @NotNull String title, String str, String str2, String str3, PriceDTO priceDTO, String str4, String str5, CommonControlSettings commonControlSettings, FavoriteProductMoleculeV4 favoriteProductMoleculeV4, Map<String, TokenizedTrackingInfo> map, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.images = images;
        this.title = title;
        this.rating = str;
        this.ratingBackgroundColor = str2;
        this.reviewsText = str3;
        this.price = priceDTO;
        this.priceText = str4;
        this.badgeText = str5;
        this.common = commonControlSettings;
        this.favoriteButton = favoriteProductMoleculeV4;
        this.galleryTrackingInfo = map;
        this.isOzonChoice = z11;
    }

    public static /* synthetic */ CardInfoDTO copy$default(CardInfoDTO cardInfoDTO, String str, List list, String str2, String str3, String str4, String str5, PriceDTO priceDTO, String str6, String str7, CommonControlSettings commonControlSettings, FavoriteProductMoleculeV4 favoriteProductMoleculeV4, Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardInfoDTO.id;
        }
        return cardInfoDTO.copy(str, (i11 & 2) != 0 ? cardInfoDTO.images : list, (i11 & 4) != 0 ? cardInfoDTO.title : str2, (i11 & 8) != 0 ? cardInfoDTO.rating : str3, (i11 & 16) != 0 ? cardInfoDTO.ratingBackgroundColor : str4, (i11 & 32) != 0 ? cardInfoDTO.reviewsText : str5, (i11 & 64) != 0 ? cardInfoDTO.price : priceDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cardInfoDTO.priceText : str6, (i11 & 256) != 0 ? cardInfoDTO.badgeText : str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cardInfoDTO.common : commonControlSettings, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cardInfoDTO.favoriteButton : favoriteProductMoleculeV4, (i11 & 2048) != 0 ? cardInfoDTO.galleryTrackingInfo : map, (i11 & 4096) != 0 ? cardInfoDTO.isOzonChoice : z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component11, reason: from getter */
    public final FavoriteProductMoleculeV4 getFavoriteButton() {
        return this.favoriteButton;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.galleryTrackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsOzonChoice() {
        return this.isOzonChoice;
    }

    @NotNull
    public final List<String> component2() {
        return this.images;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRating() {
        return this.rating;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRatingBackgroundColor() {
        return this.ratingBackgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReviewsText() {
        return this.reviewsText;
    }

    /* renamed from: component7, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPriceText() {
        return this.priceText;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @NotNull
    public final CardInfoDTO copy(@NotNull String id2, @NotNull List<String> images, @NotNull String title, String rating, String ratingBackgroundColor, String reviewsText, PriceDTO price, String priceText, String badgeText, CommonControlSettings common, FavoriteProductMoleculeV4 favoriteButton, Map<String, TokenizedTrackingInfo> galleryTrackingInfo, boolean isOzonChoice) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CardInfoDTO(id2, images, title, rating, ratingBackgroundColor, reviewsText, price, priceText, badgeText, common, favoriteButton, galleryTrackingInfo, isOzonChoice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfoDTO)) {
            return false;
        }
        CardInfoDTO cardInfoDTO = (CardInfoDTO) other;
        return Intrinsics.d(this.id, cardInfoDTO.id) && Intrinsics.d(this.images, cardInfoDTO.images) && Intrinsics.d(this.title, cardInfoDTO.title) && Intrinsics.d(this.rating, cardInfoDTO.rating) && Intrinsics.d(this.ratingBackgroundColor, cardInfoDTO.ratingBackgroundColor) && Intrinsics.d(this.reviewsText, cardInfoDTO.reviewsText) && Intrinsics.d(this.price, cardInfoDTO.price) && Intrinsics.d(this.priceText, cardInfoDTO.priceText) && Intrinsics.d(this.badgeText, cardInfoDTO.badgeText) && Intrinsics.d(this.common, cardInfoDTO.common) && Intrinsics.d(this.favoriteButton, cardInfoDTO.favoriteButton) && Intrinsics.d(this.galleryTrackingInfo, cardInfoDTO.galleryTrackingInfo) && this.isOzonChoice == cardInfoDTO.isOzonChoice;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final FavoriteProductMoleculeV4 getFavoriteButton() {
        return this.favoriteButton;
    }

    public final Map<String, TokenizedTrackingInfo> getGalleryTrackingInfo() {
        return this.galleryTrackingInfo;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getImages() {
        return this.images;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final String getPriceText() {
        return this.priceText;
    }

    public final String getRating() {
        return this.rating;
    }

    public final String getRatingBackgroundColor() {
        return this.ratingBackgroundColor;
    }

    public final String getReviewsText() {
        return this.reviewsText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(g.b(this.id.hashCode() * 31, 31, this.images), 31, this.title);
        String str = this.rating;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ratingBackgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reviewsText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PriceDTO priceDTO = this.price;
        int hashCode4 = (hashCode3 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        String str4 = this.priceText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.badgeText;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode7 = (hashCode6 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = this.favoriteButton;
        int hashCode8 = (hashCode7 + (favoriteProductMoleculeV4 == null ? 0 : favoriteProductMoleculeV4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.galleryTrackingInfo;
        return Boolean.hashCode(this.isOzonChoice) + ((hashCode8 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final boolean isOzonChoice() {
        return this.isOzonChoice;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        List<String> list = this.images;
        String str2 = this.title;
        String str3 = this.rating;
        String str4 = this.ratingBackgroundColor;
        String str5 = this.reviewsText;
        PriceDTO priceDTO = this.price;
        String str6 = this.priceText;
        String str7 = this.badgeText;
        CommonControlSettings commonControlSettings = this.common;
        FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = this.favoriteButton;
        Map<String, TokenizedTrackingInfo> map = this.galleryTrackingInfo;
        boolean z11 = this.isOzonChoice;
        StringBuilder f7 = b.f("CardInfoDTO(id=", str, ", images=", ", title=", list);
        a.h(f7, str2, ", rating=", str3, ", ratingBackgroundColor=");
        a.h(f7, str4, ", reviewsText=", str5, ", price=");
        f7.append(priceDTO);
        f7.append(", priceText=");
        f7.append(str6);
        f7.append(", badgeText=");
        f7.append(str7);
        f7.append(", common=");
        f7.append(commonControlSettings);
        f7.append(", favoriteButton=");
        f7.append(favoriteProductMoleculeV4);
        f7.append(", galleryTrackingInfo=");
        f7.append(map);
        f7.append(", isOzonChoice=");
        return Pk0.a.a(")", f7, z11);
    }

    public CardInfoDTO(String str, List list, String str2, String str3, String str4, String str5, PriceDTO priceDTO, String str6, String str7, CommonControlSettings commonControlSettings, FavoriteProductMoleculeV4 favoriteProductMoleculeV4, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? K.f71697a : list, str2, str3, str4, str5, priceDTO, str6, str7, commonControlSettings, favoriteProductMoleculeV4, map, (i11 & 4096) != 0 ? false : z11);
    }
}
