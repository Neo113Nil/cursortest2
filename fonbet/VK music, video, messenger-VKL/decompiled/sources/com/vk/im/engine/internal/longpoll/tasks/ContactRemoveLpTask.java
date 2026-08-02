package com.vk.im.engine.internal.longpoll.tasks;

import com.vk.contacts.ContactsManager;
import com.vk.contacts.d;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vk.metrics.trackers.CriticalException;
import java.util.Collection;
import java.util.Collections;
import xsna.arm0;
import xsna.c400;
import xsna.e500;
import xsna.f400;
import xsna.h1e0;
import xsna.pn00;
import xsna.vcj;
import xsna.w2w;
import xsna.y6v;
import xsna.yq;
import xsna.z300;
import xsna.zcl;

/* compiled from: ContactRemoveLpTask.kt */
/* loaded from: classes2.dex */
public final class ContactRemoveLpTask extends e500 {
    public final w2w c;
    public final Peer d;
    public final ContactsManager e;
    public boolean f;

    /* compiled from: ContactRemoveLpTask.kt */
    public static final class ContactRemoveLpTaskUserNotFoundException extends CriticalException {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactRemoveLpTask(w2w w2wVar, Peer peer) {
        super("ContactRemoveLpTask");
        ContactsManager contactsManager = d.a;
        this.c = w2wVar;
        this.d = peer;
        this.e = contactsManager;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        Peer peer = this.d;
        peer.getClass();
        long j = peer.d;
        if (!peer.Ab(Peer.Type.USER) || c400Var.a.containsKey(Long.valueOf(j))) {
            return;
        }
        if (!c400Var.o) {
            f400Var.e(j);
        } else {
            if (this.f) {
                return;
            }
            com.vk.metrics.eventtracking.b.a.a(new ContactRemoveLpTaskUserNotFoundException(yq.b(peer, "User not found: ")));
            this.f = true;
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Peer peer = this.d;
        if (this.f) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        z300Var.a = bool;
        z300Var.d = bool;
        peer.getClass();
        if (peer.Ab(Peer.Type.CONTACT)) {
            z300Var.e(peer.d);
        } else if (peer.Ab(Peer.Type.USER)) {
            z300Var.k(peer.d);
        }
    }

    @Override // xsna.e500
    public final void d(c400 c400Var) {
        if (this.f) {
            return;
        }
        Peer peer = this.d;
        peer.getClass();
        if (peer.Ab(Peer.Type.CONTACT)) {
            this.e.d();
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        String str;
        Long n;
        if (this.f) {
            return;
        }
        Peer peer = this.d;
        peer.getClass();
        long j = peer.d;
        boolean Ab = peer.Ab(Peer.Type.CONTACT);
        w2w w2wVar = this.c;
        if (!Ab) {
            if (peer.Ab(Peer.Type.USER)) {
                new h1e0(new ProfilesSimpleInfo(Collections.singletonList((User) pn00.h(Long.valueOf(j), c400Var.a)), (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null), w2wVar.f1(), true).o(w2wVar);
                w2wVar.J0(this, new y6v(Collections.singletonList(peer)));
                return;
            }
            return;
        }
        Contact c = w2wVar.I0().w().c(j);
        if (c != null && (str = c.i) != null && (n = arm0.n(str)) != null) {
            this.e.M0(Collections.singletonList(Long.valueOf(n.longValue())));
        }
        w2wVar.J0(this, new vcj(Collections.singletonList(Long.valueOf(j))));
    }
}
