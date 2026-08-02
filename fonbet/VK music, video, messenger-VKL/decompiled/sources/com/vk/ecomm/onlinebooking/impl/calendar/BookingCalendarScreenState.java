package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.ym7;
import xsna.zrp;

/* compiled from: BookingCalendarScreenState.kt */
/* loaded from: classes18.dex */
public final class BookingCalendarScreenState implements km50 {
    public final boolean b;
    public final boolean c;
    public final a d;
    public final BookingScreenParams e;
    public final ym7 f;
    public final DaySelector g;
    public final TimeSlotSelector h;

    /* compiled from: BookingCalendarScreenState.kt */
    public static final class DaySelector {
        public final List<a> a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BookingCalendarScreenState.kt */
        public static final class DayType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DayType[] $VALUES;
            public static final DayType Available;
            public static final DayType NotAvailable;
            public static final DayType Selected;

            static {
                DayType dayType = new DayType("NotAvailable", 0);
                NotAvailable = dayType;
                DayType dayType2 = new DayType("Available", 1);
                Available = dayType2;
                DayType dayType3 = new DayType("Selected", 2);
                Selected = dayType3;
                DayType[] dayTypeArr = {dayType, dayType2, dayType3};
                $VALUES = dayTypeArr;
                $ENTRIES = new asp(dayTypeArr);
            }

            public DayType() {
                throw null;
            }

            public static DayType valueOf(String str) {
                return (DayType) Enum.valueOf(DayType.class, str);
            }

            public static DayType[] values() {
                return (DayType[]) $VALUES.clone();
            }
        }

        /* compiled from: BookingCalendarScreenState.kt */
        public static final class a {
            public final int a;
            public final int b;
            public final int c;
            public final DayType d;
            public final ym7.b e;

            public a(int i, int i2, int i3, DayType dayType, ym7.b bVar) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = dayType;
                this.e = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31);
            }

            public final String toString() {
                return "Day(month=" + this.a + ", dayOfMonth=" + this.b + ", dayOfWeek=" + this.c + ", type=" + this.d + ", model=" + this.e + ')';
            }
        }

        public DaySelector() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DaySelector) && epx.f(this.a, ((DaySelector) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("DaySelector(days="), this.a);
        }

        public DaySelector(List<a> list) {
            this.a = list;
        }

        public DaySelector(int i) {
            this(EmptyList.b);
        }
    }

    /* compiled from: BookingCalendarScreenState.kt */
    public interface TimeSlotSelector {

        /* compiled from: BookingCalendarScreenState.kt */
        public static final class Block {
            public final Kind a;
            public final ArrayList b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: BookingCalendarScreenState.kt */
            public static final class Kind {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Kind[] $VALUES;
                public static final Kind Day;
                public static final Kind Evening;
                public static final Kind Morning;
                public static final Kind Night;

                static {
                    Kind kind = new Kind("Night", 0);
                    Night = kind;
                    Kind kind2 = new Kind("Morning", 1);
                    Morning = kind2;
                    Kind kind3 = new Kind("Day", 2);
                    Day = kind3;
                    Kind kind4 = new Kind("Evening", 3);
                    Evening = kind4;
                    Kind[] kindArr = {kind, kind2, kind3, kind4};
                    $VALUES = kindArr;
                    $ENTRIES = new asp(kindArr);
                }

                public Kind() {
                    throw null;
                }

                public static Kind valueOf(String str) {
                    return (Kind) Enum.valueOf(Kind.class, str);
                }

                public static Kind[] values() {
                    return (Kind[]) $VALUES.clone();
                }
            }

            public Block(Kind kind, ArrayList arrayList) {
                this.a = kind;
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Block)) {
                    return false;
                }
                Block block = (Block) obj;
                return this.a == block.a && this.b.equals(block.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Block(kind=");
                sb.append(this.a);
                sb.append(", timeSlots=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
            }
        }

        /* compiled from: BookingCalendarScreenState.kt */
        public static final class a implements TimeSlotSelector {
            public final int a;
            public final int b;
            public final boolean c;
            public final boolean d;

            public a(int i, int i2, boolean z, boolean z2) {
                this.a = i;
                this.b = i2;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SpecialistBusy(day=");
                sb.append(this.a);
                sb.append(", month=");
                sb.append(this.b);
                sb.append(", canTryRemovingMasterFilter=");
                sb.append(this.c);
                sb.append(", isServiceChangeable=");
                return q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: BookingCalendarScreenState.kt */
        public static final class b {
            public final String a;
            public final ym7.b b;
            public final ym7.d c;

            public b(String str, ym7.b bVar, ym7.d dVar) {
                this.a = str;
                this.b = bVar;
                this.c = dVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "TimeSlot(timeString=" + this.a + ", dayModel=" + this.b + ", model=" + this.c + ')';
            }
        }

        /* compiled from: BookingCalendarScreenState.kt */
        public static final class c implements TimeSlotSelector {
            public final List<Block> a;

            public c(List<Block> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("TimeSlots(list="), this.a);
            }
        }
    }

    /* compiled from: BookingCalendarScreenState.kt */
    public static final class a {
        public final com.vk.ecomm.onlinebooking.impl.common.a a;
        public final com.vk.ecomm.onlinebooking.impl.calendar.a b;
        public final boolean c;

        public a(com.vk.ecomm.onlinebooking.impl.common.a aVar, com.vk.ecomm.onlinebooking.impl.calendar.a aVar2, boolean z) {
            this.a = aVar;
            this.b = aVar2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(cause=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", fullscreen=");
            return q0.a(sb, this.c, ')');
        }
    }

    public BookingCalendarScreenState() {
        this(0);
    }

    public static BookingCalendarScreenState a(BookingCalendarScreenState bookingCalendarScreenState, boolean z, boolean z2, a aVar, BookingScreenParams bookingScreenParams, ym7 ym7Var, DaySelector daySelector, TimeSlotSelector timeSlotSelector, int i) {
        if ((i & 1) != 0) {
            z = bookingCalendarScreenState.b;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = bookingCalendarScreenState.c;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            aVar = bookingCalendarScreenState.d;
        }
        a aVar2 = aVar;
        if ((i & 8) != 0) {
            bookingScreenParams = bookingCalendarScreenState.e;
        }
        BookingScreenParams bookingScreenParams2 = bookingScreenParams;
        if ((i & 16) != 0) {
            ym7Var = bookingCalendarScreenState.f;
        }
        ym7 ym7Var2 = ym7Var;
        if ((i & 32) != 0) {
            daySelector = bookingCalendarScreenState.g;
        }
        DaySelector daySelector2 = daySelector;
        if ((i & 64) != 0) {
            timeSlotSelector = bookingCalendarScreenState.h;
        }
        bookingCalendarScreenState.getClass();
        return new BookingCalendarScreenState(z3, z4, aVar2, bookingScreenParams2, ym7Var2, daySelector2, timeSlotSelector);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingCalendarScreenState)) {
            return false;
        }
        BookingCalendarScreenState bookingCalendarScreenState = (BookingCalendarScreenState) obj;
        return this.b == bookingCalendarScreenState.b && this.c == bookingCalendarScreenState.c && epx.f(this.d, bookingCalendarScreenState.d) && epx.f(this.e, bookingCalendarScreenState.e) && epx.f(this.f, bookingCalendarScreenState.f) && epx.f(this.g, bookingCalendarScreenState.g) && epx.f(this.h, bookingCalendarScreenState.h);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        a aVar = this.d;
        int hashCode = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
        BookingScreenParams bookingScreenParams = this.e;
        return this.h.hashCode() + fw3.a((this.f.hashCode() + ((hashCode + (bookingScreenParams != null ? bookingScreenParams.hashCode() : 0)) * 31)) * 31, 31, this.g.a);
    }

    public final String toString() {
        return "BookingCalendarScreenState(isFullScreenLoading=" + this.b + ", isTimeSlotsLoading=" + this.c + ", error=" + this.d + ", params=" + this.e + ", model=" + this.f + ", daySelector=" + this.g + ", timeSlotSelector=" + this.h + ')';
    }

    public BookingCalendarScreenState(boolean z, boolean z2, a aVar, BookingScreenParams bookingScreenParams, ym7 ym7Var, DaySelector daySelector, TimeSlotSelector timeSlotSelector) {
        this.b = z;
        this.c = z2;
        this.d = aVar;
        this.e = bookingScreenParams;
        this.f = ym7Var;
        this.g = daySelector;
        this.h = timeSlotSelector;
    }

    public BookingCalendarScreenState(int i) {
        this(true, false, null, null, new ym7(new ym7.b(ym7.a.g, false), false, BookingMaster.k, true, true, ym7.e.e, EmptyList.b), new DaySelector(0), new TimeSlotSelector.a(0, 0, false, false));
    }
}
