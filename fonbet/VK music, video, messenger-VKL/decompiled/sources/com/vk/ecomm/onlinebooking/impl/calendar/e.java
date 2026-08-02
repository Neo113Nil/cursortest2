package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.xl50;
import xsna.ym7;

/* compiled from: BookingCalendarScreenPatch.kt */
/* loaded from: classes18.dex */
public interface e extends xl50 {

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class a implements e {
        public final ym7.b b;

        public a(ym7.b bVar) {
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeCurrentDay(newDay=" + this.b + ')';
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class b implements e {
        public final boolean b;
        public final List<ym7.c> c;

        public b(boolean z, List<ym7.c> list) {
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeMasterFilter(newFilter=");
            sb.append(this.b);
            sb.append(", updatedMonths=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class c implements e {
        public final ym7 b;

        public c(ym7 ym7Var) {
            this.b = ym7Var;
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
            return "ChangeModel(model=" + this.b + ')';
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class d implements e {
        public final ym7.e b;

        public d(ym7.e eVar) {
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeTimeSlotTable(slots=" + this.b + ')';
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.calendar.e$e, reason: collision with other inner class name */
    public static final class C0954e implements e {
        public static final C0954e b = new C0954e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0954e);
        }

        public final int hashCode() {
            return 992470512;
        }

        public final String toString() {
            return "ClearDaySlots";
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class f implements e {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1469442932;
        }

        public final String toString() {
            return "ClearTimeSlotTable";
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class g implements e {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1490995580;
        }

        public final String toString() {
            return "EndFullScreenLoading";
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class h implements e {
        public final Exception b;
        public final com.vk.ecomm.onlinebooking.impl.calendar.a c;
        public final boolean d;

        public h(Exception exc, com.vk.ecomm.onlinebooking.impl.calendar.a aVar, boolean z) {
            this.b = exc;
            this.c = aVar;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d == hVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(error=");
            sb.append(this.b);
            sb.append(", action=");
            sb.append(this.c);
            sb.append(", fullscreen=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class i implements e {
        public final BookingScreenParams b;

        public i(BookingScreenParams bookingScreenParams) {
            this.b = bookingScreenParams;
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
            return "InitParams(params=" + this.b + ')';
        }
    }

    /* compiled from: BookingCalendarScreenPatch.kt */
    public static final class j implements e {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1557203115;
        }

        public final String toString() {
            return "StartFullScreenLoading";
        }
    }
}
