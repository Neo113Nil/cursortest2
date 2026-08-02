package com.vk.im.engine.models.groups;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.groups.AgeLimits;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.GroupStatus;
import com.vk.im.engine.models.groups.GroupType;
import com.vk.im.engine.models.groups.WarningNotification;
import com.vk.im.engine.models.users.UserNameCase;
import defpackage.q0;
import io.appmetrica.analytics.BuildConfig;
import java.util.regex.Pattern;
import kotlin.InitializedLazyImpl;
import kotlin.NoWhenBranchMatchedException;
import xsna.a0a;
import xsna.bh10;
import xsna.bpn0;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.qtd0;
import xsna.shy;
import xsna.urd0;
import xsna.x0;
import xsna.zcl;

/* compiled from: Group.kt */
/* loaded from: classes2.dex */
public final class Group extends Serializer.StreamParcelableAdapter implements qtd0 {
    public static final Serializer.c<Group> CREATOR = new b();
    public static final bpn0 F;
    public final AgeLimits A;
    public final WarningNotification B;
    public final boolean C;
    public final boolean D;
    public final InitializedLazyImpl E;
    public final long b;
    public final String c;
    public final String d;
    public final ImageList e;
    public final GroupType f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final GroupStatus j;
    public final int k;
    public final long l;
    public final int m;
    public final String n;
    public final boolean o;
    public final int p;
    public final AdminLevel q;
    public final String r;
    public final boolean s;
    public final GroupPrivacy t;
    public final String u;
    public final GroupDeactivation v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: Group.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupType.values().length];
            try {
                iArr[GroupType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupType.PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupType.EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Group> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Group a(Serializer serializer) {
            return new Group(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Group[i];
        }
    }

    static {
        new Group(0L, null, null, null, null, false, false, false, null, 0, 0L, 0, null, false, 0, null, null, false, null, null, null, false, false, false, false, AgeLimits.NO_AGE_RESTRICTION, WarningNotification.NONE, false, false, 436205567, null);
        F = new bpn0(new x0(17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Group(long j, String str, String str2, ImageList imageList, GroupType groupType, boolean z, boolean z2, boolean z3, GroupStatus groupStatus, int i, long j2, int i2, String str3, boolean z4, int i3, AdminLevel adminLevel, String str4, boolean z5, GroupPrivacy groupPrivacy, String str5, GroupDeactivation groupDeactivation, boolean z6, boolean z7, boolean z8, boolean z9, AgeLimits ageLimits, WarningNotification warningNotification, boolean z10, boolean z11, int i4, zcl zclVar) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? new ImageList(null, 1, 0 == true ? 1 : 0) : imageList, (i4 & 16) != 0 ? GroupType.GROUP : groupType, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? false : z3, (i4 & 256) != 0 ? GroupStatus.NONE : groupStatus, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) != 0 ? 0L : j2, i2, (i4 & 4096) != 0 ? "" : str3, (i4 & 8192) != 0 ? false : z4, (i4 & 16384) != 0 ? 0 : i3, (32768 & i4) != 0 ? AdminLevel.NONE : adminLevel, (65536 & i4) != 0 ? "" : str4, (131072 & i4) != 0 ? false : z5, (262144 & i4) != 0 ? GroupPrivacy.CLOSED : groupPrivacy, (524288 & i4) != 0 ? "" : str5, (1048576 & i4) != 0 ? null : groupDeactivation, (2097152 & i4) != 0 ? false : z6, (4194304 & i4) != 0 ? false : z7, (8388608 & i4) != 0 ? false : z8, (16777216 & i4) != 0 ? false : z9, (33554432 & i4) != 0 ? AgeLimits.NO_AGE_RESTRICTION : ageLimits, (67108864 & i4) != 0 ? WarningNotification.NONE : warningNotification, (134217728 & i4) != 0 ? false : z10, (i4 & 268435456) != 0 ? false : z11);
    }

    public static Group zb(Group group, boolean z, boolean z2, long j, int i, WarningNotification warningNotification, int i2) {
        AgeLimits ageLimits;
        WarningNotification warningNotification2;
        long j2 = group.b;
        String str = group.c;
        String str2 = group.d;
        ImageList imageList = group.e;
        GroupType groupType = group.f;
        boolean z3 = group.g;
        boolean z4 = (i2 & 64) != 0 ? group.h : z;
        boolean z5 = (i2 & 128) != 0 ? group.i : z2;
        GroupStatus groupStatus = group.j;
        boolean z6 = z5;
        int i3 = group.k;
        long j3 = (i2 & 1024) != 0 ? group.l : j;
        int i4 = group.m;
        long j4 = j3;
        String str3 = group.n;
        boolean z7 = group.o;
        boolean z8 = z4;
        int i5 = (i2 & 16384) != 0 ? group.p : i;
        AdminLevel adminLevel = group.q;
        String str4 = group.r;
        boolean z9 = group.s;
        GroupPrivacy groupPrivacy = group.t;
        String str5 = group.u;
        GroupDeactivation groupDeactivation = group.v;
        boolean z10 = group.w;
        boolean z11 = group.x;
        boolean z12 = group.y;
        boolean z13 = group.z;
        AgeLimits ageLimits2 = group.A;
        if ((i2 & 67108864) != 0) {
            ageLimits = ageLimits2;
            warningNotification2 = group.B;
        } else {
            ageLimits = ageLimits2;
            warningNotification2 = warningNotification;
        }
        boolean z14 = group.C;
        boolean z15 = group.D;
        group.getClass();
        return new Group(j2, str, str2, imageList, groupType, z3, z8, z6, groupStatus, i3, j4, i4, str3, z7, i5, adminLevel, str4, z9, groupPrivacy, str5, groupDeactivation, z10, z11, z12, z13, ageLimits, warningNotification2, z14, z15);
    }

    public final Long Ab() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.qtd0
    public final UserSex B2() {
        return UserSex.UNKNOWN;
    }

    @Override // xsna.qtd0
    public final String B3() {
        return this.c;
    }

    public final String Bb() {
        String str = this.d;
        if (!drm0.N(str)) {
            return str;
        }
        int i = a.$EnumSwitchMapping$0[this.f.ordinal()];
        long j = this.b;
        if (i == 1) {
            return "club" + j;
        }
        if (i == 2) {
            return BuildConfig.SDK_BUILD_FLAVOR + j;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return NotificationCompat.CATEGORY_EVENT + j;
    }

    @Override // xsna.qtd0
    public final boolean C6() {
        return (this.h || this.i) ? false : true;
    }

    @Override // xsna.qtd0
    public final ImageList C8() {
        return this.e;
    }

    public final boolean Cb() {
        return this.p > 0;
    }

    @Override // xsna.qtd0
    public final ImageStatus E5() {
        return null;
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

    @Override // xsna.qtd0
    public final boolean N0() {
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.S(this.f.j());
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.S(this.j.h());
        serializer.S(this.k);
        serializer.Y(this.l);
        serializer.S(this.m);
        serializer.j0(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.S(this.p);
        serializer.S(this.q.h());
        serializer.j0(this.r);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.S(this.t.j());
        serializer.j0(this.u);
        GroupDeactivation groupDeactivation = this.v;
        if (groupDeactivation == null) {
            serializer.L((byte) 0);
        } else {
            serializer.L((byte) 1);
            serializer.i0(groupDeactivation);
        }
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.S(this.A.h());
        serializer.S(this.B.h());
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
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
        return this.d;
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
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        return this.b == group.b && epx.f(this.c, group.c) && epx.f(this.d, group.d) && epx.f(this.e, group.e) && this.f == group.f && this.g == group.g && this.h == group.h && this.i == group.i && this.j == group.j && this.k == group.k && this.l == group.l && this.m == group.m && epx.f(this.n, group.n) && this.o == group.o && this.p == group.p && this.q == group.q && epx.f(this.r, group.r) && this.s == group.s && this.t == group.t && epx.f(this.u, group.u) && epx.f(this.v, group.v) && this.w == group.w && this.x == group.x && this.y == group.y && this.z == group.z && this.A == group.A && this.B == group.B && this.C == group.C && this.D == group.D;
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.b);
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
        int a2 = urd0.a((this.t.hashCode() + qoy.b(urd0.a((this.q.hashCode() + shy.a(this.p, qoy.b(urd0.a(shy.a(this.m, bh10.a(shy.a(this.k, (this.j.hashCode() + qoy.b(qoy.b(qoy.b((this.f.hashCode() + fw3.a(urd0.a(urd0.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e.b)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31), 31, this.l), 31), 31, this.n), 31, this.o), 31)) * 31, 31, this.r), 31, this.s)) * 31, 31, this.u);
        GroupDeactivation groupDeactivation = this.v;
        return Boolean.hashCode(this.D) + qoy.b((this.B.hashCode() + ((this.A.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((a2 + (groupDeactivation == null ? 0 : groupDeactivation.hashCode())) * 31, 31, this.w), 31, this.x), 31, this.y), 31, this.z)) * 31)) * 31, 31, this.C);
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
        return !((Pattern) F.getValue()).matcher(this.d).matches();
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
        if (drm0.D(this.u, "https://", false)) {
            return this.u;
        }
        return "https://" + a0a.d + '/' + Bb();
    }

    @Override // xsna.qtd0
    public final OnlineInfo mb() {
        return VisibleStatus.f;
    }

    @Override // xsna.qtd0
    public final String n6() {
        return "https://vk.me/" + Bb();
    }

    @Override // xsna.qtd0
    public final boolean n9() {
        return this.o;
    }

    @Override // xsna.qtd0
    public final String name() {
        return this.c;
    }

    @Override // xsna.qtd0
    public final VerifyInfo q9() {
        return (VerifyInfo) this.E.getValue();
    }

    @Override // xsna.qtd0
    public final boolean r5() {
        return false;
    }

    @Override // xsna.qtd0
    public final long r8() {
        return B7().b;
    }

    @Override // xsna.qtd0
    public final boolean t6() {
        return false;
    }

    @Override // xsna.qtd0
    public final Peer.Type t8() {
        return Peer.Type.GROUP;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Group(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", domain=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.f);
        sb.append(", isVerified=");
        sb.append(this.g);
        sb.append(", canSendMsgToMe=");
        sb.append(this.h);
        sb.append(", canSendNotifyToMe=");
        sb.append(this.i);
        sb.append(", groupStatus=");
        sb.append(this.j);
        sb.append(", answerMinutes=");
        sb.append(this.k);
        sb.append(", syncTime=");
        sb.append(this.l);
        sb.append(", membersCount=");
        sb.append(this.m);
        sb.append(", activity=");
        sb.append(this.n);
        sb.append(", avatarIsNft=");
        sb.append(this.o);
        sb.append(", memberStatus=");
        sb.append(this.p);
        sb.append(", adminLevel=");
        sb.append(this.q);
        sb.append(", description=");
        sb.append(this.r);
        sb.append(", canMessage=");
        sb.append(this.s);
        sb.append(", groupPrivacy=");
        sb.append(this.t);
        sb.append(", url=");
        sb.append(this.u);
        sb.append(", deactivation=");
        sb.append(this.v);
        sb.append(", isPremiumBusiness=");
        sb.append(this.w);
        sb.append(", isConfirmedBusiness=");
        sb.append(this.x);
        sb.append(", isNonProfitOrganization=");
        sb.append(this.y);
        sb.append(", canPostDonut=");
        sb.append(this.z);
        sb.append(", ageLimits=");
        sb.append(this.A);
        sb.append(", warningNotification=");
        sb.append(this.B);
        sb.append(", isNeedShowDonutOnboarding=");
        sb.append(this.C);
        sb.append(", isMonetizationAvailable=");
        return q0.a(sb, this.D, ')');
    }

    @Override // xsna.qtd0
    public final Long v5() {
        return null;
    }

    public Group(long j, String str, String str2, ImageList imageList, GroupType groupType, boolean z, boolean z2, boolean z3, GroupStatus groupStatus, int i, long j2, int i2, String str3, boolean z4, int i3, AdminLevel adminLevel, String str4, boolean z5, GroupPrivacy groupPrivacy, String str5, GroupDeactivation groupDeactivation, boolean z6, boolean z7, boolean z8, boolean z9, AgeLimits ageLimits, WarningNotification warningNotification, boolean z10, boolean z11) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = imageList;
        this.f = groupType;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = groupStatus;
        this.k = i;
        this.l = j2;
        this.m = i2;
        this.n = str3;
        this.o = z4;
        this.p = i3;
        this.q = adminLevel;
        this.r = str4;
        this.s = z5;
        this.t = groupPrivacy;
        this.u = str5;
        this.v = groupDeactivation;
        this.w = z6;
        this.x = z7;
        this.y = z8;
        this.z = z9;
        this.A = ageLimits;
        this.B = warningNotification;
        this.C = z10;
        this.D = z11;
        this.E = new InitializedLazyImpl(new VerifyInfo(z, false, false, z6, z7, z8, 6, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Group(Serializer serializer, zcl zclVar) {
        this(r24, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, false, false, false, r27, r28, WarningNotification.a.a(r2), serializer.m(), serializer.m(), 14680064, null);
        long j;
        GroupDeactivation groupDeactivation;
        long w = serializer.w();
        String H = serializer.H();
        String H2 = serializer.H();
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        GroupType.a aVar = GroupType.Companion;
        int u = serializer.u();
        aVar.getClass();
        GroupType a2 = GroupType.a.a(u);
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        GroupStatus.a aVar2 = GroupStatus.Companion;
        int u2 = serializer.u();
        aVar2.getClass();
        GroupStatus a3 = GroupStatus.a.a(u2);
        int u3 = serializer.u();
        long w2 = serializer.w();
        int u4 = serializer.u();
        String H3 = serializer.H();
        boolean m4 = serializer.m();
        int u5 = serializer.u();
        AdminLevel.a aVar3 = AdminLevel.Companion;
        Integer valueOf = Integer.valueOf(serializer.u());
        aVar3.getClass();
        AdminLevel a4 = AdminLevel.a.a(valueOf);
        String H4 = serializer.H();
        boolean m5 = serializer.m();
        GroupPrivacy.a aVar4 = GroupPrivacy.Companion;
        int u6 = serializer.u();
        aVar4.getClass();
        GroupPrivacy a5 = GroupPrivacy.a.a(u6);
        String H5 = serializer.H();
        if (serializer.m()) {
            j = w;
            groupDeactivation = (GroupDeactivation) serializer.G(GroupDeactivation.class.getClassLoader());
        } else {
            j = w;
            groupDeactivation = null;
        }
        GroupDeactivation groupDeactivation2 = groupDeactivation;
        boolean m6 = serializer.m();
        AgeLimits.a aVar5 = AgeLimits.Companion;
        Integer valueOf2 = Integer.valueOf(serializer.u());
        aVar5.getClass();
        AgeLimits a6 = AgeLimits.a.a(valueOf2);
        WarningNotification.a aVar6 = WarningNotification.Companion;
        int u7 = serializer.u();
        aVar6.getClass();
    }
}
