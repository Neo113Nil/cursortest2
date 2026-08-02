package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.data;

import G.g;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.shared.review.data.ReviewDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/data/HotelsPageReviewsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "rating", "Lru/ozon/uni/atoms/data/badge/Badge;", "reviewCards", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO;", "showMoreButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRating", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getReviewCards", "()Ljava/util/List;", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageReviewsDTO {
    public static final int $stable = 8;

    @NotNull
    private final Badge rating;

    @NotNull
    private final List<ReviewDTO> reviewCards;

    @NotNull
    private final ButtonV3Atom.LargeButton showMoreButton;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HotelsPageReviewsDTO(@NotNull TextAtom title, @NotNull Badge rating, @NotNull List<ReviewDTO> reviewCards, @NotNull ButtonV3Atom.LargeButton showMoreButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(reviewCards, "reviewCards");
        Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
        this.title = title;
        this.rating = rating;
        this.reviewCards = reviewCards;
        this.showMoreButton = showMoreButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HotelsPageReviewsDTO copy$default(HotelsPageReviewsDTO hotelsPageReviewsDTO, TextAtom textAtom, Badge badge, List list, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = hotelsPageReviewsDTO.title;
        }
        if ((i11 & 2) != 0) {
            badge = hotelsPageReviewsDTO.rating;
        }
        if ((i11 & 4) != 0) {
            list = hotelsPageReviewsDTO.reviewCards;
        }
        if ((i11 & 8) != 0) {
            largeButton = hotelsPageReviewsDTO.showMoreButton;
        }
        if ((i11 & 16) != 0) {
            map = hotelsPageReviewsDTO.trackingInfo;
        }
        Map map2 = map;
        List list2 = list;
        return hotelsPageReviewsDTO.copy(textAtom, badge, list2, largeButton, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Badge getRating() {
        return this.rating;
    }

    @NotNull
    public final List<ReviewDTO> component3() {
        return this.reviewCards;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getShowMoreButton() {
        return this.showMoreButton;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsPageReviewsDTO copy(@NotNull TextAtom title, @NotNull Badge rating, @NotNull List<ReviewDTO> reviewCards, @NotNull ButtonV3Atom.LargeButton showMoreButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(reviewCards, "reviewCards");
        Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
        return new HotelsPageReviewsDTO(title, rating, reviewCards, showMoreButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageReviewsDTO)) {
            return false;
        }
        HotelsPageReviewsDTO hotelsPageReviewsDTO = (HotelsPageReviewsDTO) other;
        return Intrinsics.d(this.title, hotelsPageReviewsDTO.title) && Intrinsics.d(this.rating, hotelsPageReviewsDTO.rating) && Intrinsics.d(this.reviewCards, hotelsPageReviewsDTO.reviewCards) && Intrinsics.d(this.showMoreButton, hotelsPageReviewsDTO.showMoreButton) && Intrinsics.d(this.trackingInfo, hotelsPageReviewsDTO.trackingInfo);
    }

    @NotNull
    public final Badge getRating() {
        return this.rating;
    }

    @NotNull
    public final List<ReviewDTO> getReviewCards() {
        return this.reviewCards;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getShowMoreButton() {
        return this.showMoreButton;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.showMoreButton, g.b((this.rating.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.reviewCards), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        Badge badge = this.rating;
        List<ReviewDTO> list = this.reviewCards;
        ButtonV3Atom.LargeButton largeButton = this.showMoreButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HotelsPageReviewsDTO(title=");
        sb2.append(textAtom);
        sb2.append(", rating=");
        sb2.append(badge);
        sb2.append(", reviewCards=");
        sb2.append(list);
        sb2.append(", showMoreButton=");
        sb2.append(largeButton);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
