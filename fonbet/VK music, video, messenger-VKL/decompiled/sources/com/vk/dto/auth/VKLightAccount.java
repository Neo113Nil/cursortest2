package com.vk.dto.auth;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserSex;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.m6r0;
import xsna.shy;
import xsna.urd0;

/* compiled from: VKLightAccount.kt */
/* loaded from: classes.dex */
public final class VKLightAccount extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VKLightAccount> CREATOR = new b();
    public final UserId b;
    public final UserSex c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final long k;
    public final boolean l;

    /* compiled from: VKLightAccount.kt */
    public static final class a {
        public static VKLightAccount a(m6r0 m6r0Var) {
            return new VKLightAccount(m6r0Var.y(), m6r0Var.w(), m6r0Var.r(), (String) m6r0Var.b(m6r0.o, ""), (String) m6r0Var.a(m6r0.h1), m6r0Var.u(), m6r0Var.k(), m6r0Var.v(), m6r0Var.l(), m6r0Var.x(), m6r0Var.e(m6r0.s1));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VKLightAccount> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VKLightAccount a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            UserSex.a aVar = UserSex.Companion;
            Integer valueOf = Integer.valueOf(serializer.u());
            aVar.getClass();
            return new VKLightAccount(userId, UserSex.a.a(valueOf), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.w(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VKLightAccount[i];
        }
    }

    public VKLightAccount(UserId userId, UserSex userSex, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, boolean z) {
        this.b = userId;
        this.c = userSex;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = i;
        this.k = j;
        this.l = z;
    }

    public static VKLightAccount zb(VKLightAccount vKLightAccount, UserId userId, UserSex userSex, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, int i2) {
        UserId userId2 = (i2 & 1) != 0 ? vKLightAccount.b : userId;
        UserSex userSex2 = (i2 & 2) != 0 ? vKLightAccount.c : userSex;
        String str7 = (i2 & 4) != 0 ? vKLightAccount.d : str;
        String str8 = (i2 & 8) != 0 ? vKLightAccount.e : str2;
        String str9 = (i2 & 16) != 0 ? vKLightAccount.f : str3;
        String str10 = (i2 & 32) != 0 ? vKLightAccount.g : str4;
        String str11 = (i2 & 128) != 0 ? vKLightAccount.i : str6;
        boolean z = vKLightAccount.l;
        vKLightAccount.getClass();
        return new VKLightAccount(userId2, userSex2, str7, str8, str9, str10, str5, str11, i, j, z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c.h());
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.S(this.j);
        serializer.Y(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKLightAccount)) {
            return false;
        }
        VKLightAccount vKLightAccount = (VKLightAccount) obj;
        return epx.f(this.b, vKLightAccount.b) && this.c == vKLightAccount.c && epx.f(this.d, vKLightAccount.d) && epx.f(this.e, vKLightAccount.e) && epx.f(this.f, vKLightAccount.f) && epx.f(this.g, vKLightAccount.g) && epx.f(this.h, vKLightAccount.h) && epx.f(this.i, vKLightAccount.i) && this.j == vKLightAccount.j && this.k == vKLightAccount.k && this.l == vKLightAccount.l;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return Boolean.hashCode(this.l) + bh10.a(shy.a(this.j, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKLightAccount(uid=");
        sb.append(this.b);
        sb.append(", sex=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", birthDate=");
        sb.append(this.e);
        sb.append(", phone=");
        sb.append(this.f);
        sb.append(", photo=");
        sb.append(this.g);
        sb.append(", accessToken=");
        sb.append(this.h);
        sb.append(", secret=");
        sb.append(this.i);
        sb.append(", expiresInSec=");
        sb.append(this.j);
        sb.append(", createdMs=");
        sb.append(this.k);
        sb.append(", photoIsNft=");
        return q0.a(sb, this.l, ')');
    }
}
