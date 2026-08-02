package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data;

import Bi.a;
import Bi.b;
import D40.c;
import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;BU\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jg\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u000eHÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006<"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;", "Landroid/os/Parcelable;", "reasons", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "input", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO$Input;", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "checkbox", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "confirmPopover", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "caption", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO$Input;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;Ljava/lang/String;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getReasons", "()Ljava/util/List;", "getInput", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO$Input;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCheckbox", "()Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "getTitle", "()Ljava/lang/String;", "getConfirmPopover", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Input", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CancelReasonsDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CancelReasonsDTO> CREATOR = new Creator();
    private final DisclaimerAtom annotation;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final TextDTO caption;
    private final CheckboxTitleSubtitleCellDTO checkbox;
    private final ConfirmingCancellationPopover confirmPopover;

    @NotNull
    private final Input input;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> reasons;

    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CancelReasonsDTO> {
        @Override // android.os.Parcelable.Creator
        public final CancelReasonsDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(CancelReasonsDTO.class, parcel, arrayList, i11, 1);
            }
            return new CancelReasonsDTO(arrayList, Input.CREATOR.createFromParcel(parcel), (DisclaimerAtom) parcel.readParcelable(CancelReasonsDTO.class.getClassLoader()), (ButtonV3Atom.LargeButton) parcel.readParcelable(CancelReasonsDTO.class.getClassLoader()), (CheckboxTitleSubtitleCellDTO) parcel.readParcelable(CancelReasonsDTO.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ConfirmingCancellationPopover.CREATOR.createFromParcel(parcel), (TextDTO) parcel.readParcelable(CancelReasonsDTO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CancelReasonsDTO[] newArray(int i11) {
            return new CancelReasonsDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO$Input;", "Landroid/os/Parcelable;", "hint", "", "showAlways", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getHint", "()Ljava/lang/String;", "getShowAlways", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO$Input;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        private final String hint;
        private final Boolean showAlways;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Input(readString, valueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i11) {
                return new Input[i11];
            }
        }

        public Input(String str, Boolean bool) {
            this.hint = str;
            this.showAlways = bool;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.hint;
            }
            if ((i11 & 2) != 0) {
                bool = input.showAlways;
            }
            return input.copy(str, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getShowAlways() {
            return this.showAlways;
        }

        @NotNull
        public final Input copy(String hint, Boolean showAlways) {
            return new Input(hint, showAlways);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.hint, input.hint) && Intrinsics.d(this.showAlways, input.showAlways);
        }

        public final String getHint() {
            return this.hint;
        }

        public final Boolean getShowAlways() {
            return this.showAlways;
        }

        public int hashCode() {
            String str = this.hint;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.showAlways;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Input(hint=" + this.hint + ", showAlways=" + this.showAlways + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.hint);
            Boolean bool = this.showAlways;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
        }
    }

    public CancelReasonsDTO(@NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> reasons, @NotNull Input input, DisclaimerAtom disclaimerAtom, @NotNull ButtonV3Atom.LargeButton button, CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO, @NotNull String title, ConfirmingCancellationPopover confirmingCancellationPopover, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(title, "title");
        this.reasons = reasons;
        this.input = input;
        this.annotation = disclaimerAtom;
        this.button = button;
        this.checkbox = checkboxTitleSubtitleCellDTO;
        this.title = title;
        this.confirmPopover = confirmingCancellationPopover;
        this.caption = textDTO;
    }

    public static /* synthetic */ CancelReasonsDTO copy$default(CancelReasonsDTO cancelReasonsDTO, List list, Input input, DisclaimerAtom disclaimerAtom, ButtonV3Atom.LargeButton largeButton, CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO, String str, ConfirmingCancellationPopover confirmingCancellationPopover, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cancelReasonsDTO.reasons;
        }
        if ((i11 & 2) != 0) {
            input = cancelReasonsDTO.input;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = cancelReasonsDTO.annotation;
        }
        if ((i11 & 8) != 0) {
            largeButton = cancelReasonsDTO.button;
        }
        if ((i11 & 16) != 0) {
            checkboxTitleSubtitleCellDTO = cancelReasonsDTO.checkbox;
        }
        if ((i11 & 32) != 0) {
            str = cancelReasonsDTO.title;
        }
        if ((i11 & 64) != 0) {
            confirmingCancellationPopover = cancelReasonsDTO.confirmPopover;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO = cancelReasonsDTO.caption;
        }
        ConfirmingCancellationPopover confirmingCancellationPopover2 = confirmingCancellationPopover;
        TextDTO textDTO2 = textDTO;
        CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO2 = checkboxTitleSubtitleCellDTO;
        String str2 = str;
        return cancelReasonsDTO.copy(list, input, disclaimerAtom, largeButton, checkboxTitleSubtitleCellDTO2, str2, confirmingCancellationPopover2, textDTO2);
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> component1() {
        return this.reasons;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component5, reason: from getter */
    public final CheckboxTitleSubtitleCellDTO getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final ConfirmingCancellationPopover getConfirmPopover() {
        return this.confirmPopover;
    }

    /* renamed from: component8, reason: from getter */
    public final TextDTO getCaption() {
        return this.caption;
    }

    @NotNull
    public final CancelReasonsDTO copy(@NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> reasons, @NotNull Input input, DisclaimerAtom annotation, @NotNull ButtonV3Atom.LargeButton button, CheckboxTitleSubtitleCellDTO checkbox, @NotNull String title, ConfirmingCancellationPopover confirmPopover, TextDTO caption) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CancelReasonsDTO(reasons, input, annotation, button, checkbox, title, confirmPopover, caption);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelReasonsDTO)) {
            return false;
        }
        CancelReasonsDTO cancelReasonsDTO = (CancelReasonsDTO) other;
        return Intrinsics.d(this.reasons, cancelReasonsDTO.reasons) && Intrinsics.d(this.input, cancelReasonsDTO.input) && Intrinsics.d(this.annotation, cancelReasonsDTO.annotation) && Intrinsics.d(this.button, cancelReasonsDTO.button) && Intrinsics.d(this.checkbox, cancelReasonsDTO.checkbox) && Intrinsics.d(this.title, cancelReasonsDTO.title) && Intrinsics.d(this.confirmPopover, cancelReasonsDTO.confirmPopover) && Intrinsics.d(this.caption, cancelReasonsDTO.caption);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final TextDTO getCaption() {
        return this.caption;
    }

    public final CheckboxTitleSubtitleCellDTO getCheckbox() {
        return this.checkbox;
    }

    public final ConfirmingCancellationPopover getConfirmPopover() {
        return this.confirmPopover;
    }

    @NotNull
    public final Input getInput() {
        return this.input;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> getReasons() {
        return this.reasons;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.input.hashCode() + (this.reasons.hashCode() * 31)) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int a11 = Tl.b.a(this.button, (hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31, 31);
        CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO = this.checkbox;
        int a12 = g.a((a11 + (checkboxTitleSubtitleCellDTO == null ? 0 : checkboxTitleSubtitleCellDTO.hashCode())) * 31, 31, this.title);
        ConfirmingCancellationPopover confirmingCancellationPopover = this.confirmPopover;
        int hashCode2 = (a12 + (confirmingCancellationPopover == null ? 0 : confirmingCancellationPopover.hashCode())) * 31;
        TextDTO textDTO = this.caption;
        return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CancelReasonsDTO(reasons=" + this.reasons + ", input=" + this.input + ", annotation=" + this.annotation + ", button=" + this.button + ", checkbox=" + this.checkbox + ", title=" + this.title + ", confirmPopover=" + this.confirmPopover + ", caption=" + this.caption + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.reasons, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), flags);
        }
        this.input.writeToParcel(dest, flags);
        dest.writeParcelable(this.annotation, flags);
        dest.writeParcelable(this.button, flags);
        dest.writeParcelable(this.checkbox, flags);
        dest.writeString(this.title);
        ConfirmingCancellationPopover confirmingCancellationPopover = this.confirmPopover;
        if (confirmingCancellationPopover == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            confirmingCancellationPopover.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.caption, flags);
    }
}
