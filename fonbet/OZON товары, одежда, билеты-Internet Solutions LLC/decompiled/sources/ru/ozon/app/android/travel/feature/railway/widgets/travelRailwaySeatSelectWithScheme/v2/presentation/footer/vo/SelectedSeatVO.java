package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo;

import B90.C2619v;
import Bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/SelectedSeatVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "passengerType", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "price", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPassengerType", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getPrice", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectedSeatVO implements TravelRailwaySeatSelectFooterVO.FooterItem {
    public static final int $stable;
    private final TextAtom description;
    private final int id;
    private final ButtonV3Atom.SmallIconButton infoButton;

    @NotNull
    private final TextAtom passengerType;

    @NotNull
    private final TextAtom price;

    static {
        int i11 = TextAtom.$stable;
        $stable = i11 | ButtonV3Atom.SmallIconButton.$stable | i11 | i11;
    }

    public SelectedSeatVO(int i11, @NotNull TextAtom passengerType, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull TextAtom price) {
        Intrinsics.checkNotNullParameter(passengerType, "passengerType");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = i11;
        this.passengerType = passengerType;
        this.description = textAtom;
        this.infoButton = smallIconButton;
        this.price = price;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedSeatVO)) {
            return false;
        }
        SelectedSeatVO selectedSeatVO = (SelectedSeatVO) other;
        return this.id == selectedSeatVO.id && Intrinsics.d(this.passengerType, selectedSeatVO.passengerType) && Intrinsics.d(this.description, selectedSeatVO.description) && Intrinsics.d(this.infoButton, selectedSeatVO.infoButton) && Intrinsics.d(this.price, selectedSeatVO.price);
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO.FooterItem
    public int getId() {
        return this.id;
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
        int b11 = C2619v.b(Integer.hashCode(this.id) * 31, 31, this.passengerType);
        TextAtom textAtom = this.description;
        int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        return this.price.hashCode() + ((hashCode + (smallIconButton != null ? smallIconButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextAtom textAtom = this.passengerType;
        TextAtom textAtom2 = this.description;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        TextAtom textAtom3 = this.price;
        StringBuilder sb2 = new StringBuilder("SelectedSeatVO(id=");
        sb2.append(i11);
        sb2.append(", passengerType=");
        sb2.append(textAtom);
        sb2.append(", description=");
        sb2.append(textAtom2);
        sb2.append(", infoButton=");
        sb2.append(smallIconButton);
        sb2.append(", price=");
        return b.g(sb2, textAtom3, ")");
    }
}
