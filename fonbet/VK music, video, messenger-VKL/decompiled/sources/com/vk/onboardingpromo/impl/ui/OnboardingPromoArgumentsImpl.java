package com.vk.onboardingpromo.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.onboardingpromo.api.OnboardingPromoArguments;
import com.vk.onboardingpromo.impl.data.OnboardingPromoConfig;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import xsna.epx;

/* compiled from: OnboardingPromoArgumentsImpl.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoArgumentsImpl implements OnboardingPromoArguments {
    public static final Parcelable.Creator<OnboardingPromoArgumentsImpl> CREATOR = new a();
    public final OnboardingPromoDo b;
    public final OnboardingPromoConfig c;

    /* compiled from: OnboardingPromoArgumentsImpl.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoArgumentsImpl> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoArgumentsImpl createFromParcel(Parcel parcel) {
            return new OnboardingPromoArgumentsImpl(OnboardingPromoDo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OnboardingPromoConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoArgumentsImpl[] newArray(int i) {
            return new OnboardingPromoArgumentsImpl[i];
        }
    }

    public OnboardingPromoArgumentsImpl(OnboardingPromoDo onboardingPromoDo, OnboardingPromoConfig onboardingPromoConfig) {
        this.b = onboardingPromoDo;
        this.c = onboardingPromoConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoArgumentsImpl)) {
            return false;
        }
        OnboardingPromoArgumentsImpl onboardingPromoArgumentsImpl = (OnboardingPromoArgumentsImpl) obj;
        return epx.f(this.b, onboardingPromoArgumentsImpl.b) && epx.f(this.c, onboardingPromoArgumentsImpl.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        OnboardingPromoConfig onboardingPromoConfig = this.c;
        return hashCode + (onboardingPromoConfig == null ? 0 : onboardingPromoConfig.hashCode());
    }

    public final String toString() {
        return "OnboardingPromoArgumentsImpl(promoDo=" + this.b + ", config=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        OnboardingPromoConfig onboardingPromoConfig = this.c;
        if (onboardingPromoConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboardingPromoConfig.writeToParcel(parcel, i);
        }
    }
}
