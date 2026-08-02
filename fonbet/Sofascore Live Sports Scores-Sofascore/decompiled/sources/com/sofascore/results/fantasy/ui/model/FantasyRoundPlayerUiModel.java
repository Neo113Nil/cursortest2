package com.sofascore.results.fantasy.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import defpackage.ad7;
import defpackage.bf3;
import defpackage.cj7;
import defpackage.dj7;
import defpackage.dmi;
import defpackage.gv9;
import defpackage.jf7;
import defpackage.joa;
import defpackage.km5;
import defpackage.lm5;
import defpackage.oea;
import defpackage.oz6;
import defpackage.r5h;
import defpackage.rz6;
import defpackage.w1l;
import defpackage.wd;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yy6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/fantasy/ui/model/FantasyRoundPlayerUiModel;", "Landroid/os/Parcelable;", "Loz6;", "Companion", "dj7", "cj7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRoundPlayerUiModel implements Parcelable, oz6 {
    public static final joa[] D;
    public final List A;
    public final BasicTournamentInfo B;
    public final FantasyRoundPlayerInfo C;
    public final int a;
    public final rz6 b;
    public final yy6 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final FantasyPlayerUiModel g;
    public final int h;
    public final String i;
    public final String j;
    public final boolean k;
    public final FantasyPlayerMissingData l;
    public final boolean m;
    public final Integer n;
    public final String o;
    public final Float p;
    public final Float q;
    public final Integer r;
    public final Float s;
    public final Float t;
    public final Float u;
    public final boolean v;
    public final boolean w;
    public final List x;
    public final Map y;
    public final boolean z;

    @NotNull
    public static final dj7 Companion = new dj7();

    @NotNull
    public static final Parcelable.Creator<FantasyRoundPlayerUiModel> CREATOR = new wd(21);

    static {
        ysa ysaVar = ysa.b;
        D = new joa[]{null, ypa.a(ysaVar, new jf7(9)), ypa.a(ysaVar, new jf7(10)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new jf7(11)), ypa.a(ysaVar, new jf7(12)), null, ypa.a(ysaVar, new jf7(13)), null, null};
    }

    public FantasyRoundPlayerUiModel(int i, int i2, rz6 rz6Var, yy6 yy6Var, int i3, boolean z, int i4, FantasyPlayerUiModel fantasyPlayerUiModel, int i5, String str, String str2, boolean z2, FantasyPlayerMissingData fantasyPlayerMissingData, boolean z3, Integer num, String str3, Float f, Float f2, Integer num2, Float f3, Float f4, Float f5, boolean z4, boolean z5, List list, Map map, boolean z6, List list2, BasicTournamentInfo basicTournamentInfo, FantasyRoundPlayerInfo fantasyRoundPlayerInfo) {
        Map map2;
        if (343932911 != (i & 343932911)) {
            oea.z(i, 343932911, cj7.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = rz6Var;
        this.c = yy6Var;
        this.d = i3;
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        this.f = i4;
        this.g = fantasyPlayerUiModel;
        this.h = i5;
        this.i = str;
        this.j = str2;
        this.k = z2;
        this.l = fantasyPlayerMissingData;
        this.m = z3;
        this.n = num;
        this.o = str3;
        this.p = f;
        this.q = f2;
        this.r = num2;
        this.s = f3;
        this.t = f4;
        this.u = f5;
        this.v = z4;
        this.w = z5;
        this.x = (8388608 & i) == 0 ? km5.a : list;
        if ((16777216 & i) == 0) {
            map2 = lm5.a;
            map2.getClass();
        } else {
            map2 = map;
        }
        this.y = map2;
        if ((33554432 & i) == 0) {
            this.z = false;
        } else {
            this.z = z6;
        }
        this.A = list2;
        if ((i & 134217728) == 0) {
            this.B = null;
        } else {
            this.B = basicTournamentInfo;
        }
        this.C = fantasyRoundPlayerInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    public static FantasyRoundPlayerUiModel b(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, yy6 yy6Var, int i, boolean z, boolean z2, boolean z3, Integer num, gv9 gv9Var, int i2) {
        Float f;
        boolean z4;
        boolean z5;
        gv9 gv9Var2;
        int i3 = fantasyRoundPlayerUiModel.a;
        rz6 rz6Var = fantasyRoundPlayerUiModel.b;
        yy6 yy6Var2 = (i2 & 4) != 0 ? fantasyRoundPlayerUiModel.c : yy6Var;
        int i4 = (i2 & 8) != 0 ? fantasyRoundPlayerUiModel.d : i;
        boolean z6 = (i2 & 16) != 0 ? fantasyRoundPlayerUiModel.e : z;
        int i5 = fantasyRoundPlayerUiModel.f;
        yy6 yy6Var3 = yy6Var2;
        int i6 = i4;
        boolean z7 = z6;
        FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
        int i7 = fantasyRoundPlayerUiModel.h;
        String str = fantasyRoundPlayerUiModel.i;
        String str2 = fantasyRoundPlayerUiModel.j;
        boolean z8 = (i2 & 1024) != 0 ? fantasyRoundPlayerUiModel.k : z2;
        FantasyPlayerMissingData fantasyPlayerMissingData = fantasyRoundPlayerUiModel.l;
        boolean z9 = (i2 & 4096) != 0 ? fantasyRoundPlayerUiModel.m : z3;
        Integer num2 = (i2 & 8192) != 0 ? fantasyRoundPlayerUiModel.n : num;
        String str3 = fantasyRoundPlayerUiModel.o;
        Float f2 = fantasyRoundPlayerUiModel.p;
        Float f3 = fantasyRoundPlayerUiModel.q;
        Integer num3 = fantasyRoundPlayerUiModel.r;
        Float f4 = fantasyRoundPlayerUiModel.s;
        Float f5 = fantasyRoundPlayerUiModel.t;
        Float f6 = fantasyRoundPlayerUiModel.u;
        if ((i2 & 2097152) != 0) {
            f = f6;
            z4 = fantasyRoundPlayerUiModel.v;
        } else {
            f = f6;
            z4 = true;
        }
        boolean z10 = z4;
        boolean z11 = fantasyRoundPlayerUiModel.w;
        List list = fantasyRoundPlayerUiModel.x;
        Map map = fantasyRoundPlayerUiModel.y;
        boolean z12 = fantasyRoundPlayerUiModel.z;
        if ((i2 & 67108864) != 0) {
            z5 = z12;
            gv9Var2 = fantasyRoundPlayerUiModel.A;
        } else {
            z5 = z12;
            gv9Var2 = gv9Var;
        }
        BasicTournamentInfo basicTournamentInfo = fantasyRoundPlayerUiModel.B;
        FantasyRoundPlayerInfo fantasyRoundPlayerInfo = fantasyRoundPlayerUiModel.C;
        fantasyRoundPlayerUiModel.getClass();
        rz6Var.getClass();
        fantasyPlayerUiModel.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        map.getClass();
        fantasyRoundPlayerInfo.getClass();
        return new FantasyRoundPlayerUiModel(i3, rz6Var, yy6Var3, i6, z7, i5, fantasyPlayerUiModel, i7, str, str2, z8, fantasyPlayerMissingData, z9, num2, str3, f2, f3, num3, f4, f5, f, z10, z11, list, map, z5, gv9Var2, basicTournamentInfo, fantasyRoundPlayerInfo);
    }

    @Override // defpackage.oz6
    /* renamed from: a, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public final boolean c() {
        boolean z;
        boolean z2;
        Integer num = this.n;
        boolean z3 = num == null || (num != null && num.intValue() == 0);
        Map map = this.y;
        Collection values = map.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((FantasyPlayerFixtureData) it.next()).c != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        Collection values2 = map.values();
        if (!(values2 instanceof Collection) || !values2.isEmpty()) {
            Iterator it2 = values2.iterator();
            while (it2.hasNext()) {
                ad7 ad7Var = ((FantasyPlayerFixtureData) it2.next()).c;
                if (ad7Var != null && ad7Var != ad7.d) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        return this.v && z3 && z && z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyRoundPlayerUiModel)) {
            return false;
        }
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
        return this.a == fantasyRoundPlayerUiModel.a && this.b == fantasyRoundPlayerUiModel.b && this.c == fantasyRoundPlayerUiModel.c && this.d == fantasyRoundPlayerUiModel.d && this.e == fantasyRoundPlayerUiModel.e && this.f == fantasyRoundPlayerUiModel.f && Intrinsics.c(this.g, fantasyRoundPlayerUiModel.g) && this.h == fantasyRoundPlayerUiModel.h && Intrinsics.c(this.i, fantasyRoundPlayerUiModel.i) && Intrinsics.c(this.j, fantasyRoundPlayerUiModel.j) && this.k == fantasyRoundPlayerUiModel.k && Intrinsics.c(this.l, fantasyRoundPlayerUiModel.l) && this.m == fantasyRoundPlayerUiModel.m && Intrinsics.c(this.n, fantasyRoundPlayerUiModel.n) && Intrinsics.c(this.o, fantasyRoundPlayerUiModel.o) && Intrinsics.c(this.p, fantasyRoundPlayerUiModel.p) && Intrinsics.c(this.q, fantasyRoundPlayerUiModel.q) && Intrinsics.c(this.r, fantasyRoundPlayerUiModel.r) && Intrinsics.c(this.s, fantasyRoundPlayerUiModel.s) && Intrinsics.c(this.t, fantasyRoundPlayerUiModel.t) && Intrinsics.c(this.u, fantasyRoundPlayerUiModel.u) && this.v == fantasyRoundPlayerUiModel.v && this.w == fantasyRoundPlayerUiModel.w && Intrinsics.c(this.x, fantasyRoundPlayerUiModel.x) && Intrinsics.c(this.y, fantasyRoundPlayerUiModel.y) && this.z == fantasyRoundPlayerUiModel.z && Intrinsics.c(this.A, fantasyRoundPlayerUiModel.A) && Intrinsics.c(this.B, fantasyRoundPlayerUiModel.B) && Intrinsics.c(this.C, fantasyRoundPlayerUiModel.C);
    }

    @Override // defpackage.oz6
    /* renamed from: getId, reason: from getter */
    public final int getA() {
        return this.a;
    }

    @Override // defpackage.oz6
    /* renamed from: getOrder, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // defpackage.oz6
    /* renamed from: getPosition, reason: from getter */
    public final rz6 getB() {
        return this.b;
    }

    @Override // defpackage.oz6
    /* renamed from: getState, reason: from getter */
    public final yy6 getC() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        yy6 yy6Var = this.c;
        int e = dmi.e(dmi.c(dmi.c(wv8.a(this.h, (this.g.hashCode() + wv8.a(this.f, dmi.e(wv8.a(this.d, (hashCode + (yy6Var == null ? 0 : yy6Var.hashCode())) * 31, 31), 31, this.e), 31)) * 31, 31), 31, this.i), 31, this.j), 31, this.k);
        FantasyPlayerMissingData fantasyPlayerMissingData = this.l;
        int e2 = dmi.e((e + (fantasyPlayerMissingData == null ? 0 : fantasyPlayerMissingData.hashCode())) * 31, 31, this.m);
        Integer num = this.n;
        int c = dmi.c((e2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.o);
        Float f = this.p;
        int hashCode2 = (c + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.q;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num2 = this.r;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f3 = this.s;
        int hashCode5 = (hashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.t;
        int hashCode6 = (hashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.u;
        int e3 = dmi.e(dmi.g(this.y, dmi.d(dmi.e(dmi.e((hashCode6 + (f5 == null ? 0 : f5.hashCode())) * 31, 31, this.v), 31, this.w), 31, this.x), 31), 31, this.z);
        List list = this.A;
        int hashCode7 = (e3 + (list == null ? 0 : list.hashCode())) * 31;
        BasicTournamentInfo basicTournamentInfo = this.B;
        return this.C.hashCode() + ((hashCode7 + (basicTournamentInfo != null ? basicTournamentInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyRoundPlayerUiModel(id=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.d);
        sb.append(", isDisabled=");
        sb.append(this.e);
        sb.append(", roundPlayerId=");
        sb.append(this.f);
        sb.append(", fantasyPlayer=");
        sb.append(this.g);
        sb.append(", teamId=");
        sb.append(this.h);
        sb.append(", teamName=");
        bf3.v(sb, this.i, ", teamNameCode=", this.j, ", isSubstitute=");
        sb.append(this.k);
        sb.append(", missingData=");
        sb.append(this.l);
        sb.append(", isCaptain=");
        sb.append(this.m);
        sb.append(", pointsValue=");
        sb.append(this.n);
        sb.append(", price=");
        sb.append(this.o);
        sb.append(", priceValue=");
        sb.append(this.p);
        sb.append(", expectedPoints=");
        sb.append(this.q);
        sb.append(", expectedPointsRank=");
        sb.append(this.r);
        sb.append(", goalProbability=");
        sb.append(this.s);
        sb.append(", assistProbability=");
        sb.append(this.t);
        sb.append(", cleanSheetProbability=");
        sb.append(this.u);
        sb.append(", isLocked=");
        sb.append(this.v);
        sb.append(", isLive=");
        sb.append(this.w);
        sb.append(", fixtures=");
        sb.append(this.x);
        sb.append(", fixtureInfos=");
        sb.append(this.y);
        sb.append(", hasFixturesToPlay=");
        sb.append(this.z);
        sb.append(", priceHistory=");
        sb.append(this.A);
        sb.append(", tournamentInfo=");
        sb.append(this.B);
        sb.append(", info=");
        sb.append(this.C);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b.name());
        yy6 yy6Var = this.c;
        if (yy6Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yy6Var.name());
        }
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        this.g.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        FantasyPlayerMissingData fantasyPlayerMissingData = this.l;
        if (fantasyPlayerMissingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fantasyPlayerMissingData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.m ? 1 : 0);
        Integer num = this.n;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num);
        }
        parcel.writeString(this.o);
        Float f = this.p;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f);
        }
        Float f2 = this.q;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f2);
        }
        Integer num2 = this.r;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num2);
        }
        Float f3 = this.s;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f3);
        }
        Float f4 = this.t;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f4);
        }
        Float f5 = this.u;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f5);
        }
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        List list = this.x;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FantasyPlayerFixtureUiModel) it.next()).writeToParcel(parcel, i);
        }
        Map map = this.y;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            ((FantasyPlayerFixtureData) entry.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.z ? 1 : 0);
        List list2 = this.A;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeFloat(((Number) it2.next()).floatValue());
            }
        }
        BasicTournamentInfo basicTournamentInfo = this.B;
        if (basicTournamentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicTournamentInfo.writeToParcel(parcel, i);
        }
        this.C.writeToParcel(parcel, i);
    }

    public FantasyRoundPlayerUiModel(int i, rz6 rz6Var, int i2, int i3, FantasyPlayerUiModel fantasyPlayerUiModel, int i4, String str, String str2, boolean z, FantasyPlayerMissingData fantasyPlayerMissingData, boolean z2, Integer num, String str3, Float f, Float f2, Integer num2, Float f3, Float f4, Float f5, boolean z3, boolean z4, List list, Map map, boolean z5, List list2, BasicTournamentInfo basicTournamentInfo, FantasyRoundPlayerInfo fantasyRoundPlayerInfo, int i5) {
        this(i, rz6Var, null, i2, false, i3, fantasyPlayerUiModel, i4, str, str2, z, fantasyPlayerMissingData, z2, num, str3, f, f2, num2, f3, f4, f5, z3, z4, (i5 & 8388608) != 0 ? km5.a : list, map, (i5 & 33554432) != 0 ? false : z5, list2, (i5 & 134217728) != 0 ? null : basicTournamentInfo, fantasyRoundPlayerInfo);
    }

    public FantasyRoundPlayerUiModel(int i, rz6 rz6Var, yy6 yy6Var, int i2, boolean z, int i3, FantasyPlayerUiModel fantasyPlayerUiModel, int i4, String str, String str2, boolean z2, FantasyPlayerMissingData fantasyPlayerMissingData, boolean z3, Integer num, String str3, Float f, Float f2, Integer num2, Float f3, Float f4, Float f5, boolean z4, boolean z5, List list, Map map, boolean z6, List list2, BasicTournamentInfo basicTournamentInfo, FantasyRoundPlayerInfo fantasyRoundPlayerInfo) {
        rz6Var.getClass();
        fantasyPlayerUiModel.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        map.getClass();
        fantasyRoundPlayerInfo.getClass();
        this.a = i;
        this.b = rz6Var;
        this.c = yy6Var;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = fantasyPlayerUiModel;
        this.h = i4;
        this.i = str;
        this.j = str2;
        this.k = z2;
        this.l = fantasyPlayerMissingData;
        this.m = z3;
        this.n = num;
        this.o = str3;
        this.p = f;
        this.q = f2;
        this.r = num2;
        this.s = f3;
        this.t = f4;
        this.u = f5;
        this.v = z4;
        this.w = z5;
        this.x = list;
        this.y = map;
        this.z = z6;
        this.A = list2;
        this.B = basicTournamentInfo;
        this.C = fantasyRoundPlayerInfo;
    }
}
