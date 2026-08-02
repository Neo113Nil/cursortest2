package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.TripMode;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b\u0011\u00100R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b\u0012\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripKind", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "tripMode", "", "complexSegmentId", "Lorg/joda/time/LocalDate;", "thereDate", "backDate", "action", "daysRound", "", "isDaysRoundChecked", "isRailwayRoundTripEnabled", "<init>", "(JLru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "getTripKind", "()Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "getTripMode", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "Ljava/lang/String;", "getComplexSegmentId", "Lorg/joda/time/LocalDate;", "getThereDate", "()Lorg/joda/time/LocalDate;", "getBackDate", "getAction", "getDaysRound", "Z", "()Z", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarVO implements c {
    private final String action;
    private final LocalDate backDate;
    private final String complexSegmentId;

    @NotNull
    private final String daysRound;
    private final long id;
    private final boolean isDaysRoundChecked;
    private final boolean isRailwayRoundTripEnabled;
    private final LocalDate thereDate;

    @NotNull
    private final TripKind tripKind;

    @NotNull
    private final TripMode tripMode;

    public CalendarVO(long j11, @NotNull TripKind tripKind, @NotNull TripMode tripMode, String str, LocalDate localDate, LocalDate localDate2, String str2, @NotNull String daysRound, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        Intrinsics.checkNotNullParameter(daysRound, "daysRound");
        this.id = j11;
        this.tripKind = tripKind;
        this.tripMode = tripMode;
        this.complexSegmentId = str;
        this.thereDate = localDate;
        this.backDate = localDate2;
        this.action = str2;
        this.daysRound = daysRound;
        this.isDaysRoundChecked = z11;
        this.isRailwayRoundTripEnabled = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarVO)) {
            return false;
        }
        CalendarVO calendarVO = (CalendarVO) other;
        return this.id == calendarVO.id && this.tripKind == calendarVO.tripKind && this.tripMode == calendarVO.tripMode && Intrinsics.d(this.complexSegmentId, calendarVO.complexSegmentId) && Intrinsics.d(this.thereDate, calendarVO.thereDate) && Intrinsics.d(this.backDate, calendarVO.backDate) && Intrinsics.d(this.action, calendarVO.action) && Intrinsics.d(this.daysRound, calendarVO.daysRound) && this.isDaysRoundChecked == calendarVO.isDaysRoundChecked && this.isRailwayRoundTripEnabled == calendarVO.isRailwayRoundTripEnabled;
    }

    public final String getAction() {
        return this.action;
    }

    public final LocalDate getBackDate() {
        return this.backDate;
    }

    public final String getComplexSegmentId() {
        return this.complexSegmentId;
    }

    @NotNull
    public final String getDaysRound() {
        return this.daysRound;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final LocalDate getThereDate() {
        return this.thereDate;
    }

    @NotNull
    public final TripKind getTripKind() {
        return this.tripKind;
    }

    @NotNull
    public final TripMode getTripMode() {
        return this.tripMode;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.tripMode.hashCode() + ((this.tripKind.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.complexSegmentId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.thereDate;
        int hashCode3 = (hashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.backDate;
        int hashCode4 = (hashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str2 = this.action;
        return Boolean.hashCode(this.isRailwayRoundTripEnabled) + C3532b.a(g.a((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.daysRound), 31, this.isDaysRoundChecked);
    }

    /* renamed from: isDaysRoundChecked, reason: from getter */
    public final boolean getIsDaysRoundChecked() {
        return this.isDaysRoundChecked;
    }

    /* renamed from: isRailwayRoundTripEnabled, reason: from getter */
    public final boolean getIsRailwayRoundTripEnabled() {
        return this.isRailwayRoundTripEnabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TripKind tripKind = this.tripKind;
        TripMode tripMode = this.tripMode;
        String str = this.complexSegmentId;
        LocalDate localDate = this.thereDate;
        LocalDate localDate2 = this.backDate;
        String str2 = this.action;
        String str3 = this.daysRound;
        boolean z11 = this.isDaysRoundChecked;
        boolean z12 = this.isRailwayRoundTripEnabled;
        StringBuilder sb2 = new StringBuilder("CalendarVO(id=");
        sb2.append(j11);
        sb2.append(", tripKind=");
        sb2.append(tripKind);
        sb2.append(", tripMode=");
        sb2.append(tripMode);
        sb2.append(", complexSegmentId=");
        sb2.append(str);
        sb2.append(", thereDate=");
        sb2.append(localDate);
        sb2.append(", backDate=");
        sb2.append(localDate2);
        a.h(sb2, ", action=", str2, ", daysRound=", str3);
        C2436a.e(", isDaysRoundChecked=", ", isRailwayRoundTripEnabled=", sb2, z11, z12);
        sb2.append(")");
        return sb2.toString();
    }
}
