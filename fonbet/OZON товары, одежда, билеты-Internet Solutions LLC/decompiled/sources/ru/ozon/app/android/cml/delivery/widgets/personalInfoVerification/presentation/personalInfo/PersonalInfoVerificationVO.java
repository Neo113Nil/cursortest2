package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo;

import Bi.b;
import G.g;
import TY.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0086\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b7\u00100R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "", "formBackgroundColor", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "surnameInput", "nameInput", "patronymicInput", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "patronymicSettingsCell", "birthDateInput", "passportInput", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;LWZ/t;)Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getSubtitle", "()Ljava/util/List;", "Ljava/lang/String;", "getFormBackgroundColor", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "getSurnameInput", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "getNameInput", "getPatronymicInput", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPatronymicSettingsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBirthDateInput", "getPassportInput", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfoVerificationVO implements c {

    @NotNull
    private final InputMoleculeVO birthDateInput;

    @NotNull
    private final String formBackgroundColor;
    private final long id;

    @NotNull
    private final InputMoleculeVO nameInput;

    @NotNull
    private final InputMoleculeVO passportInput;

    @NotNull
    private final InputMoleculeVO patronymicInput;

    @NotNull
    private final CellDTO patronymicSettingsCell;

    @NotNull
    private final List<TextDTO> subtitle;

    @NotNull
    private final InputMoleculeVO surnameInput;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    public PersonalInfoVerificationVO(long j11, @NotNull TextDTO title, @NotNull List<TextDTO> subtitle, @NotNull String formBackgroundColor, @NotNull InputMoleculeVO surnameInput, @NotNull InputMoleculeVO nameInput, @NotNull InputMoleculeVO patronymicInput, @NotNull CellDTO patronymicSettingsCell, @NotNull InputMoleculeVO birthDateInput, @NotNull InputMoleculeVO passportInput, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(formBackgroundColor, "formBackgroundColor");
        Intrinsics.checkNotNullParameter(surnameInput, "surnameInput");
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        Intrinsics.checkNotNullParameter(patronymicInput, "patronymicInput");
        Intrinsics.checkNotNullParameter(patronymicSettingsCell, "patronymicSettingsCell");
        Intrinsics.checkNotNullParameter(birthDateInput, "birthDateInput");
        Intrinsics.checkNotNullParameter(passportInput, "passportInput");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.formBackgroundColor = formBackgroundColor;
        this.surnameInput = surnameInput;
        this.nameInput = nameInput;
        this.patronymicInput = patronymicInput;
        this.patronymicSettingsCell = patronymicSettingsCell;
        this.birthDateInput = birthDateInput;
        this.passportInput = passportInput;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ PersonalInfoVerificationVO copy$default(PersonalInfoVerificationVO personalInfoVerificationVO, long j11, TextDTO textDTO, List list, String str, InputMoleculeVO inputMoleculeVO, InputMoleculeVO inputMoleculeVO2, InputMoleculeVO inputMoleculeVO3, CellDTO cellDTO, InputMoleculeVO inputMoleculeVO4, InputMoleculeVO inputMoleculeVO5, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = personalInfoVerificationVO.id;
        }
        return personalInfoVerificationVO.copy(j11, (i11 & 2) != 0 ? personalInfoVerificationVO.title : textDTO, (i11 & 4) != 0 ? personalInfoVerificationVO.subtitle : list, (i11 & 8) != 0 ? personalInfoVerificationVO.formBackgroundColor : str, (i11 & 16) != 0 ? personalInfoVerificationVO.surnameInput : inputMoleculeVO, (i11 & 32) != 0 ? personalInfoVerificationVO.nameInput : inputMoleculeVO2, (i11 & 64) != 0 ? personalInfoVerificationVO.patronymicInput : inputMoleculeVO3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? personalInfoVerificationVO.patronymicSettingsCell : cellDTO, (i11 & 256) != 0 ? personalInfoVerificationVO.birthDateInput : inputMoleculeVO4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? personalInfoVerificationVO.passportInput : inputMoleculeVO5, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? personalInfoVerificationVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final PersonalInfoVerificationVO copy(long id2, @NotNull TextDTO title, @NotNull List<TextDTO> subtitle, @NotNull String formBackgroundColor, @NotNull InputMoleculeVO surnameInput, @NotNull InputMoleculeVO nameInput, @NotNull InputMoleculeVO patronymicInput, @NotNull CellDTO patronymicSettingsCell, @NotNull InputMoleculeVO birthDateInput, @NotNull InputMoleculeVO passportInput, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(formBackgroundColor, "formBackgroundColor");
        Intrinsics.checkNotNullParameter(surnameInput, "surnameInput");
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        Intrinsics.checkNotNullParameter(patronymicInput, "patronymicInput");
        Intrinsics.checkNotNullParameter(patronymicSettingsCell, "patronymicSettingsCell");
        Intrinsics.checkNotNullParameter(birthDateInput, "birthDateInput");
        Intrinsics.checkNotNullParameter(passportInput, "passportInput");
        return new PersonalInfoVerificationVO(id2, title, subtitle, formBackgroundColor, surnameInput, nameInput, patronymicInput, patronymicSettingsCell, birthDateInput, passportInput, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalInfoVerificationVO)) {
            return false;
        }
        PersonalInfoVerificationVO personalInfoVerificationVO = (PersonalInfoVerificationVO) other;
        return this.id == personalInfoVerificationVO.id && Intrinsics.d(this.title, personalInfoVerificationVO.title) && Intrinsics.d(this.subtitle, personalInfoVerificationVO.subtitle) && Intrinsics.d(this.formBackgroundColor, personalInfoVerificationVO.formBackgroundColor) && Intrinsics.d(this.surnameInput, personalInfoVerificationVO.surnameInput) && Intrinsics.d(this.nameInput, personalInfoVerificationVO.nameInput) && Intrinsics.d(this.patronymicInput, personalInfoVerificationVO.patronymicInput) && Intrinsics.d(this.patronymicSettingsCell, personalInfoVerificationVO.patronymicSettingsCell) && Intrinsics.d(this.birthDateInput, personalInfoVerificationVO.birthDateInput) && Intrinsics.d(this.passportInput, personalInfoVerificationVO.passportInput) && Intrinsics.d(this.tokenizedEvent, personalInfoVerificationVO.tokenizedEvent);
    }

    @NotNull
    public final InputMoleculeVO getBirthDateInput() {
        return this.birthDateInput;
    }

    @NotNull
    public final String getFormBackgroundColor() {
        return this.formBackgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InputMoleculeVO getNameInput() {
        return this.nameInput;
    }

    @NotNull
    public final InputMoleculeVO getPassportInput() {
        return this.passportInput;
    }

    @NotNull
    public final InputMoleculeVO getPatronymicInput() {
        return this.patronymicInput;
    }

    @NotNull
    public final CellDTO getPatronymicSettingsCell() {
        return this.patronymicSettingsCell;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final InputMoleculeVO getSurnameInput() {
        return this.surnameInput;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.passportInput.hashCode() + ((this.birthDateInput.hashCode() + b.c(this.patronymicSettingsCell, (this.patronymicInput.hashCode() + ((this.nameInput.hashCode() + ((this.surnameInput.hashCode() + g.a(g.b(Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.subtitle), 31, this.formBackgroundColor)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<TextDTO> list = this.subtitle;
        String str = this.formBackgroundColor;
        InputMoleculeVO inputMoleculeVO = this.surnameInput;
        InputMoleculeVO inputMoleculeVO2 = this.nameInput;
        InputMoleculeVO inputMoleculeVO3 = this.patronymicInput;
        CellDTO cellDTO = this.patronymicSettingsCell;
        InputMoleculeVO inputMoleculeVO4 = this.birthDateInput;
        InputMoleculeVO inputMoleculeVO5 = this.passportInput;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("PersonalInfoVerificationVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(list);
        b11.append(", formBackgroundColor=");
        b11.append(str);
        b11.append(", surnameInput=");
        b11.append(inputMoleculeVO);
        b11.append(", nameInput=");
        b11.append(inputMoleculeVO2);
        b11.append(", patronymicInput=");
        b11.append(inputMoleculeVO3);
        b11.append(", patronymicSettingsCell=");
        b11.append(cellDTO);
        b11.append(", birthDateInput=");
        b11.append(inputMoleculeVO4);
        b11.append(", passportInput=");
        b11.append(inputMoleculeVO5);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
