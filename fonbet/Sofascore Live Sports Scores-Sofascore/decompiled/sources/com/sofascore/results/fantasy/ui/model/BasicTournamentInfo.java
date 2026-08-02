package com.sofascore.results.fantasy.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.rp1;
import defpackage.sp1;
import defpackage.wd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/ui/model/BasicTournamentInfo;", "Landroid/os/Parcelable;", "Companion", "rp1", "sp1", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasicTournamentInfo implements Parcelable {
    public final int a;
    public final String b;
    public final int c;

    @NotNull
    public static final sp1 Companion = new sp1();

    @NotNull
    public static final Parcelable.Creator<BasicTournamentInfo> CREATOR = new wd(4);

    public /* synthetic */ BasicTournamentInfo(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            oea.z(i, 7, rp1.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicTournamentInfo)) {
            return false;
        }
        BasicTournamentInfo basicTournamentInfo = (BasicTournamentInfo) obj;
        return this.a == basicTournamentInfo.a && Intrinsics.c(this.b, basicTournamentInfo.b) && this.c == basicTournamentInfo.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fc6.h(this.c, ")", dmi.t(this.a, "BasicTournamentInfo(id=", ", name=", this.b, ", categoryId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    public BasicTournamentInfo(int i, String str, int i2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }
}
