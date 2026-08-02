package ru.ozon.app.android.checkoutgeo.checkout.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Paddings {
    private final CommonCellSettings.LayoutPadding bottomPadding;
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final CommonCellSettings.LayoutPadding topPadding;

    public Paddings(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
        this.leftPadding = layoutPadding;
        this.rightPadding = layoutPadding2;
        this.topPadding = layoutPadding3;
        this.bottomPadding = layoutPadding4;
    }

    public static /* synthetic */ Paddings copy$default(Paddings paddings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutPadding = paddings.leftPadding;
        }
        if ((i11 & 2) != 0) {
            layoutPadding2 = paddings.rightPadding;
        }
        if ((i11 & 4) != 0) {
            layoutPadding3 = paddings.topPadding;
        }
        if ((i11 & 8) != 0) {
            layoutPadding4 = paddings.bottomPadding;
        }
        return paddings.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final Paddings copy(CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding) {
        return new Paddings(leftPadding, rightPadding, topPadding, bottomPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Paddings)) {
            return false;
        }
        Paddings paddings = (Paddings) other;
        return this.leftPadding == paddings.leftPadding && this.rightPadding == paddings.rightPadding && this.topPadding == paddings.topPadding && this.bottomPadding == paddings.bottomPadding;
    }

    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
        int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
        int hashCode3 = (hashCode2 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        return hashCode3 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Paddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
    }
}
