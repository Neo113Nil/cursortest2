package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;", "", "mainIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "overlayIcon", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/Icon;)V", "getMainIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getOverlayIcon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OverlayIcon {
    public static final int $stable = Icon.$stable;

    @NotNull
    private final Icon mainIcon;
    private final Icon overlayIcon;

    public OverlayIcon(@i(name = "icon") @NotNull Icon mainIcon, Icon icon) {
        Intrinsics.checkNotNullParameter(mainIcon, "mainIcon");
        this.mainIcon = mainIcon;
        this.overlayIcon = icon;
    }

    public static /* synthetic */ OverlayIcon copy$default(OverlayIcon overlayIcon, Icon icon, Icon icon2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            icon = overlayIcon.mainIcon;
        }
        if ((i11 & 2) != 0) {
            icon2 = overlayIcon.overlayIcon;
        }
        return overlayIcon.copy(icon, icon2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Icon getMainIcon() {
        return this.mainIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final Icon getOverlayIcon() {
        return this.overlayIcon;
    }

    @NotNull
    public final OverlayIcon copy(@i(name = "icon") @NotNull Icon mainIcon, Icon overlayIcon) {
        Intrinsics.checkNotNullParameter(mainIcon, "mainIcon");
        return new OverlayIcon(mainIcon, overlayIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayIcon)) {
            return false;
        }
        OverlayIcon overlayIcon = (OverlayIcon) other;
        return Intrinsics.d(this.mainIcon, overlayIcon.mainIcon) && Intrinsics.d(this.overlayIcon, overlayIcon.overlayIcon);
    }

    @NotNull
    public final Icon getMainIcon() {
        return this.mainIcon;
    }

    public final Icon getOverlayIcon() {
        return this.overlayIcon;
    }

    public int hashCode() {
        int hashCode = this.mainIcon.hashCode() * 31;
        Icon icon = this.overlayIcon;
        return hashCode + (icon == null ? 0 : icon.hashCode());
    }

    @NotNull
    public String toString() {
        return "OverlayIcon(mainIcon=" + this.mainIcon + ", overlayIcon=" + this.overlayIcon + ")";
    }
}
