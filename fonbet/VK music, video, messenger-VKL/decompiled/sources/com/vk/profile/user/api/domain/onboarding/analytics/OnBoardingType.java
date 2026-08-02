package com.vk.profile.user.api.domain.onboarding.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnBoardingType.kt */
/* loaded from: classes5.dex */
public final class OnBoardingType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnBoardingType[] $VALUES;
    public static final Parcelable.Creator<OnBoardingType> CREATOR;
    public static final OnBoardingType PASSKEY;
    public static final OnBoardingType PHOTO_FLOW;
    public static final OnBoardingType PROFILE;

    /* compiled from: OnBoardingType.kt */
    public static final class a implements Parcelable.Creator<OnBoardingType> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingType createFromParcel(Parcel parcel) {
            return OnBoardingType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingType[] newArray(int i) {
            return new OnBoardingType[i];
        }
    }

    static {
        OnBoardingType onBoardingType = new OnBoardingType("PROFILE", 0);
        PROFILE = onBoardingType;
        OnBoardingType onBoardingType2 = new OnBoardingType("PHOTO_FLOW", 1);
        PHOTO_FLOW = onBoardingType2;
        OnBoardingType onBoardingType3 = new OnBoardingType("PASSKEY", 2);
        PASSKEY = onBoardingType3;
        OnBoardingType[] onBoardingTypeArr = {onBoardingType, onBoardingType2, onBoardingType3};
        $VALUES = onBoardingTypeArr;
        $ENTRIES = new asp(onBoardingTypeArr);
        CREATOR = new a();
    }

    public OnBoardingType() {
        throw null;
    }

    public static OnBoardingType valueOf(String str) {
        return (OnBoardingType) Enum.valueOf(OnBoardingType.class, str);
    }

    public static OnBoardingType[] values() {
        return (OnBoardingType[]) $VALUES.clone();
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
