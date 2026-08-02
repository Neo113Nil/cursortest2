package com.sofascore.results.fantasy.transfers.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.me4;
import defpackage.mz1;
import defpackage.rz6;
import defpackage.wd;
import defpackage.wt3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/transfers/model/FantasyTransferPlayer;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyTransferPlayer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FantasyTransferPlayer> CREATOR = new wd(22);
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final rz6 g;
    public final Float h;

    public FantasyTransferPlayer(String str, int i, int i2, int i3, String str2, float f, rz6 rz6Var, Float f2) {
        str.getClass();
        str2.getClass();
        rz6Var.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = f;
        this.g = rz6Var;
        this.h = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyTransferPlayer)) {
            return false;
        }
        FantasyTransferPlayer fantasyTransferPlayer = (FantasyTransferPlayer) obj;
        return Intrinsics.c(this.a, fantasyTransferPlayer.a) && this.b == fantasyTransferPlayer.b && this.c == fantasyTransferPlayer.c && this.d == fantasyTransferPlayer.d && Intrinsics.c(this.e, fantasyTransferPlayer.e) && Float.compare(this.f, fantasyTransferPlayer.f) == 0 && this.g == fantasyTransferPlayer.g && Intrinsics.c(this.h, fantasyTransferPlayer.h);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + fc6.a(this.f, dmi.c(wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31)) * 31;
        Float f = this.h;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "FantasyTransferPlayer(name=", this.a, ", playerId=", ", fantasyPlayerId=");
        me4.q(q, this.c, ", teamId=", this.d, ", teamNameCode=");
        q.append(this.e);
        q.append(", price=");
        q.append(this.f);
        q.append(", position=");
        q.append(this.g);
        q.append(", expectedPoints=");
        q.append(this.h);
        q.append(")");
        return q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeFloat(this.f);
        parcel.writeString(this.g.name());
        Float f = this.h;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            wt3.w(parcel, 1, f);
        }
    }
}
