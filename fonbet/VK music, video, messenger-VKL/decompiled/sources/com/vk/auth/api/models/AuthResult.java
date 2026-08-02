package com.vk.auth.api.models;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.auth.AuthPayload;
import com.vk.superapp.api.dto.auth.AuthTarget;
import com.vk.superapp.api.dto.auth.PersonalData;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import java.io.Serializable;
import java.util.ArrayList;
import xsna.bh10;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: AuthResult.kt */
/* loaded from: classes15.dex */
public final class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new a();
    public final String b;
    public final String c;
    public final UserId d;
    public final boolean e;
    public final int f;
    public final String g;
    public final VkAuthCredentials h;
    public final String i;
    public final String j;
    public final int k;
    public final ArrayList<String> l;
    public final int m;
    public final AuthPayload n;
    public final AuthTarget o;
    public final PersonalData p;
    public final long q;
    public final Bundle r;
    public final UtilityTokens s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;

    /* compiled from: AuthResult.kt */
    public static final class a implements Parcelable.Creator<AuthResult> {
        @Override // android.os.Parcelable.Creator
        public final AuthResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            boolean z2 = z;
            String readString3 = parcel.readString();
            VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) parcel.readParcelable(VkAuthCredentials.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt2 = parcel.readInt();
            Serializable readSerializable = parcel.readSerializable();
            ArrayList arrayList = readSerializable instanceof ArrayList ? (ArrayList) readSerializable : null;
            int readInt3 = parcel.readInt();
            AuthPayload authPayload = (AuthPayload) parcel.readParcelable(AuthPayload.class.getClassLoader());
            AuthTarget authTarget = (AuthTarget) parcel.readParcelable(AuthTarget.class.getClassLoader());
            PersonalData personalData = (PersonalData) parcel.readParcelable(PersonalData.class.getClassLoader());
            ArrayList arrayList2 = arrayList;
            long readLong = parcel.readLong();
            Bundle bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
            UtilityTokens utilityTokens = (UtilityTokens) parcel.readParcelable(UtilityTokens.class.getClassLoader());
            if (utilityTokens == null) {
                UtilityTokens.CREATOR.getClass();
                utilityTokens = UtilityTokens.c;
            }
            return new AuthResult(readString, readString2, userId, z2, readInt, readString3, vkAuthCredentials, readString4, readString5, readInt2, arrayList2, readInt3, authPayload, authTarget, personalData, readLong, bundle, utilityTokens, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthResult[] newArray(int i) {
            return new AuthResult[i];
        }
    }

    public AuthResult(String str, String str2, UserId userId, boolean z, int i, String str3, VkAuthCredentials vkAuthCredentials, String str4, String str5, int i2, ArrayList<String> arrayList, int i3, AuthPayload authPayload, AuthTarget authTarget, PersonalData personalData, long j, Bundle bundle, UtilityTokens utilityTokens, String str6, String str7, String str8, String str9, String str10) {
        this.b = str;
        this.c = str2;
        this.d = userId;
        this.e = z;
        this.f = i;
        this.g = str3;
        this.h = vkAuthCredentials;
        this.i = str4;
        this.j = str5;
        this.k = i2;
        this.l = arrayList;
        this.m = i3;
        this.n = authPayload;
        this.o = authTarget;
        this.p = personalData;
        this.q = j;
        this.r = bundle;
        this.s = utilityTokens;
        this.t = str6;
        this.u = str7;
        this.v = str8;
        this.w = str9;
        this.x = str10;
    }

    public static AuthResult a(AuthResult authResult, String str, VkAuthCredentials vkAuthCredentials, AuthPayload authPayload, AuthTarget authTarget, long j, Bundle bundle, String str2, int i) {
        String str3;
        long j2;
        String str4 = authResult.b;
        String str5 = authResult.c;
        UserId userId = authResult.d;
        boolean z = authResult.e;
        int i2 = authResult.f;
        String str6 = (i & 32) != 0 ? authResult.g : str;
        VkAuthCredentials vkAuthCredentials2 = (i & 64) != 0 ? authResult.h : vkAuthCredentials;
        String str7 = authResult.i;
        String str8 = str6;
        VkAuthCredentials vkAuthCredentials3 = vkAuthCredentials2;
        String str9 = authResult.j;
        int i3 = authResult.k;
        ArrayList<String> arrayList = authResult.l;
        int i4 = authResult.m;
        AuthPayload authPayload2 = (i & 4096) != 0 ? authResult.n : authPayload;
        AuthTarget authTarget2 = (i & 8192) != 0 ? authResult.o : authTarget;
        PersonalData personalData = authResult.p;
        if ((i & 32768) != 0) {
            str3 = str5;
            j2 = authResult.q;
        } else {
            str3 = str5;
            j2 = j;
        }
        long j3 = j2;
        Bundle bundle2 = (i & 65536) != 0 ? authResult.r : bundle;
        UtilityTokens utilityTokens = authResult.s;
        String str10 = authResult.t;
        String str11 = authResult.u;
        String str12 = authResult.v;
        String str13 = authResult.w;
        String str14 = (i & 4194304) != 0 ? authResult.x : str2;
        authResult.getClass();
        return new AuthResult(str4, str3, userId, z, i2, str8, vkAuthCredentials3, str7, str9, i3, arrayList, i4, authPayload2, authTarget2, personalData, j3, bundle2, utilityTokens, str10, str11, str12, str13, str14);
    }

    public final String B() {
        return this.g;
    }

    public final UtilityTokens C() {
        return this.s;
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VkAuthCredentials e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthResult)) {
            return false;
        }
        AuthResult authResult = (AuthResult) obj;
        return epx.f(this.b, authResult.b) && epx.f(this.c, authResult.c) && epx.f(this.d, authResult.d) && this.e == authResult.e && this.f == authResult.f && epx.f(this.g, authResult.g) && epx.f(this.h, authResult.h) && epx.f(this.i, authResult.i) && epx.f(this.j, authResult.j) && this.k == authResult.k && epx.f(this.l, authResult.l) && this.m == authResult.m && epx.f(this.n, authResult.n) && epx.f(this.o, authResult.o) && epx.f(this.p, authResult.p) && this.q == authResult.q && epx.f(this.r, authResult.r) && epx.f(this.s, authResult.s) && epx.f(this.t, authResult.t) && epx.f(this.u, authResult.u) && epx.f(this.v, authResult.v) && epx.f(this.w, authResult.w) && epx.f(this.x, authResult.x);
    }

    public final AuthPayload f() {
        return this.n;
    }

    public final AuthTarget g() {
        return this.o;
    }

    public final UserId getUid() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int a2 = shy.a(this.f, qoy.b(bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d.b), 31, this.e), 31);
        String str2 = this.g;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VkAuthCredentials vkAuthCredentials = this.h;
        int a3 = shy.a(this.k, urd0.a(urd0.a((hashCode2 + (vkAuthCredentials == null ? 0 : vkAuthCredentials.hashCode())) * 31, 31, this.i), 31, this.j), 31);
        ArrayList<String> arrayList = this.l;
        int a4 = shy.a(this.m, (a3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31);
        AuthPayload authPayload = this.n;
        int hashCode3 = (this.o.hashCode() + ((a4 + (authPayload == null ? 0 : authPayload.hashCode())) * 31)) * 31;
        PersonalData personalData = this.p;
        int a5 = bh10.a((hashCode3 + (personalData == null ? 0 : personalData.hashCode())) * 31, 31, this.q);
        Bundle bundle = this.r;
        int a6 = fw3.a((a5 + (bundle == null ? 0 : bundle.hashCode())) * 31, 31, this.s.b);
        String str3 = this.t;
        int hashCode4 = (a6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.u;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.v;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.w;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.x;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final long i() {
        return this.q;
    }

    public final String j() {
        return this.u;
    }

    public final int k() {
        return this.f;
    }

    public final Bundle l() {
        return this.r;
    }

    public final String n() {
        return this.t;
    }

    public final String o() {
        return this.c;
    }

    public final boolean p() {
        return this.u != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthResult(accessToken=");
        sb.append(this.b);
        sb.append(", secret=");
        sb.append(this.c);
        sb.append(", uid=");
        sb.append(this.d);
        sb.append(", httpsRequired=");
        sb.append(this.e);
        sb.append(", expiresIn=");
        sb.append(this.f);
        sb.append(", trustedHash=");
        sb.append(this.g);
        sb.append(", authCredentials=");
        sb.append(this.h);
        sb.append(", webviewAccessToken=");
        sb.append(this.i);
        sb.append(", webviewRefreshToken=");
        sb.append(this.j);
        sb.append(", webviewExpired=");
        sb.append(this.k);
        sb.append(", authCookies=");
        sb.append(this.l);
        sb.append(", webviewRefreshTokenExpired=");
        sb.append(this.m);
        sb.append(", authPayload=");
        sb.append(this.n);
        sb.append(", authTarget=");
        sb.append(this.o);
        sb.append(", personalData=");
        sb.append(this.p);
        sb.append(", createdMs=");
        sb.append(this.q);
        sb.append(", metadata=");
        sb.append(this.r);
        sb.append(", utilityTokens=");
        sb.append(this.s);
        sb.append(", phoneToActualize=");
        sb.append(this.t);
        sb.append(", emailToActualize=");
        sb.append(this.u);
        sb.append(", email=");
        sb.append(this.v);
        sb.append(", silentToken=");
        sb.append(this.w);
        sb.append(", silentTokenUuid=");
        return ho8.a(sb, this.x, ')');
    }

    public final boolean u() {
        String str = this.t;
        return true ^ (str == null || drm0.N(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeSerializable(this.l);
        parcel.writeInt(this.m);
        parcel.writeParcelable(this.n, 0);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.p, 0);
        parcel.writeLong(this.q);
        parcel.writeParcelable(this.r, 0);
        parcel.writeParcelable(this.s, 0);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public AuthResult(java.lang.String r28, java.lang.String r29, com.vk.dto.common.id.UserId r30, boolean r31, int r32, java.lang.String r33, com.vk.superapp.api.dto.auth.VkAuthCredentials r34, java.lang.String r35, java.lang.String r36, int r37, java.util.ArrayList r38, int r39, com.vk.superapp.api.dto.auth.AuthPayload r40, com.vk.superapp.api.dto.auth.AuthTarget r41, com.vk.superapp.api.dto.auth.PersonalData r42, long r43, android.os.Bundle r45, com.vk.api.sdk.auth.UtilityTokens r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, int r52, xsna.zcl r53) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.auth.api.models.AuthResult.<init>(java.lang.String, java.lang.String, com.vk.dto.common.id.UserId, boolean, int, java.lang.String, com.vk.superapp.api.dto.auth.VkAuthCredentials, java.lang.String, java.lang.String, int, java.util.ArrayList, int, com.vk.superapp.api.dto.auth.AuthPayload, com.vk.superapp.api.dto.auth.AuthTarget, com.vk.superapp.api.dto.auth.PersonalData, long, android.os.Bundle, com.vk.api.sdk.auth.UtilityTokens, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, xsna.zcl):void");
    }
}
