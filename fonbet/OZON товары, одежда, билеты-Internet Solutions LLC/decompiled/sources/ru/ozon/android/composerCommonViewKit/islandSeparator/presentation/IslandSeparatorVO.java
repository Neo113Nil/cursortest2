package ru.ozon.android.composerCommonViewKit.islandSeparator.presentation;

import Ak.C2436a;
import B0.C2454a;
import D40.a;
import G.g;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b#\u0010\u0011R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\r\u0010!¨\u0006$"}, d2 = {"Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "Ll20/c;", "", "id", "", "physicalPartHeight", "", "backgroundColor", "", "hasTopCorners", "hasBottomCorners", "isSticky", "stickyGroupTag", "isOverlay", "<init>", "(JILjava/lang/String;ZZZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getPhysicalPartHeight", "Ljava/lang/String;", "getBackgroundColor", "Z", "getHasTopCorners", "()Z", "getHasBottomCorners", "getStickyGroupTag", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IslandSeparatorVO implements c {

    @NotNull
    private final String backgroundColor;
    private final boolean hasBottomCorners;
    private final boolean hasTopCorners;
    private final long id;
    private final boolean isOverlay;
    private final boolean isSticky;
    private final int physicalPartHeight;
    private final String stickyGroupTag;

    public IslandSeparatorVO(long j11, int i11, @NotNull String backgroundColor, boolean z11, boolean z12, boolean z13, String str, boolean z14) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.physicalPartHeight = i11;
        this.backgroundColor = backgroundColor;
        this.hasTopCorners = z11;
        this.hasBottomCorners = z12;
        this.isSticky = z13;
        this.stickyGroupTag = str;
        this.isOverlay = z14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IslandSeparatorVO)) {
            return false;
        }
        IslandSeparatorVO islandSeparatorVO = (IslandSeparatorVO) other;
        return this.id == islandSeparatorVO.id && this.physicalPartHeight == islandSeparatorVO.physicalPartHeight && Intrinsics.d(this.backgroundColor, islandSeparatorVO.backgroundColor) && this.hasTopCorners == islandSeparatorVO.hasTopCorners && this.hasBottomCorners == islandSeparatorVO.hasBottomCorners && this.isSticky == islandSeparatorVO.isSticky && Intrinsics.d(this.stickyGroupTag, islandSeparatorVO.stickyGroupTag) && this.isOverlay == islandSeparatorVO.isOverlay;
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

    public final int getPhysicalPartHeight() {
        return this.physicalPartHeight;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getStickyGroupTag() {
        return this.stickyGroupTag;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a(C3532b.a(g.a(C2454a.a(this.physicalPartHeight, Long.hashCode(this.id) * 31, 31), 31, this.backgroundColor), 31, this.hasTopCorners), 31, this.hasBottomCorners), 31, this.isSticky);
        String str = this.stickyGroupTag;
        return Boolean.hashCode(this.isOverlay) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.physicalPartHeight;
        String str = this.backgroundColor;
        boolean z11 = this.hasTopCorners;
        boolean z12 = this.hasBottomCorners;
        boolean z13 = this.isSticky;
        String str2 = this.stickyGroupTag;
        boolean z14 = this.isOverlay;
        StringBuilder b11 = Ql.c.b(j11, "IslandSeparatorVO(id=", i11, ", physicalPartHeight=");
        a.g(", backgroundColor=", str, ", hasTopCorners=", b11, z11);
        C2436a.e(", hasBottomCorners=", ", isSticky=", b11, z12, z13);
        a.g(", stickyGroupTag=", str2, ", isOverlay=", b11, z14);
        b11.append(")");
        return b11.toString();
    }
}
