package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import xsna.epx;
import xsna.pk50;
import xsna.uqi;

/* compiled from: BookingStartScreenEvent.kt */
/* loaded from: classes18.dex */
public interface d extends pk50 {

    /* compiled from: BookingStartScreenEvent.kt */
    public interface a extends d {

        /* compiled from: BookingStartScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d$a$a, reason: collision with other inner class name */
        public static final class C0970a implements a {
            public final Integer a;
            public final BookingServiceType b;

            public C0970a(Integer num, BookingServiceType bookingServiceType) {
                this.a = num;
                this.b = bookingServiceType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0970a)) {
                    return false;
                }
                C0970a c0970a = (C0970a) obj;
                return epx.f(this.a, c0970a.a) && this.b == c0970a.b;
            }

            public final int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                BookingServiceType bookingServiceType = this.b;
                return hashCode + (bookingServiceType != null ? bookingServiceType.hashCode() : 0);
            }

            public final String toString() {
                return "CancelSuccess(recordId=" + this.a + ", type=" + this.b + ')';
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        public static final class b implements a {
            public final Integer a;

            public b(Integer num) {
                this.a = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                Integer num = this.a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return uqi.b(new StringBuilder("Error(recordId="), this.a, ')');
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        public static final class c implements a {
            public final Integer a;

            public c(Integer num) {
                this.a = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                Integer num = this.a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return uqi.b(new StringBuilder("LoadedData(recordId="), this.a, ')');
            }
        }
    }

    /* compiled from: BookingStartScreenEvent.kt */
    public static final class b implements d {
        public final BookingError.RecordCancellationException a;

        public b(BookingError.RecordCancellationException recordCancellationException) {
            this.a = recordCancellationException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return -1926925854;
        }

        public final String toString() {
            return "Error(exception=" + this.a + ')';
        }
    }

    /* compiled from: BookingStartScreenEvent.kt */
    public interface c extends d {

        /* compiled from: BookingStartScreenEvent.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1848603463;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        public static final class b implements c {
            public final BookingRecord a;

            public b(BookingRecord bookingRecord) {
                this.a = bookingRecord;
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
                return "MoveRecord(record=" + this.a + ')';
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d$c$c, reason: collision with other inner class name */
        public static final class C0971c implements c {
            public static final C0971c a = new C0971c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0971c);
            }

            public final int hashCode() {
                return 1918121760;
            }

            public final String toString() {
                return "NavigateCalendar";
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d$c$d, reason: collision with other inner class name */
        public static final class C0972d implements c {
            public static final C0972d a = new C0972d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0972d);
            }

            public final int hashCode() {
                return -1343627744;
            }

            public final String toString() {
                return "NavigateRecords";
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        public static final class e implements c {
            public final BookingServiceType a;
            public final BookingMaster b;

            public e(BookingServiceType bookingServiceType, BookingMaster bookingMaster) {
                this.a = bookingServiceType;
                this.b = bookingMaster;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a == eVar.a && epx.f(this.b, eVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                BookingMaster bookingMaster = this.b;
                return hashCode + (bookingMaster == null ? 0 : bookingMaster.hashCode());
            }

            public final String toString() {
                return "NavigateServices(type=" + this.a + ", master=" + this.b + ')';
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        public static final class f implements c {
            public final BookingRecord a;

            public f(BookingRecord bookingRecord) {
                this.a = bookingRecord;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "RetryRecord(record=" + this.a + ')';
            }
        }

        /* compiled from: BookingStartScreenEvent.kt */
        public static final class g implements c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                ((g) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "SelectMaster(master=null)";
            }
        }
    }
}
