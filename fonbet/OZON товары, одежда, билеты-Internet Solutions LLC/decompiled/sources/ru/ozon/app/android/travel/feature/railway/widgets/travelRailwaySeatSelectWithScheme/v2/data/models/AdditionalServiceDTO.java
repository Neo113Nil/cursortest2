package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import B90.C2619v;
import HY.a;
import K1.G;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AdditionalServiceDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "price", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AdditionalServiceDTO;", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServiceDTO {
    public static final int $stable = TextAtom.$stable;
    private final AtomActionDTO action;
    private final TextAtom description;
    private final Boolean isSelected;

    @NotNull
    private final TextAtom price;

    @NotNull
    private final TextAtom title;

    public AdditionalServiceDTO(@NotNull TextAtom title, TextAtom textAtom, @NotNull TextAtom price, Boolean bool, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        this.title = title;
        this.description = textAtom;
        this.price = price;
        this.isSelected = bool;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ AdditionalServiceDTO copy$default(AdditionalServiceDTO additionalServiceDTO, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, Boolean bool, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = additionalServiceDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = additionalServiceDTO.description;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = additionalServiceDTO.price;
        }
        if ((i11 & 8) != 0) {
            bool = additionalServiceDTO.isSelected;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = additionalServiceDTO.action;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        TextAtom textAtom4 = textAtom3;
        return additionalServiceDTO.copy(textAtom, textAtom2, textAtom4, bool, atomActionDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final AdditionalServiceDTO copy(@NotNull TextAtom title, TextAtom description, @NotNull TextAtom price, Boolean isSelected, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        return new AdditionalServiceDTO(title, description, price, isSelected, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServiceDTO)) {
            return false;
        }
        AdditionalServiceDTO additionalServiceDTO = (AdditionalServiceDTO) other;
        return Intrinsics.d(this.title, additionalServiceDTO.title) && Intrinsics.d(this.description, additionalServiceDTO.description) && Intrinsics.d(this.price, additionalServiceDTO.price) && Intrinsics.d(this.isSelected, additionalServiceDTO.isSelected) && Intrinsics.d(this.action, additionalServiceDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final TextAtom getDescription() {
        return this.description;
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
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.description;
        int b11 = C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.price);
        Boolean bool = this.isSelected;
        int hashCode2 = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        TextAtom textAtom3 = this.price;
        Boolean bool = this.isSelected;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder a11 = a.a("AdditionalServiceDTO(title=", textAtom, ", description=", textAtom2, ", price=");
        a11.append(textAtom3);
        a11.append(", isSelected=");
        a11.append(bool);
        a11.append(", action=");
        return G.c(a11, atomActionDTO, ")");
    }
}
