package com.vk.music.bottomsheets.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: OnboardingInfoEntity.kt */
/* loaded from: classes3.dex */
public final class OnboardingInfoEntity implements Parcelable {
    public static final Parcelable.Creator<OnboardingInfoEntity> CREATOR = new a();
    public final AudioOnboardingScenarioType b;
    public final String c;

    /* compiled from: OnboardingInfoEntity.kt */
    public static final class a implements Parcelable.Creator<OnboardingInfoEntity> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingInfoEntity createFromParcel(Parcel parcel) {
            return new OnboardingInfoEntity(AudioOnboardingScenarioType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingInfoEntity[] newArray(int i) {
            return new OnboardingInfoEntity[i];
        }
    }

    public OnboardingInfoEntity(AudioOnboardingScenarioType audioOnboardingScenarioType, String str) {
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
        if (!(obj instanceof OnboardingInfoEntity)) {
            return false;
        }
        OnboardingInfoEntity onboardingInfoEntity = (OnboardingInfoEntity) obj;
        return this.b == onboardingInfoEntity.b && epx.f(this.c, onboardingInfoEntity.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingInfoEntity(scenarioType=");
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
