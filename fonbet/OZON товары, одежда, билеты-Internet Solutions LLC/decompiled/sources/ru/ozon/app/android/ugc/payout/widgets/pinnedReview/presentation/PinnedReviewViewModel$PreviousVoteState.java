package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import Ef0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$PreviousVoteState", "", "", "liked", "disliked", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getLiked", "()Z", "getDisliked", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PinnedReviewViewModel$PreviousVoteState {
    private final boolean disliked;
    private final boolean liked;

    public PinnedReviewViewModel$PreviousVoteState(boolean z11, boolean z12) {
        this.liked = z11;
        this.disliked = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedReviewViewModel$PreviousVoteState)) {
            return false;
        }
        PinnedReviewViewModel$PreviousVoteState pinnedReviewViewModel$PreviousVoteState = (PinnedReviewViewModel$PreviousVoteState) other;
        return this.liked == pinnedReviewViewModel$PreviousVoteState.liked && this.disliked == pinnedReviewViewModel$PreviousVoteState.disliked;
    }

    public final boolean getDisliked() {
        return this.disliked;
    }

    public final boolean getLiked() {
        return this.liked;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disliked) + (Boolean.hashCode(this.liked) * 31);
    }

    @NotNull
    public String toString() {
        return c.c("PreviousVoteState(liked=", ", disliked=", ")", this.liked, this.disliked);
    }
}
