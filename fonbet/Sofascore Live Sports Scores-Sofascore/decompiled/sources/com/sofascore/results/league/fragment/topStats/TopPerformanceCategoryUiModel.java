package com.sofascore.results.league.fragment.topStats;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dyh;
import defpackage.fc6;
import defpackage.gv9;
import defpackage.gvh;
import defpackage.ljg;
import defpackage.w1l;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/league/fragment/topStats/TopPerformanceCategoryUiModel;", "Lcom/sofascore/results/league/fragment/topStats/TopStatsCategory;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TopPerformanceCategoryUiModel implements TopStatsCategory, Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopPerformanceCategoryUiModel> CREATOR = new dyh(9);
    public final String a;
    public final gv9 b;
    public final Integer c;
    public final Integer d;

    public TopPerformanceCategoryUiModel(String str, gv9 gv9Var, Integer num, Integer num2) {
        str.getClass();
        gv9Var.getClass();
        this.a = str;
        this.b = gv9Var;
        this.c = num;
        this.d = num2;
    }

    public static TopPerformanceCategoryUiModel a(TopPerformanceCategoryUiModel topPerformanceCategoryUiModel, int i) {
        String str = topPerformanceCategoryUiModel.a;
        gv9 gv9Var = topPerformanceCategoryUiModel.b;
        Integer num = (i & 4) != 0 ? topPerformanceCategoryUiModel.c : null;
        Integer num2 = (i & 8) != 0 ? topPerformanceCategoryUiModel.d : null;
        str.getClass();
        gv9Var.getClass();
        return new TopPerformanceCategoryUiModel(str, gv9Var, num, num2);
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    public final gvh e0() {
        return gvh.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopPerformanceCategoryUiModel)) {
            return false;
        }
        TopPerformanceCategoryUiModel topPerformanceCategoryUiModel = (TopPerformanceCategoryUiModel) obj;
        return Intrinsics.c(this.a, topPerformanceCategoryUiModel.a) && Intrinsics.c(this.b, topPerformanceCategoryUiModel.b) && Intrinsics.c(this.c, topPerformanceCategoryUiModel.c) && Intrinsics.c(this.d, topPerformanceCategoryUiModel.d);
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
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    public final String r0() {
        return "performances";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPerformanceCategoryUiModel(name=");
        sb.append(this.a);
        sb.append(", performanceList=");
        sb.append(this.b);
        sb.append(", informationTextRes=");
        return fc6.l(this.c, this.d, ", informationModalTextRes=", ")", sb);
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
    }
}
