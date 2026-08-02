package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.ow7;
import xsna.yl50;

/* compiled from: BookingServicesScreenPatch.kt */
/* loaded from: classes18.dex */
public interface e extends yl50 {

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class a implements e {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1936572077;
        }

        public final String toString() {
            return "ClearSearch";
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class b implements e {
        public final List<BookingServiceModel> a;

        public b(List<BookingServiceModel> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("DisableServices(availableServices="), this.a);
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class c implements e {
        public final Exception a;
        public final com.vk.ecomm.onlinebooking.impl.services.presentation.a b;

        public c(Exception exc, com.vk.ecomm.onlinebooking.impl.services.presentation.a aVar) {
            this.a = exc;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.a + ", action=" + this.b + ')';
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class d implements e {
        public final BookingScreenParams a;

        public d(BookingScreenParams bookingScreenParams) {
            this.a = bookingScreenParams;
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
            return "InitParams(params=" + this.a + ')';
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.e$e, reason: collision with other inner class name */
    public static final class C0984e implements e {
        public final String a;

        public C0984e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0984e) && epx.f(this.a, ((C0984e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(query="), this.a, ')');
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class f implements e {
        public final ow7 a;

        public f(ow7 ow7Var) {
            this.a = ow7Var;
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
            return "SelectCategory(category=" + this.a + ')';
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class g implements e {
        public final BookingServicesScreenState.ServiceWrapper a;

        public g(BookingServicesScreenState.ServiceWrapper serviceWrapper) {
            this.a = serviceWrapper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectGroupService(service=" + this.a + ')';
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class h implements e {
        public final BookingServicesScreenState.ServiceWrapper a;

        public h(BookingServicesScreenState.ServiceWrapper serviceWrapper) {
            this.a = serviceWrapper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectService(service=" + this.a + ')';
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class i implements e {
        public final BookingServicesScreenState.ServiceWrapper a;

        public i(BookingServicesScreenState.ServiceWrapper serviceWrapper) {
            this.a = serviceWrapper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectSingleService(service=" + this.a + ')';
        }
    }

    /* compiled from: BookingServicesScreenPatch.kt */
    public static final class j implements e {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateAvailableServicesJobActive(isActive="), this.a, ')');
        }
    }
}
