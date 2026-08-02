package com.vk.profile.community.creationonboarding.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreationOnboardingTask.kt */
/* loaded from: classes5.dex */
public final class OnBoardingTaskType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnBoardingTaskType[] $VALUES;
    public static final OnBoardingTaskType ACTION_BUTTON;
    public static final OnBoardingTaskType ADS;
    public static final OnBoardingTaskType AVATAR;
    public static final OnBoardingTaskType CONTACTS;
    public static final OnBoardingTaskType COPY;
    public static final OnBoardingTaskType COVER;
    public static final Parcelable.Creator<OnBoardingTaskType> CREATOR;
    public static final OnBoardingTaskType DESCRIPTION;
    public static final OnBoardingTaskType GOODS;
    public static final OnBoardingTaskType INVITE_FRIENDS;
    public static final OnBoardingTaskType POST;
    public static final OnBoardingTaskType SERVICES;
    public static final OnBoardingTaskType STORY;

    /* compiled from: CreationOnboardingTask.kt */
    public static final class a implements Parcelable.Creator<OnBoardingTaskType> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingTaskType createFromParcel(Parcel parcel) {
            return OnBoardingTaskType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingTaskType[] newArray(int i) {
            return new OnBoardingTaskType[i];
        }
    }

    static {
        OnBoardingTaskType onBoardingTaskType = new OnBoardingTaskType("COVER", 0);
        COVER = onBoardingTaskType;
        OnBoardingTaskType onBoardingTaskType2 = new OnBoardingTaskType(NativeAdContent.ViewTag.AD_DESCRIPTION, 1);
        DESCRIPTION = onBoardingTaskType2;
        OnBoardingTaskType onBoardingTaskType3 = new OnBoardingTaskType("AVATAR", 2);
        AVATAR = onBoardingTaskType3;
        OnBoardingTaskType onBoardingTaskType4 = new OnBoardingTaskType("STORY", 3);
        STORY = onBoardingTaskType4;
        OnBoardingTaskType onBoardingTaskType5 = new OnBoardingTaskType("INVITE_FRIENDS", 4);
        INVITE_FRIENDS = onBoardingTaskType5;
        OnBoardingTaskType onBoardingTaskType6 = new OnBoardingTaskType("POST", 5);
        POST = onBoardingTaskType6;
        OnBoardingTaskType onBoardingTaskType7 = new OnBoardingTaskType("COPY", 6);
        COPY = onBoardingTaskType7;
        OnBoardingTaskType onBoardingTaskType8 = new OnBoardingTaskType("CONTACTS", 7);
        CONTACTS = onBoardingTaskType8;
        OnBoardingTaskType onBoardingTaskType9 = new OnBoardingTaskType("ACTION_BUTTON", 8);
        ACTION_BUTTON = onBoardingTaskType9;
        OnBoardingTaskType onBoardingTaskType10 = new OnBoardingTaskType("GOODS", 9);
        GOODS = onBoardingTaskType10;
        OnBoardingTaskType onBoardingTaskType11 = new OnBoardingTaskType("SERVICES", 10);
        SERVICES = onBoardingTaskType11;
        OnBoardingTaskType onBoardingTaskType12 = new OnBoardingTaskType("ADS", 11);
        ADS = onBoardingTaskType12;
        OnBoardingTaskType[] onBoardingTaskTypeArr = {onBoardingTaskType, onBoardingTaskType2, onBoardingTaskType3, onBoardingTaskType4, onBoardingTaskType5, onBoardingTaskType6, onBoardingTaskType7, onBoardingTaskType8, onBoardingTaskType9, onBoardingTaskType10, onBoardingTaskType11, onBoardingTaskType12};
        $VALUES = onBoardingTaskTypeArr;
        $ENTRIES = new asp(onBoardingTaskTypeArr);
        CREATOR = new a();
    }

    public OnBoardingTaskType() {
        throw null;
    }

    public static zrp<OnBoardingTaskType> i() {
        return $ENTRIES;
    }

    public static OnBoardingTaskType valueOf(String str) {
        return (OnBoardingTaskType) Enum.valueOf(OnBoardingTaskType.class, str);
    }

    public static OnBoardingTaskType[] values() {
        return (OnBoardingTaskType[]) $VALUES.clone();
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
