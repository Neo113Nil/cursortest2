package com.vk.dto.group;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.api.generated.market.dto.MarketCommunityRatingDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.profile.Donut;
import com.vk.dto.user.UserProfile;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.t230;
import xsna.we7;
import xsna.wtw;
import xsna.z230;

/* loaded from: classes18.dex */
public class Group extends t230 implements wtw, Serializer.StreamParcelable {
    public static final Serializer.c<Group> CREATOR = new a();
    public static final b z0 = new b();
    public String A;

    @Nullable
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public BanInfo J;

    @Nullable
    public ArrayList<UserProfile> K;
    public UserId L;
    public UserProfile M;
    public Group N;
    public String O;
    public boolean P;

    @Nullable
    public Donut Q;

    @Nullable
    public GroupVkTicketDto R;

    @Nullable
    public GroupMarketInfo S;

    @Nullable
    public GroupLikes T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public UserId c;
    public boolean c0;
    public String d;
    public int d0;

    @Deprecated
    public String e;
    public int e0;
    public String f;
    public int f0;

    @Nullable
    @Deprecated
    public Image g;

    @Nullable
    public String g0;
    public String h;
    public boolean h0;
    public boolean i;

    @Nullable
    public Image i0;
    public boolean j;

    @Nullable
    public GroupLeaveMode j0;
    public boolean k;

    @Nullable
    public String k0;
    public boolean l;

    @Nullable
    public MarketCommunityRatingDto l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public String o;
    public boolean o0;
    public int p;
    public boolean p0;
    public int q;
    public boolean q0;
    public int r;
    public boolean r0;
    public int s;
    public boolean s0;
    public boolean t;
    public boolean t0;
    public boolean u;
    public boolean u0;
    public int v;
    public boolean v0;
    public int w;

    @Nullable
    public String w0;
    public String x;
    public GroupsVideoLivesDataDto x0;

    @NonNull
    public final VerifyInfo y;
    public Boolean y0;
    public String z;

    public static class BanInfo implements Serializer.StreamParcelable {
        public static final Serializer.c<BanInfo> CREATOR = new a();
        public String b;
        public int c;
        public int d;

        public class a extends Serializer.c<BanInfo> {
            @Override // com.vk.core.serialize.Serializer.c
            public final BanInfo a(@NonNull Serializer serializer) {
                BanInfo banInfo = new BanInfo();
                banInfo.b = serializer.H();
                banInfo.c = serializer.u();
                banInfo.d = serializer.u();
                return banInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BanInfo[i];
            }
        }

        public BanInfo(String str, int i, int i2) {
            this.b = str;
            this.d = i;
            this.c = i2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c);
            serializer.S(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            Serializer.b.h(this, parcel);
        }
    }

    public class a extends Serializer.c<Group> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Group a(@NonNull Serializer serializer) {
            return new Group(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Group[i];
        }
    }

    public class b extends aay<Group> {
        @Override // xsna.aay
        public final Group a(JSONObject jSONObject) throws JSONException {
            return new Group(jSONObject);
        }
    }

    public Group() {
        UserId userId = UserId.d;
        this.c = userId;
        this.n = 1;
        this.y = new VerifyInfo();
        this.C = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.L = userId;
        this.Z = false;
        this.h0 = false;
        this.m0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.y0 = Boolean.FALSE;
    }

    public final boolean C() {
        return this.m == 2;
    }

    public final void D(boolean z) {
        this.h0 = z;
    }

    @Override // xsna.wtw
    public final boolean E3(String str) {
        return this.d.toLowerCase().contains(str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.S(this.m);
        serializer.S(this.n);
        serializer.j0(this.o);
        serializer.S(this.p);
        serializer.S(this.q);
        serializer.S(this.s);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.S(this.v);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        this.y.O7(serializer);
        serializer.S(this.C);
        serializer.S(this.D ? 1 : 0);
        serializer.S(this.E ? 1 : 0);
        serializer.S(this.F ? 1 : 0);
        serializer.S(this.G ? 1 : 0);
        serializer.S(this.H ? 1 : 0);
        serializer.j0(this.B);
        serializer.i0(this.J);
        serializer.j0(this.O);
        serializer.L(this.P ? (byte) 1 : (byte) 0);
        serializer.i0(this.Q);
        serializer.i0(this.g);
        serializer.i0(this.S);
        serializer.j0(this.x);
        serializer.L(this.U ? (byte) 1 : (byte) 0);
        serializer.L(this.V ? (byte) 1 : (byte) 0);
        serializer.L(this.W ? (byte) 1 : (byte) 0);
        serializer.L(this.X ? (byte) 1 : (byte) 0);
        serializer.L(this.Y ? (byte) 1 : (byte) 0);
        serializer.L(this.a0 ? (byte) 1 : (byte) 0);
        serializer.S(this.d0);
        serializer.S(this.e0);
        serializer.S(this.f0);
        serializer.j0(this.g0);
        serializer.L(this.h0 ? (byte) 1 : (byte) 0);
        serializer.i0(this.i0);
        serializer.L(this.n0 ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        GroupLeaveMode groupLeaveMode = this.j0;
        serializer.j0(groupLeaveMode == null ? null : groupLeaveMode.h());
        serializer.L(this.m0 ? (byte) 1 : (byte) 0);
        serializer.j0(this.k0);
        serializer.L(this.o0 ? (byte) 1 : (byte) 0);
        serializer.L(this.p0 ? (byte) 1 : (byte) 0);
        serializer.L(this.q0 ? (byte) 1 : (byte) 0);
        serializer.L(this.r0 ? (byte) 1 : (byte) 0);
        serializer.L(this.s0 ? (byte) 1 : (byte) 0);
        serializer.e0(this.l0);
        serializer.L(this.u0 ? (byte) 1 : (byte) 0);
        serializer.L(this.v0 ? (byte) 1 : (byte) 0);
        serializer.j0(this.f);
        serializer.j0(this.w0);
        serializer.L(this.c0 ? (byte) 1 : (byte) 0);
        serializer.e0(this.x0);
        serializer.L(this.y0.booleanValue() ? (byte) 1 : (byte) 0);
        serializer.i0(this.R);
        serializer.L(this.Z ? (byte) 1 : (byte) 0);
        serializer.L(this.t0 ? (byte) 1 : (byte) 0);
    }

    public final boolean d() {
        return this.i && this.s >= 3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.i && this.s >= 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Group group = (Group) obj;
            if (Objects.equals(this.c, group.c) && Boolean.valueOf(this.j).equals(Boolean.valueOf(group.j)) && Integer.valueOf(this.C).equals(Integer.valueOf(group.C)) && Objects.equals(this.k0, group.k0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.i && this.s >= 1;
    }

    public final boolean g() {
        return this.h0;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Boolean.valueOf(this.j), Integer.valueOf(this.C));
    }

    public final boolean n() {
        return this.m == 1;
    }

    public final boolean o() {
        return !TextUtils.isEmpty(this.o);
    }

    public final String toString() {
        return this.d;
    }

    public final boolean u() {
        return this.m == 0;
    }

    @Override // xsna.wtw
    public final char[] w7() {
        String[] split = this.d.split(" ");
        char[] cArr = new char[split.length];
        for (int i = 0; i < split.length; i++) {
            String str = split[i];
            int length = str.length();
            if (length != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        char charAt = str.charAt(i2);
                        if (Character.isLetterOrDigit(charAt)) {
                            cArr[i] = Character.toLowerCase(charAt);
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return cArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }

    public Group(Group group) {
        UserId userId = UserId.d;
        this.c = userId;
        this.n = 1;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.y = verifyInfo;
        this.C = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.L = userId;
        this.Z = false;
        this.h0 = false;
        this.m0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.y0 = Boolean.FALSE;
        this.c = group.c;
        this.d = group.d;
        this.f = group.f;
        this.e = group.e;
        this.h = group.h;
        this.i = group.i;
        this.j = group.j;
        this.k = group.k;
        this.m = group.m;
        this.n = group.n;
        this.o = group.o;
        this.p = group.p;
        this.q = group.q;
        this.s = group.s;
        this.t = group.t;
        this.v = group.v;
        this.z = group.z;
        this.A = group.A;
        this.u = group.u;
        verifyInfo.Ab(group.y);
        this.C = group.C;
        this.D = group.D;
        this.E = group.E;
        this.F = group.F;
        this.G = group.G;
        this.H = group.H;
        this.B = group.B;
        this.J = group.J;
        this.L = group.L;
        this.M = group.M;
        this.N = group.N;
        this.O = group.O;
        this.P = group.P;
        this.Q = group.Q;
        this.R = group.R;
        this.g = group.g;
        this.S = group.S;
        this.T = group.T;
        this.x = group.x;
        this.U = group.U;
        this.V = group.V;
        this.W = group.W;
        this.X = group.X;
        this.Y = group.Y;
        this.a0 = group.a0;
        this.d0 = group.d0;
        this.e0 = group.e0;
        this.f0 = group.f0;
        this.g0 = group.g0;
        this.h0 = group.h0;
        this.i0 = group.i0;
        this.n0 = group.n0;
        this.l = group.l;
        this.j0 = group.j0;
        this.m0 = group.m0;
        this.k0 = group.k0;
        this.o0 = group.o0;
        this.p0 = group.p0;
        this.q0 = group.q0;
        this.r0 = group.r0;
        this.s0 = group.s0;
        this.l0 = group.l0;
        this.u0 = group.u0;
        this.v0 = group.v0;
        this.w0 = group.w0;
        this.c0 = group.c0;
        this.x0 = group.x0;
        this.y0 = group.y0;
        this.Z = group.Z;
        this.t0 = group.t0;
    }

    public Group(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ef A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:3:0x005c, B:6:0x0099, B:9:0x00a6, B:12:0x00b3, B:14:0x00c9, B:15:0x00dd, B:18:0x0120, B:21:0x012e, B:23:0x013c, B:24:0x013f, B:26:0x014b, B:27:0x014e, B:29:0x015f, B:30:0x0165, B:32:0x016b, B:36:0x018b, B:38:0x0191, B:40:0x019c, B:42:0x01a2, B:44:0x01c1, B:45:0x01ae, B:48:0x01c4, B:50:0x01ca, B:53:0x01d4, B:55:0x01d6, B:58:0x01e2, B:61:0x01ef, B:64:0x0212, B:66:0x0225, B:67:0x0248, B:69:0x0267, B:70:0x026f, B:73:0x027c, B:76:0x0288, B:77:0x02a5, B:79:0x02ad, B:80:0x02b7, B:82:0x02bf, B:84:0x02cc, B:86:0x02f4, B:90:0x0300, B:93:0x030d, B:95:0x035f, B:96:0x0365, B:98:0x036d, B:100:0x0375, B:102:0x037b, B:105:0x0387, B:107:0x0390, B:109:0x03ef, B:110:0x0401, B:112:0x0428, B:113:0x043a, B:115:0x0442, B:116:0x0448, B:118:0x044e, B:120:0x0458, B:123:0x0465, B:127:0x02c5, B:134:0x00d6), top: B:2:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0428 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:3:0x005c, B:6:0x0099, B:9:0x00a6, B:12:0x00b3, B:14:0x00c9, B:15:0x00dd, B:18:0x0120, B:21:0x012e, B:23:0x013c, B:24:0x013f, B:26:0x014b, B:27:0x014e, B:29:0x015f, B:30:0x0165, B:32:0x016b, B:36:0x018b, B:38:0x0191, B:40:0x019c, B:42:0x01a2, B:44:0x01c1, B:45:0x01ae, B:48:0x01c4, B:50:0x01ca, B:53:0x01d4, B:55:0x01d6, B:58:0x01e2, B:61:0x01ef, B:64:0x0212, B:66:0x0225, B:67:0x0248, B:69:0x0267, B:70:0x026f, B:73:0x027c, B:76:0x0288, B:77:0x02a5, B:79:0x02ad, B:80:0x02b7, B:82:0x02bf, B:84:0x02cc, B:86:0x02f4, B:90:0x0300, B:93:0x030d, B:95:0x035f, B:96:0x0365, B:98:0x036d, B:100:0x0375, B:102:0x037b, B:105:0x0387, B:107:0x0390, B:109:0x03ef, B:110:0x0401, B:112:0x0428, B:113:0x043a, B:115:0x0442, B:116:0x0448, B:118:0x044e, B:120:0x0458, B:123:0x0465, B:127:0x02c5, B:134:0x00d6), top: B:2:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0442 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:3:0x005c, B:6:0x0099, B:9:0x00a6, B:12:0x00b3, B:14:0x00c9, B:15:0x00dd, B:18:0x0120, B:21:0x012e, B:23:0x013c, B:24:0x013f, B:26:0x014b, B:27:0x014e, B:29:0x015f, B:30:0x0165, B:32:0x016b, B:36:0x018b, B:38:0x0191, B:40:0x019c, B:42:0x01a2, B:44:0x01c1, B:45:0x01ae, B:48:0x01c4, B:50:0x01ca, B:53:0x01d4, B:55:0x01d6, B:58:0x01e2, B:61:0x01ef, B:64:0x0212, B:66:0x0225, B:67:0x0248, B:69:0x0267, B:70:0x026f, B:73:0x027c, B:76:0x0288, B:77:0x02a5, B:79:0x02ad, B:80:0x02b7, B:82:0x02bf, B:84:0x02cc, B:86:0x02f4, B:90:0x0300, B:93:0x030d, B:95:0x035f, B:96:0x0365, B:98:0x036d, B:100:0x0375, B:102:0x037b, B:105:0x0387, B:107:0x0390, B:109:0x03ef, B:110:0x0401, B:112:0x0428, B:113:0x043a, B:115:0x0442, B:116:0x0448, B:118:0x044e, B:120:0x0458, B:123:0x0465, B:127:0x02c5, B:134:0x00d6), top: B:2:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0465 A[Catch: Exception -> 0x00d3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d3, blocks: (B:3:0x005c, B:6:0x0099, B:9:0x00a6, B:12:0x00b3, B:14:0x00c9, B:15:0x00dd, B:18:0x0120, B:21:0x012e, B:23:0x013c, B:24:0x013f, B:26:0x014b, B:27:0x014e, B:29:0x015f, B:30:0x0165, B:32:0x016b, B:36:0x018b, B:38:0x0191, B:40:0x019c, B:42:0x01a2, B:44:0x01c1, B:45:0x01ae, B:48:0x01c4, B:50:0x01ca, B:53:0x01d4, B:55:0x01d6, B:58:0x01e2, B:61:0x01ef, B:64:0x0212, B:66:0x0225, B:67:0x0248, B:69:0x0267, B:70:0x026f, B:73:0x027c, B:76:0x0288, B:77:0x02a5, B:79:0x02ad, B:80:0x02b7, B:82:0x02bf, B:84:0x02cc, B:86:0x02f4, B:90:0x0300, B:93:0x030d, B:95:0x035f, B:96:0x0365, B:98:0x036d, B:100:0x0375, B:102:0x037b, B:105:0x0387, B:107:0x0390, B:109:0x03ef, B:110:0x0401, B:112:0x0428, B:113:0x043a, B:115:0x0442, B:116:0x0448, B:118:0x044e, B:120:0x0458, B:123:0x0465, B:127:0x02c5, B:134:0x00d6), top: B:2:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035f A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:3:0x005c, B:6:0x0099, B:9:0x00a6, B:12:0x00b3, B:14:0x00c9, B:15:0x00dd, B:18:0x0120, B:21:0x012e, B:23:0x013c, B:24:0x013f, B:26:0x014b, B:27:0x014e, B:29:0x015f, B:30:0x0165, B:32:0x016b, B:36:0x018b, B:38:0x0191, B:40:0x019c, B:42:0x01a2, B:44:0x01c1, B:45:0x01ae, B:48:0x01c4, B:50:0x01ca, B:53:0x01d4, B:55:0x01d6, B:58:0x01e2, B:61:0x01ef, B:64:0x0212, B:66:0x0225, B:67:0x0248, B:69:0x0267, B:70:0x026f, B:73:0x027c, B:76:0x0288, B:77:0x02a5, B:79:0x02ad, B:80:0x02b7, B:82:0x02bf, B:84:0x02cc, B:86:0x02f4, B:90:0x0300, B:93:0x030d, B:95:0x035f, B:96:0x0365, B:98:0x036d, B:100:0x0375, B:102:0x037b, B:105:0x0387, B:107:0x0390, B:109:0x03ef, B:110:0x0401, B:112:0x0428, B:113:0x043a, B:115:0x0442, B:116:0x0448, B:118:0x044e, B:120:0x0458, B:123:0x0465, B:127:0x02c5, B:134:0x00d6), top: B:2:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Group(JSONObject jSONObject, @Nullable Map<UserId, UserProfile> map) {
        boolean z;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        UserId userId = UserId.d;
        this.c = userId;
        this.n = 1;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.y = verifyInfo;
        this.C = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.L = userId;
        this.Z = false;
        this.h0 = false;
        this.m0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.y0 = Boolean.FALSE;
        try {
            float b2 = z230.b.b();
            boolean z2 = z230.a;
            this.c = new UserId(jSONObject.getLong("id"));
            this.d = jSONObject.getString("name");
            this.h = jSONObject.optString("screen_name");
            this.z = jSONObject.optString("activity");
            this.i = jSONObject.optInt("is_admin", 0) > 0;
            this.j = jSONObject.optInt("is_member", 0) > 0;
            this.k = jSONObject.optInt("is_favorite", 0) > 0;
            this.s = jSONObject.optInt("admin_level");
            this.m = jSONObject.optInt("is_closed");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("wall");
            if (optJSONObject2 != null) {
                this.n = optJSONObject2.optInt("value", 1);
            } else {
                this.n = jSONObject.optInt("wall", 1);
            }
            this.o = jSONObject.optString("deactivated");
            this.f = jSONObject.optString("photo_base");
            this.e = we7.q(jSONObject, b2, z2);
            Serializer.c<Image> cVar = Image.CREATOR;
            this.g = Image.b.b(jSONObject);
            this.p = 0;
            this.q = jSONObject.optInt("start_date");
            this.r = jSONObject.optInt("finish_date");
            this.s = jSONObject.optInt("admin_level");
            this.t = jSONObject.optInt("can_message", 1) == 1;
            this.u = jSONObject.optInt("is_messages_blocked", 0) != 0;
            if (NotificationCompat.CATEGORY_EVENT.equals(jSONObject.optString("type"))) {
                this.p = 1;
            }
            if ("page".equals(jSONObject.optString("type"))) {
                this.p = 2;
            }
            this.v = jSONObject.optInt("members_count");
            verifyInfo.Bb(jSONObject);
            if (jSONObject.has("member_status")) {
                this.C = jSONObject.getInt("member_status");
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("friends");
            if (optJSONObject3 != null) {
                this.w = optJSONObject3.optInt("count");
                this.K = new ArrayList<>();
                JSONArray optJSONArray3 = optJSONObject3.optJSONArray("preview_profiles");
                JSONArray optJSONArray4 = optJSONObject3.optJSONArray("preview");
                if (optJSONArray3 != null && optJSONArray4 != null) {
                    for (int i = 0; i < optJSONArray3.length(); i++) {
                        long j = optJSONArray4.getLong(i);
                        UserId userId2 = new UserId(j);
                        if (map != null && map.containsKey(userId2)) {
                            this.K.add(map.get(userId2));
                        } else {
                            JSONObject jSONObject2 = optJSONArray3.getJSONObject(i);
                            jSONObject2.put("id", j);
                            this.K.add(new UserProfile(jSONObject2, UserProfile.ObjectType.PROFILE));
                        }
                    }
                }
            }
            if (jSONObject.has("is_video_live_notifications_blocked")) {
                this.D = jSONObject.getInt("is_video_live_notifications_blocked") == 1;
            }
            this.E = jSONObject.optInt("can_upload_story", 0) > 0;
            this.F = jSONObject.optInt("can_upload_clip", 0) > 0;
            this.G = jSONObject.optBoolean("using_vkpay_market_app", false);
            this.H = jSONObject.optBoolean("has_market_app", false);
            jSONObject.optBoolean("is_market_cart_enabled", false);
            this.I = jSONObject.optInt("msg_push_allowed", 0) == 1;
            this.B = jSONObject.optString("status", null);
            if (jSONObject.has("ban_info")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("ban_info");
                BanInfo banInfo = new BanInfo();
                banInfo.b = jSONObject3.optString("comment");
                banInfo.d = jSONObject3.optInt("reason");
                banInfo.c = jSONObject3.optInt("end_date");
                this.J = banInfo;
            }
            this.L = new UserId(jSONObject.optLong("invited_by", 0L));
            this.O = jSONObject.optString("track_code");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("donut");
            if (optJSONObject4 != null) {
                Serializer.c<Donut> cVar2 = Donut.CREATOR;
                this.Q = Donut.a.a(optJSONObject4);
            }
            this.P = jSONObject.optInt("can_post_donut", 0) == 1;
            JSONObject optJSONObject5 = jSONObject.optJSONObject("vk_ticket");
            if (optJSONObject5 != null) {
                this.R = new GroupVkTicketDto(optJSONObject5.optString("title"), optJSONObject5.optString("description"), optJSONObject5.optString("url"), optJSONObject5.optBoolean("is_onboarding_enabled"));
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("market");
            if (optJSONObject6 != null) {
                this.S = (GroupMarketInfo) GroupMarketInfo.j.a(optJSONObject6);
            }
            if (jSONObject.has("like") || jSONObject.has("friends")) {
                this.T = new GroupLikes(jSONObject, map);
            }
            this.x = jSONObject.optString("members_count_text");
            this.U = jSONObject.optBoolean("has_unseen_stories", false);
            this.V = jSONObject.optBoolean("is_government_organization");
            int optInt = jSONObject.optInt("trust_mark", 0);
            if (optInt != GroupsGroupFullDto.TrustMarkDto.IS_NCO_ORGANIZATION.i() && optInt != GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS.i()) {
                z = false;
                this.W = z;
                this.X = optInt != GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS.i();
                this.Y = jSONObject.optBoolean("is_business_category");
                this.Z = jSONObject.optString("is_business").equals("1");
                this.t0 = jSONObject.optBoolean("is_market_enabled");
                this.a0 = jSONObject.optBoolean("is_market_online_booking_setting_enabled");
                this.b0 = jSONObject.optBoolean("has_group_channel");
                this.d0 = jSONObject.optInt("clips_count", 0);
                this.e0 = jSONObject.optInt("age_mark", 1);
                this.f0 = jSONObject.optInt("age_limits", 1);
                if (jSONObject.has("photo_avg_color")) {
                    this.g0 = jSONObject.getString("photo_avg_color");
                }
                optJSONObject = jSONObject.optJSONObject("cover");
                if (optJSONObject != null && (optJSONArray2 = optJSONObject.optJSONArray("images")) != null && optJSONArray2.length() > 0) {
                    this.h0 = optJSONObject.optInt("enabled", 0) == 0;
                    this.i0 = new Image(optJSONArray2);
                }
                this.n0 = jSONObject.optBoolean("is_nft_photo");
                this.l = jSONObject.optBoolean("video_lives_streaming_banned");
                String optString = jSONObject.optString("leave_mode");
                GroupLeaveMode.Companion.getClass();
                this.j0 = GroupLeaveMode.a.a(optString);
                this.m0 = jSONObject.optBoolean("has_live_cover");
                this.k0 = jSONObject.optString("video_notifications_status");
                this.o0 = jSONObject.optBoolean("suggest_subscribe");
                this.p0 = jSONObject.optBoolean("is_market_online_booking_action_button_enabled");
                this.q0 = jSONObject.optBoolean("is_market_online_booking_setting_enabled");
                this.r0 = jSONObject.optBoolean("is_market_message_to_bc_attachment_enabled");
                this.s0 = jSONObject.optBoolean("is_market_market_link_attachment_enabled");
                if (jSONObject.has(CampaignEx.JSON_KEY_STAR)) {
                    this.l0 = (MarketCommunityRatingDto) GsonHolder.a().fromJson(jSONObject.optString(CampaignEx.JSON_KEY_STAR), MarketCommunityRatingDto.class);
                }
                this.u0 = jSONObject.optBoolean("co_ownership_enabled", false);
                this.v0 = jSONObject.optBoolean("is_video_subscription_hidden");
                this.w0 = jSONObject.optString("url");
                this.c0 = jSONObject.optBoolean("is_binding_to_yclients_service_enabled");
                if (jSONObject.has("video_lives_data")) {
                    this.x0 = (GroupsVideoLivesDataDto) GsonHolder.a().fromJson(jSONObject.optString("video_lives_data"), GroupsVideoLivesDataDto.class);
                }
                optJSONArray = jSONObject.optJSONArray("enabled_features");
                if (optJSONArray == null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        arrayList.add(optJSONArray.optString(i2));
                    }
                    this.y0 = Boolean.valueOf(arrayList.contains("admin_receive_monetization_payouts"));
                    return;
                }
                this.y0 = Boolean.FALSE;
                return;
            }
            z = true;
            this.W = z;
            this.X = optInt != GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS.i();
            this.Y = jSONObject.optBoolean("is_business_category");
            this.Z = jSONObject.optString("is_business").equals("1");
            this.t0 = jSONObject.optBoolean("is_market_enabled");
            this.a0 = jSONObject.optBoolean("is_market_online_booking_setting_enabled");
            this.b0 = jSONObject.optBoolean("has_group_channel");
            this.d0 = jSONObject.optInt("clips_count", 0);
            this.e0 = jSONObject.optInt("age_mark", 1);
            this.f0 = jSONObject.optInt("age_limits", 1);
            if (jSONObject.has("photo_avg_color")) {
            }
            optJSONObject = jSONObject.optJSONObject("cover");
            if (optJSONObject != null) {
                this.h0 = optJSONObject.optInt("enabled", 0) == 0;
                this.i0 = new Image(optJSONArray2);
            }
            this.n0 = jSONObject.optBoolean("is_nft_photo");
            this.l = jSONObject.optBoolean("video_lives_streaming_banned");
            String optString2 = jSONObject.optString("leave_mode");
            GroupLeaveMode.Companion.getClass();
            this.j0 = GroupLeaveMode.a.a(optString2);
            this.m0 = jSONObject.optBoolean("has_live_cover");
            this.k0 = jSONObject.optString("video_notifications_status");
            this.o0 = jSONObject.optBoolean("suggest_subscribe");
            this.p0 = jSONObject.optBoolean("is_market_online_booking_action_button_enabled");
            this.q0 = jSONObject.optBoolean("is_market_online_booking_setting_enabled");
            this.r0 = jSONObject.optBoolean("is_market_message_to_bc_attachment_enabled");
            this.s0 = jSONObject.optBoolean("is_market_market_link_attachment_enabled");
            if (jSONObject.has(CampaignEx.JSON_KEY_STAR)) {
            }
            this.u0 = jSONObject.optBoolean("co_ownership_enabled", false);
            this.v0 = jSONObject.optBoolean("is_video_subscription_hidden");
            this.w0 = jSONObject.optString("url");
            this.c0 = jSONObject.optBoolean("is_binding_to_yclients_service_enabled");
            if (jSONObject.has("video_lives_data")) {
            }
            optJSONArray = jSONObject.optJSONArray("enabled_features");
            if (optJSONArray == null) {
            }
        } catch (Exception e) {
            L.B("vk", "Error parsing group", e);
        }
    }

    public Group(@NonNull Owner owner) {
        UserId userId = UserId.d;
        this.c = userId;
        this.n = 1;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.y = verifyInfo;
        this.C = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.L = userId;
        this.Z = false;
        this.h0 = false;
        this.m0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.y0 = Boolean.FALSE;
        this.c = owner.b;
        this.d = owner.c;
        verifyInfo.Ab(owner.f);
        this.f = owner.d;
        this.e = owner.e;
        this.g = owner.g;
        this.n0 = owner.i(1024);
        this.j = owner.i(4);
        if (owner.i(4)) {
            this.C = 1;
        } else {
            this.C = 0;
        }
        this.i = owner.i(2);
        this.m = owner.i(16) ? 1 : 0;
        this.w0 = owner.v;
    }

    public Group(Serializer serializer) {
        UserId userId = UserId.d;
        this.c = userId;
        this.n = 1;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.y = verifyInfo;
        this.C = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.L = userId;
        this.Z = false;
        this.h0 = false;
        this.m0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.y0 = Boolean.FALSE;
        this.c = (UserId) serializer.A(UserId.class.getClassLoader());
        this.d = serializer.H();
        this.e = serializer.H();
        this.h = serializer.H();
        this.i = serializer.p() != 0;
        this.j = serializer.p() != 0;
        this.k = serializer.p() != 0;
        this.m = serializer.u();
        this.n = serializer.u();
        this.o = serializer.H();
        this.p = serializer.u();
        this.q = serializer.u();
        this.s = serializer.u();
        this.t = serializer.p() != 0;
        this.v = serializer.u();
        this.z = serializer.H();
        this.A = serializer.H();
        this.u = serializer.p() != 0;
        verifyInfo.zb(serializer);
        this.C = serializer.u();
        this.D = serializer.u() == 1;
        this.E = serializer.u() == 1;
        this.F = serializer.u() == 1;
        this.G = serializer.u() == 1;
        this.H = serializer.u() == 1;
        this.B = serializer.H();
        this.J = (BanInfo) serializer.G(BanInfo.class.getClassLoader());
        this.O = serializer.H();
        this.P = serializer.m();
        this.Q = (Donut) serializer.G(Donut.class.getClassLoader());
        this.g = (Image) serializer.G(Image.class.getClassLoader());
        this.S = (GroupMarketInfo) serializer.G(GroupMarketInfo.class.getClassLoader());
        this.x = serializer.H();
        this.U = serializer.m();
        this.V = serializer.m();
        this.W = serializer.m();
        this.X = serializer.m();
        this.Y = serializer.m();
        this.a0 = serializer.m();
        this.d0 = serializer.u();
        this.e0 = serializer.u();
        this.f0 = serializer.u();
        this.g0 = serializer.H();
        this.h0 = serializer.m();
        this.i0 = (Image) serializer.G(Image.class.getClassLoader());
        this.n0 = serializer.m();
        this.l = serializer.m();
        String H = serializer.H();
        GroupLeaveMode.Companion.getClass();
        this.j0 = GroupLeaveMode.a.a(H);
        this.m0 = serializer.m();
        this.k0 = serializer.H();
        this.o0 = serializer.m();
        this.p0 = serializer.m();
        this.q0 = serializer.m();
        this.r0 = serializer.m();
        this.s0 = serializer.m();
        this.l0 = (MarketCommunityRatingDto) serializer.A(MarketCommunityRatingDto.class.getClassLoader());
        this.u0 = serializer.m();
        this.v0 = serializer.m();
        this.f = serializer.H();
        this.w0 = serializer.H();
        this.c0 = serializer.m();
        this.x0 = (GroupsVideoLivesDataDto) serializer.A(GroupsVideoLivesDataDto.class.getClassLoader());
        this.y0 = Boolean.valueOf(serializer.m());
        this.R = (GroupVkTicketDto) serializer.G(GroupVkTicketDto.class.getClassLoader());
        this.Z = serializer.m();
        this.t0 = serializer.m();
    }
}
