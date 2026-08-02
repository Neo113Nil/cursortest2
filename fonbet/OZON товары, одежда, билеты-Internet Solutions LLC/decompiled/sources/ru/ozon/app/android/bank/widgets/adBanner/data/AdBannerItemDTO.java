package ru.ozon.app.android.bank.widgets.adBanner.data;

import G.g;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0085\u0001\u00101\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "slug", "", "placementSlug", "imageDark", "subtitle", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getSlug", "()Ljava/lang/String;", "getPlacementSlug", "getImageDark", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdBannerItemDTO {
    private final AtomActionDTO action;
    private final ButtonV3DTO button;
    private final IconButtonV3DTO closeButton;

    @NotNull
    private final ImageDTO image;
    private final ImageDTO imageDark;

    @NotNull
    private final String placementSlug;

    @NotNull
    private final String slug;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AdBannerItemDTO(@i(name = "title") @NotNull TextDTO title, @i(name = "image") @NotNull ImageDTO image, @i(name = "slug") @NotNull String slug, @i(name = "placementSlug") @NotNull String placementSlug, @i(name = "imageDark") ImageDTO imageDTO, @i(name = "subtitle") TextDTO textDTO, @i(name = "button") ButtonV3DTO buttonV3DTO, @i(name = "closeButton") IconButtonV3DTO iconButtonV3DTO, @i(name = "action") AtomActionDTO atomActionDTO, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(placementSlug, "placementSlug");
        this.title = title;
        this.image = image;
        this.slug = slug;
        this.placementSlug = placementSlug;
        this.imageDark = imageDTO;
        this.subtitle = textDTO;
        this.button = buttonV3DTO;
        this.closeButton = iconButtonV3DTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AdBannerItemDTO copy$default(AdBannerItemDTO adBannerItemDTO, TextDTO textDTO, ImageDTO imageDTO, String str, String str2, ImageDTO imageDTO2, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = adBannerItemDTO.title;
        }
        if ((i11 & 2) != 0) {
            imageDTO = adBannerItemDTO.image;
        }
        if ((i11 & 4) != 0) {
            str = adBannerItemDTO.slug;
        }
        if ((i11 & 8) != 0) {
            str2 = adBannerItemDTO.placementSlug;
        }
        if ((i11 & 16) != 0) {
            imageDTO2 = adBannerItemDTO.imageDark;
        }
        if ((i11 & 32) != 0) {
            textDTO2 = adBannerItemDTO.subtitle;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO = adBannerItemDTO.button;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO = adBannerItemDTO.closeButton;
        }
        if ((i11 & 256) != 0) {
            atomActionDTO = adBannerItemDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = adBannerItemDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        ImageDTO imageDTO3 = imageDTO2;
        TextDTO textDTO3 = textDTO2;
        return adBannerItemDTO.copy(textDTO, imageDTO, str, str2, imageDTO3, textDTO3, buttonV3DTO2, iconButtonV3DTO2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPlacementSlug() {
        return this.placementSlug;
    }

    /* renamed from: component5, reason: from getter */
    public final ImageDTO getImageDark() {
        return this.imageDark;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final AdBannerItemDTO copy(@i(name = "title") @NotNull TextDTO title, @i(name = "image") @NotNull ImageDTO image, @i(name = "slug") @NotNull String slug, @i(name = "placementSlug") @NotNull String placementSlug, @i(name = "imageDark") ImageDTO imageDark, @i(name = "subtitle") TextDTO subtitle, @i(name = "button") ButtonV3DTO button, @i(name = "closeButton") IconButtonV3DTO closeButton, @i(name = "action") AtomActionDTO action, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(placementSlug, "placementSlug");
        return new AdBannerItemDTO(title, image, slug, placementSlug, imageDark, subtitle, button, closeButton, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdBannerItemDTO)) {
            return false;
        }
        AdBannerItemDTO adBannerItemDTO = (AdBannerItemDTO) other;
        return Intrinsics.d(this.title, adBannerItemDTO.title) && Intrinsics.d(this.image, adBannerItemDTO.image) && Intrinsics.d(this.slug, adBannerItemDTO.slug) && Intrinsics.d(this.placementSlug, adBannerItemDTO.placementSlug) && Intrinsics.d(this.imageDark, adBannerItemDTO.imageDark) && Intrinsics.d(this.subtitle, adBannerItemDTO.subtitle) && Intrinsics.d(this.button, adBannerItemDTO.button) && Intrinsics.d(this.closeButton, adBannerItemDTO.closeButton) && Intrinsics.d(this.action, adBannerItemDTO.action) && Intrinsics.d(this.trackingInfo, adBannerItemDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final ImageDTO getImageDark() {
        return this.imageDark;
    }

    @NotNull
    public final String getPlacementSlug() {
        return this.placementSlug;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(a.b(this.image, this.title.hashCode() * 31, 31), 31, this.slug), 31, this.placementSlug);
        ImageDTO imageDTO = this.imageDark;
        int hashCode = (a11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        ImageDTO imageDTO = this.image;
        String str = this.slug;
        String str2 = this.placementSlug;
        ImageDTO imageDTO2 = this.imageDark;
        TextDTO textDTO2 = this.subtitle;
        ButtonV3DTO buttonV3DTO = this.button;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AdBannerItemDTO(title=");
        sb2.append(textDTO);
        sb2.append(", image=");
        sb2.append(imageDTO);
        sb2.append(", slug=");
        a.h(sb2, str, ", placementSlug=", str2, ", imageDark=");
        sb2.append(imageDTO2);
        sb2.append(", subtitle=");
        sb2.append(textDTO2);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", closeButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", action=");
        return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ AdBannerItemDTO(TextDTO textDTO, ImageDTO imageDTO, String str, String str2, ImageDTO imageDTO2, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, imageDTO, str, str2, imageDTO2, textDTO2, buttonV3DTO, iconButtonV3DTO, (i11 & 256) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
    }
}
