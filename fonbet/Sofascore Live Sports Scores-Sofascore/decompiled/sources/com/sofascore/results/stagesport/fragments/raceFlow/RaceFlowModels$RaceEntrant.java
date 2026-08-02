package com.sofascore.results.stagesport.fragments.raceFlow;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bf3;
import defpackage.d1c;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.wt3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/sofascore/results/stagesport/fragments/raceFlow/RaceFlowModels$RaceEntrant", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RaceFlowModels$RaceEntrant implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RaceFlowModels$RaceEntrant> CREATOR = new d1c(20);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final RaceFlowModels$RaceTeam e;
    public final int f;
    public final boolean g;

    public RaceFlowModels$RaceEntrant(int i, int i2, String str, String str2, RaceFlowModels$RaceTeam raceFlowModels$RaceTeam, int i3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = raceFlowModels$RaceTeam;
        this.f = i3;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RaceFlowModels$RaceEntrant)) {
            return false;
        }
        RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = (RaceFlowModels$RaceEntrant) obj;
        return this.a == raceFlowModels$RaceEntrant.a && this.b == raceFlowModels$RaceEntrant.b && Intrinsics.c(this.c, raceFlowModels$RaceEntrant.c) && Intrinsics.c(this.d, raceFlowModels$RaceEntrant.d) && Intrinsics.c(this.e, raceFlowModels$RaceEntrant.e) && this.f == raceFlowModels$RaceEntrant.f && this.g == raceFlowModels$RaceEntrant.g;
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = this.e;
        return Boolean.hashCode(this.g) + wv8.a(this.f, (c + (raceFlowModels$RaceTeam == null ? 0 : raceFlowModels$RaceTeam.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "RaceEntrant(id=", ", number=", ", nameCode=");
        bf3.v(s, this.c, ", name=", this.d, ", team=");
        s.append(this.e);
        s.append(", startEntry=");
        s.append(this.f);
        s.append(", isDnf=");
        return wt3.p(s, this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = this.e;
        if (raceFlowModels$RaceTeam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            raceFlowModels$RaceTeam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
