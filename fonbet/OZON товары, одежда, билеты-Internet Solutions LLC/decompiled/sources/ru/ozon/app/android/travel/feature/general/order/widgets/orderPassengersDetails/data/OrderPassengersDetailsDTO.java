package ru.ozon.app.android.travel.feature.general.order.widgets.orderPassengersDetails.data;

import Co.a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/data/OrderPassengersDetailsDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/data/OrderPassengersDetailsDTO$HeaderDTO;", "passengers", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/data/OrderPassengersDetailsDTO$PassengerDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/data/OrderPassengersDetailsDTO$HeaderDTO;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/data/OrderPassengersDetailsDTO$HeaderDTO;", "getPassengers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HeaderDTO", "PassengerDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderPassengersDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final HeaderDTO header;

    @NotNull
    private final List<PassengerDTO> passengers;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/data/OrderPassengersDetailsDTO$HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 0;
        private final String icon;

        @NotNull
        private final String title;

        public HeaderDTO(@NotNull String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.icon = str;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = headerDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = headerDTO.icon;
            }
            return headerDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final HeaderDTO copy(@NotNull String title, String icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new HeaderDTO(title, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.icon, headerDTO.icon);
        }

        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.icon;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("HeaderDTO(title=", this.title, ", icon=", this.icon, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/data/OrderPassengersDetailsDTO$PassengerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public PassengerDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ PassengerDTO copy$default(PassengerDTO passengerDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = passengerDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = passengerDTO.subtitle;
            }
            return passengerDTO.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final PassengerDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new PassengerDTO(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerDTO)) {
                return false;
            }
            PassengerDTO passengerDTO = (PassengerDTO) other;
            return Intrinsics.d(this.title, passengerDTO.title) && Intrinsics.d(this.subtitle, passengerDTO.subtitle);
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.a("PassengerDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    public OrderPassengersDetailsDTO(@NotNull HeaderDTO header, @NotNull List<PassengerDTO> passengers) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.header = header;
        this.passengers = passengers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderPassengersDetailsDTO copy$default(OrderPassengersDetailsDTO orderPassengersDetailsDTO, HeaderDTO headerDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = orderPassengersDetailsDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = orderPassengersDetailsDTO.passengers;
        }
        return orderPassengersDetailsDTO.copy(headerDTO, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<PassengerDTO> component2() {
        return this.passengers;
    }

    @NotNull
    public final OrderPassengersDetailsDTO copy(@NotNull HeaderDTO header, @NotNull List<PassengerDTO> passengers) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        return new OrderPassengersDetailsDTO(header, passengers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPassengersDetailsDTO)) {
            return false;
        }
        OrderPassengersDetailsDTO orderPassengersDetailsDTO = (OrderPassengersDetailsDTO) other;
        return Intrinsics.d(this.header, orderPassengersDetailsDTO.header) && Intrinsics.d(this.passengers, orderPassengersDetailsDTO.passengers);
    }

    @NotNull
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<PassengerDTO> getPassengers() {
        return this.passengers;
    }

    public int hashCode() {
        return this.passengers.hashCode() + (this.header.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OrderPassengersDetailsDTO(header=" + this.header + ", passengers=" + this.passengers + ")";
    }
}
