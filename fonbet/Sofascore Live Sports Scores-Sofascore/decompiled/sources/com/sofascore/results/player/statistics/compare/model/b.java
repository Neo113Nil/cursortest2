package com.sofascore.results.player.statistics.compare.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ComparisonSeasonInfo.UniqueTournamentSeasonInfo(parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ComparisonSeasonInfo.UniqueTournamentSeasonInfo[i];
    }
}
