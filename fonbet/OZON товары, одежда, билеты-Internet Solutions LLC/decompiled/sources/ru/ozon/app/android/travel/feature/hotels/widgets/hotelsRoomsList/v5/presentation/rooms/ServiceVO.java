package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import AZ.c;
import El.C2971a;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ServiceVO;", "", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "saleBadge", "<init>", "(ILru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSaleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServiceVO {
    public static final int $stable = IconButtonV3DTO.$stable | IconDTO.$stable;

    @NotNull
    private final IconDTO icon;
    private final int id;
    private final IconButtonV3DTO infoButton;
    private final BadgeDTO saleBadge;

    @NotNull
    private final TextDTO text;

    public ServiceVO(int i11, @NotNull IconDTO icon, @NotNull TextDTO text, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i11;
        this.icon = icon;
        this.text = text;
        this.infoButton = iconButtonV3DTO;
        this.saleBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceVO)) {
            return false;
        }
        ServiceVO serviceVO = (ServiceVO) other;
        return this.id == serviceVO.id && Intrinsics.d(this.icon, serviceVO.icon) && Intrinsics.d(this.text, serviceVO.text) && Intrinsics.d(this.infoButton, serviceVO.infoButton) && Intrinsics.d(this.saleBadge, serviceVO.saleBadge);
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    public final BadgeDTO getSaleBadge() {
        return this.saleBadge;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = b.a(this.text, C2971a.a(this.icon, Integer.hashCode(this.id) * 31, 31), 31);
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.saleBadge;
        return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.text;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        BadgeDTO badgeDTO = this.saleBadge;
        StringBuilder sb2 = new StringBuilder("ServiceVO(id=");
        sb2.append(i11);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(", text=");
        sb2.append(textDTO);
        sb2.append(", infoButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", saleBadge=");
        return c.b(sb2, badgeDTO, ")");
    }
}
