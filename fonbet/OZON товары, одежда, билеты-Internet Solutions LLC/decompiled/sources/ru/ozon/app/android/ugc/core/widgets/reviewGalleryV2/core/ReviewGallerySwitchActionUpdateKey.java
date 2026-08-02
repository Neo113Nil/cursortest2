package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import A00.a;
import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGallerySwitchActionUpdateKey;", "LA00/a$J$a;", "", "reviewUuid", "actionId", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReviewUuid", "getActionId", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReviewGallerySwitchActionUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final String actionId;
    private final boolean isSelected;

    @NotNull
    private final String reviewUuid;

    public ReviewGallerySwitchActionUpdateKey(@NotNull String reviewUuid, @NotNull String actionId, boolean z11) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.reviewUuid = reviewUuid;
        this.actionId = actionId;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGallerySwitchActionUpdateKey)) {
            return false;
        }
        ReviewGallerySwitchActionUpdateKey reviewGallerySwitchActionUpdateKey = (ReviewGallerySwitchActionUpdateKey) other;
        return Intrinsics.d(this.reviewUuid, reviewGallerySwitchActionUpdateKey.reviewUuid) && Intrinsics.d(this.actionId, reviewGallerySwitchActionUpdateKey.actionId) && this.isSelected == reviewGallerySwitchActionUpdateKey.isSelected;
    }

    @NotNull
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + g.a(this.reviewUuid.hashCode() * 31, 31, this.actionId);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.reviewUuid;
        String str2 = this.actionId;
        return Pk0.a.a(")", C3660k.d("ReviewGallerySwitchActionUpdateKey(reviewUuid=", str, ", actionId=", str2, ", isSelected="), this.isSelected);
    }
}
