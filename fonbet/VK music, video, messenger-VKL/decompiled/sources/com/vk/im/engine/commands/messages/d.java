package com.vk.im.engine.commands.messages;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.instantjobs.InstantJob;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ddq0;
import xsna.epx;
import xsna.fw3;
import xsna.fz30;
import xsna.hh30;
import xsna.l2l0;
import xsna.l34;
import xsna.le6;
import xsna.ny30;
import xsna.p980;
import xsna.ry30;
import xsna.s3q0;
import xsna.shy;
import xsna.sso;
import xsna.uqi;
import xsna.urd0;
import xsna.w2w;
import xsna.xgl0;

/* compiled from: MsgEditViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class d extends le6<s3q0> {
    public final Peer b;
    public final int c;
    public final String d;
    public final MsgTextFormat e;
    public final String f;
    public final String g;
    public final List<Attach> h;
    public final Set<CnvMsgId> i;
    public final Integer j;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Peer peer, int i, String str, MsgTextFormat msgTextFormat, String str2, String str3, List<? extends Attach> list, Set<CnvMsgId> set, Integer num) {
        this.b = peer;
        this.c = i;
        this.d = str;
        this.e = msgTextFormat;
        this.f = str2;
        this.g = str3;
        this.h = list;
        this.i = set;
        this.j = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.vk.im.engine.models.messages.MsgFromUser] */
    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        long j;
        InstantJob ny30Var;
        String str;
        Attach attach;
        xgl0 I0 = w2wVar.I0();
        boolean z = (this.i.isEmpty() && this.j == null) ? false : true;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new MsgFromUser();
        List<Attach> list = this.h;
        ArrayList arrayList = new ArrayList();
        for (Attach attach2 : list) {
            try {
                attach = l34.c(w2wVar, attach2);
                attach.m0(attach2.xb() > 0 ? attach2.xb() : w2wVar.d1());
                attach.S2(((attach2 instanceof ddq0) && ((ddq0) attach2).M()) ? AttachSyncState.UPLOAD_REQUIRED : AttachSyncState.DONE);
            } catch (Exception unused) {
                attach = null;
            }
            if (attach != null) {
                arrayList.add(attach);
            }
        }
        ry30 d = w2wVar.K().d();
        Peer peer = this.b;
        long j2 = peer.b;
        int i = this.c;
        d.j(j2, i, arrayList);
        w2wVar.O0().b("edited", new sso(i, 1));
        I0.u(new c(ref$ObjectRef, this, w2wVar, ref$BooleanRef, arrayList, z));
        w2wVar.e1(this, new p980("MsgEditViaBgCmd", j2, ((MsgFromUser) ref$ObjectRef.element).b));
        boolean V = w2wVar.I0().b().e().V(j2);
        MsgFromUser msgFromUser = (MsgFromUser) ref$ObjectRef.element;
        boolean z2 = ref$BooleanRef.element;
        long f = msgFromUser != null ? l2l0.f(w2wVar, msgFromUser) : w2wVar.getConfig().p;
        Set<Class<? extends Object>> set = fz30.a;
        boolean b = fz30.b(msgFromUser.H);
        if (msgFromUser.S0()) {
            AttachAudioMsg a7 = msgFromUser.a7();
            if (a7 == null || (str = a7.l) == null) {
                str = "";
            }
            ny30Var = new hh30(j2, i, str);
            j = j2;
        } else {
            j = j2;
            ny30Var = new ny30(peer.b, this.c, z, z2, false, f, V, b, 1536);
        }
        w2wVar.O0().a(ny30Var);
        w2wVar.S0().v(j, this);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h) && epx.f(this.i, dVar.i) && epx.f(this.j, dVar.j);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = fw3.b(fw3.a(urd0.a(urd0.a((this.e.hashCode() + urd0.a(shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Integer num = this.j;
        return b + (num == null ? 0 : num.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgEditViaBgCmd(dialog=");
        sb.append(this.b);
        sb.append(", editLocalId=");
        sb.append(this.c);
        sb.append(", text='");
        BuildInfo.Client client = BuildInfo.a;
        sb.append(BuildInfo.d(this.d));
        sb.append("', textFormat='");
        sb.append(BuildInfo.d(this.e.toString()));
        sb.append("', ref='");
        sb.append(this.f);
        sb.append("', refSource='");
        sb.append(this.g);
        sb.append("', attachList=");
        sb.append(this.h);
        sb.append(", fwdMsgIds=");
        sb.append(this.i);
        sb.append(", replyMsgCnvId=");
        return uqi.b(sb, this.j, ')');
    }
}
