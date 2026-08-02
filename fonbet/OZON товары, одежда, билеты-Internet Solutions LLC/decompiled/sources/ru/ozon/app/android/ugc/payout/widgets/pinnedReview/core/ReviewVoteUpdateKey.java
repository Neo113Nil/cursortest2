package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core;

import A00.a;
import Bi.b;
import Kk.C3532b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/ReviewVoteUpdateKey;", "LA00/a$J$a;", "", "voId", "", "liked", "disliked", "<init>", "(JZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "Z", "getLiked", "()Z", "getDisliked", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReviewVoteUpdateKey implements a.J.InterfaceC0007a {
    private final boolean disliked;
    private final boolean liked;
    private final long voId;

    public ReviewVoteUpdateKey(long j11, boolean z11, boolean z12) {
        this.voId = j11;
        this.liked = z11;
        this.disliked = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewVoteUpdateKey)) {
            return false;
        }
        ReviewVoteUpdateKey reviewVoteUpdateKey = (ReviewVoteUpdateKey) other;
        return this.voId == reviewVoteUpdateKey.voId && this.liked == reviewVoteUpdateKey.liked && this.disliked == reviewVoteUpdateKey.disliked;
    }

    public final boolean getDisliked() {
        return this.disliked;
    }

    public final boolean getLiked() {
        return this.liked;
    }

    public final long getVoId() {
        return this.voId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disliked) + C3532b.a(Long.hashCode(this.voId) * 31, 31, this.liked);
    }

    @NotNull
    public String toString() {
        long j11 = this.voId;
        boolean z11 = this.liked;
        return b.f(Bl.b.c(j11, "ReviewVoteUpdateKey(voId=", ", liked=", z11), ", disliked=", this.disliked, ")");
    }
}
