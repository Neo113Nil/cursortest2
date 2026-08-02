package ru.ozon.app.android.marketing.widgets.promoStickyBubble.data;

import B0.C2454a;
import GR.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u008e\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u000fHÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 ¨\u00069"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/data/PromoStickyBubbleDTO;", "", "imageUrl", "", "productImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "logoImageUrl", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "anchorKey", "autoHideTimer", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewAction", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getImageUrl", "()Ljava/lang/String;", "getProductImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLogoImageUrl", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAnchorKey", "getAutoHideTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "getViewAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/marketing/widgets/promoStickyBubble/data/PromoStickyBubbleDTO;", "equals", "", "other", "hashCode", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromoStickyBubbleDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String anchorKey;
    private final Integer autoHideTimer;
    private final BadgeDTO badge;

    @NotNull
    private final IconButtonV3DTO closeButton;

    @NotNull
    private final String imageUrl;
    private final String logoImageUrl;
    private final ImageDTO productImage;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final AtomActionDTO viewAction;

    public PromoStickyBubbleDTO(@NotNull String imageUrl, ImageDTO imageDTO, String str, @NotNull IconButtonV3DTO closeButton, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, String str2, Integer num, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO2) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.imageUrl = imageUrl;
        this.productImage = imageDTO;
        this.logoImageUrl = str;
        this.closeButton = closeButton;
        this.badge = badgeDTO;
        this.action = atomActionDTO;
        this.anchorKey = str2;
        this.autoHideTimer = num;
        this.trackingInfo = map;
        this.viewAction = atomActionDTO2;
    }

    public static /* synthetic */ PromoStickyBubbleDTO copy$default(PromoStickyBubbleDTO promoStickyBubbleDTO, String str, ImageDTO imageDTO, String str2, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, String str3, Integer num, Map map, AtomActionDTO atomActionDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = promoStickyBubbleDTO.imageUrl;
        }
        if ((i11 & 2) != 0) {
            imageDTO = promoStickyBubbleDTO.productImage;
        }
        if ((i11 & 4) != 0) {
            str2 = promoStickyBubbleDTO.logoImageUrl;
        }
        if ((i11 & 8) != 0) {
            iconButtonV3DTO = promoStickyBubbleDTO.closeButton;
        }
        if ((i11 & 16) != 0) {
            badgeDTO = promoStickyBubbleDTO.badge;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = promoStickyBubbleDTO.action;
        }
        if ((i11 & 64) != 0) {
            str3 = promoStickyBubbleDTO.anchorKey;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            num = promoStickyBubbleDTO.autoHideTimer;
        }
        if ((i11 & 256) != 0) {
            map = promoStickyBubbleDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            atomActionDTO2 = promoStickyBubbleDTO.viewAction;
        }
        Map map2 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        String str4 = str3;
        Integer num2 = num;
        BadgeDTO badgeDTO2 = badgeDTO;
        AtomActionDTO atomActionDTO4 = atomActionDTO;
        return promoStickyBubbleDTO.copy(str, imageDTO, str2, iconButtonV3DTO, badgeDTO2, atomActionDTO4, str4, num2, map2, atomActionDTO3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomActionDTO getViewAction() {
        return this.viewAction;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDTO getProductImage() {
        return this.productImage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAnchorKey() {
        return this.anchorKey;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getAutoHideTimer() {
        return this.autoHideTimer;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final PromoStickyBubbleDTO copy(@NotNull String imageUrl, ImageDTO productImage, String logoImageUrl, @NotNull IconButtonV3DTO closeButton, BadgeDTO badge, AtomActionDTO action, String anchorKey, Integer autoHideTimer, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO viewAction) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new PromoStickyBubbleDTO(imageUrl, productImage, logoImageUrl, closeButton, badge, action, anchorKey, autoHideTimer, trackingInfo, viewAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoStickyBubbleDTO)) {
            return false;
        }
        PromoStickyBubbleDTO promoStickyBubbleDTO = (PromoStickyBubbleDTO) other;
        return Intrinsics.d(this.imageUrl, promoStickyBubbleDTO.imageUrl) && Intrinsics.d(this.productImage, promoStickyBubbleDTO.productImage) && Intrinsics.d(this.logoImageUrl, promoStickyBubbleDTO.logoImageUrl) && Intrinsics.d(this.closeButton, promoStickyBubbleDTO.closeButton) && Intrinsics.d(this.badge, promoStickyBubbleDTO.badge) && Intrinsics.d(this.action, promoStickyBubbleDTO.action) && Intrinsics.d(this.anchorKey, promoStickyBubbleDTO.anchorKey) && Intrinsics.d(this.autoHideTimer, promoStickyBubbleDTO.autoHideTimer) && Intrinsics.d(this.trackingInfo, promoStickyBubbleDTO.trackingInfo) && Intrinsics.d(this.viewAction, promoStickyBubbleDTO.viewAction);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getAnchorKey() {
        return this.anchorKey;
    }

    public final Integer getAutoHideTimer() {
        return this.autoHideTimer;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public final ImageDTO getProductImage() {
        return this.productImage;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final AtomActionDTO getViewAction() {
        return this.viewAction;
    }

    public int hashCode() {
        int hashCode = this.imageUrl.hashCode() * 31;
        ImageDTO imageDTO = this.productImage;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        String str = this.logoImageUrl;
        int c11 = b.c(this.closeButton, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (c11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.anchorKey;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.autoHideTimer;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.viewAction;
        return hashCode7 + (atomActionDTO2 != null ? atomActionDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        ImageDTO imageDTO = this.productImage;
        String str2 = this.logoImageUrl;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        BadgeDTO badgeDTO = this.badge;
        AtomActionDTO atomActionDTO = this.action;
        String str3 = this.anchorKey;
        Integer num = this.autoHideTimer;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        AtomActionDTO atomActionDTO2 = this.viewAction;
        StringBuilder sb2 = new StringBuilder("PromoStickyBubbleDTO(imageUrl=");
        sb2.append(str);
        sb2.append(", productImage=");
        sb2.append(imageDTO);
        sb2.append(", logoImageUrl=");
        sb2.append(str2);
        sb2.append(", closeButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", anchorKey=");
        C2454a.f(num, str3, ", autoHideTimer=", ", trackingInfo=", sb2);
        sb2.append(map);
        sb2.append(", viewAction=");
        sb2.append(atomActionDTO2);
        sb2.append(")");
        return sb2.toString();
    }
}
