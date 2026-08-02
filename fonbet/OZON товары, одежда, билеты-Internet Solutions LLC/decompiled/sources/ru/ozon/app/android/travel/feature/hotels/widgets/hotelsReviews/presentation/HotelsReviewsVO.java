package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/presentation/HotelsReviewsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "rating", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "reviews", "", "focusedReviewIndex", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/List;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getRating", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/util/List;", "getReviews", "()Ljava/util/List;", "Ljava/lang/Integer;", "getFocusedReviewIndex", "()Ljava/lang/Integer;", "setFocusedReviewIndex", "(Ljava/lang/Integer;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsReviewsVO implements c {
    private Integer focusedReviewIndex;
    private final long id;

    @NotNull
    private final Badge rating;

    @NotNull
    private final List<ReviewVO> reviews;

    @NotNull
    private final TextAtom title;

    public HotelsReviewsVO(long j11, @NotNull TextAtom title, @NotNull Badge rating, @NotNull List<ReviewVO> reviews, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        this.id = j11;
        this.title = title;
        this.rating = rating;
        this.reviews = reviews;
        this.focusedReviewIndex = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsReviewsVO)) {
            return false;
        }
        HotelsReviewsVO hotelsReviewsVO = (HotelsReviewsVO) other;
        return this.id == hotelsReviewsVO.id && Intrinsics.d(this.title, hotelsReviewsVO.title) && Intrinsics.d(this.rating, hotelsReviewsVO.rating) && Intrinsics.d(this.reviews, hotelsReviewsVO.reviews) && Intrinsics.d(this.focusedReviewIndex, hotelsReviewsVO.focusedReviewIndex);
    }

    public final Integer getFocusedReviewIndex() {
        return this.focusedReviewIndex;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Badge getRating() {
        return this.rating;
    }

    @NotNull
    public final List<ReviewVO> getReviews() {
        return this.reviews;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.rating.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.title)) * 31, 31, this.reviews);
        Integer num = this.focusedReviewIndex;
        return b11 + (num == null ? 0 : num.hashCode());
    }

    public final void setFocusedReviewIndex(Integer num) {
        this.focusedReviewIndex = num;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        Badge badge = this.rating;
        List<ReviewVO> list = this.reviews;
        Integer num = this.focusedReviewIndex;
        StringBuilder c11 = C2639a.c("HotelsReviewsVO(id=", j11, ", title=", textAtom);
        c11.append(", rating=");
        c11.append(badge);
        c11.append(", reviews=");
        c11.append(list);
        c11.append(", focusedReviewIndex=");
        c11.append(num);
        c11.append(")");
        return c11.toString();
    }
}
