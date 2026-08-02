package ru.ozon.app.android.travel.molecules.dto.banner;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0095\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0006HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/banner/BannerDTO;", "", "leftImageLink", "", "rightImageLink", "height", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "gradientColor", "solidColor", "contourColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/Map;)V", "getLeftImageLink", "()Ljava/lang/String;", "getRightImageLink", "getHeight", "()I", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getGradientColor", "getSolidColor", "getContourColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerDTO {
    private final AtomActionDTO action;
    private final IconButtonV3DTO closeButton;
    private final String contourColor;
    private final String gradientColor;
    private final int height;
    private final String leftImageLink;

    @NotNull
    private final String rightImageLink;
    private final String solidColor;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BannerDTO(String str, @NotNull String rightImageLink, int i11, TextDTO textDTO, TextDTO textDTO2, String str2, String str3, String str4, AtomActionDTO atomActionDTO, IconButtonV3DTO iconButtonV3DTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(rightImageLink, "rightImageLink");
        this.leftImageLink = str;
        this.rightImageLink = rightImageLink;
        this.height = i11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.gradientColor = str2;
        this.solidColor = str3;
        this.contourColor = str4;
        this.action = atomActionDTO;
        this.closeButton = iconButtonV3DTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ BannerDTO copy$default(BannerDTO bannerDTO, String str, String str2, int i11, TextDTO textDTO, TextDTO textDTO2, String str3, String str4, String str5, AtomActionDTO atomActionDTO, IconButtonV3DTO iconButtonV3DTO, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bannerDTO.leftImageLink;
        }
        if ((i12 & 2) != 0) {
            str2 = bannerDTO.rightImageLink;
        }
        if ((i12 & 4) != 0) {
            i11 = bannerDTO.height;
        }
        if ((i12 & 8) != 0) {
            textDTO = bannerDTO.title;
        }
        if ((i12 & 16) != 0) {
            textDTO2 = bannerDTO.subtitle;
        }
        if ((i12 & 32) != 0) {
            str3 = bannerDTO.gradientColor;
        }
        if ((i12 & 64) != 0) {
            str4 = bannerDTO.solidColor;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str5 = bannerDTO.contourColor;
        }
        if ((i12 & 256) != 0) {
            atomActionDTO = bannerDTO.action;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            iconButtonV3DTO = bannerDTO.closeButton;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = bannerDTO.trackingInfo;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        Map map2 = map;
        String str6 = str5;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str7 = str3;
        String str8 = str4;
        TextDTO textDTO3 = textDTO2;
        int i13 = i11;
        return bannerDTO.copy(str, str2, i13, textDTO, textDTO3, str7, str8, str6, atomActionDTO2, iconButtonV3DTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeftImageLink() {
        return this.leftImageLink;
    }

    /* renamed from: component10, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRightImageLink() {
        return this.rightImageLink;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getGradientColor() {
        return this.gradientColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSolidColor() {
        return this.solidColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContourColor() {
        return this.contourColor;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final BannerDTO copy(String leftImageLink, @NotNull String rightImageLink, int height, TextDTO title, TextDTO subtitle, String gradientColor, String solidColor, String contourColor, AtomActionDTO action, IconButtonV3DTO closeButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(rightImageLink, "rightImageLink");
        return new BannerDTO(leftImageLink, rightImageLink, height, title, subtitle, gradientColor, solidColor, contourColor, action, closeButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerDTO)) {
            return false;
        }
        BannerDTO bannerDTO = (BannerDTO) other;
        return Intrinsics.d(this.leftImageLink, bannerDTO.leftImageLink) && Intrinsics.d(this.rightImageLink, bannerDTO.rightImageLink) && this.height == bannerDTO.height && Intrinsics.d(this.title, bannerDTO.title) && Intrinsics.d(this.subtitle, bannerDTO.subtitle) && Intrinsics.d(this.gradientColor, bannerDTO.gradientColor) && Intrinsics.d(this.solidColor, bannerDTO.solidColor) && Intrinsics.d(this.contourColor, bannerDTO.contourColor) && Intrinsics.d(this.action, bannerDTO.action) && Intrinsics.d(this.closeButton, bannerDTO.closeButton) && Intrinsics.d(this.trackingInfo, bannerDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final String getContourColor() {
        return this.contourColor;
    }

    public final String getGradientColor() {
        return this.gradientColor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getLeftImageLink() {
        return this.leftImageLink;
    }

    @NotNull
    public final String getRightImageLink() {
        return this.rightImageLink;
    }

    public final String getSolidColor() {
        return this.solidColor;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.leftImageLink;
        int a11 = C2454a.a(this.height, g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.rightImageLink), 31);
        TextDTO textDTO = this.title;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        String str2 = this.gradientColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.solidColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contourColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode7 = (hashCode6 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.leftImageLink;
        String str2 = this.rightImageLink;
        int i11 = this.height;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str3 = this.gradientColor;
        String str4 = this.solidColor;
        String str5 = this.contourColor;
        AtomActionDTO atomActionDTO = this.action;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("BannerDTO(leftImageLink=", str, ", rightImageLink=", str2, ", height=");
        d11.append(i11);
        d11.append(", title=");
        d11.append(textDTO);
        d11.append(", subtitle=");
        d11.append(textDTO2);
        d11.append(", gradientColor=");
        d11.append(str3);
        d11.append(", solidColor=");
        a.h(d11, str4, ", contourColor=", str5, ", action=");
        d11.append(atomActionDTO);
        d11.append(", closeButton=");
        d11.append(iconButtonV3DTO);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
