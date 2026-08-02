package com.vk.im.engine.models.dialogs;

import com.vk.dto.common.Peer;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vjm;
import xsna.vu5;

/* compiled from: DialogApiModel.kt */
/* loaded from: classes2.dex */
public final class a {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final List<Integer> F;
    public final int G;
    public final long H;
    public final boolean I;
    public final boolean J;
    public final TransitionData K;
    public final int L;
    public final long a;
    public final int b;
    public final vjm c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final PushSettings i;
    public final WritePermission j;
    public final boolean k;
    public final boolean l;
    public PinnedMsg m;
    public final InfoBar n;
    public final ConversationCard o;
    public final ChatSettings p;
    public final GroupCallInProgress q;
    public final c r;
    public final BotKeyboard s;
    public final MsgRequestStatus t;
    public final Peer u;
    public final long v;
    public final List<Integer> w;
    public final List<Integer> x;
    public final List<Integer> y;
    public final BusinessNotifyInfo z;

    public a(long j, int i, vjm vjmVar, int i2, int i3, int i4, int i5, boolean z, PushSettings pushSettings, WritePermission writePermission, boolean z2, boolean z3, PinnedMsg pinnedMsg, InfoBar infoBar, ConversationCard conversationCard, ChatSettings chatSettings, GroupCallInProgress groupCallInProgress, c cVar, BotKeyboard botKeyboard, MsgRequestStatus msgRequestStatus, Peer peer, long j2, List<Integer> list, List<Integer> list2, List<Integer> list3, BusinessNotifyInfo businessNotifyInfo, int i6, boolean z4, boolean z5, boolean z6, String str, List<Integer> list4, int i7, long j3, boolean z7, boolean z8, TransitionData transitionData, int i8) {
        this.a = j;
        this.b = i;
        this.c = vjmVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = pushSettings;
        this.j = writePermission;
        this.k = z2;
        this.l = z3;
        this.m = pinnedMsg;
        this.n = infoBar;
        this.o = conversationCard;
        this.p = chatSettings;
        this.q = groupCallInProgress;
        this.r = cVar;
        this.s = botKeyboard;
        this.t = msgRequestStatus;
        this.u = peer;
        this.v = j2;
        this.w = list;
        this.x = list2;
        this.y = list3;
        this.z = businessNotifyInfo;
        this.A = i6;
        this.B = z4;
        this.C = z5;
        this.D = z6;
        this.E = str;
        this.F = list4;
        this.G = i7;
        this.H = j3;
        this.I = z7;
        this.J = z8;
        this.K = transitionData;
        this.L = i8;
    }

    public final List<Integer> A() {
        return this.x;
    }

    public final int B() {
        return this.L;
    }

    public final TransitionData C() {
        return this.K;
    }

    public final int D() {
        return this.b;
    }

    public final List<Integer> E() {
        return this.w;
    }

    public final List<Integer> F() {
        return this.F;
    }

    public final long G() {
        return this.H;
    }

    public final WritePermission H() {
        return this.j;
    }

    public final boolean I() {
        return this.C;
    }

    public final boolean J() {
        return this.I;
    }

    public final boolean K() {
        return this.B;
    }

    public final boolean L() {
        return this.D;
    }

    public final InfoBar a() {
        return this.n;
    }

    public final BusinessNotifyInfo b() {
        return this.z;
    }

    public final int c() {
        return this.A;
    }

    public final boolean d() {
        return this.J;
    }

    public final boolean e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o) && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q) && epx.f(this.r, aVar.r) && epx.f(this.s, aVar.s) && this.t == aVar.t && epx.f(this.u, aVar.u) && this.v == aVar.v && epx.f(this.w, aVar.w) && epx.f(this.x, aVar.x) && epx.f(this.y, aVar.y) && epx.f(this.z, aVar.z) && this.A == aVar.A && this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && epx.f(this.E, aVar.E) && epx.f(this.F, aVar.F) && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && epx.f(this.K, aVar.K) && this.L == aVar.L;
    }

    public final boolean f() {
        return this.k;
    }

    public final ChatSettings g() {
        return this.p;
    }

    public final ConversationCard h() {
        return this.o;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.j.hashCode() + ((this.i.hashCode() + qoy.b(shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, (this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31), 31), 31), 31), 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l);
        PinnedMsg pinnedMsg = this.m;
        int hashCode = (b + (pinnedMsg == null ? 0 : pinnedMsg.hashCode())) * 31;
        InfoBar infoBar = this.n;
        int hashCode2 = (hashCode + (infoBar == null ? 0 : infoBar.hashCode())) * 31;
        ConversationCard conversationCard = this.o;
        int hashCode3 = (hashCode2 + (conversationCard == null ? 0 : conversationCard.hashCode())) * 31;
        ChatSettings chatSettings = this.p;
        int hashCode4 = (hashCode3 + (chatSettings == null ? 0 : chatSettings.hashCode())) * 31;
        GroupCallInProgress groupCallInProgress = this.q;
        int a = urd0.a((hashCode4 + (groupCallInProgress == null ? 0 : groupCallInProgress.hashCode())) * 31, 31, this.r.a);
        BotKeyboard botKeyboard = this.s;
        int a2 = fw3.a(fw3.a(fw3.a(bh10.a(bh10.a((this.t.hashCode() + ((a + (botKeyboard == null ? 0 : botKeyboard.hashCode())) * 31)) * 31, 31, this.u.b), 31, this.v), 31, this.w), 31, this.x), 31, this.y);
        BusinessNotifyInfo businessNotifyInfo = this.z;
        int b2 = qoy.b(qoy.b(bh10.a(shy.a(this.G, fw3.a(urd0.a(qoy.b(qoy.b(qoy.b(shy.a(this.A, (a2 + (businessNotifyInfo == null ? 0 : businessNotifyInfo.hashCode())) * 31, 31), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31), 31, this.H), 31, this.I), 31, this.J);
        TransitionData transitionData = this.K;
        return Integer.hashCode(this.L) + ((b2 + (transitionData != null ? transitionData.hashCode() : 0)) * 31);
    }

    public final int i() {
        return this.g;
    }

    public final c j() {
        return this.r;
    }

    public final List<Integer> k() {
        return this.y;
    }

    public final int l() {
        return this.G;
    }

    public final GroupCallInProgress m() {
        return this.q;
    }

    public final long n() {
        return this.a;
    }

    public final BotKeyboard o() {
        return this.s;
    }

    public final int p() {
        return this.f;
    }

    public final boolean q() {
        return this.h;
    }

    public final long r() {
        return this.v;
    }

    public final Peer s() {
        return this.u;
    }

    public final MsgRequestStatus t() {
        return this.t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogApiModel(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", sortId=");
        sb.append(this.c);
        sb.append(", readTillInMsgCnvId=");
        sb.append(this.d);
        sb.append(", readTillOutMsgCnvId=");
        sb.append(this.e);
        sb.append(", lastMsgCnvId=");
        sb.append(this.f);
        sb.append(", countUnread=");
        sb.append(this.g);
        sb.append(", markedAsUnread=");
        sb.append(this.h);
        sb.append(", pushSettings=");
        sb.append(this.i);
        sb.append(", writePermission=");
        sb.append(this.j);
        sb.append(", canSendMoney=");
        sb.append(this.k);
        sb.append(", canReceiveMoney=");
        sb.append(this.l);
        sb.append(", pinnedMsg=");
        sb.append(this.m);
        sb.append(", bar=");
        sb.append(this.n);
        sb.append(", conversationCard=");
        sb.append(this.o);
        sb.append(", chatSettings=");
        sb.append(this.p);
        sb.append(", groupCallInProgress=");
        sb.append(this.q);
        sb.append(", dialogThemeId=");
        sb.append(this.r);
        sb.append(", keyboard=");
        sb.append(this.s);
        sb.append(", msgRequestStatus=");
        sb.append(this.t);
        sb.append(", msgRequestInviter=");
        sb.append(this.u);
        sb.append(", msgRequestDate=");
        sb.append(this.v);
        sb.append(", unreadMentionMsgCnvIds=");
        sb.append(this.w);
        sb.append(", tags=");
        sb.append(this.x);
        sb.append(", expireMsgCnvIds=");
        sb.append(this.y);
        sb.append(", businessNotifyInfo=");
        sb.append(this.z);
        sb.append(", canMarkAsSpamUntilMs=");
        sb.append(this.A);
        sb.append(", isNew=");
        sb.append(this.B);
        sb.append(", isArchived=");
        sb.append(this.C);
        sb.append(", isPromo=");
        sb.append(this.D);
        sb.append(", payloadJson=");
        sb.append(this.E);
        sb.append(", unreadReactions=");
        sb.append(this.F);
        sb.append(", flags=");
        sb.append(this.G);
        sb.append(", version=");
        sb.append(this.H);
        sb.append(", isDead=");
        sb.append(this.I);
        sb.append(", canPromoGifts=");
        sb.append(this.J);
        sb.append(", transitionData=");
        sb.append(this.K);
        sb.append(", timestamp=");
        return vu5.b(sb, this.L, ')');
    }

    public final String u() {
        return this.E;
    }

    public final PinnedMsg v() {
        return this.m;
    }

    public final PushSettings w() {
        return this.i;
    }

    public final int x() {
        return this.d;
    }

    public final int y() {
        return this.e;
    }

    public final vjm z() {
        return this.c;
    }
}
