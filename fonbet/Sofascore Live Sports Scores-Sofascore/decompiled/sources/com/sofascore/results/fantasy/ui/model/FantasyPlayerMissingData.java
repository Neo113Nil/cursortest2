package com.sofascore.results.fantasy.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.joa;
import defpackage.m97;
import defpackage.mz1;
import defpackage.oea;
import defpackage.pd7;
import defpackage.qd7;
import defpackage.r5h;
import defpackage.rd7;
import defpackage.sd7;
import defpackage.wd;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/ui/model/FantasyPlayerMissingData;", "Landroid/os/Parcelable;", "Companion", "pd7", "qd7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerMissingData implements Parcelable {
    public static final joa[] d;
    public final sd7 a;
    public final rd7 b;
    public final String c;

    @NotNull
    public static final qd7 Companion = new qd7();

    @NotNull
    public static final Parcelable.Creator<FantasyPlayerMissingData> CREATOR = new wd(18);

    static {
        ysa ysaVar = ysa.b;
        d = new joa[]{ypa.a(ysaVar, new m97(18)), ypa.a(ysaVar, new m97(19)), null};
    }

    public /* synthetic */ FantasyPlayerMissingData(int i, sd7 sd7Var, rd7 rd7Var, String str) {
        if (7 != (i & 7)) {
            oea.z(i, 7, pd7.a.getDescriptor());
            throw null;
        }
        this.a = sd7Var;
        this.b = rd7Var;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyPlayerMissingData)) {
            return false;
        }
        FantasyPlayerMissingData fantasyPlayerMissingData = (FantasyPlayerMissingData) obj;
        return this.a == fantasyPlayerMissingData.a && this.b == fantasyPlayerMissingData.b && Intrinsics.c(this.c, fantasyPlayerMissingData.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyPlayerMissingData(type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", description=");
        return mz1.o(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }

    public FantasyPlayerMissingData(sd7 sd7Var, rd7 rd7Var, String str) {
        sd7Var.getClass();
        rd7Var.getClass();
        this.a = sd7Var;
        this.b = rd7Var;
        this.c = str;
    }
}
