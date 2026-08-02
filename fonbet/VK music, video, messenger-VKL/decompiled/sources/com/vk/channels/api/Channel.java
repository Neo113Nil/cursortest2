package com.vk.channels.api;

import com.vk.channels.api.ChannelActionInProgress;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.groups.AgeLimits;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.users.UserNameCase;
import xsna.a5w;
import xsna.aeb;
import xsna.b5w;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.gkx0;
import xsna.qoy;
import xsna.qtd0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.x7w;
import xsna.zcl;

/* compiled from: Channel.kt */
/* loaded from: classes16.dex */
public final class Channel extends Serializer.StreamParcelableAdapter implements a5w, qtd0 {
    public static final Serializer.c<Channel> CREATOR = new a();
    public final Peer A;
    public final GroupPrivacy B;
    public final ChannelBanInfo C;
    public final MemberStatus D;
    public final boolean E;
    public final String F;
    public final Integer G;
    public final Boolean H;
    public final String I;
    public final AgeLimits J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public x7w P;
    public final ImItemType Q;
    public final b5w R;
    public final boolean S;
    public final long b;
    public final ImageList c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ChannelNotificationsSettings q;
    public final ChannelNotificationsSettings r;
    public final aeb s;
    public final ChannelActionInProgress t;
    public final AdminLevel u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final Long y;
    public final ChannelType z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Channel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Channel a(Serializer serializer) {
            return new Channel(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Channel[i];
        }
    }

    public Channel(long j, ImageList imageList, String str, String str2, boolean z, String str3, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, boolean z4, ChannelNotificationsSettings channelNotificationsSettings, ChannelNotificationsSettings channelNotificationsSettings2, aeb aebVar, ChannelActionInProgress channelActionInProgress, AdminLevel adminLevel, String str4, boolean z5, boolean z6, Long l, ChannelType channelType, Peer peer, GroupPrivacy groupPrivacy, ChannelBanInfo channelBanInfo, MemberStatus memberStatus, boolean z7, String str5, Integer num, Boolean bool, String str6, AgeLimits ageLimits, boolean z8, boolean z9, boolean z10, boolean z11, int i7) {
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = str3;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = channelNotificationsSettings;
        this.r = channelNotificationsSettings2;
        this.s = aebVar;
        this.t = channelActionInProgress;
        this.u = adminLevel;
        this.v = str4;
        this.w = z5;
        this.x = z6;
        this.y = l;
        this.z = channelType;
        this.A = peer;
        this.B = groupPrivacy;
        this.C = channelBanInfo;
        this.D = memberStatus;
        this.E = z7;
        this.F = str5;
        this.G = num;
        this.H = bool;
        this.I = str6;
        this.J = ageLimits;
        this.K = z8;
        this.L = z9;
        this.M = z10;
        this.N = z11;
        this.O = i7;
        this.P = x7w.f;
        ImItemType imItemType = ImItemType.CHANNEL;
        this.Q = imItemType;
        this.R = new b5w(j, imItemType);
        this.S = channelType == ChannelType.COMMUNITY_CHANNEL && groupPrivacy == GroupPrivacy.PRIVATE && !z3;
        if (!aebVar.c() && !aebVar.b.equals(gkx0.d) && j != aebVar.c) {
            throw new IllegalStateException("channel weight is wrong");
        }
    }

    public final boolean Ab() {
        return this.k > 0;
    }

    @Override // xsna.qtd0
    public final UserSex B2() {
        return UserSex.UNKNOWN;
    }

    @Override // xsna.qtd0
    public final String B3() {
        return "";
    }

    public final Long Bb() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.qtd0
    public final boolean C6() {
        return false;
    }

    @Override // xsna.qtd0
    public final ImageList C8() {
        return this.c;
    }

    public final ChannelType Cb() {
        return this.z;
    }

    public final boolean Db(long j) {
        ChannelNotificationsSettings channelNotificationsSettings = this.q;
        ChannelNotificationsSettings channelNotificationsSettings2 = this.r;
        if (!(channelNotificationsSettings2 != null ? channelNotificationsSettings2.b : channelNotificationsSettings.b)) {
            return true;
        }
        long j2 = channelNotificationsSettings2 != null ? channelNotificationsSettings2.c : channelNotificationsSettings.c;
        if (j2 == 0) {
            return false;
        }
        return j2 < 0 || j >= j2;
    }

    @Override // xsna.qtd0
    public final ImageStatus E5() {
        return null;
    }

    public final boolean Eb(int i) {
        int i2 = this.j;
        int i3 = this.i;
        if (i2 <= i3) {
            i2 = i3;
        }
        return i <= i2;
    }

    @Override // xsna.qtd0
    public final String H5(UserNameCase userNameCase) {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean H7() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean K6() {
        return false;
    }

    @Override // xsna.qtd0
    public final String La() {
        return name();
    }

    @Override // xsna.a5w
    public final ImItemType M8() {
        return this.Q;
    }

    @Override // xsna.qtd0
    public final boolean N0() {
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.j0(this.g);
        serializer.S(this.h);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.S(this.k);
        serializer.S(this.l);
        serializer.S(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.i0(this.q);
        serializer.i0(this.r);
        aeb aebVar = this.s;
        serializer.Y(aebVar.b.b);
        serializer.Y(aebVar.c);
        serializer.S(this.t.i());
        serializer.S(this.u.h());
        serializer.j0(this.v);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.b0(this.y);
        ChannelType channelType = this.z;
        serializer.j0(channelType != null ? channelType.i() : null);
        serializer.i0(this.A);
        serializer.S(this.B.j());
        serializer.i0(this.C);
        serializer.S(this.D.i());
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.j0(this.F);
        serializer.V(this.G);
        serializer.J(this.H);
        serializer.j0(this.I);
        serializer.S(this.J.h());
        serializer.L(this.K ? (byte) 1 : (byte) 0);
        serializer.L(this.L ? (byte) 1 : (byte) 0);
        serializer.L(this.M ? (byte) 1 : (byte) 0);
        serializer.L(this.N ? (byte) 1 : (byte) 0);
        serializer.S(this.O);
    }

    @Override // xsna.qtd0
    public final String P5(UserNameCase userNameCase) {
        return name();
    }

    @Override // xsna.qtd0
    public final String Q2(UserNameCase userNameCase) {
        return name();
    }

    @Override // xsna.qtd0
    public final String Ra() {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean W1() {
        return true;
    }

    @Override // xsna.qtd0
    public final String c5() {
        return "";
    }

    @Override // xsna.qtd0
    public final String d6(UserNameCase userNameCase) {
        return name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return this.b == channel.b && epx.f(this.c, channel.c) && epx.f(this.d, channel.d) && epx.f(this.e, channel.e) && this.f == channel.f && epx.f(this.g, channel.g) && this.h == channel.h && this.i == channel.i && this.j == channel.j && this.k == channel.k && this.l == channel.l && this.m == channel.m && this.n == channel.n && this.o == channel.o && this.p == channel.p && epx.f(this.q, channel.q) && epx.f(this.r, channel.r) && epx.f(this.s, channel.s) && this.t == channel.t && this.u == channel.u && epx.f(this.v, channel.v) && this.w == channel.w && this.x == channel.x && epx.f(this.y, channel.y) && this.z == channel.z && epx.f(this.A, channel.A) && this.B == channel.B && epx.f(this.C, channel.C) && this.D == channel.D && this.E == channel.E && epx.f(this.F, channel.F) && epx.f(this.G, channel.G) && epx.f(this.H, channel.H) && epx.f(this.I, channel.I) && this.J == channel.J && this.K == channel.K && this.L == channel.L && this.M == channel.M && this.N == channel.N && this.O == channel.O;
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.b);
    }

    public final String getName() {
        return this.d;
    }

    @Override // xsna.qtd0
    public final String h8() {
        return "";
    }

    @Override // xsna.qtd0
    public final String ha() {
        return I9(UserNameCase.NOM);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
        String str = this.e;
        int hashCode = (this.q.hashCode() + qoy.b(qoy.b(qoy.b(shy.a(this.m, shy.a(this.l, shy.a(this.k, shy.a(this.j, shy.a(this.i, shy.a(this.h, urd0.a(qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31), 31), 31), 31), 31), 31), 31, this.n), 31, this.o), 31, this.p)) * 31;
        ChannelNotificationsSettings channelNotificationsSettings = this.r;
        int b = qoy.b(qoy.b(urd0.a((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((hashCode + (channelNotificationsSettings == null ? 0 : channelNotificationsSettings.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.v), 31, this.w), 31, this.x);
        Long l = this.y;
        int hashCode2 = (b + (l == null ? 0 : l.hashCode())) * 31;
        ChannelType channelType = this.z;
        int hashCode3 = (this.B.hashCode() + bh10.a((hashCode2 + (channelType == null ? 0 : channelType.hashCode())) * 31, 31, this.A.b)) * 31;
        ChannelBanInfo channelBanInfo = this.C;
        int b2 = qoy.b((this.D.hashCode() + ((hashCode3 + (channelBanInfo == null ? 0 : channelBanInfo.hashCode())) * 31)) * 31, 31, this.E);
        String str2 = this.F;
        int hashCode4 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.G;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.H;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.I;
        return Integer.hashCode(this.O) + qoy.b(qoy.b(qoy.b(qoy.b((this.J.hashCode() + ((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31, this.K), 31, this.L), 31, this.M), 31, this.N);
    }

    @Override // xsna.qtd0
    public final boolean ib() {
        return false;
    }

    @Override // xsna.qtd0
    public final long id() {
        return this.b;
    }

    @Override // xsna.qtd0
    public final boolean ja() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean k5() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean ka() {
        return false;
    }

    @Override // xsna.qtd0
    public final String m2() {
        return "";
    }

    @Override // xsna.qtd0
    public final OnlineInfo mb() {
        return VisibleStatus.f;
    }

    @Override // xsna.qtd0
    public final String n6() {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean n9() {
        return false;
    }

    @Override // xsna.qtd0
    public final String name() {
        return this.d;
    }

    @Override // xsna.qtd0
    public final boolean r5() {
        return false;
    }

    @Override // xsna.qtd0
    public final long r8() {
        return B7().b;
    }

    @Override // xsna.a5w
    public final b5w t3() {
        return this.R;
    }

    @Override // xsna.qtd0
    public final boolean t6() {
        return false;
    }

    @Override // xsna.qtd0
    public final Peer.Type t8() {
        return Peer.Type.CHANNEL;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Channel(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", screenName=");
        sb.append(this.e);
        sb.append(", verified=");
        sb.append(this.f);
        sb.append(", activity=");
        sb.append(this.g);
        sb.append(", lastMsgCnvId=");
        sb.append(this.h);
        sb.append(", readTillInMsgCnvId=");
        sb.append(this.i);
        sb.append(", readTillInMsgCnvIdLocal=");
        sb.append(this.j);
        sb.append(", countUnread=");
        sb.append(this.k);
        sb.append(", countUnreadLocal=");
        sb.append(this.l);
        sb.append(", countPostponed=");
        sb.append(this.m);
        sb.append(", isArchived=");
        sb.append(this.n);
        sb.append(", isMember=");
        sb.append(this.o);
        sb.append(", isOwner=");
        sb.append(this.p);
        sb.append(", notificationsSettings=");
        sb.append(this.q);
        sb.append(", notificationsSettingsLocal=");
        sb.append(this.r);
        sb.append(", weight=");
        sb.append(this.s);
        sb.append(", actionInProgress=");
        sb.append(this.t);
        sb.append(", adminLevel=");
        sb.append(this.u);
        sb.append(", description=");
        sb.append(this.v);
        sb.append(", canMessage=");
        sb.append(this.w);
        sb.append(", canPost=");
        sb.append(this.x);
        sb.append(", lastHistoryExpiredTime=");
        sb.append(this.y);
        sb.append(", type=");
        sb.append(this.z);
        sb.append(", parentId=");
        sb.append(this.A);
        sb.append(", privacy=");
        sb.append(this.B);
        sb.append(", banInfo=");
        sb.append(this.C);
        sb.append(", memberStatus=");
        sb.append(this.D);
        sb.append(", canPostDonut=");
        sb.append(this.E);
        sb.append(", customHost=");
        sb.append(this.F);
        sb.append(", membersCount=");
        sb.append(this.G);
        sb.append(", canComment=");
        sb.append(this.H);
        sb.append(", trackCode=");
        sb.append(this.I);
        sb.append(", ageLimits=");
        sb.append(this.J);
        sb.append(", isHiddenInAllFolder=");
        sb.append(this.K);
        sb.append(", isNeedShowDonutOnboarding=");
        sb.append(this.L);
        sb.append(", isMonetizationAvailable=");
        sb.append(this.M);
        sb.append(", isPaidReactionAvailable=");
        sb.append(this.N);
        sb.append(", paidReactionCost=");
        return vu5.b(sb, this.O, ')');
    }

    @Override // xsna.qtd0
    public final Long v5() {
        return null;
    }

    @Override // xsna.a5w
    public final x7w y9() {
        return this.P;
    }

    public final ChannelActionInProgress zb() {
        return this.t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Channel(Serializer serializer, zcl zclVar) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r1, r2, r1, r2, r3, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, AgeLimits.a.a(r36), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.u());
        long w = serializer.w();
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        String H = serializer.H();
        String H2 = serializer.H();
        boolean m = serializer.m();
        String H3 = serializer.H();
        int u = serializer.u();
        int u2 = serializer.u();
        int u3 = serializer.u();
        int u4 = serializer.u();
        int u5 = serializer.u();
        int u6 = serializer.u();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        ChannelNotificationsSettings channelNotificationsSettings = (ChannelNotificationsSettings) serializer.G(ChannelNotificationsSettings.class.getClassLoader());
        ChannelNotificationsSettings channelNotificationsSettings2 = (ChannelNotificationsSettings) serializer.G(ChannelNotificationsSettings.class.getClassLoader());
        aeb aebVar = new aeb(new gkx0(serializer.w()), serializer.w());
        ChannelActionInProgress.a aVar = ChannelActionInProgress.Companion;
        int u7 = serializer.u();
        aVar.getClass();
        ChannelActionInProgress a2 = ChannelActionInProgress.a.a(u7);
        AdminLevel.a aVar2 = AdminLevel.Companion;
        Integer valueOf = Integer.valueOf(serializer.u());
        aVar2.getClass();
        AdminLevel a3 = AdminLevel.a.a(valueOf);
        String H4 = serializer.H();
        boolean m5 = serializer.m();
        boolean m6 = serializer.m();
        Long x = serializer.x();
        ChannelType.a aVar3 = ChannelType.Companion;
        String H5 = serializer.H();
        aVar3.getClass();
        ChannelType a4 = ChannelType.a.a(H5);
        Peer peer = (Peer) serializer.G(Peer.class.getClassLoader());
        GroupPrivacy groupPrivacy = GroupPrivacy.OPEN;
        ChannelBanInfo channelBanInfo = (ChannelBanInfo) serializer.G(ChannelBanInfo.class.getClassLoader());
        MemberStatus.a aVar4 = MemberStatus.Companion;
        Integer valueOf2 = Integer.valueOf(serializer.u());
        aVar4.getClass();
        MemberStatus a5 = MemberStatus.a.a(valueOf2);
        boolean m7 = serializer.m();
        String H6 = serializer.H();
        Integer v = serializer.v();
        Boolean n = serializer.n();
        String H7 = serializer.H();
        AgeLimits.a aVar5 = AgeLimits.Companion;
        Integer valueOf3 = Integer.valueOf(serializer.u());
        aVar5.getClass();
    }
}
