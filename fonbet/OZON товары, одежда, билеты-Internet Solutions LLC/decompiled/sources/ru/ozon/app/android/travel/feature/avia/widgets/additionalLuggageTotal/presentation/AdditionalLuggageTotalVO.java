package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggageTotal.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.presentation.ExtraLuggageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggageTotal/presentation/AdditionalLuggageTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/presentation/ExtraLuggageVO;", "flightTicketLuggages", "totalPrice", "priceDescription", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getFlightTicketLuggages", "()Ljava/util/List;", "getTotalPrice", "getPriceDescription", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalLuggageTotalVO implements c {

    @NotNull
    private final List<ExtraLuggageVO> flightTicketLuggages;
    private final long id;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final TextAtom totalPrice;

    public AdditionalLuggageTotalVO(long j11, @NotNull TextAtom title, @NotNull List<ExtraLuggageVO> flightTicketLuggages, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(flightTicketLuggages, "flightTicketLuggages");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        this.id = j11;
        this.title = title;
        this.flightTicketLuggages = flightTicketLuggages;
        this.totalPrice = totalPrice;
        this.priceDescription = priceDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalLuggageTotalVO)) {
            return false;
        }
        AdditionalLuggageTotalVO additionalLuggageTotalVO = (AdditionalLuggageTotalVO) other;
        return this.id == additionalLuggageTotalVO.id && Intrinsics.d(this.title, additionalLuggageTotalVO.title) && Intrinsics.d(this.flightTicketLuggages, additionalLuggageTotalVO.flightTicketLuggages) && Intrinsics.d(this.totalPrice, additionalLuggageTotalVO.totalPrice) && Intrinsics.d(this.priceDescription, additionalLuggageTotalVO.priceDescription);
    }

    @NotNull
    public final List<ExtraLuggageVO> getFlightTicketLuggages() {
        return this.flightTicketLuggages;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.priceDescription.hashCode() + C2619v.b(g.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.flightTicketLuggages), 31, this.totalPrice);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<ExtraLuggageVO> list = this.flightTicketLuggages;
        TextAtom textAtom2 = this.totalPrice;
        TextAtom textAtom3 = this.priceDescription;
        StringBuilder c11 = C2639a.c("AdditionalLuggageTotalVO(id=", j11, ", title=", textAtom);
        c11.append(", flightTicketLuggages=");
        c11.append(list);
        c11.append(", totalPrice=");
        c11.append(textAtom2);
        c11.append(", priceDescription=");
        c11.append(textAtom3);
        c11.append(")");
        return c11.toString();
    }
}
