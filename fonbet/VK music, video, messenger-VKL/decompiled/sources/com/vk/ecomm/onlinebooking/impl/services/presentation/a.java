package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import xsna.epx;
import xsna.ho8;
import xsna.lj50;
import xsna.n23;
import xsna.ow7;

/* compiled from: BookingServicesScreenAction.kt */
/* loaded from: classes18.dex */
public interface a extends lj50 {

    /* compiled from: BookingServicesScreenAction.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.a$a, reason: collision with other inner class name */
    public static final class C0979a implements a {
        public static final C0979a b = new C0979a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0979a);
        }

        public final int hashCode() {
            return -397432545;
        }

        public final String toString() {
            return "ClearSearch";
        }
    }

    /* compiled from: BookingServicesScreenAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 142511170;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: BookingServicesScreenAction.kt */
    public static final class c implements a {
        public final boolean b;

        public c() {
            this(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return n23.b(new StringBuilder("LoadData(isForce="), this.b, ", isRefresh=false)");
        }

        public c(int i) {
            this.b = true;
        }
    }

    /* compiled from: BookingServicesScreenAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1931307118;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BookingServicesScreenAction.kt */
    public static final class e implements a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -272176279;
        }

        public final String toString() {
            return "Next";
        }
    }

    /* compiled from: BookingServicesScreenAction.kt */
    public static final class f implements a {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(query="), this.b, ')');
        }
    }

    /* compiled from: BookingServicesScreenAction.kt */
    public static final class g implements a {
        public final ow7 b;

        public g(ow7 ow7Var) {
            this.b = ow7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectCategory(category=" + this.b + ')';
        }
    }

    /* compiled from: BookingServicesScreenAction.kt */
    public static final class h implements a {
        public final BookingServicesScreenState.ServiceWrapper b;

        public h(BookingServicesScreenState.ServiceWrapper serviceWrapper) {
            this.b = serviceWrapper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectService(serviceWrapper=" + this.b + ')';
        }
    }
}
