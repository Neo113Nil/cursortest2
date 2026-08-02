package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "", "top", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Paddings {
    public static final int $stable = 0;
    private final CommonCellSettings.LayoutPadding bottom;
    private final CommonCellSettings.LayoutPadding left;
    private final CommonCellSettings.LayoutPadding right;
    private final CommonCellSettings.LayoutPadding top;

    public Paddings(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
        this.top = layoutPadding;
        this.bottom = layoutPadding2;
        this.left = layoutPadding3;
        this.right = layoutPadding4;
    }

    public static /* synthetic */ Paddings copy$default(Paddings paddings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutPadding = paddings.top;
        }
        if ((i11 & 2) != 0) {
            layoutPadding2 = paddings.bottom;
        }
        if ((i11 & 4) != 0) {
            layoutPadding3 = paddings.left;
        }
        if ((i11 & 8) != 0) {
            layoutPadding4 = paddings.right;
        }
        return paddings.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTop() {
        return this.top;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottom() {
        return this.bottom;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeft() {
        return this.left;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRight() {
        return this.right;
    }

    @NotNull
    public final Paddings copy(CommonCellSettings.LayoutPadding top, CommonCellSettings.LayoutPadding bottom, CommonCellSettings.LayoutPadding left, CommonCellSettings.LayoutPadding right) {
        return new Paddings(top, bottom, left, right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Paddings)) {
            return false;
        }
        Paddings paddings = (Paddings) other;
        return this.top == paddings.top && this.bottom == paddings.bottom && this.left == paddings.left && this.right == paddings.right;
    }

    public final CommonCellSettings.LayoutPadding getBottom() {
        return this.bottom;
    }

    public final CommonCellSettings.LayoutPadding getLeft() {
        return this.left;
    }

    public final CommonCellSettings.LayoutPadding getRight() {
        return this.right;
    }

    public final CommonCellSettings.LayoutPadding getTop() {
        return this.top;
    }

    public int hashCode() {
        CommonCellSettings.LayoutPadding layoutPadding = this.top;
        int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottom;
        int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.left;
        int hashCode3 = (hashCode2 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.right;
        return hashCode3 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Paddings(top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ")";
    }
}
