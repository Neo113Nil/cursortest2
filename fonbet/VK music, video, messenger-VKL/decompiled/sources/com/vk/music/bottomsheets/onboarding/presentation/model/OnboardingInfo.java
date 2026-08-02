package com.vk.music.bottomsheets.onboarding.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import xsna.epx;
import xsna.ho8;

/* compiled from: OnboardingInfo.kt */
/* loaded from: classes3.dex */
public final class OnboardingInfo implements Parcelable {
    public static final Parcelable.Creator<OnboardingInfo> CREATOR = new a();
    public final AudioOnboardingScenarioType b;
    public final String c;

    /* compiled from: OnboardingInfo.kt */
    public static final class a implements Parcelable.Creator<OnboardingInfo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingInfo createFromParcel(Parcel parcel) {
            return new OnboardingInfo(AudioOnboardingScenarioType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingInfo[] newArray(int i) {
            return new OnboardingInfo[i];
        }
    }

    static {
        new OnboardingInfo(AudioOnboardingScenarioType.CA1, "");
    }

    public OnboardingInfo(AudioOnboardingScenarioType audioOnboardingScenarioType, String str) {
        this.b = audioOnboardingScenarioType;
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
        if (!(obj instanceof OnboardingInfo)) {
            return false;
        }
        OnboardingInfo onboardingInfo = (OnboardingInfo) obj;
        return this.b == onboardingInfo.b && epx.f(this.c, onboardingInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingInfo(scenarioType=");
        sb.append(this.b);
        sb.append(", url=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }
}
