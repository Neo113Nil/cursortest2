package ru.ozon.app.android.csma.orderTracking.data;

import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016HÆ\u0003J\u0095\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006B"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/TileDTO;", "", "image", "Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;", "subtitle", "Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/csma/orderTracking/data/AddressDTO;", "marqueeAddress", "Lru/ozon/app/android/csma/orderTracking/data/MarqueeAddressDTO;", "description", "Lru/ozon/app/android/csma/orderTracking/data/DescriptionDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "actionBadge", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;Lru/ozon/app/android/csma/orderTracking/data/AddressDTO;Lru/ozon/app/android/csma/orderTracking/data/MarqueeAddressDTO;Lru/ozon/app/android/csma/orderTracking/data/DescriptionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitle", "()Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;", "getSubtitle", "()Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;", "getAddress", "()Lru/ozon/app/android/csma/orderTracking/data/AddressDTO;", "getMarqueeAddress", "()Lru/ozon/app/android/csma/orderTracking/data/MarqueeAddressDTO;", "getDescription", "()Lru/ozon/app/android/csma/orderTracking/data/DescriptionDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getActionBadge", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TileDTO {
    private final AtomActionDTO action;
    private final BadgeDTO actionBadge;
    private final AddressDTO address;
    private final BadgeDTO badge;
    private final ButtonDTO button;
    private final DescriptionDTO description;

    @NotNull
    private final ImageDTO image;
    private final MarqueeAddressDTO marqueeAddress;
    private final SubtitleDTO subtitle;

    @NotNull
    private final TitleDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TileDTO(@NotNull ImageDTO image, BadgeDTO badgeDTO, @NotNull TitleDTO title, SubtitleDTO subtitleDTO, AddressDTO addressDTO, MarqueeAddressDTO marqueeAddressDTO, DescriptionDTO descriptionDTO, ButtonDTO buttonDTO, BadgeDTO badgeDTO2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        this.image = image;
        this.badge = badgeDTO;
        this.title = title;
        this.subtitle = subtitleDTO;
        this.address = addressDTO;
        this.marqueeAddress = marqueeAddressDTO;
        this.description = descriptionDTO;
        this.button = buttonDTO;
        this.actionBadge = badgeDTO2;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TileDTO copy$default(TileDTO tileDTO, ImageDTO imageDTO, BadgeDTO badgeDTO, TitleDTO titleDTO, SubtitleDTO subtitleDTO, AddressDTO addressDTO, MarqueeAddressDTO marqueeAddressDTO, DescriptionDTO descriptionDTO, ButtonDTO buttonDTO, BadgeDTO badgeDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = tileDTO.image;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = tileDTO.badge;
        }
        if ((i11 & 4) != 0) {
            titleDTO = tileDTO.title;
        }
        if ((i11 & 8) != 0) {
            subtitleDTO = tileDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            addressDTO = tileDTO.address;
        }
        if ((i11 & 32) != 0) {
            marqueeAddressDTO = tileDTO.marqueeAddress;
        }
        if ((i11 & 64) != 0) {
            descriptionDTO = tileDTO.description;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            buttonDTO = tileDTO.button;
        }
        if ((i11 & 256) != 0) {
            badgeDTO2 = tileDTO.actionBadge;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            atomActionDTO = tileDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = tileDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        ButtonDTO buttonDTO2 = buttonDTO;
        BadgeDTO badgeDTO3 = badgeDTO2;
        MarqueeAddressDTO marqueeAddressDTO2 = marqueeAddressDTO;
        DescriptionDTO descriptionDTO2 = descriptionDTO;
        AddressDTO addressDTO2 = addressDTO;
        TitleDTO titleDTO2 = titleDTO;
        return tileDTO.copy(imageDTO, badgeDTO, titleDTO2, subtitleDTO, addressDTO2, marqueeAddressDTO2, descriptionDTO2, buttonDTO2, badgeDTO3, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TitleDTO getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final SubtitleDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final AddressDTO getAddress() {
        return this.address;
    }

    /* renamed from: component6, reason: from getter */
    public final MarqueeAddressDTO getMarqueeAddress() {
        return this.marqueeAddress;
    }

    /* renamed from: component7, reason: from getter */
    public final DescriptionDTO getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonDTO getButton() {
        return this.button;
    }

    /* renamed from: component9, reason: from getter */
    public final BadgeDTO getActionBadge() {
        return this.actionBadge;
    }

    @NotNull
    public final TileDTO copy(@NotNull ImageDTO image, BadgeDTO badge, @NotNull TitleDTO title, SubtitleDTO subtitle, AddressDTO address, MarqueeAddressDTO marqueeAddress, DescriptionDTO description, ButtonDTO button, BadgeDTO actionBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        return new TileDTO(image, badge, title, subtitle, address, marqueeAddress, description, button, actionBadge, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileDTO)) {
            return false;
        }
        TileDTO tileDTO = (TileDTO) other;
        return Intrinsics.d(this.image, tileDTO.image) && Intrinsics.d(this.badge, tileDTO.badge) && Intrinsics.d(this.title, tileDTO.title) && Intrinsics.d(this.subtitle, tileDTO.subtitle) && Intrinsics.d(this.address, tileDTO.address) && Intrinsics.d(this.marqueeAddress, tileDTO.marqueeAddress) && Intrinsics.d(this.description, tileDTO.description) && Intrinsics.d(this.button, tileDTO.button) && Intrinsics.d(this.actionBadge, tileDTO.actionBadge) && Intrinsics.d(this.action, tileDTO.action) && Intrinsics.d(this.trackingInfo, tileDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getActionBadge() {
        return this.actionBadge;
    }

    public final AddressDTO getAddress() {
        return this.address;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    public final DescriptionDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final MarqueeAddressDTO getMarqueeAddress() {
        return this.marqueeAddress;
    }

    public final SubtitleDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TitleDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (this.title.hashCode() + ((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31)) * 31;
        SubtitleDTO subtitleDTO = this.subtitle;
        int hashCode3 = (hashCode2 + (subtitleDTO == null ? 0 : subtitleDTO.hashCode())) * 31;
        AddressDTO addressDTO = this.address;
        int hashCode4 = (hashCode3 + (addressDTO == null ? 0 : addressDTO.hashCode())) * 31;
        MarqueeAddressDTO marqueeAddressDTO = this.marqueeAddress;
        int hashCode5 = (hashCode4 + (marqueeAddressDTO == null ? 0 : marqueeAddressDTO.hashCode())) * 31;
        DescriptionDTO descriptionDTO = this.description;
        int hashCode6 = (hashCode5 + (descriptionDTO == null ? 0 : descriptionDTO.hashCode())) * 31;
        ButtonDTO buttonDTO = this.button;
        int hashCode7 = (hashCode6 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.actionBadge;
        int hashCode8 = (hashCode7 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode9 = (hashCode8 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode9 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        BadgeDTO badgeDTO = this.badge;
        TitleDTO titleDTO = this.title;
        SubtitleDTO subtitleDTO = this.subtitle;
        AddressDTO addressDTO = this.address;
        MarqueeAddressDTO marqueeAddressDTO = this.marqueeAddress;
        DescriptionDTO descriptionDTO = this.description;
        ButtonDTO buttonDTO = this.button;
        BadgeDTO badgeDTO2 = this.actionBadge;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TileDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", title=");
        sb2.append(titleDTO);
        sb2.append(", subtitle=");
        sb2.append(subtitleDTO);
        sb2.append(", address=");
        sb2.append(addressDTO);
        sb2.append(", marqueeAddress=");
        sb2.append(marqueeAddressDTO);
        sb2.append(", description=");
        sb2.append(descriptionDTO);
        sb2.append(", button=");
        sb2.append(buttonDTO);
        sb2.append(", actionBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
