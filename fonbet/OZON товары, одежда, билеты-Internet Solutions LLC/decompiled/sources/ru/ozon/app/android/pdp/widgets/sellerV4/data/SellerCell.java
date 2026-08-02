package ru.ozon.app.android.pdp.widgets.sellerV4.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/data/SellerCell;", "", "cell", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;Ljava/lang/String;)V", "getCell", "()Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerCell {
    public static final int $stable = DisclosureIconTitleSubtitleCellDTO.$stable;
    private final String backgroundColor;

    @NotNull
    private final DisclosureIconTitleSubtitleCellDTO cell;

    public SellerCell(@NotNull DisclosureIconTitleSubtitleCellDTO cell, String str) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.backgroundColor = str;
    }

    public static /* synthetic */ SellerCell copy$default(SellerCell sellerCell, DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclosureIconTitleSubtitleCellDTO = sellerCell.cell;
        }
        if ((i11 & 2) != 0) {
            str = sellerCell.backgroundColor;
        }
        return sellerCell.copy(disclosureIconTitleSubtitleCellDTO, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisclosureIconTitleSubtitleCellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final SellerCell copy(@NotNull DisclosureIconTitleSubtitleCellDTO cell, String backgroundColor) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new SellerCell(cell, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerCell)) {
            return false;
        }
        SellerCell sellerCell = (SellerCell) other;
        return Intrinsics.d(this.cell, sellerCell.cell) && Intrinsics.d(this.backgroundColor, sellerCell.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleCellDTO getCell() {
        return this.cell;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        String str = this.backgroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SellerCell(cell=" + this.cell + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
