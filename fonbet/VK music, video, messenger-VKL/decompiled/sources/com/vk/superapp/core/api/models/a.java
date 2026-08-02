package com.vk.superapp.core.api.models;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vk.superapp.core.api.models.ValidationType;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.drm0;
import xsna.epx;
import xsna.fkq0;
import xsna.fw3;
import xsna.gzs;
import xsna.ho8;
import xsna.qoy;
import xsna.s3q0;
import xsna.shy;
import xsna.urd0;
import xsna.wq;

/* compiled from: AuthAnswer.kt */
/* loaded from: classes6.dex */
public final class a {
    public final String A;
    public final String B;
    public final C1876a C;
    public final b D;
    public final BanInfo E;
    public final long F;
    public final String G;
    public final boolean H;
    public final String I;
    public final String J;
    public final int K;
    public final int L;
    public final List<SignUpField> M;
    public final List<SignUpField> N;
    public final SignUpIncompleteFieldsModel O;
    public final boolean P;
    public final String Q;
    public ArrayList<String> R;
    public final ApiErrorViewType S;
    public final String T;
    public final String U;
    public final ValidateInfo V;
    public final SendOtpInfo W;
    public final String a;
    public final String b;
    public final UserId c;
    public final int d;
    public final boolean e;
    public final String f;
    public final UtilityTokens g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final List<String> l;
    public final List<String> m;
    public final String n;
    public final ValidationType o;
    public final ValidationType p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final int y;
    public final long z;

    /* compiled from: AuthAnswer.kt */
    /* renamed from: com.vk.superapp.core.api.models.a$a, reason: collision with other inner class name */
    public static final class C1876a {
        public final String a;
        public final String b;
        public final String c;
        public final Boolean d;
        public final int e;
        public final List<SignUpField> f;
        public final List<SignUpField> g;
        public final SignUpIncompleteFieldsModel h;
        public final boolean i;
        public final String j;
        public final String k;
        public final String l;
        public final int m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final List<String> s;
        public final String t;
        public final String u;
        public final boolean v;
        public final boolean w;
        public final UtilityTokens x;

        public C1876a(String str, String str2, String str3, Boolean bool, int i, ArrayList arrayList, ArrayList arrayList2, SignUpIncompleteFieldsModel signUpIncompleteFieldsModel, boolean z, String str4, String str5, String str6, int i2, String str7, String str8, String str9, String str10, String str11, List list, String str12, String str13, boolean z2, boolean z3, UtilityTokens utilityTokens) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
            this.e = i;
            this.f = arrayList;
            this.g = arrayList2;
            this.h = signUpIncompleteFieldsModel;
            this.i = z;
            this.j = str4;
            this.k = str5;
            this.l = str6;
            this.m = i2;
            this.n = str7;
            this.o = str8;
            this.p = str9;
            this.q = str10;
            this.r = str11;
            this.s = list;
            this.t = str12;
            this.u = str13;
            this.v = z2;
            this.w = z3;
            this.x = utilityTokens;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1876a)) {
                return false;
            }
            C1876a c1876a = (C1876a) obj;
            return epx.f(this.a, c1876a.a) && epx.f(this.b, c1876a.b) && epx.f(this.c, c1876a.c) && epx.f(this.d, c1876a.d) && this.e == c1876a.e && epx.f(this.f, c1876a.f) && epx.f(this.g, c1876a.g) && epx.f(this.h, c1876a.h) && this.i == c1876a.i && epx.f(this.j, c1876a.j) && epx.f(this.k, c1876a.k) && epx.f(this.l, c1876a.l) && this.m == c1876a.m && epx.f(this.n, c1876a.n) && epx.f(this.o, c1876a.o) && epx.f(this.p, c1876a.p) && epx.f(this.q, c1876a.q) && epx.f(this.r, c1876a.r) && epx.f(this.s, c1876a.s) && epx.f(this.t, c1876a.t) && epx.f(this.u, c1876a.u) && this.v == c1876a.v && this.w == c1876a.w && epx.f(this.x, c1876a.x);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.d;
            int a = shy.a(this.e, (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
            List<SignUpField> list = this.f;
            int hashCode4 = (a + (list == null ? 0 : list.hashCode())) * 31;
            List<SignUpField> list2 = this.g;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            SignUpIncompleteFieldsModel signUpIncompleteFieldsModel = this.h;
            return this.x.b.hashCode() + qoy.b(qoy.b(urd0.a(urd0.a(fw3.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(shy.a(this.m, urd0.a(urd0.a(urd0.a(qoy.b((hashCode5 + (signUpIncompleteFieldsModel != null ? signUpIncompleteFieldsModel.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        }

        public final String toString() {
            return "ErrorInfo(accessToken=" + this.a + ", sid=" + this.b + ", phone=" + this.c + ", instant=" + this.d + ", status=" + this.e + ", signUpFields=" + this.f + ", signUpSkippableFields=" + this.g + ", signUpIncompleteFieldsModel=" + this.h + ", signUpAgreementRequired=" + this.i + ", memberName=" + this.j + ", silentToken=" + this.k + ", silentTokenUuid=" + this.l + ", silentTokenTtl=" + this.m + ", firstName=" + this.n + ", lastName=" + this.o + ", photo50=" + this.p + ", photo100=" + this.q + ", photo200=" + this.r + ", domains=" + this.s + ", domain=" + this.t + ", username=" + this.u + ", showAds=" + this.v + ", adsIsOn=" + this.w + ", utilityTokens=" + this.x + ')';
        }
    }

    /* compiled from: AuthAnswer.kt */
    public static final class b {
        public final String a;
        public final int b;
        public final String c;

        public b(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Optional(silentToken=");
            sb.append(this.a);
            sb.append(", silentTokenTtl=");
            sb.append(this.b);
            sb.append(", silentTokenUuid=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public a() {
        this(null, null, null, 0, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0L, null, null, null, null, null, 0L, null, false, null, null, 0, 0, null, null, null, false, null, null, null, null, null, null, -1, 131071);
    }

    public final String a() {
        return this.A;
    }

    public final String b() {
        return this.B;
    }

    public final String c() {
        return this.Q;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.j;
    }

    public final String f() {
        return this.f;
    }

    public final ApiErrorViewType g() {
        return this.S;
    }

    public final void h(ArrayList<String> arrayList) {
        this.R = arrayList;
    }

    public a(String str, String str2, UserId userId, int i, boolean z, String str3, UtilityTokens utilityTokens, String str4, String str5, String str6, int i2, List list, List list2, String str7, ValidationType validationType, ValidationType validationType2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i3, long j, String str16, String str17, C1876a c1876a, b bVar, BanInfo banInfo, long j2, String str18, boolean z2, String str19, String str20, int i4, int i5, ArrayList arrayList, ArrayList arrayList2, SignUpIncompleteFieldsModel signUpIncompleteFieldsModel, boolean z3, String str21, ApiErrorViewType apiErrorViewType, String str22, String str23, ValidateInfo validateInfo, SendOtpInfo sendOtpInfo, int i6, int i7) {
        UtilityTokens utilityTokens2;
        String str24 = (i6 & 1) != 0 ? "" : str;
        String str25 = (i6 & 2) != 0 ? "" : str2;
        UserId userId2 = (i6 & 4) != 0 ? UserId.d : userId;
        int i8 = (i6 & 8) != 0 ? 0 : i;
        boolean z4 = (i6 & 16) != 0 ? true : z;
        String str26 = (i6 & 32) != 0 ? "" : str3;
        if ((i6 & 64) != 0) {
            UtilityTokens.CREATOR.getClass();
            utilityTokens2 = UtilityTokens.c;
        } else {
            utilityTokens2 = utilityTokens;
        }
        String str27 = (i6 & 128) != 0 ? null : str4;
        String str28 = (i6 & 256) != 0 ? "" : str5;
        String str29 = (i6 & 512) != 0 ? "" : str6;
        int i9 = (i6 & 1024) != 0 ? 0 : i2;
        List list3 = (i6 & 2048) != 0 ? EmptyList.b : list;
        List list4 = (i6 & 4096) != 0 ? EmptyList.b : list2;
        String str30 = (i6 & 8192) != 0 ? "" : str7;
        ValidationType validationType3 = (i6 & 16384) != 0 ? ValidationType.URL : validationType;
        ValidationType validationType4 = (i6 & 32768) != 0 ? ValidationType.URL : validationType2;
        String str31 = (i6 & 65536) != 0 ? "" : str8;
        String str32 = (i6 & 131072) != 0 ? null : str9;
        String str33 = (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? "" : str10;
        String str34 = (i6 & 524288) != 0 ? "" : str11;
        String str35 = (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? "" : str12;
        String str36 = (i6 & 2097152) != 0 ? "" : str13;
        String str37 = (i6 & 4194304) != 0 ? "" : str14;
        String str38 = (i6 & 8388608) != 0 ? "" : str15;
        int i10 = (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0 : i3;
        long j3 = (i6 & 33554432) != 0 ? 0L : j;
        String str39 = (i6 & 67108864) != 0 ? "" : str16;
        String str40 = (i6 & 134217728) != 0 ? "" : str17;
        C1876a c1876a2 = (i6 & 268435456) != 0 ? null : c1876a;
        b bVar2 = (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bVar;
        BanInfo banInfo2 = (i6 & 1073741824) != 0 ? null : banInfo;
        long j4 = (i6 & Integer.MIN_VALUE) != 0 ? 0L : j2;
        String str41 = (i7 & 1) != 0 ? "" : str18;
        boolean z5 = (i7 & 2) != 0 ? false : z2;
        String str42 = (i7 & 4) != 0 ? "" : str19;
        String str43 = (i7 & 8) != 0 ? "" : str20;
        int i11 = (i7 & 16) != 0 ? 0 : i4;
        int i12 = (i7 & 32) != 0 ? 0 : i5;
        ArrayList arrayList3 = (i7 & 64) != 0 ? null : arrayList;
        ValidationType validationType5 = validationType4;
        ArrayList arrayList4 = (i7 & 128) != 0 ? null : arrayList2;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel2 = (i7 & 256) != 0 ? null : signUpIncompleteFieldsModel;
        boolean z6 = (i7 & 512) != 0 ? false : z3;
        String str44 = (i7 & 1024) != 0 ? null : str21;
        ApiErrorViewType apiErrorViewType2 = (i7 & 4096) != 0 ? null : apiErrorViewType;
        String str45 = (i7 & 8192) != 0 ? null : str22;
        String str46 = (i7 & 16384) != 0 ? null : str23;
        ValidateInfo validateInfo2 = (i7 & 32768) != 0 ? null : validateInfo;
        SendOtpInfo sendOtpInfo2 = (i7 & 65536) != 0 ? null : sendOtpInfo;
        this.a = str24;
        this.b = str25;
        this.c = userId2;
        this.d = i8;
        this.e = z4;
        this.f = str26;
        this.g = utilityTokens2;
        this.h = str27;
        this.i = str28;
        this.j = str29;
        this.k = i9;
        this.l = list3;
        this.m = list4;
        this.n = str30;
        this.o = validationType3;
        this.p = validationType5;
        this.q = str31;
        this.r = str32;
        this.s = str33;
        this.t = str34;
        this.u = str35;
        this.v = str36;
        this.w = str37;
        this.x = str38;
        this.y = i10;
        this.z = j3;
        this.A = str39;
        this.B = str40;
        this.C = c1876a2;
        this.D = bVar2;
        this.E = banInfo2;
        this.F = j4;
        this.G = str41;
        this.H = z5;
        this.I = str42;
        this.J = str43;
        this.K = i11;
        this.L = i12;
        this.M = arrayList3;
        this.N = arrayList4;
        this.O = signUpIncompleteFieldsModel2;
        this.P = z6;
        this.Q = str44;
        this.R = null;
        this.S = apiErrorViewType2;
        this.T = str45;
        this.U = str46;
        this.V = validateInfo2;
        this.W = sendOtpInfo2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r69v0 */
    /* JADX WARN: Type inference failed for: r69v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r69v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(JSONObject jSONObject) {
        this(r1, r22, r2, r24, r7, r8, r9, r44, r72, r12, r16, r23, r35, r2, r17, r6, r19, r2, r21, r2, r2, r2, r25, r26, r27, r36, r4, r4, r32, r33, r34, r56, r13, r14, r15, r2, r55, r1, r10, r8, r45, r9, r47, r48, r49, r50, r51, r0 != null ? new SendOtpInfo(r0.optInt("status"), r0.optInt("code_length"), r0.optString(r73)) : null, 0, 2048);
        String str;
        String str2;
        ?? r2;
        List list;
        int i;
        EmptyList emptyList;
        String str3;
        String str4;
        String str5;
        String str6;
        C1876a c1876a;
        ValidationType validationType;
        String str7;
        b bVar;
        BanInfo banInfo;
        String str8;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel;
        ApiErrorViewType apiErrorViewType;
        int i2;
        long j;
        String str9;
        ValidateInfo validateInfo;
        String str10;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel2;
        int i3;
        EmptyList emptyList2;
        String optString = jSONObject.optString(SharedKt.PARAM_ACCESS_TOKEN);
        String optString2 = jSONObject.optString("secret");
        long optLong = jSONObject.optLong("user_id");
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId = new UserId(optLong);
        int optInt = jSONObject.optInt(SharedKt.PARAM_EXPIRES_IN);
        boolean f = epx.f(jSONObject.optString("https_required", "1"), "1");
        String optString3 = jSONObject.optString("trusted_hash");
        UtilityTokens.CREATOR.getClass();
        UtilityTokens a = UtilityTokens.a.a(jSONObject);
        String optString4 = jSONObject.has("email_to_actualize") ? jSONObject.optString("email_to_actualize") : null;
        String optString5 = jSONObject.optString("silent_token");
        String optString6 = jSONObject.optString("silent_token_uuid");
        int optInt2 = jSONObject.optInt("silent_token_ttl");
        JSONArray optJSONArray = jSONObject.optJSONArray("provided_hashes");
        if (optJSONArray != null) {
            str = optString;
            r2 = new ArrayList(optJSONArray.length());
            str2 = optString2;
            int i4 = 0;
            for (int length = optJSONArray.length(); i4 < length; length = length) {
                i4 = wq.b(optJSONArray, i4, r2, i4, 1);
            }
        } else {
            str = optString;
            str2 = optString2;
            r2 = EmptyList.b;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("provided_uuids");
        if (optJSONArray2 != null) {
            ?? arrayList = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            list = r2;
            int i5 = 0;
            while (i5 < length2) {
                i5 = wq.b(optJSONArray2, i5, arrayList, i5, 1);
                optInt = optInt;
            }
            i = optInt;
            emptyList = arrayList;
        } else {
            list = r2;
            i = optInt;
            emptyList = EmptyList.b;
        }
        String optString7 = jSONObject.optString("redirect_uri");
        String optString8 = jSONObject.optString("validation_type");
        ValidationType.Companion.getClass();
        ValidationType a2 = ValidationType.a.a(optString8);
        ValidationType a3 = ValidationType.a.a(jSONObject.optString("validation_resend"));
        String optString9 = jSONObject.optString("validation_sid");
        String optString10 = jSONObject.optString("validation_external_id", null);
        String optString11 = jSONObject.optString("phone_mask");
        String optString12 = jSONObject.optString("masked_email");
        String optString13 = jSONObject.optString("error_type");
        String optString14 = jSONObject.optString("email");
        String optString15 = jSONObject.optString("phone");
        String optString16 = jSONObject.optString("device_name");
        int optInt3 = jSONObject.optInt("code_length");
        EmptyList emptyList3 = emptyList;
        long optLong2 = jSONObject.optLong("delay");
        String optString17 = jSONObject.optString("error");
        String optString18 = jSONObject.optString("error_description");
        JSONObject optJSONObject = jSONObject.optJSONObject("info");
        String str11 = optString4;
        if (optJSONObject == null) {
            str3 = "info";
            str4 = optString5;
            str5 = str;
            str6 = optString11;
            c1876a = null;
        } else {
            String optString19 = optJSONObject.optString(SharedKt.PARAM_ACCESS_TOKEN);
            String optString20 = optJSONObject.optString(O6.e1);
            String optString21 = optJSONObject.optString("phone");
            boolean optBoolean = optJSONObject.optBoolean("instant");
            int optInt4 = optJSONObject.optInt("status");
            SignUpField.a aVar = SignUpField.Companion;
            JSONArray optJSONArray3 = optJSONObject.optJSONArray("extend_fields");
            aVar.getClass();
            ArrayList b2 = SignUpField.a.b(optJSONArray3);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("extend_fields_values");
            if (optJSONObject2 != null) {
                Serializer.c<SignUpIncompleteFieldsModel> cVar = SignUpIncompleteFieldsModel.CREATOR;
                signUpIncompleteFieldsModel2 = SignUpIncompleteFieldsModel.a.a(optJSONObject2);
            } else {
                signUpIncompleteFieldsModel2 = null;
            }
            ArrayList b3 = SignUpField.a.b(optJSONObject.optJSONArray("extend_suggested_fields"));
            boolean z = optJSONObject.optInt("should_show_additional_sign_up_agreement") == 1;
            String optString22 = optJSONObject.optString("member_name");
            String optString23 = optJSONObject.optString("silent_token");
            String optString24 = optJSONObject.optString("silent_token_uuid");
            int optInt5 = optJSONObject.optInt("silent_token_ttl");
            String optString25 = optJSONObject.optString("first_name");
            String optString26 = optJSONObject.optString("last_name");
            String optString27 = optJSONObject.optString("photo50");
            String optString28 = optJSONObject.optString("photo100");
            String optString29 = optJSONObject.optString("photo200");
            JSONArray optJSONArray4 = optJSONObject.optJSONArray("domains");
            if (optJSONArray4 == null) {
                str3 = "info";
                str4 = optString5;
                i3 = 1;
                emptyList2 = EmptyList.b;
            } else {
                str4 = optString5;
                ?? arrayList2 = new ArrayList(optJSONArray4.length());
                str3 = "info";
                int i6 = 0;
                for (int length3 = optJSONArray4.length(); i6 < length3; length3 = length3) {
                    i6 = wq.b(optJSONArray4, i6, arrayList2, i6, 1);
                }
                i3 = 1;
                emptyList2 = arrayList2;
            }
            EmptyList emptyList4 = emptyList2;
            String optString30 = optJSONObject.optString(X3.j.D);
            String optString31 = optJSONObject.optString("username");
            ?? r69 = optJSONObject.optInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS) == i3 ? i3 : 0;
            boolean z2 = optJSONObject.optInt("ads_on") == i3;
            UtilityTokens.CREATOR.getClass();
            C1876a c1876a2 = new C1876a(optString19, optString20, optString21, Boolean.valueOf(optBoolean), optInt4, b2, b3, signUpIncompleteFieldsModel2, z, optString22, optString23, optString24, optInt5, optString25, optString26, optString27, optString28, optString29, emptyList4, optString30, optString31, r69, z2, UtilityTokens.a.a(optJSONObject));
            str5 = str;
            str6 = optString11;
            c1876a = c1876a2;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("optional");
        if (optJSONObject3 != null) {
            validationType = a2;
            str7 = optString16;
            bVar = new b(optJSONObject3.optString("silent_token"), optJSONObject3.optInt("silent_token_ttl"), optJSONObject3.optString("silent_token_uuid"));
        } else {
            validationType = a2;
            str7 = optString16;
            bVar = null;
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ban_info");
        if (optJSONObject4 != null) {
            Serializer.c<BanInfo> cVar2 = BanInfo.CREATOR;
            banInfo = BanInfo.a.a(optJSONObject4);
        } else {
            banInfo = null;
        }
        long optLong3 = jSONObject.optLong("restore_request_id");
        String optString32 = jSONObject.optString("restore_hash");
        boolean optBoolean2 = jSONObject.optBoolean("cant_get_code_open_restore");
        String optString33 = jSONObject.optString("webview_access_token");
        String optString34 = jSONObject.optString("webview_refresh_token");
        int optInt6 = jSONObject.optInt("webview_access_token_expires_in");
        String str12 = str5;
        int optInt7 = jSONObject.optInt("webview_refresh_token_expires_in");
        SignUpField.a aVar2 = SignUpField.Companion;
        JSONArray optJSONArray5 = jSONObject.optJSONArray("extend_fields");
        aVar2.getClass();
        ArrayList b4 = SignUpField.a.b(optJSONArray5);
        ArrayList b5 = SignUpField.a.b(jSONObject.optJSONArray("extend_suggested_fields"));
        JSONObject optJSONObject5 = jSONObject.optJSONObject("extend_fields_values");
        if (optJSONObject5 != null) {
            Serializer.c<SignUpIncompleteFieldsModel> cVar3 = SignUpIncompleteFieldsModel.CREATOR;
            str8 = optString9;
            signUpIncompleteFieldsModel = SignUpIncompleteFieldsModel.a.a(optJSONObject5);
        } else {
            str8 = optString9;
            signUpIncompleteFieldsModel = null;
        }
        boolean z3 = jSONObject.optInt("should_show_additional_sign_up_agreement") == 1;
        String optString35 = jSONObject.optString(O6.e1, null);
        String optString36 = jSONObject.optString(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (optString36 != null) {
            ApiErrorViewType.Companion.getClass();
            apiErrorViewType = ApiErrorViewType.a.a(optString36);
        } else {
            apiErrorViewType = null;
        }
        String optString37 = jSONObject.optString("super_app_token");
        String optString38 = jSONObject.optString(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "");
        String str13 = !drm0.N(optString38) ? optString38 : null;
        JSONObject optJSONObject6 = jSONObject.optJSONObject("validate_info");
        if (optJSONObject6 != null) {
            i2 = optInt6;
            boolean optBoolean3 = optJSONObject6.optBoolean("is_email", false);
            String optString39 = optJSONObject6.optString(O6.e1);
            String optString40 = optJSONObject6.optString("remember_hash");
            j = optLong3;
            JSONObject optJSONObject7 = optJSONObject6.optJSONObject("next_step");
            if (optJSONObject7 != null) {
                ValidateInfo validateInfo2 = new ValidateInfo(optBoolean3, optString39, new ValidateInfo.NextStep(optJSONObject7.optString("verification_method"), optJSONObject7.optBoolean("has_another_verification_methods")), optString40);
                str9 = str12;
                str10 = optString37;
                validateInfo = validateInfo2;
            } else {
                throw new IllegalArgumentException("Missing next_step in validate_info");
            }
        } else {
            i2 = optInt6;
            j = optLong3;
            str9 = str12;
            validateInfo = null;
            str10 = optString37;
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("send_otp_info");
    }
}
