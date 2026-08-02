package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Lh.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/presentation/HotelsPageReviewsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "rating", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "reviews", "tallestReview", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "showMoreButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getRating", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/util/List;", "getReviews", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "getTallestReview", "()Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageReviewsVO implements c {
    private final long id;

    @NotNull
    private final Badge rating;

    @NotNull
    private final List<ReviewVO> reviews;

    @NotNull
    private final ButtonV3Atom.LargeButton showMoreButton;
    private final ReviewVO tallestReview;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    public HotelsPageReviewsVO(long j11, @NotNull TextAtom title, @NotNull Badge rating, @NotNull List<ReviewVO> reviews, ReviewVO reviewVO, @NotNull ButtonV3Atom.LargeButton showMoreButton, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
        this.id = j11;
        this.title = title;
        this.rating = rating;
        this.reviews = reviews;
        this.tallestReview = reviewVO;
        this.showMoreButton = showMoreButton;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageReviewsVO)) {
            return false;
        }
        HotelsPageReviewsVO hotelsPageReviewsVO = (HotelsPageReviewsVO) other;
        return this.id == hotelsPageReviewsVO.id && Intrinsics.d(this.title, hotelsPageReviewsVO.title) && Intrinsics.d(this.rating, hotelsPageReviewsVO.rating) && Intrinsics.d(this.reviews, hotelsPageReviewsVO.reviews) && Intrinsics.d(this.tallestReview, hotelsPageReviewsVO.tallestReview) && Intrinsics.d(this.showMoreButton, hotelsPageReviewsVO.showMoreButton) && Intrinsics.d(this.viewEvent, hotelsPageReviewsVO.viewEvent);
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
    public final ButtonV3Atom.LargeButton getShowMoreButton() {
        return this.showMoreButton;
    }

    public final ReviewVO getTallestReview() {
        return this.tallestReview;
    }

    @NotNull
    public final TextAtom getTitle() {
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
        int b11 = g.b((this.rating.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.title)) * 31, 31, this.reviews);
        ReviewVO reviewVO = this.tallestReview;
        int a11 = b.a(this.showMoreButton, (b11 + (reviewVO == null ? 0 : reviewVO.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        Badge badge = this.rating;
        List<ReviewVO> list = this.reviews;
        ReviewVO reviewVO = this.tallestReview;
        ButtonV3Atom.LargeButton largeButton = this.showMoreButton;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2639a.c("HotelsPageReviewsVO(id=", j11, ", title=", textAtom);
        c11.append(", rating=");
        c11.append(badge);
        c11.append(", reviews=");
        c11.append(list);
        c11.append(", tallestReview=");
        c11.append(reviewVO);
        c11.append(", showMoreButton=");
        c11.append(largeButton);
        return a.b(c11, ", viewEvent=", tVar, ")");
    }
}
