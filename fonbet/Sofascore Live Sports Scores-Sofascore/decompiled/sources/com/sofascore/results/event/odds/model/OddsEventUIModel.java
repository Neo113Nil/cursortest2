package com.sofascore.results.event.odds.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d1c;
import defpackage.dmi;
import defpackage.me4;
import defpackage.w1l;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/event/odds/model/OddsEventUIModel;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OddsEventUIModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OddsEventUIModel> CREATOR = new d1c(10);
    public final int a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;

    public OddsEventUIModel(int i, Integer num, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = z;
    }

    public static OddsEventUIModel a(OddsEventUIModel oddsEventUIModel, String str) {
        int i = oddsEventUIModel.a;
        String str2 = oddsEventUIModel.c;
        Integer num = oddsEventUIModel.d;
        boolean z = oddsEventUIModel.e;
        oddsEventUIModel.getClass();
        str.getClass();
        str2.getClass();
        return new OddsEventUIModel(i, num, str, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OddsEventUIModel)) {
            return false;
        }
        OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) obj;
        return this.a == oddsEventUIModel.a && Intrinsics.c(this.b, oddsEventUIModel.b) && Intrinsics.c(this.c, oddsEventUIModel.c) && Intrinsics.c(this.d, oddsEventUIModel.d) && this.e == oddsEventUIModel.e;
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((c + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "OddsEventUIModel(id=", ", status=", this.b, ", sport=");
        me4.o(this.d, this.c, ", uniqueTournamentId=", ", shouldReverseTeams=", t);
        return wt3.p(t, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            w1l.u(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
