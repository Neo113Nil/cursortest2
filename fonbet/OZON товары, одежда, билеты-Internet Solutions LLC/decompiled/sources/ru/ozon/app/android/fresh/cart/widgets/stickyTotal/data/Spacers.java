package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data;

import Ef0.c;
import Ep.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "", "top", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottom", "left", "right", "between", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottom", "getLeft", "getRight", "getBetween", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Spacers {
    public static final int $stable = 0;

    @NotNull
    private final CommonCellSettings.LayoutPadding between;

    @NotNull
    private final CommonCellSettings.LayoutPadding bottom;

    @NotNull
    private final CommonCellSettings.LayoutPadding left;

    @NotNull
    private final CommonCellSettings.LayoutPadding right;

    @NotNull
    private final CommonCellSettings.LayoutPadding top;

    public Spacers() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Spacers copy$default(Spacers spacers, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CommonCellSettings.LayoutPadding layoutPadding5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutPadding = spacers.top;
        }
        if ((i11 & 2) != 0) {
            layoutPadding2 = spacers.bottom;
        }
        if ((i11 & 4) != 0) {
            layoutPadding3 = spacers.left;
        }
        if ((i11 & 8) != 0) {
            layoutPadding4 = spacers.right;
        }
        if ((i11 & 16) != 0) {
            layoutPadding5 = spacers.between;
        }
        CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding5;
        CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding3;
        return spacers.copy(layoutPadding, layoutPadding2, layoutPadding7, layoutPadding4, layoutPadding6);
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
    /* renamed from: component5, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBetween() {
        return this.between;
    }

    @NotNull
    public final Spacers copy(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom, @NotNull CommonCellSettings.LayoutPadding left, @NotNull CommonCellSettings.LayoutPadding right, @NotNull CommonCellSettings.LayoutPadding between) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(between, "between");
        return new Spacers(top, bottom, left, right, between);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spacers)) {
            return false;
        }
        Spacers spacers = (Spacers) other;
        return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right && this.between == spacers.between;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBetween() {
        return this.between;
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
        return this.between.hashCode() + c.a(this.right, c.a(this.left, c.a(this.bottom, this.top.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        CommonCellSettings.LayoutPadding layoutPadding = this.top;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottom;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.left;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.right;
        CommonCellSettings.LayoutPadding layoutPadding5 = this.between;
        StringBuilder sb2 = new StringBuilder("Spacers(top=");
        sb2.append(layoutPadding);
        sb2.append(", bottom=");
        sb2.append(layoutPadding2);
        sb2.append(", left=");
        a.f(sb2, layoutPadding3, ", right=", layoutPadding4, ", between=");
        sb2.append(layoutPadding5);
        sb2.append(")");
        return sb2.toString();
    }

    public Spacers(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom, @NotNull CommonCellSettings.LayoutPadding left, @NotNull CommonCellSettings.LayoutPadding right, @NotNull CommonCellSettings.LayoutPadding between) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(between, "between");
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
        this.between = between;
    }

    public /* synthetic */ Spacers(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CommonCellSettings.LayoutPadding layoutPadding5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CommonCellSettings.LayoutPadding.PADDING_300 : layoutPadding, (i11 & 2) != 0 ? CommonCellSettings.LayoutPadding.PADDING_200 : layoutPadding2, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.PADDING_500 : layoutPadding3, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.PADDING_300 : layoutPadding4, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.PADDING_350 : layoutPadding5);
    }
}
