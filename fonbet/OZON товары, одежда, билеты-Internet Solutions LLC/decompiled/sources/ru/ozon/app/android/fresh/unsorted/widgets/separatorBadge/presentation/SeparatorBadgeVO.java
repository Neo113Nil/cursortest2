package ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.presentation;

import Gl.C3124a;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b(\u0010&R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/presentation/SeparatorBadgeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "backgroundColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "horizontalPadding", "topPadding", "bottomPadding", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopPadding", "getBottomPadding", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SeparatorBadgeVO implements c {
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;

    @NotNull
    private final CommonCellSettings.LayoutPadding bottomPadding;

    @NotNull
    private final CommonCellSettings.LayoutPadding horizontalPadding;
    private final long id;
    private final t tokenizedEvent;

    @NotNull
    private final CommonCellSettings.LayoutPadding topPadding;

    public SeparatorBadgeVO(long j11, @NotNull BadgeDTO badge, String str, @NotNull CommonCellSettings.LayoutPadding horizontalPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding bottomPadding, t tVar) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.id = j11;
        this.badge = badge;
        this.backgroundColor = str;
        this.horizontalPadding = horizontalPadding;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorBadgeVO)) {
            return false;
        }
        SeparatorBadgeVO separatorBadgeVO = (SeparatorBadgeVO) other;
        return this.id == separatorBadgeVO.id && Intrinsics.d(this.badge, separatorBadgeVO.badge) && Intrinsics.d(this.backgroundColor, separatorBadgeVO.backgroundColor) && this.horizontalPadding == separatorBadgeVO.horizontalPadding && this.topPadding == separatorBadgeVO.topPadding && this.bottomPadding == separatorBadgeVO.bottomPadding && Intrinsics.d(this.tokenizedEvent, separatorBadgeVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
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
        int c11 = C3124a.c(this.badge, Long.hashCode(this.id) * 31, 31);
        String str = this.backgroundColor;
        int a11 = Ef0.c.a(this.bottomPadding, Ef0.c.a(this.topPadding, Ef0.c.a(this.horizontalPadding, (c11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.topPadding;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.bottomPadding;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("SeparatorBadgeVO(id=");
        sb2.append(j11);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", horizontalPadding=");
        sb2.append(layoutPadding);
        sb2.append(", topPadding=");
        sb2.append(layoutPadding2);
        sb2.append(", bottomPadding=");
        sb2.append(layoutPadding3);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
