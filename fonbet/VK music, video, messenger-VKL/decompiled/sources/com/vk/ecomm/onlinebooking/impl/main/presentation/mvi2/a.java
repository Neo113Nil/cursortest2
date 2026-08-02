package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import xsna.epx;
import xsna.gp;
import xsna.lj50;

/* compiled from: BookingStartScreenAction.kt */
/* loaded from: classes18.dex */
public abstract class a implements lj50 {

    /* compiled from: BookingStartScreenAction.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a$a, reason: collision with other inner class name */
    public static final class C0969a extends a {
        public static final C0969a b = new C0969a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0969a);
        }

        public final int hashCode() {
            return 15426606;
        }

        public final String toString() {
            return "CancelRecord";
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class b extends a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -32320813;
        }

        public final String toString() {
            return "ClickClose";
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class c extends a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -779466659;
        }

        public final String toString() {
            return "ClickRecords";
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class d extends a {
        public final BookingServiceType b;

        public d(BookingServiceType bookingServiceType) {
            this.b = bookingServiceType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickServices(type=" + this.b + ')';
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class e extends a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2008621808;
        }

        public final String toString() {
            return "DoNotCancelRecord";
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class f extends a {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1627460846;
        }

        public final String toString() {
            return "NavigateCalendar";
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class g extends a {
        public final BookingButton.Action b;
        public final BookingRecord c;

        public g(BookingButton.Action action, BookingRecord bookingRecord) {
            this.b = action;
            this.c = bookingRecord;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "RecordButtonClick(action=" + this.b + ", record=" + this.c + ')';
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class h extends a {
        public final UserId b;

        public h(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("RetryLoadData(groupId="), this.b, ')');
        }
    }

    /* compiled from: BookingStartScreenAction.kt */
    public static final class i extends a {
    }
}
