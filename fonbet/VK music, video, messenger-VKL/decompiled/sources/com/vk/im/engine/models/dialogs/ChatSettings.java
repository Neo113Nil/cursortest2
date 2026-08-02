package com.vk.im.engine.models.dialogs;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ChatSettings.kt */
/* loaded from: classes2.dex */
public final class ChatSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ChatSettings> CREATOR = new a();
    public final String A;
    public final ChatPermissions B;
    public final Long C;
    public final Integer D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final long I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final String b;
    public final ImageList c;
    public final Peer d;
    public final Set<Peer> e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChatSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChatSettings a(Serializer serializer) {
            return new ChatSettings(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatSettings[i];
        }
    }

    public ChatSettings() {
        this(null, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, false, false, false, false, 0L, false, false, false, false, false, false, -1, 255, null);
    }

    public static ChatSettings zb(ChatSettings chatSettings, ImageList imageList, Peer peer, Set set, int i, boolean z, int i2) {
        boolean z2;
        boolean z3;
        String str = chatSettings.b;
        ImageList imageList2 = (i2 & 2) != 0 ? chatSettings.c : imageList;
        Peer peer2 = (i2 & 4) != 0 ? chatSettings.d : peer;
        Set set2 = (i2 & 8) != 0 ? chatSettings.e : set;
        int i3 = (i2 & 16) != 0 ? chatSettings.f : i;
        boolean z4 = chatSettings.g;
        ImageList imageList3 = imageList2;
        Peer peer3 = peer2;
        Set set3 = set2;
        int i4 = i3;
        boolean z5 = chatSettings.h;
        boolean z6 = chatSettings.i;
        boolean z7 = chatSettings.j;
        boolean z8 = chatSettings.k;
        boolean z9 = chatSettings.l;
        boolean z10 = chatSettings.m;
        boolean z11 = chatSettings.n;
        boolean z12 = chatSettings.o;
        boolean z13 = (i2 & 16384) != 0 ? chatSettings.p : z;
        boolean z14 = chatSettings.q;
        boolean z15 = chatSettings.r;
        boolean z16 = chatSettings.s;
        if ((i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            z2 = z16;
            z3 = chatSettings.t;
        } else {
            z2 = z16;
            z3 = false;
        }
        boolean z17 = z3;
        boolean z18 = chatSettings.u;
        boolean z19 = chatSettings.v;
        boolean z20 = chatSettings.w;
        boolean z21 = chatSettings.x;
        boolean z22 = chatSettings.y;
        boolean z23 = chatSettings.z;
        String str2 = chatSettings.A;
        ChatPermissions chatPermissions = chatSettings.B;
        Long l = chatSettings.C;
        Integer num = chatSettings.D;
        boolean z24 = chatSettings.E;
        boolean z25 = chatSettings.F;
        boolean z26 = chatSettings.G;
        boolean z27 = chatSettings.H;
        boolean z28 = z13;
        long j = chatSettings.I;
        boolean z29 = chatSettings.J;
        boolean z30 = chatSettings.K;
        boolean z31 = chatSettings.L;
        boolean z32 = chatSettings.M;
        boolean z33 = chatSettings.N;
        boolean z34 = chatSettings.O;
        chatSettings.getClass();
        return new ChatSettings(str, imageList3, peer3, set3, i4, z4, z5, z6, z7, z8, z9, z10, z11, z12, z28, z14, z15, z2, z17, z18, z19, z20, z21, z22, z23, str2, chatPermissions, l, num, z24, z25, z26, z27, j, z29, z30, z31, z32, z33, z34);
    }

    public final Peer Ab() {
        return this.d;
    }

    public final boolean Bb() {
        return this.N;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.o0(j5g.O0(this.e));
        serializer.S(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.j0(this.A);
        serializer.i0(this.B);
        serializer.b0(this.C);
        serializer.V(this.D);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.L(this.F ? (byte) 1 : (byte) 0);
        serializer.L(this.G ? (byte) 1 : (byte) 0);
        serializer.L(this.K ? (byte) 1 : (byte) 0);
        serializer.L(this.H ? (byte) 1 : (byte) 0);
        serializer.L(this.L ? (byte) 1 : (byte) 0);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.Y(this.I);
        serializer.L(this.y ? (byte) 1 : (byte) 0);
        serializer.L(this.M ? (byte) 1 : (byte) 0);
        serializer.L(this.N ? (byte) 1 : (byte) 0);
        serializer.L(this.O ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSettings)) {
            return false;
        }
        ChatSettings chatSettings = (ChatSettings) obj;
        return epx.f(this.b, chatSettings.b) && epx.f(this.c, chatSettings.c) && epx.f(this.d, chatSettings.d) && epx.f(this.e, chatSettings.e) && this.f == chatSettings.f && this.g == chatSettings.g && this.h == chatSettings.h && this.i == chatSettings.i && this.j == chatSettings.j && this.k == chatSettings.k && this.l == chatSettings.l && this.m == chatSettings.m && this.n == chatSettings.n && this.o == chatSettings.o && this.p == chatSettings.p && this.q == chatSettings.q && this.r == chatSettings.r && this.s == chatSettings.s && this.t == chatSettings.t && this.u == chatSettings.u && this.v == chatSettings.v && this.w == chatSettings.w && this.x == chatSettings.x && this.y == chatSettings.y && this.z == chatSettings.z && epx.f(this.A, chatSettings.A) && epx.f(this.B, chatSettings.B) && epx.f(this.C, chatSettings.C) && epx.f(this.D, chatSettings.D) && this.E == chatSettings.E && this.F == chatSettings.F && this.G == chatSettings.G && this.H == chatSettings.H && this.I == chatSettings.I && this.J == chatSettings.J && this.K == chatSettings.K && this.L == chatSettings.L && this.M == chatSettings.M && this.N == chatSettings.N && this.O == chatSettings.O;
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.f, fw3.b(bh10.a(fw3.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d.b), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
        ChatPermissions chatPermissions = this.B;
        int hashCode = (a2 + (chatPermissions == null ? 0 : chatPermissions.hashCode())) * 31;
        Long l = this.C;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.D;
        return Boolean.hashCode(this.O) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K), 31, this.L), 31, this.M), 31, this.N);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatSettings(title=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", admins=");
        sb.append(this.e);
        sb.append(", membersCount=");
        sb.append(this.f);
        sb.append(", isCasper=");
        sb.append(this.g);
        sb.append(", isChannel=");
        sb.append(this.h);
        sb.append(", isKicked=");
        sb.append(this.i);
        sb.append(", isLeft=");
        sb.append(this.j);
        sb.append(", isService=");
        sb.append(this.k);
        sb.append(", isDonut=");
        sb.append(this.l);
        sb.append(", isIncognito=");
        sb.append(this.m);
        sb.append(", canInvite=");
        sb.append(this.n);
        sb.append(", canChangeInfo=");
        sb.append(this.o);
        sb.append(", canChangeOwner=");
        sb.append(this.p);
        sb.append(", canChangePinnedMsg=");
        sb.append(this.q);
        sb.append(", canPromoteUsers=");
        sb.append(this.r);
        sb.append(", canModerate=");
        sb.append(this.s);
        sb.append(", canCopy=");
        sb.append(this.t);
        sb.append(", canCall=");
        sb.append(this.u);
        sb.append(", canSeeInviteLink=");
        sb.append(this.v);
        sb.append(", canUseMassMentions=");
        sb.append(this.w);
        sb.append(", canChangeService=");
        sb.append(this.x);
        sb.append(", canChangeStickersPopupAutoplay=");
        sb.append(this.y);
        sb.append(", canDisableServiceMessages=");
        sb.append(this.z);
        sb.append(", casperChatLink=");
        sb.append(this.A);
        sb.append(", permissions=");
        sb.append(this.B);
        sb.append(", donutOwnerId=");
        sb.append(this.C);
        sb.append(", typeMask=");
        sb.append(this.D);
        sb.append(", canChangeTheme=");
        sb.append(this.E);
        sb.append(", canSendReactions=");
        sb.append(this.F);
        sb.append(", shortPollReactions=");
        sb.append(this.G);
        sb.append(", writingDisabled=");
        sb.append(this.H);
        sb.append(", writingDisabledUntil=");
        sb.append(this.I);
        sb.append(", isDeletedForAll=");
        sb.append(this.J);
        sb.append(", isUgc=");
        sb.append(this.K);
        sb.append(", isDisableStickersPopupAutoplay=");
        sb.append(this.L);
        sb.append(", isServiceMessagesDisabled=");
        sb.append(this.M);
        sb.append(", isMessagesForwardEnabled=");
        sb.append(this.N);
        sb.append(", canDisableForwardMessages=");
        return q0.a(sb, this.O, ')');
    }

    public ChatSettings(String str, ImageList imageList, Peer peer, Set set, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, String str2, ChatPermissions chatPermissions, Long l, Integer num, boolean z21, boolean z22, boolean z23, boolean z24, long j, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, int i2, int i3, zcl zclVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? new ImageList(null, 1, null) : imageList, (i2 & 4) != 0 ? Peer.Unknown.e : peer, (i2 & 8) != 0 ? EmptySet.b : set, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? false : z5, (i2 & 1024) != 0 ? false : z6, (i2 & 2048) != 0 ? false : z7, (i2 & 4096) != 0 ? false : z8, (i2 & 8192) != 0 ? false : z9, (i2 & 16384) != 0 ? false : z10, (i2 & 32768) != 0 ? false : z11, (i2 & 65536) != 0 ? false : z12, (i2 & 131072) != 0 ? false : z13, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z14, (i2 & 524288) != 0 ? false : z15, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z16, (i2 & 2097152) != 0 ? false : z17, (i2 & 4194304) != 0 ? false : z18, (i2 & 8388608) != 0 ? false : z19, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? false : z20, (i2 & 33554432) == 0 ? str2 : "", (i2 & 67108864) != 0 ? null : chatPermissions, (i2 & 134217728) != 0 ? null : l, (i2 & 268435456) != 0 ? null : num, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? false : z21, (i2 & 1073741824) != 0 ? false : z22, (i2 & Integer.MIN_VALUE) != 0 ? false : z23, (i3 & 1) != 0 ? false : z24, (i3 & 2) != 0 ? -1L : j, (i3 & 4) != 0 ? false : z25, (i3 & 8) != 0 ? true : z26, (i3 & 16) != 0 ? false : z27, (i3 & 32) != 0 ? false : z28, (i3 & 64) != 0 ? true : z29, (i3 & 128) != 0 ? false : z30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatSettings(String str, ImageList imageList, Peer peer, Set<? extends Peer> set, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, String str2, ChatPermissions chatPermissions, Long l, Integer num, boolean z21, boolean z22, boolean z23, boolean z24, long j, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30) {
        this.b = str;
        this.c = imageList;
        this.d = peer;
        this.e = set;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
        this.p = z10;
        this.q = z11;
        this.r = z12;
        this.s = z13;
        this.t = z14;
        this.u = z15;
        this.v = z16;
        this.w = z17;
        this.x = z18;
        this.y = z19;
        this.z = z20;
        this.A = str2;
        this.B = chatPermissions;
        this.C = l;
        this.D = num;
        this.E = z21;
        this.F = z22;
        this.G = z23;
        this.H = z24;
        this.I = j;
        this.J = z25;
        this.K = z26;
        this.L = z27;
        this.M = z28;
        this.N = z29;
        this.O = z30;
        this.P = !z2;
        this.Q = (z4 || z3) ? false : true;
        this.R = (z4 || z3) ? false : true;
        this.S = z4 && !z3;
        this.T = (!z21 || z3 || z4) ? false : true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChatSettings(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, serializer.m(), r25, r26, r27, r28, r29, r30, r31, r32, r33, serializer.w(), r36, r37, r38, serializer.m(), serializer.m(), serializer.m());
        String H = serializer.H();
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        Peer peer = (Peer) serializer.G(Peer.class.getClassLoader());
        Set S0 = j5g.S0(serializer.j(Peer.CREATOR));
        int u = serializer.u();
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        boolean m5 = serializer.m();
        boolean m6 = serializer.m();
        boolean m7 = serializer.m();
        boolean m8 = serializer.m();
        boolean m9 = serializer.m();
        boolean m10 = serializer.m();
        boolean m11 = serializer.m();
        boolean m12 = serializer.m();
        boolean m13 = serializer.m();
        boolean m14 = serializer.m();
        boolean m15 = serializer.m();
        boolean m16 = serializer.m();
        boolean m17 = serializer.m();
        boolean m18 = serializer.m();
        boolean m19 = serializer.m();
        String H2 = serializer.H();
        ChatPermissions chatPermissions = (ChatPermissions) serializer.G(ChatPermissions.class.getClassLoader());
        Long x = serializer.x();
        Integer v = serializer.v();
        boolean m20 = serializer.m();
        boolean m21 = serializer.m();
        boolean m22 = serializer.m();
        boolean m23 = serializer.m();
        boolean m24 = serializer.m();
        boolean m25 = serializer.m();
        boolean m26 = serializer.m();
    }
}
