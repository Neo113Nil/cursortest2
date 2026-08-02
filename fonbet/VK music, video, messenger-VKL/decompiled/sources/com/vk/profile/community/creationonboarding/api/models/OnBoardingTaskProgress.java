package com.vk.profile.community.creationonboarding.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreationOnboardingTask.kt */
/* loaded from: classes5.dex */
public final class OnBoardingTaskProgress implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnBoardingTaskProgress[] $VALUES;
    public static final Parcelable.Creator<OnBoardingTaskProgress> CREATOR;
    public static final OnBoardingTaskProgress DONE;
    public static final OnBoardingTaskProgress IN_PROGRESS;

    /* compiled from: CreationOnboardingTask.kt */
    public static final class a implements Parcelable.Creator<OnBoardingTaskProgress> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingTaskProgress createFromParcel(Parcel parcel) {
            return OnBoardingTaskProgress.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingTaskProgress[] newArray(int i) {
            return new OnBoardingTaskProgress[i];
        }
    }

    static {
        OnBoardingTaskProgress onBoardingTaskProgress = new OnBoardingTaskProgress("IN_PROGRESS", 0);
        IN_PROGRESS = onBoardingTaskProgress;
        OnBoardingTaskProgress onBoardingTaskProgress2 = new OnBoardingTaskProgress("DONE", 1);
        DONE = onBoardingTaskProgress2;
        OnBoardingTaskProgress[] onBoardingTaskProgressArr = {onBoardingTaskProgress, onBoardingTaskProgress2};
        $VALUES = onBoardingTaskProgressArr;
        $ENTRIES = new asp(onBoardingTaskProgressArr);
        CREATOR = new a();
    }

    public OnBoardingTaskProgress() {
        throw null;
    }

    public static OnBoardingTaskProgress valueOf(String str) {
        return (OnBoardingTaskProgress) Enum.valueOf(OnBoardingTaskProgress.class, str);
    }

    public static OnBoardingTaskProgress[] values() {
        return (OnBoardingTaskProgress[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
