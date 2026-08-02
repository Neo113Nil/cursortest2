package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: BookingEditScreenAction.kt */
/* loaded from: classes18.dex */
public interface a extends kj50 {

    /* compiled from: BookingEditScreenAction.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$a, reason: collision with other inner class name */
    public interface InterfaceC0957a extends a {

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$a$a, reason: collision with other inner class name */
        public static final class C0958a implements InterfaceC0957a {
            public static final C0958a b = new C0958a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0958a);
            }

            public final int hashCode() {
                return 1244153866;
            }

            public final String toString() {
                return "Confirm";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$a$b */
        public static final class b implements InterfaceC0957a {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("LegalClicked(url="), this.b, ')');
            }
        }
    }

    /* compiled from: BookingEditScreenAction.kt */
    public interface b extends a {

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$b$a, reason: collision with other inner class name */
        public static final class C0959a implements b {
            public static final C0959a b = new C0959a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0959a);
            }

            public final int hashCode() {
                return -1840507204;
            }

            public final String toString() {
                return "Date";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$b$b, reason: collision with other inner class name */
        public static final class C0960b implements b {
            public static final C0960b b = new C0960b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0960b);
            }

            public final int hashCode() {
                return 1056753136;
            }

            public final String toString() {
                return "Master";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1272184724;
            }

            public final String toString() {
                return "Services";
            }
        }
    }

    /* compiled from: BookingEditScreenAction.kt */
    public interface c extends a {

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$c$a, reason: collision with other inner class name */
        public static final class C0961a implements c {
            public static final C0961a b = new C0961a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0961a);
            }

            public final int hashCode() {
                return 1744522723;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1437280039;
            }

            public final String toString() {
                return "CancelDismiss";
            }
        }
    }

    /* compiled from: BookingEditScreenAction.kt */
    public interface d extends a {

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$d$a, reason: collision with other inner class name */
        public static final class C0962a implements d {
            public final boolean b;

            public C0962a(boolean z) {
                this.b = z;
            }
        }
    }

    /* compiled from: BookingEditScreenAction.kt */
    public interface e extends a {

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$e$a, reason: collision with other inner class name */
        public static final class C0963a implements e {
            public final BookingServiceModel b;

            public C0963a(BookingServiceModel bookingServiceModel) {
                this.b = bookingServiceModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0963a) && epx.f(this.b, ((C0963a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Click(service=" + this.b + ')';
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class b implements e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 383838849;
            }

            public final String toString() {
                return "ConfirmationDismiss";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class c implements e {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 492795781;
            }

            public final String toString() {
                return "ConfirmationOk";
            }
        }
    }

    /* compiled from: BookingEditScreenAction.kt */
    public interface f extends a {

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$f$a, reason: collision with other inner class name */
        public static final class C0964a implements f {
            public final String b;

            public C0964a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0964a) && epx.f(this.b, ((C0964a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CommentChange(newComment="), this.b, ')');
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class b implements f {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("FillDataFromProfileChange(fillDataFromProfile="), this.b, ')');
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class c implements f {
            public final String b;

            public c(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("NameChange(newName="), this.b, ')');
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class d implements f {
            public final String b;

            public d(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("PhoneChange(newPhone="), this.b, ')');
            }
        }
    }

    /* compiled from: BookingEditScreenAction.kt */
    public interface g extends a {

        /* compiled from: BookingEditScreenAction.kt */
        /* renamed from: com.vk.ecomm.onlinebooking.impl.edit.a$g$a, reason: collision with other inner class name */
        public static final class C0965a implements g {
            public static final C0965a b = new C0965a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0965a);
            }

            public final int hashCode() {
                return -1858750275;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class b implements g {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1602788779;
            }

            public final String toString() {
                return "Init";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class c implements g {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1687336045;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        /* compiled from: BookingEditScreenAction.kt */
        public static final class d implements g {
        }
    }
}
