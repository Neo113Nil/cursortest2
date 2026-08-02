package ru.ozon.app.android.fresh.main.ui.molecules.header;

import Kk.C3532b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JM\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "disclosure", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "isTopCornersRounded", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;ZLjava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDisclosure", "()Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "backgroundColor", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HeaderV2DTO {
    private final AtomActionDTO action;
    private String backgroundColor;
    private final DisclosureAtom disclosure;
    private final boolean isTopCornersRounded;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HeaderV2DTO(@NotNull TextAtom title, AtomActionDTO atomActionDTO, DisclosureAtom disclosureAtom, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.action = atomActionDTO;
        this.disclosure = disclosureAtom;
        this.isTopCornersRounded = z11;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HeaderV2DTO copy$default(HeaderV2DTO headerV2DTO, TextAtom textAtom, AtomActionDTO atomActionDTO, DisclosureAtom disclosureAtom, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = headerV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = headerV2DTO.action;
        }
        if ((i11 & 4) != 0) {
            disclosureAtom = headerV2DTO.disclosure;
        }
        if ((i11 & 8) != 0) {
            z11 = headerV2DTO.isTopCornersRounded;
        }
        if ((i11 & 16) != 0) {
            map = headerV2DTO.trackingInfo;
        }
        Map map2 = map;
        DisclosureAtom disclosureAtom2 = disclosureAtom;
        return headerV2DTO.copy(textAtom, atomActionDTO, disclosureAtom2, z11, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclosureAtom getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsTopCornersRounded() {
        return this.isTopCornersRounded;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final HeaderV2DTO copy(@NotNull TextAtom title, AtomActionDTO action, DisclosureAtom disclosure, boolean isTopCornersRounded, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderV2DTO(title, action, disclosure, isTopCornersRounded, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderV2DTO)) {
            return false;
        }
        HeaderV2DTO headerV2DTO = (HeaderV2DTO) other;
        return Intrinsics.d(this.title, headerV2DTO.title) && Intrinsics.d(this.action, headerV2DTO.action) && Intrinsics.d(this.disclosure, headerV2DTO.disclosure) && this.isTopCornersRounded == headerV2DTO.isTopCornersRounded && Intrinsics.d(this.trackingInfo, headerV2DTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final DisclosureAtom getDisclosure() {
        return this.disclosure;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        DisclosureAtom disclosureAtom = this.disclosure;
        int a11 = C3532b.a((hashCode2 + (disclosureAtom == null ? 0 : disclosureAtom.hashCode())) * 31, 31, this.isTopCornersRounded);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isTopCornersRounded() {
        return this.isTopCornersRounded;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        AtomActionDTO atomActionDTO = this.action;
        DisclosureAtom disclosureAtom = this.disclosure;
        boolean z11 = this.isTopCornersRounded;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HeaderV2DTO(title=");
        sb2.append(textAtom);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", disclosure=");
        sb2.append(disclosureAtom);
        sb2.append(", isTopCornersRounded=");
        sb2.append(z11);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ HeaderV2DTO(TextAtom textAtom, AtomActionDTO atomActionDTO, DisclosureAtom disclosureAtom, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, atomActionDTO, disclosureAtom, z11, (i11 & 16) != 0 ? null : map);
    }
}
