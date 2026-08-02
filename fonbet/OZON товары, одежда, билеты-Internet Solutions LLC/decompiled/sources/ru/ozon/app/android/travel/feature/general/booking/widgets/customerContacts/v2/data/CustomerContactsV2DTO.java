package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.data;

import G.g;
import HY.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "inputs", "", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "cellInfo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getInputs", "()Ljava/util/List;", "getCellInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomerContactsV2DTO {
    private final CellDTO cellInfo;

    @NotNull
    private final List<CommonInputDTO> inputs;
    private final TextAtom subtitle;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CustomerContactsV2DTO(TextAtom textAtom, TextAtom textAtom2, @NotNull List<CommonInputDTO> inputs, CellDTO cellDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.inputs = inputs;
        this.cellInfo = cellDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CustomerContactsV2DTO copy$default(CustomerContactsV2DTO customerContactsV2DTO, TextAtom textAtom, TextAtom textAtom2, List list, CellDTO cellDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = customerContactsV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = customerContactsV2DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = customerContactsV2DTO.inputs;
        }
        if ((i11 & 8) != 0) {
            cellDTO = customerContactsV2DTO.cellInfo;
        }
        if ((i11 & 16) != 0) {
            map = customerContactsV2DTO.trackingInfo;
        }
        Map map2 = map;
        List list2 = list;
        return customerContactsV2DTO.copy(textAtom, textAtom2, list2, cellDTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<CommonInputDTO> component3() {
        return this.inputs;
    }

    /* renamed from: component4, reason: from getter */
    public final CellDTO getCellInfo() {
        return this.cellInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final CustomerContactsV2DTO copy(TextAtom title, TextAtom subtitle, @NotNull List<CommonInputDTO> inputs, CellDTO cellInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        return new CustomerContactsV2DTO(title, subtitle, inputs, cellInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerContactsV2DTO)) {
            return false;
        }
        CustomerContactsV2DTO customerContactsV2DTO = (CustomerContactsV2DTO) other;
        return Intrinsics.d(this.title, customerContactsV2DTO.title) && Intrinsics.d(this.subtitle, customerContactsV2DTO.subtitle) && Intrinsics.d(this.inputs, customerContactsV2DTO.inputs) && Intrinsics.d(this.cellInfo, customerContactsV2DTO.cellInfo) && Intrinsics.d(this.trackingInfo, customerContactsV2DTO.trackingInfo);
    }

    public final CellDTO getCellInfo() {
        return this.cellInfo;
    }

    @NotNull
    public final List<CommonInputDTO> getInputs() {
        return this.inputs;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TextAtom textAtom2 = this.subtitle;
        int b11 = g.b((hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31, 31, this.inputs);
        CellDTO cellDTO = this.cellInfo;
        int hashCode2 = (b11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<CommonInputDTO> list = this.inputs;
        CellDTO cellDTO = this.cellInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("CustomerContactsV2DTO(title=", textAtom, ", subtitle=", textAtom2, ", inputs=");
        a11.append(list);
        a11.append(", cellInfo=");
        a11.append(cellDTO);
        a11.append(", trackingInfo=");
        return P.f(a11, map, ")");
    }
}
