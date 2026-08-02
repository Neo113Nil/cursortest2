package ru.ozon.app.android.cscore.padding;

import Ef0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cscore/padding/Padding;", "", "top", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Padding {
    public static final int $stable = 0;

    @NotNull
    private final CommonCellSettings.LayoutPadding bottom;

    @NotNull
    private final CommonCellSettings.LayoutPadding left;

    @NotNull
    private final CommonCellSettings.LayoutPadding right;

    @NotNull
    private final CommonCellSettings.LayoutPadding top;

    public Padding(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom, @NotNull CommonCellSettings.LayoutPadding left, @NotNull CommonCellSettings.LayoutPadding right) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    public static /* synthetic */ Padding copy$default(Padding padding, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutPadding = padding.top;
        }
        if ((i11 & 2) != 0) {
            layoutPadding2 = padding.bottom;
        }
        if ((i11 & 4) != 0) {
            layoutPadding3 = padding.left;
        }
        if ((i11 & 8) != 0) {
            layoutPadding4 = padding.right;
        }
        return padding.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTop() {
        return this.top;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottom() {
        return this.bottom;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeft() {
        return this.left;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRight() {
        return this.right;
    }

    @NotNull
    public final Padding copy(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom, @NotNull CommonCellSettings.LayoutPadding left, @NotNull CommonCellSettings.LayoutPadding right) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        return new Padding(top, bottom, left, right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) other;
        return this.top == padding.top && this.bottom == padding.bottom && this.left == padding.left && this.right == padding.right;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBottom() {
        return this.bottom;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLeft() {
        return this.left;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getRight() {
        return this.right;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.right.hashCode() + c.a(this.left, c.a(this.bottom, this.top.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ")";
    }
}
