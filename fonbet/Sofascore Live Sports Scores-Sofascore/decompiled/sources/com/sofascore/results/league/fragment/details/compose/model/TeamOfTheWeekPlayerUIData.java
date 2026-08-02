package com.sofascore.results.league.fragment.details.compose.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import defpackage.dyh;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/league/fragment/details/compose/model/TeamOfTheWeekPlayerUIData;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TeamOfTheWeekPlayerUIData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TeamOfTheWeekPlayerUIData> CREATOR = new dyh(5);
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    public final Double e;

    public TeamOfTheWeekPlayerUIData(int i, String str, int i2, boolean z, Double d) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamOfTheWeekPlayerUIData)) {
            return false;
        }
        TeamOfTheWeekPlayerUIData teamOfTheWeekPlayerUIData = (TeamOfTheWeekPlayerUIData) obj;
        return this.a == teamOfTheWeekPlayerUIData.a && Intrinsics.c(this.b, teamOfTheWeekPlayerUIData.b) && this.c == teamOfTheWeekPlayerUIData.c && this.d == teamOfTheWeekPlayerUIData.d && Intrinsics.c(this.e, teamOfTheWeekPlayerUIData.e);
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        Double d = this.e;
        return e + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TeamOfTheWeekPlayerUIData(id=", ", name=", this.b, ", teamId=");
        t.append(this.c);
        t.append(", showAvgRating=");
        t.append(this.d);
        t.append(", avgRating=");
        t.append(this.e);
        t.append(")");
        return t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Double d = this.e;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }
}
