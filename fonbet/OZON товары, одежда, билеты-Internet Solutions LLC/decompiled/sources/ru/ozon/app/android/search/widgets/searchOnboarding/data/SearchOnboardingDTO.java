package ru.ozon.app.android.search.widgets.searchOnboarding.data;

import B4.V;
import B90.C2616s;
import D40.c;
import Gl.C3124a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00062"}, d2 = {"Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "openControl", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "crossTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/Map;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getOpenControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTrackingInfo", "()Ljava/util/Map;", "getCrossTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchOnboardingDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;
    private final CornerRadius cornerRadius;

    @NotNull
    private final Map<String, TokenizedTrackingInfo> crossTrackingInfo;

    @NotNull
    private final ImageDTO image;
    private final CommonControlSettings openControl;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SearchOnboardingDTO(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull BadgeDTO badge, String str, CornerRadius cornerRadius, CommonControlSettings commonControlSettings, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull Map<String, TokenizedTrackingInfo> crossTrackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(crossTrackingInfo, "crossTrackingInfo");
        this.image = image;
        this.title = title;
        this.badge = badge;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.openControl = commonControlSettings;
        this.trackingInfo = trackingInfo;
        this.crossTrackingInfo = crossTrackingInfo;
    }

    public static /* synthetic */ SearchOnboardingDTO copy$default(SearchOnboardingDTO searchOnboardingDTO, ImageDTO imageDTO, TextDTO textDTO, BadgeDTO badgeDTO, String str, CornerRadius cornerRadius, CommonControlSettings commonControlSettings, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = searchOnboardingDTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = searchOnboardingDTO.title;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = searchOnboardingDTO.badge;
        }
        if ((i11 & 8) != 0) {
            str = searchOnboardingDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = searchOnboardingDTO.cornerRadius;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = searchOnboardingDTO.openControl;
        }
        if ((i11 & 64) != 0) {
            map = searchOnboardingDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map2 = searchOnboardingDTO.crossTrackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        CornerRadius cornerRadius2 = cornerRadius;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return searchOnboardingDTO.copy(imageDTO, textDTO, badgeDTO, str, cornerRadius2, commonControlSettings2, map3, map4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getOpenControl() {
        return this.openControl;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.crossTrackingInfo;
    }

    @NotNull
    public final SearchOnboardingDTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull BadgeDTO badge, String backgroundColor, CornerRadius cornerRadius, CommonControlSettings openControl, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull Map<String, TokenizedTrackingInfo> crossTrackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(crossTrackingInfo, "crossTrackingInfo");
        return new SearchOnboardingDTO(image, title, badge, backgroundColor, cornerRadius, openControl, trackingInfo, crossTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchOnboardingDTO)) {
            return false;
        }
        SearchOnboardingDTO searchOnboardingDTO = (SearchOnboardingDTO) other;
        return Intrinsics.d(this.image, searchOnboardingDTO.image) && Intrinsics.d(this.title, searchOnboardingDTO.title) && Intrinsics.d(this.badge, searchOnboardingDTO.badge) && Intrinsics.d(this.backgroundColor, searchOnboardingDTO.backgroundColor) && this.cornerRadius == searchOnboardingDTO.cornerRadius && Intrinsics.d(this.openControl, searchOnboardingDTO.openControl) && Intrinsics.d(this.trackingInfo, searchOnboardingDTO.trackingInfo) && Intrinsics.d(this.crossTrackingInfo, searchOnboardingDTO.crossTrackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> getCrossTrackingInfo() {
        return this.crossTrackingInfo;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final CommonControlSettings getOpenControl() {
        return this.openControl;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C3124a.c(this.badge, b.a(this.title, this.image.hashCode() * 31, 31), 31);
        String str = this.backgroundColor;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.openControl;
        return this.crossTrackingInfo.hashCode() + c.a(this.trackingInfo, (hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        CommonControlSettings commonControlSettings = this.openControl;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.crossTrackingInfo;
        StringBuilder d11 = C2616s.d("SearchOnboardingDTO(image=", imageDTO, ", title=", textDTO, ", badge=");
        d11.append(badgeDTO);
        d11.append(", backgroundColor=");
        d11.append(str);
        d11.append(", cornerRadius=");
        d11.append(cornerRadius);
        d11.append(", openControl=");
        d11.append(commonControlSettings);
        d11.append(", trackingInfo=");
        return V.c(d11, map, ", crossTrackingInfo=", map2, ")");
    }
}
