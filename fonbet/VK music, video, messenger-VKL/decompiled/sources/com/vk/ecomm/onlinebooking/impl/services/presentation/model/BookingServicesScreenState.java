package com.vk.ecomm.onlinebooking.impl.services.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.ft7;
import xsna.fw3;
import xsna.hx7;
import xsna.lm50;
import xsna.ow7;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.v11;

/* compiled from: BookingServicesScreenState.kt */
/* loaded from: classes18.dex */
public final class BookingServicesScreenState implements lm50 {
    public final BookingScreenParams b;
    public final boolean c;
    public final d d;
    public final List<ow7> e;
    public final List<ServiceWrapper> f;
    public final List<BookingServiceModel> g;
    public final Map<Integer, List<ServiceWrapper>> h;
    public final String i;
    public final ow7 j;
    public final a k;
    public final e l;
    public final boolean m;
    public final hx7.a n;

    /* compiled from: BookingServicesScreenState.kt */
    public static final class ServiceWrapper implements Parcelable {
        public static final Parcelable.Creator<ServiceWrapper> CREATOR = new a();
        public final BookingServiceModel b;
        public final boolean c;
        public final boolean d;

        /* compiled from: BookingServicesScreenState.kt */
        public static final class a implements Parcelable.Creator<ServiceWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ServiceWrapper createFromParcel(Parcel parcel) {
                return new ServiceWrapper(BookingServiceModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceWrapper[] newArray(int i) {
                return new ServiceWrapper[i];
            }
        }

        public ServiceWrapper(BookingServiceModel bookingServiceModel, boolean z, boolean z2) {
            this.b = bookingServiceModel;
            this.c = z;
            this.d = z2;
        }

        public static ServiceWrapper a(ServiceWrapper serviceWrapper, boolean z, boolean z2, int i) {
            BookingServiceModel bookingServiceModel = serviceWrapper.b;
            if ((i & 2) != 0) {
                z = serviceWrapper.c;
            }
            if ((i & 4) != 0) {
                z2 = serviceWrapper.d;
            }
            serviceWrapper.getClass();
            return new ServiceWrapper(bookingServiceModel, z, z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceWrapper)) {
                return false;
            }
            ServiceWrapper serviceWrapper = (ServiceWrapper) obj;
            return epx.f(this.b, serviceWrapper.b) && this.c == serviceWrapper.c && this.d == serviceWrapper.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServiceWrapper(service=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", isDisabled=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* compiled from: BookingServicesScreenState.kt */
    public static abstract class a {

        /* compiled from: BookingServicesScreenState.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState$a$a, reason: collision with other inner class name */
        public static final class C0986a extends a {
            public static final C0986a a = new C0986a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0986a);
            }

            public final int hashCode() {
                return 1045238642;
            }

            public final String toString() {
                return "AllServiceTab";
            }
        }
    }

    /* compiled from: BookingServicesScreenState.kt */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("CheckBoxes(isCheckable="), this.a, ')');
        }
    }

    /* compiled from: BookingServicesScreenState.kt */
    public static abstract class c {
        public final boolean a;
        public final boolean b;
        public final int c;

        /* compiled from: BookingServicesScreenState.kt */
        public static final class a extends c {
            public static final a d = new a(2);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 167414369;
            }

            public final String toString() {
                return "CtaBookingButton";
            }
        }

        /* compiled from: BookingServicesScreenState.kt */
        public static final class b extends c {
            public static final b d = new b(5);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -701341132;
            }

            public final String toString() {
                return "WithoutButton";
            }
        }

        public c(int i) {
            boolean z = (i & 2) != 0;
            this.a = true;
            this.b = z;
            this.c = R.string.booking_services_action_text;
        }
    }

    /* compiled from: BookingServicesScreenState.kt */
    public static final class d {
        public final com.vk.ecomm.onlinebooking.impl.common.a a;
        public final com.vk.ecomm.onlinebooking.impl.services.presentation.a b;

        public d(com.vk.ecomm.onlinebooking.impl.common.a aVar, com.vk.ecomm.onlinebooking.impl.services.presentation.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(cause=" + this.a + ", action=" + this.b + ')';
        }
    }

    /* compiled from: BookingServicesScreenState.kt */
    public static final class e {
        public static final e d = new e(0, 0, new ft7(0, 0));
        public final int a;
        public final int b;
        public final ft7 c;

        public e(int i, int i2, ft7 ft7Var) {
            this.a = i;
            this.b = i2;
            this.c = ft7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "ServiceTotals(count=" + this.a + ", duration=" + this.b + ", fork=" + this.c + ')';
        }
    }

    /* compiled from: BookingServicesScreenState.kt */
    public static final class f {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Toolbar(hasBackButton="), this.a, ')');
        }
    }

    public BookingServicesScreenState(BookingScreenParams bookingScreenParams, boolean z, d dVar, List list, List list2, List list3, Map map, String str, ow7 ow7Var, a aVar, e eVar, boolean z2, hx7.a aVar2) {
        this.b = bookingScreenParams;
        this.c = z;
        this.d = dVar;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = map;
        this.i = str;
        this.j = ow7Var;
        this.k = aVar;
        this.l = eVar;
        this.m = z2;
        this.n = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BookingServicesScreenState a(BookingServicesScreenState bookingServicesScreenState, BookingScreenParams bookingScreenParams, boolean z, d dVar, List list, List list2, LinkedHashMap linkedHashMap, String str, ow7 ow7Var, e eVar, boolean z2, int i) {
        BookingScreenParams bookingScreenParams2 = (i & 1) != 0 ? bookingServicesScreenState.b : bookingScreenParams;
        boolean z3 = (i & 2) != 0 ? bookingServicesScreenState.c : z;
        d dVar2 = (i & 4) != 0 ? bookingServicesScreenState.d : dVar;
        bookingServicesScreenState.getClass();
        List list3 = (i & 16) != 0 ? bookingServicesScreenState.e : list;
        List<ServiceWrapper> list4 = bookingServicesScreenState.f;
        List list5 = (i & 64) != 0 ? bookingServicesScreenState.g : list2;
        Map map = (i & 128) != 0 ? bookingServicesScreenState.h : linkedHashMap;
        String str2 = (i & 256) != 0 ? bookingServicesScreenState.i : str;
        ow7 ow7Var2 = (i & 512) != 0 ? bookingServicesScreenState.j : ow7Var;
        a aVar = bookingServicesScreenState.k;
        e eVar2 = (i & 2048) != 0 ? bookingServicesScreenState.l : eVar;
        boolean z4 = (i & 4096) != 0 ? bookingServicesScreenState.m : z2;
        hx7.a aVar2 = bookingServicesScreenState.n;
        bookingServicesScreenState.getClass();
        return new BookingServicesScreenState(bookingScreenParams2, z3, dVar2, list3, list4, list5, map, str2, ow7Var2, aVar, eVar2, z4, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingServicesScreenState)) {
            return false;
        }
        BookingServicesScreenState bookingServicesScreenState = (BookingServicesScreenState) obj;
        return epx.f(this.b, bookingServicesScreenState.b) && this.c == bookingServicesScreenState.c && epx.f(this.d, bookingServicesScreenState.d) && epx.f(this.e, bookingServicesScreenState.e) && epx.f(this.f, bookingServicesScreenState.f) && epx.f(this.g, bookingServicesScreenState.g) && epx.f(this.h, bookingServicesScreenState.h) && epx.f(this.i, bookingServicesScreenState.i) && epx.f(this.j, bookingServicesScreenState.j) && epx.f(this.k, bookingServicesScreenState.k) && epx.f(this.l, bookingServicesScreenState.l) && this.m == bookingServicesScreenState.m && this.n.equals(bookingServicesScreenState.n);
    }

    public final int hashCode() {
        BookingScreenParams bookingScreenParams = this.b;
        int b2 = qoy.b((bookingScreenParams == null ? 0 : bookingScreenParams.hashCode()) * 31, 31, this.c);
        d dVar = this.d;
        int a2 = urd0.a(v11.a(fw3.a(fw3.a(fw3.a((b2 + (dVar == null ? 0 : dVar.hashCode())) * 961, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        ow7 ow7Var = this.j;
        return this.n.hashCode() + qoy.b((this.l.hashCode() + ((this.k.hashCode() + ((a2 + (ow7Var != null ? ow7Var.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.m);
    }

    public final String toString() {
        return "BookingServicesScreenState(params=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ", title=, categories=" + this.e + ", services=" + this.f + ", availableServices=" + this.g + ", servicesByCategories=" + this.h + ", searchQuery=" + this.i + ", currentCategory=" + this.j + ", selectedTab=" + this.k + ", serviceTotals=" + this.l + ", isAvailableServicesJobActive=" + this.m + ", screenSettings=" + this.n + ')';
    }
}
