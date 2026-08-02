package ru.ozon.app.android.travel.feature.hotels.shared.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "", "gap", "", "outerCardsMargins", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getGap", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOuterCardsMargins", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "equals", "", "other", "hashCode", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShelfCardOptions {
    public static final int $stable = 0;
    private final Integer gap;
    private final Integer outerCardsMargins;

    public ShelfCardOptions(Integer num, Integer num2) {
        this.gap = num;
        this.outerCardsMargins = num2;
    }

    public static /* synthetic */ ShelfCardOptions copy$default(ShelfCardOptions shelfCardOptions, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = shelfCardOptions.gap;
        }
        if ((i11 & 2) != 0) {
            num2 = shelfCardOptions.outerCardsMargins;
        }
        return shelfCardOptions.copy(num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getGap() {
        return this.gap;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getOuterCardsMargins() {
        return this.outerCardsMargins;
    }

    @NotNull
    public final ShelfCardOptions copy(Integer gap, Integer outerCardsMargins) {
        return new ShelfCardOptions(gap, outerCardsMargins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShelfCardOptions)) {
            return false;
        }
        ShelfCardOptions shelfCardOptions = (ShelfCardOptions) other;
        return Intrinsics.d(this.gap, shelfCardOptions.gap) && Intrinsics.d(this.outerCardsMargins, shelfCardOptions.outerCardsMargins);
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
        return "ShelfCardOptions(gap=" + this.gap + ", outerCardsMargins=" + this.outerCardsMargins + ")";
    }
}
