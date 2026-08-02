package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.messages.MsgSyncState;
import xsna.bh10;
import xsna.btx0;
import xsna.epx;
import xsna.gkx0;
import xsna.gtx0;
import xsna.lsx0;
import xsna.qoy;
import xsna.shy;
import xsna.vsx0;
import xsna.vu5;

/* compiled from: Msg.kt */
/* loaded from: classes2.dex */
public abstract class Msg extends Serializer.StreamParcelableAdapter implements Comparable<Msg>, vsx0, btx0, gtx0, lsx0 {
    public MessageSource A;
    public boolean B;
    public int C;
    public boolean D;
    public int b;
    public long c;
    public int d;
    public long e;
    public int f;
    public long g;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean q;
    public boolean r;
    public gkx0 s;
    public gkx0 t;
    public int u;
    public Long v;
    public Long w;
    public boolean x;
    public Long y;
    public boolean z;
    public Peer h = Peer.Unknown.e;
    public MsgSyncState o = MsgSyncState.DONE;
    public gkx0 p = gkx0.d;

    public Msg() {
        gkx0 gkx0Var = gkx0.c;
        this.s = gkx0Var;
        this.t = gkx0Var;
        this.A = MessageSource.UNDEFINED;
    }

    public void Ab(Msg msg) {
        this.b = msg.b;
        this.c = msg.c;
        this.d = msg.d;
        this.f = msg.f;
        this.e = msg.e;
        this.g = msg.g;
        Vb(msg.getFrom());
        this.i = msg.i;
        this.j = msg.j;
        this.k = msg.k;
        Ub(msg.Hb());
        this.o = msg.o;
        this.p = msg.p;
        this.q = msg.q;
        this.r = msg.r;
        this.u = msg.u;
        this.v = msg.v;
        this.w = msg.w;
        this.x = msg.x;
        this.y = msg.y;
        this.D = msg.D;
        this.n = msg.n;
        this.m = msg.m;
        this.z = msg.z;
        this.A = msg.A;
        this.B = msg.B;
        this.C = msg.C;
    }

    public final void Bb(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.w();
        this.d = serializer.u();
        this.f = serializer.u();
        this.g = serializer.w();
        Vb((Peer) serializer.G(Peer.class.getClassLoader()));
        this.i = serializer.m();
        this.j = serializer.m();
        this.k = serializer.m();
        Ub(serializer.m());
        MsgSyncState.a aVar = MsgSyncState.Companion;
        int u = serializer.u();
        aVar.getClass();
        this.o = MsgSyncState.a.a(u);
        this.p = new gkx0(serializer.w());
        this.q = serializer.m();
        this.r = serializer.m();
        this.u = serializer.u();
        Rb(serializer);
        this.v = serializer.x();
        this.w = serializer.x();
        this.x = serializer.m();
        this.y = serializer.x();
        this.D = serializer.m();
        this.n = serializer.m();
        this.m = serializer.m();
        this.z = serializer.m();
        this.e = serializer.w();
        MessageSource.a aVar2 = MessageSource.Companion;
        int u2 = serializer.u();
        aVar2.getClass();
        this.A = MessageSource.a.a(u2);
        this.B = serializer.m();
        this.C = serializer.u();
    }

    public final long C() {
        return this.g;
    }

    public final long Cb() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.d(this.c);
    }

    public final Integer Db() {
        return Integer.valueOf(this.b);
    }

    public final int Eb() {
        return this.f;
    }

    public final long Fb() {
        return Math.abs(this.c + getFrom().b);
    }

    public final MsgSyncState Gb() {
        return this.o;
    }

    public final boolean H6() {
        return this.d == 0;
    }

    public boolean Hb() {
        return this.l;
    }

    public final boolean Ib() {
        return this.v != null || this.D;
    }

    public final boolean Jb(Peer peer) {
        return epx.f(getFrom(), peer);
    }

    public final boolean Kb() {
        return this.i;
    }

    public final boolean Lb() {
        return !Ib();
    }

    public final boolean Mb() {
        return !H6();
    }

    public final boolean Nb() {
        return this.d != 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.Y(this.c);
        serializer.S(this.d);
        serializer.S(this.f);
        serializer.Y(this.g);
        serializer.i0(getFrom());
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(Hb() ? (byte) 1 : (byte) 0);
        serializer.S(this.o.j());
        serializer.Y(this.p.b);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.S(this.u);
        Sb(serializer);
        serializer.b0(this.v);
        serializer.b0(this.w);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.b0(this.y);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.Y(this.e);
        serializer.S(this.A.h());
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.S(this.C);
    }

    public final boolean Ob() {
        return this.x;
    }

    public final boolean Pb() {
        return this.o == MsgSyncState.ERROR;
    }

    public final void Q1(long j) {
        this.c = j;
    }

    public final boolean Qb() {
        return this.o == MsgSyncState.DONE;
    }

    public final void Tb(int i) {
        this.d = i;
    }

    public void Ub(boolean z) {
        this.l = z;
    }

    public void Vb(Peer peer) {
        this.h = peer;
    }

    public final void Wb(MsgSyncState msgSyncState) {
        this.o = msgSyncState;
    }

    public final void Xb(long j) {
        this.g = j;
    }

    @Override // xsna.lsx0
    public final int Z5() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Msg msg) {
        return this.p.compareTo(msg.p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Msg)) {
            return false;
        }
        Msg msg = (Msg) obj;
        return this.b == msg.b && this.c == msg.c && this.d == msg.d && this.f == msg.f && this.g == msg.g && epx.f(getFrom(), msg.getFrom()) && this.i == msg.i && this.j == msg.j && this.k == msg.k && Hb() == msg.Hb() && this.o == msg.o && epx.f(this.p, msg.p) && this.q == msg.q && this.r == msg.r && this.u == msg.u && epx.f(this.v, msg.v) && epx.f(this.w, msg.w) && this.x == msg.x && epx.f(this.y, msg.y) && this.D == msg.D && this.n == msg.n && this.m == msg.m && this.z == msg.z && this.A == msg.A && this.B == msg.B && this.C == msg.C;
    }

    @Override // xsna.vsx0
    public Peer getFrom() {
        return this.h;
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Integer.valueOf(this.b);
    }

    public int hashCode() {
        int b = (qoy.b(qoy.b(bh10.a((this.o.hashCode() + ((Boolean.hashCode(Hb()) + qoy.b(qoy.b(qoy.b(bh10.a(bh10.a(bh10.a((shy.a(this.d, bh10.a(Integer.hashCode(this.b) * 31, 31, this.c), 31) + this.f) * 31, 31, this.e), 31, this.g), 31, getFrom().b), 31, this.i), 31, this.j), 31, this.k)) * 31)) * 31, 31, this.p.b), 31, this.q), 31, this.r) + this.u) * 31;
        Long l = this.v;
        int hashCode = (b + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.w;
        int b2 = qoy.b((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.x);
        Long l3 = this.y;
        return Integer.hashCode(this.C) + qoy.b((this.A.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((b2 + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.D), 31, this.n), 31, this.m), 31, this.z)) * 31, 31, this.B);
    }

    @Override // xsna.gtx0
    public final void m0(int i) {
        this.b = i;
    }

    @Override // xsna.vsx0
    public final long ob() {
        return getFrom().d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Msg(localId=");
        sb.append(this.b);
        sb.append(", weight=");
        sb.append(this.p.b);
        sb.append(", cnvMsgId=");
        sb.append(this.d);
        sb.append(", syncState=");
        sb.append(this.o);
        sb.append(", weightBefore=");
        sb.append(this.s);
        sb.append(", weightAfter=");
        sb.append(this.t);
        sb.append(", time=");
        sb.append(this.g);
        sb.append(", phaseId=");
        sb.append(this.u);
        sb.append(", dialogId=");
        sb.append(this.c);
        sb.append(", randomId=");
        sb.append(this.f);
        sb.append(", from=");
        sb.append(getFrom());
        sb.append(", isIncoming=");
        sb.append(this.i);
        sb.append(", isImportant=");
        sb.append(this.j);
        sb.append(", isHidden=");
        sb.append(this.k);
        sb.append(", isUnavailable=");
        sb.append(this.m);
        sb.append(", isEdited=");
        sb.append(Hb());
        sb.append(", expireTtlMs=");
        sb.append(this.v);
        sb.append(", deleteTtlMs=");
        sb.append(this.w);
        sb.append(", isSilent=");
        sb.append(this.x);
        sb.append(", pinnnedAtMs=");
        sb.append(this.y);
        sb.append(", isExpired=");
        sb.append(this.D);
        sb.append(", forceAutoplayMedia=");
        sb.append(this.z);
        sb.append(", source=");
        sb.append(this.A);
        sb.append(", version=");
        sb.append(this.e);
        sb.append(", nestedMsgsHasMore=");
        sb.append(this.B);
        sb.append(", nestedMsgsCount=");
        return vu5.b(sb, this.C, ')');
    }

    public final int xb() {
        return this.b;
    }

    @Override // xsna.lsx0
    public final long y() {
        return this.c;
    }

    @Override // xsna.vsx0
    public final Peer.Type y2() {
        return getFrom().c;
    }

    public abstract Msg zb();

    public void Rb(Serializer serializer) {
    }

    public void Sb(Serializer serializer) {
    }
}
