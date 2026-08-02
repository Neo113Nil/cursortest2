package ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator;

import B0.C2454a;
import Bi.b;
import D40.a;
import G.g;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorVO;", "Ll20/c;", "", "id", "", "physicalPartHeightDp", "", "backgroundColor", "", "hasTopCorners", "hasBottomCorners", "<init>", "(JILjava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getPhysicalPartHeightDp", "Ljava/lang/String;", "getBackgroundColor", "Z", "getHasTopCorners", "()Z", "getHasBottomCorners", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FiltersIslandSeparatorVO implements c {

    @NotNull
    private final String backgroundColor;
    private final boolean hasBottomCorners;
    private final boolean hasTopCorners;
    private final long id;
    private final int physicalPartHeightDp;

    public FiltersIslandSeparatorVO(long j11, int i11, @NotNull String backgroundColor, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.physicalPartHeightDp = i11;
        this.backgroundColor = backgroundColor;
        this.hasTopCorners = z11;
        this.hasBottomCorners = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersIslandSeparatorVO)) {
            return false;
        }
        FiltersIslandSeparatorVO filtersIslandSeparatorVO = (FiltersIslandSeparatorVO) other;
        return this.id == filtersIslandSeparatorVO.id && this.physicalPartHeightDp == filtersIslandSeparatorVO.physicalPartHeightDp && Intrinsics.d(this.backgroundColor, filtersIslandSeparatorVO.backgroundColor) && this.hasTopCorners == filtersIslandSeparatorVO.hasTopCorners && this.hasBottomCorners == filtersIslandSeparatorVO.hasBottomCorners;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getHasBottomCorners() {
        return this.hasBottomCorners;
    }

    public final boolean getHasTopCorners() {
        return this.hasTopCorners;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getPhysicalPartHeightDp() {
        return this.physicalPartHeightDp;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasBottomCorners) + C3532b.a(g.a(C2454a.a(this.physicalPartHeightDp, Long.hashCode(this.id) * 31, 31), 31, this.backgroundColor), 31, this.hasTopCorners);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.physicalPartHeightDp;
        String str = this.backgroundColor;
        boolean z11 = this.hasTopCorners;
        boolean z12 = this.hasBottomCorners;
        StringBuilder b11 = Ql.c.b(j11, "FiltersIslandSeparatorVO(id=", i11, ", physicalPartHeightDp=");
        a.g(", backgroundColor=", str, ", hasTopCorners=", b11, z11);
        return b.f(b11, ", hasBottomCorners=", z12, ")");
    }
}
