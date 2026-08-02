package ru.ozon.app.android.orders.cml.deliveryOrderList.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.deliveryInfo.data.DeliveryInfoDTO;
import ru.ozon.app.android.orders.cml.groupButtons.data.GroupButtonsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Je\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTO;", "", "status", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "cities", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/CitiesDTO;", "input", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;", "cellList", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "buttons", "Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/orders/cml/deliveryOrderList/data/CitiesDTO;Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getStatus", "()Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCities", "()Lru/ozon/app/android/orders/cml/deliveryOrderList/data/CitiesDTO;", "getInput", "()Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;", "getCellList", "()Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "getButtons", "()Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryOrderDTO {
    public static final int $stable = 8;
    private final GroupButtonsDTO buttons;

    @NotNull
    private final DeliveryInfoDTO cellList;
    private final CitiesDTO cities;
    private final CommonControlSettings common;
    private final InputDTO input;

    @NotNull
    private final StatusDTO status;
    private final TextDTO subtitle;
    private final TextDTO title;

    public DeliveryOrderDTO(@NotNull StatusDTO status, TextDTO textDTO, TextDTO textDTO2, CitiesDTO citiesDTO, InputDTO inputDTO, @NotNull DeliveryInfoDTO cellList, GroupButtonsDTO groupButtonsDTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.status = status;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.cities = citiesDTO;
        this.input = inputDTO;
        this.cellList = cellList;
        this.buttons = groupButtonsDTO;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ DeliveryOrderDTO copy$default(DeliveryOrderDTO deliveryOrderDTO, StatusDTO statusDTO, TextDTO textDTO, TextDTO textDTO2, CitiesDTO citiesDTO, InputDTO inputDTO, DeliveryInfoDTO deliveryInfoDTO, GroupButtonsDTO groupButtonsDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            statusDTO = deliveryOrderDTO.status;
        }
        if ((i11 & 2) != 0) {
            textDTO = deliveryOrderDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = deliveryOrderDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            citiesDTO = deliveryOrderDTO.cities;
        }
        if ((i11 & 16) != 0) {
            inputDTO = deliveryOrderDTO.input;
        }
        if ((i11 & 32) != 0) {
            deliveryInfoDTO = deliveryOrderDTO.cellList;
        }
        if ((i11 & 64) != 0) {
            groupButtonsDTO = deliveryOrderDTO.buttons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = deliveryOrderDTO.common;
        }
        GroupButtonsDTO groupButtonsDTO2 = groupButtonsDTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        InputDTO inputDTO2 = inputDTO;
        DeliveryInfoDTO deliveryInfoDTO2 = deliveryInfoDTO;
        return deliveryOrderDTO.copy(statusDTO, textDTO, textDTO2, citiesDTO, inputDTO2, deliveryInfoDTO2, groupButtonsDTO2, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StatusDTO getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final CitiesDTO getCities() {
        return this.cities;
    }

    /* renamed from: component5, reason: from getter */
    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final DeliveryInfoDTO getCellList() {
        return this.cellList;
    }

    /* renamed from: component7, reason: from getter */
    public final GroupButtonsDTO getButtons() {
        return this.buttons;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final DeliveryOrderDTO copy(@NotNull StatusDTO status, TextDTO title, TextDTO subtitle, CitiesDTO cities, InputDTO input, @NotNull DeliveryInfoDTO cellList, GroupButtonsDTO buttons, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        return new DeliveryOrderDTO(status, title, subtitle, cities, input, cellList, buttons, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderDTO)) {
            return false;
        }
        DeliveryOrderDTO deliveryOrderDTO = (DeliveryOrderDTO) other;
        return Intrinsics.d(this.status, deliveryOrderDTO.status) && Intrinsics.d(this.title, deliveryOrderDTO.title) && Intrinsics.d(this.subtitle, deliveryOrderDTO.subtitle) && Intrinsics.d(this.cities, deliveryOrderDTO.cities) && Intrinsics.d(this.input, deliveryOrderDTO.input) && Intrinsics.d(this.cellList, deliveryOrderDTO.cellList) && Intrinsics.d(this.buttons, deliveryOrderDTO.buttons) && Intrinsics.d(this.common, deliveryOrderDTO.common);
    }

    public final GroupButtonsDTO getButtons() {
        return this.buttons;
    }

    @NotNull
    public final DeliveryInfoDTO getCellList() {
        return this.cellList;
    }

    public final CitiesDTO getCities() {
        return this.cities;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    public final StatusDTO getStatus() {
        return this.status;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        CitiesDTO citiesDTO = this.cities;
        int hashCode4 = (hashCode3 + (citiesDTO == null ? 0 : citiesDTO.hashCode())) * 31;
        InputDTO inputDTO = this.input;
        int hashCode5 = (this.cellList.hashCode() + ((hashCode4 + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31)) * 31;
        GroupButtonsDTO groupButtonsDTO = this.buttons;
        int hashCode6 = (hashCode5 + (groupButtonsDTO == null ? 0 : groupButtonsDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode6 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryOrderDTO(status=" + this.status + ", title=" + this.title + ", subtitle=" + this.subtitle + ", cities=" + this.cities + ", input=" + this.input + ", cellList=" + this.cellList + ", buttons=" + this.buttons + ", common=" + this.common + ")";
    }
}
