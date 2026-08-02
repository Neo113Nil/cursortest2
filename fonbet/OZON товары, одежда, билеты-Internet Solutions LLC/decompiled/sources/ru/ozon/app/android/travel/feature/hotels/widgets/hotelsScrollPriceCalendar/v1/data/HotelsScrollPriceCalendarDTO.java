package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.data;

import D3.g;
import K1.G;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "datePrices", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO$DatePriceItem;", "autoScrollIndex", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDatePrices", "()Ljava/util/List;", "getAutoScrollIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO;", "equals", "", "other", "hashCode", "toString", "DatePriceItem", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsScrollPriceCalendarDTO {
    public static final int $stable = 8;
    private final Integer autoScrollIndex;
    private final List<DatePriceItem> datePrices;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO$DatePriceItem;", "", "weekdaysInterval", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dateInterval", "price", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getWeekdaysInterval", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDateInterval", "getPrice", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DatePriceItem {
        public static final int $stable = 0;
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO dateInterval;

        @NotNull
        private final TextDTO price;

        @NotNull
        private final TextDTO weekdaysInterval;

        public DatePriceItem(@NotNull TextDTO weekdaysInterval, @NotNull TextDTO dateInterval, @NotNull TextDTO price, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(weekdaysInterval, "weekdaysInterval");
            Intrinsics.checkNotNullParameter(dateInterval, "dateInterval");
            Intrinsics.checkNotNullParameter(price, "price");
            this.weekdaysInterval = weekdaysInterval;
            this.dateInterval = dateInterval;
            this.price = price;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ DatePriceItem copy$default(DatePriceItem datePriceItem, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = datePriceItem.weekdaysInterval;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = datePriceItem.dateInterval;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = datePriceItem.price;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = datePriceItem.common;
            }
            return datePriceItem.copy(textDTO, textDTO2, textDTO3, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getWeekdaysInterval() {
            return this.weekdaysInterval;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getDateInterval() {
            return this.dateInterval;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final DatePriceItem copy(@NotNull TextDTO weekdaysInterval, @NotNull TextDTO dateInterval, @NotNull TextDTO price, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(weekdaysInterval, "weekdaysInterval");
            Intrinsics.checkNotNullParameter(dateInterval, "dateInterval");
            Intrinsics.checkNotNullParameter(price, "price");
            return new DatePriceItem(weekdaysInterval, dateInterval, price, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatePriceItem)) {
                return false;
            }
            DatePriceItem datePriceItem = (DatePriceItem) other;
            return Intrinsics.d(this.weekdaysInterval, datePriceItem.weekdaysInterval) && Intrinsics.d(this.dateInterval, datePriceItem.dateInterval) && Intrinsics.d(this.price, datePriceItem.price) && Intrinsics.d(this.common, datePriceItem.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getDateInterval() {
            return this.dateInterval;
        }

        @NotNull
        public final TextDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getWeekdaysInterval() {
            return this.weekdaysInterval;
        }

        public int hashCode() {
            int a11 = b.a(this.price, b.a(this.dateInterval, this.weekdaysInterval.hashCode() * 31, 31), 31);
            CommonControlSettings commonControlSettings = this.common;
            return a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.weekdaysInterval;
            TextDTO textDTO2 = this.dateInterval;
            TextDTO textDTO3 = this.price;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = g.g("DatePriceItem(weekdaysInterval=", textDTO, ", dateInterval=", textDTO2, ", price=");
            g10.append(textDTO3);
            g10.append(", common=");
            g10.append(commonControlSettings);
            g10.append(")");
            return g10.toString();
        }
    }

    public HotelsScrollPriceCalendarDTO(TextDTO textDTO, List<DatePriceItem> list, Integer num, Map<String, TokenizedTrackingInfo> map) {
        this.title = textDTO;
        this.datePrices = list;
        this.autoScrollIndex = num;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsScrollPriceCalendarDTO copy$default(HotelsScrollPriceCalendarDTO hotelsScrollPriceCalendarDTO, TextDTO textDTO, List list, Integer num, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = hotelsScrollPriceCalendarDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = hotelsScrollPriceCalendarDTO.datePrices;
        }
        if ((i11 & 4) != 0) {
            num = hotelsScrollPriceCalendarDTO.autoScrollIndex;
        }
        if ((i11 & 8) != 0) {
            map = hotelsScrollPriceCalendarDTO.trackingInfo;
        }
        return hotelsScrollPriceCalendarDTO.copy(textDTO, list, num, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<DatePriceItem> component2() {
        return this.datePrices;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getAutoScrollIndex() {
        return this.autoScrollIndex;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsScrollPriceCalendarDTO copy(TextDTO title, List<DatePriceItem> datePrices, Integer autoScrollIndex, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new HotelsScrollPriceCalendarDTO(title, datePrices, autoScrollIndex, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsScrollPriceCalendarDTO)) {
            return false;
        }
        HotelsScrollPriceCalendarDTO hotelsScrollPriceCalendarDTO = (HotelsScrollPriceCalendarDTO) other;
        return Intrinsics.d(this.title, hotelsScrollPriceCalendarDTO.title) && Intrinsics.d(this.datePrices, hotelsScrollPriceCalendarDTO.datePrices) && Intrinsics.d(this.autoScrollIndex, hotelsScrollPriceCalendarDTO.autoScrollIndex) && Intrinsics.d(this.trackingInfo, hotelsScrollPriceCalendarDTO.trackingInfo);
    }

    public final Integer getAutoScrollIndex() {
        return this.autoScrollIndex;
    }

    public final List<DatePriceItem> getDatePrices() {
        return this.datePrices;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        List<DatePriceItem> list = this.datePrices;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.autoScrollIndex;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<DatePriceItem> list = this.datePrices;
        Integer num = this.autoScrollIndex;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("HotelsScrollPriceCalendarDTO(title=", textDTO, ", datePrices=", list, ", autoScrollIndex=");
        e11.append(num);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }
}
