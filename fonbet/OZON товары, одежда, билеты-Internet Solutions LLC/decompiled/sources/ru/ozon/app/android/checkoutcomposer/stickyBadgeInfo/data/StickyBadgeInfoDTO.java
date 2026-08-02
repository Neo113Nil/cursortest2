package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/data/StickyBadgeInfoDTO;", "", "badgeInfo", "Lru/ozon/uni/atoms/data/badge/Badge;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyBadgeInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final Badge badgeInfo;
    private final Paddings paddings;

    public StickyBadgeInfoDTO(@NotNull Badge badgeInfo, Paddings paddings) {
        Intrinsics.checkNotNullParameter(badgeInfo, "badgeInfo");
        this.badgeInfo = badgeInfo;
        this.paddings = paddings;
    }

    public static /* synthetic */ StickyBadgeInfoDTO copy$default(StickyBadgeInfoDTO stickyBadgeInfoDTO, Badge badge, Paddings paddings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badge = stickyBadgeInfoDTO.badgeInfo;
        }
        if ((i11 & 2) != 0) {
            paddings = stickyBadgeInfoDTO.paddings;
        }
        return stickyBadgeInfoDTO.copy(badge, paddings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final StickyBadgeInfoDTO copy(@NotNull Badge badgeInfo, Paddings paddings) {
        Intrinsics.checkNotNullParameter(badgeInfo, "badgeInfo");
        return new StickyBadgeInfoDTO(badgeInfo, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyBadgeInfoDTO)) {
            return false;
        }
        StickyBadgeInfoDTO stickyBadgeInfoDTO = (StickyBadgeInfoDTO) other;
        return Intrinsics.d(this.badgeInfo, stickyBadgeInfoDTO.badgeInfo) && Intrinsics.d(this.paddings, stickyBadgeInfoDTO.paddings);
    }

    @NotNull
    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        int hashCode = this.badgeInfo.hashCode() * 31;
        Paddings paddings = this.paddings;
        return hashCode + (paddings == null ? 0 : paddings.hashCode());
    }

    @NotNull
    public String toString() {
        return "StickyBadgeInfoDTO(badgeInfo=" + this.badgeInfo + ", paddings=" + this.paddings + ")";
    }
}
