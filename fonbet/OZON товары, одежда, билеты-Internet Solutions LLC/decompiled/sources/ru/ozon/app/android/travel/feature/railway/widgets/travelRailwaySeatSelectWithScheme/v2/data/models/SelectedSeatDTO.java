package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import HY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/SelectedSeatDTO;", "", "passengerType", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "price", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getPassengerType", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getPrice", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectedSeatDTO {
    public static final int $stable;
    private final TextAtom description;
    private final ButtonV3Atom.SmallIconButton infoButton;

    @NotNull
    private final TextAtom passengerType;

    @NotNull
    private final TextAtom price;

    static {
        int i11 = TextAtom.$stable;
        $stable = i11 | ButtonV3Atom.SmallIconButton.$stable | i11 | i11;
    }

    public SelectedSeatDTO(@NotNull TextAtom passengerType, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull TextAtom price) {
        Intrinsics.checkNotNullParameter(passengerType, "passengerType");
        Intrinsics.checkNotNullParameter(price, "price");
        this.passengerType = passengerType;
        this.description = textAtom;
        this.infoButton = smallIconButton;
        this.price = price;
    }

    public static /* synthetic */ SelectedSeatDTO copy$default(SelectedSeatDTO selectedSeatDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, TextAtom textAtom3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = selectedSeatDTO.passengerType;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = selectedSeatDTO.description;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = selectedSeatDTO.infoButton;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = selectedSeatDTO.price;
        }
        return selectedSeatDTO.copy(textAtom, textAtom2, smallIconButton, textAtom3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getPassengerType() {
        return this.passengerType;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getPrice() {
        return this.price;
    }

    @NotNull
    public final SelectedSeatDTO copy(@NotNull TextAtom passengerType, TextAtom description, ButtonV3Atom.SmallIconButton infoButton, @NotNull TextAtom price) {
        Intrinsics.checkNotNullParameter(passengerType, "passengerType");
        Intrinsics.checkNotNullParameter(price, "price");
        return new SelectedSeatDTO(passengerType, description, infoButton, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedSeatDTO)) {
            return false;
        }
        SelectedSeatDTO selectedSeatDTO = (SelectedSeatDTO) other;
        return Intrinsics.d(this.passengerType, selectedSeatDTO.passengerType) && Intrinsics.d(this.description, selectedSeatDTO.description) && Intrinsics.d(this.infoButton, selectedSeatDTO.infoButton) && Intrinsics.d(this.price, selectedSeatDTO.price);
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final TextAtom getPassengerType() {
        return this.passengerType;
    }

    @NotNull
    public final TextAtom getPrice() {
        return this.price;
    }

    public int hashCode() {
        int hashCode = this.passengerType.hashCode() * 31;
        TextAtom textAtom = this.description;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        return this.price.hashCode() + ((hashCode2 + (smallIconButton != null ? smallIconButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.passengerType;
        TextAtom textAtom2 = this.description;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        TextAtom textAtom3 = this.price;
        StringBuilder a11 = a.a("SelectedSeatDTO(passengerType=", textAtom, ", description=", textAtom2, ", infoButton=");
        a11.append(smallIconButton);
        a11.append(", price=");
        a11.append(textAtom3);
        a11.append(")");
        return a11.toString();
    }
}
