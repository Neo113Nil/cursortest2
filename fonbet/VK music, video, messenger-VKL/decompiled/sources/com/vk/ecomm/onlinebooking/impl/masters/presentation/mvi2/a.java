package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import xsna.epx;
import xsna.lj50;

/* compiled from: BookingMastersScreenAction.kt */
/* loaded from: classes18.dex */
public abstract class a implements lj50 {

    /* compiled from: BookingMastersScreenAction.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a$a, reason: collision with other inner class name */
    public static final class C0973a extends a {
        public static final C0973a b = new C0973a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0973a);
        }

        public final int hashCode() {
            return 1053144221;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: BookingMastersScreenAction.kt */
    public static final class b extends a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1711004414;
        }

        public final String toString() {
            return "ClickClose";
        }
    }

    /* compiled from: BookingMastersScreenAction.kt */
    public static final class c extends a {
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
            return "InitialData(params=" + this.b + ')';
        }
    }

    /* compiled from: BookingMastersScreenAction.kt */
    public static final class d extends a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1615752544;
        }

        public final String toString() {
            return "SelectAnyMaster";
        }
    }

    /* compiled from: BookingMastersScreenAction.kt */
    public static final class e extends a {
        public final BookingMaster b;

        public e(BookingMaster bookingMaster) {
            this.b = bookingMaster;
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
            return "SelectMaster(master=" + this.b + ')';
        }
    }
}
