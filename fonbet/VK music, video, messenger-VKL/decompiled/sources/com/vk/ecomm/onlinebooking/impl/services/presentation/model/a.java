package com.vk.ecomm.onlinebooking.impl.services.presentation.model;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.ow7;
import xsna.qoy;
import xsna.urd0;
import xsna.v11;

/* compiled from: BookingServicesScreenViewState.kt */
/* loaded from: classes18.dex */
public final class a implements lm50 {
    public final BookingServiceType b;
    public final BookingServicesScreenState.f c;
    public final InterfaceC0987a d;

    /* compiled from: BookingServicesScreenViewState.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.model.a$a, reason: collision with other inner class name */
    public interface InterfaceC0987a {

        /* compiled from: BookingServicesScreenViewState.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.model.a$a$a, reason: collision with other inner class name */
        public static final class C0988a implements InterfaceC0987a {
            public final BookingServicesScreenState.a a;
            public final ow7 b;
            public final Map<Integer, List<BookingServicesScreenState.ServiceWrapper>> c;
            public final List<ow7> d;
            public final String e;
            public final BookingServicesScreenState.e f;
            public final String g;
            public final BookingServicesScreenState.c h;
            public final BookingServicesScreenState.b i;

            /* JADX WARN: Multi-variable type inference failed */
            public C0988a(BookingServicesScreenState.a aVar, ow7 ow7Var, Map<Integer, ? extends List<BookingServicesScreenState.ServiceWrapper>> map, List<ow7> list, String str, BookingServicesScreenState.e eVar, String str2, BookingServicesScreenState.c cVar, BookingServicesScreenState.b bVar) {
                this.a = aVar;
                this.b = ow7Var;
                this.c = map;
                this.d = list;
                this.e = str;
                this.f = eVar;
                this.g = str2;
                this.h = cVar;
                this.i = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0988a)) {
                    return false;
                }
                C0988a c0988a = (C0988a) obj;
                return epx.f(this.a, c0988a.a) && epx.f(this.b, c0988a.b) && epx.f(this.c, c0988a.c) && epx.f(this.d, c0988a.d) && epx.f(this.e, c0988a.e) && epx.f(this.f, c0988a.f) && epx.f(this.g, c0988a.g) && epx.f(this.h, c0988a.h) && epx.f(this.i, c0988a.i);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                ow7 ow7Var = this.b;
                return Boolean.hashCode(this.i.a) + ((this.h.hashCode() + urd0.a((this.f.hashCode() + urd0.a(fw3.a(v11.a((hashCode + (ow7Var == null ? 0 : ow7Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g)) * 31);
            }

            public final String toString() {
                return "Data(selectedTab=" + this.a + ", selectedCategoryTab=" + this.b + ", servicesByCategories=" + this.c + ", categories=" + this.d + ", query=" + this.e + ", serviceTotals=" + this.f + ", currency=" + this.g + ", ctaButton=" + this.h + ", checkBoxes=" + this.i + ')';
            }
        }

        /* compiled from: BookingServicesScreenViewState.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.model.a$a$b */
        public static final class b implements InterfaceC0987a {
            public final BookingServicesScreenState.d a;

            public b(BookingServicesScreenState.d dVar) {
                this.a = dVar;
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
                return "Failure(error=" + this.a + ')';
            }
        }

        /* compiled from: BookingServicesScreenViewState.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.model.a$a$c */
        public static final class c implements InterfaceC0987a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -751205560;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public a(BookingServiceType bookingServiceType, BookingServicesScreenState.f fVar, InterfaceC0987a interfaceC0987a) {
        this.b = bookingServiceType;
        this.c = fVar;
        this.d = interfaceC0987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c.a);
    }

    public final String toString() {
        return "BookingServicesScreenViewState(type=" + this.b + ", toolbar=" + this.c + ", content=" + this.d + ')';
    }
}
