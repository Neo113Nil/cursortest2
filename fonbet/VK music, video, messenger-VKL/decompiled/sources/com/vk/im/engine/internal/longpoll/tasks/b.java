package com.vk.im.engine.internal.longpoll.tasks;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.longpoll.tasks.ContactAddLpTask;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c400;
import xsna.c5g;
import xsna.e500;
import xsna.f400;
import xsna.h1e0;
import xsna.pn00;
import xsna.w2w;
import xsna.z300;

/* compiled from: ContactsAddLpTask.kt */
/* loaded from: classes2.dex */
public final class b extends e500 {
    public final w2w c;
    public final Iterable<Long> d;
    public boolean e;

    public b(w2w w2wVar, Iterable<Long> iterable) {
        super("ContactsAddLpTask");
        this.c = w2wVar;
        this.d = iterable;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        ArrayList arrayList = new ArrayList();
        Iterable<Long> iterable = this.d;
        for (Long l : iterable) {
            long longValue = l.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            if (Peer.a.f(longValue) == Peer.Type.CONTACT) {
                arrayList.add(l);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue2 = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add((Peer.Contact) Peer.a.b(longValue2));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!c400Var.e.containsKey(Long.valueOf(((Peer.Contact) next).d))) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Peer.Contact contact = (Peer.Contact) it3.next();
            if (!c400Var.o) {
                f400Var.c(contact.d);
            } else if (!this.e) {
                com.vk.metrics.eventtracking.b.a.a(new ContactAddLpTask.ContactAddLpTaskContactNotFoundException("Contact not found: " + contact));
                this.e = true;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Long l2 : iterable) {
            long longValue3 = l2.longValue();
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            if (Peer.a.f(longValue3) == Peer.Type.USER) {
                arrayList4.add(l2);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            long longValue4 = ((Number) it4.next()).longValue();
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            arrayList5.add((Peer.User) Peer.a.b(longValue4));
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (!c400Var.a.containsKey(Long.valueOf(((Peer.User) next2).d))) {
                arrayList6.add(next2);
            }
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            Peer.User user = (Peer.User) it6.next();
            if (!c400Var.o) {
                f400Var.e(user.d);
            } else if (!this.e) {
                com.vk.metrics.eventtracking.b.a.a(new ContactAddLpTask.ContactAddLpTaskUserNotFoundException("User not found: " + user));
                this.e = true;
            }
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Iterable<Long> iterable = this.d;
        if (this.e) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        z300Var.a = bool;
        z300Var.d = bool;
        ArrayList arrayList = new ArrayList();
        for (Long l : iterable) {
            long longValue = l.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            if (Peer.a.f(longValue) == Peer.Type.CONTACT) {
                arrayList.add(l);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue2 = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add((Peer.Contact) Peer.a.b(longValue2));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            z300Var.e(((Peer.Contact) it2.next()).d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Long l2 : iterable) {
            long longValue3 = l2.longValue();
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            if (Peer.a.f(longValue3) == Peer.Type.USER) {
                arrayList3.add(l2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            long longValue4 = ((Number) it3.next()).longValue();
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            arrayList4.add((Peer.User) Peer.a.b(longValue4));
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            z300Var.k(((Peer.User) it4.next()).d);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        if (this.e) {
            return;
        }
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        ArrayList arrayList = new ArrayList();
        Iterable<Long> iterable = this.d;
        for (Long l : iterable) {
            long longValue = l.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            if (Peer.a.f(longValue) == Peer.Type.CONTACT) {
                arrayList.add(l);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue2 = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add((Peer.Contact) Peer.a.b(longValue2));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Peer.Contact contact = (Peer.Contact) it2.next();
            Contact contact2 = (Contact) pn00.h(Long.valueOf(contact.d), c400Var.e);
            profilesSimpleInfo.c.put(Long.valueOf(contact2.b), contact2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Long l2 : iterable) {
            long longValue3 = l2.longValue();
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            if (Peer.a.f(longValue3) == Peer.Type.USER) {
                arrayList3.add(l2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            long longValue4 = ((Number) it3.next()).longValue();
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            arrayList4.add((Peer.User) Peer.a.b(longValue4));
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Peer.User user = (Peer.User) it4.next();
            User user2 = (User) pn00.h(Long.valueOf(user.d), c400Var.a);
            profilesSimpleInfo.b.put(Long.valueOf(user2.b), user2);
        }
        w2w w2wVar = this.c;
        new h1e0(profilesSimpleInfo, w2wVar.f1(), true).o(w2wVar);
    }
}
