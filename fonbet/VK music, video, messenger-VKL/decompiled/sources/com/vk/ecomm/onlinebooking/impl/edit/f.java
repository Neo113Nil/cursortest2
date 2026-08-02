package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.xl50;

/* compiled from: BookingEditScreenPatch.kt */
/* loaded from: classes18.dex */
public interface f extends xl50 {

    /* compiled from: BookingEditScreenPatch.kt */
    public interface a extends f {

        /* compiled from: BookingEditScreenPatch.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.f$a$a, reason: collision with other inner class name */
        public static final class C0966a implements a {
            public static final C0966a b = new C0966a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0966a);
            }

            public final int hashCode() {
                return 738499510;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -969383655;
            }

            public final String toString() {
                return "TooLong";
            }
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public interface b extends f {

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1374538907;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: BookingEditScreenPatch.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.f$b$b, reason: collision with other inner class name */
        public static final class C0967b implements b {
            public static final C0967b b = new C0967b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0967b);
            }

            public final int hashCode() {
                return 1481730917;
            }

            public final String toString() {
                return "CancelDismiss";
            }
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public interface c extends f {

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class a implements c {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Changed(value="), this.b, ')');
            }
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class d implements f {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -813494832;
        }

        public final String toString() {
            return "EndBookingLoading";
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class e implements f {
        public final Exception b;
        public final com.vk.ecomm.onlinebooking.impl.edit.a c;

        public e(Exception exc, com.vk.ecomm.onlinebooking.impl.edit.a aVar) {
            this.b = exc;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.f$f, reason: collision with other inner class name */
    public static final class C0968f implements f {
        public final String b;

        public C0968f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0968f) && epx.f(this.b, ((C0968f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("InfoCommentChanged(newComment="), this.b, ')');
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class g implements f {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("InfoFillDataFromProfileChanged(fillDataFromProfile="), this.b, ')');
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class h implements f {
        public final String b;

        public h(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("InfoNameChanged(newName="), this.b, ')');
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class i implements f {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("InfoPhoneChanged(newPhone="), this.b, ')');
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class j implements f {
        public final BookingEditModel b;

        public j(BookingEditModel bookingEditModel) {
            this.b = bookingEditModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ModelChanged(model=" + this.b + ')';
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public interface k extends f {

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class a implements k {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1370745554;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class b implements k {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1368857554;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class c implements k {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -729326447;
            }

            public final String toString() {
                return "TooLong";
            }
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public interface l extends f {

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class a implements l {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1343260473;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class b implements l {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -298321250;
            }

            public final String toString() {
                return "EmptyFormat";
            }
        }

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class c implements l {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -85967382;
            }

            public final String toString() {
                return "TooLong";
            }
        }

        /* compiled from: BookingEditScreenPatch.kt */
        public static final class d implements l {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1879055102;
            }

            public final String toString() {
                return "WrongFormat";
            }
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class m implements f {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            ((m) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SetServiceToDelete(service=null)";
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class n implements f {
        public final BookingSettings b;

        public n(BookingSettings bookingSettings) {
            this.b = bookingSettings;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SettingsChanged(settings=" + this.b + ')';
        }
    }

    /* compiled from: BookingEditScreenPatch.kt */
    public static final class o implements f {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 2079423639;
        }

        public final String toString() {
            return "StartBookingLoading";
        }
    }
}
