package ru.ozon.app.android.storefront.widgets.placementSlider.data;

import G.g;
import N3.C3660k;
import Ns.b;
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
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J{\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/data/BannerDTO;", "", "lightBackgroundColor", "", "darkBackgroundColor", "imageURL", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "actionBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "viewAction", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getLightBackgroundColor", "()Ljava/lang/String;", "getDarkBackgroundColor", "getImageURL", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getActionBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getViewAction", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final BadgeDTO actionBadge;
    private final String darkBackgroundColor;

    @NotNull
    private final String imageURL;
    private final String lightBackgroundColor;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final AtomActionDTO viewAction;

    public BannerDTO(String str, String str2, @NotNull String imageURL, @NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.lightBackgroundColor = str;
        this.darkBackgroundColor = str2;
        this.imageURL = imageURL;
        this.title = title;
        this.subtitle = subtitle;
        this.actionBadge = badgeDTO;
        this.action = atomActionDTO;
        this.viewAction = atomActionDTO2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ BannerDTO copy$default(BannerDTO bannerDTO, String str, String str2, String str3, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bannerDTO.lightBackgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = bannerDTO.darkBackgroundColor;
        }
        if ((i11 & 4) != 0) {
            str3 = bannerDTO.imageURL;
        }
        if ((i11 & 8) != 0) {
            textDTO = bannerDTO.title;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = bannerDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = bannerDTO.actionBadge;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = bannerDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO2 = bannerDTO.viewAction;
        }
        if ((i11 & 256) != 0) {
            map = bannerDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        Map map2 = map;
        BadgeDTO badgeDTO2 = badgeDTO;
        AtomActionDTO atomActionDTO4 = atomActionDTO;
        TextDTO textDTO3 = textDTO2;
        String str4 = str3;
        return bannerDTO.copy(str, str2, str4, textDTO, textDTO3, badgeDTO2, atomActionDTO4, atomActionDTO3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLightBackgroundColor() {
        return this.lightBackgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDarkBackgroundColor() {
        return this.darkBackgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getActionBadge() {
        return this.actionBadge;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getViewAction() {
        return this.viewAction;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final BannerDTO copy(String lightBackgroundColor, String darkBackgroundColor, @NotNull String imageURL, @NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO actionBadge, AtomActionDTO action, AtomActionDTO viewAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new BannerDTO(lightBackgroundColor, darkBackgroundColor, imageURL, title, subtitle, actionBadge, action, viewAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerDTO)) {
            return false;
        }
        BannerDTO bannerDTO = (BannerDTO) other;
        return Intrinsics.d(this.lightBackgroundColor, bannerDTO.lightBackgroundColor) && Intrinsics.d(this.darkBackgroundColor, bannerDTO.darkBackgroundColor) && Intrinsics.d(this.imageURL, bannerDTO.imageURL) && Intrinsics.d(this.title, bannerDTO.title) && Intrinsics.d(this.subtitle, bannerDTO.subtitle) && Intrinsics.d(this.actionBadge, bannerDTO.actionBadge) && Intrinsics.d(this.action, bannerDTO.action) && Intrinsics.d(this.viewAction, bannerDTO.viewAction) && Intrinsics.d(this.trackingInfo, bannerDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getActionBadge() {
        return this.actionBadge;
    }

    public final String getDarkBackgroundColor() {
        return this.darkBackgroundColor;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getLightBackgroundColor() {
        return this.lightBackgroundColor;
    }

    @NotNull
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

    public final AtomActionDTO getViewAction() {
        return this.viewAction;
    }

    public int hashCode() {
        String str = this.lightBackgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkBackgroundColor;
        int a11 = b.a(this.subtitle, b.a(this.title, g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.imageURL), 31), 31);
        BadgeDTO badgeDTO = this.actionBadge;
        int hashCode2 = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.viewAction;
        int hashCode4 = (hashCode3 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.lightBackgroundColor;
        String str2 = this.darkBackgroundColor;
        String str3 = this.imageURL;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.actionBadge;
        AtomActionDTO atomActionDTO = this.action;
        AtomActionDTO atomActionDTO2 = this.viewAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("BannerDTO(lightBackgroundColor=", str, ", darkBackgroundColor=", str2, ", imageURL=");
        d11.append(str3);
        d11.append(", title=");
        d11.append(textDTO);
        d11.append(", subtitle=");
        d11.append(textDTO2);
        d11.append(", actionBadge=");
        d11.append(badgeDTO);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", viewAction=");
        d11.append(atomActionDTO2);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
