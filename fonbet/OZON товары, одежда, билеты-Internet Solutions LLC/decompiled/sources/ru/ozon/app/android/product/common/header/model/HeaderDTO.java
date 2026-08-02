package ru.ozon.app.android.product.common.header.model;

import N3.C3660k;
import Sh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/app/android/product/common/header/model/HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "multilineLink", "Lru/ozon/app/android/product/common/header/model/MultilineLink;", "disclosure", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/product/common/header/model/MultilineLink;Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getMultilineLink", "()Lru/ozon/app/android/product/common/header/model/MultilineLink;", "getDisclosure", "()Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderDTO {
    private final AtomActionDTO action;
    private final BadgeDTO badge;
    private final DisclosureAtom disclosure;
    private final MultilineLink multilineLink;
    private final String subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HeaderDTO(@NotNull String title, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, MultilineLink multilineLink, DisclosureAtom disclosureAtom, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.multilineLink = multilineLink;
        this.disclosure = disclosureAtom;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, MultilineLink multilineLink, DisclosureAtom disclosureAtom, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = headerDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = headerDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = headerDTO.action;
        }
        if ((i11 & 8) != 0) {
            map = headerDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            testInfo = headerDTO.testInfo;
        }
        if ((i11 & 32) != 0) {
            multilineLink = headerDTO.multilineLink;
        }
        if ((i11 & 64) != 0) {
            disclosureAtom = headerDTO.disclosure;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            badgeDTO = headerDTO.badge;
        }
        DisclosureAtom disclosureAtom2 = disclosureAtom;
        BadgeDTO badgeDTO2 = badgeDTO;
        TestInfo testInfo2 = testInfo;
        MultilineLink multilineLink2 = multilineLink;
        return headerDTO.copy(str, str2, atomActionDTO, map, testInfo2, multilineLink2, disclosureAtom2, badgeDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final MultilineLink getMultilineLink() {
        return this.multilineLink;
    }

    /* renamed from: component7, reason: from getter */
    public final DisclosureAtom getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component8, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final HeaderDTO copy(@NotNull String title, String subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, MultilineLink multilineLink, DisclosureAtom disclosure, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderDTO(title, subtitle, action, trackingInfo, testInfo, multilineLink, disclosure, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && Intrinsics.d(this.action, headerDTO.action) && Intrinsics.d(this.trackingInfo, headerDTO.trackingInfo) && Intrinsics.d(this.testInfo, headerDTO.testInfo) && Intrinsics.d(this.multilineLink, headerDTO.multilineLink) && Intrinsics.d(this.disclosure, headerDTO.disclosure) && Intrinsics.d(this.badge, headerDTO.badge);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final DisclosureAtom getDisclosure() {
        return this.disclosure;
    }

    public final MultilineLink getMultilineLink() {
        return this.multilineLink;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        MultilineLink multilineLink = this.multilineLink;
        int hashCode6 = (hashCode5 + (multilineLink == null ? 0 : multilineLink.hashCode())) * 31;
        DisclosureAtom disclosureAtom = this.disclosure;
        int hashCode7 = (hashCode6 + (disclosureAtom == null ? 0 : disclosureAtom.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode7 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        MultilineLink multilineLink = this.multilineLink;
        DisclosureAtom disclosureAtom = this.disclosure;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder d11 = C3660k.d("HeaderDTO(title=", str, ", subtitle=", str2, ", action=");
        b.f(d11, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
        d11.append(testInfo);
        d11.append(", multilineLink=");
        d11.append(multilineLink);
        d11.append(", disclosure=");
        d11.append(disclosureAtom);
        d11.append(", badge=");
        d11.append(badgeDTO);
        d11.append(")");
        return d11.toString();
    }
}
