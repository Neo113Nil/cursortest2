package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.review.data.ReviewDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/data/HotelsReviewsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "rating", "Lru/ozon/uni/atoms/data/badge/Badge;", "reviewCards", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO;", "focusedReviewId", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRating", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getReviewCards", "()Ljava/util/List;", "getFocusedReviewId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsReviewsDTO {
    public static final int $stable = 8;
    private final String focusedReviewId;

    @NotNull
    private final Badge rating;

    @NotNull
    private final List<ReviewDTO> reviewCards;

    @NotNull
    private final TextAtom title;

    public HotelsReviewsDTO(@NotNull TextAtom title, @NotNull Badge rating, @NotNull List<ReviewDTO> reviewCards, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(reviewCards, "reviewCards");
        this.title = title;
        this.rating = rating;
        this.reviewCards = reviewCards;
        this.focusedReviewId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsReviewsDTO copy$default(HotelsReviewsDTO hotelsReviewsDTO, TextAtom textAtom, Badge badge, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = hotelsReviewsDTO.title;
        }
        if ((i11 & 2) != 0) {
            badge = hotelsReviewsDTO.rating;
        }
        if ((i11 & 4) != 0) {
            list = hotelsReviewsDTO.reviewCards;
        }
        if ((i11 & 8) != 0) {
            str = hotelsReviewsDTO.focusedReviewId;
        }
        return hotelsReviewsDTO.copy(textAtom, badge, list, str);
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

    /* renamed from: component4, reason: from getter */
    public final String getFocusedReviewId() {
        return this.focusedReviewId;
    }

    @NotNull
    public final HotelsReviewsDTO copy(@NotNull TextAtom title, @NotNull Badge rating, @NotNull List<ReviewDTO> reviewCards, String focusedReviewId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(reviewCards, "reviewCards");
        return new HotelsReviewsDTO(title, rating, reviewCards, focusedReviewId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsReviewsDTO)) {
            return false;
        }
        HotelsReviewsDTO hotelsReviewsDTO = (HotelsReviewsDTO) other;
        return Intrinsics.d(this.title, hotelsReviewsDTO.title) && Intrinsics.d(this.rating, hotelsReviewsDTO.rating) && Intrinsics.d(this.reviewCards, hotelsReviewsDTO.reviewCards) && Intrinsics.d(this.focusedReviewId, hotelsReviewsDTO.focusedReviewId);
    }

    public final String getFocusedReviewId() {
        return this.focusedReviewId;
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
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = g.b((this.rating.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.reviewCards);
        String str = this.focusedReviewId;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "HotelsReviewsDTO(title=" + this.title + ", rating=" + this.rating + ", reviewCards=" + this.reviewCards + ", focusedReviewId=" + this.focusedReviewId + ")";
    }
}
