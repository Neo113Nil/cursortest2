package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import com.vk.dto.common.Peer;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.MsgReaction;
import defpackage.q0;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.eq;
import xsna.gkx0;
import xsna.qoy;
import xsna.shy;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class c {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final C1166c D;
    public final g E;
    public final b F;
    public final d G;
    public final e H;
    public final f I;
    public final MessageSource J;
    public final int K;
    public final long L;
    public final boolean M;
    public final boolean N;
    public final gkx0 O;
    public final gkx0 P;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final Long f;
    public final Long g;
    public final long h;
    public final MsgSyncState i;
    public final Peer j;
    public final gkx0 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: ChatListModels.kt */
    public static final class a {
        public final List<MsgReaction> a;
        public final Integer b;
        public final boolean c;

        public a(Integer num, List list, boolean z) {
            this.a = list;
            this.b = num;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MetaMsgWithReactions(reactions=");
            sb.append(this.a);
            sb.append(", myReaction=");
            sb.append(this.b);
            sb.append(", hasReactions=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final a f;
        public final boolean g;
        public final long h;
        public final boolean i;

        public b(boolean z, boolean z2, boolean z3, boolean z4, int i, a aVar, boolean z5, long j, boolean z6) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = i;
            this.f = aVar;
            this.g = z5;
            this.h = j;
            this.i = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && epx.f(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            int a = shy.a(this.e, qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            a aVar = this.f;
            return Boolean.hashCode(this.i) + bh10.a(qoy.b((a + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MsgMetaFromChannel(hasForwardWall=");
            sb.append(this.a);
            sb.append(", isPoll=");
            sb.append(this.b);
            sb.append(", isSticker=");
            sb.append(this.c);
            sb.append(", isStory=");
            sb.append(this.d);
            sb.append(", viewsCount=");
            sb.append(this.e);
            sb.append(", msgWithReactions=");
            sb.append(this.f);
            sb.append(", isPostponed=");
            sb.append(this.g);
            sb.append(", publishDate=");
            sb.append(this.h);
            sb.append(", isOutgoing=");
            return q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c$c, reason: collision with other inner class name */
    public static final class C1166c {
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final long G;
        public final a H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final Peer a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final boolean r;
        public final boolean s;
        public final boolean t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        public C1166c(Peer peer, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, long j, a aVar, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34) {
            this.a = peer;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = z5;
            this.g = i;
            this.h = z6;
            this.i = z7;
            this.j = i2;
            this.k = z8;
            this.l = z9;
            this.m = z10;
            this.n = z11;
            this.o = z12;
            this.p = z13;
            this.q = z14;
            this.r = z15;
            this.s = z16;
            this.t = z17;
            this.u = z18;
            this.v = z19;
            this.w = z20;
            this.x = z21;
            this.y = z22;
            this.z = z23;
            this.A = z24;
            this.B = z25;
            this.C = z26;
            this.D = z27;
            this.E = z28;
            this.F = z29;
            this.G = j;
            this.H = aVar;
            this.I = z30;
            this.J = z31;
            this.K = z32;
            this.L = z33;
            this.M = z34;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1166c)) {
                return false;
            }
            C1166c c1166c = (C1166c) obj;
            return epx.f(this.a, c1166c.a) && this.b == c1166c.b && this.c == c1166c.c && this.d == c1166c.d && this.e == c1166c.e && this.f == c1166c.f && this.g == c1166c.g && this.h == c1166c.h && this.i == c1166c.i && this.j == c1166c.j && this.k == c1166c.k && this.l == c1166c.l && this.m == c1166c.m && this.n == c1166c.n && this.o == c1166c.o && this.p == c1166c.p && this.q == c1166c.q && this.r == c1166c.r && this.s == c1166c.s && this.t == c1166c.t && this.u == c1166c.u && this.v == c1166c.v && this.w == c1166c.w && this.x == c1166c.x && this.y == c1166c.y && this.z == c1166c.z && this.A == c1166c.A && this.B == c1166c.B && this.C == c1166c.C && this.D == c1166c.D && this.E == c1166c.E && this.F == c1166c.F && this.G == c1166c.G && epx.f(this.H, c1166c.H) && this.I == c1166c.I && this.J == c1166c.J && this.K == c1166c.K && this.L == c1166c.L && this.M == c1166c.M;
        }

        public final int hashCode() {
            int a = bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.j, qoy.b(qoy.b(shy.a(this.g, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
            a aVar = this.H;
            return Boolean.hashCode(this.M) + qoy.b(qoy.b(qoy.b(qoy.b((a + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.I), 31, this.J), 31, this.K), 31, this.L);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MsgMetaFromUser(from=");
            sb.append(this.a);
            sb.append(", isCasper=");
            sb.append(this.b);
            sb.append(", isSyncStateSuccess=");
            sb.append(this.c);
            sb.append(", hasAttachCall=");
            sb.append(this.d);
            sb.append(", hasAttachWidget=");
            sb.append(this.e);
            sb.append(", hasAttaches=");
            sb.append(this.f);
            sb.append(", attachCount=");
            sb.append(this.g);
            sb.append(", isExpired=");
            sb.append(this.h);
            sb.append(", hasFwd=");
            sb.append(this.i);
            sb.append(", forwardCount=");
            sb.append(this.j);
            sb.append(", hasReply=");
            sb.append(this.k);
            sb.append(", hasBody=");
            sb.append(this.l);
            sb.append(", isStory=");
            sb.append(this.m);
            sb.append(", isMsgWithTranscription=");
            sb.append(this.n);
            sb.append(", isPoll=");
            sb.append(this.o);
            sb.append(", isSticker=");
            sb.append(this.p);
            sb.append(", isGraffiti=");
            sb.append(this.q);
            sb.append(", hasCarousel=");
            sb.append(this.r);
            sb.append(", isNft=");
            sb.append(this.s);
            sb.append(", isCall=");
            sb.append(this.t);
            sb.append(", isIncoming=");
            sb.append(this.u);
            sb.append(", isVideoMsg=");
            sb.append(this.v);
            sb.append(", hasVideoMessage=");
            sb.append(this.w);
            sb.append(", hasAttachPlaylist=");
            sb.append(this.x);
            sb.append(", hasAttachArtist=");
            sb.append(this.y);
            sb.append(", hasAttachAudio=");
            sb.append(this.z);
            sb.append(", hasOnlyPublicOrExternalVideo=");
            sb.append(this.A);
            sb.append(", isAudio=");
            sb.append(this.B);
            sb.append(", isPlayableAudio=");
            sb.append(this.C);
            sb.append(", isAudioMsg=");
            sb.append(this.D);
            sb.append(", isPlaylist=");
            sb.append(this.E);
            sb.append(", isArtist=");
            sb.append(this.F);
            sb.append(", time=");
            sb.append(this.G);
            sb.append(", msgWithReactions=");
            sb.append(this.H);
            sb.append(", isWallPost=");
            sb.append(this.I);
            sb.append(", isActiveWallPost=");
            sb.append(this.J);
            sb.append(", isPublicVideo=");
            sb.append(this.K);
            sb.append(", hasOnlyNestedSingleClips=");
            sb.append(this.L);
            sb.append(", isChannelPost=");
            return q0.a(sb, this.M, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class d {
        public static final d a = new d();
    }

    /* compiled from: ChatListModels.kt */
    public static final class e {
        public final Peer a;

        public e(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            Peer peer = this.a;
            if (peer == null) {
                return 0;
            }
            return Long.hashCode(peer.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("MsgMetaWithFrom(msgWithFromPeer="), this.a, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class f {
        public final Peer a;

        public f(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            Peer peer = this.a;
            if (peer == null) {
                return 0;
            }
            return Long.hashCode(peer.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("MsgMetaWithMember(msgWithMemberPeer="), this.a, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class g {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final int g;
        public final boolean h;

        public g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, boolean z6) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = i;
            this.g = i2;
            this.h = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.h == gVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + shy.a(this.g, shy.a(this.f, qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MsgMetaWithUserContent(hasBody=");
            sb.append(this.a);
            sb.append(", isVideoMsg=");
            sb.append(this.b);
            sb.append(", hasNested=");
            sb.append(this.c);
            sb.append(", hasAttachGift=");
            sb.append(this.d);
            sb.append(", hasAttachMarket=");
            sb.append(this.e);
            sb.append(", contentAttachListSize=");
            sb.append(this.f);
            sb.append(", audioMsgDuration=");
            sb.append(this.g);
            sb.append(", isInactiveStory=");
            return q0.a(sb, this.h, ')');
        }
    }

    public c(int i, int i2, int i3, long j, long j2, Long l, Long l2, long j3, MsgSyncState msgSyncState, Peer peer, gkx0 gkx0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str, C1166c c1166c, g gVar, b bVar, d dVar, e eVar, f fVar, MessageSource messageSource, int i4, long j4, boolean z18, boolean z19, gkx0 gkx0Var2, gkx0 gkx0Var3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = l;
        this.g = l2;
        this.h = j3;
        this.i = msgSyncState;
        this.j = peer;
        this.k = gkx0Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = z9;
        this.u = z10;
        this.v = z11;
        this.w = z12;
        this.x = z13;
        this.y = z14;
        this.z = z15;
        this.A = z16;
        this.B = z17;
        this.C = str;
        this.D = c1166c;
        this.E = gVar;
        this.F = bVar;
        this.G = dVar;
        this.H = eVar;
        this.I = fVar;
        this.J = messageSource;
        this.K = i4;
        this.L = j4;
        this.M = z18;
        this.N = z19;
        this.O = gkx0Var2;
        this.P = gkx0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i && epx.f(this.j, cVar.j) && epx.f(this.k, cVar.k) && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p && this.q == cVar.q && this.r == cVar.r && this.s == cVar.s && this.t == cVar.t && this.u == cVar.u && this.v == cVar.v && this.w == cVar.w && this.x == cVar.x && this.y == cVar.y && this.z == cVar.z && this.A == cVar.A && this.B == cVar.B && this.C.equals(cVar.C) && epx.f(this.D, cVar.D) && epx.f(this.E, cVar.E) && epx.f(this.F, cVar.F) && epx.f(this.G, cVar.G) && this.H.equals(cVar.H) && this.I.equals(cVar.I) && this.J == cVar.J && this.K == cVar.K && this.L == cVar.L && this.M == cVar.M && this.N == cVar.N && epx.f(this.O, cVar.O) && epx.f(this.P, cVar.P);
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
        Long l = this.f;
        int hashCode = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int hashCode2 = (this.C.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(bh10.a((this.i.hashCode() + bh10.a((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.h)) * 31, 31, this.j.b), 31, this.k.b), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B)) * 31;
        C1166c c1166c = this.D;
        int hashCode3 = (hashCode2 + (c1166c == null ? 0 : c1166c.hashCode())) * 31;
        g gVar = this.E;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        b bVar = this.F;
        int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.G;
        return Long.hashCode(this.P.b) + bh10.a(qoy.b(qoy.b(bh10.a(shy.a(this.K, (this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31), 31, this.L), 31, this.M), 31, this.N), 31, this.O.b);
    }

    public final String toString() {
        return "MsgMeta(id=" + this.a + ", localId=" + this.b + ", cnvMsgId=" + this.c + ", valueMsgUniqSenderThemeChatId=" + this.d + ", dialogId=" + this.e + ", deleteTtlMs=" + this.f + ", expireTtlMs=" + this.g + ", time=" + this.h + ", syncState=" + this.i + ", from=" + this.j + ", weight=" + this.k + ", isNotExpirable=" + this.l + ", isRealId=" + this.m + ", isNotLocal=" + this.n + ", isIncoming=" + this.o + ", isCasper=" + this.p + ", isOutgoing=" + this.q + ", isEdited=" + this.r + ", isExpired=" + this.s + ", isLocal=" + this.t + ", isPinned=" + this.u + ", isValueMsgExpirable=" + this.v + ", isValueMsgFromSelf=" + this.w + ", isValueMsgIncoming=" + this.x + ", isValueMsgToSelf=" + this.y + ", isSyncStateSending=" + this.z + ", isSyncStateFailure=" + this.A + ", isWithShareableAttach=" + this.B + ", body=" + ((Object) this.C) + ", msgMetaFromUser=" + this.D + ", msgMetaWithUserContent=" + this.E + ", msgMetaFromChannel=" + this.F + ", msgMetaUnsupported=" + this.G + ", msgMetaWithFrom=" + this.H + ", msgMetaWithMember=" + this.I + ", source=" + this.J + ", phaseId=" + this.K + ", version=" + this.L + ", hasSpaceBefore=" + this.M + ", hasSpaceAfter=" + this.N + ", weightBefore=" + this.O + ", weightAfter=" + this.P + ')';
    }
}
