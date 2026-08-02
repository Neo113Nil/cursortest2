package ru.ozon.app.android.travel.feature.avia.widgets.orderFlightInfo.data;

import B0.A0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v1.TripLegDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/orderFlightInfo/data/OrderFlightInfoDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/avia/widgets/orderFlightInfo/data/OrderFlightInfoDTO$HeaderDTO;", "tripLeg", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "items", "", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/orderFlightInfo/data/OrderFlightInfoDTO$HeaderDTO;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/travel/feature/avia/widgets/orderFlightInfo/data/OrderFlightInfoDTO$HeaderDTO;", "getTripLeg", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HeaderDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderFlightInfoDTO {
    public static final int $stable = 8;
    private final DisclaimerAtom disclaimer;

    @NotNull
    private final HeaderDTO header;
    private final List<ListElementAtom.ListElement> items;

    @NotNull
    private final TripLegDTO tripLeg;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/orderFlightInfo/data/OrderFlightInfoDTO$HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 0;

        @NotNull
        private final String title;

        public HeaderDTO(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = headerDTO.title;
            }
            return headerDTO.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final HeaderDTO copy(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new HeaderDTO(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderDTO) && Intrinsics.d(this.title, ((HeaderDTO) other).title);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("HeaderDTO(title=", this.title, ")");
        }
    }

    public OrderFlightInfoDTO(@NotNull HeaderDTO header, @NotNull TripLegDTO tripLeg, DisclaimerAtom disclaimerAtom, List<ListElementAtom.ListElement> list) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
        this.header = header;
        this.tripLeg = tripLeg;
        this.disclaimer = disclaimerAtom;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderFlightInfoDTO copy$default(OrderFlightInfoDTO orderFlightInfoDTO, HeaderDTO headerDTO, TripLegDTO tripLegDTO, DisclaimerAtom disclaimerAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = orderFlightInfoDTO.header;
        }
        if ((i11 & 2) != 0) {
            tripLegDTO = orderFlightInfoDTO.tripLeg;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = orderFlightInfoDTO.disclaimer;
        }
        if ((i11 & 8) != 0) {
            list = orderFlightInfoDTO.items;
        }
        return orderFlightInfoDTO.copy(headerDTO, tripLegDTO, disclaimerAtom, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TripLegDTO getTripLeg() {
        return this.tripLeg;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    public final List<ListElementAtom.ListElement> component4() {
        return this.items;
    }

    @NotNull
    public final OrderFlightInfoDTO copy(@NotNull HeaderDTO header, @NotNull TripLegDTO tripLeg, DisclaimerAtom disclaimer, List<ListElementAtom.ListElement> items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
        return new OrderFlightInfoDTO(header, tripLeg, disclaimer, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderFlightInfoDTO)) {
            return false;
        }
        OrderFlightInfoDTO orderFlightInfoDTO = (OrderFlightInfoDTO) other;
        return Intrinsics.d(this.header, orderFlightInfoDTO.header) && Intrinsics.d(this.tripLeg, orderFlightInfoDTO.tripLeg) && Intrinsics.d(this.disclaimer, orderFlightInfoDTO.disclaimer) && Intrinsics.d(this.items, orderFlightInfoDTO.items);
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<ListElementAtom.ListElement> getItems() {
        return this.items;
    }

    @NotNull
    public final TripLegDTO getTripLeg() {
        return this.tripLeg;
    }

    public int hashCode() {
        int hashCode = (this.tripLeg.hashCode() + (this.header.hashCode() * 31)) * 31;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode2 = (hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        List<ListElementAtom.ListElement> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderFlightInfoDTO(header=" + this.header + ", tripLeg=" + this.tripLeg + ", disclaimer=" + this.disclaimer + ", items=" + this.items + ")";
    }
}
