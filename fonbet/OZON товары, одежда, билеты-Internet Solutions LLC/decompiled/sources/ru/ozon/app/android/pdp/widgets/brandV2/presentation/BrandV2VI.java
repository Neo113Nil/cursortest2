package ru.ozon.app.android.pdp.widgets.brandV2.presentation;

import Ak.C2436a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "", "id", "", "tabGroupId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dsCell", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dsBadge", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BrandV2VI implements TabEmbeddedViewObject {
    public static final int $stable = CellDTO.$stable;
    private final BadgeDTO dsBadge;
    private final CellDTO dsCell;

    @NotNull
    private final Paddings horizontalPadding;
    private final long id;
    private final String tabGroupId;

    public BrandV2VI(long j11, String str, CellDTO cellDTO, BadgeDTO badgeDTO, @NotNull Paddings horizontalPadding) {
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.id = j11;
        this.tabGroupId = str;
        this.dsCell = cellDTO;
        this.dsBadge = badgeDTO;
        this.horizontalPadding = horizontalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandV2VI)) {
            return false;
        }
        BrandV2VI brandV2VI = (BrandV2VI) other;
        return this.id == brandV2VI.id && Intrinsics.d(this.tabGroupId, brandV2VI.tabGroupId) && Intrinsics.d(this.dsCell, brandV2VI.dsCell) && Intrinsics.d(this.dsBadge, brandV2VI.dsBadge) && this.horizontalPadding == brandV2VI.horizontalPadding;
    }

    public final BadgeDTO getDsBadge() {
        return this.dsBadge;
    }

    public final CellDTO getDsCell() {
        return this.dsCell;
    }

    @NotNull
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
    public String getTabGroupId() {
        return this.tabGroupId;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.tabGroupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CellDTO cellDTO = this.dsCell;
        int hashCode3 = (hashCode2 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.dsBadge;
        return this.horizontalPadding.hashCode() + ((hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.tabGroupId;
        CellDTO cellDTO = this.dsCell;
        BadgeDTO badgeDTO = this.dsBadge;
        Paddings paddings = this.horizontalPadding;
        StringBuilder c11 = C2436a.c(j11, "BrandV2VI(id=", ", tabGroupId=", str);
        c11.append(", dsCell=");
        c11.append(cellDTO);
        c11.append(", dsBadge=");
        c11.append(badgeDTO);
        c11.append(", horizontalPadding=");
        c11.append(paddings);
        c11.append(")");
        return c11.toString();
    }
}
