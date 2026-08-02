package com.sofascore.results.onboarding.follow.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.onboarding.follow.model.OnboardingItemAdditionalIcon;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new OnboardingItemAdditionalIcon.TeamLogo(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new OnboardingItemAdditionalIcon.TeamLogo[i];
    }
}
