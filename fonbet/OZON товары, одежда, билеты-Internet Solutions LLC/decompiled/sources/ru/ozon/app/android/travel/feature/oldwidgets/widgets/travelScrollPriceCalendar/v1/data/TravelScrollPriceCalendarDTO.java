package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data;

import HY.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO;", "", "dateTabs", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO$DateTabDTO;", "loadingAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getDateTabs", "()Ljava/util/List;", "getLoadingAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "DateTabDTO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarDTO {

    @NotNull
    private final List<DateTabDTO> dateTabs;
    private final AtomActionDTO loadingAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jl\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\b\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO$DateTabDTO;", "", "date", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "borderColor", "", "backgroundColor", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDate", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO$DateTabDTO;", "equals", "other", "hashCode", "", "toString", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTabDTO {
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final String borderColor;

        @NotNull
        private final TextAtom date;
        private final Boolean isSelected;
        private final TextAtom price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public DateTabDTO(@NotNull TextAtom date, TextAtom textAtom, String str, String str2, Boolean bool, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
            this.price = textAtom;
            this.borderColor = str;
            this.backgroundColor = str2;
            this.isSelected = bool;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ DateTabDTO copy$default(DateTabDTO dateTabDTO, TextAtom textAtom, TextAtom textAtom2, String str, String str2, Boolean bool, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = dateTabDTO.date;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = dateTabDTO.price;
            }
            if ((i11 & 4) != 0) {
                str = dateTabDTO.borderColor;
            }
            if ((i11 & 8) != 0) {
                str2 = dateTabDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                bool = dateTabDTO.isSelected;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = dateTabDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = dateTabDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            Boolean bool2 = bool;
            String str3 = str;
            return dateTabDTO.copy(textAtom, textAtom2, str3, str2, bool2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final DateTabDTO copy(@NotNull TextAtom date, TextAtom price, String borderColor, String backgroundColor, Boolean isSelected, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new DateTabDTO(date, price, borderColor, backgroundColor, isSelected, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTabDTO)) {
                return false;
            }
            DateTabDTO dateTabDTO = (DateTabDTO) other;
            return Intrinsics.d(this.date, dateTabDTO.date) && Intrinsics.d(this.price, dateTabDTO.price) && Intrinsics.d(this.borderColor, dateTabDTO.borderColor) && Intrinsics.d(this.backgroundColor, dateTabDTO.backgroundColor) && Intrinsics.d(this.isSelected, dateTabDTO.isSelected) && Intrinsics.d(this.action, dateTabDTO.action) && Intrinsics.d(this.trackingInfo, dateTabDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final TextAtom getDate() {
            return this.date;
        }

        public final TextAtom getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.date.hashCode() * 31;
            TextAtom textAtom = this.price;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            String str = this.borderColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isSelected;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.date;
            TextAtom textAtom2 = this.price;
            String str = this.borderColor;
            String str2 = this.backgroundColor;
            Boolean bool = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = a.a("DateTabDTO(date=", textAtom, ", price=", textAtom2, ", borderColor=");
            Nh.a.h(a11, str, ", backgroundColor=", str2, ", isSelected=");
            a11.append(bool);
            a11.append(", action=");
            a11.append(atomActionDTO);
            a11.append(", trackingInfo=");
            return P.f(a11, map, ")");
        }
    }

    public TravelScrollPriceCalendarDTO(@NotNull List<DateTabDTO> dateTabs, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
        this.dateTabs = dateTabs;
        this.loadingAction = atomActionDTO;
    }

    @NotNull
    public final List<DateTabDTO> getDateTabs() {
        return this.dateTabs;
    }

    public final AtomActionDTO getLoadingAction() {
        return this.loadingAction;
    }
}
