package com.vk.dto.stories.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyTargetAdData.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MyTargetAdType[] $VALUES;
    public static final MyTargetAdType APP;
    public static final MyTargetAdType APP_SLIDER;
    public static final MyTargetAdType APP_VIDEO;
    public static final Parcelable.Creator<MyTargetAdType> CREATOR;
    public static final MyTargetAdType LEAD_FORM_PHOTO;
    public static final MyTargetAdType LEAD_FORM_VIDEO;
    public static final MyTargetAdType MOB;
    public static final MyTargetAdType SITE;
    public static final MyTargetAdType SITE_SLIDER;
    public static final MyTargetAdType SITE_VIDEO;
    public static final MyTargetAdType SURVEY_PHOTO;
    public static final MyTargetAdType SURVEY_VIDEO;
    public static final MyTargetAdType VK_MINIAPP;
    public static final MyTargetAdType VK_MINIAPP_VIDEO;
    public static final MyTargetAdType VK_USER;
    public static final MyTargetAdType VK_USER_VIDEO;

    /* compiled from: MyTargetAdData.kt */
    public static final class a implements Parcelable.Creator<MyTargetAdType> {
        @Override // android.os.Parcelable.Creator
        public final MyTargetAdType createFromParcel(Parcel parcel) {
            return MyTargetAdType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MyTargetAdType[] newArray(int i) {
            return new MyTargetAdType[i];
        }
    }

    static {
        MyTargetAdType myTargetAdType = new MyTargetAdType("SITE", 0);
        SITE = myTargetAdType;
        MyTargetAdType myTargetAdType2 = new MyTargetAdType("SITE_SLIDER", 1);
        SITE_SLIDER = myTargetAdType2;
        MyTargetAdType myTargetAdType3 = new MyTargetAdType("SITE_VIDEO", 2);
        SITE_VIDEO = myTargetAdType3;
        MyTargetAdType myTargetAdType4 = new MyTargetAdType("APP", 3);
        APP = myTargetAdType4;
        MyTargetAdType myTargetAdType5 = new MyTargetAdType("APP_SLIDER", 4);
        APP_SLIDER = myTargetAdType5;
        MyTargetAdType myTargetAdType6 = new MyTargetAdType("APP_VIDEO", 5);
        APP_VIDEO = myTargetAdType6;
        MyTargetAdType myTargetAdType7 = new MyTargetAdType("LEAD_FORM_PHOTO", 6);
        LEAD_FORM_PHOTO = myTargetAdType7;
        MyTargetAdType myTargetAdType8 = new MyTargetAdType("LEAD_FORM_VIDEO", 7);
        LEAD_FORM_VIDEO = myTargetAdType8;
        MyTargetAdType myTargetAdType9 = new MyTargetAdType("SURVEY_PHOTO", 8);
        SURVEY_PHOTO = myTargetAdType9;
        MyTargetAdType myTargetAdType10 = new MyTargetAdType("SURVEY_VIDEO", 9);
        SURVEY_VIDEO = myTargetAdType10;
        MyTargetAdType myTargetAdType11 = new MyTargetAdType("VK_MINIAPP", 10);
        VK_MINIAPP = myTargetAdType11;
        MyTargetAdType myTargetAdType12 = new MyTargetAdType("VK_MINIAPP_VIDEO", 11);
        VK_MINIAPP_VIDEO = myTargetAdType12;
        MyTargetAdType myTargetAdType13 = new MyTargetAdType("VK_USER", 12);
        VK_USER = myTargetAdType13;
        MyTargetAdType myTargetAdType14 = new MyTargetAdType("VK_USER_VIDEO", 13);
        VK_USER_VIDEO = myTargetAdType14;
        MyTargetAdType myTargetAdType15 = new MyTargetAdType("MOB", 14);
        MOB = myTargetAdType15;
        MyTargetAdType[] myTargetAdTypeArr = {myTargetAdType, myTargetAdType2, myTargetAdType3, myTargetAdType4, myTargetAdType5, myTargetAdType6, myTargetAdType7, myTargetAdType8, myTargetAdType9, myTargetAdType10, myTargetAdType11, myTargetAdType12, myTargetAdType13, myTargetAdType14, myTargetAdType15};
        $VALUES = myTargetAdTypeArr;
        $ENTRIES = new asp(myTargetAdTypeArr);
        CREATOR = new a();
    }

    public MyTargetAdType() {
        throw null;
    }

    public static MyTargetAdType valueOf(String str) {
        return (MyTargetAdType) Enum.valueOf(MyTargetAdType.class, str);
    }

    public static MyTargetAdType[] values() {
        return (MyTargetAdType[]) $VALUES.clone();
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
