package com.vk.video.ui.upload.impl.publish.presentation.author.compose.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;

/* compiled from: OnboardingViewState.kt */
/* loaded from: classes7.dex */
public final class OnboardingViewState implements Parcelable {
    public static final Parcelable.Creator<OnboardingViewState> CREATOR = new a();
    public final String b;
    public final boolean c;

    /* compiled from: OnboardingViewState.kt */
    public static final class a implements Parcelable.Creator<OnboardingViewState> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingViewState createFromParcel(Parcel parcel) {
            return new OnboardingViewState(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingViewState[] newArray(int i) {
            return new OnboardingViewState[i];
        }
    }

    public OnboardingViewState(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingViewState)) {
            return false;
        }
        OnboardingViewState onboardingViewState = (OnboardingViewState) obj;
        return epx.f(this.b, onboardingViewState.b) && this.c == onboardingViewState.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingViewState(title=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
