package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.data;

import B4.V;
import B90.C2618u;
import D3.g;
import K1.G;
import Kk.C3532b;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010 \u001a\u00020\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003Jr\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "datePrices", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;", "autoScrollIndex", "", "isUpdateRequired", "", "asyncParameters", "", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/Map;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDatePrices", "()Ljava/util/List;", "getAutoScrollIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getAsyncParameters", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO;", "equals", "other", "hashCode", "toString", "DatePriceItem", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsScrollPriceCalendarV2DTO {
    public static final int $stable = 8;
    private final Map<String, Object> asyncParameters;
    private final Integer autoScrollIndex;
    private final List<DatePriceItem> datePrices;
    private final boolean isUpdateRequired;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;", "", "weekdaysInterval", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dateInterval", "price", "isLoading", "", "background", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getWeekdaysInterval", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDateInterval", "getPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackground", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;", "equals", "other", "hashCode", "", "toString", "", "Background", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class DatePriceItem {
        public static final int $stable = 0;

        @NotNull
        private final Background background;
        private final BadgeDTO badge;
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO dateInterval;
        private final Boolean isLoading;
        private final TextDTO price;

        @NotNull
        private final TextDTO weekdaysInterval;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "stroke", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background$Stroke;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background$Stroke;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getStroke", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background$Stroke;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Stroke", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Background {
            public static final int $stable = 0;

            @NotNull
            private final String backgroundColor;
            private final CornerRadius cornerRadius;
            private final Stroke stroke;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background$Stroke;", "", "color", "", "width", "", "<init>", "(Ljava/lang/String;I)V", "getColor", "()Ljava/lang/String;", "getWidth", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Stroke {
                public static final int $stable = 0;

                @NotNull
                private final String color;
                private final int width;

                public Stroke(@NotNull String color, int i11) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    this.color = color;
                    this.width = i11;
                }

                public static /* synthetic */ Stroke copy$default(Stroke stroke, String str, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = stroke.color;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = stroke.width;
                    }
                    return stroke.copy(str, i11);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getColor() {
                    return this.color;
                }

                /* renamed from: component2, reason: from getter */
                public final int getWidth() {
                    return this.width;
                }

                @NotNull
                public final Stroke copy(@NotNull String color, int width) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    return new Stroke(color, width);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Stroke)) {
                        return false;
                    }
                    Stroke stroke = (Stroke) other;
                    return Intrinsics.d(this.color, stroke.color) && this.width == stroke.width;
                }

                @NotNull
                public final String getColor() {
                    return this.color;
                }

                public final int getWidth() {
                    return this.width;
                }

                public int hashCode() {
                    return Integer.hashCode(this.width) + (this.color.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return C2618u.f(this.width, "Stroke(color=", this.color, ", width=", ")");
                }
            }

            public Background(@NotNull String backgroundColor, CornerRadius cornerRadius, Stroke stroke) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.backgroundColor = backgroundColor;
                this.cornerRadius = cornerRadius;
                this.stroke = stroke;
            }

            public static /* synthetic */ Background copy$default(Background background, String str, CornerRadius cornerRadius, Stroke stroke, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = background.backgroundColor;
                }
                if ((i11 & 2) != 0) {
                    cornerRadius = background.cornerRadius;
                }
                if ((i11 & 4) != 0) {
                    stroke = background.stroke;
                }
                return background.copy(str, cornerRadius, stroke);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            /* renamed from: component3, reason: from getter */
            public final Stroke getStroke() {
                return this.stroke;
            }

            @NotNull
            public final Background copy(@NotNull String backgroundColor, CornerRadius cornerRadius, Stroke stroke) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                return new Background(backgroundColor, cornerRadius, stroke);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Background)) {
                    return false;
                }
                Background background = (Background) other;
                return Intrinsics.d(this.backgroundColor, background.backgroundColor) && this.cornerRadius == background.cornerRadius && Intrinsics.d(this.stroke, background.stroke);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final Stroke getStroke() {
                return this.stroke;
            }

            public int hashCode() {
                int hashCode = this.backgroundColor.hashCode() * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
                Stroke stroke = this.stroke;
                return hashCode2 + (stroke != null ? stroke.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Background(backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", stroke=" + this.stroke + ")";
            }
        }

        public DatePriceItem(@NotNull TextDTO weekdaysInterval, @NotNull TextDTO dateInterval, TextDTO textDTO, Boolean bool, @NotNull Background background, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(weekdaysInterval, "weekdaysInterval");
            Intrinsics.checkNotNullParameter(dateInterval, "dateInterval");
            Intrinsics.checkNotNullParameter(background, "background");
            this.weekdaysInterval = weekdaysInterval;
            this.dateInterval = dateInterval;
            this.price = textDTO;
            this.isLoading = bool;
            this.background = background;
            this.badge = badgeDTO;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ DatePriceItem copy$default(DatePriceItem datePriceItem, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, Boolean bool, Background background, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
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
                bool = datePriceItem.isLoading;
            }
            if ((i11 & 16) != 0) {
                background = datePriceItem.background;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = datePriceItem.badge;
            }
            if ((i11 & 64) != 0) {
                commonControlSettings = datePriceItem.common;
            }
            BadgeDTO badgeDTO2 = badgeDTO;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Background background2 = background;
            TextDTO textDTO4 = textDTO3;
            return datePriceItem.copy(textDTO, textDTO2, textDTO4, bool, background2, badgeDTO2, commonControlSettings2);
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

        /* renamed from: component3, reason: from getter */
        public final TextDTO getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Background getBackground() {
            return this.background;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component7, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final DatePriceItem copy(@NotNull TextDTO weekdaysInterval, @NotNull TextDTO dateInterval, TextDTO price, Boolean isLoading, @NotNull Background background, BadgeDTO badge, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(weekdaysInterval, "weekdaysInterval");
            Intrinsics.checkNotNullParameter(dateInterval, "dateInterval");
            Intrinsics.checkNotNullParameter(background, "background");
            return new DatePriceItem(weekdaysInterval, dateInterval, price, isLoading, background, badge, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatePriceItem)) {
                return false;
            }
            DatePriceItem datePriceItem = (DatePriceItem) other;
            return Intrinsics.d(this.weekdaysInterval, datePriceItem.weekdaysInterval) && Intrinsics.d(this.dateInterval, datePriceItem.dateInterval) && Intrinsics.d(this.price, datePriceItem.price) && Intrinsics.d(this.isLoading, datePriceItem.isLoading) && Intrinsics.d(this.background, datePriceItem.background) && Intrinsics.d(this.badge, datePriceItem.badge) && Intrinsics.d(this.common, datePriceItem.common);
        }

        @NotNull
        public final Background getBackground() {
            return this.background;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getDateInterval() {
            return this.dateInterval;
        }

        public final TextDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getWeekdaysInterval() {
            return this.weekdaysInterval;
        }

        public int hashCode() {
            int a11 = b.a(this.dateInterval, this.weekdaysInterval.hashCode() * 31, 31);
            TextDTO textDTO = this.price;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Boolean bool = this.isLoading;
            int hashCode2 = (this.background.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        public final Boolean isLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.weekdaysInterval;
            TextDTO textDTO2 = this.dateInterval;
            TextDTO textDTO3 = this.price;
            Boolean bool = this.isLoading;
            Background background = this.background;
            BadgeDTO badgeDTO = this.badge;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = g.g("DatePriceItem(weekdaysInterval=", textDTO, ", dateInterval=", textDTO2, ", price=");
            g10.append(textDTO3);
            g10.append(", isLoading=");
            g10.append(bool);
            g10.append(", background=");
            g10.append(background);
            g10.append(", badge=");
            g10.append(badgeDTO);
            g10.append(", common=");
            return Ak.b.g(g10, commonControlSettings, ")");
        }
    }

    public HotelsScrollPriceCalendarV2DTO(TextDTO textDTO, List<DatePriceItem> list, Integer num, boolean z11, Map<String, ? extends Object> map, Map<String, TokenizedTrackingInfo> map2) {
        this.title = textDTO;
        this.datePrices = list;
        this.autoScrollIndex = num;
        this.isUpdateRequired = z11;
        this.asyncParameters = map;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ HotelsScrollPriceCalendarV2DTO copy$default(HotelsScrollPriceCalendarV2DTO hotelsScrollPriceCalendarV2DTO, TextDTO textDTO, List list, Integer num, boolean z11, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = hotelsScrollPriceCalendarV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            list = hotelsScrollPriceCalendarV2DTO.datePrices;
        }
        if ((i11 & 4) != 0) {
            num = hotelsScrollPriceCalendarV2DTO.autoScrollIndex;
        }
        if ((i11 & 8) != 0) {
            z11 = hotelsScrollPriceCalendarV2DTO.isUpdateRequired;
        }
        if ((i11 & 16) != 0) {
            map = hotelsScrollPriceCalendarV2DTO.asyncParameters;
        }
        if ((i11 & 32) != 0) {
            map2 = hotelsScrollPriceCalendarV2DTO.trackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        return hotelsScrollPriceCalendarV2DTO.copy(textDTO, list, num, z11, map3, map4);
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

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUpdateRequired() {
        return this.isUpdateRequired;
    }

    public final Map<String, Object> component5() {
        return this.asyncParameters;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsScrollPriceCalendarV2DTO copy(TextDTO title, List<DatePriceItem> datePrices, Integer autoScrollIndex, boolean isUpdateRequired, Map<String, ? extends Object> asyncParameters, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new HotelsScrollPriceCalendarV2DTO(title, datePrices, autoScrollIndex, isUpdateRequired, asyncParameters, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsScrollPriceCalendarV2DTO)) {
            return false;
        }
        HotelsScrollPriceCalendarV2DTO hotelsScrollPriceCalendarV2DTO = (HotelsScrollPriceCalendarV2DTO) other;
        return Intrinsics.d(this.title, hotelsScrollPriceCalendarV2DTO.title) && Intrinsics.d(this.datePrices, hotelsScrollPriceCalendarV2DTO.datePrices) && Intrinsics.d(this.autoScrollIndex, hotelsScrollPriceCalendarV2DTO.autoScrollIndex) && this.isUpdateRequired == hotelsScrollPriceCalendarV2DTO.isUpdateRequired && Intrinsics.d(this.asyncParameters, hotelsScrollPriceCalendarV2DTO.asyncParameters) && Intrinsics.d(this.trackingInfo, hotelsScrollPriceCalendarV2DTO.trackingInfo);
    }

    public final Map<String, Object> getAsyncParameters() {
        return this.asyncParameters;
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
        int a11 = C3532b.a((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isUpdateRequired);
        Map<String, Object> map = this.asyncParameters;
        int hashCode3 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isUpdateRequired() {
        return this.isUpdateRequired;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<DatePriceItem> list = this.datePrices;
        Integer num = this.autoScrollIndex;
        boolean z11 = this.isUpdateRequired;
        Map<String, Object> map = this.asyncParameters;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        StringBuilder e11 = G.e("HotelsScrollPriceCalendarV2DTO(title=", textDTO, ", datePrices=", list, ", autoScrollIndex=");
        e11.append(num);
        e11.append(", isUpdateRequired=");
        e11.append(z11);
        e11.append(", asyncParameters=");
        return V.c(e11, map, ", trackingInfo=", map2, ")");
    }

    public /* synthetic */ HotelsScrollPriceCalendarV2DTO(TextDTO textDTO, List list, Integer num, boolean z11, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, list, num, (i11 & 8) != 0 ? false : z11, map, map2);
    }
}
