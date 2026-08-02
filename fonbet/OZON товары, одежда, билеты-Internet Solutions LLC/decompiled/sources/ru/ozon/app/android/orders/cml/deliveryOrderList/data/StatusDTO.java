package ru.ozon.app.android.orders.cml.deliveryOrderList.data;

import AZ.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StatusDTO {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final BadgeDTO badge;
    private final IconButtonV3DTO iconButton;

    @NotNull
    private final TextDTO text;

    public StatusDTO(@NotNull TextDTO text, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.iconButton = iconButtonV3DTO;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ StatusDTO copy$default(StatusDTO statusDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = statusDTO.text;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = statusDTO.iconButton;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = statusDTO.badge;
        }
        return statusDTO.copy(textDTO, iconButtonV3DTO, badgeDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final StatusDTO copy(@NotNull TextDTO text, IconButtonV3DTO iconButton, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new StatusDTO(text, iconButton, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusDTO)) {
            return false;
        }
        StatusDTO statusDTO = (StatusDTO) other;
        return Intrinsics.d(this.text, statusDTO.text) && Intrinsics.d(this.iconButton, statusDTO.iconButton) && Intrinsics.d(this.badge, statusDTO.badge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder sb2 = new StringBuilder("StatusDTO(text=");
        sb2.append(textDTO);
        sb2.append(", iconButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", badge=");
        return c.b(sb2, badgeDTO, ")");
    }
}
