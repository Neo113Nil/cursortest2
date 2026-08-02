package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import xsna.epx;
import xsna.pk50;

/* compiled from: BookingMastersScreenEvent.kt */
/* loaded from: classes18.dex */
public interface d extends pk50 {

    /* compiled from: BookingMastersScreenEvent.kt */
    public interface a extends d {

        /* compiled from: BookingMastersScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d$a$a, reason: collision with other inner class name */
        public static final class C0974a implements a {
            public static final C0974a a = new C0974a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0974a);
            }

            public final int hashCode() {
                return 1678330413;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: BookingMastersScreenEvent.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -786698831;
            }

            public final String toString() {
                return "LoadedMasters";
            }
        }

        /* compiled from: BookingMastersScreenEvent.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1165348147;
            }

            public final String toString() {
                return "MasterUnavailable";
            }
        }
    }

    /* compiled from: BookingMastersScreenEvent.kt */
    public interface b extends d {

        /* compiled from: BookingMastersScreenEvent.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 673126070;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: BookingMastersScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d$b$b, reason: collision with other inner class name */
        public static final class C0975b implements b {
            public static final C0975b a = new C0975b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0975b);
            }

            public final int hashCode() {
                return -206179462;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        /* compiled from: BookingMastersScreenEvent.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -501475056;
            }

            public final String toString() {
                return "SelectAnyMaster";
            }
        }

        /* compiled from: BookingMastersScreenEvent.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d$b$d, reason: collision with other inner class name */
        public static final class C0976d implements b {
            public final BookingMaster a;

            public C0976d(BookingMaster bookingMaster) {
                this.a = bookingMaster;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0976d) && epx.f(this.a, ((C0976d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SelectMaster(master=" + this.a + ')';
            }
        }
    }

    /* compiled from: BookingMastersScreenEvent.kt */
    public static final class c implements d {
        public final BookingError.MasterIsNotAvailable a;

        public c(BookingError.MasterIsNotAvailable masterIsNotAvailable) {
            this.a = masterIsNotAvailable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowError(exception=" + this.a + ')';
        }
    }
}
