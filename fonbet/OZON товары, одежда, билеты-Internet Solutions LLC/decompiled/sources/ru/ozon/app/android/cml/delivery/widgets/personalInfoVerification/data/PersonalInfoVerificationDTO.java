package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data;

import Bi.b;
import G.g;
import K1.G;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.button.data.CmlButtonDTO;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u008b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006;"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "", "formBackgroundColor", "", "surnameInput", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "nameInput", "patronymicInput", "patronymicSettingsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "birthDateInput", "passportInput", "confirmButton", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Ljava/util/List;", "getFormBackgroundColor", "()Ljava/lang/String;", "getSurnameInput", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "getNameInput", "getPatronymicInput", "getPatronymicSettingsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBirthDateInput", "getPassportInput", "getConfirmButton", "()Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfoVerificationDTO {

    @NotNull
    private final InputMoleculeDTO birthDateInput;

    @NotNull
    private final CmlButtonDTO confirmButton;

    @NotNull
    private final String formBackgroundColor;

    @NotNull
    private final InputMoleculeDTO nameInput;

    @NotNull
    private final InputMoleculeDTO passportInput;

    @NotNull
    private final InputMoleculeDTO patronymicInput;

    @NotNull
    private final CellDTO patronymicSettingsCell;

    @NotNull
    private final List<TextDTO> subtitle;

    @NotNull
    private final InputMoleculeDTO surnameInput;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PersonalInfoVerificationDTO(@NotNull TextDTO title, @NotNull List<TextDTO> subtitle, @NotNull String formBackgroundColor, @NotNull InputMoleculeDTO surnameInput, @NotNull InputMoleculeDTO nameInput, @NotNull InputMoleculeDTO patronymicInput, @NotNull CellDTO patronymicSettingsCell, @NotNull InputMoleculeDTO birthDateInput, @NotNull InputMoleculeDTO passportInput, @NotNull CmlButtonDTO confirmButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(formBackgroundColor, "formBackgroundColor");
        Intrinsics.checkNotNullParameter(surnameInput, "surnameInput");
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        Intrinsics.checkNotNullParameter(patronymicInput, "patronymicInput");
        Intrinsics.checkNotNullParameter(patronymicSettingsCell, "patronymicSettingsCell");
        Intrinsics.checkNotNullParameter(birthDateInput, "birthDateInput");
        Intrinsics.checkNotNullParameter(passportInput, "passportInput");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        this.title = title;
        this.subtitle = subtitle;
        this.formBackgroundColor = formBackgroundColor;
        this.surnameInput = surnameInput;
        this.nameInput = nameInput;
        this.patronymicInput = patronymicInput;
        this.patronymicSettingsCell = patronymicSettingsCell;
        this.birthDateInput = birthDateInput;
        this.passportInput = passportInput;
        this.confirmButton = confirmButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PersonalInfoVerificationDTO copy$default(PersonalInfoVerificationDTO personalInfoVerificationDTO, TextDTO textDTO, List list, String str, InputMoleculeDTO inputMoleculeDTO, InputMoleculeDTO inputMoleculeDTO2, InputMoleculeDTO inputMoleculeDTO3, CellDTO cellDTO, InputMoleculeDTO inputMoleculeDTO4, InputMoleculeDTO inputMoleculeDTO5, CmlButtonDTO cmlButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = personalInfoVerificationDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = personalInfoVerificationDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str = personalInfoVerificationDTO.formBackgroundColor;
        }
        if ((i11 & 8) != 0) {
            inputMoleculeDTO = personalInfoVerificationDTO.surnameInput;
        }
        if ((i11 & 16) != 0) {
            inputMoleculeDTO2 = personalInfoVerificationDTO.nameInput;
        }
        if ((i11 & 32) != 0) {
            inputMoleculeDTO3 = personalInfoVerificationDTO.patronymicInput;
        }
        if ((i11 & 64) != 0) {
            cellDTO = personalInfoVerificationDTO.patronymicSettingsCell;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            inputMoleculeDTO4 = personalInfoVerificationDTO.birthDateInput;
        }
        if ((i11 & 256) != 0) {
            inputMoleculeDTO5 = personalInfoVerificationDTO.passportInput;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            cmlButtonDTO = personalInfoVerificationDTO.confirmButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = personalInfoVerificationDTO.trackingInfo;
        }
        CmlButtonDTO cmlButtonDTO2 = cmlButtonDTO;
        Map map2 = map;
        InputMoleculeDTO inputMoleculeDTO6 = inputMoleculeDTO4;
        InputMoleculeDTO inputMoleculeDTO7 = inputMoleculeDTO5;
        InputMoleculeDTO inputMoleculeDTO8 = inputMoleculeDTO3;
        CellDTO cellDTO2 = cellDTO;
        InputMoleculeDTO inputMoleculeDTO9 = inputMoleculeDTO2;
        String str2 = str;
        return personalInfoVerificationDTO.copy(textDTO, list, str2, inputMoleculeDTO, inputMoleculeDTO9, inputMoleculeDTO8, cellDTO2, inputMoleculeDTO6, inputMoleculeDTO7, cmlButtonDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final CmlButtonDTO getConfirmButton() {
        return this.confirmButton;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<TextDTO> component2() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFormBackgroundColor() {
        return this.formBackgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InputMoleculeDTO getSurnameInput() {
        return this.surnameInput;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final InputMoleculeDTO getNameInput() {
        return this.nameInput;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final InputMoleculeDTO getPatronymicInput() {
        return this.patronymicInput;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CellDTO getPatronymicSettingsCell() {
        return this.patronymicSettingsCell;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final InputMoleculeDTO getBirthDateInput() {
        return this.birthDateInput;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final InputMoleculeDTO getPassportInput() {
        return this.passportInput;
    }

    @NotNull
    public final PersonalInfoVerificationDTO copy(@NotNull TextDTO title, @NotNull List<TextDTO> subtitle, @NotNull String formBackgroundColor, @NotNull InputMoleculeDTO surnameInput, @NotNull InputMoleculeDTO nameInput, @NotNull InputMoleculeDTO patronymicInput, @NotNull CellDTO patronymicSettingsCell, @NotNull InputMoleculeDTO birthDateInput, @NotNull InputMoleculeDTO passportInput, @NotNull CmlButtonDTO confirmButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(formBackgroundColor, "formBackgroundColor");
        Intrinsics.checkNotNullParameter(surnameInput, "surnameInput");
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        Intrinsics.checkNotNullParameter(patronymicInput, "patronymicInput");
        Intrinsics.checkNotNullParameter(patronymicSettingsCell, "patronymicSettingsCell");
        Intrinsics.checkNotNullParameter(birthDateInput, "birthDateInput");
        Intrinsics.checkNotNullParameter(passportInput, "passportInput");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        return new PersonalInfoVerificationDTO(title, subtitle, formBackgroundColor, surnameInput, nameInput, patronymicInput, patronymicSettingsCell, birthDateInput, passportInput, confirmButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalInfoVerificationDTO)) {
            return false;
        }
        PersonalInfoVerificationDTO personalInfoVerificationDTO = (PersonalInfoVerificationDTO) other;
        return Intrinsics.d(this.title, personalInfoVerificationDTO.title) && Intrinsics.d(this.subtitle, personalInfoVerificationDTO.subtitle) && Intrinsics.d(this.formBackgroundColor, personalInfoVerificationDTO.formBackgroundColor) && Intrinsics.d(this.surnameInput, personalInfoVerificationDTO.surnameInput) && Intrinsics.d(this.nameInput, personalInfoVerificationDTO.nameInput) && Intrinsics.d(this.patronymicInput, personalInfoVerificationDTO.patronymicInput) && Intrinsics.d(this.patronymicSettingsCell, personalInfoVerificationDTO.patronymicSettingsCell) && Intrinsics.d(this.birthDateInput, personalInfoVerificationDTO.birthDateInput) && Intrinsics.d(this.passportInput, personalInfoVerificationDTO.passportInput) && Intrinsics.d(this.confirmButton, personalInfoVerificationDTO.confirmButton) && Intrinsics.d(this.trackingInfo, personalInfoVerificationDTO.trackingInfo);
    }

    @NotNull
    public final InputMoleculeDTO getBirthDateInput() {
        return this.birthDateInput;
    }

    @NotNull
    public final CmlButtonDTO getConfirmButton() {
        return this.confirmButton;
    }

    @NotNull
    public final String getFormBackgroundColor() {
        return this.formBackgroundColor;
    }

    @NotNull
    public final InputMoleculeDTO getNameInput() {
        return this.nameInput;
    }

    @NotNull
    public final InputMoleculeDTO getPassportInput() {
        return this.passportInput;
    }

    @NotNull
    public final InputMoleculeDTO getPatronymicInput() {
        return this.patronymicInput;
    }

    @NotNull
    public final CellDTO getPatronymicSettingsCell() {
        return this.patronymicSettingsCell;
    }

    @NotNull
    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final InputMoleculeDTO getSurnameInput() {
        return this.surnameInput;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.confirmButton.hashCode() + ((this.passportInput.hashCode() + ((this.birthDateInput.hashCode() + b.c(this.patronymicSettingsCell, (this.patronymicInput.hashCode() + ((this.nameInput.hashCode() + ((this.surnameInput.hashCode() + g.a(g.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.formBackgroundColor)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<TextDTO> list = this.subtitle;
        String str = this.formBackgroundColor;
        InputMoleculeDTO inputMoleculeDTO = this.surnameInput;
        InputMoleculeDTO inputMoleculeDTO2 = this.nameInput;
        InputMoleculeDTO inputMoleculeDTO3 = this.patronymicInput;
        CellDTO cellDTO = this.patronymicSettingsCell;
        InputMoleculeDTO inputMoleculeDTO4 = this.birthDateInput;
        InputMoleculeDTO inputMoleculeDTO5 = this.passportInput;
        CmlButtonDTO cmlButtonDTO = this.confirmButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("PersonalInfoVerificationDTO(title=", textDTO, ", subtitle=", list, ", formBackgroundColor=");
        e11.append(str);
        e11.append(", surnameInput=");
        e11.append(inputMoleculeDTO);
        e11.append(", nameInput=");
        e11.append(inputMoleculeDTO2);
        e11.append(", patronymicInput=");
        e11.append(inputMoleculeDTO3);
        e11.append(", patronymicSettingsCell=");
        e11.append(cellDTO);
        e11.append(", birthDateInput=");
        e11.append(inputMoleculeDTO4);
        e11.append(", passportInput=");
        e11.append(inputMoleculeDTO5);
        e11.append(", confirmButton=");
        e11.append(cmlButtonDTO);
        e11.append(", trackingInfo=");
        return P.f(e11, map, ")");
    }
}
