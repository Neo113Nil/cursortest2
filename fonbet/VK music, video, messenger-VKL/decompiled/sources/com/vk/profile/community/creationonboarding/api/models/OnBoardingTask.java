package com.vk.profile.community.creationonboarding.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: CreationOnboardingTask.kt */
/* loaded from: classes5.dex */
public final class OnBoardingTask implements Parcelable {
    public static final Parcelable.Creator<OnBoardingTask> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final String d;
    public final OnBoardingTaskType e;
    public final OnBoardingTaskProgress f;
    public final String g;

    /* compiled from: CreationOnboardingTask.kt */
    public static final class a implements Parcelable.Creator<OnBoardingTask> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingTask createFromParcel(Parcel parcel) {
            return new OnBoardingTask(parcel.readString(), parcel.readInt() != 0, parcel.readString(), OnBoardingTaskType.CREATOR.createFromParcel(parcel), OnBoardingTaskProgress.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingTask[] newArray(int i) {
            return new OnBoardingTask[i];
        }
    }

    public OnBoardingTask(String str, boolean z, String str2, OnBoardingTaskType onBoardingTaskType, OnBoardingTaskProgress onBoardingTaskProgress, String str3) {
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = onBoardingTaskType;
        this.f = onBoardingTaskProgress;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnBoardingTask)) {
            return false;
        }
        OnBoardingTask onBoardingTask = (OnBoardingTask) obj;
        return epx.f(this.b, onBoardingTask.b) && this.c == onBoardingTask.c && epx.f(this.d, onBoardingTask.d) && this.e == onBoardingTask.e && this.f == onBoardingTask.f && epx.f(this.g, onBoardingTask.g);
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnBoardingTask(title=");
        sb.append(this.b);
        sb.append(", shouldHighlightAnimate=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", progress=");
        sb.append(this.f);
        sb.append(", url=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
        this.f.writeToParcel(parcel, i);
        parcel.writeString(this.g);
    }
}
