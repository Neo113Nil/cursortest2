package ru.ozon.app.android.fresh.main.ui.molecules.header;

import Kk.C3532b;
import Ul.C4070a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0012R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "disclosure", "", "isTopCornersRounded", "", "backgroundColor", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;ZLjava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "getDisclosure", "()Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HeaderV2VO {
    private final AtomAction action;
    private final String backgroundColor;
    private final DisclosureAtom disclosure;
    private final boolean isTopCornersRounded;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HeaderV2VO(@NotNull TextAtom title, AtomAction atomAction, DisclosureAtom disclosureAtom, boolean z11, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.action = atomAction;
        this.disclosure = disclosureAtom;
        this.isTopCornersRounded = z11;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderV2VO)) {
            return false;
        }
        HeaderV2VO headerV2VO = (HeaderV2VO) other;
        return Intrinsics.d(this.title, headerV2VO.title) && Intrinsics.d(this.action, headerV2VO.action) && Intrinsics.d(this.disclosure, headerV2VO.disclosure) && this.isTopCornersRounded == headerV2VO.isTopCornersRounded && Intrinsics.d(this.backgroundColor, headerV2VO.backgroundColor) && Intrinsics.d(this.trackingInfo, headerV2VO.trackingInfo);
    }

    public final AtomAction getAction() {
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
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        DisclosureAtom disclosureAtom = this.disclosure;
        int a11 = C3532b.a((hashCode2 + (disclosureAtom == null ? 0 : disclosureAtom.hashCode())) * 31, 31, this.isTopCornersRounded);
        String str = this.backgroundColor;
        int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isTopCornersRounded, reason: from getter */
    public final boolean getIsTopCornersRounded() {
        return this.isTopCornersRounded;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        AtomAction atomAction = this.action;
        DisclosureAtom disclosureAtom = this.disclosure;
        boolean z11 = this.isTopCornersRounded;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HeaderV2VO(title=");
        sb2.append(textAtom);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", disclosure=");
        sb2.append(disclosureAtom);
        sb2.append(", isTopCornersRounded=");
        sb2.append(z11);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
