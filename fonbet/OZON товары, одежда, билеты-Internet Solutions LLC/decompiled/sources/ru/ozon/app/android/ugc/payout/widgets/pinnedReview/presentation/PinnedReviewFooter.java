package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.FooterControlDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;", "", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "like", "dislike", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "allReviews", "<init>", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;)V", "copy", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;)Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "getLike", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "getDislike", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "getAllReviews", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PinnedReviewFooter {
    private final UncontainedIconLabelButtonDTO allReviews;
    private final FooterControlDTO dislike;
    private final FooterControlDTO like;

    public PinnedReviewFooter(FooterControlDTO footerControlDTO, FooterControlDTO footerControlDTO2, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO) {
        this.like = footerControlDTO;
        this.dislike = footerControlDTO2;
        this.allReviews = uncontainedIconLabelButtonDTO;
    }

    public static /* synthetic */ PinnedReviewFooter copy$default(PinnedReviewFooter pinnedReviewFooter, FooterControlDTO footerControlDTO, FooterControlDTO footerControlDTO2, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            footerControlDTO = pinnedReviewFooter.like;
        }
        if ((i11 & 2) != 0) {
            footerControlDTO2 = pinnedReviewFooter.dislike;
        }
        if ((i11 & 4) != 0) {
            uncontainedIconLabelButtonDTO = pinnedReviewFooter.allReviews;
        }
        return pinnedReviewFooter.copy(footerControlDTO, footerControlDTO2, uncontainedIconLabelButtonDTO);
    }

    @NotNull
    public final PinnedReviewFooter copy(FooterControlDTO like, FooterControlDTO dislike, UncontainedIconLabelButtonDTO allReviews) {
        return new PinnedReviewFooter(like, dislike, allReviews);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedReviewFooter)) {
            return false;
        }
        PinnedReviewFooter pinnedReviewFooter = (PinnedReviewFooter) other;
        return Intrinsics.d(this.like, pinnedReviewFooter.like) && Intrinsics.d(this.dislike, pinnedReviewFooter.dislike) && Intrinsics.d(this.allReviews, pinnedReviewFooter.allReviews);
    }

    public final UncontainedIconLabelButtonDTO getAllReviews() {
        return this.allReviews;
    }

    public final FooterControlDTO getDislike() {
        return this.dislike;
    }

    public final FooterControlDTO getLike() {
        return this.like;
    }

    public int hashCode() {
        FooterControlDTO footerControlDTO = this.like;
        int hashCode = (footerControlDTO == null ? 0 : footerControlDTO.hashCode()) * 31;
        FooterControlDTO footerControlDTO2 = this.dislike;
        int hashCode2 = (hashCode + (footerControlDTO2 == null ? 0 : footerControlDTO2.hashCode())) * 31;
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO = this.allReviews;
        return hashCode2 + (uncontainedIconLabelButtonDTO != null ? uncontainedIconLabelButtonDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PinnedReviewFooter(like=" + this.like + ", dislike=" + this.dislike + ", allReviews=" + this.allReviews + ")";
    }
}
