package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggageTotal.data;

import B90.C2619v;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.data.ExtraLuggageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggageTotal/data/AdditionalLuggageTotalDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "flightTicketLuggages", "", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/data/ExtraLuggageDTO;", "totalPrice", "priceDescription", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFlightTicketLuggages", "()Ljava/util/List;", "getTotalPrice", "getPriceDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalLuggageTotalDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ExtraLuggageDTO> flightTicketLuggages;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final TextAtom totalPrice;

    public AdditionalLuggageTotalDTO(@NotNull TextAtom title, @NotNull List<ExtraLuggageDTO> flightTicketLuggages, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(flightTicketLuggages, "flightTicketLuggages");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        this.title = title;
        this.flightTicketLuggages = flightTicketLuggages;
        this.totalPrice = totalPrice;
        this.priceDescription = priceDescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdditionalLuggageTotalDTO copy$default(AdditionalLuggageTotalDTO additionalLuggageTotalDTO, TextAtom textAtom, List list, TextAtom textAtom2, TextAtom textAtom3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = additionalLuggageTotalDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = additionalLuggageTotalDTO.flightTicketLuggages;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = additionalLuggageTotalDTO.totalPrice;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = additionalLuggageTotalDTO.priceDescription;
        }
        return additionalLuggageTotalDTO.copy(textAtom, list, textAtom2, textAtom3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<ExtraLuggageDTO> component2() {
        return this.flightTicketLuggages;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final AdditionalLuggageTotalDTO copy(@NotNull TextAtom title, @NotNull List<ExtraLuggageDTO> flightTicketLuggages, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(flightTicketLuggages, "flightTicketLuggages");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        return new AdditionalLuggageTotalDTO(title, flightTicketLuggages, totalPrice, priceDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalLuggageTotalDTO)) {
            return false;
        }
        AdditionalLuggageTotalDTO additionalLuggageTotalDTO = (AdditionalLuggageTotalDTO) other;
        return Intrinsics.d(this.title, additionalLuggageTotalDTO.title) && Intrinsics.d(this.flightTicketLuggages, additionalLuggageTotalDTO.flightTicketLuggages) && Intrinsics.d(this.totalPrice, additionalLuggageTotalDTO.totalPrice) && Intrinsics.d(this.priceDescription, additionalLuggageTotalDTO.priceDescription);
    }

    @NotNull
    public final List<ExtraLuggageDTO> getFlightTicketLuggages() {
        return this.flightTicketLuggages;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        return this.priceDescription.hashCode() + C2619v.b(g.b(this.title.hashCode() * 31, 31, this.flightTicketLuggages), 31, this.totalPrice);
    }

    @NotNull
    public String toString() {
        return "AdditionalLuggageTotalDTO(title=" + this.title + ", flightTicketLuggages=" + this.flightTicketLuggages + ", totalPrice=" + this.totalPrice + ", priceDescription=" + this.priceDescription + ")";
    }
}
