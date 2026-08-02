package com.vk.im.engine.internal.longpoll.tasks;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vk.metrics.trackers.CriticalException;
import xsna.c400;
import xsna.e500;
import xsna.f400;
import xsna.h1e0;
import xsna.pn00;
import xsna.w2w;
import xsna.yq;
import xsna.z300;

/* compiled from: ContactAddLpTask.kt */
/* loaded from: classes2.dex */
public final class ContactAddLpTask extends e500 {
    public final w2w c;
    public final Peer d;
    public boolean e;

    /* compiled from: ContactAddLpTask.kt */
    public static final class ContactAddLpTaskContactNotFoundException extends CriticalException {
    }

    /* compiled from: ContactAddLpTask.kt */
    public static final class ContactAddLpTaskUserNotFoundException extends CriticalException {
    }

    public ContactAddLpTask(w2w w2wVar, Peer peer) {
        super("ContactAddLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        Peer peer = this.d;
        peer.getClass();
        long j = peer.d;
        if (peer.Ab(Peer.Type.CONTACT)) {
            if (c400Var.e.containsKey(Long.valueOf(j))) {
                return;
            }
            if (!c400Var.o) {
                f400Var.c(j);
                return;
            } else {
                if (this.e) {
                    return;
                }
                com.vk.metrics.eventtracking.b.a.a(new ContactAddLpTaskContactNotFoundException(yq.b(peer, "Contact not found: ")));
                this.e = true;
                return;
            }
        }
        if (!peer.Ab(Peer.Type.USER) || c400Var.a.containsKey(Long.valueOf(j))) {
            return;
        }
        if (!c400Var.o) {
            f400Var.e(j);
        } else {
            if (this.e) {
                return;
            }
            com.vk.metrics.eventtracking.b.a.a(new ContactAddLpTaskUserNotFoundException(yq.b(peer, "User not found: ")));
            this.e = true;
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Peer peer = this.d;
        if (this.e) {
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
    public final void e(c400 c400Var) {
        if (this.e) {
            return;
        }
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        Peer peer = this.d;
        peer.getClass();
        long j = peer.d;
        if (peer.Ab(Peer.Type.CONTACT)) {
            Contact contact = (Contact) pn00.h(Long.valueOf(j), c400Var.e);
            profilesSimpleInfo.c.put(Long.valueOf(contact.b), contact);
        } else if (peer.Ab(Peer.Type.USER)) {
            User user = (User) pn00.h(Long.valueOf(j), c400Var.a);
            profilesSimpleInfo.b.put(Long.valueOf(user.b), user);
        }
        w2w w2wVar = this.c;
        new h1e0(profilesSimpleInfo, w2wVar.f1(), true).o(w2wVar);
    }
}
