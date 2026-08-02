package com.vk.im.engine.models.account;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.CounterSettings;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.common.account.ProfilerConfig;
import com.vk.dto.common.account.VideoConfig;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserNameType;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.EmailStatus;
import com.vk.im.engine.models.PhoneStatus;
import com.vk.im.engine.models.VerificationStatus;
import com.vk.im.engine.models.account.AccountRole;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bh10;
import xsna.bpn0;
import xsna.epx;
import xsna.fw3;
import xsna.no;
import xsna.oo;
import xsna.or00;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountInfo.kt */
/* loaded from: classes.dex */
public final class AccountInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AccountInfo> CREATOR = new a();
    public final long A;
    public final CounterSettings B;
    public final String C;
    public final List<SupportedLanguagesPair> D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final com.vk.dto.hints.a I;
    public final or00 J;
    public final boolean K;
    public final VerifyInfo L;
    public final VerificationStatus M;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final UserSex i;
    public final int j;
    public final ImageList k;
    public final String l;
    public final String m;
    public final PhoneStatus n;
    public final String o;
    public final String p;
    public final EmailStatus q;
    public final String r;
    public final AudioAdConfig s;
    public final VideoConfig t;
    public final MoneyConfig u;
    public final ProfilerConfig v;
    public final CommonConfig w;
    public final AccountRole x;
    public final NameChangeRequestInfo y;
    public final UserNameType z;

    /* compiled from: Serializer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Serializer.c<AccountInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AccountInfo a(Serializer serializer) {
            return new AccountInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountInfo[i];
        }
    }

    public AccountInfo() {
        this(0L, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, false, false, false, null, null, false, null, null, -1, 63, null);
    }

    public static AccountInfo zb(AccountInfo accountInfo, long j, com.vk.dto.hints.a aVar, int i, int i2) {
        EmailStatus emailStatus;
        long j2 = accountInfo.b;
        boolean z = accountInfo.c;
        String str = accountInfo.d;
        String str2 = accountInfo.e;
        String str3 = accountInfo.f;
        String str4 = accountInfo.g;
        String str5 = accountInfo.h;
        UserSex userSex = accountInfo.i;
        int i3 = accountInfo.j;
        ImageList imageList = accountInfo.k;
        String str6 = accountInfo.l;
        String str7 = accountInfo.m;
        PhoneStatus phoneStatus = accountInfo.n;
        String str8 = accountInfo.o;
        String str9 = accountInfo.p;
        EmailStatus emailStatus2 = accountInfo.q;
        String str10 = accountInfo.r;
        AudioAdConfig audioAdConfig = accountInfo.s;
        VideoConfig videoConfig = accountInfo.t;
        MoneyConfig moneyConfig = accountInfo.u;
        ProfilerConfig profilerConfig = accountInfo.v;
        CommonConfig commonConfig = accountInfo.w;
        AccountRole accountRole = accountInfo.x;
        NameChangeRequestInfo nameChangeRequestInfo = accountInfo.y;
        UserNameType userNameType = accountInfo.z;
        if ((i & 33554432) != 0) {
            emailStatus = emailStatus2;
            j = accountInfo.A;
        } else {
            emailStatus = emailStatus2;
        }
        CounterSettings counterSettings = accountInfo.B;
        String str11 = accountInfo.C;
        List<SupportedLanguagesPair> list = accountInfo.D;
        String str12 = accountInfo.E;
        boolean z2 = accountInfo.F;
        boolean z3 = accountInfo.G;
        boolean z4 = accountInfo.H;
        com.vk.dto.hints.a aVar2 = (i2 & 2) != 0 ? accountInfo.I : aVar;
        or00 or00Var = accountInfo.J;
        boolean z5 = accountInfo.K;
        VerifyInfo verifyInfo = accountInfo.L;
        VerificationStatus verificationStatus = accountInfo.M;
        accountInfo.getClass();
        return new AccountInfo(j2, z, str, str2, str3, str4, str5, userSex, i3, imageList, str6, str7, phoneStatus, str8, str9, emailStatus, str10, audioAdConfig, videoConfig, moneyConfig, profilerConfig, commonConfig, accountRole, nameChangeRequestInfo, userNameType, j, counterSettings, str11, list, str12, z2, z3, z4, aVar2, or00Var, z5, verifyInfo, verificationStatus);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.S(this.i.h());
        serializer.i0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.S(this.n.j());
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.S(this.q.j());
        serializer.j0(this.r);
        serializer.i0(this.s);
        serializer.i0(this.t);
        serializer.i0(this.u);
        serializer.i0(this.v);
        serializer.i0(this.w);
        serializer.S(this.x.i());
        NameChangeRequestInfo nameChangeRequestInfo = this.y;
        if (nameChangeRequestInfo == null) {
            serializer.L((byte) 0);
        } else {
            serializer.L((byte) 1);
            serializer.i0(nameChangeRequestInfo);
        }
        serializer.S(this.z.ordinal());
        serializer.Y(this.A);
        serializer.i0(this.B);
        serializer.j0(this.C);
        serializer.f0(this.D);
        serializer.j0(this.E);
        serializer.L(this.F ? (byte) 1 : (byte) 0);
        serializer.L(this.G ? (byte) 1 : (byte) 0);
        serializer.L(this.H ? (byte) 1 : (byte) 0);
        com.vk.dto.hints.a aVar = this.I;
        serializer.j0(aVar != null ? aVar.e5().toString() : null);
        or00 or00Var = this.J;
        serializer.j0(or00Var != null ? or00Var.e5().toString() : null);
        serializer.L(this.K ? (byte) 1 : (byte) 0);
        serializer.i0(this.L);
        serializer.S(this.M.j());
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return this.b == accountInfo.b && this.c == accountInfo.c && epx.f(this.d, accountInfo.d) && epx.f(this.e, accountInfo.e) && epx.f(this.f, accountInfo.f) && epx.f(this.g, accountInfo.g) && epx.f(this.h, accountInfo.h) && this.i == accountInfo.i && this.j == accountInfo.j && epx.f(this.k, accountInfo.k) && epx.f(this.l, accountInfo.l) && epx.f(this.m, accountInfo.m) && this.n == accountInfo.n && epx.f(this.o, accountInfo.o) && epx.f(this.p, accountInfo.p) && this.q == accountInfo.q && epx.f(this.r, accountInfo.r) && epx.f(this.s, accountInfo.s) && epx.f(this.t, accountInfo.t) && epx.f(this.u, accountInfo.u) && epx.f(this.v, accountInfo.v) && epx.f(this.w, accountInfo.w) && this.x == accountInfo.x && epx.f(this.y, accountInfo.y) && this.z == accountInfo.z && this.A == accountInfo.A && epx.f(this.B, accountInfo.B) && epx.f(this.C, accountInfo.C) && epx.f(this.D, accountInfo.D) && epx.f(this.E, accountInfo.E) && this.F == accountInfo.F && this.G == accountInfo.G && this.H == accountInfo.H && epx.f(this.I, accountInfo.I) && epx.f(this.J, accountInfo.J) && this.K == accountInfo.K && epx.f(this.L, accountInfo.L) && this.M == accountInfo.M;
    }

    public final int hashCode() {
        int hashCode = (this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + urd0.a((this.q.hashCode() + urd0.a(urd0.a((this.n.hashCode() + urd0.a(urd0.a((this.k.hashCode() + shy.a(this.j, (this.i.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(qoy.b(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31)) * 31, 31, this.l), 31, this.m)) * 31, 31, this.o), 31, this.p)) * 31, 31, this.r)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        NameChangeRequestInfo nameChangeRequestInfo = this.y;
        int hashCode2 = (this.B.hashCode() + bh10.a((this.z.hashCode() + ((hashCode + (nameChangeRequestInfo == null ? 0 : nameChangeRequestInfo.hashCode())) * 31)) * 31, 31, this.A)) * 31;
        String str = this.C;
        int b = qoy.b(qoy.b(qoy.b(urd0.a(fw3.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H);
        com.vk.dto.hints.a aVar = this.I;
        int hashCode3 = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
        or00 or00Var = this.J;
        int b2 = qoy.b((hashCode3 + (or00Var == null ? 0 : or00Var.hashCode())) * 31, 31, this.K);
        VerifyInfo verifyInfo = this.L;
        return this.M.hashCode() + ((b2 + (verifyInfo != null ? verifyInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AccountInfo(userId=" + this.b + ", userFromEu=" + this.c + ", firstName=" + this.d + ", lastName=" + this.e + ", screenName=" + this.f + ", nickName=" + this.g + ", birthDate=" + this.h + ", sex=" + this.i + ", country=" + this.j + ", avatar=" + this.k + ", supportUrl=" + this.l + ", phone=" + this.m + ", phoneStatus=" + this.n + ", phoneChangeUrl=" + this.o + ", email=" + this.p + ", emailStatus=" + this.q + ", emailChangeUrl=" + this.r + ", audioAdConfig=" + this.s + ", videoConfig=" + this.t + ", moneyConfig=" + this.u + ", profilerConfig=" + this.v + ", commonConfig=" + this.w + ", role=" + this.x + ", nameChangeRequest=" + this.y + ", userNameType=" + this.z + ", syncTime=" + this.A + ", messagesCountersSettings=" + this.B + ", linkRedirectsJson=" + this.C + ", supportedTranslateLanguages=" + this.D + ", domain=" + this.E + ", isClosedAccount=" + this.F + ", isServiceAccount=" + this.G + ", hasPhoto=" + this.H + ", hints=" + this.I + ", marketAdultConfig=" + this.J + ", avatarIsNft=" + this.K + ", verifyInfo=" + this.L + ", verificationStatus=" + this.M + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r100v1, types: [com.vk.dto.common.VerifyInfo] */
    /* JADX WARN: Type inference failed for: r90v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r91v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r96v0, types: [com.vk.dto.hints.a] */
    /* JADX WARN: Type inference failed for: r97v0, types: [xsna.or00] */
    /* JADX WARN: Type inference failed for: r97v1, types: [com.vk.dto.hints.a] */
    /* JADX WARN: Type inference failed for: r98v1, types: [xsna.or00] */
    /* JADX WARN: Type inference failed for: r99v0, types: [com.vk.dto.common.VerifyInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccountInfo(long j, boolean z, String str, String str2, String str3, String str4, String str5, UserSex userSex, int i, ImageList imageList, String str6, String str7, PhoneStatus phoneStatus, String str8, String str9, EmailStatus emailStatus, String str10, AudioAdConfig audioAdConfig, VideoConfig videoConfig, MoneyConfig moneyConfig, ProfilerConfig profilerConfig, CommonConfig commonConfig, AccountRole accountRole, NameChangeRequestInfo nameChangeRequestInfo, UserNameType userNameType, long j2, CounterSettings counterSettings, String str11, List list, String str12, boolean z2, boolean z3, boolean z4, com.vk.dto.hints.a aVar, or00 or00Var, boolean z5, VerifyInfo verifyInfo, VerificationStatus verificationStatus, int i2, int i3, zcl zclVar) {
        this(r4, r63, r7, r9, r10, r11, r12, r13, r14, r61, r15, r66, r6, r64, r65, r18, r19, r20, r21, r22, r0, (i2 & 2097152) != 0 ? new CommonConfig(false, false, false, false, 0L, false, false, false, false, false, false, false, 0L, false, false, 0, false, false, false, false, false, false, 0L, 0L, 0L, false, 0, false, false, 536870911, null) : commonConfig, (i2 & 4194304) != 0 ? AccountRole.UNKNOWN : accountRole, (i2 & 8388608) != 0 ? r3 : nameChangeRequestInfo, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? UserNameType.VK : userNameType, (i2 & 33554432) != 0 ? 0L : j2, (i2 & 67108864) != 0 ? CounterSettings.e.getSTUB() : counterSettings, (i2 & 134217728) != 0 ? r3 : str11, (i2 & 268435456) != 0 ? EmptyList.b : list, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 ? str12 : "", (i2 & 1073741824) != 0 ? r2 : z2, (i2 & Integer.MIN_VALUE) != 0 ? r2 : z3, (i3 & 1) != 0 ? r2 : z4, (i3 & 2) != 0 ? r3 : aVar, (i3 & 4) != 0 ? r3 : or00Var, (i3 & 8) == 0 ? z5 : r2, (i3 & 16) == 0 ? verifyInfo : r3, (i3 & 32) != 0 ? VerificationStatus.UNVERIFIED : verificationStatus);
        String str13;
        String str14;
        ImageList imageList2;
        boolean z6;
        NameChangeRequestInfo nameChangeRequestInfo2;
        ProfilerConfig profilerConfig2;
        long j3 = (i2 & 1) != 0 ? 0L : j;
        boolean z7 = (i2 & 2) != 0 ? false : z;
        String str15 = (i2 & 4) != 0 ? "" : str;
        String str16 = (i2 & 8) != 0 ? "" : str2;
        String str17 = (i2 & 16) != 0 ? "" : str3;
        String str18 = (i2 & 32) != 0 ? "" : str4;
        String str19 = (i2 & 64) != 0 ? "" : str5;
        UserSex userSex2 = (i2 & 128) != 0 ? UserSex.UNKNOWN : userSex;
        int i4 = (i2 & 256) != 0 ? 0 : i;
        ImageList imageList3 = (i2 & 512) != 0 ? new ImageList(null, 1, null) : imageList;
        String str20 = (i2 & 1024) != 0 ? "" : str6;
        String str21 = (i2 & 2048) != 0 ? "" : str7;
        PhoneStatus phoneStatus2 = (i2 & 4096) != 0 ? PhoneStatus.UNKNOWN : phoneStatus;
        boolean z8 = z7;
        String str22 = (i2 & 8192) != 0 ? "" : str8;
        String str23 = (i2 & 16384) != 0 ? "" : str9;
        EmailStatus emailStatus2 = (i2 & 32768) != 0 ? EmailStatus.UNKNOWN : emailStatus;
        String str24 = (i2 & 65536) != 0 ? "" : str10;
        AudioAdConfig audioAdConfig2 = (i2 & 131072) != 0 ? new AudioAdConfig(0, 0, null, null, false, 31, null) : audioAdConfig;
        VideoConfig videoConfig2 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? new VideoConfig(0, null, 0L, false, false, 31, null) : videoConfig;
        MoneyConfig moneyConfig2 = (i2 & 524288) != 0 ? new MoneyConfig(0, 0, null, false, false, false, false, false, null, null, 0, 2047, null) : moneyConfig;
        if ((i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            str13 = str23;
            str14 = str21;
            imageList2 = imageList3;
            z6 = false;
            nameChangeRequestInfo2 = null;
            profilerConfig2 = new ProfilerConfig(false, null, 3, null);
        } else {
            str13 = str23;
            str14 = str21;
            imageList2 = imageList3;
            z6 = false;
            nameChangeRequestInfo2 = null;
            profilerConfig2 = profilerConfig;
        }
    }

    public AccountInfo(long j, boolean z, String str, String str2, String str3, String str4, String str5, UserSex userSex, int i, ImageList imageList, String str6, String str7, PhoneStatus phoneStatus, String str8, String str9, EmailStatus emailStatus, String str10, AudioAdConfig audioAdConfig, VideoConfig videoConfig, MoneyConfig moneyConfig, ProfilerConfig profilerConfig, CommonConfig commonConfig, AccountRole accountRole, NameChangeRequestInfo nameChangeRequestInfo, UserNameType userNameType, long j2, CounterSettings counterSettings, String str11, List<SupportedLanguagesPair> list, String str12, boolean z2, boolean z3, boolean z4, com.vk.dto.hints.a aVar, or00 or00Var, boolean z5, VerifyInfo verifyInfo, VerificationStatus verificationStatus) {
        this.b = j;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = userSex;
        this.j = i;
        this.k = imageList;
        this.l = str6;
        this.m = str7;
        this.n = phoneStatus;
        this.o = str8;
        this.p = str9;
        this.q = emailStatus;
        this.r = str10;
        this.s = audioAdConfig;
        this.t = videoConfig;
        this.u = moneyConfig;
        this.v = profilerConfig;
        this.w = commonConfig;
        this.x = accountRole;
        this.y = nameChangeRequestInfo;
        this.z = userNameType;
        this.A = j2;
        this.B = counterSettings;
        this.C = str11;
        this.D = list;
        this.E = str12;
        this.F = z2;
        this.G = z3;
        this.H = z4;
        this.I = aVar;
        this.J = or00Var;
        this.K = z5;
        this.L = verifyInfo;
        this.M = verificationStatus;
        int i2 = 0;
        new bpn0(new no(this, i2));
        new bpn0(new oo(this, i2));
        AccountRole.a aVar2 = AccountRole.Companion;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccountInfo(Serializer serializer, zcl zclVar) {
        this(r36, r3, r4, r5, r6, r7, r0 != null ? r0 : "", r9, 0, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r8, r1, r38, r39, r40, 256, 0, null);
        long j;
        com.vk.dto.hints.a aVar;
        long w = serializer.w();
        boolean m = serializer.m();
        String H = serializer.H();
        String H2 = serializer.H();
        String H3 = serializer.H();
        UserSex.a aVar2 = UserSex.Companion;
        Integer valueOf = Integer.valueOf(serializer.u());
        aVar2.getClass();
        UserSex a2 = UserSex.a.a(valueOf);
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        String H4 = serializer.H();
        String H5 = serializer.H();
        PhoneStatus.a aVar3 = PhoneStatus.Companion;
        int u = serializer.u();
        aVar3.getClass();
        PhoneStatus a3 = PhoneStatus.a.a(u);
        String H6 = serializer.H();
        String H7 = serializer.H();
        EmailStatus.a aVar4 = EmailStatus.Companion;
        int u2 = serializer.u();
        aVar4.getClass();
        EmailStatus a4 = EmailStatus.a.a(u2);
        String H8 = serializer.H();
        AudioAdConfig audioAdConfig = (AudioAdConfig) serializer.G(AudioAdConfig.class.getClassLoader());
        VideoConfig videoConfig = (VideoConfig) serializer.G(VideoConfig.class.getClassLoader());
        MoneyConfig moneyConfig = (MoneyConfig) serializer.G(MoneyConfig.class.getClassLoader());
        ProfilerConfig profilerConfig = (ProfilerConfig) serializer.G(ProfilerConfig.class.getClassLoader());
        CommonConfig commonConfig = (CommonConfig) serializer.G(CommonConfig.class.getClassLoader());
        AccountRole.a aVar5 = AccountRole.Companion;
        int u3 = serializer.u();
        aVar5.getClass();
        AccountRole a5 = AccountRole.a.a(u3);
        NameChangeRequestInfo nameChangeRequestInfo = serializer.m() ? (NameChangeRequestInfo) serializer.G(NameChangeRequestInfo.class.getClassLoader()) : null;
        UserNameType userNameType = UserNameType.values()[serializer.u()];
        long w2 = serializer.w();
        CounterSettings counterSettings = (CounterSettings) serializer.G(CounterSettings.class.getClassLoader());
        String H9 = serializer.H();
        ArrayList B = serializer.B(SupportedLanguagesPair.class.getClassLoader());
        String H10 = serializer.H();
        String str = H10 == null ? "" : H10;
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        String H11 = serializer.H();
        if (H11 != null) {
            j = w;
            aVar = new com.vk.dto.hints.a(new JSONObject(H11));
        } else {
            j = w;
            aVar = null;
        }
        String H12 = serializer.H();
        or00 a6 = H12 != null ? or00.a.a(new JSONObject(H12)) : null;
        boolean m5 = serializer.m();
        VerifyInfo verifyInfo = (VerifyInfo) serializer.G(VerifyInfo.class.getClassLoader());
        VerificationStatus.a aVar6 = VerificationStatus.Companion;
        int u4 = serializer.u();
        aVar6.getClass();
        VerificationStatus a7 = VerificationStatus.a.a(u4);
        String H13 = serializer.H();
        String str2 = H13 == null ? "" : H13;
        String H14 = serializer.H();
    }
}
