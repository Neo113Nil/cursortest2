package com.vk.ecomm.onlinebooking.impl.navhostfragment;

import defpackage.q0;
import xsna.qoy;

/* compiled from: BookingNavScreen.kt */
/* loaded from: classes18.dex */
public interface b {
    public static final c a = c.a;

    /* compiled from: BookingNavScreen.kt */
    public static final class a implements b {
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a() {
            this(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Calendar(isMasterChangeable=");
            sb.append(this.b);
            sb.append(", isServiceChangeable=");
            sb.append(this.c);
            sb.append(", isEmptyDate=");
            return q0.a(sb, this.d, ')');
        }

        public /* synthetic */ a(int i) {
            this((i & 1) != 0, (i & 2) != 0, (i & 4) == 0);
        }

        public a(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }
    }

    /* compiled from: BookingNavScreen.kt */
    /* renamed from: com.vk.ecomm.onlinebooking.impl.navhostfragment.b$b, reason: collision with other inner class name */
    public static final class C0978b implements b {
        public final boolean b;
        public final boolean c;

        public C0978b() {
            this(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0978b)) {
                return false;
            }
            C0978b c0978b = (C0978b) obj;
            return this.b == c0978b.b && this.c == c0978b.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckRecord(isRescheduling=");
            sb.append(this.b);
            sb.append(", isRebooking=");
            return q0.a(sb, this.c, ')');
        }

        public C0978b(int i) {
            boolean z = (i & 1) == 0;
            boolean z2 = (i & 2) == 0;
            this.b = z;
            this.c = z2;
        }
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class c {
        public static final /* synthetic */ c a = new c();
        public static final e b = e.b;
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class d implements b {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 894849033;
        }

        public final String toString() {
            return "Masters";
        }
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class e implements b {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 4358823;
        }

        public final String toString() {
            return "Menu";
        }
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class f implements b {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 202178680;
        }

        public final String toString() {
            return "PickerDone";
        }
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class g implements b {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -368395218;
        }

        public final String toString() {
            return "Preloader";
        }
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class h implements b {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 255060658;
        }

        public final String toString() {
            return "RecordCompleted";
        }
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class i implements b {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1137003514;
        }

        public final String toString() {
            return "Records";
        }
    }

    /* compiled from: BookingNavScreen.kt */
    public static final class j implements b {
        public final boolean b;
        public final boolean c;

        public j() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && this.c == jVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Services(canGoBack=");
            sb.append(this.b);
            sb.append(", isPickerMode=");
            return q0.a(sb, this.c, ')');
        }

        public /* synthetic */ j(int i) {
            this(true, false);
        }

        public j(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }
    }
}
