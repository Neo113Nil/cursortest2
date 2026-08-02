package com.vk.im.engine.models.messages;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.models.SourceType;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.messages.a;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import xsna.a0a;
import xsna.aux0;
import xsna.bh10;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.gkx0;
import xsna.h630;
import xsna.ho8;
import xsna.izs;
import xsna.ms9;
import xsna.qoy;
import xsna.s3q0;
import xsna.shy;
import xsna.srg;
import xsna.t3w0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MsgFromChannel.kt */
/* loaded from: classes2.dex */
public final class MsgFromChannel extends Msg implements t3w0, com.vk.im.engine.models.messages.a, aux0 {
    public static final Serializer.c<MsgFromChannel> CREATOR = new c();
    public List<Attach> E;
    public ArrayList F;
    public List<? extends MsgReaction> G;
    public Integer H;
    public b I;
    public Integer J;
    public boolean K;
    public boolean L;
    public boolean M;
    public Long N;
    public Peer O;
    public String P;
    public String Q;
    public boolean R;
    public final String S;
    public MsgTextFormat T;
    public ExternalViewTracking U;

    /* compiled from: MsgFromChannel.kt */
    public static final class ExternalViewTracking implements Serializer.StreamParcelable {
        public static final Serializer.c<ExternalViewTracking> CREATOR;
        public static final ExternalViewTracking d;
        public final List<String> b;
        public final List<ViewEvent> c;

        /* compiled from: MsgFromChannel.kt */
        public static final class ViewEvent implements Serializer.StreamParcelable {
            public static final Serializer.c<ViewEvent> CREATOR = new a();
            public final long b;
            public final String c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<ViewEvent> {
                @Override // com.vk.core.serialize.Serializer.c
                public final ViewEvent a(Serializer serializer) {
                    long w = serializer.w();
                    String H = serializer.H();
                    if (H == null) {
                        H = "";
                    }
                    return new ViewEvent(w, H);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ViewEvent[i];
                }
            }

            public ViewEvent(long j, String str) {
                this.b = j;
                this.c = str;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.Y(this.b);
                serializer.j0(this.c);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ViewEvent)) {
                    return false;
                }
                ViewEvent viewEvent = (ViewEvent) obj;
                return this.b == viewEvent.b && epx.f(this.c, viewEvent.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Long.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ViewEvent(sourceId=");
                sb.append(this.b);
                sb.append(", itemId=");
                return ho8.a(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this, parcel);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ExternalViewTracking> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ExternalViewTracking a(Serializer serializer) {
                return new ExternalViewTracking(com.vk.core.serialize.a.a(serializer), serializer.B(ViewEvent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalViewTracking[i];
            }
        }

        static {
            EmptyList emptyList = EmptyList.b;
            d = new ExternalViewTracking(emptyList, emptyList);
            CREATOR = new a();
        }

        public ExternalViewTracking(List<String> list, List<ViewEvent> list2) {
            this.b = list;
            this.c = list2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.l0(this.b);
            serializer.f0(this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExternalViewTracking)) {
                return false;
            }
            ExternalViewTracking externalViewTracking = (ExternalViewTracking) obj;
            return epx.f(this.b, externalViewTracking.b) && epx.f(this.c, externalViewTracking.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExternalViewTracking(urls=");
            sb.append(this.b);
            sb.append(", events=");
            return ms9.a(')', sb, this.c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: MsgFromChannel.kt */
    public static final class a {
        public static MsgFromChannel a(int i, long j, Peer peer, int i2, long j2, Peer peer2, gkx0 gkx0Var, boolean z, boolean z2, gkx0 gkx0Var2, gkx0 gkx0Var3, b bVar, MsgTextFormat msgTextFormat, List list, Long l, int i3, Integer num, boolean z3, boolean z4, boolean z5, String str, MsgSyncState msgSyncState, String str2, MessageSource messageSource, ExternalViewTracking externalViewTracking) {
            MsgFromChannel msgFromChannel = new MsgFromChannel((zcl) null);
            msgFromChannel.b = i;
            msgFromChannel.c = j;
            msgFromChannel.O = peer;
            msgFromChannel.d = i2;
            msgFromChannel.g = j2;
            msgFromChannel.h = peer2;
            msgFromChannel.p = gkx0Var;
            msgFromChannel.q = z;
            msgFromChannel.r = z2;
            msgFromChannel.s = gkx0Var2;
            msgFromChannel.t = gkx0Var3;
            msgFromChannel.I = bVar;
            msgFromChannel.T = msgTextFormat;
            msgFromChannel.E = list;
            msgFromChannel.N = l;
            msgFromChannel.u = i3;
            msgFromChannel.i = true;
            msgFromChannel.J = num;
            msgFromChannel.L = z3;
            msgFromChannel.M = z4;
            msgFromChannel.R = z5;
            msgFromChannel.P = str;
            msgFromChannel.o = msgSyncState;
            msgFromChannel.Q = str2;
            msgFromChannel.A = messageSource;
            msgFromChannel.U = externalViewTracking;
            return msgFromChannel;
        }

        public static MsgFromChannel b(int i, String str, MsgTextFormat msgTextFormat, List list) {
            MsgFromChannel msgFromChannel = new MsgFromChannel((zcl) null);
            msgFromChannel.b = i;
            msgFromChannel.I = b.a(b.A, str, 0, null, null, null, null, false, null, null, 0, 0, 0L, false, 67108862);
            msgFromChannel.T = msgTextFormat;
            msgFromChannel.E = new ArrayList(list);
            return msgFromChannel;
        }
    }

    /* compiled from: MsgFromChannel.kt */
    public static final class b {
        public static final b A;
        public final String a;
        public final String b;
        public final UserId c;
        public final int d;
        public final UserId e;
        public final String f;
        public final PostDonut g;
        public final AuthorAd h;
        public final String i;
        public final String j;
        public final String k;
        public final AttachComments l;
        public final Peer m;
        public final boolean n;
        public final PaidReaction o;
        public final ItemReactions p;
        public final int q;
        public final int r;
        public final long s;
        public final AttachWall.TextLive t;
        public final SourceType u;
        public final long v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        static {
            UserId userId = UserId.d;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            A = new b("", "", userId, 0, userId, "post", null, null, "", "", "", null, Peer.Unknown.e, false, null, null, 0, 0, 0L, null, SourceType.UNKNOWN, 0L, false, false, false, false);
        }

        public b(String str, String str2, UserId userId, int i, UserId userId2, String str3, PostDonut postDonut, AuthorAd authorAd, String str4, String str5, String str6, AttachComments attachComments, Peer peer, boolean z, PaidReaction paidReaction, ItemReactions itemReactions, int i2, int i3, long j, AttachWall.TextLive textLive, SourceType sourceType, long j2, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = str;
            this.b = str2;
            this.c = userId;
            this.d = i;
            this.e = userId2;
            this.f = str3;
            this.g = postDonut;
            this.h = authorAd;
            this.i = str4;
            this.j = str5;
            this.k = str6;
            this.l = attachComments;
            this.m = peer;
            this.n = z;
            this.o = paidReaction;
            this.p = itemReactions;
            this.q = i2;
            this.r = i3;
            this.s = j;
            this.t = textLive;
            this.u = sourceType;
            this.v = j2;
            this.w = z2;
            this.x = z3;
            this.y = z4;
            this.z = z5;
        }

        public static b a(b bVar, String str, int i, PostDonut postDonut, AuthorAd authorAd, AttachComments attachComments, Peer peer, boolean z, PaidReaction paidReaction, ItemReactions itemReactions, int i2, int i3, long j, boolean z2, int i4) {
            String str2 = (i4 & 1) != 0 ? bVar.a : str;
            String str3 = bVar.b;
            UserId userId = bVar.c;
            int i5 = (i4 & 8) != 0 ? bVar.d : i;
            UserId userId2 = bVar.e;
            String str4 = bVar.f;
            PostDonut postDonut2 = (i4 & 64) != 0 ? bVar.g : postDonut;
            AuthorAd authorAd2 = (i4 & 128) != 0 ? bVar.h : authorAd;
            String str5 = bVar.i;
            String str6 = bVar.j;
            String str7 = bVar.k;
            AttachComments attachComments2 = (i4 & 2048) != 0 ? bVar.l : attachComments;
            Peer peer2 = (i4 & 4096) != 0 ? bVar.m : peer;
            boolean z3 = (i4 & 8192) != 0 ? bVar.n : z;
            PaidReaction paidReaction2 = (i4 & 16384) != 0 ? bVar.o : paidReaction;
            ItemReactions itemReactions2 = (32768 & i4) != 0 ? bVar.p : itemReactions;
            int i6 = (65536 & i4) != 0 ? bVar.q : i2;
            int i7 = (131072 & i4) != 0 ? bVar.r : i3;
            long j2 = (262144 & i4) != 0 ? bVar.s : j;
            AttachWall.TextLive textLive = bVar.t;
            SourceType sourceType = bVar.u;
            long j3 = bVar.v;
            boolean z4 = (i4 & 4194304) != 0 ? bVar.w : z2;
            boolean z5 = bVar.x;
            boolean z6 = bVar.y;
            boolean z7 = bVar.z;
            bVar.getClass();
            return new b(str2, str3, userId, i5, userId2, str4, postDonut2, authorAd2, str5, str6, str7, attachComments2, peer2, z3, paidReaction2, itemReactions2, i6, i7, j2, textLive, sourceType, j3, z4, z5, z6, z7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && this.n == bVar.n && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p) && this.q == bVar.q && this.r == bVar.r && this.s == bVar.s && epx.f(this.t, bVar.t) && this.u == bVar.u && this.v == bVar.v && this.w == bVar.w && this.x == bVar.x && this.y == bVar.y && this.z == bVar.z;
        }

        public final int hashCode() {
            int a = urd0.a(bh10.a(shy.a(this.d, bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c.b), 31), 31, this.e.b), 31, this.f);
            PostDonut postDonut = this.g;
            int hashCode = (a + (postDonut == null ? 0 : postDonut.hashCode())) * 31;
            AuthorAd authorAd = this.h;
            int a2 = urd0.a(urd0.a(urd0.a((hashCode + (authorAd == null ? 0 : authorAd.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
            AttachComments attachComments = this.l;
            int b = qoy.b(bh10.a((a2 + (attachComments == null ? 0 : attachComments.hashCode())) * 31, 31, this.m.b), 31, this.n);
            PaidReaction paidReaction = this.o;
            int hashCode2 = (b + (paidReaction == null ? 0 : paidReaction.hashCode())) * 31;
            ItemReactions itemReactions = this.p;
            int a3 = bh10.a(shy.a(this.r, shy.a(this.q, (hashCode2 + (itemReactions == null ? 0 : itemReactions.hashCode())) * 31, 31), 31), 31, this.s);
            AttachWall.TextLive textLive = this.t;
            return Boolean.hashCode(this.z) + qoy.b(qoy.b(qoy.b(bh10.a((this.u.hashCode() + ((a3 + (textLive != null ? textLive.hashCode() : 0)) * 31)) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(text=");
            sb.append(this.a);
            sb.append(", accessKey=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", postId=");
            sb.append(this.d);
            sb.append(", fromId=");
            sb.append(this.e);
            sb.append(", postType=");
            sb.append(this.f);
            sb.append(", donut=");
            sb.append(this.g);
            sb.append(", authorAd=");
            sb.append(this.h);
            sb.append(", trackCode=");
            sb.append(this.i);
            sb.append(", deletedReason=");
            sb.append(this.j);
            sb.append(", deletedDetails=");
            sb.append(this.k);
            sb.append(", comments=");
            sb.append(this.l);
            sb.append(", signerId=");
            sb.append(this.m);
            sb.append(", isAdvertisement=");
            sb.append(this.n);
            sb.append(", paidReaction=");
            sb.append(this.o);
            sb.append(", reactions=");
            sb.append(this.p);
            sb.append(", repostsCount=");
            sb.append(this.q);
            sb.append(", viewsCount=");
            sb.append(this.r);
            sb.append(", publishDate=");
            sb.append(this.s);
            sb.append(", textLive=");
            sb.append(this.t);
            sb.append(", sourceType=");
            sb.append(this.u);
            sb.append(", sourceId=");
            sb.append(this.v);
            sb.append(", isViewed=");
            sb.append(this.w);
            sb.append(", isVerified=");
            sb.append(this.x);
            sb.append(", isFakeNews=");
            sb.append(this.y);
            sb.append(", isDonutPhotos=");
            return q0.a(sb, this.z, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<MsgFromChannel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgFromChannel a(Serializer serializer) {
            return new MsgFromChannel(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgFromChannel[i];
        }
    }

    public /* synthetic */ MsgFromChannel(zcl zclVar) {
        this();
    }

    public static ArrayList ac(AttachWall attachWall) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(attachWall.o);
        List<Attach> list = attachWall.o;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AttachWall) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.addAll(ac((AttachWall) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void oc(AttachWall attachWall, izs izsVar, izs izsVar2) {
        ListIterator<Attach> listIterator = attachWall.o.listIterator();
        while (listIterator.hasNext()) {
            Attach attach = (Attach) listIterator.next();
            if (((Boolean) izsVar.invoke(attach)).booleanValue()) {
                listIterator.set(izsVar2.invoke(attach));
            }
            if (attach instanceof AttachWall) {
                oc((AttachWall) attach, izsVar, izsVar2);
            }
        }
    }

    @Override // com.vk.im.engine.models.messages.a
    public final boolean A4(boolean z) {
        return super.D3(AttachWall.class, z);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Ab(Msg msg) {
        super.Ab(msg);
        MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
        if (msgFromChannel != null) {
            MsgFromChannel msgFromChannel2 = (MsgFromChannel) msg;
            this.O = msgFromChannel2.O;
            this.E = new ArrayList(msgFromChannel.E);
            this.J = msgFromChannel2.J;
            this.K = msgFromChannel2.K;
            this.L = msgFromChannel2.L;
            this.M = msgFromChannel2.M;
            this.A = msg.A;
            this.I = msgFromChannel2.I;
            this.T = msgFromChannel2.T;
            this.N = msgFromChannel2.N;
        }
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void Ba(MsgTextFormat msgTextFormat) {
        this.T = msgTextFormat;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean Hb() {
        return this.N != null;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void I3(ArrayList arrayList) {
        this.F = arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void J2(Class cls, boolean z, ArrayList arrayList, boolean z2) {
        a.C1125a.e(this, cls, z, arrayList, z2);
    }

    @Override // xsna.aux0
    public final List<MsgReaction> K() {
        return this.G;
    }

    @Override // xsna.t3w0, com.vk.im.engine.models.messages.a
    public final List<Attach> K0() {
        return this.E;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void L2(Attach attach) {
        nc(new srg(attach, 28), new h630(attach, 2));
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void P9() {
        throw new UnsupportedOperationException("Unsupported operation for MsgFromChannel");
    }

    @Override // xsna.aux0
    public final boolean Qa() {
        Integer num;
        ItemReactions itemReactions = this.I.p;
        int i = itemReactions != null ? itemReactions.c : 0;
        if (i == 0 && this.J == null) {
            return false;
        }
        return (i == 1 && (num = this.J) != null && num.intValue() == -1) ? false : true;
    }

    @Override // xsna.aux0
    public final Integer R5() {
        return this.H;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = new ArrayList(serializer.l(Attach.class.getClassLoader()));
        this.N = serializer.x();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.O = Peer.a.b(serializer.w());
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.W(this.E);
        serializer.b0(this.N);
        serializer.Y(this.O.b);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<CarouselItem> U4() {
        return null;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final BotKeyboard V2() {
        return null;
    }

    public final AttachWall Yb() {
        b bVar = this.I;
        AttachWall attachWall = new AttachWall();
        attachWall.m = bVar.a;
        attachWall.n = bVar.b;
        attachWall.d = bVar.c;
        attachWall.e = bVar.d;
        attachWall.f = bVar.e;
        attachWall.r = bVar.f;
        attachWall.s = bVar.g;
        attachWall.j = bVar.h;
        attachWall.C = bVar.i;
        attachWall.D = bVar.j;
        attachWall.E = bVar.k;
        attachWall.v = bVar.l;
        attachWall.B = bVar.m;
        attachWall.h = bVar.n;
        attachWall.x = bVar.p;
        attachWall.w = bVar.q;
        attachWall.y = bVar.r;
        attachWall.p = bVar.s;
        attachWall.t = bVar.t;
        attachWall.k = bVar.u;
        attachWall.l = bVar.v;
        attachWall.o = this.E;
        attachWall.q = bVar.w;
        attachWall.z = bVar.x;
        return attachWall;
    }

    public final ArrayList Zb() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.E);
        List<Attach> list = this.E;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AttachWall) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.addAll(ac((AttachWall) it.next()));
        }
        return arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final MsgTextFormat a4() {
        return this.T;
    }

    public final boolean bc() {
        AttachComments attachComments;
        return (this.K || (attachComments = this.I.l) == null || !attachComments.d) ? false : true;
    }

    public final String cc() {
        return this.P;
    }

    @Override // xsna.aux0
    public final void d(Integer num) {
        this.H = num;
    }

    public final boolean dc() {
        b bVar = this.I;
        PostDonut postDonut = bVar.g;
        return ((postDonut != null ? postDonut.c : null) == null || bVar.z) ? false : true;
    }

    public final AttachWithTranscription ec() {
        return (AttachWithTranscription) a.C1125a.a(this, AttachWithTranscription.class);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MsgFromChannel.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        MsgFromChannel msgFromChannel = (MsgFromChannel) obj;
        return epx.f(this.E, msgFromChannel.E) && epx.f(this.J, msgFromChannel.J) && this.K == msgFromChannel.K && this.L == msgFromChannel.L && this.M == msgFromChannel.M && epx.f(this.I, msgFromChannel.I) && epx.f(this.T, msgFromChannel.T) && epx.f(this.N, msgFromChannel.N) && epx.f(this.O, msgFromChannel.O);
    }

    @Override // xsna.aux0
    public final void f5(List<? extends MsgReaction> list) {
        this.G = list;
    }

    public final int fc() {
        return this.I.d;
    }

    public final boolean gc() {
        return this.R;
    }

    @Override // xsna.t3w0, com.vk.im.engine.models.messages.a
    public final String getBody() {
        return this.I.a;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getTitle() {
        return this.S;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void h3(List<Attach> list) {
        this.E = list;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        int a2 = fw3.a(super.hashCode() * 31, 31, this.E);
        Integer num = this.J;
        int hashCode = (this.T.hashCode() + ((this.I.hashCode() + qoy.b(qoy.b(qoy.b((a2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.K), 31, this.L), 31, this.M)) * 31)) * 31;
        Long l = this.N;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final boolean hc(Group group) {
        b bVar = this.I;
        if (bVar.n || !drm0.N(bVar.j) || this.I.y || !Qb()) {
            return false;
        }
        if (group == null) {
            return true;
        }
        if (group.t != GroupPrivacy.OPEN) {
            return false;
        }
        PostDonut postDonut = this.I.g;
        return true;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void i2(izs<? super NestedMsg, s3q0> izsVar, boolean z) {
        super.i2(izsVar, false);
    }

    public final boolean ic() {
        return D3(AttachSticker.class, false);
    }

    public final void jc(AttachComments attachComments) {
        this.I = b.a(this.I, null, 0, null, null, attachComments, null, false, null, null, 0, 0, 0L, false, 67106815);
    }

    public final void kc(ItemReactions itemReactions) {
        this.I = b.a(this.I, null, 0, null, null, null, null, false, null, itemReactions, 0, 0, 0L, false, 67076095);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final <T extends Attach> T l2(Class<T> cls, boolean z) {
        return (T) super.l2(AttachAudioMsg.class, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final Attach l4(izs<? super Attach, Boolean> izsVar, boolean z) {
        return com.vk.im.engine.models.messages.a.Q7(this, izsVar, z);
    }

    public final void lc(PaidReaction paidReaction) {
        this.I = b.a(this.I, null, 0, null, null, null, null, false, paidReaction, null, 0, 0, 0L, false, 67092479);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void m(String str) {
        throw new UnsupportedOperationException("Unsupported operation for MsgFromChannel");
    }

    public final String mc() {
        String str;
        AttachWall.TextLive textLive = this.I.t;
        if (textLive != null && (str = textLive.c) != null) {
            return str;
        }
        return "https://" + a0a.d + "/im/channels/" + this.I.c + "?cmid=" + this.I.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nc(izs izsVar, izs izsVar2) {
        ListIterator<Attach> listIterator = this.E.listIterator();
        while (listIterator.hasNext()) {
            Attach attach = (Attach) listIterator.next();
            if (((Boolean) izsVar.invoke(attach)).booleanValue()) {
                listIterator.set(izsVar2.invoke(attach));
            }
            if (attach instanceof AttachWall) {
                oc((AttachWall) attach, izsVar, izsVar2);
            }
        }
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void o3(ArrayList arrayList) {
        a.C1125a.b(this, arrayList);
    }

    public final UserId q() {
        return this.I.c;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<NestedMsg> q7() {
        return this.F;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void u8(izs izsVar, izs izsVar2) {
        nc(izsVar, izsVar2);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgFromChannel(this);
    }

    public MsgFromChannel(MsgFromChannel msgFromChannel) {
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = EmptyList.b;
        this.I = b.A;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.O = Peer.Unknown.e;
        this.S = "";
        this.T = MsgTextFormat.d;
        this.U = ExternalViewTracking.d;
        Ab(msgFromChannel);
    }

    public MsgFromChannel() {
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = EmptyList.b;
        this.I = b.A;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.O = Peer.Unknown.e;
        this.S = "";
        this.T = MsgTextFormat.d;
        this.U = ExternalViewTracking.d;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Ub(boolean z) {
    }

    public MsgFromChannel(Serializer serializer, zcl zclVar) {
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = EmptyList.b;
        this.I = b.A;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.O = Peer.Unknown.e;
        this.S = "";
        this.T = MsgTextFormat.d;
        this.U = ExternalViewTracking.d;
        Bb(serializer);
    }
}
