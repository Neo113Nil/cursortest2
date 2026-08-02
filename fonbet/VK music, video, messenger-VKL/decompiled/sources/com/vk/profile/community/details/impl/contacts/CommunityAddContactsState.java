package com.vk.profile.community.details.impl.contacts;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.km50;
import xsna.ms9;
import xsna.qko0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommunityAddContactsState.kt */
/* loaded from: classes5.dex */
public final class CommunityAddContactsState implements km50 {
    public final UserId b;
    public final a c;
    public final a d;
    public final String e;
    public final String f;
    public final String g;
    public final List<ContactField> h;

    /* compiled from: CommunityAddContactsState.kt */
    public static final class a {
        public final String a;
        public final int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("City(title=");
            sb.append(this.a);
            sb.append(", id=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public CommunityAddContactsState(UserId userId, a aVar, a aVar2, String str, String str2, String str3, List<ContactField> list) {
        this.b = userId;
        this.c = aVar;
        this.d = aVar2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = list;
    }

    public static CommunityAddContactsState a(CommunityAddContactsState communityAddContactsState, a aVar, List list, int i) {
        UserId userId = communityAddContactsState.b;
        if ((i & 2) != 0) {
            aVar = communityAddContactsState.c;
        }
        a aVar2 = communityAddContactsState.d;
        String str = communityAddContactsState.e;
        String str2 = communityAddContactsState.f;
        String str3 = communityAddContactsState.g;
        communityAddContactsState.getClass();
        return new CommunityAddContactsState(userId, aVar, aVar2, str, str2, str3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityAddContactsState)) {
            return false;
        }
        CommunityAddContactsState communityAddContactsState = (CommunityAddContactsState) obj;
        return epx.f(this.b, communityAddContactsState.b) && epx.f(this.c, communityAddContactsState.c) && epx.f(this.d, communityAddContactsState.d) && epx.f(this.e, communityAddContactsState.e) && epx.f(this.f, communityAddContactsState.f) && epx.f(this.g, communityAddContactsState.g) && epx.f(this.h, communityAddContactsState.h);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return this.h.hashCode() + ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityAddContactsState(communityId=");
        sb.append(this.b);
        sb.append(", selectedCity=");
        sb.append(this.c);
        sb.append(", initialCity=");
        sb.append(this.d);
        sb.append(", phone=");
        sb.append(this.e);
        sb.append(", website=");
        sb.append(this.f);
        sb.append(", address=");
        sb.append(this.g);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.h);
    }

    /* compiled from: CommunityAddContactsState.kt */
    public static final class ContactField {
        public final c a;
        public final b b;
        public final a c;
        public final ContactViewType d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommunityAddContactsState.kt */
        public static final class ContactViewType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ContactViewType[] $VALUES;
            public static final ContactViewType ADDRESS;
            public static final ContactViewType CITY;
            public static final ContactViewType PHONE;
            public static final ContactViewType WEBSITE;

            static {
                ContactViewType contactViewType = new ContactViewType("PHONE", 0);
                PHONE = contactViewType;
                ContactViewType contactViewType2 = new ContactViewType("WEBSITE", 1);
                WEBSITE = contactViewType2;
                ContactViewType contactViewType3 = new ContactViewType("CITY", 2);
                CITY = contactViewType3;
                ContactViewType contactViewType4 = new ContactViewType("ADDRESS", 3);
                ADDRESS = contactViewType4;
                ContactViewType[] contactViewTypeArr = {contactViewType, contactViewType2, contactViewType3, contactViewType4};
                $VALUES = contactViewTypeArr;
                $ENTRIES = new asp(contactViewTypeArr);
            }

            public ContactViewType() {
                throw null;
            }

            public static zrp<ContactViewType> h() {
                return $ENTRIES;
            }

            public static ContactViewType valueOf(String str) {
                return (ContactViewType) Enum.valueOf(ContactViewType.class, str);
            }

            public static ContactViewType[] values() {
                return (ContactViewType[]) $VALUES.clone();
            }
        }

        /* compiled from: CommunityAddContactsState.kt */
        public static final class a {
            public final int a;
            public final int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FieldInfoResources(subheadResId=");
                sb.append(this.a);
                sb.append(", placeholderResId=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityAddContactsState.kt */
        public interface b {

            /* compiled from: CommunityAddContactsState.kt */
            public static final class a implements b {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1679164871;
                }

                public final String toString() {
                    return "Default";
                }
            }

            /* compiled from: CommunityAddContactsState.kt */
            /* renamed from: com.vk.profile.community.details.impl.contacts.CommunityAddContactsState$ContactField$b$b, reason: collision with other inner class name */
            public static final class C1552b implements b {
                public final int a;

                public C1552b(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1552b) && this.a == ((C1552b) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Error(captionTextResId="), this.a, ')');
                }
            }
        }

        public ContactField(c cVar, b bVar, a aVar, ContactViewType contactViewType) {
            this.a = cVar;
            this.b = bVar;
            this.c = aVar;
            this.d = contactViewType;
        }

        public static ContactField a(ContactField contactField, c cVar, b bVar, int i) {
            if ((i & 1) != 0) {
                cVar = contactField.a;
            }
            if ((i & 2) != 0) {
                bVar = contactField.b;
            }
            a aVar = contactField.c;
            ContactViewType contactViewType = contactField.d;
            contactField.getClass();
            return new ContactField(cVar, bVar, aVar, contactViewType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactField)) {
                return false;
            }
            ContactField contactField = (ContactField) obj;
            return epx.f(this.a, contactField.a) && epx.f(this.b, contactField.b) && epx.f(this.c, contactField.c) && this.d == contactField.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ContactField(textState=" + this.a + ", fieldState=" + this.b + ", fieldInfo=" + this.c + ", viewType=" + this.d + ')';
        }

        /* compiled from: CommunityAddContactsState.kt */
        public static final class c {
            public final String a;
            public final qko0 b;

            public c(String str, qko0 qko0Var) {
                this.a = str;
                this.b = qko0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                qko0 qko0Var = this.b;
                return hashCode + (qko0Var == null ? 0 : Long.hashCode(qko0Var.a));
            }

            public final String toString() {
                return "TextState(value=" + this.a + ", textSelection=" + this.b + ')';
            }

            public /* synthetic */ c(String str, int i) {
                this((i & 1) != 0 ? "" : str, (qko0) null);
            }
        }
    }
}
