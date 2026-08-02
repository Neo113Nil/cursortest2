package com.vk.superapp.multiaccount.api;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.multiaccount.api.AgeGroup;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.fkq0;
import xsna.shy;
import xsna.tn;
import xsna.urd0;

/* compiled from: MultiAccountSwitcherInfo.kt */
/* loaded from: classes6.dex */
public final class g implements bxx {
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final Boolean h;
    public final Boolean i;
    public final Integer j;
    public final Boolean k;
    public final AgeGroup l;
    public final AccountProfileType m;
    public final UserId n;
    public final Boolean o;

    public g(UserId userId, String str, String str2, String str3, String str4, int i, Boolean bool, Boolean bool2, Integer num, Boolean bool3, AgeGroup ageGroup, AccountProfileType accountProfileType, UserId userId2, Boolean bool4) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = bool;
        this.i = bool2;
        this.j = num;
        this.k = bool3;
        this.l = ageGroup;
        this.m = accountProfileType;
        this.n = userId2;
        this.o = bool4;
    }

    public static g a(g gVar, int i) {
        UserId userId = gVar.b;
        String str = gVar.c;
        String str2 = gVar.d;
        String str3 = gVar.e;
        String str4 = gVar.f;
        Boolean bool = gVar.h;
        Boolean bool2 = gVar.i;
        Integer num = gVar.j;
        Boolean bool3 = gVar.k;
        AgeGroup ageGroup = gVar.l;
        AccountProfileType accountProfileType = gVar.m;
        UserId userId2 = gVar.n;
        Boolean bool4 = gVar.o;
        gVar.getClass();
        return new g(userId, str, str2, str3, str4, i, bool, bool2, num, bool3, ageGroup, accountProfileType, userId2, bool4);
    }

    public final AccountProfileType b() {
        return this.m;
    }

    public final UserId c() {
        return this.b;
    }

    public final boolean d() {
        return this.l != AgeGroup.NO_AGE_GROUP;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject putOpt = new JSONObject().put("user_id", this.b.b).put("name", this.c).putOpt("avatar", this.d).putOpt("phone", this.e).putOpt("email", this.f).put("counter", 0).putOpt("is_verified", this.h).putOpt("is_celebrity", this.i).putOpt("account_security_level", this.j).putOpt("is_nft", this.k).putOpt("age", Integer.valueOf(this.l.h())).putOpt("account_profile_code", Integer.valueOf(this.m.h()));
        UserId userId = this.n;
        return putOpt.putOpt("master_account_id", userId != null ? Long.valueOf(userId.b) : null).putOpt("is_gray_account", this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && epx.f(this.f, gVar.f) && this.g == gVar.g && epx.f(this.h, gVar.h) && epx.f(this.i, gVar.i) && epx.f(this.j, gVar.j) && epx.f(this.k, gVar.k) && this.l == gVar.l && this.m == gVar.m && epx.f(this.n, gVar.n) && epx.f(this.o, gVar.o);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int a2 = shy.a(this.g, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Boolean bool = this.h;
        int hashCode2 = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.j;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.k;
        int hashCode5 = (this.m.hashCode() + ((this.l.hashCode() + ((hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31)) * 31)) * 31;
        UserId userId = this.n;
        int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool4 = this.o;
        return hashCode6 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiAccountUserData(userId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", avatar=");
        sb.append(this.d);
        sb.append(", phone=");
        sb.append(this.e);
        sb.append(", email=");
        sb.append(this.f);
        sb.append(", counter=");
        sb.append(this.g);
        sb.append(", isVerified=");
        sb.append(this.h);
        sb.append(", isCelebrity=");
        sb.append(this.i);
        sb.append(", accountSecurityLevel=");
        sb.append(this.j);
        sb.append(", isNft=");
        sb.append(this.k);
        sb.append(", ageGroup=");
        sb.append(this.l);
        sb.append(", accountProfileType=");
        sb.append(this.m);
        sb.append(", masterAccountId=");
        sb.append(this.n);
        sb.append(", isGrayAccount=");
        return tn.a(sb, this.o, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(JSONObject jSONObject) {
        this(r1, r2, r3, r4, r5, r6, r8, r9, r7, r10, r11, r12, fkq0.c(r13) ? r13 : null, Boolean.valueOf(jSONObject.optBoolean("is_gray_account")));
        UserId userId = new UserId(jSONObject.optLong("user_id"));
        String optString = jSONObject.optString("name");
        String optString2 = jSONObject.optString("avatar");
        String optString3 = jSONObject.optString("phone");
        String optString4 = jSONObject.optString("email");
        int optInt = jSONObject.optInt("counter", 0);
        Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("is_verified", false));
        Boolean valueOf2 = Boolean.valueOf(jSONObject.optBoolean("is_celebrity", false));
        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("account_security_level", 0));
        Boolean valueOf4 = Boolean.valueOf(jSONObject.optBoolean("is_nft"));
        AgeGroup.a aVar = AgeGroup.Companion;
        Integer valueOf5 = Integer.valueOf(jSONObject.optInt("age", -1));
        aVar.getClass();
        AgeGroup a = AgeGroup.a.a(valueOf5);
        AccountProfileType.a aVar2 = AccountProfileType.Companion;
        Integer valueOf6 = Integer.valueOf(jSONObject.optInt("account_profile_code"));
        aVar2.getClass();
        AccountProfileType a2 = AccountProfileType.a.a(valueOf6);
        a2 = a2 == null ? AccountProfileType.NORMAL : a2;
        UserId userId2 = new UserId(jSONObject.optLong("master_account_id", 0L));
    }
}
