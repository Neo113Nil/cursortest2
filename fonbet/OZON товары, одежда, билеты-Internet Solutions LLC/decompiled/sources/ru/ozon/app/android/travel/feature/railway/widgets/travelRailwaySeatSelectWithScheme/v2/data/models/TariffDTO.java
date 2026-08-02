package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import B90.C2619v;
import HY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\bHÆ\u0003J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TariffDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TariffDTO;", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final AtomActionDTO action;
    private final Boolean isSelected;

    @NotNull
    private final TextAtom price;

    @NotNull
    private final TextAtom title;

    public TariffDTO(@NotNull TextAtom title, @NotNull TextAtom price, Boolean bool, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.price = price;
        this.isSelected = bool;
        this.action = action;
    }

    public static /* synthetic */ TariffDTO copy$default(TariffDTO tariffDTO, TextAtom textAtom, TextAtom textAtom2, Boolean bool, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = tariffDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = tariffDTO.price;
        }
        if ((i11 & 4) != 0) {
            bool = tariffDTO.isSelected;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = tariffDTO.action;
        }
        return tariffDTO.copy(textAtom, textAtom2, bool, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TariffDTO copy(@NotNull TextAtom title, @NotNull TextAtom price, Boolean isSelected, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(action, "action");
        return new TariffDTO(title, price, isSelected, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TariffDTO)) {
            return false;
        }
        TariffDTO tariffDTO = (TariffDTO) other;
        return Intrinsics.d(this.title, tariffDTO.title) && Intrinsics.d(this.price, tariffDTO.price) && Intrinsics.d(this.isSelected, tariffDTO.isSelected) && Intrinsics.d(this.action, tariffDTO.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TextAtom getPrice() {
        return this.price;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.price);
        Boolean bool = this.isSelected;
        return this.action.hashCode() + ((b11 + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.price;
        Boolean bool = this.isSelected;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder a11 = a.a("TariffDTO(title=", textAtom, ", price=", textAtom2, ", isSelected=");
        a11.append(bool);
        a11.append(", action=");
        a11.append(atomActionDTO);
        a11.append(")");
        return a11.toString();
    }
}
