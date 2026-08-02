package com.vk.ecomm.onlinebooking.impl.common;

import xsna.epx;
import xsna.ho8;

/* compiled from: BookingErrorModel.kt */
/* loaded from: classes18.dex */
public interface a {

    /* compiled from: BookingErrorModel.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.common.a$a, reason: collision with other inner class name */
    public static final class C0955a implements a {
        public static final C0955a a = new C0955a();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0955a);
        }

        public final int hashCode() {
            return -1813529126;
        }

        public final String toString() {
            return "ActivityRecordAlreadyExists";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class b implements a {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
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
            return ho8.a(new StringBuilder("ApiException(message="), this.a, ')');
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class c implements a {
        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Custom(title=null, description=null)";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class d implements a {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MasterIsNotAvailable(masterName="), this.a, ')');
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class e implements a {
        public static final e a = new e();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2000818715;
        }

        public final String toString() {
            return "NetworkException";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class f implements a {
        public static final f a = new f();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -880988098;
        }

        public final String toString() {
            return "NoBooking";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class g implements a {
        public static final g a = new g();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1742166501;
        }

        public final String toString() {
            return "NoData";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class h implements a {
        public static final h a = new h();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1283049781;
        }

        public final String toString() {
            return "NoStaffForBooking";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class i implements a {
        public static final i a = new i();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 988189134;
        }

        public final String toString() {
            return "RecordCancellation";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class j implements a {
        public static final j a = new j();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 509574392;
        }

        public final String toString() {
            return "ServiceIsNotAvailableForReBooking";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class k implements a {
        public static final k a = new k();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1468668884;
        }

        public final String toString() {
            return "ServiceNotAvailableAtSelectedTime";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class l implements a {
        public static final l a = new l();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -255400927;
        }

        public final String toString() {
            return "ServiceNotAvailableForBooking";
        }
    }

    /* compiled from: BookingErrorModel.kt */
    public static final class m implements a {
        public static final m a = new m();

        @Override // com.vk.ecomm.onlinebooking.impl.common.a
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1021468543;
        }

        public final String toString() {
            return "UnknownException";
        }
    }

    default boolean a() {
        return true;
    }
}
