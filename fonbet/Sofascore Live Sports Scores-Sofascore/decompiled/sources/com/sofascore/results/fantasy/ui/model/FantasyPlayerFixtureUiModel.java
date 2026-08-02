package com.sofascore.results.fantasy.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.mvvm.model.StatusKt;
import defpackage.ad7;
import defpackage.dmi;
import defpackage.ed7;
import defpackage.fc6;
import defpackage.fd7;
import defpackage.fn0;
import defpackage.joa;
import defpackage.ljg;
import defpackage.m97;
import defpackage.me4;
import defpackage.o68;
import defpackage.oea;
import defpackage.p68;
import defpackage.r5h;
import defpackage.rd7;
import defpackage.sd7;
import defpackage.vxd;
import defpackage.w1l;
import defpackage.wd;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/ui/model/FantasyPlayerFixtureUiModel;", "Landroid/os/Parcelable;", "Companion", "fd7", "ed7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerFixtureUiModel implements Parcelable {
    public static final joa[] x;
    public final int a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Float k;
    public final Double l;
    public final long m;
    public final String n;
    public final p68 o;
    public final o68 p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final sd7 u;
    public final rd7 v;
    public final ad7 w;

    @NotNull
    public static final fd7 Companion = new fd7();

    @NotNull
    public static final Parcelable.Creator<FantasyPlayerFixtureUiModel> CREATOR = new wd(17);

    static {
        ysa ysaVar = ysa.b;
        x = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new m97(11)), ypa.a(ysaVar, new m97(12)), null, null, null, null, ypa.a(ysaVar, new m97(13)), ypa.a(ysaVar, new m97(14)), ypa.a(ysaVar, new m97(15))};
        new FantasyPlayerFixtureUiModel(1, 1, 2, 5, "Gameweek 16", 4, 1, "SHU", "H", 5, Float.valueOf(2.0f), Double.valueOf(7.2d), Instant.now().getEpochSecond(), StatusKt.STATUS_IN_PROGRESS, p68.c, o68.d, 2, 2, 3, 1, null, null, null);
    }

    public /* synthetic */ FantasyPlayerFixtureUiModel(int i, int i2, Integer num, Integer num2, Integer num3, String str, int i3, int i4, String str2, String str3, Integer num4, Float f, Double d, long j, String str4, p68 p68Var, o68 o68Var, Integer num5, Integer num6, Integer num7, Integer num8, sd7 sd7Var, rd7 rd7Var, ad7 ad7Var) {
        if (8388607 != (i & 8388607)) {
            oea.z(i, 8388607, ed7.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = str;
        this.f = i3;
        this.g = i4;
        this.h = str2;
        this.i = str3;
        this.j = num4;
        this.k = f;
        this.l = d;
        this.m = j;
        this.n = str4;
        this.o = p68Var;
        this.p = o68Var;
        this.q = num5;
        this.r = num6;
        this.s = num7;
        this.t = num8;
        this.u = sd7Var;
        this.v = rd7Var;
        this.w = ad7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyPlayerFixtureUiModel)) {
            return false;
        }
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj;
        return this.a == fantasyPlayerFixtureUiModel.a && Intrinsics.c(this.b, fantasyPlayerFixtureUiModel.b) && Intrinsics.c(this.c, fantasyPlayerFixtureUiModel.c) && Intrinsics.c(this.d, fantasyPlayerFixtureUiModel.d) && Intrinsics.c(this.e, fantasyPlayerFixtureUiModel.e) && this.f == fantasyPlayerFixtureUiModel.f && this.g == fantasyPlayerFixtureUiModel.g && Intrinsics.c(this.h, fantasyPlayerFixtureUiModel.h) && Intrinsics.c(this.i, fantasyPlayerFixtureUiModel.i) && Intrinsics.c(this.j, fantasyPlayerFixtureUiModel.j) && Intrinsics.c(this.k, fantasyPlayerFixtureUiModel.k) && Intrinsics.c(this.l, fantasyPlayerFixtureUiModel.l) && this.m == fantasyPlayerFixtureUiModel.m && Intrinsics.c(this.n, fantasyPlayerFixtureUiModel.n) && this.o == fantasyPlayerFixtureUiModel.o && this.p == fantasyPlayerFixtureUiModel.p && Intrinsics.c(this.q, fantasyPlayerFixtureUiModel.q) && Intrinsics.c(this.r, fantasyPlayerFixtureUiModel.r) && Intrinsics.c(this.s, fantasyPlayerFixtureUiModel.s) && Intrinsics.c(this.t, fantasyPlayerFixtureUiModel.t) && this.u == fantasyPlayerFixtureUiModel.u && this.v == fantasyPlayerFixtureUiModel.v && this.w == fantasyPlayerFixtureUiModel.w;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int c = dmi.c(dmi.c(wv8.a(this.g, wv8.a(this.f, dmi.c((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.e), 31), 31), 31, this.h), 31, this.i);
        Integer num4 = this.j;
        int hashCode4 = (c + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.k;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.l;
        int c2 = dmi.c(ljg.c((hashCode5 + (d == null ? 0 : d.hashCode())) * 31, 31, this.m), 31, this.n);
        p68 p68Var = this.o;
        int hashCode6 = (c2 + (p68Var == null ? 0 : p68Var.hashCode())) * 31;
        o68 o68Var = this.p;
        int hashCode7 = (hashCode6 + (o68Var == null ? 0 : o68Var.hashCode())) * 31;
        Integer num5 = this.q;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.r;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.s;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.t;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        sd7 sd7Var = this.u;
        int hashCode12 = (hashCode11 + (sd7Var == null ? 0 : sd7Var.hashCode())) * 31;
        rd7 rd7Var = this.v;
        int hashCode13 = (hashCode12 + (rd7Var == null ? 0 : rd7Var.hashCode())) * 31;
        ad7 ad7Var = this.w;
        return hashCode13 + (ad7Var != null ? ad7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = fc6.r("FantasyPlayerFixtureUiModel(eventId=", ", homeTeamId=", ", awayTeamId=", this.b, this.a);
        vxd.r(this.c, this.d, ", roundId=", ", roundName=", r);
        w1l.q(this.f, this.e, ", roundSequence=", ", opponentId=", r);
        vxd.p(this.g, ", opponentNamecode=", this.h, ", type=", r);
        me4.o(this.j, this.i, ", points=", ", expectedPoints=", r);
        r.append(this.k);
        r.append(", rating=");
        r.append(this.l);
        r.append(", startTimestamp=");
        r.append(this.m);
        r.append(", eventStatus=");
        r.append(this.n);
        r.append(", locationType=");
        r.append(this.o);
        r.append(", fixtureDifficulty=");
        r.append(this.p);
        fn0.w(this.q, this.r, ", winnerCode=", ", playerTeamSide=", r);
        fn0.w(this.s, this.t, ", homeScore=", ", awayScore=", r);
        r.append(", missingType=");
        r.append(this.u);
        r.append(", missingReason=");
        r.append(this.v);
        r.append(", playerFixtureStatus=");
        r.append(this.w);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num2);
        }
        Integer num3 = this.d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num3);
        }
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        Integer num4 = this.j;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num4);
        }
        Float f = this.k;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f);
        }
        Double d = this.l;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeLong(this.m);
        parcel.writeString(this.n);
        p68 p68Var = this.o;
        if (p68Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(p68Var.name());
        }
        o68 o68Var = this.p;
        if (o68Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(o68Var.name());
        }
        Integer num5 = this.q;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num5);
        }
        Integer num6 = this.r;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num6);
        }
        Integer num7 = this.s;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num7);
        }
        Integer num8 = this.t;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num8);
        }
        sd7 sd7Var = this.u;
        if (sd7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sd7Var.name());
        }
        rd7 rd7Var = this.v;
        if (rd7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rd7Var.name());
        }
        ad7 ad7Var = this.w;
        if (ad7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ad7Var.name());
        }
    }

    public FantasyPlayerFixtureUiModel(int i, Integer num, Integer num2, Integer num3, String str, int i2, int i3, String str2, String str3, Integer num4, Float f, Double d, long j, String str4, p68 p68Var, o68 o68Var, Integer num5, Integer num6, Integer num7, Integer num8, sd7 sd7Var, rd7 rd7Var, ad7 ad7Var) {
        w1l.y(str, str2, str3, str4);
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = str;
        this.f = i2;
        this.g = i3;
        this.h = str2;
        this.i = str3;
        this.j = num4;
        this.k = f;
        this.l = d;
        this.m = j;
        this.n = str4;
        this.o = p68Var;
        this.p = o68Var;
        this.q = num5;
        this.r = num6;
        this.s = num7;
        this.t = num8;
        this.u = sd7Var;
        this.v = rd7Var;
        this.w = ad7Var;
    }
}
