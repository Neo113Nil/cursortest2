package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.calendar.CalendarDTO;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001,BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\\\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO;", "", "calendar", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;", "tripKind", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "selectionMode", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO$SelectionMode;", "oneClickDateAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "shouldUpdateAfterSelect", "", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO$SelectionMode;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;)V", "getCalendar", "()Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;", "getTripKind", "()Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "getSelectionMode", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO$SelectionMode;", "getOneClickDateAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getShouldUpdateAfterSelect", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO$SelectionMode;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO;", "equals", "other", "hashCode", "", "toString", "SelectionMode", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPriceCalendarV3DTO {
    public static final int $stable = 8;

    @NotNull
    private final CalendarDTO calendar;
    private final AtomActionDTO oneClickDateAction;

    @NotNull
    private final SelectionMode selectionMode;
    private final Boolean shouldUpdateAfterSelect;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final TripKind tripKind;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO$SelectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_DAY", "DAYS_RANGE", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SelectionMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SelectionMode[] $VALUES;
        public static final SelectionMode SINGLE_DAY = new SelectionMode("SINGLE_DAY", 0);
        public static final SelectionMode DAYS_RANGE = new SelectionMode("DAYS_RANGE", 1);

        private static final /* synthetic */ SelectionMode[] $values() {
            return new SelectionMode[]{SINGLE_DAY, DAYS_RANGE};
        }

        static {
            SelectionMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SelectionMode(String str, int i11) {
        }

        public static SelectionMode valueOf(String str) {
            return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
        }

        public static SelectionMode[] values() {
            return (SelectionMode[]) $VALUES.clone();
        }
    }

    public TravelPriceCalendarV3DTO(@NotNull CalendarDTO calendar, @NotNull TripKind tripKind, @NotNull SelectionMode selectionMode, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Boolean bool) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        this.calendar = calendar;
        this.tripKind = tripKind;
        this.selectionMode = selectionMode;
        this.oneClickDateAction = atomActionDTO;
        this.trackingInfo = map;
        this.shouldUpdateAfterSelect = bool;
    }

    public static /* synthetic */ TravelPriceCalendarV3DTO copy$default(TravelPriceCalendarV3DTO travelPriceCalendarV3DTO, CalendarDTO calendarDTO, TripKind tripKind, SelectionMode selectionMode, AtomActionDTO atomActionDTO, Map map, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            calendarDTO = travelPriceCalendarV3DTO.calendar;
        }
        if ((i11 & 2) != 0) {
            tripKind = travelPriceCalendarV3DTO.tripKind;
        }
        if ((i11 & 4) != 0) {
            selectionMode = travelPriceCalendarV3DTO.selectionMode;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = travelPriceCalendarV3DTO.oneClickDateAction;
        }
        if ((i11 & 16) != 0) {
            map = travelPriceCalendarV3DTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            bool = travelPriceCalendarV3DTO.shouldUpdateAfterSelect;
        }
        Map map2 = map;
        Boolean bool2 = bool;
        return travelPriceCalendarV3DTO.copy(calendarDTO, tripKind, selectionMode, atomActionDTO, map2, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CalendarDTO getCalendar() {
        return this.calendar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TripKind getTripKind() {
        return this.tripKind;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getOneClickDateAction() {
        return this.oneClickDateAction;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getShouldUpdateAfterSelect() {
        return this.shouldUpdateAfterSelect;
    }

    @NotNull
    public final TravelPriceCalendarV3DTO copy(@NotNull CalendarDTO calendar, @NotNull TripKind tripKind, @NotNull SelectionMode selectionMode, AtomActionDTO oneClickDateAction, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean shouldUpdateAfterSelect) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        return new TravelPriceCalendarV3DTO(calendar, tripKind, selectionMode, oneClickDateAction, trackingInfo, shouldUpdateAfterSelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPriceCalendarV3DTO)) {
            return false;
        }
        TravelPriceCalendarV3DTO travelPriceCalendarV3DTO = (TravelPriceCalendarV3DTO) other;
        return Intrinsics.d(this.calendar, travelPriceCalendarV3DTO.calendar) && this.tripKind == travelPriceCalendarV3DTO.tripKind && this.selectionMode == travelPriceCalendarV3DTO.selectionMode && Intrinsics.d(this.oneClickDateAction, travelPriceCalendarV3DTO.oneClickDateAction) && Intrinsics.d(this.trackingInfo, travelPriceCalendarV3DTO.trackingInfo) && Intrinsics.d(this.shouldUpdateAfterSelect, travelPriceCalendarV3DTO.shouldUpdateAfterSelect);
    }

    @NotNull
    public final CalendarDTO getCalendar() {
        return this.calendar;
    }

    public final AtomActionDTO getOneClickDateAction() {
        return this.oneClickDateAction;
    }

    @NotNull
    public final SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    public final Boolean getShouldUpdateAfterSelect() {
        return this.shouldUpdateAfterSelect;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final TripKind getTripKind() {
        return this.tripKind;
    }

    public int hashCode() {
        int hashCode = (this.selectionMode.hashCode() + ((this.tripKind.hashCode() + (this.calendar.hashCode() * 31)) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.oneClickDateAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.shouldUpdateAfterSelect;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelPriceCalendarV3DTO(calendar=" + this.calendar + ", tripKind=" + this.tripKind + ", selectionMode=" + this.selectionMode + ", oneClickDateAction=" + this.oneClickDateAction + ", trackingInfo=" + this.trackingInfo + ", shouldUpdateAfterSelect=" + this.shouldUpdateAfterSelect + ")";
    }
}
