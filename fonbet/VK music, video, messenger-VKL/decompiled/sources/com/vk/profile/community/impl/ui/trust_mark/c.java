package com.vk.profile.community.impl.ui.trust_mark;

import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import xsna.epx;
import xsna.ho8;

/* compiled from: CommunityTrustMarksEvent.kt */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: CommunityTrustMarksEvent.kt */
    public static final class a implements c {
        public final CommunityTrustMarksArgs.ActionButton.Type a;

        public a(CommunityTrustMarksArgs.ActionButton.Type type) {
            this.a = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ActionButtonClick(type=" + this.a + ')';
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    public static final class b implements c {
        public final CommunityTrustMarksArgs.TrustMarkData.Type a;
        public final CommunityTrustMarksArgs.AdminButtons b;

        public b(CommunityTrustMarksArgs.TrustMarkData.Type type, CommunityTrustMarksArgs.AdminButtons adminButtons) {
            this.a = type;
            this.b = adminButtons;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AdminButtonClick(type=" + this.a + ", urls=" + this.b + ')';
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    /* renamed from: com.vk.profile.community.impl.ui.trust_mark.c$c, reason: collision with other inner class name */
    public static final class C1630c implements c {
        public static final C1630c a = new C1630c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1630c);
        }

        public final int hashCode() {
            return 339522661;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    public static final class d implements c {
        public final String a;

        public d(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OnPhoneClick(phone="), this.a, ')');
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    public static final class e implements c {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1528965473;
        }

        public final String toString() {
            return "OnShowAllLinksClick";
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    public static final class f implements c {
        public final String a;

        public f(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OpenLink(url="), this.a, ')');
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    public static final class g implements c {
        public final CommunityTrustMarksArgs.TrustMarkData.Type a;

        public g(CommunityTrustMarksArgs.TrustMarkData.Type type) {
            this.a = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TrustMarkClick(type=" + this.a + ')';
        }
    }
}
