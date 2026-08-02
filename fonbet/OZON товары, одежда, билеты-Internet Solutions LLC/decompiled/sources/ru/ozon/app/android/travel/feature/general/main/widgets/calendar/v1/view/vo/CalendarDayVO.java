package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\"#B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "", "", "isAvailable", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO$DayState;", "state", "", "text", "Lorg/joda/time/LocalDate;", "date", "isTodayDate", "isWeekend", "<init>", "(ZLru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO$DayState;Ljava/lang/CharSequence;Lorg/joda/time/LocalDate;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO$DayState;", "getState", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO$DayState;", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "Lorg/joda/time/LocalDate;", "getDate", "()Lorg/joda/time/LocalDate;", "Companion", "DayState", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarDayVO {
    private final LocalDate date;
    private final boolean isAvailable;
    private final boolean isTodayDate;
    private final boolean isWeekend;

    @NotNull
    private final DayState state;

    @NotNull
    private final CharSequence text;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO$Companion;", "", "<init>", "()V", "newEmptyDay", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CalendarDayVO newEmptyDay() {
            return new CalendarDayVO(false, DayState.DEFAULT, "", null, false, false);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO$DayState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SINGLE_SELECTION", "START_INTERVAL", "MEDIUM_INTERVAL", "END_INTERVAL", "MATCHED", "PART", "START_PART", "END_PART", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DayState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DayState[] $VALUES;
        public static final DayState DEFAULT = new DayState("DEFAULT", 0);
        public static final DayState SINGLE_SELECTION = new DayState("SINGLE_SELECTION", 1);
        public static final DayState START_INTERVAL = new DayState("START_INTERVAL", 2);
        public static final DayState MEDIUM_INTERVAL = new DayState("MEDIUM_INTERVAL", 3);
        public static final DayState END_INTERVAL = new DayState("END_INTERVAL", 4);
        public static final DayState MATCHED = new DayState("MATCHED", 5);
        public static final DayState PART = new DayState("PART", 6);
        public static final DayState START_PART = new DayState("START_PART", 7);
        public static final DayState END_PART = new DayState("END_PART", 8);

        private static final /* synthetic */ DayState[] $values() {
            return new DayState[]{DEFAULT, SINGLE_SELECTION, START_INTERVAL, MEDIUM_INTERVAL, END_INTERVAL, MATCHED, PART, START_PART, END_PART};
        }

        static {
            DayState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DayState(String str, int i11) {
        }

        public static DayState valueOf(String str) {
            return (DayState) Enum.valueOf(DayState.class, str);
        }

        public static DayState[] values() {
            return (DayState[]) $VALUES.clone();
        }
    }

    public CalendarDayVO(boolean z11, @NotNull DayState state, @NotNull CharSequence text, LocalDate localDate, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(text, "text");
        this.isAvailable = z11;
        this.state = state;
        this.text = text;
        this.date = localDate;
        this.isTodayDate = z12;
        this.isWeekend = z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarDayVO)) {
            return false;
        }
        CalendarDayVO calendarDayVO = (CalendarDayVO) other;
        return this.isAvailable == calendarDayVO.isAvailable && this.state == calendarDayVO.state && Intrinsics.d(this.text, calendarDayVO.text) && Intrinsics.d(this.date, calendarDayVO.date) && this.isTodayDate == calendarDayVO.isTodayDate && this.isWeekend == calendarDayVO.isWeekend;
    }

    public final LocalDate getDate() {
        return this.date;
    }

    @NotNull
    public final DayState getState() {
        return this.state;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = (this.text.hashCode() + ((this.state.hashCode() + (Boolean.hashCode(this.isAvailable) * 31)) * 31)) * 31;
        LocalDate localDate = this.date;
        return Boolean.hashCode(this.isWeekend) + C3532b.a((hashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.isTodayDate);
    }

    /* renamed from: isAvailable, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: isTodayDate, reason: from getter */
    public final boolean getIsTodayDate() {
        return this.isTodayDate;
    }

    /* renamed from: isWeekend, reason: from getter */
    public final boolean getIsWeekend() {
        return this.isWeekend;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isAvailable;
        DayState dayState = this.state;
        CharSequence charSequence = this.text;
        return "CalendarDayVO(isAvailable=" + z11 + ", state=" + dayState + ", text=" + ((Object) charSequence) + ", date=" + this.date + ", isTodayDate=" + this.isTodayDate + ", isWeekend=" + this.isWeekend + ")";
    }
}
