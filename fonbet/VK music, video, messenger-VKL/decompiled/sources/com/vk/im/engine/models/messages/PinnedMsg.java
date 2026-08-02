package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.a;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bhu;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.lsx0;
import xsna.qoy;
import xsna.qr;
import xsna.s3q0;
import xsna.urd0;
import xsna.vsx0;
import xsna.zcl;

/* compiled from: PinnedMsg.kt */
/* loaded from: classes2.dex */
public final class PinnedMsg extends Serializer.StreamParcelableAdapter implements vsx0, com.vk.im.engine.models.messages.a, lsx0 {
    public static final Serializer.c<PinnedMsg> CREATOR = new a();
    public long b;
    public int c;
    public Peer d;
    public long e;
    public String f;
    public String g;
    public MsgTextFormat h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public BotKeyboard l;
    public boolean m;
    public final Integer n;
    public final Integer o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PinnedMsg> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PinnedMsg a(Serializer serializer) {
            return new PinnedMsg(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PinnedMsg[i];
        }
    }

    public PinnedMsg() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.d = Peer.Unknown.e;
        this.f = "";
        this.g = "";
        this.h = MsgTextFormat.d;
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    public static void Ab(ArrayList arrayList, gzs gzsVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NestedMsg nestedMsg = (NestedMsg) it.next();
            nestedMsg.c = ((Number) gzsVar.invoke()).intValue();
            zb(nestedMsg.j, gzsVar);
            Ab(nestedMsg.k, gzsVar);
        }
    }

    public static void zb(ArrayList arrayList, gzs gzsVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Attach) it.next()).m0(((Number) gzsVar.invoke()).intValue());
        }
    }

    @Override // com.vk.im.engine.models.messages.a
    public final boolean A4(boolean z) {
        return super.D3(AttachWall.class, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void Ba(MsgTextFormat msgTextFormat) {
        this.h = msgTextFormat;
    }

    public final PinnedMsg Bb(gzs<Integer> gzsVar) {
        PinnedMsg pinnedMsg = new PinnedMsg(this);
        Ab(pinnedMsg.j, gzsVar);
        zb(pinnedMsg.i, gzsVar);
        return pinnedMsg;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final long C() {
        return this.e;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void I3(ArrayList arrayList) {
        this.j = arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void J2(Class cls, boolean z, ArrayList arrayList, boolean z2) {
        a.C1125a.e(this, cls, z, arrayList, z2);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<Attach> K0() {
        return this.i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.S(this.c);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.i0(this.d);
        serializer.Y(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.W(this.i);
        serializer.W(this.j);
        serializer.i0(this.l);
        serializer.W(this.k);
        serializer.V(this.n);
        serializer.V(this.o);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void P9() {
        this.g = "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<CarouselItem> U4() {
        return this.k;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final BotKeyboard V2() {
        return this.l;
    }

    @Override // xsna.lsx0
    public final int Z5() {
        return this.c;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final MsgTextFormat a4() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinnedMsg)) {
            return false;
        }
        PinnedMsg pinnedMsg = (PinnedMsg) obj;
        return this.b == pinnedMsg.b && this.c == pinnedMsg.c && this.m == pinnedMsg.m && epx.f(this.d, pinnedMsg.d) && this.e == pinnedMsg.e && epx.f(this.f, pinnedMsg.f) && epx.f(this.g, pinnedMsg.g) && epx.f(this.h, pinnedMsg.h) && epx.f(this.i, pinnedMsg.i) && epx.f(this.j, pinnedMsg.j) && epx.f(this.l, pinnedMsg.l) && epx.f(this.k, pinnedMsg.k) && epx.f(this.n, pinnedMsg.n) && epx.f(this.o, pinnedMsg.o);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getBody() {
        return this.g;
    }

    @Override // xsna.vsx0
    public final Peer getFrom() {
        return this.d;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getTitle() {
        return this.f;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void h3(List<Attach> list) {
        this.i = (ArrayList) list;
    }

    public final int hashCode() {
        int a2 = qr.a(this.j, qr.a(this.i, (this.h.hashCode() + urd0.a(urd0.a(bh10.a(bh10.a(qoy.b(bh10.a(this.c * 31, 31, this.b), 31, this.m), 31, this.d.b), 31, this.e), 31, this.f), 31, this.g)) * 31, 31), 31);
        BotKeyboard botKeyboard = this.l;
        int hashCode = (a2 + (botKeyboard != null ? botKeyboard.hashCode() : 0)) * 31;
        ArrayList arrayList = this.k;
        int hashCode2 = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        Integer num = this.n;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.o;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void i2(izs<? super NestedMsg, s3q0> izsVar, boolean z) {
        super.i2(izsVar, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final <T extends Attach> T l2(Class<T> cls, boolean z) {
        return (T) super.l2(AttachAudioMsg.class, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final Attach l4(izs<? super Attach, Boolean> izsVar, boolean z) {
        return com.vk.im.engine.models.messages.a.Q7(this, izsVar, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void m(String str) {
        this.f = "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void o3(ArrayList arrayList) {
        a.C1125a.b(this, arrayList);
    }

    @Override // xsna.vsx0
    public final long ob() {
        return getFrom().d;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<NestedMsg> q7() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinnedMsg(dialogId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", isUnavailable=");
        sb.append(this.m);
        sb.append(", time=");
        sb.append(this.e);
        sb.append(", from=");
        sb.append(this.d);
        sb.append(", title='");
        sb.append(this.f);
        sb.append("', body='");
        sb.append(this.g);
        sb.append("',  bodyFormat='");
        sb.append(this.h);
        sb.append("', attachList=");
        sb.append(this.i);
        sb.append(", keyboard=");
        sb.append(this.l);
        sb.append(", keyboard=");
        sb.append(this.k);
        sb.append(", localLinkedId=");
        sb.append(this.n);
        sb.append(", linkedCmid=");
        sb.append(this.o);
        sb.append(", fwdList=");
        return j.b(')', sb, this.j);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void u8(izs izsVar, izs izsVar2) {
        a.C1125a.f(this, izsVar, izsVar2);
    }

    @Override // xsna.lsx0
    public final long y() {
        return this.b;
    }

    @Override // xsna.vsx0
    public final Peer.Type y2() {
        return getFrom().c;
    }

    public PinnedMsg(PinnedMsg pinnedMsg) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.d = Peer.Unknown.e;
        this.f = "";
        this.g = "";
        this.h = MsgTextFormat.d;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.b = pinnedMsg.b;
        this.c = pinnedMsg.c;
        this.m = pinnedMsg.m;
        this.d = pinnedMsg.d;
        this.e = pinnedMsg.e;
        this.f = pinnedMsg.f;
        this.g = pinnedMsg.g;
        this.h = pinnedMsg.h;
        this.i = new ArrayList(pinnedMsg.i);
        this.j = new ArrayList(pinnedMsg.j);
        BotKeyboard botKeyboard = pinnedMsg.l;
        this.l = botKeyboard != null ? botKeyboard.zb() : null;
        ArrayList arrayList = pinnedMsg.k;
        this.k = arrayList != null ? bhu.d(arrayList) : null;
        this.n = pinnedMsg.n;
        this.o = pinnedMsg.o;
    }

    public PinnedMsg(MsgFromUser msgFromUser) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.d = Peer.Unknown.e;
        this.f = "";
        this.g = "";
        this.h = MsgTextFormat.d;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.b = msgFromUser.c;
        this.c = msgFromUser.d;
        this.m = msgFromUser.m;
        this.d = msgFromUser.h;
        this.e = msgFromUser.g;
        this.f = msgFromUser.E;
        this.g = msgFromUser.F;
        this.h = msgFromUser.G;
        this.i = new ArrayList(msgFromUser.H);
        this.j = new ArrayList(msgFromUser.I);
        BotKeyboard botKeyboard = msgFromUser.J;
        this.l = botKeyboard != null ? botKeyboard.zb() : null;
        List<CarouselItem> list = msgFromUser.K;
        this.k = list != null ? bhu.d(list) : null;
        this.n = msgFromUser.Q;
        this.o = msgFromUser.R;
    }

    public PinnedMsg(Serializer serializer, zcl zclVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.d = Peer.Unknown.e;
        this.f = "";
        this.g = "";
        this.h = MsgTextFormat.d;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.b = serializer.w();
        this.c = serializer.u();
        this.m = serializer.m();
        this.d = (Peer) serializer.G(Peer.class.getClassLoader());
        this.e = serializer.w();
        this.f = serializer.H();
        this.g = serializer.H();
        this.h = (MsgTextFormat) serializer.G(MsgTextFormat.class.getClassLoader());
        this.i = serializer.l(Attach.class.getClassLoader());
        this.j = serializer.l(NestedMsg.class.getClassLoader());
        this.l = (BotKeyboard) serializer.G(BotKeyboard.class.getClassLoader());
        this.k = serializer.l(CarouselItem.class.getClassLoader());
        this.n = serializer.v();
        this.o = serializer.v();
    }
}
