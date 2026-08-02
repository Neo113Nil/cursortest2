package com.vk.im.engine.models.messages;

import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.aux0;
import xsna.bki0;
import xsna.epx;
import xsna.fw3;
import xsna.gpm;
import xsna.izs;
import xsna.qoy;
import xsna.qr;
import xsna.t3w0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MsgFromUser.kt */
/* loaded from: classes2.dex */
public final class MsgFromUser extends Msg implements t3w0, com.vk.im.engine.models.messages.a, bki0, aux0 {
    public static final Serializer.c<MsgFromUser> CREATOR = new a();
    public String E;
    public String F;
    public MsgTextFormat G;
    public ArrayList H;
    public List<NestedMsg> I;
    public BotKeyboard J;
    public List<CarouselItem> K;
    public boolean L;
    public Boolean M;
    public String N;
    public String O;
    public String P;
    public Integer Q;
    public Integer R;
    public List<? extends MsgReaction> S;
    public Integer T;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgFromUser> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgFromUser a(Serializer serializer) {
            return new MsgFromUser(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgFromUser[i];
        }
    }

    public MsgFromUser() {
        this.E = "";
        this.F = "";
        this.G = MsgTextFormat.d;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.N = "";
        this.O = "";
        this.P = "";
        this.S = EmptyList.b;
    }

    public static ArrayList Zb(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NestedMsg nestedMsg = (NestedMsg) it.next();
            nestedMsg.getClass();
            arrayList.add(new NestedMsg(nestedMsg));
        }
        return arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final boolean A4(boolean z) {
        return super.D3(AttachWall.class, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void Ba(MsgTextFormat msgTextFormat) {
        this.G = msgTextFormat;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void I3(ArrayList arrayList) {
        this.I = arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void J2(Class cls, boolean z, ArrayList arrayList, boolean z2) {
        a.C1125a.e(this, cls, z, arrayList, z2);
    }

    @Override // xsna.aux0
    public final List<MsgReaction> K() {
        return this.S;
    }

    @Override // xsna.t3w0, com.vk.im.engine.models.messages.a
    public final List<Attach> K0() {
        return this.H;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void P9() {
        this.F = "";
    }

    @Override // xsna.aux0
    public final Integer R5() {
        return this.T;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = serializer.H();
        this.F = serializer.H();
        this.G = (MsgTextFormat) serializer.G(MsgTextFormat.class.getClassLoader());
        this.N = serializer.H();
        this.H = serializer.l(Attach.class.getClassLoader());
        this.I = serializer.l(NestedMsg.class.getClassLoader());
        this.L = serializer.m();
        this.M = serializer.n();
        this.O = serializer.H();
        this.P = serializer.H();
        this.J = (BotKeyboard) serializer.G(BotKeyboard.class.getClassLoader());
        this.K = serializer.l(CarouselItem.class.getClassLoader());
        this.T = serializer.v();
        List<? extends MsgReaction> k = serializer.k(MsgReaction.class);
        if (k == null) {
            k = EmptyList.b;
        }
        this.S = k;
        this.Q = serializer.v();
        this.R = serializer.v();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.j0(this.E);
        serializer.j0(this.F);
        serializer.i0(this.G);
        serializer.j0(this.N);
        serializer.W(this.H);
        serializer.W(this.I);
        serializer.L(this.L ? (byte) 1 : (byte) 0);
        serializer.J(this.M);
        serializer.j0(this.O);
        serializer.j0(this.P);
        serializer.i0(this.J);
        serializer.W(this.K);
        serializer.V(this.T);
        serializer.W(this.S);
        serializer.V(this.Q);
        serializer.V(this.R);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<CarouselItem> U4() {
        return this.K;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final BotKeyboard V2() {
        return this.J;
    }

    public final boolean Yb() {
        if (this.I.isEmpty()) {
            return false;
        }
        List<NestedMsg> list = this.I;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((NestedMsg) it.next()).Ea()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final MsgTextFormat a4() {
        return this.G;
    }

    public final Attach ac(int i) {
        return com.vk.im.engine.models.messages.a.Q7(this, new gpm(i, 2), true);
    }

    public final AttachWithTranscription bc() {
        return (AttachWithTranscription) a.C1125a.a(this, AttachWithTranscription.class);
    }

    public final boolean cc() {
        Boolean bool = this.M;
        return (bool != null ? bool.booleanValue() : false) || this.L;
    }

    @Override // xsna.aux0
    public final void d(Integer num) {
        this.T = num;
    }

    public final boolean dc() {
        List<CarouselItem> U4 = U4();
        return !(U4 == null || U4.isEmpty());
    }

    public final boolean ec() {
        ArrayList m9 = m9(AttachWithDownload.class, true, false);
        if (!m9.isEmpty()) {
            Iterator it = m9.iterator();
            while (it.hasNext()) {
                if (((AttachWithDownload) it.next()).C9()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgFromUser) || !super.equals(obj)) {
            return false;
        }
        MsgFromUser msgFromUser = (MsgFromUser) obj;
        return epx.f(this.E, msgFromUser.E) && epx.f(this.F, msgFromUser.F) && epx.f(this.G, msgFromUser.G) && epx.f(this.N, msgFromUser.N) && epx.f(this.H, msgFromUser.H) && epx.f(this.I, msgFromUser.I) && this.L == msgFromUser.L && epx.f(this.M, msgFromUser.M) && epx.f(this.O, msgFromUser.O) && epx.f(this.P, msgFromUser.P) && epx.f(this.J, msgFromUser.J) && epx.f(this.K, msgFromUser.K) && epx.f(this.S, msgFromUser.S) && epx.f(this.T, msgFromUser.T) && epx.f(this.Q, msgFromUser.Q) && epx.f(this.R, msgFromUser.R);
    }

    @Override // xsna.aux0
    public final void f5(List<? extends MsgReaction> list) {
        this.S = list;
    }

    public final boolean fc() {
        return super.D3(AttachPlaylist.class, false);
    }

    public final boolean gc() {
        return super.D3(AttachAudio.class, false);
    }

    @Override // xsna.t3w0, com.vk.im.engine.models.messages.a
    public final String getBody() {
        return this.F;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getTitle() {
        return this.E;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void h3(List<Attach> list) {
        this.H = (ArrayList) list;
    }

    @Override // xsna.bki0
    public final void h7(boolean z) {
        for (Attach attach : this.H) {
            if (attach instanceof bki0) {
                ((bki0) attach).h7(z);
            }
        }
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        int b = qoy.b(fw3.a(qr.a(this.H, urd0.a((this.G.hashCode() + urd0.a(urd0.a(super.hashCode() * 31, 31, this.E), 31, this.F)) * 31, 31, this.N), 31), 31, this.I), 31, this.L);
        Boolean bool = this.M;
        int a2 = urd0.a(urd0.a((b + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.O), 31, this.P);
        BotKeyboard botKeyboard = this.J;
        int hashCode = (a2 + (botKeyboard != null ? botKeyboard.hashCode() : 0)) * 31;
        List<CarouselItem> list = this.K;
        int a3 = fw3.a((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.S);
        Integer num = this.T;
        int hashCode2 = (a3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.Q;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.R;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final boolean hc() {
        return super.D3(AttachCall.class, false) || super.D3(AttachGroupCall.class, true);
    }

    public final boolean ic() {
        return super.D3(AttachPlaylist.class, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final Attach l4(izs<? super Attach, Boolean> izsVar, boolean z) {
        return com.vk.im.engine.models.messages.a.Q7(this, izsVar, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void m(String str) {
        this.E = "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void o3(ArrayList arrayList) {
        a.C1125a.b(this, arrayList);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<NestedMsg> q7() {
        return this.I;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        if (!BuildInfo.h()) {
            return "MsgFromUser(attachList=" + this.H + ", nestedList=" + this.I + ", isListenedServer=" + this.L + ", isListenedLocal=" + this.M + ", ref='" + this.O + "', refSource='" + this.P + "') " + super.toString();
        }
        return "MsgFromUser(title='" + this.E + "', body='" + this.F + "', bodyFormat='" + this.G + "', attachList=" + this.H + ", nestedList=" + this.I + ", isListenedServer=" + this.L + ", isListenedLocal=" + this.M + ", keyboard=" + this.J + ", carousel=" + this.K + ", reactions=" + this.S + ", myReaction=" + this.T + ", linkedLocalId=" + this.Q + ", linkedCmid=" + this.R + ", ref='" + this.O + "', refSource='" + this.P + "') " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void u8(izs izsVar, izs izsVar2) {
        a.C1125a.f(this, izsVar, izsVar2);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgFromUser(this);
    }

    public MsgFromUser(MsgFromUser msgFromUser) {
        this.E = "";
        this.F = "";
        this.G = MsgTextFormat.d;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.N = "";
        this.O = "";
        this.P = "";
        this.S = EmptyList.b;
        Ab(msgFromUser);
        this.E = msgFromUser.E;
        this.N = msgFromUser.N;
        this.F = msgFromUser.F;
        this.G = msgFromUser.G;
        this.H = new ArrayList(msgFromUser.H);
        this.I = Zb(msgFromUser.I);
        this.L = msgFromUser.L;
        this.M = msgFromUser.M;
        this.O = msgFromUser.O;
        this.P = msgFromUser.P;
        this.J = msgFromUser.J;
        this.K = msgFromUser.K;
        this.S = new ArrayList(msgFromUser.S);
        this.T = msgFromUser.T;
        this.Q = msgFromUser.Q;
        this.R = msgFromUser.R;
    }

    public MsgFromUser(PinnedMsg pinnedMsg, long j) {
        this.E = "";
        this.F = "";
        this.G = MsgTextFormat.d;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.N = "";
        this.O = "";
        this.P = "";
        this.S = EmptyList.b;
        this.c = pinnedMsg.b;
        this.d = pinnedMsg.c;
        this.g = pinnedMsg.e;
        Peer peer = pinnedMsg.d;
        this.h = peer;
        this.i = !(peer.b == j);
        this.j = false;
        this.k = false;
        this.l = false;
        this.o = MsgSyncState.DONE;
        this.E = pinnedMsg.f;
        this.F = pinnedMsg.g;
        this.G = pinnedMsg.h;
        this.H = new ArrayList(pinnedMsg.i);
        this.I = Zb(pinnedMsg.j);
        this.J = pinnedMsg.l;
        this.K = pinnedMsg.k;
        this.Q = pinnedMsg.n;
        this.R = pinnedMsg.o;
    }

    public MsgFromUser(NestedMsg nestedMsg) {
        this.E = "";
        this.F = "";
        this.G = MsgTextFormat.d;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.N = "";
        this.O = "";
        this.P = "";
        this.S = EmptyList.b;
        this.d = nestedMsg.d;
        this.b = nestedMsg.c;
        this.c = nestedMsg.e;
        this.g = nestedMsg.m;
        this.h = nestedMsg.f;
        this.j = false;
        this.k = false;
        this.l = false;
        this.o = MsgSyncState.DONE;
        this.E = nestedMsg.g;
        this.F = nestedMsg.h;
        this.G = nestedMsg.i;
        this.H = new ArrayList(nestedMsg.j);
        this.I = Zb(nestedMsg.k);
        this.J = nestedMsg.n;
        this.K = nestedMsg.l;
    }

    public MsgFromUser(Serializer serializer, zcl zclVar) {
        this.E = "";
        this.F = "";
        this.G = MsgTextFormat.d;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.N = "";
        this.O = "";
        this.P = "";
        this.S = EmptyList.b;
        Bb(serializer);
    }
}
