package ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox;

import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BO\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b\u000e\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010\u0014¨\u0006,"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "tags", "", "id", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottomPadding", "topPadding", "leftPadding", "rightPadding", "", "isBottomRounded", "", "backgroundColor", "<init>", "(Ljava/util/List;JLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopPadding", "getLeftPadding", "getRightPadding", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FlexboxTagListV3VO implements c {
    private final String backgroundColor;

    @NotNull
    private final CommonCellSettings.LayoutPadding bottomPadding;
    private final long id;
    private final boolean isBottomRounded;

    @NotNull
    private final CommonCellSettings.LayoutPadding leftPadding;

    @NotNull
    private final CommonCellSettings.LayoutPadding rightPadding;

    @NotNull
    private final List<AtomDTO> tags;

    @NotNull
    private final CommonCellSettings.LayoutPadding topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public FlexboxTagListV3VO(@NotNull List<? extends AtomDTO> tags, long j11, @NotNull CommonCellSettings.LayoutPadding bottomPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        this.tags = tags;
        this.id = j11;
        this.bottomPadding = bottomPadding;
        this.topPadding = topPadding;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.isBottomRounded = z11;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexboxTagListV3VO)) {
            return false;
        }
        FlexboxTagListV3VO flexboxTagListV3VO = (FlexboxTagListV3VO) other;
        return Intrinsics.d(this.tags, flexboxTagListV3VO.tags) && this.id == flexboxTagListV3VO.id && this.bottomPadding == flexboxTagListV3VO.bottomPadding && this.topPadding == flexboxTagListV3VO.topPadding && this.leftPadding == flexboxTagListV3VO.leftPadding && this.rightPadding == flexboxTagListV3VO.rightPadding && this.isBottomRounded == flexboxTagListV3VO.isBottomRounded && Intrinsics.d(this.backgroundColor, flexboxTagListV3VO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<AtomDTO> getTags() {
        return this.tags;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(Ef0.c.a(this.rightPadding, Ef0.c.a(this.leftPadding, Ef0.c.a(this.topPadding, Ef0.c.a(this.bottomPadding, Pk0.c.a(this.tags.hashCode() * 31, 31, this.id), 31), 31), 31), 31), 31, this.isBottomRounded);
        String str = this.backgroundColor;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isBottomRounded, reason: from getter */
    public final boolean getIsBottomRounded() {
        return this.isBottomRounded;
    }

    @NotNull
    public String toString() {
        return "FlexboxTagListV3VO(tags=" + this.tags + ", id=" + this.id + ", bottomPadding=" + this.bottomPadding + ", topPadding=" + this.topPadding + ", leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", isBottomRounded=" + this.isBottomRounded + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
