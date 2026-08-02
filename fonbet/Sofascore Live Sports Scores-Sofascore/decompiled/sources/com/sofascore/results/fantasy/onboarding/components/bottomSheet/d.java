package com.sofascore.results.fantasy.onboarding.components.bottomSheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new FantasySectionedInfoType.WeeklyCompetitions(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FantasySectionedInfoType.WeeklyCompetitions[i];
    }
}
