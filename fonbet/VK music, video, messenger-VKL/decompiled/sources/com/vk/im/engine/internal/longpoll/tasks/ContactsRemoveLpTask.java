package com.vk.im.engine.internal.longpoll.tasks;

import com.vk.contacts.ContactsManager;
import com.vk.contacts.d;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vk.metrics.trackers.CriticalException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.arm0;
import xsna.c400;
import xsna.c5g;
import xsna.e500;
import xsna.f400;
import xsna.h1e0;
import xsna.j5g;
import xsna.rdi;
import xsna.vcj;
import xsna.w2w;
import xsna.y6v;
import xsna.z300;
import xsna.zcl;

/* compiled from: ContactsRemoveLpTask.kt */
/* loaded from: classes2.dex */
public final class ContactsRemoveLpTask extends e500 {
    public final w2w c;
    public final Iterable<Long> d;
    public final ContactsManager e;
    public boolean f;

    /* compiled from: ContactsRemoveLpTask.kt */
    public static final class ContactRemoveLpTaskUserNotFoundException extends CriticalException {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsRemoveLpTask(w2w w2wVar, Iterable iterable) {
        super("ContactsRemoveLpTask");
        ContactsManager contactsManager = d.a;
        this.c = w2wVar;
        this.d = iterable;
        this.e = contactsManager;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        ArrayList arrayList = new ArrayList();
        for (Long l : this.d) {
            long longValue = l.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            if (Peer.a.f(longValue) == Peer.Type.USER) {
                arrayList.add(l);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue2 = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add((Peer.User) Peer.a.b(longValue2));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!c400Var.a.containsKey(Long.valueOf(((Peer.User) next).d))) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Peer.User user = (Peer.User) it3.next();
            if (!c400Var.o) {
                f400Var.e(user.d);
            } else if (!this.f) {
                com.vk.metrics.eventtracking.b.a.a(new ContactRemoveLpTaskUserNotFoundException("User not found: " + user));
                this.f = true;
            }
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Iterable<Long> iterable = this.d;
        if (this.f) {
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
    public final void d(c400 c400Var) {
        if (this.f) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : this.d) {
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
        if (j5g.M(arrayList2)) {
            this.e.d();
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        if (this.f) {
            return;
        }
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
        List x = rdi.x(arrayList2);
        w2w w2wVar = this.c;
        if (x != null) {
            List list = x;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((Peer.Contact) it2.next()).d));
            }
            Collection<Contact> values = w2wVar.I0().w().d(arrayList3).values();
            ArrayList arrayList4 = new ArrayList(c5g.u(values, 10));
            Iterator<T> it3 = values.iterator();
            while (it3.hasNext()) {
                arrayList4.add(arm0.n(((Contact) it3.next()).i));
            }
            this.e.M0(rdi.H(arrayList4));
            w2wVar.J0(this, new vcj(arrayList3));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Long l2 : iterable) {
            long longValue3 = l2.longValue();
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            if (Peer.a.f(longValue3) == Peer.Type.USER) {
                arrayList5.add(l2);
            }
        }
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            long longValue4 = ((Number) it4.next()).longValue();
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            arrayList6.add((Peer.User) Peer.a.b(longValue4));
        }
        List x2 = rdi.x(arrayList6);
        if (x2 != null) {
            List list2 = x2;
            ArrayList arrayList7 = new ArrayList(c5g.u(list2, 10));
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList7.add(Long.valueOf(((Peer.User) it5.next()).d));
            }
            Collection values2 = c400Var.a.values();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj : values2) {
                if (arrayList7.contains(Long.valueOf(((User) obj).b))) {
                    arrayList8.add(obj);
                }
            }
            new h1e0(new ProfilesSimpleInfo(arrayList8, (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null), w2wVar.f1(), true).o(w2wVar);
            w2wVar.J0(this, new y6v(x2));
        }
    }
}
