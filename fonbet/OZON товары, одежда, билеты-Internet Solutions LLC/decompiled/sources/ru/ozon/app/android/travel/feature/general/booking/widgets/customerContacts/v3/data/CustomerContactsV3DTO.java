package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.data;

import T7.P;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003Jg\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "phoneNumber", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", Scopes.EMAIL, "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellInfo", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPhoneNumber", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "getEmail", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCellInfo", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomerContactsV3DTO {
    private final ButtonV3DTO button;
    private final CellDTO cell;
    private final CellDTO cellInfo;
    private final CommonInputV2DTO email;
    private final CommonInputV2DTO phoneNumber;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CustomerContactsV3DTO(@NotNull TextDTO title, CommonInputV2DTO commonInputV2DTO, CommonInputV2DTO commonInputV2DTO2, CellDTO cellDTO, CellDTO cellDTO2, ButtonV3DTO buttonV3DTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.phoneNumber = commonInputV2DTO;
        this.email = commonInputV2DTO2;
        this.cell = cellDTO;
        this.cellInfo = cellDTO2;
        this.button = buttonV3DTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CustomerContactsV3DTO copy$default(CustomerContactsV3DTO customerContactsV3DTO, TextDTO textDTO, CommonInputV2DTO commonInputV2DTO, CommonInputV2DTO commonInputV2DTO2, CellDTO cellDTO, CellDTO cellDTO2, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = customerContactsV3DTO.title;
        }
        if ((i11 & 2) != 0) {
            commonInputV2DTO = customerContactsV3DTO.phoneNumber;
        }
        if ((i11 & 4) != 0) {
            commonInputV2DTO2 = customerContactsV3DTO.email;
        }
        if ((i11 & 8) != 0) {
            cellDTO = customerContactsV3DTO.cell;
        }
        if ((i11 & 16) != 0) {
            cellDTO2 = customerContactsV3DTO.cellInfo;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = customerContactsV3DTO.button;
        }
        if ((i11 & 64) != 0) {
            map = customerContactsV3DTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        Map map2 = map;
        CellDTO cellDTO3 = cellDTO2;
        CommonInputV2DTO commonInputV2DTO3 = commonInputV2DTO2;
        return customerContactsV3DTO.copy(textDTO, commonInputV2DTO, commonInputV2DTO3, cellDTO, cellDTO3, buttonV3DTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonInputV2DTO getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonInputV2DTO getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component5, reason: from getter */
    public final CellDTO getCellInfo() {
        return this.cellInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final CustomerContactsV3DTO copy(@NotNull TextDTO title, CommonInputV2DTO phoneNumber, CommonInputV2DTO email, CellDTO cell, CellDTO cellInfo, ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new CustomerContactsV3DTO(title, phoneNumber, email, cell, cellInfo, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerContactsV3DTO)) {
            return false;
        }
        CustomerContactsV3DTO customerContactsV3DTO = (CustomerContactsV3DTO) other;
        return Intrinsics.d(this.title, customerContactsV3DTO.title) && Intrinsics.d(this.phoneNumber, customerContactsV3DTO.phoneNumber) && Intrinsics.d(this.email, customerContactsV3DTO.email) && Intrinsics.d(this.cell, customerContactsV3DTO.cell) && Intrinsics.d(this.cellInfo, customerContactsV3DTO.cellInfo) && Intrinsics.d(this.button, customerContactsV3DTO.button) && Intrinsics.d(this.trackingInfo, customerContactsV3DTO.trackingInfo);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    public final CellDTO getCellInfo() {
        return this.cellInfo;
    }

    public final CommonInputV2DTO getEmail() {
        return this.email;
    }

    public final CommonInputV2DTO getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        CommonInputV2DTO commonInputV2DTO = this.phoneNumber;
        int hashCode2 = (hashCode + (commonInputV2DTO == null ? 0 : commonInputV2DTO.hashCode())) * 31;
        CommonInputV2DTO commonInputV2DTO2 = this.email;
        int hashCode3 = (hashCode2 + (commonInputV2DTO2 == null ? 0 : commonInputV2DTO2.hashCode())) * 31;
        CellDTO cellDTO = this.cell;
        int hashCode4 = (hashCode3 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        CellDTO cellDTO2 = this.cellInfo;
        int hashCode5 = (hashCode4 + (cellDTO2 == null ? 0 : cellDTO2.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode6 = (hashCode5 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        CommonInputV2DTO commonInputV2DTO = this.phoneNumber;
        CommonInputV2DTO commonInputV2DTO2 = this.email;
        CellDTO cellDTO = this.cell;
        CellDTO cellDTO2 = this.cellInfo;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CustomerContactsV3DTO(title=");
        sb2.append(textDTO);
        sb2.append(", phoneNumber=");
        sb2.append(commonInputV2DTO);
        sb2.append(", email=");
        sb2.append(commonInputV2DTO2);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", cellInfo=");
        sb2.append(cellDTO2);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
