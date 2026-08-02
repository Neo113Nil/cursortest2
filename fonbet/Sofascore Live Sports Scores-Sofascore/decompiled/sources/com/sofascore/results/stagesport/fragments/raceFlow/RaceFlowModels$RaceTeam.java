package com.sofascore.results.stagesport.fragments.raceFlow;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d1c;
import defpackage.dmi;
import defpackage.fc6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/sofascore/results/stagesport/fragments/raceFlow/RaceFlowModels$RaceTeam", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RaceFlowModels$RaceTeam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RaceFlowModels$RaceTeam> CREATOR = new d1c(21);
    public final int a;
    public final String b;
    public final int c;

    public RaceFlowModels$RaceTeam(int i, String str, int i2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RaceFlowModels$RaceTeam)) {
            return false;
        }
        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = (RaceFlowModels$RaceTeam) obj;
        return this.a == raceFlowModels$RaceTeam.a && Intrinsics.c(this.b, raceFlowModels$RaceTeam.b) && this.c == raceFlowModels$RaceTeam.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fc6.h(this.c, ")", dmi.t(this.a, "RaceTeam(id=", ", name=", this.b, ", colorInt="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
