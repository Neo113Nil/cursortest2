package com.vk.im.engine.models.dialogs;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.btx0;
import xsna.epx;
import xsna.fw3;
import xsna.gkx0;
import xsna.lmm;
import xsna.po40;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vjm;
import xsna.vu5;

/* compiled from: DialogStorageModel.kt */
/* loaded from: classes.dex */
public final class b implements btx0 {
    public final GroupCallInProgress A;
    public final boolean B;
    public final c C;
    public final BotKeyboard D;
    public final boolean E;
    public final MsgRequestStatus F;
    public final Peer G;
    public final long H;
    public final MsgRequestStatus I;
    public final List<Integer> J;
    public final List<Integer> K;
    public final List<Integer> L;
    public final BusinessNotifyInfo M;
    public final boolean N;
    public final int O;
    public final int P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final String T;
    public final List<Integer> U;
    public final List<Integer> V;
    public final int W;
    public final long X;
    public final boolean Y;
    public final boolean Z;
    public final TransitionData a0;
    public final long b;
    public final int b0;
    public final int c;
    public final vjm d;
    public final vjm e;
    public final gkx0 f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final Boolean n;
    public final PushSettings o;
    public final PushSettings p;
    public final WritePermission q;
    public final boolean r;
    public final boolean s;
    public final PinnedMsg t;
    public final boolean u;
    public final DraftMsg v;
    public final InfoBar w;
    public final ConversationCard x;
    public final boolean y;
    public final ChatSettings z;

    public b() {
        throw null;
    }

    public b(long j, int i, vjm vjmVar, vjm vjmVar2, gkx0 gkx0Var, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, Boolean bool, PushSettings pushSettings, PushSettings pushSettings2, WritePermission writePermission, boolean z2, boolean z3, PinnedMsg pinnedMsg, boolean z4, DraftMsg draftMsg, InfoBar infoBar, ConversationCard conversationCard, boolean z5, ChatSettings chatSettings, GroupCallInProgress groupCallInProgress, boolean z6, c cVar, BotKeyboard botKeyboard, boolean z7, MsgRequestStatus msgRequestStatus, Peer peer, long j2, MsgRequestStatus msgRequestStatus2, List list, List list2, List list3, BusinessNotifyInfo businessNotifyInfo, boolean z8, int i8, int i9, boolean z9, boolean z10, boolean z11, String str, List list4, List list5, int i10, long j3, boolean z12, boolean z13, TransitionData transitionData, int i11) {
        this.b = j;
        this.c = i;
        this.d = vjmVar;
        this.e = vjmVar2;
        this.f = gkx0Var;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = z;
        this.n = bool;
        this.o = pushSettings;
        this.p = pushSettings2;
        this.q = writePermission;
        this.r = z2;
        this.s = z3;
        this.t = pinnedMsg;
        this.u = z4;
        this.v = draftMsg;
        this.w = infoBar;
        this.x = conversationCard;
        this.y = z5;
        this.z = chatSettings;
        this.A = groupCallInProgress;
        this.B = z6;
        this.C = cVar;
        this.D = botKeyboard;
        this.E = z7;
        this.F = msgRequestStatus;
        this.G = peer;
        this.H = j2;
        this.I = msgRequestStatus2;
        this.J = list;
        this.K = list2;
        this.L = list3;
        this.M = businessNotifyInfo;
        this.N = z8;
        this.O = i8;
        this.P = i9;
        this.Q = z9;
        this.R = z10;
        this.S = z11;
        this.T = str;
        this.U = list4;
        this.V = list5;
        this.W = i10;
        this.X = j3;
        this.Y = z12;
        this.Z = z13;
        this.a0 = transitionData;
        this.b0 = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b a(b bVar, vjm vjmVar, vjm vjmVar2, gkx0 gkx0Var, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Boolean bool, PushSettings pushSettings, PushSettings pushSettings2, WritePermission writePermission, PinnedMsg pinnedMsg, boolean z2, DraftMsg draftMsg, boolean z3, ChatSettings chatSettings, c cVar, BotKeyboard botKeyboard, boolean z4, MsgRequestStatus msgRequestStatus, MsgRequestStatus msgRequestStatus2, ArrayList arrayList, ArrayList arrayList2, int i7, boolean z5, boolean z6, ArrayList arrayList3, ArrayList arrayList4, int i8, TransitionData transitionData, int i9, int i10, int i11) {
        boolean z7;
        PinnedMsg pinnedMsg2;
        Peer peer;
        List list;
        long j = bVar.b;
        int i12 = bVar.c;
        vjm vjmVar3 = (i10 & 4) != 0 ? bVar.d : vjmVar;
        vjm vjmVar4 = (i10 & 8) != 0 ? bVar.e : vjmVar2;
        gkx0 gkx0Var2 = (i10 & 16) != 0 ? bVar.f : gkx0Var;
        int i13 = (i10 & 32) != 0 ? bVar.g : i;
        int i14 = (i10 & 64) != 0 ? bVar.h : i2;
        int i15 = (i10 & 128) != 0 ? bVar.i : i3;
        int i16 = (i10 & 256) != 0 ? bVar.j : i4;
        int i17 = (i10 & 512) != 0 ? bVar.k : i5;
        int i18 = (i10 & 1024) != 0 ? bVar.l : i6;
        boolean z8 = (i10 & 2048) != 0 ? bVar.m : z;
        Boolean bool2 = (i10 & 4096) != 0 ? bVar.n : bool;
        PushSettings pushSettings3 = (i10 & 8192) != 0 ? bVar.o : pushSettings;
        PushSettings pushSettings4 = (i10 & 16384) != 0 ? bVar.p : pushSettings2;
        WritePermission writePermission2 = (i10 & 32768) != 0 ? bVar.q : writePermission;
        boolean z9 = bVar.r;
        boolean z10 = bVar.s;
        if ((i10 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            z7 = z10;
            pinnedMsg2 = bVar.t;
        } else {
            z7 = z10;
            pinnedMsg2 = pinnedMsg;
        }
        boolean z11 = (i10 & 524288) != 0 ? bVar.u : z2;
        DraftMsg draftMsg2 = (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? bVar.v : draftMsg;
        InfoBar infoBar = (i10 & 2097152) != 0 ? bVar.w : null;
        ConversationCard conversationCard = (i10 & 4194304) != 0 ? bVar.x : null;
        boolean z12 = (i10 & 8388608) != 0 ? bVar.y : z3;
        ChatSettings chatSettings2 = (i10 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? bVar.z : chatSettings;
        GroupCallInProgress groupCallInProgress = bVar.A;
        boolean z13 = (i10 & 67108864) != 0 ? bVar.B : true;
        c cVar2 = (i10 & 134217728) != 0 ? bVar.C : cVar;
        BotKeyboard botKeyboard2 = (i10 & 268435456) != 0 ? bVar.D : botKeyboard;
        boolean z14 = (i10 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? bVar.E : z4;
        MsgRequestStatus msgRequestStatus3 = (i10 & 1073741824) != 0 ? bVar.F : msgRequestStatus;
        Peer peer2 = bVar.G;
        PushSettings pushSettings5 = pushSettings4;
        long j2 = bVar.H;
        MsgRequestStatus msgRequestStatus4 = (i11 & 2) != 0 ? bVar.I : msgRequestStatus2;
        List list2 = (i11 & 4) != 0 ? bVar.J : arrayList;
        List<Integer> list3 = bVar.K;
        if ((i11 & 16) != 0) {
            peer = peer2;
            list = bVar.L;
        } else {
            peer = peer2;
            list = arrayList2;
        }
        BusinessNotifyInfo businessNotifyInfo = bVar.M;
        boolean z15 = (i11 & 64) != 0 ? bVar.N : false;
        int i19 = (i11 & 128) != 0 ? bVar.O : i7;
        int i20 = bVar.P;
        boolean z16 = (i11 & 512) != 0 ? bVar.Q : z5;
        boolean z17 = (i11 & 1024) != 0 ? bVar.R : z6;
        boolean z18 = bVar.S;
        String str = bVar.T;
        List list4 = (i11 & 8192) != 0 ? bVar.U : arrayList3;
        List list5 = (i11 & 16384) != 0 ? bVar.V : arrayList4;
        int i21 = (i11 & 32768) != 0 ? bVar.W : i8;
        long j3 = bVar.X;
        boolean z19 = bVar.Y;
        boolean z20 = bVar.Z;
        TransitionData transitionData2 = (i11 & 524288) != 0 ? bVar.a0 : transitionData;
        int i22 = (i11 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? bVar.b0 : i9;
        bVar.getClass();
        return new b(j, i12, vjmVar3, vjmVar4, gkx0Var2, i13, i14, i15, i16, i17, i18, z8, bool2, pushSettings3, pushSettings5, writePermission2, z9, z7, pinnedMsg2, z11, draftMsg2, infoBar, conversationCard, z12, chatSettings2, groupCallInProgress, z13, cVar2, botKeyboard2, z14, msgRequestStatus3, peer, j2, msgRequestStatus4, list2, list3, list, businessNotifyInfo, z15, i19, i20, z16, z17, z18, str, list4, list5, i21, j3, z19, z20, transitionData2, i22);
    }

    public final int b() {
        vjm vjmVar = this.e;
        return vjmVar != null ? vjmVar.h() : this.d.h();
    }

    public final boolean c() {
        Boolean bool = this.n;
        if (bool != null ? bool.booleanValue() : this.m) {
            return true;
        }
        return (this.k > this.g ? this.l : this.j) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && this.m == bVar.m && epx.f(this.n, bVar.n) && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p) && epx.f(this.q, bVar.q) && this.r == bVar.r && this.s == bVar.s && epx.f(this.t, bVar.t) && this.u == bVar.u && epx.f(this.v, bVar.v) && epx.f(this.w, bVar.w) && epx.f(this.x, bVar.x) && this.y == bVar.y && epx.f(this.z, bVar.z) && epx.f(this.A, bVar.A) && this.B == bVar.B && epx.f(this.C, bVar.C) && epx.f(this.D, bVar.D) && this.E == bVar.E && this.F == bVar.F && epx.f(this.G, bVar.G) && this.H == bVar.H && this.I == bVar.I && epx.f(this.J, bVar.J) && epx.f(this.K, bVar.K) && epx.f(this.L, bVar.L) && epx.f(this.M, bVar.M) && this.N == bVar.N && this.O == bVar.O && this.P == bVar.P && this.Q == bVar.Q && this.R == bVar.R && this.S == bVar.S && epx.f(this.T, bVar.T) && epx.f(this.U, bVar.U) && epx.f(this.V, bVar.V) && po40.h(this.W, bVar.W) && this.X == bVar.X && this.Y == bVar.Y && this.Z == bVar.Z && epx.f(this.a0, bVar.a0) && this.b0 == bVar.b0;
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b) * 31, 31)) * 31;
        vjm vjmVar = this.e;
        int b = qoy.b(shy.a(this.l, shy.a(this.k, shy.a(this.j, shy.a(this.i, shy.a(this.h, shy.a(this.g, (this.f.hashCode() + ((hashCode + (vjmVar == null ? 0 : vjmVar.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31, this.m);
        Boolean bool = this.n;
        int hashCode2 = (this.o.hashCode() + ((b + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        PushSettings pushSettings = this.p;
        int b2 = qoy.b(qoy.b((this.q.hashCode() + ((hashCode2 + (pushSettings == null ? 0 : pushSettings.hashCode())) * 31)) * 31, 31, this.r), 31, this.s);
        PinnedMsg pinnedMsg = this.t;
        int hashCode3 = (this.v.hashCode() + qoy.b((b2 + (pinnedMsg == null ? 0 : pinnedMsg.hashCode())) * 31, 31, this.u)) * 31;
        InfoBar infoBar = this.w;
        int hashCode4 = (hashCode3 + (infoBar == null ? 0 : infoBar.hashCode())) * 31;
        ConversationCard conversationCard = this.x;
        int b3 = qoy.b((hashCode4 + (conversationCard == null ? 0 : conversationCard.hashCode())) * 31, 31, this.y);
        ChatSettings chatSettings = this.z;
        int hashCode5 = (b3 + (chatSettings == null ? 0 : chatSettings.hashCode())) * 31;
        GroupCallInProgress groupCallInProgress = this.A;
        int a = urd0.a(qoy.b((hashCode5 + (groupCallInProgress == null ? 0 : groupCallInProgress.hashCode())) * 31, 31, this.B), 31, this.C.a);
        BotKeyboard botKeyboard = this.D;
        int a2 = bh10.a(bh10.a((this.F.hashCode() + qoy.b((a + (botKeyboard == null ? 0 : botKeyboard.hashCode())) * 31, 31, this.E)) * 31, 31, this.G.b), 31, this.H);
        MsgRequestStatus msgRequestStatus = this.I;
        int a3 = fw3.a(fw3.a(fw3.a((a2 + (msgRequestStatus == null ? 0 : msgRequestStatus.hashCode())) * 31, 31, this.J), 31, this.K), 31, this.L);
        BusinessNotifyInfo businessNotifyInfo = this.M;
        int b4 = qoy.b(qoy.b(qoy.b(shy.a(this.P, shy.a(this.O, qoy.b((a3 + (businessNotifyInfo == null ? 0 : businessNotifyInfo.hashCode())) * 31, 31, this.N), 31), 31), 31, this.Q), 31, this.R), 31, this.S);
        String str = this.T;
        int b5 = qoy.b(qoy.b(bh10.a((po40.k(this.W) + fw3.a(fw3.a((b4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.U), 31, this.V)) * 31, 31, this.X), 31, this.Y), 31, this.Z);
        TransitionData transitionData = this.a0;
        return Integer.hashCode(this.b0) + ((b5 + (transitionData != null ? transitionData.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogStorageModel(id=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", sortIdServer=");
        sb.append(this.d);
        sb.append(", sortIdLocal=");
        sb.append(this.e);
        sb.append(", weight=");
        sb.append(this.f);
        sb.append(", readTillInMsgCnvId=");
        sb.append(this.g);
        sb.append(", readTillOutMsgCnvId=");
        sb.append(this.h);
        sb.append(", lastMsgCnvId=");
        sb.append(this.i);
        sb.append(", countUnread=");
        sb.append(this.j);
        sb.append(", readTillInMsgCnvIdLocal=");
        sb.append(this.k);
        sb.append(", countUnreadLocal=");
        sb.append(this.l);
        sb.append(", markedAsUnreadServer=");
        sb.append(this.m);
        sb.append(", markedAsUnreadLocal=");
        sb.append(this.n);
        sb.append(", pushSettingsServer=");
        sb.append(this.o);
        sb.append(", pushSettingsLocal=");
        sb.append(this.p);
        sb.append(", writePermission=");
        sb.append(this.q);
        sb.append(", canSendMoney=");
        sb.append(this.r);
        sb.append(", canReceiveMoney=");
        sb.append(this.s);
        sb.append(", pinnedMsg=");
        sb.append(this.t);
        sb.append(", pinnedMsgVisible=");
        sb.append(this.u);
        sb.append(", draftMsg=");
        sb.append(this.v);
        sb.append(", bar=");
        sb.append(this.w);
        sb.append(", conversationCard=");
        sb.append(this.x);
        sb.append(", barHiddenLocally=");
        sb.append(this.y);
        sb.append(", chatSettings=");
        sb.append(this.z);
        sb.append(", groupCallInProgress=");
        sb.append(this.A);
        sb.append(", groupCallBannerHiddenLocally=");
        sb.append(this.B);
        sb.append(", dialogThemeId=");
        sb.append(this.C);
        sb.append(", keyboard=");
        sb.append(this.D);
        sb.append(", keyboardVisible=");
        sb.append(this.E);
        sb.append(", msgRequestStatus=");
        sb.append(this.F);
        sb.append(", msgRequestInviter=");
        sb.append(this.G);
        sb.append(", msgRequestDate=");
        sb.append(this.H);
        sb.append(", msgRequestStatusPending=");
        sb.append(this.I);
        sb.append(", unreadMentionMsgCnvIds=");
        sb.append(this.J);
        sb.append(", tags=");
        sb.append(this.K);
        sb.append(", expireMsgCnvIds=");
        sb.append(this.L);
        sb.append(", businessNotifyInfo=");
        sb.append(this.M);
        sb.append(", businessNotifyInfoVisible=");
        sb.append(this.N);
        sb.append(", phaseId=");
        sb.append(this.O);
        sb.append(", canMarkAsSpamUntilMs=");
        sb.append(this.P);
        sb.append(", isNew=");
        sb.append(this.Q);
        sb.append(", isArchived=");
        sb.append(this.R);
        sb.append(", isPromo=");
        sb.append(this.S);
        sb.append(", payload=");
        sb.append(this.T);
        sb.append(", unreadReactions=");
        sb.append(this.U);
        sb.append(", locallyReadReactions=");
        sb.append(this.V);
        sb.append(", flags=");
        sb.append((Object) po40.p(this.W));
        sb.append(", version=");
        sb.append(this.X);
        sb.append(", isDead=");
        sb.append(this.Y);
        sb.append(", canPromoGifts=");
        sb.append(this.Z);
        sb.append(", transitionData=");
        sb.append(this.a0);
        sb.append(", timestamp=");
        return vu5.b(sb, this.b0, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(a aVar, vjm vjmVar, vjm vjmVar2, gkx0 gkx0Var, int i, int i2, Boolean bool, PushSettings pushSettings, PinnedMsg pinnedMsg, boolean z, DraftMsg draftMsg, InfoBar infoBar, ConversationCard conversationCard, boolean z2, boolean z3, boolean z4, MsgRequestStatus msgRequestStatus, boolean z5, int i3, boolean z6, boolean z7, ArrayList arrayList, int i4, int i5) {
        this(r2, r3, r2, r5, r6, r7, r8, r9, r10, r11, r18, r13, r14, r15, r16, r17, r18, r19, r23, r24, r25, r26, r27, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? false : z2, aVar.g(), aVar.m(), (i4 & 134217728) != 0 ? false : z3, aVar.j(), aVar.o(), (i4 & 1073741824) != 0 ? false : z4, aVar.t(), aVar.s(), aVar.r(), (i5 & 4) == 0 ? msgRequestStatus : r4, aVar.E(), aVar.A(), aVar.k(), aVar.b(), (i5 & 128) != 0 ? false : z5, (i5 & 256) == 0 ? i3 : r22, aVar.c(), aVar.K(), (i5 & 2048) != 0 ? aVar.I() : z6, (i5 & 4096) != 0 ? aVar.L() : z7, aVar.u(), aVar.F(), (i5 & 16384) != 0 ? EmptyList.b : arrayList, aVar.l(), aVar.G(), aVar.J(), aVar.d(), aVar.C(), aVar.B());
        DraftMsg draftMsg2;
        long n = aVar.n();
        int D = aVar.D();
        vjm z8 = (i4 & 8) != 0 ? aVar.z() : vjmVar;
        vjm vjmVar3 = (i4 & 16) != 0 ? null : vjmVar2;
        gkx0 c = (i4 & 32) != 0 ? lmm.c(aVar.z()) : gkx0Var;
        int x = aVar.x();
        vjm vjmVar4 = vjmVar3;
        gkx0 gkx0Var2 = c;
        int y = aVar.y();
        MsgRequestStatus msgRequestStatus2 = null;
        int p = aVar.p();
        int i6 = aVar.i();
        int i7 = (i4 & 1024) != 0 ? 0 : i;
        int i8 = (i4 & 2048) != 0 ? 0 : i2;
        int i9 = i7;
        boolean q = aVar.q();
        Boolean bool2 = (i4 & 8192) != 0 ? null : bool;
        int i10 = i8;
        PushSettings w = aVar.w();
        PushSettings pushSettings2 = (i4 & 32768) != 0 ? null : pushSettings;
        WritePermission H = aVar.H();
        Boolean bool3 = bool2;
        boolean f = aVar.f();
        int i11 = 0;
        PushSettings pushSettings3 = pushSettings2;
        boolean e = aVar.e();
        PinnedMsg v = (i4 & 524288) != 0 ? aVar.v() : pinnedMsg;
        boolean z9 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z;
        if ((i4 & 2097152) != 0) {
            Serializer.c<DraftMsg> cVar = DraftMsg.CREATOR;
            draftMsg2 = DraftMsg.a.a();
        } else {
            draftMsg2 = draftMsg;
        }
        InfoBar a = (i4 & 4194304) != 0 ? aVar.a() : infoBar;
        ConversationCard h = (i4 & 8388608) != 0 ? aVar.h() : conversationCard;
    }
}
