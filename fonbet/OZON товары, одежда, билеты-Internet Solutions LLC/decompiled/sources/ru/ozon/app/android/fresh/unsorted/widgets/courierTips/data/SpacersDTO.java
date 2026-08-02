package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/SpacersDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SpacersDTO {
    public static final int $stable = 0;

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final Paddings topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public SpacersDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SpacersDTO copy$default(SpacersDTO spacersDTO, Paddings paddings, Paddings paddings2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddings = spacersDTO.topPadding;
        }
        if ((i11 & 2) != 0) {
            paddings2 = spacersDTO.bottomPadding;
        }
        return spacersDTO.copy(paddings, paddings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final SpacersDTO copy(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        return new SpacersDTO(topPadding, bottomPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacersDTO)) {
            return false;
        }
        SpacersDTO spacersDTO = (SpacersDTO) other;
        return this.topPadding == spacersDTO.topPadding && this.bottomPadding == spacersDTO.bottomPadding;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        return this.bottomPadding.hashCode() + (this.topPadding.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SpacersDTO(topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
    }

    public SpacersDTO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
    }

    public /* synthetic */ SpacersDTO(Paddings paddings, Paddings paddings2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2);
    }
}
