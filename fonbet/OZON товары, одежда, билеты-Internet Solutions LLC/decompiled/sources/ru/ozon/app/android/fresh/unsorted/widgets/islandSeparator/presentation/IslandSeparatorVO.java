package ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/IslandSeparatorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "islandsColor", "separatorColor", "", "separatorHeight", "<init>", "(JLjava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIslandsColor", "getSeparatorColor", "I", "getSeparatorHeight", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IslandSeparatorVO implements c {
    private final long id;

    @NotNull
    private final String islandsColor;

    @NotNull
    private final String separatorColor;
    private final int separatorHeight;

    public IslandSeparatorVO(long j11, @NotNull String islandsColor, @NotNull String separatorColor, int i11) {
        Intrinsics.checkNotNullParameter(islandsColor, "islandsColor");
        Intrinsics.checkNotNullParameter(separatorColor, "separatorColor");
        this.id = j11;
        this.islandsColor = islandsColor;
        this.separatorColor = separatorColor;
        this.separatorHeight = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IslandSeparatorVO)) {
            return false;
        }
        IslandSeparatorVO islandSeparatorVO = (IslandSeparatorVO) other;
        return this.id == islandSeparatorVO.id && Intrinsics.d(this.islandsColor, islandSeparatorVO.islandsColor) && Intrinsics.d(this.separatorColor, islandSeparatorVO.separatorColor) && this.separatorHeight == islandSeparatorVO.separatorHeight;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getIslandsColor() {
        return this.islandsColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    public final int getSeparatorHeight() {
        return this.separatorHeight;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Integer.hashCode(this.separatorHeight) + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.islandsColor), 31, this.separatorColor);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.islandsColor;
        String str2 = this.separatorColor;
        int i11 = this.separatorHeight;
        StringBuilder c11 = C2436a.c(j11, "IslandSeparatorVO(id=", ", islandsColor=", str);
        c11.append(", separatorColor=");
        c11.append(str2);
        c11.append(", separatorHeight=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
