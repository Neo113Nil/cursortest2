package com.sofascore.results.league.fragment.details.compose.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dyh;
import defpackage.gv9;
import defpackage.ljg;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/league/fragment/details/compose/model/TeamOfTheWeekFieldUIData;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TeamOfTheWeekFieldUIData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TeamOfTheWeekFieldUIData> CREATOR = new dyh(4);
    public final String a;
    public final gv9 b;
    public final gv9 c;

    public TeamOfTheWeekFieldUIData(gv9 gv9Var, gv9 gv9Var2, String str) {
        str.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = str;
        this.b = gv9Var;
        this.c = gv9Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamOfTheWeekFieldUIData)) {
            return false;
        }
        TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData = (TeamOfTheWeekFieldUIData) obj;
        return Intrinsics.c(this.a, teamOfTheWeekFieldUIData.a) && Intrinsics.c(this.b, teamOfTheWeekFieldUIData.b) && Intrinsics.c(this.c, teamOfTheWeekFieldUIData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TeamOfTheWeekFieldUIData(sport=" + this.a + ", formation=" + this.b + ", players=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        gv9 gv9Var = this.b;
        parcel.writeInt(gv9Var.size());
        Iterator it = gv9Var.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
        gv9 gv9Var2 = this.c;
        parcel.writeInt(gv9Var2.size());
        Iterator it2 = gv9Var2.iterator();
        while (it2.hasNext()) {
            ((TeamOfTheWeekPlayerUIData) it2.next()).writeToParcel(parcel, i);
        }
    }
}
