package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewLabelButtonFooterDTO;", "", "like", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "dislike", "comments", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "additionalAction", "<init>", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;)V", "getLike", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "getDislike", "getComments", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "getAdditionalAction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewLabelButtonFooterDTO {
    private final UncontainedIconLabelButtonDTO additionalAction;
    private final UncontainedIconLabelButtonDTO comments;
    private final FooterControlDTO dislike;
    private final FooterControlDTO like;

    public ReviewLabelButtonFooterDTO(FooterControlDTO footerControlDTO, FooterControlDTO footerControlDTO2, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO2) {
        this.like = footerControlDTO;
        this.dislike = footerControlDTO2;
        this.comments = uncontainedIconLabelButtonDTO;
        this.additionalAction = uncontainedIconLabelButtonDTO2;
    }

    public static /* synthetic */ ReviewLabelButtonFooterDTO copy$default(ReviewLabelButtonFooterDTO reviewLabelButtonFooterDTO, FooterControlDTO footerControlDTO, FooterControlDTO footerControlDTO2, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            footerControlDTO = reviewLabelButtonFooterDTO.like;
        }
        if ((i11 & 2) != 0) {
            footerControlDTO2 = reviewLabelButtonFooterDTO.dislike;
        }
        if ((i11 & 4) != 0) {
            uncontainedIconLabelButtonDTO = reviewLabelButtonFooterDTO.comments;
        }
        if ((i11 & 8) != 0) {
            uncontainedIconLabelButtonDTO2 = reviewLabelButtonFooterDTO.additionalAction;
        }
        return reviewLabelButtonFooterDTO.copy(footerControlDTO, footerControlDTO2, uncontainedIconLabelButtonDTO, uncontainedIconLabelButtonDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final FooterControlDTO getLike() {
        return this.like;
    }

    /* renamed from: component2, reason: from getter */
    public final FooterControlDTO getDislike() {
        return this.dislike;
    }

    /* renamed from: component3, reason: from getter */
    public final UncontainedIconLabelButtonDTO getComments() {
        return this.comments;
    }

    /* renamed from: component4, reason: from getter */
    public final UncontainedIconLabelButtonDTO getAdditionalAction() {
        return this.additionalAction;
    }

    @NotNull
    public final ReviewLabelButtonFooterDTO copy(FooterControlDTO like, FooterControlDTO dislike, UncontainedIconLabelButtonDTO comments, UncontainedIconLabelButtonDTO additionalAction) {
        return new ReviewLabelButtonFooterDTO(like, dislike, comments, additionalAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewLabelButtonFooterDTO)) {
            return false;
        }
        ReviewLabelButtonFooterDTO reviewLabelButtonFooterDTO = (ReviewLabelButtonFooterDTO) other;
        return Intrinsics.d(this.like, reviewLabelButtonFooterDTO.like) && Intrinsics.d(this.dislike, reviewLabelButtonFooterDTO.dislike) && Intrinsics.d(this.comments, reviewLabelButtonFooterDTO.comments) && Intrinsics.d(this.additionalAction, reviewLabelButtonFooterDTO.additionalAction);
    }

    public final UncontainedIconLabelButtonDTO getAdditionalAction() {
        return this.additionalAction;
    }

    public final UncontainedIconLabelButtonDTO getComments() {
        return this.comments;
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
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO = this.comments;
        int hashCode3 = (hashCode2 + (uncontainedIconLabelButtonDTO == null ? 0 : uncontainedIconLabelButtonDTO.hashCode())) * 31;
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO2 = this.additionalAction;
        return hashCode3 + (uncontainedIconLabelButtonDTO2 != null ? uncontainedIconLabelButtonDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewLabelButtonFooterDTO(like=" + this.like + ", dislike=" + this.dislike + ", comments=" + this.comments + ", additionalAction=" + this.additionalAction + ")";
    }
}
