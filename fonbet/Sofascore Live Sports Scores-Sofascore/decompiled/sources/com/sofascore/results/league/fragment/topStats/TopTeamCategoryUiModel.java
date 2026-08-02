package com.sofascore.results.league.fragment.topStats;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import defpackage.dyh;
import defpackage.gv9;
import defpackage.gvh;
import defpackage.ljg;
import defpackage.vxd;
import defpackage.w1l;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/league/fragment/topStats/TopTeamCategoryUiModel;", "Lcom/sofascore/results/league/fragment/topStats/TopStatsCategory;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TopTeamCategoryUiModel implements TopStatsCategory, Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopTeamCategoryUiModel> CREATOR = new dyh(11);
    public final String a;
    public final gv9 b;
    public final Integer c;
    public final Integer d;
    public final TeamAverageRatingVersion e;

    public TopTeamCategoryUiModel(String str, gv9 gv9Var, Integer num, Integer num2, TeamAverageRatingVersion teamAverageRatingVersion) {
        str.getClass();
        gv9Var.getClass();
        teamAverageRatingVersion.getClass();
        this.a = str;
        this.b = gv9Var;
        this.c = num;
        this.d = num2;
        this.e = teamAverageRatingVersion;
    }

    public static TopTeamCategoryUiModel a(TopTeamCategoryUiModel topTeamCategoryUiModel, gv9 gv9Var, int i) {
        String str = topTeamCategoryUiModel.a;
        if ((i & 2) != 0) {
            gv9Var = topTeamCategoryUiModel.b;
        }
        gv9 gv9Var2 = gv9Var;
        Integer num = (i & 4) != 0 ? topTeamCategoryUiModel.c : null;
        Integer num2 = (i & 8) != 0 ? topTeamCategoryUiModel.d : null;
        TeamAverageRatingVersion teamAverageRatingVersion = topTeamCategoryUiModel.e;
        str.getClass();
        gv9Var2.getClass();
        teamAverageRatingVersion.getClass();
        return new TopTeamCategoryUiModel(str, gv9Var2, num, num2, teamAverageRatingVersion);
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    /* renamed from: I0, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    /* renamed from: P0, reason: from getter */
    public final Integer getD() {
        return this.d;
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    /* renamed from: a0, reason: from getter */
    public final TeamAverageRatingVersion getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    public final gvh e0() {
        return gvh.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopTeamCategoryUiModel)) {
            return false;
        }
        TopTeamCategoryUiModel topTeamCategoryUiModel = (TopTeamCategoryUiModel) obj;
        return Intrinsics.c(this.a, topTeamCategoryUiModel.a) && Intrinsics.c(this.b, topTeamCategoryUiModel.b) && Intrinsics.c(this.c, topTeamCategoryUiModel.c) && Intrinsics.c(this.d, topTeamCategoryUiModel.d) && this.e == topTeamCategoryUiModel.e;
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    /* renamed from: f0, reason: from getter */
    public final gv9 getB() {
        return this.b;
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    /* renamed from: g0, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int d = ljg.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (d + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return this.e.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    public final String r0() {
        return "teams";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopTeamCategoryUiModel(name=");
        sb.append(this.a);
        sb.append(", teamsList=");
        sb.append(this.b);
        sb.append(", informationTextRes=");
        vxd.r(this.c, this.d, ", informationModalTextRes=", ", avgRatingVersion=", sb);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        gv9 gv9Var = this.b;
        parcel.writeInt(gv9Var.size());
        Iterator it = gv9Var.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable((Serializable) it.next());
        }
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num);
        }
        Integer num2 = this.d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num2);
        }
        parcel.writeString(this.e.name());
    }
}
