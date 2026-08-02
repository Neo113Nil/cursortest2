package com.sofascore.results.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        boolean z = parcel.readInt() != 0;
        int readInt2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt2);
        for (int i = 0; i != readInt2; i++) {
            arrayList.add(OnboardingItemUiModel.CREATOR.createFromParcel(parcel));
        }
        return new OnboardingViewModel.OnboardingSavedState(readInt, z, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new OnboardingViewModel.OnboardingSavedState[i];
    }
}
