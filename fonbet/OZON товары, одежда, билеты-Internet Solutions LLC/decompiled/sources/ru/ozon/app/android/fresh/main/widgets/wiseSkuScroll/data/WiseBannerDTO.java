package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data;

import G.g;
import Nh.a;
import T7.P;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseBannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "imageUrl", "", "videoUrl", "promoBadgeUrl", "adsBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImageUrl", "()Ljava/lang/String;", "getVideoUrl", "getPromoBadgeUrl", "getAdsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WiseBannerDTO {
    private final AtomActionDTO action;
    private final BadgeDTO adsBadge;

    @NotNull
    private final String imageUrl;
    private final String promoBadgeUrl;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String videoUrl;

    public WiseBannerDTO(@NotNull TextDTO title, @NotNull String imageUrl, String str, String str2, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.title = title;
        this.imageUrl = imageUrl;
        this.videoUrl = str;
        this.promoBadgeUrl = str2;
        this.adsBadge = badgeDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ WiseBannerDTO copy$default(WiseBannerDTO wiseBannerDTO, TextDTO textDTO, String str, String str2, String str3, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = wiseBannerDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = wiseBannerDTO.imageUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = wiseBannerDTO.videoUrl;
        }
        if ((i11 & 8) != 0) {
            str3 = wiseBannerDTO.promoBadgeUrl;
        }
        if ((i11 & 16) != 0) {
            badgeDTO = wiseBannerDTO.adsBadge;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = wiseBannerDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = wiseBannerDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        BadgeDTO badgeDTO2 = badgeDTO;
        String str4 = str2;
        return wiseBannerDTO.copy(textDTO, str, str4, str3, badgeDTO2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPromoBadgeUrl() {
        return this.promoBadgeUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getAdsBadge() {
        return this.adsBadge;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final WiseBannerDTO copy(@NotNull TextDTO title, @NotNull String imageUrl, String videoUrl, String promoBadgeUrl, BadgeDTO adsBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new WiseBannerDTO(title, imageUrl, videoUrl, promoBadgeUrl, adsBadge, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiseBannerDTO)) {
            return false;
        }
        WiseBannerDTO wiseBannerDTO = (WiseBannerDTO) other;
        return Intrinsics.d(this.title, wiseBannerDTO.title) && Intrinsics.d(this.imageUrl, wiseBannerDTO.imageUrl) && Intrinsics.d(this.videoUrl, wiseBannerDTO.videoUrl) && Intrinsics.d(this.promoBadgeUrl, wiseBannerDTO.promoBadgeUrl) && Intrinsics.d(this.adsBadge, wiseBannerDTO.adsBadge) && Intrinsics.d(this.action, wiseBannerDTO.action) && Intrinsics.d(this.trackingInfo, wiseBannerDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getAdsBadge() {
        return this.adsBadge;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPromoBadgeUrl() {
        return this.promoBadgeUrl;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.imageUrl);
        String str = this.videoUrl;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promoBadgeUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.adsBadge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        String str = this.imageUrl;
        String str2 = this.videoUrl;
        String str3 = this.promoBadgeUrl;
        BadgeDTO badgeDTO = this.adsBadge;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = D3.g.f("WiseBannerDTO(title=", textDTO, ", imageUrl=", str, ", videoUrl=");
        a.h(f7, str2, ", promoBadgeUrl=", str3, ", adsBadge=");
        f7.append(badgeDTO);
        f7.append(", action=");
        f7.append(atomActionDTO);
        f7.append(", trackingInfo=");
        return P.f(f7, map, ")");
    }
}
