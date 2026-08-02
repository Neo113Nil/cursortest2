package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/Tooltip;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Tooltip {
    public static final int $stable = IconDTO.$stable;

    @NotNull
    private final CommonControlSettings common;

    @NotNull
    private final IconDTO icon;

    public Tooltip(@NotNull IconDTO icon, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(common, "common");
        this.icon = icon;
        this.common = common;
    }

    public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = tooltip.icon;
        }
        if ((i11 & 2) != 0) {
            commonControlSettings = tooltip.common;
        }
        return tooltip.copy(iconDTO, commonControlSettings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final Tooltip copy(@NotNull IconDTO icon, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(common, "common");
        return new Tooltip(icon, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tooltip)) {
            return false;
        }
        Tooltip tooltip = (Tooltip) other;
        return Intrinsics.d(this.icon, tooltip.icon) && Intrinsics.d(this.common, tooltip.common);
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.common.hashCode() + (this.icon.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Tooltip(icon=" + this.icon + ", common=" + this.common + ")";
    }
}
