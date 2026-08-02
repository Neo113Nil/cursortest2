package com.vk.im.engine.models;

import android.os.Parcelable;
import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.f1e0;
import xsna.j5g;
import xsna.jgp;
import xsna.on00;
import xsna.pn00;
import xsna.qtd0;
import xsna.rl3;
import xsna.wpp;
import xsna.zcl;

/* compiled from: ProfilesInfo.kt */
/* loaded from: classes.dex */
public final class ProfilesInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ProfilesInfo> CREATOR = new b();
    public final wpp<Long, User> b;
    public final wpp<Long, Contact> c;
    public final wpp<Long, Email> d;
    public final wpp<Long, Group> e;
    public final wpp<Long, Channel> f;
    public final Object g;

    /* compiled from: ProfilesInfo.kt */
    public static final class a {
        public static final void a(wpp wppVar, Serializer serializer) {
            Serializer.c<ProfilesInfo> cVar = ProfilesInfo.CREATOR;
            serializer.Z(j5g.P0(wppVar.b));
            serializer.Z(j5g.P0(wppVar.a));
            serializer.c0(wppVar.c);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ProfilesInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfilesInfo a(Serializer serializer) {
            return new ProfilesInfo(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfilesInfo[i];
        }
    }

    public /* synthetic */ ProfilesInfo(wpp wppVar, wpp wppVar2, wpp wppVar3, wpp wppVar4, wpp wppVar5, int i, zcl zclVar) {
        this((wpp<Long, User>) ((i & 1) != 0 ? new wpp() : wppVar), (wpp<Long, Contact>) ((i & 2) != 0 ? new wpp() : wppVar2), (wpp<Long, Email>) ((i & 4) != 0 ? new wpp() : wppVar3), (wpp<Long, Group>) ((i & 8) != 0 ? new wpp() : wppVar4), (wpp<Long, Channel>) ((i & 16) != 0 ? new wpp() : wppVar5));
    }

    public final f1e0 Ab() {
        return new f1e0(this.b.a(), this.c.a(), this.d.a(), this.e.a(), this.f.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final qtd0 Bb(Peer peer) {
        wpp wppVar;
        HashMap hashMap;
        if (peer == null || (wppVar = (wpp) this.g.get(peer.c)) == null || (hashMap = wppVar.c) == null) {
            return null;
        }
        return (qtd0) hashMap.get(Long.valueOf(peer.d));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final qtd0 Cb(Long l) {
        HashMap hashMap;
        if (l == null) {
            return null;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        wpp wppVar = (wpp) this.g.get(Peer.a.f(l.longValue()));
        if (wppVar == null || (hashMap = wppVar.c) == null) {
            return null;
        }
        return (qtd0) hashMap.get(Long.valueOf(Peer.a.d(l.longValue())));
    }

    public final f1e0 Db() {
        return new f1e0(this.b.c.keySet(), this.c.c.keySet(), this.d.c.keySet(), this.e.c.keySet(), this.f.c.keySet());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean Eb() {
        ?? r0 = this.g;
        if (r0.isEmpty()) {
            return false;
        }
        Iterator it = r0.entrySet().iterator();
        while (it.hasNext()) {
            if (!((wpp) ((Map.Entry) it.next()).getValue()).b.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean Fb() {
        ?? r0 = this.g;
        if (r0.isEmpty()) {
            return false;
        }
        Iterator it = r0.entrySet().iterator();
        while (it.hasNext()) {
            if (!((wpp) ((Map.Entry) it.next()).getValue()).a.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Gb() {
        return Eb() || Fb();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    public final void Hb(ProfilesInfo profilesInfo) {
        ?? r10 = profilesInfo.g;
        for (Map.Entry entry : this.g.entrySet()) {
            Peer.Type type = (Peer.Type) entry.getKey();
            wpp wppVar = (wpp) entry.getValue();
            if (type == Peer.Type.EMAIL) {
                wpp wppVar2 = (wpp) r10.get(type);
                Map t = pn00.t(wppVar.c);
                wppVar.m(wppVar2);
                HashMap hashMap = wppVar.c;
                ArrayList arrayList = new ArrayList(t.size());
                Iterator it = t.entrySet().iterator();
                while (it.hasNext()) {
                    Email email = (Email) ((Map.Entry) it.next()).getValue();
                    Object obj = hashMap.get(email.Bb());
                    if (obj == null) {
                        obj = email;
                    }
                    String Ab = ((Email) obj).Ab();
                    String obj2 = Ab != null ? drm0.p0(Ab).toString() : null;
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    if (drm0.N(obj2)) {
                        obj2 = drm0.p0(email.Ab()).toString();
                    }
                    arrayList.add(Email.zb(email, obj2));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    long longValue = ((Number) entry2.getKey()).longValue();
                    Email email2 = (Email) entry2.getValue();
                    if (t.get(Long.valueOf(longValue)) == null) {
                        arrayList2.add(email2);
                    }
                }
                int e = on00.e(c5g.u(arrayList2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    linkedHashMap.put(((Email) next).Bb(), next);
                }
                wppVar.r(linkedHashMap);
            } else {
                wppVar.m((wpp) r10.get(type));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.f1e0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.util.ArraySet] */
    public final f1e0 Ib(ProfilesInfo profilesInfo) {
        ?? r5;
        ?? f1e0Var = new f1e0();
        for (Map.Entry entry : this.g.entrySet()) {
            wpp wppVar = (wpp) profilesInfo.g.get(entry.getKey());
            if (wppVar != null) {
                wpp wppVar2 = (wpp) entry.getValue();
                r5 = wppVar2.g(wppVar);
                if (!r5.isEmpty()) {
                    Iterator it = r5.iterator();
                    while (it.hasNext()) {
                        wppVar2.l(it.next(), wppVar);
                    }
                }
            } else {
                r5 = EmptyList.b;
            }
            f1e0Var.b((Peer.Type) entry.getKey(), r5);
        }
        return f1e0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void Jb(qtd0 qtd0Var) {
        ((wpp) this.g.get(qtd0Var.t8())).p(Long.valueOf(qtd0Var.id()), qtd0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void Kb(ProfilesInfo profilesInfo) {
        ?? r4 = profilesInfo.g;
        for (Map.Entry entry : this.g.entrySet()) {
            ((wpp) entry.getValue()).o((wpp) r4.get((Peer.Type) entry.getKey()));
        }
    }

    public final void Lb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Jb((qtd0) it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final void Mb(ProfilesInfo profilesInfo) {
        for (Map.Entry entry : this.g.entrySet()) {
            wpp wppVar = (wpp) entry.getValue();
            wpp wppVar2 = (wpp) profilesInfo.g.get(entry.getKey());
            wppVar.c.clear();
            wppVar.a.clear();
            wppVar.b.clear();
            wppVar.o(wppVar2);
        }
    }

    public final f1e0 Nb() {
        return new f1e0(this.b.n(), this.c.n(), this.d.n(), this.e.n(), this.f.n());
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        a.a(this.b, serializer);
        a.a(this.c, serializer);
        a.a(this.d, serializer);
        a.a(this.e, serializer);
        a.a(this.f, serializer);
    }

    public final ProfilesSimpleInfo Ob() {
        return new ProfilesSimpleInfo(this.b.c, this.c.c, this.d.c, this.e.c, this.f.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilesInfo)) {
            return false;
        }
        ProfilesInfo profilesInfo = (ProfilesInfo) obj;
        return epx.f(this.b, profilesInfo.b) && epx.f(this.c, profilesInfo.c) && epx.f(this.d, profilesInfo.d) && epx.f(this.e, profilesInfo.e) && epx.f(this.f, profilesInfo.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean isEmpty() {
        ?? r0 = this.g;
        if (r0.isEmpty()) {
            return true;
        }
        Iterator it = r0.entrySet().iterator();
        while (it.hasNext()) {
            if (!((wpp) ((Map.Entry) it.next()).getValue()).i()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "ProfilesInfo(users=" + this.b + ", contacts=" + this.c + ", emails=" + this.d + ", groups=" + this.e + ", channels=" + this.f + ')';
    }

    public final f1e0 zb() {
        return new f1e0(this.b.a, this.c.a, this.d.a, this.e.a, this.f.a);
    }

    public ProfilesInfo(wpp<Long, User> wppVar, wpp<Long, Contact> wppVar2, wpp<Long, Email> wppVar3, wpp<Long, Group> wppVar4, wpp<Long, Channel> wppVar5) {
        this.b = wppVar;
        this.c = wppVar2;
        this.d = wppVar3;
        this.e = wppVar4;
        this.f = wppVar5;
        this.g = pn00.k(new Pair(Peer.Type.USER, wppVar), new Pair(Peer.Type.CONTACT, wppVar2), new Pair(Peer.Type.EMAIL, wppVar3), new Pair(Peer.Type.GROUP, wppVar4), new Pair(Peer.Type.CHANNEL, wppVar5), new Pair(Peer.Type.UNKNOWN, new wpp()));
    }

    public ProfilesInfo(qtd0 qtd0Var) {
        this(Collections.singletonList(qtd0Var));
    }

    public ProfilesInfo() {
        this((wpp<Long, User>) new wpp(), (wpp<Long, Contact>) new wpp(), (wpp<Long, Email>) new wpp(), (wpp<Long, Group>) new wpp(), (wpp<Long, Channel>) new wpp());
    }

    public ProfilesInfo(Map<Long, User> map, Map<Long, Contact> map2, Map<Long, Email> map3, Map<Long, Group> map4, Map<Long, Channel> map5) {
        this((wpp<Long, User>) new wpp(map), (wpp<Long, Contact>) new wpp(map2), (wpp<Long, Email>) new wpp(map3), (wpp<Long, Group>) new wpp(map4), (wpp<Long, Channel>) new wpp(map5));
    }

    public ProfilesInfo(ProfilesInfo profilesInfo, ProfilesInfo profilesInfo2) {
        this();
        Kb(profilesInfo);
        Kb(profilesInfo2);
    }

    public ProfilesInfo(ProfilesSimpleInfo profilesSimpleInfo) {
        this(profilesSimpleInfo.Fb(), profilesSimpleInfo.Cb(), profilesSimpleInfo.Db(), profilesSimpleInfo.Eb(), profilesSimpleInfo.Bb());
    }

    public ProfilesInfo(ProfilesInfo profilesInfo) {
        this(profilesInfo.b.c(), profilesInfo.c.c(), profilesInfo.d.c(), profilesInfo.e.c(), profilesInfo.f.c());
    }

    public ProfilesInfo(Collection<? extends qtd0> collection) {
        this();
        for (qtd0 qtd0Var : collection) {
            if (qtd0Var instanceof User) {
                this.b.p(((User) qtd0Var).Eb(), qtd0Var);
            } else if (qtd0Var instanceof Email) {
                this.d.p(((Email) qtd0Var).Bb(), qtd0Var);
            } else if (qtd0Var instanceof Group) {
                this.e.p(((Group) qtd0Var).Ab(), qtd0Var);
            } else if (qtd0Var instanceof Contact) {
                this.c.p(((Contact) qtd0Var).Ab(), qtd0Var);
            } else if (qtd0Var instanceof Channel) {
                this.f.p(((Channel) qtd0Var).Bb(), qtd0Var);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfilesInfo(Serializer serializer, zcl zclVar) {
        this((wpp<Long, User>) r2, (wpp<Long, Contact>) r3, (wpp<Long, Email>) r4, (wpp<Long, Group>) r5, (wpp<Long, Channel>) r6);
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        Collection x0;
        Collection x02;
        Collection x03;
        Collection x04;
        Collection x05;
        Collection x06;
        Collection x07;
        Collection x08;
        Collection x09;
        Collection x010;
        wpp wppVar = new wpp();
        long[] e = serializer.e();
        wppVar.s((e == null || (x010 = rl3.x0(e)) == null) ? EmptySet.b : x010);
        long[] e2 = serializer.e();
        wppVar.t((e2 == null || (x09 = rl3.x0(e2)) == null) ? EmptySet.b : x09);
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u = serializer.u();
            ?? r1 = jgp.b;
            if (u >= 0) {
                linkedHashMap = new LinkedHashMap();
                for (int i = 0; i < u; i++) {
                    Long valueOf = Long.valueOf(serializer.w());
                    Parcelable A = serializer.A(User.class.getClassLoader());
                    if (A != null) {
                        linkedHashMap.put(valueOf, A);
                    }
                }
            } else {
                linkedHashMap = r1;
            }
            wppVar.r(linkedHashMap);
            wpp wppVar2 = new wpp();
            long[] e3 = serializer.e();
            wppVar2.s((e3 == null || (x08 = rl3.x0(e3)) == null) ? EmptySet.b : x08);
            long[] e4 = serializer.e();
            wppVar2.t((e4 == null || (x07 = rl3.x0(e4)) == null) ? EmptySet.b : x07);
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
            try {
                int u2 = serializer.u();
                if (u2 >= 0) {
                    linkedHashMap2 = new LinkedHashMap();
                    for (int i2 = 0; i2 < u2; i2++) {
                        Long valueOf2 = Long.valueOf(serializer.w());
                        Parcelable A2 = serializer.A(Contact.class.getClassLoader());
                        if (A2 != null) {
                            linkedHashMap2.put(valueOf2, A2);
                        }
                    }
                } else {
                    linkedHashMap2 = r1;
                }
                wppVar2.r(linkedHashMap2);
                wpp wppVar3 = new wpp();
                long[] e5 = serializer.e();
                wppVar3.s((e5 == null || (x06 = rl3.x0(e5)) == null) ? EmptySet.b : x06);
                long[] e6 = serializer.e();
                wppVar3.t((e6 == null || (x05 = rl3.x0(e6)) == null) ? EmptySet.b : x05);
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                try {
                    int u3 = serializer.u();
                    if (u3 >= 0) {
                        linkedHashMap3 = new LinkedHashMap();
                        for (int i3 = 0; i3 < u3; i3++) {
                            Long valueOf3 = Long.valueOf(serializer.w());
                            Parcelable A3 = serializer.A(Email.class.getClassLoader());
                            if (A3 != null) {
                                linkedHashMap3.put(valueOf3, A3);
                            }
                        }
                    } else {
                        linkedHashMap3 = r1;
                    }
                    wppVar3.r(linkedHashMap3);
                    wpp wppVar4 = new wpp();
                    long[] e7 = serializer.e();
                    wppVar4.s((e7 == null || (x04 = rl3.x0(e7)) == null) ? EmptySet.b : x04);
                    long[] e8 = serializer.e();
                    wppVar4.t((e8 == null || (x03 = rl3.x0(e8)) == null) ? EmptySet.b : x03);
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                    try {
                        int u4 = serializer.u();
                        if (u4 >= 0) {
                            linkedHashMap4 = new LinkedHashMap();
                            for (int i4 = 0; i4 < u4; i4++) {
                                Long valueOf4 = Long.valueOf(serializer.w());
                                Parcelable A4 = serializer.A(Group.class.getClassLoader());
                                if (A4 != null) {
                                    linkedHashMap4.put(valueOf4, A4);
                                }
                            }
                        } else {
                            linkedHashMap4 = r1;
                        }
                        wppVar4.r(linkedHashMap4);
                        wpp wppVar5 = new wpp();
                        long[] e9 = serializer.e();
                        wppVar5.s((e9 == null || (x02 = rl3.x0(e9)) == null) ? EmptySet.b : x02);
                        long[] e10 = serializer.e();
                        wppVar5.t((e10 == null || (x0 = rl3.x0(e10)) == null) ? EmptySet.b : x0);
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
                        try {
                            int u5 = serializer.u();
                            if (u5 >= 0) {
                                r1 = new LinkedHashMap();
                                for (int i5 = 0; i5 < u5; i5++) {
                                    Long valueOf5 = Long.valueOf(serializer.w());
                                    Parcelable A5 = serializer.A(Channel.class.getClassLoader());
                                    if (A5 != null) {
                                        r1.put(valueOf5, A5);
                                    }
                                }
                            }
                            wppVar5.r(r1);
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    if (th instanceof Serializer.DeserializationError) {
                        throw th;
                    }
                    Serializer.DeserializationError deserializationError = new Serializer.DeserializationError(null, th);
                }
            } finally {
                if (th instanceof Serializer.DeserializationError) {
                    throw th;
                }
                Serializer.DeserializationError deserializationError2 = new Serializer.DeserializationError(null, th);
            }
        } finally {
            if (th instanceof Serializer.DeserializationError) {
                throw th;
            }
            Serializer.DeserializationError deserializationError3 = new Serializer.DeserializationError(null, th);
        }
    }
}
