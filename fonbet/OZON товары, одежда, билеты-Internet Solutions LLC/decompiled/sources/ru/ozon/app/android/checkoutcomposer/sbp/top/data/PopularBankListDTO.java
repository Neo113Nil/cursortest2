package ru.ozon.app.android.checkoutcomposer.sbp.top.data;

import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.android.flashbar.model.Restriction;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/top/data/PopularBankListDTO;", "", "elements", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/android/flashbar/model/Restriction;Ljava/lang/String;Ljava/util/Map;)V", "getElements", "()Ljava/util/List;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PopularBankListDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle> elements;
    private final Restriction restriction;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PopularBankListDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleDefault", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle32Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle40Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle48Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends CellAtom.CellAtomWithSubtitle> elements, Restriction restriction, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.elements = elements;
        this.restriction = restriction;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopularBankListDTO copy$default(PopularBankListDTO popularBankListDTO, List list, Restriction restriction, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = popularBankListDTO.elements;
        }
        if ((i11 & 2) != 0) {
            restriction = popularBankListDTO.restriction;
        }
        if ((i11 & 4) != 0) {
            str = popularBankListDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            map = popularBankListDTO.trackingInfo;
        }
        return popularBankListDTO.copy(list, restriction, str, map);
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle> component1() {
        return this.elements;
    }

    /* renamed from: component2, reason: from getter */
    public final Restriction getRestriction() {
        return this.restriction;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final PopularBankListDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleDefault", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle32Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle40Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle48Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends CellAtom.CellAtomWithSubtitle> elements, Restriction restriction, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new PopularBankListDTO(elements, restriction, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopularBankListDTO)) {
            return false;
        }
        PopularBankListDTO popularBankListDTO = (PopularBankListDTO) other;
        return Intrinsics.d(this.elements, popularBankListDTO.elements) && Intrinsics.d(this.restriction, popularBankListDTO.restriction) && Intrinsics.d(this.backgroundColor, popularBankListDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, popularBankListDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle> getElements() {
        return this.elements;
    }

    public final Restriction getRestriction() {
        return this.restriction;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.elements.hashCode() * 31;
        Restriction restriction = this.restriction;
        int hashCode2 = (hashCode + (restriction == null ? 0 : restriction.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CellAtom.CellAtomWithSubtitle> list = this.elements;
        Restriction restriction = this.restriction;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PopularBankListDTO(elements=");
        sb2.append(list);
        sb2.append(", restriction=");
        sb2.append(restriction);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
