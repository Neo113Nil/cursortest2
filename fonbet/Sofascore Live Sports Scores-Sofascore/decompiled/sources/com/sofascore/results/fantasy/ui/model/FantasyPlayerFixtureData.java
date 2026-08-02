package com.sofascore.results.fantasy.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ad7;
import defpackage.cd7;
import defpackage.dd7;
import defpackage.joa;
import defpackage.m97;
import defpackage.oea;
import defpackage.r5h;
import defpackage.rd7;
import defpackage.sd7;
import defpackage.wd;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/ui/model/FantasyPlayerFixtureData;", "Landroid/os/Parcelable;", "Companion", "cd7", "dd7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerFixtureData implements Parcelable {
    public static final joa[] d;
    public final sd7 a;
    public final rd7 b;
    public final ad7 c;

    @NotNull
    public static final dd7 Companion = new dd7();

    @NotNull
    public static final Parcelable.Creator<FantasyPlayerFixtureData> CREATOR = new wd(16);

    static {
        ysa ysaVar = ysa.b;
        d = new joa[]{ypa.a(ysaVar, new m97(8)), ypa.a(ysaVar, new m97(9)), ypa.a(ysaVar, new m97(10))};
    }

    public /* synthetic */ FantasyPlayerFixtureData(int i, sd7 sd7Var, rd7 rd7Var, ad7 ad7Var) {
        if (7 != (i & 7)) {
            oea.z(i, 7, cd7.a.getDescriptor());
            throw null;
        }
        this.a = sd7Var;
        this.b = rd7Var;
        this.c = ad7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyPlayerFixtureData)) {
            return false;
        }
        FantasyPlayerFixtureData fantasyPlayerFixtureData = (FantasyPlayerFixtureData) obj;
        return this.a == fantasyPlayerFixtureData.a && this.b == fantasyPlayerFixtureData.b && this.c == fantasyPlayerFixtureData.c;
    }

    public final int hashCode() {
        sd7 sd7Var = this.a;
        int hashCode = (sd7Var == null ? 0 : sd7Var.hashCode()) * 31;
        rd7 rd7Var = this.b;
        int hashCode2 = (hashCode + (rd7Var == null ? 0 : rd7Var.hashCode())) * 31;
        ad7 ad7Var = this.c;
        return hashCode2 + (ad7Var != null ? ad7Var.hashCode() : 0);
    }

    public final String toString() {
        return "FantasyPlayerFixtureData(missingType=" + this.a + ", missingReason=" + this.b + ", playerFixtureStatus=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        sd7 sd7Var = this.a;
        if (sd7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sd7Var.name());
        }
        rd7 rd7Var = this.b;
        if (rd7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rd7Var.name());
        }
        ad7 ad7Var = this.c;
        if (ad7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ad7Var.name());
        }
    }

    public FantasyPlayerFixtureData(sd7 sd7Var, rd7 rd7Var, ad7 ad7Var) {
        this.a = sd7Var;
        this.b = rd7Var;
        this.c = ad7Var;
    }
}
