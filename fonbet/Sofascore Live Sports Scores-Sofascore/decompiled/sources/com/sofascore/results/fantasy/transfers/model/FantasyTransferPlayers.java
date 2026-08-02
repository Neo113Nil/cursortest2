package com.sofascore.results.fantasy.transfers.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/transfers/model/FantasyTransferPlayers;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyTransferPlayers implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FantasyTransferPlayers> CREATOR = new wd(23);
    public final FantasyTransferPlayer a;
    public final FantasyTransferPlayer b;

    public FantasyTransferPlayers(FantasyTransferPlayer fantasyTransferPlayer, FantasyTransferPlayer fantasyTransferPlayer2) {
        fantasyTransferPlayer.getClass();
        fantasyTransferPlayer2.getClass();
        this.a = fantasyTransferPlayer;
        this.b = fantasyTransferPlayer2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyTransferPlayers)) {
            return false;
        }
        FantasyTransferPlayers fantasyTransferPlayers = (FantasyTransferPlayers) obj;
        return Intrinsics.c(this.a, fantasyTransferPlayers.a) && Intrinsics.c(this.b, fantasyTransferPlayers.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FantasyTransferPlayers(playerIn=" + this.a + ", playerOut=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
