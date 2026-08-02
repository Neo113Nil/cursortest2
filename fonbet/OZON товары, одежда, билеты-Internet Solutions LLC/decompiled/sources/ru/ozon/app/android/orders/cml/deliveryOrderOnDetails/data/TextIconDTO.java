package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/TextIconDTO;", "", "status", "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getStatus", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextIconDTO {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final BadgeDTO badge;
    private final CommonControlSettings common;
    private final IconButtonV3DTO iconButton;

    @NotNull
    private final TextDTO status;

    public TextIconDTO(@NotNull TextDTO status, IconButtonV3DTO iconButtonV3DTO, CommonControlSettings commonControlSettings, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.iconButton = iconButtonV3DTO;
        this.common = commonControlSettings;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ TextIconDTO copy$default(TextIconDTO textIconDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, CommonControlSettings commonControlSettings, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = textIconDTO.status;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = textIconDTO.iconButton;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = textIconDTO.common;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = textIconDTO.badge;
        }
        return textIconDTO.copy(textDTO, iconButtonV3DTO, commonControlSettings, badgeDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final TextIconDTO copy(@NotNull TextDTO status, IconButtonV3DTO iconButton, CommonControlSettings common, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new TextIconDTO(status, iconButton, common, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIconDTO)) {
            return false;
        }
        TextIconDTO textIconDTO = (TextIconDTO) other;
        return Intrinsics.d(this.status, textIconDTO.status) && Intrinsics.d(this.iconButton, textIconDTO.iconButton) && Intrinsics.d(this.common, textIconDTO.common) && Intrinsics.d(this.badge, textIconDTO.badge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final TextDTO getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextIconDTO(status=" + this.status + ", iconButton=" + this.iconButton + ", common=" + this.common + ", badge=" + this.badge + ")";
    }
}
