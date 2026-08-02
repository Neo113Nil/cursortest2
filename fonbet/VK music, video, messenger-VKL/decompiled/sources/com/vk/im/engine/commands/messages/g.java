package com.vk.im.engine.commands.messages;

import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.exceptions.MsgNotFoundException;
import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.instantjobs.InstantJob;
import java.util.Set;
import xsna.d040;
import xsna.e2s;
import xsna.epx;
import xsna.eq;
import xsna.ez30;
import xsna.fz30;
import xsna.hh30;
import xsna.l2l0;
import xsna.le6;
import xsna.lhg;
import xsna.ny30;
import xsna.p980;
import xsna.ry30;
import xsna.s3q0;
import xsna.tgw;
import xsna.w2w;
import xsna.xgl0;

/* compiled from: MsgSendRetryViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class g extends le6<s3q0> {
    public final int b;
    public final Peer c;

    public g(int i, Peer peer) {
        this.b = i;
        this.c = peer;
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal msgLocalId value: ").toString());
        }
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Illegal dialog value");
        }
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        InstantJob ny30Var;
        String str;
        w2wVar.O0().b("resend msg", new e2s(this, 14));
        MsgSyncState msgSyncState = MsgSyncState.SENDING;
        AttachSyncState attachSyncState = AttachSyncState.UPLOAD_REQUIRED;
        WeightStrategy weightStrategy = WeightStrategy.FORCE_LATEST;
        Set<Class<? extends Object>> set = fz30.a;
        xgl0 I0 = w2wVar.I0();
        int i = this.b;
        I0.u(new ez30(i, msgSyncState, weightStrategy, w2wVar, attachSyncState));
        Peer peer = this.c;
        w2wVar.e1(this, new p980((Object) null, peer.b, i));
        ry30 d = w2wVar.K().d();
        long j = peer.b;
        d.b(j);
        Msg L = w2wVar.I0().o().L(i);
        if (L == null) {
            throw new IllegalArgumentException(tgw.b(i, "Msg with localId = ", " not exist"));
        }
        boolean V = w2wVar.I0().b().e().V(j);
        boolean z = L instanceof MsgFromUser;
        boolean b = !z ? false : fz30.b(((MsgFromUser) L).H);
        MsgFromUser msgFromUser = z ? (MsgFromUser) L : null;
        if (msgFromUser != null && msgFromUser.S0() && L.Mb()) {
            AttachAudioMsg a7 = ((MsgFromUser) L).a7();
            if (a7 == null || (str = a7.l) == null) {
                str = "";
            }
            ny30Var = new hh30(j, i, str);
        } else {
            long j2 = peer.b;
            d040 o = w2wVar.I0().o();
            int i2 = this.b;
            MsgFromUser msgFromUser2 = (MsgFromUser) o.L(i2);
            if (msgFromUser2 == null) {
                throw new MsgNotFoundException("Message is not found", null);
            }
            ny30Var = new ny30(j2, i2, false, false, true, l2l0.f(w2wVar, msgFromUser2), V, b, 1024);
        }
        w2wVar.O0().a(ny30Var);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.b == gVar.b && epx.f(this.c, gVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.c.b) + (Integer.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendRetryViaBgCmd(msgLocalId=");
        sb.append(this.b);
        sb.append(", peer=");
        return eq.a(sb, this.c, ')');
    }
}
