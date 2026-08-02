package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import A00.a;
import An.C2439a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.RightPanelButtonDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryLikeUpdateKey;", "LA00/a$J$a;", "", "reviewUuid", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO;", "rightPanelButtonsState", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReviewUuid", "Ljava/util/List;", "getRightPanelButtonsState", "()Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReviewGalleryLikeUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final String reviewUuid;

    @NotNull
    private final List<RightPanelButtonDTO> rightPanelButtonsState;

    public ReviewGalleryLikeUpdateKey(@NotNull String reviewUuid, @NotNull List<RightPanelButtonDTO> rightPanelButtonsState) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(rightPanelButtonsState, "rightPanelButtonsState");
        this.reviewUuid = reviewUuid;
        this.rightPanelButtonsState = rightPanelButtonsState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryLikeUpdateKey)) {
            return false;
        }
        ReviewGalleryLikeUpdateKey reviewGalleryLikeUpdateKey = (ReviewGalleryLikeUpdateKey) other;
        return Intrinsics.d(this.reviewUuid, reviewGalleryLikeUpdateKey.reviewUuid) && Intrinsics.d(this.rightPanelButtonsState, reviewGalleryLikeUpdateKey.rightPanelButtonsState);
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    @NotNull
    public final List<RightPanelButtonDTO> getRightPanelButtonsState() {
        return this.rightPanelButtonsState;
    }

    public int hashCode() {
        return this.rightPanelButtonsState.hashCode() + (this.reviewUuid.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("ReviewGalleryLikeUpdateKey(reviewUuid=", this.reviewUuid, ", rightPanelButtonsState=", ")", this.rightPanelButtonsState);
    }
}
