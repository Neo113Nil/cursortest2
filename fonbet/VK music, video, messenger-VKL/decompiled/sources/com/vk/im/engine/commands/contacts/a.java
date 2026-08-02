package com.vk.im.engine.commands.contacts;

import com.vk.api.generated.account.dto.AccountGetContactListResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bz2;
import xsna.c5g;
import xsna.cq;
import xsna.czh0;
import xsna.d1e0;
import xsna.dq;
import xsna.e43;
import xsna.epx;
import xsna.g1e0;
import xsna.j5g;
import xsna.lq;
import xsna.mla;
import xsna.qoy;
import xsna.qtd0;
import xsna.tfx;
import xsna.w2w;
import xsna.wpp;
import xsna.xl6;
import xsna.zcl;

/* compiled from: ContactsGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class a extends xl6<List<? extends qtd0>> {
    public final Source b;
    public final boolean c;
    public final Object d;
    public final boolean e;

    /* compiled from: ContactsGetAllCmd.kt */
    /* renamed from: com.vk.im.engine.commands.contacts.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1110a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ a(Source source, Object obj, int i) {
        this(source, true, (i & 4) != 0 ? null : obj, (i & 8) == 0);
    }

    @Override // xsna.m2w
    public final String a() {
        if (C1110a.$EnumSwitchMapping$0[this.b.ordinal()] == 1) {
            return null;
        }
        return "im-contacts-sync";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        int i = C1110a.$EnumSwitchMapping$0[this.b.ordinal()];
        boolean z = true;
        if (i == 1) {
            return g(w2wVar, Source.CACHE);
        }
        if (i == 2) {
            return f(w2wVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList g = g(w2wVar, Source.ACTUAL);
        if (!g.isEmpty()) {
            Iterator it = g.iterator();
            while (it.hasNext()) {
                qtd0 qtd0Var = (qtd0) it.next();
                User user = qtd0Var instanceof User ? (User) qtd0Var : null;
                if (user != null ? user.E : false) {
                    break;
                }
            }
        }
        z = false;
        return (z || g.isEmpty()) ? f(w2wVar) : g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final ArrayList f(w2w w2wVar) {
        if (!w2wVar.X0()) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            StringBuilder sb = new StringBuilder("ContactsGetAllCmd unauthorized usage: ");
            mla mlaVar = this.a;
            if (mlaVar == null) {
                mlaVar = null;
            }
            sb.append(mlaVar);
            String sb2 = sb.toString();
            mla mlaVar2 = this.a;
            bVar.a(new IllegalArgumentException(sb2, (mlaVar2 != null ? mlaVar2 : null).b()));
            return g(w2wVar, Source.CACHE);
        }
        ListBuilder e = e43.e();
        boolean z = false;
        int i = 0;
        while (true) {
            if (z) {
                break;
            }
            String deviceId = w2wVar.getDeviceId();
            tfx tfxVar = new tfx("account.getContactList", new cq(0), new lq(0));
            if (deviceId != null) {
                tfx.o(tfxVar, "device_id", deviceId, 0, 0, 12);
            }
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 12);
            tfxVar.f(1000, 0, 1000, "count");
            AccountGetContactListResponseDto accountGetContactListResponseDto = (AccountGetContactListResponseDto) bz2.l(tfxVar, this.c);
            List<UserId> e2 = accountGetContactListResponseDto.e();
            if (e2 == null) {
                e2 = EmptyList.b;
            }
            List<UserId> list = e2;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.dto.common.a.a((UserId) it.next()));
            }
            Pair pair = new Pair(arrayList, accountGetContactListResponseDto.d());
            List list2 = (List) pair.d();
            Long l = (Long) pair.g();
            i += 1000;
            boolean z2 = list2.size() < 1000;
            if (z2) {
                w2wVar.getConfig().l().X0(l != null ? l.longValue() : 0L);
            }
            e.addAll(list2);
            z = z2;
        }
        ListBuilder g = e.g();
        ArrayList arrayList2 = new ArrayList(c5g.u(g, 10));
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            }
            arrayList2.add(Long.valueOf(((Peer) aVar.next()).b));
        }
        ProfilesSimpleInfo Ob = ((ProfilesInfo) w2wVar.L0(this, new d1e0(g, Source.NETWORK, this.c))).Ob();
        long j = w2wVar.H0().d;
        ArrayList arrayList3 = new ArrayList();
        for (Contact contact : Ob.c.values()) {
            Long l2 = contact.j;
            if (l2 != null && l2.longValue() == j) {
                arrayList3.add(Long.valueOf(contact.b));
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Ob.c.remove(Long.valueOf(((Number) it2.next()).longValue()));
        }
        w2wVar.I0().w().m(true);
        List O0 = j5g.O0(j5g.H0(arrayList2, 80));
        Collection values = Ob.b.values();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : values) {
            if (O0.contains(Long.valueOf(((User) obj).G3()))) {
                arrayList4.add(obj);
            }
        }
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(arrayList4, (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null);
        czh0 v = w2wVar.I0().v();
        v.j(profilesSimpleInfo.b.values());
        List list3 = O0;
        ArrayList arrayList5 = new ArrayList(c5g.u(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dq.h(((Number) it3.next()).longValue(), arrayList5);
        }
        v.f(arrayList5);
        v.h(w2wVar.f1());
        return g(w2wVar, Source.CACHE);
    }

    public final ArrayList g(w2w w2wVar, Source source) {
        Iterable values;
        List<Contact> all = w2wVar.I0().w().getAll();
        ArrayList arrayList = new ArrayList(c5g.u(all, 10));
        for (Contact contact : all) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(contact.G3()));
        }
        g1e0.a aVar = new g1e0.a();
        aVar.h(j5g.S0(arrayList));
        aVar.b = source;
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        wpp<Long, Contact> wppVar = profilesInfo.c;
        if (this.e) {
            Collection values2 = profilesInfo.b.c.values();
            Collection values3 = wppVar.c.values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : values3) {
                Contact contact2 = (Contact) obj;
                Collection collection = values2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        long j = ((User) it.next()).b;
                        Long l = contact2.j;
                        if (l != null && j == l.longValue()) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj);
            }
            values = j5g.u0(arrayList2, values2);
        } else {
            values = wppVar.c.values();
        }
        Collection<Long> e = w2wVar.I0().d().e();
        ArrayList arrayList3 = new ArrayList(c5g.u(e, 10));
        Iterator<T> it2 = e.iterator();
        while (it2.hasNext()) {
            long longValue = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList3.add(Peer.a.b(longValue));
        }
        g1e0.a aVar2 = new g1e0.a();
        aVar2.h(j5g.S0(arrayList3));
        aVar2.b = source;
        return j5g.u0(values, ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar2)))).b.c.values());
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        Object obj = this.d;
        return Boolean.hashCode(this.e) + ((b + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsGetAllCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        sb.append(this.c);
        sb.append(", changerTag=");
        sb.append(this.d);
        sb.append(", returnDeanonContactsAsUsers=");
        return q0.a(sb, this.e, ')');
    }

    public a(Source source, boolean z, Object obj, boolean z2) {
        this.b = source;
        this.c = z;
        this.d = obj;
        this.e = z2;
    }
}
