package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import defpackage.q0;
import xsna.epx;
import xsna.kj50;
import xsna.ym7;

/* compiled from: BookingCalendarScreenAction.kt */
/* loaded from: classes18.dex */
public interface a extends kj50 {

    /* compiled from: BookingCalendarScreenAction.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.calendar.a$a, reason: collision with other inner class name */
    public static final class C0953a implements a {
        public static final C0953a b = new C0953a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0953a);
        }

        public final int hashCode() {
            return -1301853616;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 567500448;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class c implements a {
        public final BookingScreenParams b;

        public c(BookingScreenParams bookingScreenParams) {
            this.b = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenScreen(params=" + this.b + ')';
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -257037691;
        }

        public final String toString() {
            return "ReselectDay";
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class e implements a {
        public final ym7.b b;

        public e(ym7.b bVar) {
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectDay(day=" + this.b + ')';
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class f implements a {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 840849503;
        }

        public final String toString() {
            return "SelectMasterBusyBackToServices";
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class g implements a {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -130452084;
        }

        public final String toString() {
            return "SelectMasterBusyTryAllMasters";
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class h implements a {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SelectMasterFilter(viewAllMasters="), this.b, ')');
        }
    }

    /* compiled from: BookingCalendarScreenAction.kt */
    public static final class i implements a {
        public final ym7.d b;

        public i(ym7.d dVar) {
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectTimeSlot(slot=" + this.b + ')';
        }
    }
}
