package ru.ozon.app.android.ugcratingmolecule.data;

import C.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/data/TrackViewInfo;", "", "", "widgetId", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "ratingDTO", "", "reviewScoreKey", "<init>", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRatingDTO", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "Ljava/lang/String;", "getReviewScoreKey", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TrackViewInfo {

    @NotNull
    private final RatingDTO ratingDTO;

    @NotNull
    private final String reviewScoreKey;
    private final Long widgetId;

    public TrackViewInfo(Long l11, @NotNull RatingDTO ratingDTO, @NotNull String reviewScoreKey) {
        Intrinsics.checkNotNullParameter(ratingDTO, "ratingDTO");
        Intrinsics.checkNotNullParameter(reviewScoreKey, "reviewScoreKey");
        this.widgetId = l11;
        this.ratingDTO = ratingDTO;
        this.reviewScoreKey = reviewScoreKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackViewInfo)) {
            return false;
        }
        TrackViewInfo trackViewInfo = (TrackViewInfo) other;
        return Intrinsics.d(this.widgetId, trackViewInfo.widgetId) && Intrinsics.d(this.ratingDTO, trackViewInfo.ratingDTO) && Intrinsics.d(this.reviewScoreKey, trackViewInfo.reviewScoreKey);
    }

    @NotNull
    public final RatingDTO getRatingDTO() {
        return this.ratingDTO;
    }

    @NotNull
    public final String getReviewScoreKey() {
        return this.reviewScoreKey;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        Long l11 = this.widgetId;
        return this.reviewScoreKey.hashCode() + ((this.ratingDTO.hashCode() + ((l11 == null ? 0 : l11.hashCode()) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        Long l11 = this.widgetId;
        RatingDTO ratingDTO = this.ratingDTO;
        String str = this.reviewScoreKey;
        StringBuilder sb2 = new StringBuilder("TrackViewInfo(widgetId=");
        sb2.append(l11);
        sb2.append(", ratingDTO=");
        sb2.append(ratingDTO);
        sb2.append(", reviewScoreKey=");
        return o0.c(sb2, str, ")");
    }
}
