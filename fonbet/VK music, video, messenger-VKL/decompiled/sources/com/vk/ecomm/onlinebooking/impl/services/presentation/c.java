package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.gp;
import xsna.ms9;
import xsna.pk50;
import xsna.uqi;

/* compiled from: BookingServicesScreenEvent.kt */
/* loaded from: classes18.dex */
public interface c extends pk50 {

    /* compiled from: BookingServicesScreenEvent.kt */
    public interface a extends c {

        /* compiled from: BookingServicesScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.c$a$a, reason: collision with other inner class name */
        public static final class C0980a implements a {
            public final UserId a;
            public final Integer b;

            public C0980a(UserId userId, Integer num) {
                this.a = userId;
                this.b = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0980a)) {
                    return false;
                }
                C0980a c0980a = (C0980a) obj;
                return epx.f(this.a, c0980a.a) && epx.f(this.b, c0980a.b);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.a.b) * 31;
                Integer num = this.b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ErrorView(groupId=");
                sb.append(this.a);
                sb.append(", bookingId=");
                return uqi.b(sb, this.b, ')');
            }
        }

        /* compiled from: BookingServicesScreenEvent.kt */
        public static final class b implements a {
            public final UserId a;

            public b(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ReBookingServicesUnavailable(groupId="), this.a, ')');
            }
        }

        /* compiled from: BookingServicesScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.c$a$c, reason: collision with other inner class name */
        public static final class C0981c implements a {
            public final UserId a;
            public final Integer b;

            public C0981c(UserId userId, Integer num) {
                this.a = userId;
                this.b = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0981c)) {
                    return false;
                }
                C0981c c0981c = (C0981c) obj;
                c0981c.getClass();
                return epx.f(this.a, c0981c.a) && this.b.equals(c0981c.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + bh10.a(Boolean.hashCode(false) * 31, 31, this.a.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ScreenView(isRescheduling=false, groupId=");
                sb.append(this.a);
                sb.append(", bookingId=");
                return uqi.b(sb, this.b, ')');
            }
        }

        /* compiled from: BookingServicesScreenEvent.kt */
        public static final class d implements a {
            public final UserId a;
            public final List<Integer> b;

            public d(UserId userId, List<Integer> list) {
                this.a = userId;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ServicePickerAdd(groupId=");
                sb.append(this.a);
                sb.append(", serviceIds=");
                return ms9.a(')', sb, this.b);
            }
        }
    }

    /* compiled from: BookingServicesScreenEvent.kt */
    public static final class b implements c {
        public final Exception a;

        public b(Exception exc) {
            this.a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ErrorEvent(exception=" + this.a + ')';
        }
    }

    /* compiled from: BookingServicesScreenEvent.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.c$c, reason: collision with other inner class name */
    public interface InterfaceC0982c extends c {

        /* compiled from: BookingServicesScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.c$c$a */
        public static final class a implements InterfaceC0982c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 862353914;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: BookingServicesScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.c$c$b */
        public static final class b implements InterfaceC0982c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1497818186;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        /* compiled from: BookingServicesScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.c$c$c, reason: collision with other inner class name */
        public static final class C0983c implements InterfaceC0982c {
            public final BookingScreenParams a;

            public C0983c(BookingScreenParams bookingScreenParams) {
                this.a = bookingScreenParams;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0983c) && epx.f(this.a, ((C0983c) obj).a);
            }

            public final int hashCode() {
                BookingScreenParams bookingScreenParams = this.a;
                if (bookingScreenParams == null) {
                    return 0;
                }
                return bookingScreenParams.hashCode();
            }

            public final String toString() {
                return "NavigateNext(params=" + this.a + ')';
            }
        }
    }
}
