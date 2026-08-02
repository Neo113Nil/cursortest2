package com.vk.voip.ui.settings.participants_view;

import com.vk.voip.dto.call_member.CallMemberId;
import defpackage.q0;
import java.util.Set;
import xsna.epx;
import xsna.ho8;
import xsna.ur;

/* compiled from: CallParticipantsViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class j {

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class a extends j {
        public static final a a = new a();
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class b extends j {
        public final Set<String> a;

        public b(Set<String> set) {
            this.a = set;
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
            return ur.c(new StringBuilder("AddToCallStart(ids="), this.a, ')');
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class c extends j {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AddToInviteList(id="), this.a, ')');
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static abstract class d extends j {

        /* compiled from: CallParticipantsViewEvent.kt */
        public static final class a extends d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1443239683;
            }

            public final String toString() {
                return "EndCallForAll";
            }
        }

        /* compiled from: CallParticipantsViewEvent.kt */
        public static final class b extends d {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1451158423;
            }

            public final String toString() {
                return "LowerHandsForAll";
            }
        }

        /* compiled from: CallParticipantsViewEvent.kt */
        public static final class c extends d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 475315866;
            }

            public final String toString() {
                return "MuteMicrophonesForAll";
            }
        }

        /* compiled from: CallParticipantsViewEvent.kt */
        /* renamed from: com.vk.voip.ui.settings.participants_view.j$d$d, reason: collision with other inner class name */
        public static final class C2089d extends d {
            public static final C2089d a = new C2089d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2089d);
            }

            public final int hashCode() {
                return 1510129307;
            }

            public final String toString() {
                return "RequestMediaForAll";
            }
        }

        /* compiled from: CallParticipantsViewEvent.kt */
        public static final class e extends d {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 615414050;
            }

            public final String toString() {
                return "TurnOffCamerasForAll";
            }
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class e extends j {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1751248992;
        }

        public final String toString() {
            return "OnClickInviteSelectedMembers";
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class f extends j {
        public static final f a = new f();
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class g extends j {
        public final CallMemberId a;
        public final boolean b = true;

        public g(CallMemberId callMemberId) {
            this.a = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && this.b == gVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PromoteWaitingUser(id=");
            sb.append(this.a);
            sb.append(", isPromote=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class h extends j {
        public static final h a = new h();
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class i extends j {
        public final String a;

        public i(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("RemoveFromInviteList(id="), this.a, ')');
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    /* renamed from: com.vk.voip.ui.settings.participants_view.j$j, reason: collision with other inner class name */
    public static final class C2090j extends j {
        public static final C2090j a = new C2090j();
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class k extends j {
        public final CallMemberId a;

        public k(CallMemberId callMemberId) {
            this.a = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RequestParticipantSettings(id=" + this.a + ')';
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class l extends j {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(query="), this.a, ')');
        }
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class m extends j {
        public static final m a = new m();
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class n extends j {
        public static final n a = new n();
    }

    /* compiled from: CallParticipantsViewEvent.kt */
    public static final class o extends j {
        public static final o a = new o();
    }
}
