package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LottieAnimationView.SavedState savedState = new LottieAnimationView.SavedState(parcel);
        savedState.a = parcel.readString();
        savedState.c = parcel.readFloat();
        savedState.d = parcel.readInt() == 1;
        savedState.e = parcel.readString();
        savedState.f = parcel.readInt();
        savedState.g = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LottieAnimationView.SavedState[i];
    }
}
