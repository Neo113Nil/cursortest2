package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import Ak.C2436a;
import B90.C2619v;
import Bi.b;
import Ve.C4636t5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001:\u0003&'(B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "totalPriceLabel", "totalPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "submitButton", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$PriceItem;", "flightPrices", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTotalPriceLabel", "getTotalPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getFlightPrices", "()Ljava/util/List;", "PriceItem", "SectionTitle", "SeatPriceInfo", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeOrderDetailsVO implements FlightSeatsSchemeItem {

    @NotNull
    private final List<PriceItem> flightPrices;

    @NotNull
    private final TextAtom header;

    @NotNull
    private final String id;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;

    @NotNull
    private final TextAtom totalPrice;

    @NotNull
    private final TextAtom totalPriceLabel;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$PriceItem;", "", "id", "", "getId", "()Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$SeatPriceInfo;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$SectionTitle;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PriceItem {
        @NotNull
        String getId();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$SeatPriceInfo;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "item", "price", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getItem", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatPriceInfo implements PriceItem {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final String id;

        @NotNull
        private final TextAtom item;
        private final TextAtom price;

        public SeatPriceInfo(@NotNull String id2, @NotNull TextAtom item, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(item, "item");
            this.id = id2;
            this.item = item;
            this.price = textAtom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatPriceInfo)) {
                return false;
            }
            SeatPriceInfo seatPriceInfo = (SeatPriceInfo) other;
            return Intrinsics.d(this.id, seatPriceInfo.id) && Intrinsics.d(this.item, seatPriceInfo.item) && Intrinsics.d(this.price, seatPriceInfo.price);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO.PriceItem
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getItem() {
            return this.item;
        }

        public final TextAtom getPrice() {
            return this.price;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.id.hashCode() * 31, 31, this.item);
            TextAtom textAtom = this.price;
            return b11 + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.id;
            TextAtom textAtom = this.item;
            return b.g(C2436a.d("SeatPriceInfo(id=", str, ", item=", ", price=", textAtom), this.price, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$SectionTitle;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionTitle implements PriceItem {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final String id;

        @NotNull
        private final TextAtom title;

        public SectionTitle(@NotNull String id2, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id2;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionTitle)) {
                return false;
            }
            SectionTitle sectionTitle = (SectionTitle) other;
            return Intrinsics.d(this.id, sectionTitle.id) && Intrinsics.d(this.title, sectionTitle.title);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO.PriceItem
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SectionTitle(id=" + this.id + ", title=" + this.title + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSeatsSchemeOrderDetailsVO(@NotNull String id2, @NotNull TextAtom header, @NotNull TextAtom totalPriceLabel, @NotNull TextAtom totalPrice, @NotNull ButtonV3Atom.LargeButton submitButton, @NotNull List<? extends PriceItem> flightPrices) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(totalPriceLabel, "totalPriceLabel");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(flightPrices, "flightPrices");
        this.id = id2;
        this.header = header;
        this.totalPriceLabel = totalPriceLabel;
        this.totalPrice = totalPrice;
        this.submitButton = submitButton;
        this.flightPrices = flightPrices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeOrderDetailsVO)) {
            return false;
        }
        FlightSeatsSchemeOrderDetailsVO flightSeatsSchemeOrderDetailsVO = (FlightSeatsSchemeOrderDetailsVO) other;
        return Intrinsics.d(this.id, flightSeatsSchemeOrderDetailsVO.id) && Intrinsics.d(this.header, flightSeatsSchemeOrderDetailsVO.header) && Intrinsics.d(this.totalPriceLabel, flightSeatsSchemeOrderDetailsVO.totalPriceLabel) && Intrinsics.d(this.totalPrice, flightSeatsSchemeOrderDetailsVO.totalPrice) && Intrinsics.d(this.submitButton, flightSeatsSchemeOrderDetailsVO.submitButton) && Intrinsics.d(this.flightPrices, flightSeatsSchemeOrderDetailsVO.flightPrices);
    }

    @NotNull
    public final List<PriceItem> getFlightPrices() {
        return this.flightPrices;
    }

    @NotNull
    public final TextAtom getHeader() {
        return this.header;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    public final TextAtom getTotalPriceLabel() {
        return this.totalPriceLabel;
    }

    public int hashCode() {
        return this.flightPrices.hashCode() + Tl.b.a(this.submitButton, C2619v.b(C2619v.b(C2619v.b(this.id.hashCode() * 31, 31, this.header), 31, this.totalPriceLabel), 31, this.totalPrice), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextAtom textAtom = this.header;
        TextAtom textAtom2 = this.totalPriceLabel;
        TextAtom textAtom3 = this.totalPrice;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        List<PriceItem> list = this.flightPrices;
        StringBuilder d11 = C2436a.d("FlightSeatsSchemeOrderDetailsVO(id=", str, ", header=", ", totalPriceLabel=", textAtom);
        C4636t5.c(", totalPrice=", ", submitButton=", d11, textAtom2, textAtom3);
        d11.append(largeButton);
        d11.append(", flightPrices=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }
}
