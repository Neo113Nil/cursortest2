package com.vk.im.engine.commands.contacts;

import com.vk.contacts.AndroidContact;
import com.vk.contacts.ContactsSource;
import com.vk.im.engine.models.contacts.Contact;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bih;
import xsna.bpn0;
import xsna.c5g;
import xsna.drm0;
import xsna.e2p0;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.jgp;
import xsna.le6;
import xsna.on00;
import xsna.q2a0;
import xsna.qu20;
import xsna.vu5;
import xsna.w2w;
import xsna.zrp;

/* compiled from: ContactsSearchCmd.kt */
/* loaded from: classes2.dex */
public final class ContactsSearchCmd extends le6<c> {
    public final String b;
    public final a c;
    public final bpn0 d = new bpn0(new bih(this, 6));
    public final bpn0 e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactsSearchCmd.kt */
    public static final class MatchType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MatchType[] $VALUES;
        public static final MatchType ANY;
        public static final MatchType BY_NAME;
        public static final MatchType BY_NUMBER;

        static {
            MatchType matchType = new MatchType("BY_NAME", 0);
            BY_NAME = matchType;
            MatchType matchType2 = new MatchType("BY_NUMBER", 1);
            BY_NUMBER = matchType2;
            MatchType matchType3 = new MatchType("ANY", 2);
            ANY = matchType3;
            MatchType[] matchTypeArr = {matchType, matchType2, matchType3};
            $VALUES = matchTypeArr;
            $ENTRIES = new asp(matchTypeArr);
        }

        public MatchType() {
            throw null;
        }

        public static MatchType valueOf(String str) {
            return (MatchType) Enum.valueOf(MatchType.class, str);
        }

        public static MatchType[] values() {
            return (MatchType[]) $VALUES.clone();
        }
    }

    /* compiled from: ContactsSearchCmd.kt */
    public static abstract class a {

        /* compiled from: ContactsSearchCmd.kt */
        /* renamed from: com.vk.im.engine.commands.contacts.ContactsSearchCmd$a$a, reason: collision with other inner class name */
        public static final class C1108a extends a {
            public final List<a> a = e43.l(new c(), new b());

            @Override // com.vk.im.engine.commands.contacts.ContactsSearchCmd.a
            public final Map<Long, q2a0> a(w2w w2wVar) {
                List<a> list = this.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    linkedHashMap.putAll(((a) it.next()).a(w2wVar));
                }
                return linkedHashMap;
            }
        }

        /* compiled from: ContactsSearchCmd.kt */
        public static final class b extends a {
            @Override // com.vk.im.engine.commands.contacts.ContactsSearchCmd.a
            public final Map<Long, q2a0> a(w2w w2wVar) {
                List<Contact> all = w2wVar.I0().w().getAll();
                int e = on00.e(c5g.u(all, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj : all) {
                    linkedHashMap.put(Long.valueOf(((Contact) obj).b), obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: ContactsSearchCmd.kt */
        public static final class c extends a {
            @Override // com.vk.im.engine.commands.contacts.ContactsSearchCmd.a
            public final Map<Long, q2a0> a(w2w w2wVar) {
                if (!enj.l(w2wVar.getContext(), "android.permission.READ_CONTACTS") || !w2wVar.getConfig().l().H0()) {
                    return jgp.b;
                }
                Map<Long, AndroidContact> Y0 = w2wVar.getConfig().l().Y0(ContactsSource.SYSTEM);
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(Y0.size()));
                Iterator<T> it = Y0.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), new com.vk.im.engine.models.contacts.a((AndroidContact) entry.getValue()));
                }
                return linkedHashMap;
            }
        }

        public abstract Map<Long, q2a0> a(w2w w2wVar);
    }

    /* compiled from: ContactsSearchCmd.kt */
    public static abstract class b {

        /* compiled from: ContactsSearchCmd.kt */
        public static final class a extends b {
            public final q2a0 a;

            public a(q2a0 q2a0Var) {
                this.a = q2a0Var;
            }

            @Override // com.vk.im.engine.commands.contacts.ContactsSearchCmd.b
            public final q2a0 a() {
                return this.a;
            }
        }

        /* compiled from: ContactsSearchCmd.kt */
        /* renamed from: com.vk.im.engine.commands.contacts.ContactsSearchCmd$b$b, reason: collision with other inner class name */
        public static final class C1109b extends b {
            public final q2a0 a;

            public C1109b(q2a0 q2a0Var) {
                this.a = q2a0Var;
            }

            @Override // com.vk.im.engine.commands.contacts.ContactsSearchCmd.b
            public final q2a0 a() {
                return this.a;
            }
        }

        /* compiled from: ContactsSearchCmd.kt */
        public static final class c extends b {
            public final q2a0 a;

            public c(q2a0 q2a0Var) {
                this.a = q2a0Var;
            }

            @Override // com.vk.im.engine.commands.contacts.ContactsSearchCmd.b
            public final q2a0 a() {
                return this.a;
            }
        }

        public abstract q2a0 a();
    }

    /* compiled from: ContactsSearchCmd.kt */
    public static final class c {
        public final LinkedHashMap a;
        public final long b;

        public c(long j, LinkedHashMap linkedHashMap) {
            this.a = linkedHashMap;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(contacts=");
            sb.append(this.a);
            sb.append(", executionTimeMillis=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: ContactsSearchCmd.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchType.values().length];
            try {
                iArr[MatchType.BY_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchType.BY_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchType.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContactsSearchCmd(String str, a aVar, MatchType matchType) {
        this.b = str;
        this.c = aVar;
        this.e = new bpn0(new com.vk.catalog2.common.ui.holders.a(8, this, matchType));
    }

    public static b f(qu20 qu20Var, q2a0 q2a0Var) {
        String name = q2a0Var.name();
        bpn0 bpn0Var = qu20Var.c;
        ArrayList arrayList = ((e2p0) bpn0Var.getValue()).a;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!drm0.D(name, (String) it.next(), true)) {
                    ArrayList arrayList2 = ((e2p0) bpn0Var.getValue()).b;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!drm0.D(name, (String) it2.next(), true)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (q2a0Var.c5().length() > 0) {
            return new b.a(q2a0Var);
        }
        return new b.c(q2a0Var);
    }

    public static b g(qu20 qu20Var, q2a0 q2a0Var) {
        Object obj;
        b.C1109b c1109b = null;
        if (q2a0Var instanceof com.vk.im.engine.models.contacts.a) {
            com.vk.im.engine.models.contacts.a aVar = (com.vk.im.engine.models.contacts.a) q2a0Var;
            Iterator<T> it = aVar.b.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (qu20Var.a((String) obj)) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                c1109b = new b.C1109b(new com.vk.im.engine.models.contacts.a(AndroidContact.a(aVar.b, null, Collections.singleton(str), null, 55)));
            }
        } else {
            String c5 = q2a0Var.c5();
            if (!qu20Var.a(c5)) {
                c5 = null;
            }
            if (c5 != null) {
                c1109b = new b.C1109b(q2a0Var);
            }
        }
        return c1109b != null ? c1109b : new b.c(q2a0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.vk.im.engine.models.contacts.Contact] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.vk.im.engine.models.contacts.Contact] */
    @Override // xsna.le6
    public final c e(w2w w2wVar) {
        b f;
        long currentTimeMillis = System.currentTimeMillis();
        qu20 qu20Var = new qu20(this.b, w2wVar.c());
        a aVar = this.c;
        Map<Long, q2a0> a2 = aVar.a(w2wVar);
        Map<Long, q2a0> a3 = aVar instanceof a.b ? a2 : new a.b().a(w2wVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (q2a0 q2a0Var : a3.values()) {
            if (q2a0Var instanceof Contact) {
                Contact contact = (Contact) q2a0Var;
                linkedHashMap.put(contact.i, q2a0Var);
                linkedHashMap2.put(contact.d, q2a0Var);
                linkedHashMap2.put(contact.f, q2a0Var);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = a2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Number) entry.getKey()).longValue();
            q2a0 q2a0Var2 = (q2a0) entry.getValue();
            int i = d.$EnumSwitchMapping$0[((MatchType) this.e.getValue()).ordinal()];
            if (i == 1) {
                f = f(qu20Var, q2a0Var2);
            } else if (i == 2) {
                f = g(qu20Var, q2a0Var2);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = f(qu20Var, q2a0Var2);
                if (f instanceof b.c) {
                    f = g(qu20Var, q2a0Var2);
                }
            }
            com.vk.im.engine.models.contacts.a aVar2 = null;
            if (f instanceof b.c) {
                f = null;
            }
            if (f != null) {
                if (linkedHashMap3.get(f.a().c5()) instanceof Contact) {
                    f = null;
                }
                if (f != null) {
                    q2a0 a4 = f.a();
                    if (a4 instanceof com.vk.im.engine.models.contacts.a) {
                        com.vk.im.engine.models.contacts.a aVar3 = (com.vk.im.engine.models.contacts.a) a4;
                        AndroidContact androidContact = aVar3.b;
                        ?? r9 = (Contact) linkedHashMap.get(String.valueOf(androidContact.h));
                        if (r9 != 0) {
                            aVar3 = r9;
                        } else {
                            Iterator it2 = androidContact.e.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ?? r92 = (Contact) linkedHashMap2.get((String) it2.next());
                                if (r92 != 0) {
                                    aVar2 = r92;
                                    break;
                                }
                            }
                            if (aVar2 != null) {
                                aVar3 = aVar2;
                            }
                        }
                        linkedHashMap3.put(aVar3.c5(), aVar3);
                    } else {
                        linkedHashMap3.put(a4.c5(), a4);
                    }
                }
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(on00.e(linkedHashMap3.size()));
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            linkedHashMap4.put(Long.valueOf(((q2a0) entry2.getValue()).id()), entry2.getValue());
        }
        return new c(currentTimeMillis2 - currentTimeMillis, linkedHashMap4);
    }

    public final boolean equals(Object obj) {
        ContactsSearchCmd contactsSearchCmd = obj instanceof ContactsSearchCmd ? (ContactsSearchCmd) obj : null;
        return contactsSearchCmd != null && epx.f(contactsSearchCmd.b, this.b) && epx.f(contactsSearchCmd.c, this.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactsSearchCmd(query='" + this.b + "', source=" + this.c + ')';
    }
}
