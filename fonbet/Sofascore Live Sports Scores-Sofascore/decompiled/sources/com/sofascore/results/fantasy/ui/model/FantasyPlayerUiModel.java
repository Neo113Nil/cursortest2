package com.sofascore.results.fantasy.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.ie7;
import defpackage.je7;
import defpackage.joa;
import defpackage.lnb;
import defpackage.m97;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.rz6;
import defpackage.vxd;
import defpackage.w1l;
import defpackage.wd;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/fantasy/ui/model/FantasyPlayerUiModel;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "Companion", "je7", "ie7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerUiModel implements Serializable, Parcelable {
    public final Integer A;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final rz6 i;
    public final String j;
    public final String k;
    public final Float l;
    public final Float m;
    public final String n;
    public final String o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Float u;
    public final Integer v;
    public final Float w;
    public final Integer x;
    public final Integer y;
    public final Float z;

    @NotNull
    public static final je7 Companion = new je7();

    @NotNull
    public static final Parcelable.Creator<FantasyPlayerUiModel> CREATOR = new wd(19);
    public static final joa[] B = {null, null, null, null, null, null, null, null, ypa.a(ysa.b, new m97(23)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    static {
        new FantasyPlayerUiModel(1, 1, 1, "Liverpool", "LIV", "Salah", "Salah", "Salah", rz6.k, "2.0", "€25.2M", Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Float.valueOf(75.0f), CampaignEx.CLICKMODE_ON, "24", 5, 1, 1, 1, 1, Float.valueOf(10.5f), 254, Float.valueOf(12.0f), 5, 3, Float.valueOf(7.73f), 15);
    }

    public /* synthetic */ FantasyPlayerUiModel(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, rz6 rz6Var, String str6, String str7, Float f, Float f2, String str8, String str9, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Float f3, Integer num6, Float f4, Integer num7, Integer num8, Float f5, Integer num9) {
        if (134217727 != (i & 134217727)) {
            oea.z(i, 134217727, ie7.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = rz6Var;
        this.j = str6;
        this.k = str7;
        this.l = f;
        this.m = f2;
        this.n = str8;
        this.o = str9;
        this.p = num;
        this.q = num2;
        this.r = num3;
        this.s = num4;
        this.t = num5;
        this.u = f3;
        this.v = num6;
        this.w = f4;
        this.x = num7;
        this.y = num8;
        this.z = f5;
        this.A = num9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyPlayerUiModel)) {
            return false;
        }
        FantasyPlayerUiModel fantasyPlayerUiModel = (FantasyPlayerUiModel) obj;
        return this.a == fantasyPlayerUiModel.a && this.b == fantasyPlayerUiModel.b && this.c == fantasyPlayerUiModel.c && Intrinsics.c(this.d, fantasyPlayerUiModel.d) && Intrinsics.c(this.e, fantasyPlayerUiModel.e) && Intrinsics.c(this.f, fantasyPlayerUiModel.f) && Intrinsics.c(this.g, fantasyPlayerUiModel.g) && Intrinsics.c(this.h, fantasyPlayerUiModel.h) && this.i == fantasyPlayerUiModel.i && Intrinsics.c(this.j, fantasyPlayerUiModel.j) && Intrinsics.c(this.k, fantasyPlayerUiModel.k) && Intrinsics.c(this.l, fantasyPlayerUiModel.l) && Intrinsics.c(this.m, fantasyPlayerUiModel.m) && Intrinsics.c(this.n, fantasyPlayerUiModel.n) && Intrinsics.c(this.o, fantasyPlayerUiModel.o) && Intrinsics.c(this.p, fantasyPlayerUiModel.p) && Intrinsics.c(this.q, fantasyPlayerUiModel.q) && Intrinsics.c(this.r, fantasyPlayerUiModel.r) && Intrinsics.c(this.s, fantasyPlayerUiModel.s) && Intrinsics.c(this.t, fantasyPlayerUiModel.t) && Intrinsics.c(this.u, fantasyPlayerUiModel.u) && Intrinsics.c(this.v, fantasyPlayerUiModel.v) && Intrinsics.c(this.w, fantasyPlayerUiModel.w) && Intrinsics.c(this.x, fantasyPlayerUiModel.x) && Intrinsics.c(this.y, fantasyPlayerUiModel.y) && Intrinsics.c(this.z, fantasyPlayerUiModel.z) && Intrinsics.c(this.A, fantasyPlayerUiModel.A);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(dmi.c(wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int c2 = dmi.c(dmi.c((this.i.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.j), 31, this.k);
        Float f = this.l;
        int hashCode2 = (c2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.m;
        int c3 = dmi.c(dmi.c((hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31, 31, this.n), 31, this.o);
        Integer num = this.p;
        int hashCode3 = (c3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.q;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.r;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.s;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.t;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f3 = this.u;
        int hashCode8 = (hashCode7 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num6 = this.v;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Float f4 = this.w;
        int hashCode10 = (hashCode9 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num7 = this.x;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.y;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Float f5 = this.z;
        int hashCode13 = (hashCode12 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Integer num9 = this.A;
        return hashCode13 + (num9 != null ? num9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "FantasyPlayerUiModel(id=", ", playerId=", ", teamId=");
        vxd.p(this.c, ", teamName=", this.d, ", teamNameCode=", s);
        bf3.v(s, this.e, ", name=", this.f, ", shortName=");
        bf3.v(s, this.g, ", lastName=", this.h, ", position=");
        s.append(this.i);
        s.append(", averagePoints=");
        s.append(this.j);
        s.append(", price=");
        s.append(this.k);
        s.append(", priceValue=");
        s.append(this.l);
        s.append(", ownedPercentage=");
        s.append(this.m);
        s.append(", form=");
        s.append(this.n);
        s.append(", totalPoints=");
        me4.o(this.p, this.o, ", totalPlayersInPosition=", ", averagePointsRank=", s);
        vxd.r(this.q, this.r, ", totalPointsRank=", ", formRank=", s);
        vxd.r(this.s, this.t, ", ownedRank=", ", formValue=", s);
        s.append(this.u);
        s.append(", totalPointsValue=");
        s.append(this.v);
        s.append(", averagePointsValue=");
        s.append(this.w);
        s.append(", goals=");
        s.append(this.x);
        s.append(", assists=");
        s.append(this.y);
        s.append(", averageRating=");
        s.append(this.z);
        s.append(", averageRatingRank=");
        return vxd.n(s, this.A, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i.name());
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        Float f = this.l;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f);
        }
        Float f2 = this.m;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f2);
        }
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        Integer num = this.p;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num);
        }
        Integer num2 = this.q;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num2);
        }
        Integer num3 = this.r;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num3);
        }
        Integer num4 = this.s;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num4);
        }
        Integer num5 = this.t;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num5);
        }
        Float f3 = this.u;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f3);
        }
        Integer num6 = this.v;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num6);
        }
        Float f4 = this.w;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f4);
        }
        Integer num7 = this.x;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num7);
        }
        Integer num8 = this.y;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num8);
        }
        Float f5 = this.z;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f5);
        }
        Integer num9 = this.A;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num9);
        }
    }

    public FantasyPlayerUiModel(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, rz6 rz6Var, String str6, String str7, Float f, Float f2, String str8, String str9, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Float f3, Integer num6, Float f4, Integer num7, Integer num8, Float f5, Integer num9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        rz6Var.getClass();
        str6.getClass();
        me4.p(str7, str8, str9);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = rz6Var;
        this.j = str6;
        this.k = str7;
        this.l = f;
        this.m = f2;
        this.n = str8;
        this.o = str9;
        this.p = num;
        this.q = num2;
        this.r = num3;
        this.s = num4;
        this.t = num5;
        this.u = f3;
        this.v = num6;
        this.w = f4;
        this.x = num7;
        this.y = num8;
        this.z = f5;
        this.A = num9;
    }
}
