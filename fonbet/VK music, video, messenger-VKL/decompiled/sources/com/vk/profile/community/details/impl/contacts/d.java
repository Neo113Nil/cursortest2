package com.vk.profile.community.details.impl.contacts;

import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import xsna.epx;
import xsna.qko0;
import xsna.urd0;
import xsna.xl50;

/* compiled from: CommunityAddContactsPatch.kt */
/* loaded from: classes5.dex */
public interface d extends xl50 {

    /* compiled from: CommunityAddContactsPatch.kt */
    public static final class a implements d {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1251042224;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CommunityAddContactsPatch.kt */
    public static final class b implements d {
        public final CommunityAddContactsState.ContactField.ContactViewType b;
        public final CommunityAddContactsState.ContactField.b c;

        public b(CommunityAddContactsState.ContactField.ContactViewType contactViewType, CommunityAddContactsState.ContactField.b bVar) {
            this.b = contactViewType;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateContactItemFieldState(viewType=" + this.b + ", fieldState=" + this.c + ')';
        }
    }

    /* compiled from: CommunityAddContactsPatch.kt */
    public static final class c implements d {
        public final CommunityAddContactsState.ContactField.ContactViewType b;
        public final String c;
        public final qko0 d;

        public c(CommunityAddContactsState.ContactField.ContactViewType contactViewType, String str, qko0 qko0Var) {
            this.b = contactViewType;
            this.c = str;
            this.d = qko0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(this.b.hashCode() * 31, 31, this.c);
            qko0 qko0Var = this.d;
            return a + (qko0Var == null ? 0 : Long.hashCode(qko0Var.a));
        }

        public final String toString() {
            return "UpdateContactItemText(viewType=" + this.b + ", text=" + this.c + ", textSelection=" + this.d + ')';
        }
    }

    /* compiled from: CommunityAddContactsPatch.kt */
    /* renamed from: com.vk.profile.community.details.impl.contacts.d$d, reason: collision with other inner class name */
    public static final class C1554d implements d {
        public final CommunityAddContactsState.a b;

        public C1554d(CommunityAddContactsState.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1554d) && epx.f(this.b, ((C1554d) obj).b);
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
