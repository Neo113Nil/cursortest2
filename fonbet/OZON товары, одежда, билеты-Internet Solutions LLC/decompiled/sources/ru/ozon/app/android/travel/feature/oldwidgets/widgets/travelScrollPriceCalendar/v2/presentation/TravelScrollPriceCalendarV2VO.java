package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation;

import Ak.C2436a;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Ns.b;
import TY.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "state", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "getState", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "State", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelScrollPriceCalendarV2VO implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR \u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getViewTracking", "()Ljava/util/Map;", "Loading", "Content", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Content;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Loading;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B=\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Content;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTracking", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Content$DateTabVO;", "dateTabs", "", "selectedItemPosition", "", "hasBackground", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getViewTracking", "()Ljava/util/Map;", "Ljava/util/List;", "getDateTabs", "()Ljava/util/List;", "Ljava/lang/Integer;", "getSelectedItemPosition", "()Ljava/lang/Integer;", "Z", "getHasBackground", "()Z", "DateTabVO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Content implements State {

            @NotNull
            private final List<DateTabVO> dateTabs;
            private final boolean hasBackground;
            private final Integer selectedItemPosition;
            private final Map<String, TokenizedTrackingInfo> viewTracking;

            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\f\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Content$DateTabVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "price", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightPriceIcon", "", "borderColor", "", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "tabSettings", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightPriceIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getBorderColor", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getTabSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class DateTabVO {

                @NotNull
                private final String borderColor;
                private final AtomAction clickAction;

                @NotNull
                private final TextDTO date;
                private final long id;
                private final boolean isSelected;
                private final TextDTO price;
                private final IconDTO rightPriceIcon;

                @NotNull
                private final TravelWidgetSettingsVO tabSettings;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public DateTabVO(long j11, @NotNull TextDTO date, TextDTO textDTO, IconDTO iconDTO, @NotNull String borderColor, boolean z11, AtomAction atomAction, @NotNull TravelWidgetSettingsVO tabSettings, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(date, "date");
                    Intrinsics.checkNotNullParameter(borderColor, "borderColor");
                    Intrinsics.checkNotNullParameter(tabSettings, "tabSettings");
                    this.id = j11;
                    this.date = date;
                    this.price = textDTO;
                    this.rightPriceIcon = iconDTO;
                    this.borderColor = borderColor;
                    this.isSelected = z11;
                    this.clickAction = atomAction;
                    this.tabSettings = tabSettings;
                    this.trackingInfo = map;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DateTabVO)) {
                        return false;
                    }
                    DateTabVO dateTabVO = (DateTabVO) other;
                    return this.id == dateTabVO.id && Intrinsics.d(this.date, dateTabVO.date) && Intrinsics.d(this.price, dateTabVO.price) && Intrinsics.d(this.rightPriceIcon, dateTabVO.rightPriceIcon) && Intrinsics.d(this.borderColor, dateTabVO.borderColor) && this.isSelected == dateTabVO.isSelected && Intrinsics.d(this.clickAction, dateTabVO.clickAction) && Intrinsics.d(this.tabSettings, dateTabVO.tabSettings) && Intrinsics.d(this.trackingInfo, dateTabVO.trackingInfo);
                }

                @NotNull
                public final String getBorderColor() {
                    return this.borderColor;
                }

                public final AtomAction getClickAction() {
                    return this.clickAction;
                }

                @NotNull
                public final TextDTO getDate() {
                    return this.date;
                }

                public final long getId() {
                    return this.id;
                }

                public final TextDTO getPrice() {
                    return this.price;
                }

                public final IconDTO getRightPriceIcon() {
                    return this.rightPriceIcon;
                }

                @NotNull
                public final TravelWidgetSettingsVO getTabSettings() {
                    return this.tabSettings;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int a11 = b.a(this.date, Long.hashCode(this.id) * 31, 31);
                    TextDTO textDTO = this.price;
                    int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                    IconDTO iconDTO = this.rightPriceIcon;
                    int a12 = C3532b.a(g.a((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.borderColor), 31, this.isSelected);
                    AtomAction atomAction = this.clickAction;
                    int hashCode2 = (this.tabSettings.hashCode() + ((a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31)) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode2 + (map != null ? map.hashCode() : 0);
                }

                /* renamed from: isSelected, reason: from getter */
                public final boolean getIsSelected() {
                    return this.isSelected;
                }

                @NotNull
                public String toString() {
                    long j11 = this.id;
                    TextDTO textDTO = this.date;
                    TextDTO textDTO2 = this.price;
                    IconDTO iconDTO = this.rightPriceIcon;
                    String str = this.borderColor;
                    boolean z11 = this.isSelected;
                    AtomAction atomAction = this.clickAction;
                    TravelWidgetSettingsVO travelWidgetSettingsVO = this.tabSettings;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder b11 = a.b("DateTabVO(id=", j11, ", date=", textDTO);
                    b11.append(", price=");
                    b11.append(textDTO2);
                    b11.append(", rightPriceIcon=");
                    b11.append(iconDTO);
                    D40.a.g(", borderColor=", str, ", isSelected=", b11, z11);
                    b11.append(", clickAction=");
                    b11.append(atomAction);
                    b11.append(", tabSettings=");
                    b11.append(travelWidgetSettingsVO);
                    return C2639a.b(b11, ", trackingInfo=", map, ")");
                }
            }

            public Content(Map<String, TokenizedTrackingInfo> map, @NotNull List<DateTabVO> dateTabs, Integer num, boolean z11) {
                Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
                this.viewTracking = map;
                this.dateTabs = dateTabs;
                this.selectedItemPosition = num;
                this.hasBackground = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return Intrinsics.d(this.viewTracking, content.viewTracking) && Intrinsics.d(this.dateTabs, content.dateTabs) && Intrinsics.d(this.selectedItemPosition, content.selectedItemPosition) && this.hasBackground == content.hasBackground;
            }

            @NotNull
            public final List<DateTabVO> getDateTabs() {
                return this.dateTabs;
            }

            public final boolean getHasBackground() {
                return this.hasBackground;
            }

            public final Integer getSelectedItemPosition() {
                return this.selectedItemPosition;
            }

            @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2VO.State
            public Map<String, TokenizedTrackingInfo> getViewTracking() {
                return this.viewTracking;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.viewTracking;
                int b11 = g.b((map == null ? 0 : map.hashCode()) * 31, 31, this.dateTabs);
                Integer num = this.selectedItemPosition;
                return Boolean.hashCode(this.hasBackground) + ((b11 + (num != null ? num.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                return "Content(viewTracking=" + this.viewTracking + ", dateTabs=" + this.dateTabs + ", selectedItemPosition=" + this.selectedItemPosition + ", hasBackground=" + this.hasBackground + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Loading;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTracking", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getViewTracking", "()Ljava/util/Map;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements State {
            private final Map<String, TokenizedTrackingInfo> viewTracking;

            public Loading(Map<String, TokenizedTrackingInfo> map) {
                this.viewTracking = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && Intrinsics.d(this.viewTracking, ((Loading) other).viewTracking);
            }

            @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2VO.State
            public Map<String, TokenizedTrackingInfo> getViewTracking() {
                return this.viewTracking;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.viewTracking;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @NotNull
            public String toString() {
                return HY.b.b("Loading(viewTracking=", ")", this.viewTracking);
            }
        }

        Map<String, TokenizedTrackingInfo> getViewTracking();
    }

    public TravelScrollPriceCalendarV2VO(long j11, String str, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.asyncData = str;
        this.state = state;
    }

    public static /* synthetic */ TravelScrollPriceCalendarV2VO copy$default(TravelScrollPriceCalendarV2VO travelScrollPriceCalendarV2VO, long j11, String str, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = travelScrollPriceCalendarV2VO.id;
        }
        if ((i11 & 2) != 0) {
            str = travelScrollPriceCalendarV2VO.asyncData;
        }
        if ((i11 & 4) != 0) {
            state = travelScrollPriceCalendarV2VO.state;
        }
        return travelScrollPriceCalendarV2VO.copy(j11, str, state);
    }

    @NotNull
    public final TravelScrollPriceCalendarV2VO copy(long id2, String asyncData, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TravelScrollPriceCalendarV2VO(id2, asyncData, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelScrollPriceCalendarV2VO)) {
            return false;
        }
        TravelScrollPriceCalendarV2VO travelScrollPriceCalendarV2VO = (TravelScrollPriceCalendarV2VO) other;
        return this.id == travelScrollPriceCalendarV2VO.id && Intrinsics.d(this.asyncData, travelScrollPriceCalendarV2VO.asyncData) && Intrinsics.d(this.state, travelScrollPriceCalendarV2VO.state);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        return this.state.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        State state = this.state;
        StringBuilder c11 = C2436a.c(j11, "TravelScrollPriceCalendarV2VO(id=", ", asyncData=", str);
        c11.append(", state=");
        c11.append(state);
        c11.append(")");
        return c11.toString();
    }
}
