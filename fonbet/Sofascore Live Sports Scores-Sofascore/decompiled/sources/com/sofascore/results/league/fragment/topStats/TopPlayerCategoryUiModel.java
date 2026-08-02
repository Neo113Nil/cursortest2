package com.sofascore.results.league.fragment.topStats;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.network.response.SearchResponseKt;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/league/fragment/topStats/TopPlayerCategoryUiModel;", "Lcom/sofascore/results/league/fragment/topStats/TopStatsCategory;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TopPlayerCategoryUiModel implements TopStatsCategory, Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopPlayerCategoryUiModel> CREATOR = new dyh(10);
    public final String a;
    public final gv9 b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public TopPlayerCategoryUiModel(String str, gv9 gv9Var, Integer num, Integer num2, Integer num3) {
        str.getClass();
        gv9Var.getClass();
        this.a = str;
        this.b = gv9Var;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    public static TopPlayerCategoryUiModel a(TopPlayerCategoryUiModel topPlayerCategoryUiModel, gv9 gv9Var, int i) {
        String str = topPlayerCategoryUiModel.a;
        if ((i & 2) != 0) {
            gv9Var = topPlayerCategoryUiModel.b;
        }
        gv9 gv9Var2 = gv9Var;
        Integer num = (i & 4) != 0 ? topPlayerCategoryUiModel.c : null;
        Integer num2 = (i & 8) != 0 ? topPlayerCategoryUiModel.d : null;
        Integer num3 = topPlayerCategoryUiModel.e;
        str.getClass();
        gv9Var2.getClass();
        return new TopPlayerCategoryUiModel(str, gv9Var2, num, num2, num3);
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
        return gvh.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopPlayerCategoryUiModel)) {
            return false;
        }
        TopPlayerCategoryUiModel topPlayerCategoryUiModel = (TopPlayerCategoryUiModel) obj;
        return Intrinsics.c(this.a, topPlayerCategoryUiModel.a) && Intrinsics.c(this.b, topPlayerCategoryUiModel.b) && Intrinsics.c(this.c, topPlayerCategoryUiModel.c) && Intrinsics.c(this.d, topPlayerCategoryUiModel.d) && Intrinsics.c(this.e, topPlayerCategoryUiModel.e);
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
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // com.sofascore.results.league.fragment.topStats.TopStatsCategory
    public final String r0() {
        return SearchResponseKt.PLAYER_ENTITY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPlayerCategoryUiModel(name=");
        sb.append(this.a);
        sb.append(", playerList=");
        sb.append(this.b);
        sb.append(", informationTextRes=");
        vxd.r(this.c, this.d, ", informationModalTextRes=", ", drawableRes=", sb);
        return vxd.n(sb, this.e, ")");
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
        Integer num3 = this.e;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num3);
        }
    }
}
