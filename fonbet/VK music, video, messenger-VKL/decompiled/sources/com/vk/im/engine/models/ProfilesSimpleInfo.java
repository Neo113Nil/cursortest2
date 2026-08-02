package com.vk.im.engine.models;

import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.g5g;
import xsna.j5g;
import xsna.jgp;
import xsna.pn00;
import xsna.qtd0;
import xsna.ttp0;
import xsna.uf3;
import xsna.zcl;

/* compiled from: ProfilesSimpleInfo.kt */
/* loaded from: classes2.dex */
public final class ProfilesSimpleInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ProfilesSimpleInfo> CREATOR = new a();
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final Object g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProfilesSimpleInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfilesSimpleInfo a(Serializer serializer) {
            return new ProfilesSimpleInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfilesSimpleInfo[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ProfilesSimpleInfo(Map map, Map map2, Map map3, Map map4, Map map5, int i, zcl zclVar) {
        this((Map<Long, User>) (r8 != 0 ? r0 : map), (Map<Long, Contact>) ((i & 2) != 0 ? r0 : map2), (Map<Long, Email>) ((i & 4) != 0 ? r0 : map3), (Map<Long, Group>) ((i & 8) != 0 ? r0 : map4), (Map<Long, Channel>) ((i & 16) != 0 ? r0 : map5));
        int i2 = i & 1;
        jgp jgpVar = jgp.b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final qtd0 Ab(Long l) {
        if (l == null) {
            return null;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Map map = (Map) this.g.get(Peer.a.f(l.longValue()));
        if (map != null) {
            return (qtd0) map.get(Long.valueOf(Peer.a.d(l.longValue())));
        }
        return null;
    }

    public final LinkedHashMap Bb() {
        return this.f;
    }

    public final LinkedHashMap Cb() {
        return this.c;
    }

    public final LinkedHashMap Db() {
        return this.d;
    }

    public final LinkedHashMap Eb() {
        return this.e;
    }

    public final Map<Long, User> Fb() {
        return this.b;
    }

    public final boolean Gb() {
        return !isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final void Hb(ProfilesSimpleInfo profilesSimpleInfo) {
        for (Map.Entry entry : this.g.entrySet()) {
            ((Map) entry.getValue()).putAll((Map) profilesSimpleInfo.g.get(entry.getKey()));
        }
    }

    public final ProfilesSimpleInfo Ib(ProfilesSimpleInfo profilesSimpleInfo) {
        ProfilesSimpleInfo profilesSimpleInfo2 = new ProfilesSimpleInfo(this);
        if (profilesSimpleInfo == null) {
            profilesSimpleInfo = new ProfilesSimpleInfo();
        }
        profilesSimpleInfo2.Hb(profilesSimpleInfo);
        return profilesSimpleInfo2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final void Jb(ProfilesSimpleInfo profilesSimpleInfo) {
        for (Map.Entry entry : this.g.entrySet()) {
            ((Map) entry.getValue()).putAll((Map) profilesSimpleInfo.g.get(entry.getKey()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void Kb(qtd0 qtd0Var) {
        Map map = (Map) this.g.get(qtd0Var.t8());
        if (map != null) {
        }
    }

    public final void Lb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Kb((qtd0) it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List<qtd0> Mb() {
        Collection values = this.g.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            g5g.y(((Map) it.next()).values(), arrayList);
        }
        return arrayList;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(j5g.O0(this.b.values()));
        serializer.o0(j5g.O0(this.c.values()));
        serializer.o0(j5g.O0(this.d.values()));
        serializer.o0(j5g.O0(this.e.values()));
        serializer.o0(j5g.O0(this.f.values()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ProfilesSimpleInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) obj;
        return epx.f(this.b, profilesSimpleInfo.b) && epx.f(this.c, profilesSimpleInfo.c) && epx.f(this.d, profilesSimpleInfo.d) && epx.f(this.e, profilesSimpleInfo.e) && epx.f(this.f, profilesSimpleInfo.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + uf3.b(this.e, uf3.b(this.d, uf3.b(this.c, this.b.hashCode() * 31, 31), 31), 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean isEmpty() {
        ?? r0 = this.g;
        if (r0.isEmpty()) {
            return true;
        }
        Iterator it = r0.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Map) ((Map.Entry) it.next()).getValue()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final qtd0 zb(Peer peer) {
        Map map;
        if (peer == null || (map = (Map) this.g.get(peer.c)) == null) {
            return null;
        }
        return (qtd0) map.get(Long.valueOf(peer.d));
    }

    public ProfilesSimpleInfo(Map<Long, User> map, Map<Long, Contact> map2, Map<Long, Email> map3, Map<Long, Group> map4, Map<Long, Channel> map5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        this.d = linkedHashMap3;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        this.e = linkedHashMap4;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        this.f = linkedHashMap5;
        this.g = pn00.k(new Pair(Peer.Type.USER, ttp0.c(linkedHashMap)), new Pair(Peer.Type.CONTACT, ttp0.c(linkedHashMap2)), new Pair(Peer.Type.EMAIL, ttp0.c(linkedHashMap3)), new Pair(Peer.Type.GROUP, ttp0.c(linkedHashMap4)), new Pair(Peer.Type.CHANNEL, ttp0.c(linkedHashMap5)), new Pair(Peer.Type.UNKNOWN, new LinkedHashMap()));
        linkedHashMap.putAll(map);
        linkedHashMap2.putAll(map2);
        linkedHashMap3.putAll(map3);
        linkedHashMap4.putAll(map4);
        linkedHashMap5.putAll(map5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfilesSimpleInfo() {
        this(r1, r1, r1, r1, r1);
        EmptyList emptyList = EmptyList.b;
    }

    public ProfilesSimpleInfo(Collection collection, Collection collection2, Collection collection3, Collection collection4, Collection collection5, int i, zcl zclVar) {
        this((Collection<User>) ((i & 1) != 0 ? EmptyList.b : collection), (Collection<Contact>) ((i & 2) != 0 ? EmptyList.b : collection2), (Collection<Email>) ((i & 4) != 0 ? EmptyList.b : collection3), (Collection<Group>) ((i & 8) != 0 ? EmptyList.b : collection4), (Collection<Channel>) ((i & 16) != 0 ? EmptyList.b : collection5));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfilesSimpleInfo(Collection<? extends qtd0> collection) {
        this(r1, r2, r3, r4, r5);
        Collection<? extends qtd0> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection2) {
            if (((qtd0) obj).t8() == Peer.Type.USER) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection2) {
            if (((qtd0) obj2).t8() == Peer.Type.GROUP) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : collection2) {
            if (((qtd0) obj3).t8() == Peer.Type.CONTACT) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : collection2) {
            if (((qtd0) obj4).t8() == Peer.Type.EMAIL) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : collection2) {
            if (((qtd0) obj5).t8() == Peer.Type.CHANNEL) {
                arrayList5.add(obj5);
            }
        }
    }

    public ProfilesSimpleInfo(ProfilesSimpleInfo profilesSimpleInfo) {
        this();
        Jb(profilesSimpleInfo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfilesSimpleInfo(Collection<User> collection, Collection<Contact> collection2, Collection<Email> collection3, Collection<Group> collection4, Collection<Channel> collection5) {
        this(r1, r2, r3, r4, r5);
        HashMap hashMap = new HashMap(collection.size());
        for (User user : collection) {
            hashMap.put(Long.valueOf(user.b), user);
        }
        HashMap hashMap2 = new HashMap(collection2.size());
        for (Contact contact : collection2) {
            hashMap2.put(Long.valueOf(contact.b), contact);
        }
        HashMap hashMap3 = new HashMap(collection3.size());
        for (Email email : collection3) {
            hashMap3.put(Long.valueOf(email.b), email);
        }
        HashMap hashMap4 = new HashMap(collection4.size());
        for (Group group : collection4) {
            hashMap4.put(Long.valueOf(group.b), group);
        }
        HashMap hashMap5 = new HashMap(collection5.size());
        for (Channel channel : collection5) {
            hashMap5.put(Long.valueOf(channel.b), channel);
        }
    }

    public ProfilesSimpleInfo(Serializer serializer, zcl zclVar) {
        this(serializer.j(User.CREATOR), serializer.j(Contact.CREATOR), serializer.j(Email.CREATOR), serializer.j(Group.CREATOR), serializer.j(Channel.CREATOR));
    }
}
