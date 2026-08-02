package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data;

import G.g;
import Kk.C3532b;
import T7.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001b\u001cBM\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;", "", "dateTabs", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$DateTabDTO;", "asyncBehaviorType", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$AsyncBehaviorType;", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "hasBackground", "", "tabSettings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$AsyncBehaviorType;Ljava/util/Map;ZLru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;)V", "getDateTabs", "()Ljava/util/List;", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$AsyncBehaviorType;", "getViewTracking", "()Ljava/util/Map;", "getHasBackground", "()Z", "getTabSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "DateTabDTO", "AsyncBehaviorType", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarV2DTO {

    @EnumNullFallback
    @NotNull
    private final AsyncBehaviorType asyncBehaviorType;

    @NotNull
    private final List<DateTabDTO> dateTabs;
    private final boolean hasBackground;
    private final TravelWidgetSettingsDTO tabSettings;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "FETCH_STATE", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "FETCH_STATE")
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 1);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, FETCH_STATE};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    public TravelScrollPriceCalendarV2DTO(@NotNull List<DateTabDTO> dateTabs, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, TokenizedTrackingInfo> map, boolean z11, TravelWidgetSettingsDTO travelWidgetSettingsDTO) {
        Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        this.dateTabs = dateTabs;
        this.asyncBehaviorType = asyncBehaviorType;
        this.viewTracking = map;
        this.hasBackground = z11;
        this.tabSettings = travelWidgetSettingsDTO;
    }

    @NotNull
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    @NotNull
    public final List<DateTabDTO> getDateTabs() {
        return this.dateTabs;
    }

    public final boolean getHasBackground() {
        return this.hasBackground;
    }

    public final TravelWidgetSettingsDTO getTabSettings() {
        return this.tabSettings;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public TravelScrollPriceCalendarV2DTO(List list, AsyncBehaviorType asyncBehaviorType, Map map, boolean z11, TravelWidgetSettingsDTO travelWidgetSettingsDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? AsyncBehaviorType.NO_ACTION : asyncBehaviorType, map, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : travelWidgetSettingsDTO);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$DateTabDTO;", "", "date", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "rightPriceIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "borderColor", "", "isSelected", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "getRightPriceIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBorderColor", "()Ljava/lang/String;", "()Z", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTabDTO {

        @NotNull
        private final String borderColor;

        @NotNull
        private final AtomActionDTO clickAction;

        @NotNull
        private final TextDTO date;
        private final boolean isSelected;
        private final TextDTO price;
        private final IconDTO rightPriceIcon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public DateTabDTO(@NotNull TextDTO date, TextDTO textDTO, IconDTO iconDTO, @NotNull String borderColor, boolean z11, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            this.date = date;
            this.price = textDTO;
            this.rightPriceIcon = iconDTO;
            this.borderColor = borderColor;
            this.isSelected = z11;
            this.clickAction = clickAction;
            this.trackingInfo = map;
        }

        public static /* synthetic */ DateTabDTO copy$default(DateTabDTO dateTabDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, String str, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = dateTabDTO.date;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = dateTabDTO.price;
            }
            if ((i11 & 4) != 0) {
                iconDTO = dateTabDTO.rightPriceIcon;
            }
            if ((i11 & 8) != 0) {
                str = dateTabDTO.borderColor;
            }
            if ((i11 & 16) != 0) {
                z11 = dateTabDTO.isSelected;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = dateTabDTO.clickAction;
            }
            if ((i11 & 64) != 0) {
                map = dateTabDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            boolean z12 = z11;
            IconDTO iconDTO2 = iconDTO;
            return dateTabDTO.copy(textDTO, textDTO2, iconDTO2, str, z12, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getRightPriceIcon() {
            return this.rightPriceIcon;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final DateTabDTO copy(@NotNull TextDTO date, TextDTO price, IconDTO rightPriceIcon, @NotNull String borderColor, boolean isSelected, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            return new DateTabDTO(date, price, rightPriceIcon, borderColor, isSelected, clickAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTabDTO)) {
                return false;
            }
            DateTabDTO dateTabDTO = (DateTabDTO) other;
            return Intrinsics.d(this.date, dateTabDTO.date) && Intrinsics.d(this.price, dateTabDTO.price) && Intrinsics.d(this.rightPriceIcon, dateTabDTO.rightPriceIcon) && Intrinsics.d(this.borderColor, dateTabDTO.borderColor) && this.isSelected == dateTabDTO.isSelected && Intrinsics.d(this.clickAction, dateTabDTO.clickAction) && Intrinsics.d(this.trackingInfo, dateTabDTO.trackingInfo);
        }

        @NotNull
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        public final TextDTO getPrice() {
            return this.price;
        }

        public final IconDTO getRightPriceIcon() {
            return this.rightPriceIcon;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.date.hashCode() * 31;
            TextDTO textDTO = this.price;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.rightPriceIcon;
            int b11 = Ih.a.b(this.clickAction, C3532b.a(g.a((hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.borderColor), 31, this.isSelected), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.date;
            TextDTO textDTO2 = this.price;
            IconDTO iconDTO = this.rightPriceIcon;
            String str = this.borderColor;
            boolean z11 = this.isSelected;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = D3.g.g("DateTabDTO(date=", textDTO, ", price=", textDTO2, ", rightPriceIcon=");
            g10.append(iconDTO);
            g10.append(", borderColor=");
            g10.append(str);
            g10.append(", isSelected=");
            g10.append(z11);
            g10.append(", clickAction=");
            g10.append(atomActionDTO);
            g10.append(", trackingInfo=");
            return P.f(g10, map, ")");
        }

        public /* synthetic */ DateTabDTO(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, String str, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, iconDTO, (i11 & 8) != 0 ? UniColors.GRAPHIC_NEUTRAL.getToken() : str, (i11 & 16) != 0 ? false : z11, atomActionDTO, map);
        }
    }
}
