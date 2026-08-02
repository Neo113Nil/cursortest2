package ru.ozon.app.android.fresh.geo.widgets.deliveryRating.data;

import G.g;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/data/DeliveryRatingDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "image", "", "newDesign", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getImage", "()Ljava/lang/String;", "getNewDesign", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/data/DeliveryRatingDTO;", "equals", "other", "hashCode", "", "toString", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryRatingDTO {

    @NotNull
    private final String image;
    private final Boolean newDesign;

    @NotNull
    private final RatingDTO rating;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public DeliveryRatingDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull RatingDTO rating, @NotNull String image, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(image, "image");
        this.title = title;
        this.subtitle = subtitle;
        this.rating = rating;
        this.image = image;
        this.newDesign = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ DeliveryRatingDTO copy$default(DeliveryRatingDTO deliveryRatingDTO, TextDTO textDTO, TextDTO textDTO2, RatingDTO ratingDTO, String str, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = deliveryRatingDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = deliveryRatingDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            ratingDTO = deliveryRatingDTO.rating;
        }
        if ((i11 & 8) != 0) {
            str = deliveryRatingDTO.image;
        }
        if ((i11 & 16) != 0) {
            bool = deliveryRatingDTO.newDesign;
        }
        if ((i11 & 32) != 0) {
            map = deliveryRatingDTO.trackingInfo;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        return deliveryRatingDTO.copy(textDTO, textDTO2, ratingDTO, str, bool2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getNewDesign() {
        return this.newDesign;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final DeliveryRatingDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull RatingDTO rating, @NotNull String image, Boolean newDesign, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(image, "image");
        return new DeliveryRatingDTO(title, subtitle, rating, image, newDesign, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryRatingDTO)) {
            return false;
        }
        DeliveryRatingDTO deliveryRatingDTO = (DeliveryRatingDTO) other;
        return Intrinsics.d(this.title, deliveryRatingDTO.title) && Intrinsics.d(this.subtitle, deliveryRatingDTO.subtitle) && Intrinsics.d(this.rating, deliveryRatingDTO.rating) && Intrinsics.d(this.image, deliveryRatingDTO.image) && Intrinsics.d(this.newDesign, deliveryRatingDTO.newDesign) && Intrinsics.d(this.trackingInfo, deliveryRatingDTO.trackingInfo);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final Boolean getNewDesign() {
        return this.newDesign;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a((this.rating.hashCode() + b.a(this.subtitle, this.title.hashCode() * 31, 31)) * 31, 31, this.image);
        Boolean bool = this.newDesign;
        int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        RatingDTO ratingDTO = this.rating;
        String str = this.image;
        Boolean bool = this.newDesign;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("DeliveryRatingDTO(title=", textDTO, ", subtitle=", textDTO2, ", rating=");
        g10.append(ratingDTO);
        g10.append(", image=");
        g10.append(str);
        g10.append(", newDesign=");
        g10.append(bool);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
