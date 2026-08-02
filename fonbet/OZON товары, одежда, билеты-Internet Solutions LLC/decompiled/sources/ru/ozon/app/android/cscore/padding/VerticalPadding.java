package ru.ozon.app.android.cscore.padding;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cscore/padding/VerticalPadding;", "", "top", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VerticalPadding {
    public static final int $stable = 0;

    @NotNull
    private final CommonCellSettings.LayoutPadding bottom;

    @NotNull
    private final CommonCellSettings.LayoutPadding top;

    public VerticalPadding(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.top = top;
        this.bottom = bottom;
    }

    public static /* synthetic */ VerticalPadding copy$default(VerticalPadding verticalPadding, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutPadding = verticalPadding.top;
        }
        if ((i11 & 2) != 0) {
            layoutPadding2 = verticalPadding.bottom;
        }
        return verticalPadding.copy(layoutPadding, layoutPadding2);
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
    public final VerticalPadding copy(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        return new VerticalPadding(top, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalPadding)) {
            return false;
        }
        VerticalPadding verticalPadding = (VerticalPadding) other;
        return this.top == verticalPadding.top && this.bottom == verticalPadding.bottom;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBottom() {
        return this.bottom;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.bottom.hashCode() + (this.top.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VerticalPadding(top=" + this.top + ", bottom=" + this.bottom + ")";
    }
}
