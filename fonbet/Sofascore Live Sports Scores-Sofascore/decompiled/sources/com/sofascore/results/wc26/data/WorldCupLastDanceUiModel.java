package com.sofascore.results.wc26.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.dyh;
import defpackage.fc6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/wc26/data/WorldCupLastDanceUiModel;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WorldCupLastDanceUiModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WorldCupLastDanceUiModel> CREATOR = new dyh(18);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public WorldCupLastDanceUiModel(int i, String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorldCupLastDanceUiModel)) {
            return false;
        }
        WorldCupLastDanceUiModel worldCupLastDanceUiModel = (WorldCupLastDanceUiModel) obj;
        return this.a == worldCupLastDanceUiModel.a && Intrinsics.c(this.b, worldCupLastDanceUiModel.b) && Intrinsics.c(this.c, worldCupLastDanceUiModel.c) && Intrinsics.c(this.d, worldCupLastDanceUiModel.d) && Intrinsics.c(this.e, worldCupLastDanceUiModel.e) && Intrinsics.c(this.f, worldCupLastDanceUiModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dmi.c(dmi.c(dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "WorldCupLastDanceUiModel(playerId=", ", playerName=", this.b, ", imageUrl=");
        bf3.v(t, this.c, ", title=", this.d, ", description=");
        return fc6.o(t, this.e, ", shareText=", this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
