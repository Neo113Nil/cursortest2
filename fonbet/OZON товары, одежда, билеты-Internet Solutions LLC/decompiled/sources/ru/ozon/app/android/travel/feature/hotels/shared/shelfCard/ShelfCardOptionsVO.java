package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "", "", "gap", "outerCardsMargins", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getGap", "()Ljava/lang/Integer;", "getOuterCardsMargins", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShelfCardOptionsVO {
    private final Integer gap;
    private final Integer outerCardsMargins;

    public ShelfCardOptionsVO(Integer num, Integer num2) {
        this.gap = num;
        this.outerCardsMargins = num2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShelfCardOptionsVO)) {
            return false;
        }
        ShelfCardOptionsVO shelfCardOptionsVO = (ShelfCardOptionsVO) other;
        return Intrinsics.d(this.gap, shelfCardOptionsVO.gap) && Intrinsics.d(this.outerCardsMargins, shelfCardOptionsVO.outerCardsMargins);
    }

    public final Integer getGap() {
        return this.gap;
    }

    public final Integer getOuterCardsMargins() {
        return this.outerCardsMargins;
    }

    public int hashCode() {
        Integer num = this.gap;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.outerCardsMargins;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ShelfCardOptionsVO(gap=" + this.gap + ", outerCardsMargins=" + this.outerCardsMargins + ")";
    }
}
