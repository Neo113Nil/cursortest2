package com.vk.im.engine.models.users;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.users.UserDeactivationStatus;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UserStorageModel.kt */
/* loaded from: classes2.dex */
public final class UserStorageModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<UserStorageModel> CREATOR = new a();
    public final boolean A;
    public final boolean B;
    public final long C;
    public final long D;
    public final ImageStatus E;
    public final String F;
    public final String G;
    public final OccupationType H;
    public final String I;
    public final Integer J;
    public final Integer K;
    public final Integer L;
    public final boolean M;
    public final boolean N;
    public final SocialButtonType O;
    public final boolean P;
    public final boolean Q;
    public final long b;
    public final Long c;
    public final String d;
    public final UserSex e;
    public final ImageList f;
    public final boolean g;
    public final boolean h;
    public final UserDeactivationStatus i;
    public final boolean j;
    public final boolean k;
    public final OnlineInfo l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final String y;
    public final boolean z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UserStorageModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserStorageModel a(Serializer serializer) {
            return new UserStorageModel(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserStorageModel[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserStorageModel(User user, long j, Long l, String str, UserSex userSex, ImageList imageList, boolean z, boolean z2, UserDeactivationStatus userDeactivationStatus, boolean z3, boolean z4, OnlineInfo onlineInfo, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, boolean z7, int i, String str10, boolean z8, boolean z9, ImageStatus imageStatus, boolean z10, long j2, long j3, String str11, String str12, OccupationType occupationType, String str13, Integer num, Integer num2, Integer num3, boolean z11, boolean z12, SocialButtonType socialButtonType, boolean z13, boolean z14, int i2, int i3, zcl zclVar) {
        this(r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r56, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69);
        boolean z15;
        String str14;
        boolean z16;
        boolean z17;
        ImageStatus imageStatus2;
        boolean z18;
        String str15;
        String str16;
        OccupationType occupationType2;
        String str17;
        Integer num4;
        Integer num5;
        Integer num6;
        boolean z19;
        boolean z20;
        boolean z21;
        String str18;
        String str19;
        boolean z22;
        boolean z23;
        OnlineInfo onlineInfo2;
        String str20;
        long j4;
        long j5;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        boolean z24;
        boolean z25;
        boolean z26;
        SocialButtonType socialButtonType2;
        Long l2;
        String str26;
        UserSex userSex2;
        ImageList imageList2;
        boolean z27;
        boolean z28;
        long j6;
        int i4;
        User user2;
        UserDeactivationStatus userDeactivationStatus2;
        long j7 = (i2 & 2) != 0 ? user.b : j;
        Long l3 = (i2 & 4) != 0 ? user.c : l;
        String str27 = (i2 & 8) != 0 ? user.f : str;
        UserSex userSex3 = (i2 & 16) != 0 ? user.g : userSex;
        ImageList imageList3 = (i2 & 32) != 0 ? user.h : imageList;
        boolean z29 = (i2 & 64) != 0 ? user.i : z;
        boolean z30 = (i2 & 128) != 0 ? user.j : z2;
        UserDeactivationStatus userDeactivationStatus3 = (i2 & 256) != 0 ? user.k : userDeactivationStatus;
        boolean z31 = (i2 & 512) != 0 ? user.l : z3;
        boolean z32 = (i2 & 1024) != 0 ? user.m : z4;
        OnlineInfo onlineInfo3 = (i2 & 2048) != 0 ? user.n : onlineInfo;
        String str28 = (i2 & 4096) != 0 ? user.o : str2;
        long j8 = j7;
        String str29 = (i2 & 8192) != 0 ? user.p : str3;
        String str30 = (i2 & 16384) != 0 ? user.q : str4;
        String str31 = (i2 & 32768) != 0 ? user.r : str5;
        String str32 = (i2 & 65536) != 0 ? user.s : str6;
        String str33 = (i2 & 131072) != 0 ? user.t : str7;
        String str34 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? user.u : str8;
        String str35 = (i2 & 524288) != 0 ? user.v : str9;
        boolean z33 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? user.w : z5;
        boolean z34 = (i2 & 2097152) != 0 ? user.x : z6;
        boolean z35 = (i2 & 4194304) != 0 ? user.y : z7;
        int i5 = (i2 & 8388608) != 0 ? user.z : i;
        String str36 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? user.A : str10;
        boolean z36 = (i2 & 33554432) != 0 ? user.B : z8;
        boolean z37 = (i2 & 67108864) != 0 ? user.C : z9;
        ImageStatus imageStatus3 = (i2 & 134217728) != 0 ? user.F : imageStatus;
        boolean z38 = (i2 & 268435456) != 0 ? user.D : z10;
        long j9 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? 0L : j2;
        long j10 = (i2 & 1073741824) == 0 ? j3 : 0L;
        boolean z39 = z38;
        String str37 = (i2 & Integer.MIN_VALUE) != 0 ? user.H : str11;
        String str38 = (i3 & 1) != 0 ? user.I : str12;
        OccupationType occupationType3 = (i3 & 2) != 0 ? user.J : occupationType;
        String str39 = (i3 & 4) != 0 ? user.K : str13;
        Integer num7 = (i3 & 8) != 0 ? user.L : num;
        Integer num8 = (i3 & 16) != 0 ? user.M : num2;
        Integer num9 = (i3 & 32) != 0 ? user.N : num3;
        boolean z40 = (i3 & 64) != 0 ? user.O : z11;
        boolean z41 = (i3 & 128) != 0 ? user.Q : z12;
        SocialButtonType socialButtonType3 = (i3 & 256) != 0 ? user.R : socialButtonType;
        boolean z42 = (i3 & 512) != 0 ? user.P : z13;
        if ((i3 & 1024) != 0) {
            z15 = user.S;
            str14 = str36;
            z16 = z36;
            z17 = z37;
            imageStatus2 = imageStatus3;
            z18 = z39;
            str15 = str37;
            str16 = str38;
            occupationType2 = occupationType3;
            str17 = str39;
            num4 = num7;
            num5 = num8;
            num6 = num9;
            z19 = z40;
            z20 = z41;
            socialButtonType2 = socialButtonType3;
            z21 = z42;
            str18 = str29;
            str19 = str30;
            z22 = z31;
            z23 = z32;
            onlineInfo2 = onlineInfo3;
            str20 = str28;
            j4 = j10;
            j5 = j9;
            str21 = str31;
            str22 = str32;
            str23 = str33;
            str24 = str34;
            str25 = str35;
            z24 = z33;
            z25 = z34;
            z26 = z35;
            i4 = i5;
            l2 = l3;
            str26 = str27;
            userSex2 = userSex3;
            imageList2 = imageList3;
            z27 = z29;
            z28 = z30;
            userDeactivationStatus2 = userDeactivationStatus3;
            j6 = j8;
            user2 = user;
        } else {
            z15 = z14;
            str14 = str36;
            z16 = z36;
            z17 = z37;
            imageStatus2 = imageStatus3;
            z18 = z39;
            str15 = str37;
            str16 = str38;
            occupationType2 = occupationType3;
            str17 = str39;
            num4 = num7;
            num5 = num8;
            num6 = num9;
            z19 = z40;
            z20 = z41;
            z21 = z42;
            str18 = str29;
            str19 = str30;
            z22 = z31;
            z23 = z32;
            onlineInfo2 = onlineInfo3;
            str20 = str28;
            j4 = j10;
            j5 = j9;
            str21 = str31;
            str22 = str32;
            str23 = str33;
            str24 = str34;
            str25 = str35;
            z24 = z33;
            z25 = z34;
            z26 = z35;
            socialButtonType2 = socialButtonType3;
            l2 = l3;
            str26 = str27;
            userSex2 = userSex3;
            imageList2 = imageList3;
            z27 = z29;
            z28 = z30;
            j6 = j8;
            i4 = i5;
            user2 = user;
            userDeactivationStatus2 = userDeactivationStatus3;
        }
    }

    public static UserStorageModel zb(UserStorageModel userStorageModel, Long l, String str, ImageList imageList, OnlineInfo onlineInfo, String str2, String str3, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        OnlineInfo onlineInfo2;
        long j;
        long j2 = userStorageModel.b;
        Long l2 = (i2 & 2) != 0 ? userStorageModel.c : l;
        String str4 = (i2 & 4) != 0 ? userStorageModel.d : str;
        UserSex userSex = userStorageModel.e;
        ImageList imageList2 = (i2 & 16) != 0 ? userStorageModel.f : imageList;
        boolean z3 = userStorageModel.g;
        Long l3 = l2;
        String str5 = str4;
        ImageList imageList3 = imageList2;
        boolean z4 = userStorageModel.h;
        UserDeactivationStatus userDeactivationStatus = userStorageModel.i;
        boolean z5 = userStorageModel.j;
        boolean z6 = userStorageModel.k;
        OnlineInfo onlineInfo3 = (i2 & 1024) != 0 ? userStorageModel.l : onlineInfo;
        String str6 = (i2 & 2048) != 0 ? userStorageModel.m : str2;
        String str7 = (i2 & 4096) != 0 ? userStorageModel.n : str3;
        String str8 = userStorageModel.o;
        String str9 = userStorageModel.p;
        String str10 = userStorageModel.q;
        String str11 = userStorageModel.r;
        String str12 = userStorageModel.s;
        String str13 = userStorageModel.t;
        boolean z7 = userStorageModel.u;
        boolean z8 = userStorageModel.v;
        boolean z9 = userStorageModel.w;
        if ((i2 & 4194304) != 0) {
            z = z9;
            i3 = userStorageModel.x;
        } else {
            z = z9;
            i3 = i;
        }
        String str14 = userStorageModel.y;
        boolean z10 = userStorageModel.z;
        boolean z11 = userStorageModel.A;
        boolean z12 = userStorageModel.B;
        if ((i2 & 134217728) != 0) {
            z2 = z12;
            onlineInfo2 = onlineInfo3;
            j = userStorageModel.C;
        } else {
            z2 = z12;
            onlineInfo2 = onlineInfo3;
            j = -1;
        }
        long j3 = j;
        long j4 = (i2 & 268435456) != 0 ? userStorageModel.D : -1L;
        ImageStatus imageStatus = userStorageModel.E;
        String str15 = userStorageModel.F;
        String str16 = userStorageModel.G;
        OccupationType occupationType = userStorageModel.H;
        String str17 = userStorageModel.I;
        Integer num = userStorageModel.J;
        Integer num2 = userStorageModel.K;
        Integer num3 = userStorageModel.L;
        boolean z13 = userStorageModel.M;
        boolean z14 = userStorageModel.N;
        SocialButtonType socialButtonType = userStorageModel.O;
        boolean z15 = userStorageModel.P;
        boolean z16 = userStorageModel.Q;
        userStorageModel.getClass();
        return new UserStorageModel(j2, l3, str5, userSex, imageList3, z3, z4, userDeactivationStatus, z5, z6, onlineInfo2, str6, str7, str8, str9, str10, str11, str12, str13, z7, z8, z, i3, str14, z10, z11, z2, j3, j4, imageStatus, str15, str16, occupationType, str17, num, num2, num3, z13, z14, socialButtonType, z15, z16);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.b0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e.h());
        serializer.i0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.i0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.S(this.x);
        serializer.j0(this.y);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
        serializer.i0(this.E);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.Y(this.C);
        serializer.Y(this.D);
        serializer.j0(this.F);
        serializer.j0(this.G);
        serializer.S(this.H.i());
        serializer.j0(this.I);
        serializer.V(this.J);
        serializer.V(this.K);
        serializer.V(this.L);
        serializer.L(this.M ? (byte) 1 : (byte) 0);
        serializer.L(this.N ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.j0(this.O.name());
        serializer.S(this.i.h());
        serializer.L(this.P ? (byte) 1 : (byte) 0);
        serializer.L(this.Q ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStorageModel)) {
            return false;
        }
        UserStorageModel userStorageModel = (UserStorageModel) obj;
        return this.b == userStorageModel.b && epx.f(this.c, userStorageModel.c) && epx.f(this.d, userStorageModel.d) && this.e == userStorageModel.e && epx.f(this.f, userStorageModel.f) && this.g == userStorageModel.g && this.h == userStorageModel.h && this.i == userStorageModel.i && this.j == userStorageModel.j && this.k == userStorageModel.k && epx.f(this.l, userStorageModel.l) && epx.f(this.m, userStorageModel.m) && epx.f(this.n, userStorageModel.n) && epx.f(this.o, userStorageModel.o) && epx.f(this.p, userStorageModel.p) && epx.f(this.q, userStorageModel.q) && epx.f(this.r, userStorageModel.r) && epx.f(this.s, userStorageModel.s) && epx.f(this.t, userStorageModel.t) && this.u == userStorageModel.u && this.v == userStorageModel.v && this.w == userStorageModel.w && this.x == userStorageModel.x && epx.f(this.y, userStorageModel.y) && this.z == userStorageModel.z && this.A == userStorageModel.A && this.B == userStorageModel.B && this.C == userStorageModel.C && this.D == userStorageModel.D && epx.f(this.E, userStorageModel.E) && epx.f(this.F, userStorageModel.F) && epx.f(this.G, userStorageModel.G) && this.H == userStorageModel.H && epx.f(this.I, userStorageModel.I) && epx.f(this.J, userStorageModel.J) && epx.f(this.K, userStorageModel.K) && epx.f(this.L, userStorageModel.L) && this.M == userStorageModel.M && this.N == userStorageModel.N && this.O == userStorageModel.O && this.P == userStorageModel.P && this.Q == userStorageModel.Q;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        Long l = this.c;
        int a2 = bh10.a(bh10.a(qoy.b(qoy.b(qoy.b(urd0.a(shy.a(this.x, qoy.b(qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((this.l.hashCode() + qoy.b(qoy.b((this.i.hashCode() + qoy.b(qoy.b(fw3.a((this.e.hashCode() + urd0.a((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.d)) * 31, 31, this.f.b), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D);
        ImageStatus imageStatus = this.E;
        int a3 = urd0.a((this.H.hashCode() + urd0.a(urd0.a((a2 + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31, 31, this.F), 31, this.G)) * 31, 31, this.I);
        Integer num = this.J;
        int hashCode2 = (a3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.K;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.L;
        return Boolean.hashCode(this.Q) + qoy.b((this.O.hashCode() + qoy.b(qoy.b((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.M), 31, this.N)) * 31, 31, this.P);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStorageModel(id=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", domain=");
        sb.append(this.d);
        sb.append(", sex=");
        sb.append(this.e);
        sb.append(", avatar=");
        sb.append(this.f);
        sb.append(", blocked=");
        sb.append(this.g);
        sb.append(", blockedByMe=");
        sb.append(this.h);
        sb.append(", deactivationStatus=");
        sb.append(this.i);
        sb.append(", verified=");
        sb.append(this.j);
        sb.append(", isOauthVerified=");
        sb.append(this.k);
        sb.append(", online=");
        sb.append(this.l);
        sb.append(", firstNameNom=");
        sb.append(this.m);
        sb.append(", lastNameNom=");
        sb.append(this.n);
        sb.append(", firstNameAcc=");
        sb.append(this.o);
        sb.append(", lastNameAcc=");
        sb.append(this.p);
        sb.append(", firstNameGen=");
        sb.append(this.q);
        sb.append(", lastNameGen=");
        sb.append(this.r);
        sb.append(", firstNameDat=");
        sb.append(this.s);
        sb.append(", lastNameDat=");
        sb.append(this.t);
        sb.append(", canCall=");
        sb.append(this.u);
        sb.append(", isService=");
        sb.append(this.v);
        sb.append(", isServiceAccount=");
        sb.append(this.w);
        sb.append(", friendStatus=");
        sb.append(this.x);
        sb.append(", mobilePhone=");
        sb.append(this.y);
        sb.append(", isClosed=");
        sb.append(this.z);
        sb.append(", canAccessClosed=");
        sb.append(this.A);
        sb.append(", canBeInvitedToChats=");
        sb.append(this.B);
        sb.append(", syncTimeOverall=");
        sb.append(this.C);
        sb.append(", syncTimeOnline=");
        sb.append(this.D);
        sb.append(", imageStatus=");
        sb.append(this.E);
        sb.append(", country=");
        sb.append(this.F);
        sb.append(", city=");
        sb.append(this.G);
        sb.append(", occupationType=");
        sb.append(this.H);
        sb.append(", occupationName=");
        sb.append(this.I);
        sb.append(", birthdayDay=");
        sb.append(this.J);
        sb.append(", birthdayMonth=");
        sb.append(this.K);
        sb.append(", birthdayYear=");
        sb.append(this.L);
        sb.append(", canSendFriendRequest=");
        sb.append(this.M);
        sb.append(", avatarIsNft=");
        sb.append(this.N);
        sb.append(", socialButtonType=");
        sb.append(this.O);
        sb.append(", canWritePrivateMessage=");
        sb.append(this.P);
        sb.append(", isAdult=");
        return q0.a(sb, this.Q, ')');
    }

    public UserStorageModel(long j, Long l, String str, UserSex userSex, ImageList imageList, boolean z, boolean z2, UserDeactivationStatus userDeactivationStatus, boolean z3, boolean z4, OnlineInfo onlineInfo, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, boolean z7, int i, String str10, boolean z8, boolean z9, boolean z10, long j2, long j3, ImageStatus imageStatus, String str11, String str12, OccupationType occupationType, String str13, Integer num, Integer num2, Integer num3, boolean z11, boolean z12, SocialButtonType socialButtonType, boolean z13, boolean z14) {
        this.b = j;
        this.c = l;
        this.d = str;
        this.e = userSex;
        this.f = imageList;
        this.g = z;
        this.h = z2;
        this.i = userDeactivationStatus;
        this.j = z3;
        this.k = z4;
        this.l = onlineInfo;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = str8;
        this.t = str9;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = i;
        this.y = str10;
        this.z = z8;
        this.A = z9;
        this.B = z10;
        this.C = j2;
        this.D = j3;
        this.E = imageStatus;
        this.F = str11;
        this.G = str12;
        this.H = occupationType;
        this.I = str13;
        this.J = num;
        this.K = num2;
        this.L = num3;
        this.M = z11;
        this.N = z12;
        this.O = socialButtonType;
        this.P = z13;
        this.Q = z14;
    }

    public UserStorageModel(User user, long j, Long l, String str, UserSex userSex, ImageList imageList, boolean z, boolean z2, UserDeactivationStatus userDeactivationStatus, boolean z3, boolean z4, OnlineInfo onlineInfo, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, boolean z7, int i, String str10, boolean z8, boolean z9, ImageStatus imageStatus, boolean z10, long j2, long j3, String str11, String str12, OccupationType occupationType, String str13, Integer num, Integer num2, Integer num3, boolean z11, boolean z12, SocialButtonType socialButtonType, boolean z13, boolean z14) {
        this(j, l, str, userSex, imageList, z, z2, userDeactivationStatus, z3, z4, onlineInfo, str2, str3, str4, str5, str6, str7, str8, str9, z5, z6, z7, i, str10, z8, z9, z10, j2, j3, imageStatus, str11, str12, occupationType, str13, num, num2, num3, z11, z12, socialButtonType, z13, z14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserStorageModel(Serializer serializer, zcl zclVar) {
        this(r1, r3, r4, r5, r6, r7, r8, UserDeactivationStatus.a.a(r44), r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, serializer.m(), serializer.m());
        long w = serializer.w();
        Long x = serializer.x();
        String H = serializer.H();
        UserSex.a aVar = UserSex.Companion;
        Integer valueOf = Integer.valueOf(serializer.u());
        aVar.getClass();
        UserSex a2 = UserSex.a.a(valueOf);
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        OnlineInfo onlineInfo = (OnlineInfo) serializer.G(OnlineInfo.class.getClassLoader());
        String H2 = serializer.H();
        String H3 = serializer.H();
        String H4 = serializer.H();
        String H5 = serializer.H();
        String H6 = serializer.H();
        String H7 = serializer.H();
        String H8 = serializer.H();
        String H9 = serializer.H();
        boolean m4 = serializer.m();
        boolean m5 = serializer.m();
        boolean m6 = serializer.m();
        int u = serializer.u();
        String H10 = serializer.H();
        boolean m7 = serializer.m();
        boolean m8 = serializer.m();
        ImageStatus imageStatus = (ImageStatus) serializer.G(ImageStatus.class.getClassLoader());
        boolean m9 = serializer.m();
        long w2 = serializer.w();
        long w3 = serializer.w();
        String H11 = serializer.H();
        String H12 = serializer.H();
        OccupationType.a aVar2 = OccupationType.Companion;
        int u2 = serializer.u();
        aVar2.getClass();
        OccupationType a3 = OccupationType.a.a(u2);
        String H13 = serializer.H();
        Integer v = serializer.v();
        Integer v2 = serializer.v();
        Integer v3 = serializer.v();
        boolean m10 = serializer.m();
        boolean m11 = serializer.m();
        boolean m12 = serializer.m();
        SocialButtonType.a aVar3 = SocialButtonType.Companion;
        String H14 = serializer.H();
        aVar3.getClass();
        SocialButtonType a4 = SocialButtonType.a.a(H14);
        SocialButtonType socialButtonType = a4 == null ? SocialButtonType.ADD : a4;
        UserDeactivationStatus.a aVar4 = UserDeactivationStatus.Companion;
        Integer valueOf2 = Integer.valueOf(serializer.u());
        aVar4.getClass();
    }
}
