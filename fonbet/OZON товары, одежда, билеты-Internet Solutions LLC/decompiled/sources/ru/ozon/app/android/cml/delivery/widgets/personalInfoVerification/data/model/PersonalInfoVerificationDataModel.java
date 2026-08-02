package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.model;

import Bi.b;
import G.g;
import K1.G;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b/\u0010(R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationDataModel;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "", "formBackgroundColor", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "surnameInput", "nameInput", "patronymicInput", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "patronymicSettingsCell", "birthDateInput", "passportInput", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getSubtitle", "()Ljava/util/List;", "Ljava/lang/String;", "getFormBackgroundColor", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "getSurnameInput", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "getNameInput", "getPatronymicInput", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPatronymicSettingsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBirthDateInput", "getPassportInput", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfoVerificationDataModel {

    @NotNull
    private final InputMoleculeDTO birthDateInput;

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

    public PersonalInfoVerificationDataModel(@NotNull TextDTO title, @NotNull List<TextDTO> subtitle, @NotNull String formBackgroundColor, @NotNull InputMoleculeDTO surnameInput, @NotNull InputMoleculeDTO nameInput, @NotNull InputMoleculeDTO patronymicInput, @NotNull CellDTO patronymicSettingsCell, @NotNull InputMoleculeDTO birthDateInput, @NotNull InputMoleculeDTO passportInput, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(formBackgroundColor, "formBackgroundColor");
        Intrinsics.checkNotNullParameter(surnameInput, "surnameInput");
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        Intrinsics.checkNotNullParameter(patronymicInput, "patronymicInput");
        Intrinsics.checkNotNullParameter(patronymicSettingsCell, "patronymicSettingsCell");
        Intrinsics.checkNotNullParameter(birthDateInput, "birthDateInput");
        Intrinsics.checkNotNullParameter(passportInput, "passportInput");
        this.title = title;
        this.subtitle = subtitle;
        this.formBackgroundColor = formBackgroundColor;
        this.surnameInput = surnameInput;
        this.nameInput = nameInput;
        this.patronymicInput = patronymicInput;
        this.patronymicSettingsCell = patronymicSettingsCell;
        this.birthDateInput = birthDateInput;
        this.passportInput = passportInput;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalInfoVerificationDataModel)) {
            return false;
        }
        PersonalInfoVerificationDataModel personalInfoVerificationDataModel = (PersonalInfoVerificationDataModel) other;
        return Intrinsics.d(this.title, personalInfoVerificationDataModel.title) && Intrinsics.d(this.subtitle, personalInfoVerificationDataModel.subtitle) && Intrinsics.d(this.formBackgroundColor, personalInfoVerificationDataModel.formBackgroundColor) && Intrinsics.d(this.surnameInput, personalInfoVerificationDataModel.surnameInput) && Intrinsics.d(this.nameInput, personalInfoVerificationDataModel.nameInput) && Intrinsics.d(this.patronymicInput, personalInfoVerificationDataModel.patronymicInput) && Intrinsics.d(this.patronymicSettingsCell, personalInfoVerificationDataModel.patronymicSettingsCell) && Intrinsics.d(this.birthDateInput, personalInfoVerificationDataModel.birthDateInput) && Intrinsics.d(this.passportInput, personalInfoVerificationDataModel.passportInput) && Intrinsics.d(this.trackingInfo, personalInfoVerificationDataModel.trackingInfo);
    }

    @NotNull
    public final InputMoleculeDTO getBirthDateInput() {
        return this.birthDateInput;
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
        int hashCode = (this.passportInput.hashCode() + ((this.birthDateInput.hashCode() + b.c(this.patronymicSettingsCell, (this.patronymicInput.hashCode() + ((this.nameInput.hashCode() + ((this.surnameInput.hashCode() + g.a(g.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.formBackgroundColor)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
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
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("PersonalInfoVerificationDataModel(title=", textDTO, ", subtitle=", list, ", formBackgroundColor=");
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
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }
}
