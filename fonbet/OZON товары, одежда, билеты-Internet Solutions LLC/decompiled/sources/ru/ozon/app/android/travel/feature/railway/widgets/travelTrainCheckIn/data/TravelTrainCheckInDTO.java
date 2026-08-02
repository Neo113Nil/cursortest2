package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.data;

import B90.C2618u;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "passengersList", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadio;", "checkInButton", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO$Button;", "cancelButton", "errors", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO$Button;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO$Button;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPassengersList", "()Ljava/util/List;", "getCheckInButton", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO$Button;", "getCancelButton", "getErrors", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Button", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTrainCheckInDTO {
    public static final int $stable = 8;

    @NotNull
    private final Button cancelButton;

    @NotNull
    private final Button checkInButton;
    private final List<String> errors;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio> passengersList;
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO$Button;", "", "mobileButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getMobileButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeButton mobileButton;

        public Button(@NotNull ButtonV3Atom.LargeButton mobileButton) {
            Intrinsics.checkNotNullParameter(mobileButton, "mobileButton");
            this.mobileButton = mobileButton;
        }

        public static /* synthetic */ Button copy$default(Button button, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                largeButton = button.mobileButton;
            }
            return button.copy(largeButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.LargeButton getMobileButton() {
            return this.mobileButton;
        }

        @NotNull
        public final Button copy(@NotNull ButtonV3Atom.LargeButton mobileButton) {
            Intrinsics.checkNotNullParameter(mobileButton, "mobileButton");
            return new Button(mobileButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && Intrinsics.d(this.mobileButton, ((Button) other).mobileButton);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getMobileButton() {
            return this.mobileButton;
        }

        public int hashCode() {
            return this.mobileButton.hashCode();
        }

        @NotNull
        public String toString() {
            return "Button(mobileButton=" + this.mobileButton + ")";
        }
    }

    public TravelTrainCheckInDTO(TextAtom textAtom, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio> passengersList, @NotNull Button checkInButton, @NotNull Button cancelButton, List<String> list) {
        Intrinsics.checkNotNullParameter(passengersList, "passengersList");
        Intrinsics.checkNotNullParameter(checkInButton, "checkInButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.title = textAtom;
        this.passengersList = passengersList;
        this.checkInButton = checkInButton;
        this.cancelButton = cancelButton;
        this.errors = list;
    }

    public static /* synthetic */ TravelTrainCheckInDTO copy$default(TravelTrainCheckInDTO travelTrainCheckInDTO, TextAtom textAtom, List list, Button button, Button button2, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelTrainCheckInDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = travelTrainCheckInDTO.passengersList;
        }
        if ((i11 & 4) != 0) {
            button = travelTrainCheckInDTO.checkInButton;
        }
        if ((i11 & 8) != 0) {
            button2 = travelTrainCheckInDTO.cancelButton;
        }
        if ((i11 & 16) != 0) {
            list2 = travelTrainCheckInDTO.errors;
        }
        List list3 = list2;
        Button button3 = button;
        return travelTrainCheckInDTO.copy(textAtom, list, button3, button2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio> component2() {
        return this.passengersList;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Button getCheckInButton() {
        return this.checkInButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Button getCancelButton() {
        return this.cancelButton;
    }

    public final List<String> component5() {
        return this.errors;
    }

    @NotNull
    public final TravelTrainCheckInDTO copy(TextAtom title, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio> passengersList, @NotNull Button checkInButton, @NotNull Button cancelButton, List<String> errors) {
        Intrinsics.checkNotNullParameter(passengersList, "passengersList");
        Intrinsics.checkNotNullParameter(checkInButton, "checkInButton");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new TravelTrainCheckInDTO(title, passengersList, checkInButton, cancelButton, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTrainCheckInDTO)) {
            return false;
        }
        TravelTrainCheckInDTO travelTrainCheckInDTO = (TravelTrainCheckInDTO) other;
        return Intrinsics.d(this.title, travelTrainCheckInDTO.title) && Intrinsics.d(this.passengersList, travelTrainCheckInDTO.passengersList) && Intrinsics.d(this.checkInButton, travelTrainCheckInDTO.checkInButton) && Intrinsics.d(this.cancelButton, travelTrainCheckInDTO.cancelButton) && Intrinsics.d(this.errors, travelTrainCheckInDTO.errors);
    }

    @NotNull
    public final Button getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final Button getCheckInButton() {
        return this.checkInButton;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio> getPassengersList() {
        return this.passengersList;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (this.cancelButton.hashCode() + ((this.checkInButton.hashCode() + g.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.passengersList)) * 31)) * 31;
        List<String> list = this.errors;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio> list = this.passengersList;
        Button button = this.checkInButton;
        Button button2 = this.cancelButton;
        List<String> list2 = this.errors;
        StringBuilder sb2 = new StringBuilder("TravelTrainCheckInDTO(title=");
        sb2.append(textAtom);
        sb2.append(", passengersList=");
        sb2.append(list);
        sb2.append(", checkInButton=");
        sb2.append(button);
        sb2.append(", cancelButton=");
        sb2.append(button2);
        sb2.append(", errors=");
        return C2618u.h(sb2, list2, ")");
    }
}
