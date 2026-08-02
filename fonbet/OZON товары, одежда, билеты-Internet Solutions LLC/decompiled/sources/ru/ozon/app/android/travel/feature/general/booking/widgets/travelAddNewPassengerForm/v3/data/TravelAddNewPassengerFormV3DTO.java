package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data;

import D40.d;
import De.C2859b;
import G.g;
import Ns.b;
import Tl.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001*BW\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0003Je\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO;", "", "inputs", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;", "saveButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "agreementText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "useBankDetails", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "actionNamesToSkip", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;Ljava/util/List;)V", "getInputs", "()Ljava/util/List;", "getSaveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAgreementText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getUseBankDetails", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getActionNamesToSkip", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "InputItemDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelAddNewPassengerFormV3DTO {
    private final List<String> actionNamesToSkip;
    private final TextDTO agreementText;

    @NotNull
    private final List<InputItemDTO> inputs;

    @NotNull
    private final ButtonV3DTO saveButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final CellDTO useBankDetails;

    public TravelAddNewPassengerFormV3DTO(@NotNull List<InputItemDTO> inputs, @NotNull ButtonV3DTO saveButton, TextDTO textDTO, CellDTO cellDTO, Map<String, TokenizedTrackingInfo> map, List<String> list) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.inputs = inputs;
        this.saveButton = saveButton;
        this.agreementText = textDTO;
        this.useBankDetails = cellDTO;
        this.trackingInfo = map;
        this.actionNamesToSkip = list;
    }

    public static /* synthetic */ TravelAddNewPassengerFormV3DTO copy$default(TravelAddNewPassengerFormV3DTO travelAddNewPassengerFormV3DTO, List list, ButtonV3DTO buttonV3DTO, TextDTO textDTO, CellDTO cellDTO, Map map, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelAddNewPassengerFormV3DTO.inputs;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = travelAddNewPassengerFormV3DTO.saveButton;
        }
        if ((i11 & 4) != 0) {
            textDTO = travelAddNewPassengerFormV3DTO.agreementText;
        }
        if ((i11 & 8) != 0) {
            cellDTO = travelAddNewPassengerFormV3DTO.useBankDetails;
        }
        if ((i11 & 16) != 0) {
            map = travelAddNewPassengerFormV3DTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            list2 = travelAddNewPassengerFormV3DTO.actionNamesToSkip;
        }
        Map map2 = map;
        List list3 = list2;
        return travelAddNewPassengerFormV3DTO.copy(list, buttonV3DTO, textDTO, cellDTO, map2, list3);
    }

    @NotNull
    public final List<InputItemDTO> component1() {
        return this.inputs;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getAgreementText() {
        return this.agreementText;
    }

    /* renamed from: component4, reason: from getter */
    public final CellDTO getUseBankDetails() {
        return this.useBankDetails;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    public final List<String> component6() {
        return this.actionNamesToSkip;
    }

    @NotNull
    public final TravelAddNewPassengerFormV3DTO copy(@NotNull List<InputItemDTO> inputs, @NotNull ButtonV3DTO saveButton, TextDTO agreementText, CellDTO useBankDetails, Map<String, TokenizedTrackingInfo> trackingInfo, List<String> actionNamesToSkip) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new TravelAddNewPassengerFormV3DTO(inputs, saveButton, agreementText, useBankDetails, trackingInfo, actionNamesToSkip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelAddNewPassengerFormV3DTO)) {
            return false;
        }
        TravelAddNewPassengerFormV3DTO travelAddNewPassengerFormV3DTO = (TravelAddNewPassengerFormV3DTO) other;
        return Intrinsics.d(this.inputs, travelAddNewPassengerFormV3DTO.inputs) && Intrinsics.d(this.saveButton, travelAddNewPassengerFormV3DTO.saveButton) && Intrinsics.d(this.agreementText, travelAddNewPassengerFormV3DTO.agreementText) && Intrinsics.d(this.useBankDetails, travelAddNewPassengerFormV3DTO.useBankDetails) && Intrinsics.d(this.trackingInfo, travelAddNewPassengerFormV3DTO.trackingInfo) && Intrinsics.d(this.actionNamesToSkip, travelAddNewPassengerFormV3DTO.actionNamesToSkip);
    }

    public final List<String> getActionNamesToSkip() {
        return this.actionNamesToSkip;
    }

    public final TextDTO getAgreementText() {
        return this.agreementText;
    }

    @NotNull
    public final List<InputItemDTO> getInputs() {
        return this.inputs;
    }

    @NotNull
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final CellDTO getUseBankDetails() {
        return this.useBankDetails;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.saveButton, this.inputs.hashCode() * 31, 31);
        TextDTO textDTO = this.agreementText;
        int hashCode = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CellDTO cellDTO = this.useBankDetails;
        int hashCode2 = (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.actionNamesToSkip;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelAddNewPassengerFormV3DTO(inputs=" + this.inputs + ", saveButton=" + this.saveButton + ", agreementText=" + this.agreementText + ", useBankDetails=" + this.useBankDetails + ", trackingInfo=" + this.trackingInfo + ", actionNamesToSkip=" + this.actionNamesToSkip + ")";
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;", "", "id", "", "input", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "infoText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "hintBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO$DisclaimerDTO;", "<init>", "(ILru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO$DisclaimerDTO;)V", "getId", "()I", "getInput", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "getInfoText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHintBadges", "()Ljava/util/List;", "getDisclaimer", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO$DisclaimerDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "DisclaimerDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class InputItemDTO {
        private final DisclaimerDTO disclaimer;

        @NotNull
        private final List<BadgeDTO> hintBadges;
        private final int id;
        private final TextDTO infoText;

        @NotNull
        private final CommonInputV2DTO input;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Js\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO$DisclaimerDTO;", "", "backgroundColor", "", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "yesButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "noButton", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getYesButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNoButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DisclaimerDTO {
            private final String backgroundColor;
            private final IconButtonV3DTO closeButton;
            private final CommonAtomIconDTO icon;
            private final ButtonV3DTO noButton;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;
            private final ButtonV3DTO yesButton;

            public DisclaimerDTO(String str, CommonAtomIconDTO commonAtomIconDTO, @NotNull TextDTO title, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.backgroundColor = str;
                this.icon = commonAtomIconDTO;
                this.title = title;
                this.subtitle = textDTO;
                this.closeButton = iconButtonV3DTO;
                this.yesButton = buttonV3DTO;
                this.noButton = buttonV3DTO2;
                this.trackingInfo = map;
            }

            public static /* synthetic */ DisclaimerDTO copy$default(DisclaimerDTO disclaimerDTO, String str, CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = disclaimerDTO.backgroundColor;
                }
                if ((i11 & 2) != 0) {
                    commonAtomIconDTO = disclaimerDTO.icon;
                }
                if ((i11 & 4) != 0) {
                    textDTO = disclaimerDTO.title;
                }
                if ((i11 & 8) != 0) {
                    textDTO2 = disclaimerDTO.subtitle;
                }
                if ((i11 & 16) != 0) {
                    iconButtonV3DTO = disclaimerDTO.closeButton;
                }
                if ((i11 & 32) != 0) {
                    buttonV3DTO = disclaimerDTO.yesButton;
                }
                if ((i11 & 64) != 0) {
                    buttonV3DTO2 = disclaimerDTO.noButton;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    map = disclaimerDTO.trackingInfo;
                }
                ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
                Map map2 = map;
                IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
                ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
                return disclaimerDTO.copy(str, commonAtomIconDTO, textDTO, textDTO2, iconButtonV3DTO2, buttonV3DTO4, buttonV3DTO3, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component4, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component5, reason: from getter */
            public final IconButtonV3DTO getCloseButton() {
                return this.closeButton;
            }

            /* renamed from: component6, reason: from getter */
            public final ButtonV3DTO getYesButton() {
                return this.yesButton;
            }

            /* renamed from: component7, reason: from getter */
            public final ButtonV3DTO getNoButton() {
                return this.noButton;
            }

            public final Map<String, TokenizedTrackingInfo> component8() {
                return this.trackingInfo;
            }

            @NotNull
            public final DisclaimerDTO copy(String backgroundColor, CommonAtomIconDTO icon, @NotNull TextDTO title, TextDTO subtitle, IconButtonV3DTO closeButton, ButtonV3DTO yesButton, ButtonV3DTO noButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new DisclaimerDTO(backgroundColor, icon, title, subtitle, closeButton, yesButton, noButton, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisclaimerDTO)) {
                    return false;
                }
                DisclaimerDTO disclaimerDTO = (DisclaimerDTO) other;
                return Intrinsics.d(this.backgroundColor, disclaimerDTO.backgroundColor) && Intrinsics.d(this.icon, disclaimerDTO.icon) && Intrinsics.d(this.title, disclaimerDTO.title) && Intrinsics.d(this.subtitle, disclaimerDTO.subtitle) && Intrinsics.d(this.closeButton, disclaimerDTO.closeButton) && Intrinsics.d(this.yesButton, disclaimerDTO.yesButton) && Intrinsics.d(this.noButton, disclaimerDTO.noButton) && Intrinsics.d(this.trackingInfo, disclaimerDTO.trackingInfo);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final IconButtonV3DTO getCloseButton() {
                return this.closeButton;
            }

            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            public final ButtonV3DTO getNoButton() {
                return this.noButton;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public final ButtonV3DTO getYesButton() {
                return this.yesButton;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                int a11 = b.a(this.title, (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                IconButtonV3DTO iconButtonV3DTO = this.closeButton;
                int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
                ButtonV3DTO buttonV3DTO = this.yesButton;
                int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
                ButtonV3DTO buttonV3DTO2 = this.noButton;
                int hashCode5 = (hashCode4 + (buttonV3DTO2 == null ? 0 : buttonV3DTO2.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode5 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                IconButtonV3DTO iconButtonV3DTO = this.closeButton;
                ButtonV3DTO buttonV3DTO = this.yesButton;
                ButtonV3DTO buttonV3DTO2 = this.noButton;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("DisclaimerDTO(backgroundColor=");
                sb2.append(str);
                sb2.append(", icon=");
                sb2.append(commonAtomIconDTO);
                sb2.append(", title=");
                d.e(", subtitle=", ", closeButton=", sb2, textDTO, textDTO2);
                sb2.append(iconButtonV3DTO);
                sb2.append(", yesButton=");
                sb2.append(buttonV3DTO);
                sb2.append(", noButton=");
                sb2.append(buttonV3DTO2);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public InputItemDTO(int i11, @NotNull CommonInputV2DTO input, TextDTO textDTO, @NotNull List<BadgeDTO> hintBadges, DisclaimerDTO disclaimerDTO) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(hintBadges, "hintBadges");
            this.id = i11;
            this.input = input;
            this.infoText = textDTO;
            this.hintBadges = hintBadges;
            this.disclaimer = disclaimerDTO;
        }

        public static /* synthetic */ InputItemDTO copy$default(InputItemDTO inputItemDTO, int i11, CommonInputV2DTO commonInputV2DTO, TextDTO textDTO, List list, DisclaimerDTO disclaimerDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = inputItemDTO.id;
            }
            if ((i12 & 2) != 0) {
                commonInputV2DTO = inputItemDTO.input;
            }
            if ((i12 & 4) != 0) {
                textDTO = inputItemDTO.infoText;
            }
            if ((i12 & 8) != 0) {
                list = inputItemDTO.hintBadges;
            }
            if ((i12 & 16) != 0) {
                disclaimerDTO = inputItemDTO.disclaimer;
            }
            DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
            TextDTO textDTO2 = textDTO;
            return inputItemDTO.copy(i11, commonInputV2DTO, textDTO2, list, disclaimerDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonInputV2DTO getInput() {
            return this.input;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getInfoText() {
            return this.infoText;
        }

        @NotNull
        public final List<BadgeDTO> component4() {
            return this.hintBadges;
        }

        /* renamed from: component5, reason: from getter */
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final InputItemDTO copy(int id2, @NotNull CommonInputV2DTO input, TextDTO infoText, @NotNull List<BadgeDTO> hintBadges, DisclaimerDTO disclaimer) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(hintBadges, "hintBadges");
            return new InputItemDTO(id2, input, infoText, hintBadges, disclaimer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputItemDTO)) {
                return false;
            }
            InputItemDTO inputItemDTO = (InputItemDTO) other;
            return this.id == inputItemDTO.id && Intrinsics.d(this.input, inputItemDTO.input) && Intrinsics.d(this.infoText, inputItemDTO.infoText) && Intrinsics.d(this.hintBadges, inputItemDTO.hintBadges) && Intrinsics.d(this.disclaimer, inputItemDTO.disclaimer);
        }

        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final List<BadgeDTO> getHintBadges() {
            return this.hintBadges;
        }

        public final int getId() {
            return this.id;
        }

        public final TextDTO getInfoText() {
            return this.infoText;
        }

        @NotNull
        public final CommonInputV2DTO getInput() {
            return this.input;
        }

        public int hashCode() {
            int hashCode = (this.input.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
            TextDTO textDTO = this.infoText;
            int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.hintBadges);
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            return b11 + (disclaimerDTO != null ? disclaimerDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            CommonInputV2DTO commonInputV2DTO = this.input;
            TextDTO textDTO = this.infoText;
            List<BadgeDTO> list = this.hintBadges;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            StringBuilder sb2 = new StringBuilder("InputItemDTO(id=");
            sb2.append(i11);
            sb2.append(", input=");
            sb2.append(commonInputV2DTO);
            sb2.append(", infoText=");
            a.e(sb2, textDTO, ", hintBadges=", list, ", disclaimer=");
            sb2.append(disclaimerDTO);
            sb2.append(")");
            return sb2.toString();
        }

        public InputItemDTO(int i11, CommonInputV2DTO commonInputV2DTO, TextDTO textDTO, List list, DisclaimerDTO disclaimerDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, commonInputV2DTO, textDTO, (i12 & 8) != 0 ? K.f71697a : list, disclaimerDTO);
        }
    }
}
