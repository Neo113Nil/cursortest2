package ru.ozon.app.android.common.serviceCarousel.data;

import Bl.b;
import G.g;
import Ih.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jt\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00063"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "storyId", "", "showNewBadge", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "imageBgColor", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getStoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowNewBadge", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getImageBgColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;)Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselItemDTO;", "equals", "other", "hashCode", "toString", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ServiceCarouselItemDTO {

    @NotNull
    private final AtomActionDTO action;
    private final BadgeDTO badge;

    @NotNull
    private final String image;
    private final String imageBgColor;
    private final Boolean showNewBadge;
    private final Integer storyId;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ServiceCarouselItemDTO(@NotNull TextAtom title, @NotNull String image, @NotNull AtomActionDTO action, Integer num, Boolean bool, Map<String, TokenizedTrackingInfo> map, BadgeDTO badgeDTO, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.image = image;
        this.action = action;
        this.storyId = num;
        this.showNewBadge = bool;
        this.trackingInfo = map;
        this.badge = badgeDTO;
        this.imageBgColor = str;
    }

    public static /* synthetic */ ServiceCarouselItemDTO copy$default(ServiceCarouselItemDTO serviceCarouselItemDTO, TextAtom textAtom, String str, AtomActionDTO atomActionDTO, Integer num, Boolean bool, Map map, BadgeDTO badgeDTO, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = serviceCarouselItemDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = serviceCarouselItemDTO.image;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = serviceCarouselItemDTO.action;
        }
        if ((i11 & 8) != 0) {
            num = serviceCarouselItemDTO.storyId;
        }
        if ((i11 & 16) != 0) {
            bool = serviceCarouselItemDTO.showNewBadge;
        }
        if ((i11 & 32) != 0) {
            map = serviceCarouselItemDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            badgeDTO = serviceCarouselItemDTO.badge;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str2 = serviceCarouselItemDTO.imageBgColor;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        String str3 = str2;
        Boolean bool2 = bool;
        Map map2 = map;
        return serviceCarouselItemDTO.copy(textAtom, str, atomActionDTO, num, bool2, map2, badgeDTO2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getStoryId() {
        return this.storyId;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getShowNewBadge() {
        return this.showNewBadge;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImageBgColor() {
        return this.imageBgColor;
    }

    @NotNull
    public final ServiceCarouselItemDTO copy(@NotNull TextAtom title, @NotNull String image, @NotNull AtomActionDTO action, Integer storyId, Boolean showNewBadge, Map<String, TokenizedTrackingInfo> trackingInfo, BadgeDTO badge, String imageBgColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ServiceCarouselItemDTO(title, image, action, storyId, showNewBadge, trackingInfo, badge, imageBgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceCarouselItemDTO)) {
            return false;
        }
        ServiceCarouselItemDTO serviceCarouselItemDTO = (ServiceCarouselItemDTO) other;
        return Intrinsics.d(this.title, serviceCarouselItemDTO.title) && Intrinsics.d(this.image, serviceCarouselItemDTO.image) && Intrinsics.d(this.action, serviceCarouselItemDTO.action) && Intrinsics.d(this.storyId, serviceCarouselItemDTO.storyId) && Intrinsics.d(this.showNewBadge, serviceCarouselItemDTO.showNewBadge) && Intrinsics.d(this.trackingInfo, serviceCarouselItemDTO.trackingInfo) && Intrinsics.d(this.badge, serviceCarouselItemDTO.badge) && Intrinsics.d(this.imageBgColor, serviceCarouselItemDTO.imageBgColor);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final String getImageBgColor() {
        return this.imageBgColor;
    }

    public final Boolean getShowNewBadge() {
        return this.showNewBadge;
    }

    public final Integer getStoryId() {
        return this.storyId;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.action, g.a(this.title.hashCode() * 31, 31, this.image), 31);
        Integer num = this.storyId;
        int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.showNewBadge;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.imageBgColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        String str = this.image;
        AtomActionDTO atomActionDTO = this.action;
        Integer num = this.storyId;
        Boolean bool = this.showNewBadge;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        BadgeDTO badgeDTO = this.badge;
        String str2 = this.imageBgColor;
        StringBuilder d11 = b.d("ServiceCarouselItemDTO(title=", ", image=", str, ", action=", textAtom);
        d11.append(atomActionDTO);
        d11.append(", storyId=");
        d11.append(num);
        d11.append(", showNewBadge=");
        d11.append(bool);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(", badge=");
        d11.append(badgeDTO);
        d11.append(", imageBgColor=");
        d11.append(str2);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ ServiceCarouselItemDTO(TextAtom textAtom, String str, AtomActionDTO atomActionDTO, Integer num, Boolean bool, Map map, BadgeDTO badgeDTO, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, str, atomActionDTO, num, bool, (i11 & 32) != 0 ? null : map, badgeDTO, str2);
    }
}
