package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data;

import B90.C2616s;
import C.o0;
import G.g;
import K1.G;
import N3.C3660k;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J6\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;", "", "orders", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO;", "timerTimeLeft", "", "timerAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getOrders", "()Ljava/util/List;", "getTimerTimeLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimerAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;", "equals", "", "other", "hashCode", "toString", "", "OrderItemDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelOrderListMobileDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<OrderItemDTO> orders;
    private final AtomActionDTO timerAction;
    private final Integer timerTimeLeft;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$HeaderDTO;", "section", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;", "deeplink", "", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$HeaderDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;Ljava/lang/String;)V", "getHeader", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$HeaderDTO;", "getSection", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderDTO", "SectionDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class OrderItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final String deeplink;

        @NotNull
        private final HeaderDTO header;

        @NotNull
        private final SectionDTO section;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "number", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getNumber", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HeaderDTO {
            public static final int $stable = Icon.$stable;
            private final Icon icon;

            @NotNull
            private final String number;
            private final String subtitle;

            @NotNull
            private final String title;

            public HeaderDTO(@NotNull String title, @NotNull String number, Icon icon, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(number, "number");
                this.title = title;
                this.number = number;
                this.icon = icon;
                this.subtitle = str;
            }

            public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, String str, String str2, Icon icon, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = headerDTO.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = headerDTO.number;
                }
                if ((i11 & 4) != 0) {
                    icon = headerDTO.icon;
                }
                if ((i11 & 8) != 0) {
                    str3 = headerDTO.subtitle;
                }
                return headerDTO.copy(str, str2, icon, str3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            /* renamed from: component3, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            /* renamed from: component4, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final HeaderDTO copy(@NotNull String title, @NotNull String number, Icon icon, String subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(number, "number");
                return new HeaderDTO(title, number, icon, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeaderDTO)) {
                    return false;
                }
                HeaderDTO headerDTO = (HeaderDTO) other;
                return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.number, headerDTO.number) && Intrinsics.d(this.icon, headerDTO.icon) && Intrinsics.d(this.subtitle, headerDTO.subtitle);
            }

            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            public final String getNumber() {
                return this.number;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.number);
                Icon icon = this.icon;
                int hashCode = (a11 + (icon == null ? 0 : icon.hashCode())) * 31;
                String str = this.subtitle;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.number;
                Icon icon = this.icon;
                String str3 = this.subtitle;
                StringBuilder d11 = C3660k.d("HeaderDTO(title=", str, ", number=", str2, ", icon=");
                d11.append(icon);
                d11.append(", subtitle=");
                d11.append(str3);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001bJ`\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000eHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "status", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$StatusDTO;", "content", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "travelBadgesList", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$TravelBadgeDTO;", "debtAlert", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "stars", "", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$StatusDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getStatus", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$StatusDTO;", "getContent", "()Ljava/util/List;", "getTravelBadgesList", "getDebtAlert", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getStars", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$StatusDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;", "equals", "", "other", "hashCode", "toString", "StatusDTO", "TravelBadgeDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SectionDTO {
            public static final int $stable = 8;
            private final List<AtomDTO> content;
            private final DisclaimerAtom debtAlert;
            private final Integer stars;

            @NotNull
            private final StatusDTO status;
            private final String title;
            private final List<TravelBadgeDTO> travelBadgesList;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$StatusDTO;", "", "color", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class StatusDTO {
                public static final int $stable = 0;

                @NotNull
                private final String color;

                @NotNull
                private final String name;

                public StatusDTO(@NotNull String color, @NotNull String name) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    Intrinsics.checkNotNullParameter(name, "name");
                    this.color = color;
                    this.name = name;
                }

                public static /* synthetic */ StatusDTO copy$default(StatusDTO statusDTO, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = statusDTO.color;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = statusDTO.name;
                    }
                    return statusDTO.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getColor() {
                    return this.color;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                @NotNull
                public final StatusDTO copy(@NotNull String color, @NotNull String name) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    Intrinsics.checkNotNullParameter(name, "name");
                    return new StatusDTO(color, name);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof StatusDTO)) {
                        return false;
                    }
                    StatusDTO statusDTO = (StatusDTO) other;
                    return Intrinsics.d(this.color, statusDTO.color) && Intrinsics.d(this.name, statusDTO.name);
                }

                @NotNull
                public final String getColor() {
                    return this.color;
                }

                @NotNull
                public final String getName() {
                    return this.name;
                }

                public int hashCode() {
                    return this.name.hashCode() + (this.color.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("StatusDTO(color=", this.color, ", name=", this.name, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$TravelBadgeDTO;", "", "imageLink", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageLink", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TravelBadgeDTO {
                public static final int $stable = 0;

                @NotNull
                private final String imageLink;

                @NotNull
                private final String text;

                public TravelBadgeDTO(@NotNull String imageLink, @NotNull String text) {
                    Intrinsics.checkNotNullParameter(imageLink, "imageLink");
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.imageLink = imageLink;
                    this.text = text;
                }

                public static /* synthetic */ TravelBadgeDTO copy$default(TravelBadgeDTO travelBadgeDTO, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = travelBadgeDTO.imageLink;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = travelBadgeDTO.text;
                    }
                    return travelBadgeDTO.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getImageLink() {
                    return this.imageLink;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @NotNull
                public final TravelBadgeDTO copy(@NotNull String imageLink, @NotNull String text) {
                    Intrinsics.checkNotNullParameter(imageLink, "imageLink");
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new TravelBadgeDTO(imageLink, text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TravelBadgeDTO)) {
                        return false;
                    }
                    TravelBadgeDTO travelBadgeDTO = (TravelBadgeDTO) other;
                    return Intrinsics.d(this.imageLink, travelBadgeDTO.imageLink) && Intrinsics.d(this.text, travelBadgeDTO.text);
                }

                @NotNull
                public final String getImageLink() {
                    return this.imageLink;
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode() + (this.imageLink.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("TravelBadgeDTO(imageLink=", this.imageLink, ", text=", this.text, ")");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public SectionDTO(String str, @NotNull StatusDTO status, List<? extends AtomDTO> list, List<TravelBadgeDTO> list2, DisclaimerAtom disclaimerAtom, Integer num) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.title = str;
                this.status = status;
                this.content = list;
                this.travelBadgesList = list2;
                this.debtAlert = disclaimerAtom;
                this.stars = num;
            }

            public static /* synthetic */ SectionDTO copy$default(SectionDTO sectionDTO, String str, StatusDTO statusDTO, List list, List list2, DisclaimerAtom disclaimerAtom, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = sectionDTO.title;
                }
                if ((i11 & 2) != 0) {
                    statusDTO = sectionDTO.status;
                }
                if ((i11 & 4) != 0) {
                    list = sectionDTO.content;
                }
                if ((i11 & 8) != 0) {
                    list2 = sectionDTO.travelBadgesList;
                }
                if ((i11 & 16) != 0) {
                    disclaimerAtom = sectionDTO.debtAlert;
                }
                if ((i11 & 32) != 0) {
                    num = sectionDTO.stars;
                }
                DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
                Integer num2 = num;
                return sectionDTO.copy(str, statusDTO, list, list2, disclaimerAtom2, num2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final StatusDTO getStatus() {
                return this.status;
            }

            public final List<AtomDTO> component3() {
                return this.content;
            }

            public final List<TravelBadgeDTO> component4() {
                return this.travelBadgesList;
            }

            /* renamed from: component5, reason: from getter */
            public final DisclaimerAtom getDebtAlert() {
                return this.debtAlert;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getStars() {
                return this.stars;
            }

            @NotNull
            public final SectionDTO copy(String title, @NotNull StatusDTO status, List<? extends AtomDTO> content, List<TravelBadgeDTO> travelBadgesList, DisclaimerAtom debtAlert, Integer stars) {
                Intrinsics.checkNotNullParameter(status, "status");
                return new SectionDTO(title, status, content, travelBadgesList, debtAlert, stars);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionDTO)) {
                    return false;
                }
                SectionDTO sectionDTO = (SectionDTO) other;
                return Intrinsics.d(this.title, sectionDTO.title) && Intrinsics.d(this.status, sectionDTO.status) && Intrinsics.d(this.content, sectionDTO.content) && Intrinsics.d(this.travelBadgesList, sectionDTO.travelBadgesList) && Intrinsics.d(this.debtAlert, sectionDTO.debtAlert) && Intrinsics.d(this.stars, sectionDTO.stars);
            }

            public final List<AtomDTO> getContent() {
                return this.content;
            }

            public final DisclaimerAtom getDebtAlert() {
                return this.debtAlert;
            }

            public final Integer getStars() {
                return this.stars;
            }

            @NotNull
            public final StatusDTO getStatus() {
                return this.status;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<TravelBadgeDTO> getTravelBadgesList() {
                return this.travelBadgesList;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (this.status.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                List<AtomDTO> list = this.content;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                List<TravelBadgeDTO> list2 = this.travelBadgesList;
                int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                DisclaimerAtom disclaimerAtom = this.debtAlert;
                int hashCode4 = (hashCode3 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
                Integer num = this.stars;
                return hashCode4 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                StatusDTO statusDTO = this.status;
                List<AtomDTO> list = this.content;
                List<TravelBadgeDTO> list2 = this.travelBadgesList;
                DisclaimerAtom disclaimerAtom = this.debtAlert;
                Integer num = this.stars;
                StringBuilder sb2 = new StringBuilder("SectionDTO(title=");
                sb2.append(str);
                sb2.append(", status=");
                sb2.append(statusDTO);
                sb2.append(", content=");
                C2616s.g(", travelBadgesList=", ", debtAlert=", sb2, list, list2);
                sb2.append(disclaimerAtom);
                sb2.append(", stars=");
                sb2.append(num);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public OrderItemDTO(@NotNull HeaderDTO header, @NotNull SectionDTO section, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.header = header;
            this.section = section;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ OrderItemDTO copy$default(OrderItemDTO orderItemDTO, HeaderDTO headerDTO, SectionDTO sectionDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                headerDTO = orderItemDTO.header;
            }
            if ((i11 & 2) != 0) {
                sectionDTO = orderItemDTO.section;
            }
            if ((i11 & 4) != 0) {
                str = orderItemDTO.deeplink;
            }
            return orderItemDTO.copy(headerDTO, sectionDTO, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final HeaderDTO getHeader() {
            return this.header;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SectionDTO getSection() {
            return this.section;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final OrderItemDTO copy(@NotNull HeaderDTO header, @NotNull SectionDTO section, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new OrderItemDTO(header, section, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderItemDTO)) {
                return false;
            }
            OrderItemDTO orderItemDTO = (OrderItemDTO) other;
            return Intrinsics.d(this.header, orderItemDTO.header) && Intrinsics.d(this.section, orderItemDTO.section) && Intrinsics.d(this.deeplink, orderItemDTO.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final HeaderDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final SectionDTO getSection() {
            return this.section;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + ((this.section.hashCode() + (this.header.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            HeaderDTO headerDTO = this.header;
            SectionDTO sectionDTO = this.section;
            String str = this.deeplink;
            StringBuilder sb2 = new StringBuilder("OrderItemDTO(header=");
            sb2.append(headerDTO);
            sb2.append(", section=");
            sb2.append(sectionDTO);
            sb2.append(", deeplink=");
            return o0.c(sb2, str, ")");
        }
    }

    public TravelOrderListMobileDTO(@NotNull List<OrderItemDTO> orders, Integer num, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.orders = orders;
        this.timerTimeLeft = num;
        this.timerAction = atomActionDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelOrderListMobileDTO copy$default(TravelOrderListMobileDTO travelOrderListMobileDTO, List list, Integer num, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelOrderListMobileDTO.orders;
        }
        if ((i11 & 2) != 0) {
            num = travelOrderListMobileDTO.timerTimeLeft;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = travelOrderListMobileDTO.timerAction;
        }
        return travelOrderListMobileDTO.copy(list, num, atomActionDTO);
    }

    @NotNull
    public final List<OrderItemDTO> component1() {
        return this.orders;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTimerTimeLeft() {
        return this.timerTimeLeft;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getTimerAction() {
        return this.timerAction;
    }

    @NotNull
    public final TravelOrderListMobileDTO copy(@NotNull List<OrderItemDTO> orders, Integer timerTimeLeft, AtomActionDTO timerAction) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new TravelOrderListMobileDTO(orders, timerTimeLeft, timerAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelOrderListMobileDTO)) {
            return false;
        }
        TravelOrderListMobileDTO travelOrderListMobileDTO = (TravelOrderListMobileDTO) other;
        return Intrinsics.d(this.orders, travelOrderListMobileDTO.orders) && Intrinsics.d(this.timerTimeLeft, travelOrderListMobileDTO.timerTimeLeft) && Intrinsics.d(this.timerAction, travelOrderListMobileDTO.timerAction);
    }

    @NotNull
    public final List<OrderItemDTO> getOrders() {
        return this.orders;
    }

    public final AtomActionDTO getTimerAction() {
        return this.timerAction;
    }

    public final Integer getTimerTimeLeft() {
        return this.timerTimeLeft;
    }

    public int hashCode() {
        int hashCode = this.orders.hashCode() * 31;
        Integer num = this.timerTimeLeft;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.timerAction;
        return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<OrderItemDTO> list = this.orders;
        Integer num = this.timerTimeLeft;
        AtomActionDTO atomActionDTO = this.timerAction;
        StringBuilder sb2 = new StringBuilder("TravelOrderListMobileDTO(orders=");
        sb2.append(list);
        sb2.append(", timerTimeLeft=");
        sb2.append(num);
        sb2.append(", timerAction=");
        return G.c(sb2, atomActionDTO, ")");
    }
}
