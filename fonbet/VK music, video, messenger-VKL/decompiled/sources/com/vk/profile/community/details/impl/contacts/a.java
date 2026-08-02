package com.vk.profile.community.details.impl.contacts;

import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import defpackage.q0;
import xsna.epx;
import xsna.kj50;
import xsna.qko0;
import xsna.urd0;

/* compiled from: CommunityAddContactsAction.kt */
/* loaded from: classes5.dex */
public interface a extends kj50 {

    /* compiled from: CommunityAddContactsAction.kt */
    /* renamed from: com.vk.profile.community.details.impl.contacts.a$a, reason: collision with other inner class name */
    public static final class C1553a implements a {
        public static final C1553a b = new C1553a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1553a);
        }

        public final int hashCode() {
            return 1959587822;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CommunityAddContactsAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -742787813;
        }

        public final String toString() {
            return "OpenSelectCityScreen";
        }
    }

    /* compiled from: CommunityAddContactsAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1959873627;
        }

        public final String toString() {
            return "Save";
        }
    }

    /* compiled from: CommunityAddContactsAction.kt */
    public static final class d implements a {
        public final CommunityAddContactsState.ContactField.ContactViewType b;
        public final boolean c;

        public d(CommunityAddContactsState.ContactField.ContactViewType contactViewType, boolean z) {
            this.b = contactViewType;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateFieldOnFocusChanged(type=");
            sb.append(this.b);
            sb.append(", isFocused=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityAddContactsAction.kt */
    public static final class e implements a {
        public final CommunityAddContactsState.ContactField.ContactViewType b;
        public final String c;
        public final qko0 d;

        public e(CommunityAddContactsState.ContactField.ContactViewType contactViewType, String str, qko0 qko0Var) {
            this.b = contactViewType;
            this.c = str;
            this.d = qko0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(this.b.hashCode() * 31, 31, this.c);
            qko0 qko0Var = this.d;
            return a + (qko0Var == null ? 0 : Long.hashCode(qko0Var.a));
        }

        public final String toString() {
            return "UpdateFieldText(type=" + this.b + ", text=" + this.c + ", textSelection=" + this.d + ')';
        }
    }

    /* compiled from: CommunityAddContactsAction.kt */
    public static final class f implements a {
        public final CommunityAddContactsState.a b;

        public f(CommunityAddContactsState.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            CommunityAddContactsState.a aVar = this.b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "UpdateSelectedCity(selectedCity=" + this.b + ')';
        }
    }
}
