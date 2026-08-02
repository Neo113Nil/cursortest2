package com.vk.im.engine.models.users;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserNameType;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserDeactivationStatus;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.InitializedLazyImpl;
import kotlin.NoWhenBranchMatchedException;
import xsna.a0a;
import xsna.a7p0;
import xsna.bpn0;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.h8n0;
import xsna.lva0;
import xsna.qoy;
import xsna.qtd0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: User.kt */
/* loaded from: classes2.dex */
public final class User extends Serializer.StreamParcelableAdapter implements qtd0 {
    public static final Serializer.c<User> CREATOR = new b();
    public static final bpn0 W = new bpn0(new a7p0(2));
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final ImageStatus F;
    public final UserNameType G;
    public final String H;
    public final String I;
    public final OccupationType J;
    public final String K;
    public final Integer L;
    public final Integer M;
    public final Integer N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final SocialButtonType R;
    public final boolean S;
    public final bpn0 T;
    public final bpn0 U;
    public final InitializedLazyImpl V;
    public final long b;
    public final Long c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final UserSex g;
    public final ImageList h;
    public final boolean i;
    public final boolean j;
    public final UserDeactivationStatus k;
    public final boolean l;
    public final boolean m;
    public final OnlineInfo n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final int z;

    /* compiled from: User.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UserNameType.values().length];
            try {
                iArr[UserNameType.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserNameType.VK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UserNameCase.values().length];
            try {
                iArr2[UserNameCase.NOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserNameCase.GEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserNameCase.ACC.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserNameCase.DAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<User> {
        @Override // com.vk.core.serialize.Serializer.c
        public final User a(Serializer serializer) {
            return new User(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new User[i];
        }
    }

    public User() {
        this(0L, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, false, 0, null, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, null, false, -1, 4095, null);
    }

    public static User zb(User user, Long l, String str, Boolean bool, boolean z, OnlineInfo onlineInfo, boolean z2, int i, String str2, boolean z3, UserNameType userNameType, int i2) {
        long j = user.b;
        Long l2 = (i2 & 2) != 0 ? user.c : l;
        String str3 = (i2 & 4) != 0 ? user.d : str;
        Boolean bool2 = (i2 & 8) != 0 ? user.e : bool;
        String str4 = user.f;
        Long l3 = l2;
        String str5 = str3;
        Boolean bool3 = bool2;
        UserSex userSex = user.g;
        ImageList imageList = user.h;
        boolean z4 = (i2 & 128) != 0 ? user.i : z;
        boolean z5 = user.j;
        UserDeactivationStatus userDeactivationStatus = user.k;
        boolean z6 = user.l;
        boolean z7 = user.m;
        OnlineInfo onlineInfo2 = (i2 & 4096) != 0 ? user.n : onlineInfo;
        boolean z8 = z4;
        String str6 = user.o;
        String str7 = user.p;
        String str8 = user.q;
        String str9 = user.r;
        String str10 = user.s;
        String str11 = user.t;
        String str12 = user.u;
        String str13 = user.v;
        boolean z9 = (i2 & 2097152) != 0 ? user.w : z2;
        boolean z10 = user.x;
        boolean z11 = user.y;
        int i3 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? user.z : i;
        String str14 = (i2 & 33554432) != 0 ? user.A : str2;
        boolean z12 = user.B;
        boolean z13 = user.C;
        boolean z14 = user.D;
        boolean z15 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? user.E : z3;
        ImageStatus imageStatus = user.F;
        UserNameType userNameType2 = (i2 & Integer.MIN_VALUE) != 0 ? user.G : userNameType;
        String str15 = user.H;
        String str16 = user.I;
        OccupationType occupationType = user.J;
        String str17 = user.K;
        Integer num = user.L;
        Integer num2 = user.M;
        Integer num3 = user.N;
        boolean z16 = user.O;
        boolean z17 = user.P;
        boolean z18 = user.Q;
        SocialButtonType socialButtonType = user.R;
        boolean z19 = user.S;
        user.getClass();
        return new User(j, l3, str5, bool3, str4, userSex, imageList, z8, z5, userDeactivationStatus, z6, z7, onlineInfo2, str6, str7, str8, str9, str10, str11, str12, str13, z9, z10, z11, i3, str14, z12, z13, z14, z15, imageStatus, userNameType2, str15, str16, occupationType, str17, num, num2, num3, z16, z17, z18, socialButtonType, z19);
    }

    public final String Ab(UserNameCase userNameCase) {
        int i = a.$EnumSwitchMapping$0[this.G.ordinal()];
        if (i == 1) {
            String str = this.d;
            return str == null ? Cb(userNameCase) : str;
        }
        if (i == 2) {
            return Cb(userNameCase);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qtd0
    public final UserSex B2() {
        return this.g;
    }

    @Override // xsna.qtd0
    public final String B3() {
        return Db();
    }

    public final String Bb(UserNameCase userNameCase) {
        int i = a.$EnumSwitchMapping$0[this.G.ordinal()];
        if (i == 1) {
            String str = this.d;
            return (str == null || str.length() == 0) ? Fb(userNameCase) : "";
        }
        if (i == 2) {
            return Fb(userNameCase);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qtd0
    public final boolean C6() {
        return this.j;
    }

    @Override // xsna.qtd0
    public final ImageList C8() {
        return this.h;
    }

    public final String Cb(UserNameCase userNameCase) {
        int i = a.$EnumSwitchMapping$1[userNameCase.ordinal()];
        if (i == 1) {
            return this.o;
        }
        if (i == 2) {
            return this.s;
        }
        if (i == 3) {
            return this.q;
        }
        if (i == 4) {
            return this.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String Db() {
        return (String) this.T.getValue();
    }

    @Override // xsna.qtd0
    public final ImageStatus E5() {
        return this.F;
    }

    public final Long Eb() {
        return Long.valueOf(this.b);
    }

    public final String Fb(UserNameCase userNameCase) {
        int i = a.$EnumSwitchMapping$1[userNameCase.ordinal()];
        if (i == 1) {
            return this.p;
        }
        if (i == 2) {
            return this.t;
        }
        if (i == 3) {
            return this.r;
        }
        if (i == 4) {
            return this.v;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qtd0
    public final String H5(UserNameCase userNameCase) {
        return Bb(userNameCase);
    }

    @Override // xsna.qtd0
    public final boolean H7() {
        return this.i;
    }

    @Override // xsna.qtd0
    public final boolean K6() {
        return this.x;
    }

    @Override // xsna.qtd0
    public final String La() {
        return (String) this.U.getValue();
    }

    @Override // xsna.qtd0
    public final boolean N0() {
        return this.B;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.b0(this.c);
        serializer.j0(this.d);
        serializer.J(this.e);
        serializer.j0(this.f);
        serializer.S(this.g.h());
        serializer.i0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.i0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.j0(this.u);
        serializer.j0(this.v);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.L(this.y ? (byte) 1 : (byte) 0);
        serializer.S(this.z);
        serializer.j0(this.A);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.i0(this.F);
        serializer.S(this.G.ordinal());
        serializer.j0(this.H);
        serializer.j0(this.I);
        serializer.S(this.J.i());
        serializer.j0(this.K);
        serializer.V(this.L);
        serializer.V(this.M);
        serializer.V(this.N);
        serializer.L(this.O ? (byte) 1 : (byte) 0);
        serializer.L(this.Q ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.j0(this.R.name());
        serializer.S(this.k.h());
        serializer.L(this.P ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.qtd0
    public final String P5(UserNameCase userNameCase) {
        return Cb(userNameCase);
    }

    @Override // xsna.qtd0
    public final String Q2(UserNameCase userNameCase) {
        String Ab = Ab(userNameCase);
        String Bb = Bb(userNameCase);
        StringBuilder e = fw3.e(Ab);
        if (Bb.length() > 0) {
            e.append(" " + Bb);
        }
        return e.toString();
    }

    @Override // xsna.qtd0
    public final String Ra() {
        return this.f;
    }

    @Override // xsna.qtd0
    public final boolean W1() {
        return this.C;
    }

    @Override // xsna.qtd0
    public final String c5() {
        return this.A;
    }

    @Override // xsna.qtd0
    public final String d6(UserNameCase userNameCase) {
        return Ab(userNameCase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return this.b == user.b && epx.f(this.c, user.c) && epx.f(this.d, user.d) && epx.f(this.e, user.e) && epx.f(this.f, user.f) && this.g == user.g && epx.f(this.h, user.h) && this.i == user.i && this.j == user.j && this.k == user.k && this.l == user.l && this.m == user.m && epx.f(this.n, user.n) && epx.f(this.o, user.o) && epx.f(this.p, user.p) && epx.f(this.q, user.q) && epx.f(this.r, user.r) && epx.f(this.s, user.s) && epx.f(this.t, user.t) && epx.f(this.u, user.u) && epx.f(this.v, user.v) && this.w == user.w && this.x == user.x && this.y == user.y && this.z == user.z && epx.f(this.A, user.A) && this.B == user.B && this.C == user.C && this.D == user.D && this.E == user.E && epx.f(this.F, user.F) && this.G == user.G && epx.f(this.H, user.H) && epx.f(this.I, user.I) && this.J == user.J && epx.f(this.K, user.K) && epx.f(this.L, user.L) && epx.f(this.M, user.M) && epx.f(this.N, user.N) && this.O == user.O && this.P == user.P && this.Q == user.Q && this.R == user.R && this.S == user.S;
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.qtd0
    public final String h8() {
        String str = this.d;
        return str == null ? "" : str;
    }

    @Override // xsna.qtd0
    public final String ha() {
        return I9(UserNameCase.NOM);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(shy.a(this.z, qoy.b(qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((this.n.hashCode() + qoy.b(qoy.b((this.k.hashCode() + qoy.b(qoy.b(fw3.a((this.g.hashCode() + urd0.a((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f)) * 31, 31, this.h.b), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m)) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E);
        ImageStatus imageStatus = this.F;
        int a2 = urd0.a((this.J.hashCode() + urd0.a(urd0.a((this.G.hashCode() + ((b2 + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31)) * 31, 31, this.H), 31, this.I)) * 31, 31, this.K);
        Integer num = this.L;
        int hashCode4 = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.M;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.N;
        return Boolean.hashCode(this.S) + ((this.R.hashCode() + qoy.b(qoy.b(qoy.b((hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.O), 31, this.P), 31, this.Q)) * 31);
    }

    public final ImageList i() {
        return this.h;
    }

    @Override // xsna.qtd0
    public final boolean ib() {
        return this.w;
    }

    @Override // xsna.qtd0
    public final long id() {
        return this.b;
    }

    @Override // xsna.qtd0
    public final boolean ja() {
        return !((Pattern) W.getValue()).matcher(this.f).matches();
    }

    @Override // xsna.qtd0
    public final boolean k5() {
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // xsna.qtd0
    public final boolean ka() {
        return this.k == UserDeactivationStatus.DELETED;
    }

    @Override // xsna.qtd0
    public final String m2() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a0a.d);
        sb.append('/');
        String str = this.f;
        if (drm0.N(str)) {
            str = null;
        }
        if (str == null) {
            str = "id" + this.b;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // xsna.qtd0
    public final OnlineInfo mb() {
        return this.n;
    }

    @Override // xsna.qtd0
    public final String n6() {
        StringBuilder sb = new StringBuilder("https://vk.me/");
        String str = this.f;
        if (drm0.N(str)) {
            str = null;
        }
        if (str == null) {
            str = "id" + this.b;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // xsna.qtd0
    public final boolean n9() {
        return this.Q;
    }

    @Override // xsna.qtd0
    public final String name() {
        return Q2(UserNameCase.NOM);
    }

    @Override // xsna.qtd0
    public final VerifyInfo q9() {
        return (VerifyInfo) this.V.getValue();
    }

    @Override // xsna.qtd0
    public final boolean r5() {
        return this.D;
    }

    @Override // xsna.qtd0
    public final long r8() {
        return B7().b;
    }

    @Override // xsna.qtd0
    public final boolean t6() {
        return this.k == UserDeactivationStatus.BANNED;
    }

    @Override // xsna.qtd0
    public final Peer.Type t8() {
        return Peer.Type.USER;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(id=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", contactName=");
        sb.append(this.d);
        sb.append(", contactNew=");
        sb.append(this.e);
        sb.append(", domain=");
        sb.append(this.f);
        sb.append(", sex=");
        sb.append(this.g);
        sb.append(", avatar=");
        sb.append(this.h);
        sb.append(", blocked=");
        sb.append(this.i);
        sb.append(", blockedByMe=");
        sb.append(this.j);
        sb.append(", deactivationStatus=");
        sb.append(this.k);
        sb.append(", verified=");
        sb.append(this.l);
        sb.append(", isOauthVerified=");
        sb.append(this.m);
        sb.append(", online=");
        sb.append(this.n);
        sb.append(", firstNameNom=");
        sb.append(this.o);
        sb.append(", lastNameNom=");
        sb.append(this.p);
        sb.append(", firstNameAcc=");
        sb.append(this.q);
        sb.append(", lastNameAcc=");
        sb.append(this.r);
        sb.append(", firstNameGen=");
        sb.append(this.s);
        sb.append(", lastNameGen=");
        sb.append(this.t);
        sb.append(", firstNameDat=");
        sb.append(this.u);
        sb.append(", lastNameDat=");
        sb.append(this.v);
        sb.append(", canCall=");
        sb.append(this.w);
        sb.append(", isService=");
        sb.append(this.x);
        sb.append(", isServiceAccount=");
        sb.append(this.y);
        sb.append(", friendStatus=");
        sb.append(this.z);
        sb.append(", mobilePhone=");
        sb.append(this.A);
        sb.append(", isClosed=");
        sb.append(this.B);
        sb.append(", canAccessClosed=");
        sb.append(this.C);
        sb.append(", canBeInvitedToChats=");
        sb.append(this.D);
        sb.append(", isExpired=");
        sb.append(this.E);
        sb.append(", imageStatus=");
        sb.append(this.F);
        sb.append(", displayNameType=");
        sb.append(this.G);
        sb.append(", country=");
        sb.append(this.H);
        sb.append(", city=");
        sb.append(this.I);
        sb.append(", occupationType=");
        sb.append(this.J);
        sb.append(", occupationName=");
        sb.append(this.K);
        sb.append(", birthdayDay=");
        sb.append(this.L);
        sb.append(", birthdayMonth=");
        sb.append(this.M);
        sb.append(", birthdayYear=");
        sb.append(this.N);
        sb.append(", canSendFriendRequest=");
        sb.append(this.O);
        sb.append(", canWritePrivateMessage=");
        sb.append(this.P);
        sb.append(", avatarIsNft=");
        sb.append(this.Q);
        sb.append(", socialButtonType=");
        sb.append(this.R);
        sb.append(", isAdult=");
        return q0.a(sb, this.S, ')');
    }

    @Override // xsna.qtd0
    public final Long v5() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ User(long j, Long l, String str, Boolean bool, String str2, UserSex userSex, ImageList imageList, boolean z, boolean z2, UserDeactivationStatus userDeactivationStatus, boolean z3, boolean z4, OnlineInfo onlineInfo, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, int i, String str11, boolean z8, boolean z9, boolean z10, boolean z11, ImageStatus imageStatus, UserNameType userNameType, String str12, String str13, OccupationType occupationType, String str14, Integer num, Integer num2, Integer num3, boolean z12, boolean z13, boolean z14, SocialButtonType socialButtonType, boolean z15, int i2, int i3, zcl zclVar) {
        this(r16, r4, r6, r7, r8, r10, r11, r13, r15, r5, r12, r14, r2, (i2 & 8192) != 0 ? "" : str3, (i2 & 16384) != 0 ? "" : str4, (i2 & 32768) != 0 ? "" : str5, (i2 & 65536) != 0 ? "" : str6, (i2 & 131072) != 0 ? "" : str7, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? "" : str8, (i2 & 524288) != 0 ? "" : str9, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? "" : str10, (i2 & 2097152) != 0 ? false : z5, (i2 & 4194304) != 0 ? false : z6, (i2 & 8388608) != 0 ? false : z7, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0 : i, (i2 & 33554432) != 0 ? "" : str11, (i2 & 67108864) != 0 ? false : z8, (i2 & 134217728) != 0 ? true : z9, (i2 & 268435456) != 0 ? true : z10, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? false : z11, (i2 & 1073741824) != 0 ? null : imageStatus, (i2 & Integer.MIN_VALUE) != 0 ? UserNameType.VK : userNameType, (i3 & 1) != 0 ? "" : str12, (i3 & 2) != 0 ? "" : str13, (i3 & 4) != 0 ? OccupationType.UNKNOWN : occupationType, (i3 & 8) == 0 ? str14 : "", (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? true : z12, (i3 & 256) != 0 ? true : z13, (i3 & 512) != 0 ? false : z14, (i3 & 1024) != 0 ? SocialButtonType.ADD : socialButtonType, (i3 & 2048) != 0 ? false : z15);
        long j2 = (i2 & 1) != 0 ? 0L : j;
        List list = null;
        Object[] objArr = 0;
        Long l2 = (i2 & 2) != 0 ? null : l;
        String str15 = (i2 & 4) != 0 ? null : str;
        Boolean bool2 = (i2 & 8) != 0 ? null : bool;
        String str16 = (i2 & 16) != 0 ? "" : str2;
        UserSex userSex2 = (i2 & 32) != 0 ? UserSex.UNKNOWN : userSex;
        ImageList imageList2 = (i2 & 64) != 0 ? new ImageList(list, 1, objArr == true ? 1 : 0) : imageList;
        boolean z16 = (i2 & 128) != 0 ? false : z;
        boolean z17 = (i2 & 256) != 0 ? false : z2;
        UserDeactivationStatus userDeactivationStatus2 = (i2 & 512) != 0 ? UserDeactivationStatus.UNKNOWN : userDeactivationStatus;
        boolean z18 = (i2 & 1024) != 0 ? false : z3;
        boolean z19 = (i2 & 2048) != 0 ? false : z4;
        long j3 = j2;
        OnlineInfo onlineInfo2 = (i2 & 4096) != 0 ? VisibleStatus.f : onlineInfo;
    }

    public User(long j, Long l, String str, Boolean bool, String str2, UserSex userSex, ImageList imageList, boolean z, boolean z2, UserDeactivationStatus userDeactivationStatus, boolean z3, boolean z4, OnlineInfo onlineInfo, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, int i, String str11, boolean z8, boolean z9, boolean z10, boolean z11, ImageStatus imageStatus, UserNameType userNameType, String str12, String str13, OccupationType occupationType, String str14, Integer num, Integer num2, Integer num3, boolean z12, boolean z13, boolean z14, SocialButtonType socialButtonType, boolean z15) {
        this.b = j;
        this.c = l;
        this.d = str;
        this.e = bool;
        this.f = str2;
        this.g = userSex;
        this.h = imageList;
        this.i = z;
        this.j = z2;
        this.k = userDeactivationStatus;
        this.l = z3;
        this.m = z4;
        this.n = onlineInfo;
        this.o = str3;
        this.p = str4;
        this.q = str5;
        this.r = str6;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = str10;
        this.w = z5;
        this.x = z6;
        this.y = z7;
        this.z = i;
        this.A = str11;
        this.B = z8;
        this.C = z9;
        this.D = z10;
        this.E = z11;
        this.F = imageStatus;
        this.G = userNameType;
        this.H = str12;
        this.I = str13;
        this.J = occupationType;
        this.K = str14;
        this.L = num;
        this.M = num2;
        this.N = num3;
        this.O = z12;
        this.P = z13;
        this.Q = z14;
        this.R = socialButtonType;
        this.S = z15;
        this.T = new bpn0(new lva0(this, 28));
        this.U = new bpn0(new h8n0(this, 5));
        this.V = new InitializedLazyImpl(new VerifyInfo(z3, false, z4, false, false, false, 56, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public User(Serializer serializer, zcl zclVar) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, UserDeactivationStatus.a.a(r42), r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, serializer.m(), r43, r44, false, 0, 2048, null);
        long w = serializer.w();
        Long x = serializer.x();
        String H = serializer.H();
        Boolean n = serializer.n();
        String H2 = serializer.H();
        UserSex.a aVar = UserSex.Companion;
        Integer valueOf = Integer.valueOf(serializer.u());
        aVar.getClass();
        UserSex a2 = UserSex.a.a(valueOf);
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        OnlineInfo onlineInfo = (OnlineInfo) serializer.G(OnlineInfo.class.getClassLoader());
        String H3 = serializer.H();
        String H4 = serializer.H();
        String H5 = serializer.H();
        String H6 = serializer.H();
        String H7 = serializer.H();
        String H8 = serializer.H();
        String H9 = serializer.H();
        String H10 = serializer.H();
        boolean m4 = serializer.m();
        boolean m5 = serializer.m();
        boolean m6 = serializer.m();
        int u = serializer.u();
        String H11 = serializer.H();
        boolean m7 = serializer.m();
        boolean m8 = serializer.m();
        boolean m9 = serializer.m();
        boolean m10 = serializer.m();
        ImageStatus imageStatus = (ImageStatus) serializer.G(ImageStatus.class.getClassLoader());
        UserNameType userNameType = UserNameType.values()[serializer.u()];
        String H12 = serializer.H();
        String H13 = serializer.H();
        OccupationType.a aVar2 = OccupationType.Companion;
        int u2 = serializer.u();
        aVar2.getClass();
        OccupationType a3 = OccupationType.a.a(u2);
        String H14 = serializer.H();
        Integer v = serializer.v();
        Integer v2 = serializer.v();
        Integer v3 = serializer.v();
        boolean m11 = serializer.m();
        boolean m12 = serializer.m();
        boolean m13 = serializer.m();
        SocialButtonType.a aVar3 = SocialButtonType.Companion;
        String H15 = serializer.H();
        aVar3.getClass();
        SocialButtonType a4 = SocialButtonType.a.a(H15);
        SocialButtonType socialButtonType = a4 == null ? SocialButtonType.ADD : a4;
        UserDeactivationStatus.a aVar4 = UserDeactivationStatus.Companion;
        Integer valueOf2 = Integer.valueOf(serializer.u());
        aVar4.getClass();
    }
}
