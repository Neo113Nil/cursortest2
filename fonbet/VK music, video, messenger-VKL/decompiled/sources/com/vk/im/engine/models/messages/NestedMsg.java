package com.vk.im.engine.models.messages;

import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.a;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.gtx0;
import xsna.izs;
import xsna.lhg;
import xsna.qoy;
import xsna.qr;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NestedMsg.kt */
/* loaded from: classes2.dex */
public final class NestedMsg extends Serializer.StreamParcelableAdapter implements com.vk.im.engine.models.messages.a, gtx0 {
    public static final Serializer.c<NestedMsg> CREATOR = new a();
    public Type b;
    public int c;
    public int d;
    public long e;
    public Peer f;
    public String g;
    public String h;
    public MsgTextFormat i;
    public ArrayList j;
    public ArrayList k;
    public List<CarouselItem> l;
    public long m;
    public final BotKeyboard n;
    public boolean o;
    public boolean p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NestedMsg.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type FWD;
        public static final Type REPLY;
        private static final Type[] VALUES;
        private final int id;

        /* compiled from: NestedMsg.kt */
        public static final class a {
        }

        static {
            Type type = new Type("FWD", 0, 1);
            FWD = type;
            Type type2 = new Type("REPLY", 1, 2);
            REPLY = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
            VALUES = values();
        }

        public Type(String str, int i, int i2) {
            this.id = i2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int i() {
            return this.id;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NestedMsg> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NestedMsg a(Serializer serializer) {
            return new NestedMsg(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NestedMsg[i];
        }
    }

    public NestedMsg() {
        this.b = Type.FWD;
        this.f = Peer.Unknown.e;
        this.g = "";
        this.h = "";
        this.i = MsgTextFormat.d;
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    @Override // com.vk.im.engine.models.messages.a
    public final boolean A4(boolean z) {
        return super.D3(AttachWall.class, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void Ba(MsgTextFormat msgTextFormat) {
        this.i = msgTextFormat;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final long C() {
        return this.m;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void I3(ArrayList arrayList) {
        this.k = arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void J2(Class cls, boolean z, ArrayList arrayList, boolean z2) {
        a.C1125a.e(this, cls, z, arrayList, z2);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<Attach> K0() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.i());
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.Y(this.e);
        serializer.i0(this.f);
        serializer.Y(this.m);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.i0(this.i);
        serializer.W(this.j);
        serializer.W(this.k);
        serializer.i0(this.n);
        serializer.W(this.l);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void P9() {
        this.h = "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<CarouselItem> U4() {
        return this.l;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final BotKeyboard V2() {
        return this.n;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final MsgTextFormat a4() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NestedMsg)) {
            return false;
        }
        NestedMsg nestedMsg = (NestedMsg) obj;
        return this.b == nestedMsg.b && this.c == nestedMsg.c && this.d == nestedMsg.d && this.e == nestedMsg.e && epx.f(this.f, nestedMsg.f) && epx.f(this.g, nestedMsg.g) && epx.f(this.h, nestedMsg.h) && epx.f(this.i, nestedMsg.i) && epx.f(this.j, nestedMsg.j) && epx.f(this.k, nestedMsg.k) && this.m == nestedMsg.m && epx.f(this.n, nestedMsg.n) && epx.f(this.l, nestedMsg.l) && this.o == nestedMsg.o;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getBody() {
        return this.h;
    }

    @Override // xsna.vsx0
    public final Peer getFrom() {
        return this.f;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getTitle() {
        return this.g;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void h3(List<Attach> list) {
        this.j = (ArrayList) list;
    }

    public final int hashCode() {
        int a2 = bh10.a(qr.a(this.k, qr.a(this.j, (this.i.hashCode() + urd0.a(urd0.a(bh10.a(bh10.a(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e), 31, this.f.b), 31, this.g), 31, this.h)) * 31, 31), 31), 31, this.m);
        BotKeyboard botKeyboard = this.n;
        int hashCode = (a2 + (botKeyboard != null ? botKeyboard.hashCode() : 0)) * 31;
        List<CarouselItem> list = this.l;
        return Boolean.hashCode(this.p) + qoy.b((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.o);
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
        this.g = "";
    }

    @Override // xsna.gtx0
    public final void m0(int i) {
        this.c = i;
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
        return this.k;
    }

    public final String toString() {
        if (!BuildInfo.h()) {
            StringBuilder sb = new StringBuilder("NestedMsg(type=");
            sb.append(this.b);
            sb.append(", localId=");
            sb.append(this.c);
            sb.append(", cnvId=");
            sb.append(this.d);
            sb.append(", dialogId=");
            sb.append(this.e);
            sb.append(", from=");
            sb.append(this.f);
            sb.append(", attachList=");
            sb.append(this.j);
            sb.append(", nestedList=");
            sb.append(this.k);
            sb.append(", time=");
            return vu5.a(')', this.m, sb);
        }
        StringBuilder sb2 = new StringBuilder("NestedMsg(type=");
        sb2.append(this.b);
        sb2.append(", localId=");
        sb2.append(this.c);
        sb2.append(", cnvId=");
        sb2.append(this.d);
        sb2.append(", dialogId=");
        sb2.append(this.e);
        sb2.append(", from=");
        sb2.append(this.f);
        sb2.append(", title='");
        sb2.append(this.g);
        sb2.append("',body='");
        sb2.append(this.h);
        sb2.append("',bodyFormat='");
        sb2.append(this.i);
        sb2.append("',attachList=");
        sb2.append(this.j);
        sb2.append(", nestedList=");
        sb2.append(this.k);
        sb2.append(", keyboard=");
        sb2.append(this.n);
        sb2.append(", carousel=");
        sb2.append(this.l);
        sb2.append(", isExpired=");
        sb2.append(this.o);
        sb2.append(", isUnavailable=");
        sb2.append(this.p);
        sb2.append(", time=");
        return vu5.a(')', this.m, sb2);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void u8(izs izsVar, izs izsVar2) {
        a.C1125a.f(this, izsVar, izsVar2);
    }

    public final int xb() {
        return this.c;
    }

    @Override // xsna.vsx0
    public final Peer.Type y2() {
        return getFrom().c;
    }

    public NestedMsg(NestedMsg nestedMsg) {
        this.b = Type.FWD;
        this.f = Peer.Unknown.e;
        this.g = "";
        this.h = "";
        this.i = MsgTextFormat.d;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.b = nestedMsg.b;
        this.c = nestedMsg.c;
        this.d = nestedMsg.d;
        this.e = nestedMsg.e;
        this.f = nestedMsg.f;
        this.m = nestedMsg.m;
        this.g = nestedMsg.g;
        this.h = nestedMsg.h;
        this.i = nestedMsg.i;
        this.j = new ArrayList(nestedMsg.j);
        this.k = new ArrayList(nestedMsg.k);
        this.n = nestedMsg.n;
        this.l = nestedMsg.l;
        this.o = nestedMsg.o;
        this.p = nestedMsg.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NestedMsg(Msg msg, Type type) {
        this.b = Type.FWD;
        this.f = Peer.Unknown.e;
        this.g = "";
        this.h = "";
        this.i = MsgTextFormat.d;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.b = type;
        this.c = msg.b;
        this.d = msg.d;
        this.e = msg.c;
        this.f = msg.getFrom();
        this.m = msg.g;
        if (msg instanceof com.vk.im.engine.models.messages.a) {
            com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) msg;
            this.g = aVar.getTitle();
            this.h = aVar.getBody();
            this.i = aVar.a4();
            this.j = new ArrayList(aVar.K0());
            this.k = new ArrayList(aVar.q7());
            this.n = aVar.V2();
            this.l = aVar.U4();
        }
        this.o = msg.D;
        this.p = msg.m;
    }

    public NestedMsg(Serializer serializer, zcl zclVar) {
        Type type;
        this.b = Type.FWD;
        this.f = Peer.Unknown.e;
        this.g = "";
        this.h = "";
        this.i = MsgTextFormat.d;
        this.j = new ArrayList();
        this.k = new ArrayList();
        Type.a aVar = Type.Companion;
        int u = serializer.u();
        aVar.getClass();
        Type[] typeArr = Type.VALUES;
        int length = typeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                type = null;
                break;
            }
            type = typeArr[i];
            if (type.i() == u) {
                break;
            } else {
                i++;
            }
        }
        if (type != null) {
            this.b = type;
            this.c = serializer.u();
            this.d = serializer.u();
            this.e = serializer.w();
            this.f = (Peer) serializer.G(Peer.class.getClassLoader());
            this.m = serializer.w();
            this.g = serializer.H();
            this.h = serializer.H();
            this.i = (MsgTextFormat) serializer.G(MsgTextFormat.class.getClassLoader());
            this.j = serializer.l(Attach.class.getClassLoader());
            this.k = serializer.l(NestedMsg.class.getClassLoader());
            this.n = (BotKeyboard) serializer.G(BotKeyboard.class.getClassLoader());
            this.l = serializer.l(CarouselItem.class.getClassLoader());
            this.o = serializer.m();
            this.p = serializer.m();
            return;
        }
        throw new IllegalArgumentException(lhg.a(u, "Unknown id="));
    }
}
