package com.vk.ecomm.onlinebooking.impl.navhostfragment;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import java.util.Collections;
import java.util.LinkedList;
import kotlin.collections.EmptyList;
import xsna.e43;

/* compiled from: BookingFlow.kt */
/* loaded from: classes18.dex */
public abstract class a {
    public final int a;
    public final LinkedList<com.vk.ecomm.onlinebooking.impl.navhostfragment.b> b;
    public final String c;

    /* compiled from: BookingFlow.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.navhostfragment.a$a, reason: collision with other inner class name */
    public static final class C0977a extends a {
        public static final C0977a d = new C0977a(new LinkedList(e43.l(new b.a(7), b.d.b, new b.j(0), new b.C0978b(3), b.h.b)), 3);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0977a);
        }

        public final int hashCode() {
            return -1046630461;
        }

        public final String toString() {
            return "CalendarFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class b {
        public static a a(int i) {
            o oVar = o.d;
            if (i == oVar.a) {
                return oVar;
            }
            j jVar = j.d;
            if (i == jVar.a) {
                return jVar;
            }
            g gVar = g.d;
            if (i == gVar.a) {
                return gVar;
            }
            C0977a c0977a = C0977a.d;
            if (i == c0977a.a) {
                return c0977a;
            }
            d dVar = d.d;
            if (i == dVar.a) {
                return dVar;
            }
            c cVar = c.d;
            if (i == cVar.a) {
                return cVar;
            }
            m mVar = m.d;
            if (i == mVar.a) {
                return mVar;
            }
            h hVar = h.d;
            if (i == hVar.a) {
                return hVar;
            }
            e eVar = e.d;
            if (i == eVar.a) {
                return eVar;
            }
            k kVar = k.d;
            if (i == kVar.a) {
                return kVar;
            }
            l lVar = l.d;
            if (i == lVar.a) {
                return lVar;
            }
            i iVar = i.d;
            if (i == iVar.a) {
                return iVar;
            }
            p pVar = p.d;
            if (i == pVar.a) {
                return pVar;
            }
            n nVar = n.d;
            return i == nVar.a ? nVar : f.d;
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class c extends a {
        public static final c d = new c(new LinkedList(e43.l(new b.a(6), new b.C0978b(3), b.h.b)), 5);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -656010147;
        }

        public final String toString() {
            return "EditDateFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class d extends a {
        public static final d d = new d(new LinkedList(e43.l(b.d.b, new b.a(7), new b.C0978b(3), b.h.b)), 4);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -288020194;
        }

        public final String toString() {
            return "EditMastersFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class e extends a {
        public static final e d = new e(8, new LinkedList(e43.l(new b.j(0), new b.a(3), new b.C0978b(3), b.h.b)), "edit-services");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 307774605;
        }

        public final String toString() {
            return "EditServicesFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class f extends a {
        public static final f d = new f(new LinkedList(EmptyList.b), 999);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -615513788;
        }

        public final String toString() {
            return "EmptyFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class g extends a {
        public static final g d = new g(new LinkedList(e43.l(new b.j(0), new b.a(7), new b.C0978b(3), b.h.b)), 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1631507976;
        }

        public final String toString() {
            return "MastersFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class h extends a {
        public static final h d = new h(7, new LinkedList(e43.l(new b.j(false, true), b.f.b)), "pick-service");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 2054731475;
        }

        public final String toString() {
            return "PickerFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class i extends a {
        public static final i d = new i(11, new LinkedList(e43.l(new b.a(7), new b.C0978b(1), b.h.b)), "rebooking-default");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -2029581376;
        }

        public final String toString() {
            return "ReBookingDefaultFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class j extends a {
        public static final j d = new j(1, new LinkedList(Collections.singletonList(b.g.b)), "repeat-booking");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1250939491;
        }

        public final String toString() {
            return "ReBookingFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class k extends a {
        public static final k d = new k(9, new LinkedList(e43.l(new b.j(0), new b.a(7), new b.C0978b(1), b.h.b)), "rebooking-services");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1178362213;
        }

        public final String toString() {
            return "ReBookingFromServicesFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class l extends a {
        public static final l d = new l(10, new LinkedList(e43.l(b.d.b, new b.j(0), new b.a(7), new b.C0978b(1), b.h.b)), "rebooking-new");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -991422433;
        }

        public final String toString() {
            return "ReBookingNewFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class m extends a {
        public static final m d = new m(new LinkedList(e43.l(new b.a(4), new b.C0978b(2), b.h.b)), 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1930403264;
        }

        public final String toString() {
            return "RescheduleRecordFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class n extends a {
        public static final n d = new n(new LinkedList(e43.l(new b.a(false, false, true), new b.C0978b(3), b.h.b)), 13);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -426815408;
        }

        public final String toString() {
            return "RetryRecordFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class o extends a {
        public static final o d = new o(0, new LinkedList(e43.l(new b.j(0), b.d.b, new b.a(7), new b.C0978b(3), b.h.b)), "select-service");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1535530900;
        }

        public final String toString() {
            return "ServiceFlow";
        }
    }

    /* compiled from: BookingFlow.kt */
    public static final class p extends a {
        public static final p d = new p(12, new LinkedList(e43.l(new b.j(0), new b.a(6), new b.C0978b(3), b.h.b)), "select-service-not-choice-master");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 2026488513;
        }

        public final String toString() {
            return "ServiceNotSelectMasterFlow";
        }
    }

    public a(int i2, LinkedList linkedList, String str) {
        this.a = i2;
        this.b = linkedList;
        this.c = str;
    }

    public /* synthetic */ a(LinkedList linkedList, int i2) {
        this(i2, linkedList, "");
    }
}
