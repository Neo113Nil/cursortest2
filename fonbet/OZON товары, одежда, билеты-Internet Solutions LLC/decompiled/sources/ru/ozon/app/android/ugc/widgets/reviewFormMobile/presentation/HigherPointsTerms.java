package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "", "", "detailedReviewMediaCount", "detailedReviewCommentLength", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getDetailedReviewMediaCount", "()Ljava/lang/Integer;", "getDetailedReviewCommentLength", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HigherPointsTerms {
    private final Integer detailedReviewCommentLength;
    private final Integer detailedReviewMediaCount;

    public HigherPointsTerms(Integer num, Integer num2) {
        this.detailedReviewMediaCount = num;
        this.detailedReviewCommentLength = num2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HigherPointsTerms)) {
            return false;
        }
        HigherPointsTerms higherPointsTerms = (HigherPointsTerms) other;
        return Intrinsics.d(this.detailedReviewMediaCount, higherPointsTerms.detailedReviewMediaCount) && Intrinsics.d(this.detailedReviewCommentLength, higherPointsTerms.detailedReviewCommentLength);
    }

    public final Integer getDetailedReviewCommentLength() {
        return this.detailedReviewCommentLength;
    }

    public final Integer getDetailedReviewMediaCount() {
        return this.detailedReviewMediaCount;
    }

    public int hashCode() {
        Integer num = this.detailedReviewMediaCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.detailedReviewCommentLength;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HigherPointsTerms(detailedReviewMediaCount=" + this.detailedReviewMediaCount + ", detailedReviewCommentLength=" + this.detailedReviewCommentLength + ")";
    }
}
