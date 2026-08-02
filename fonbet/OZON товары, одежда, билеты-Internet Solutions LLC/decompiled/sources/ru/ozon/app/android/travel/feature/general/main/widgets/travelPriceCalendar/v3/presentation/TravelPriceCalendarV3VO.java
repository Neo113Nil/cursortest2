package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation;

import B0.A0;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "calendar", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "oneClickDateAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;", "behavior", "<init>", "(JLru/ozon/app/android/travel/calendar/view/vo/CalendarVO;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;)V", "copy", "(JLru/ozon/app/android/travel/calendar/view/vo/CalendarVO;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "getCalendar", "()Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOneClickDateAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;", "getBehavior", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;", "Behavior", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPriceCalendarV3VO implements c {

    @NotNull
    private final Behavior behavior;

    @NotNull
    private final CalendarVO calendar;
    private final long id;
    private final AtomActionDTO oneClickDateAction;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;", "", "Static", "Dynamic", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior$Dynamic;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior$Static;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Behavior {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior$Dynamic;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;", "", "asyncData", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Dynamic implements Behavior {

            @NotNull
            private final String asyncData;

            public Dynamic(@NotNull String asyncData) {
                Intrinsics.checkNotNullParameter(asyncData, "asyncData");
                this.asyncData = asyncData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Dynamic) && Intrinsics.d(this.asyncData, ((Dynamic) other).asyncData);
            }

            @NotNull
            public final String getAsyncData() {
                return this.asyncData;
            }

            public int hashCode() {
                return this.asyncData.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Dynamic(asyncData=", this.asyncData, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior$Static;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO$Behavior;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Static implements Behavior {

            @NotNull
            public static final Static INSTANCE = new Static();

            private Static() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Static);
            }

            public int hashCode() {
                return 401533620;
            }

            @NotNull
            public String toString() {
                return "Static";
            }
        }
    }

    public TravelPriceCalendarV3VO(long j11, @NotNull CalendarVO calendar, AtomActionDTO atomActionDTO, t tVar, @NotNull Behavior behavior) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.id = j11;
        this.calendar = calendar;
        this.oneClickDateAction = atomActionDTO;
        this.viewEvent = tVar;
        this.behavior = behavior;
    }

    public static /* synthetic */ TravelPriceCalendarV3VO copy$default(TravelPriceCalendarV3VO travelPriceCalendarV3VO, long j11, CalendarVO calendarVO, AtomActionDTO atomActionDTO, t tVar, Behavior behavior, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = travelPriceCalendarV3VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            calendarVO = travelPriceCalendarV3VO.calendar;
        }
        CalendarVO calendarVO2 = calendarVO;
        if ((i11 & 4) != 0) {
            atomActionDTO = travelPriceCalendarV3VO.oneClickDateAction;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        if ((i11 & 8) != 0) {
            tVar = travelPriceCalendarV3VO.viewEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 16) != 0) {
            behavior = travelPriceCalendarV3VO.behavior;
        }
        return travelPriceCalendarV3VO.copy(j12, calendarVO2, atomActionDTO2, tVar2, behavior);
    }

    @NotNull
    public final TravelPriceCalendarV3VO copy(long id2, @NotNull CalendarVO calendar, AtomActionDTO oneClickDateAction, t viewEvent, @NotNull Behavior behavior) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        return new TravelPriceCalendarV3VO(id2, calendar, oneClickDateAction, viewEvent, behavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPriceCalendarV3VO)) {
            return false;
        }
        TravelPriceCalendarV3VO travelPriceCalendarV3VO = (TravelPriceCalendarV3VO) other;
        return this.id == travelPriceCalendarV3VO.id && Intrinsics.d(this.calendar, travelPriceCalendarV3VO.calendar) && Intrinsics.d(this.oneClickDateAction, travelPriceCalendarV3VO.oneClickDateAction) && Intrinsics.d(this.viewEvent, travelPriceCalendarV3VO.viewEvent) && Intrinsics.d(this.behavior, travelPriceCalendarV3VO.behavior);
    }

    @NotNull
    public final Behavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final CalendarVO getCalendar() {
        return this.calendar;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final AtomActionDTO getOneClickDateAction() {
        return this.oneClickDateAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.calendar.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.oneClickDateAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        t tVar = this.viewEvent;
        return this.behavior.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TravelPriceCalendarV3VO(id=" + this.id + ", calendar=" + this.calendar + ", oneClickDateAction=" + this.oneClickDateAction + ", viewEvent=" + this.viewEvent + ", behavior=" + this.behavior + ")";
    }
}
