package ru.ozon.app.android.fresh.main.widgets.product.common.header.model;

import N3.C3660k;
import Sh.b;
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

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "multilineLink", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/MultilineLinkDTO;", "disclosure", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/MultilineLinkDTO;Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getMultilineLink", "()Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/MultilineLinkDTO;", "getDisclosure", "()Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HeaderDTO {
    private final AtomActionDTO action;
    private final DisclosureAtom disclosure;
    private final MultilineLinkDTO multilineLink;
    private final String subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HeaderDTO(@NotNull String title, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, MultilineLinkDTO multilineLinkDTO, DisclosureAtom disclosureAtom) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.multilineLink = multilineLinkDTO;
        this.disclosure = disclosureAtom;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, MultilineLinkDTO multilineLinkDTO, DisclosureAtom disclosureAtom, int i11, Object obj) {
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
            multilineLinkDTO = headerDTO.multilineLink;
        }
        if ((i11 & 64) != 0) {
            disclosureAtom = headerDTO.disclosure;
        }
        MultilineLinkDTO multilineLinkDTO2 = multilineLinkDTO;
        DisclosureAtom disclosureAtom2 = disclosureAtom;
        TestInfo testInfo2 = testInfo;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return headerDTO.copy(str, str2, atomActionDTO2, map, testInfo2, multilineLinkDTO2, disclosureAtom2);
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
    public final MultilineLinkDTO getMultilineLink() {
        return this.multilineLink;
    }

    /* renamed from: component7, reason: from getter */
    public final DisclosureAtom getDisclosure() {
        return this.disclosure;
    }

    @NotNull
    public final HeaderDTO copy(@NotNull String title, String subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, MultilineLinkDTO multilineLink, DisclosureAtom disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderDTO(title, subtitle, action, trackingInfo, testInfo, multilineLink, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && Intrinsics.d(this.action, headerDTO.action) && Intrinsics.d(this.trackingInfo, headerDTO.trackingInfo) && Intrinsics.d(this.testInfo, headerDTO.testInfo) && Intrinsics.d(this.multilineLink, headerDTO.multilineLink) && Intrinsics.d(this.disclosure, headerDTO.disclosure);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final DisclosureAtom getDisclosure() {
        return this.disclosure;
    }

    public final MultilineLinkDTO getMultilineLink() {
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
        MultilineLinkDTO multilineLinkDTO = this.multilineLink;
        int hashCode6 = (hashCode5 + (multilineLinkDTO == null ? 0 : multilineLinkDTO.hashCode())) * 31;
        DisclosureAtom disclosureAtom = this.disclosure;
        return hashCode6 + (disclosureAtom != null ? disclosureAtom.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        MultilineLinkDTO multilineLinkDTO = this.multilineLink;
        DisclosureAtom disclosureAtom = this.disclosure;
        StringBuilder d11 = C3660k.d("HeaderDTO(title=", str, ", subtitle=", str2, ", action=");
        b.f(d11, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
        d11.append(testInfo);
        d11.append(", multilineLink=");
        d11.append(multilineLinkDTO);
        d11.append(", disclosure=");
        d11.append(disclosureAtom);
        d11.append(")");
        return d11.toString();
    }
}
