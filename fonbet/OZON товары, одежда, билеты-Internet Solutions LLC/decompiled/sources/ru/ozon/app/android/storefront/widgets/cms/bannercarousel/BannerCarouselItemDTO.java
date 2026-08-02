package ru.ozon.app.android.storefront.widgets.cms.bannercarousel;

import N3.C3660k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItemDTO;", "", "image", "", "deeplink", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "adBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getImage", "()Ljava/lang/String;", "getDeeplink", "getTrackingInfo", "()Ljava/util/Map;", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BannerCarouselItemDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final BadgeDTO adBadge;
    private final String backgroundColor;
    private final String deeplink;

    @NotNull
    private final String image;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BannerCarouselItemDTO(@NotNull String image, String str, Map<String, TokenizedTrackingInfo> map, BadgeDTO badgeDTO, String str2, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.deeplink = str;
        this.trackingInfo = map;
        this.adBadge = badgeDTO;
        this.backgroundColor = str2;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ BannerCarouselItemDTO copy$default(BannerCarouselItemDTO bannerCarouselItemDTO, String str, String str2, Map map, BadgeDTO badgeDTO, String str3, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bannerCarouselItemDTO.image;
        }
        if ((i11 & 2) != 0) {
            str2 = bannerCarouselItemDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            map = bannerCarouselItemDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = bannerCarouselItemDTO.adBadge;
        }
        if ((i11 & 16) != 0) {
            str3 = bannerCarouselItemDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = bannerCarouselItemDTO.action;
        }
        String str4 = str3;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return bannerCarouselItemDTO.copy(str, str2, map, badgeDTO, str4, atomActionDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getAdBadge() {
        return this.adBadge;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final BannerCarouselItemDTO copy(@NotNull String image, String deeplink, Map<String, TokenizedTrackingInfo> trackingInfo, BadgeDTO adBadge, String backgroundColor, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BannerCarouselItemDTO(image, deeplink, trackingInfo, adBadge, backgroundColor, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerCarouselItemDTO)) {
            return false;
        }
        BannerCarouselItemDTO bannerCarouselItemDTO = (BannerCarouselItemDTO) other;
        return Intrinsics.d(this.image, bannerCarouselItemDTO.image) && Intrinsics.d(this.deeplink, bannerCarouselItemDTO.deeplink) && Intrinsics.d(this.trackingInfo, bannerCarouselItemDTO.trackingInfo) && Intrinsics.d(this.adBadge, bannerCarouselItemDTO.adBadge) && Intrinsics.d(this.backgroundColor, bannerCarouselItemDTO.backgroundColor) && Intrinsics.d(this.action, bannerCarouselItemDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getAdBadge() {
        return this.adBadge;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        BadgeDTO badgeDTO = this.adBadge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode5 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.deeplink;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        BadgeDTO badgeDTO = this.adBadge;
        String str3 = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder d11 = C3660k.d("BannerCarouselItemDTO(image=", str, ", deeplink=", str2, ", trackingInfo=");
        d11.append(map);
        d11.append(", adBadge=");
        d11.append(badgeDTO);
        d11.append(", backgroundColor=");
        d11.append(str3);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ BannerCarouselItemDTO(String str, String str2, Map map, BadgeDTO badgeDTO, String str3, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, badgeDTO, str3, (i11 & 32) != 0 ? null : atomActionDTO);
    }
}
