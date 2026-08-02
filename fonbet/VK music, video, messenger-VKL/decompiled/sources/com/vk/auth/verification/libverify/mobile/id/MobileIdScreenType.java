package com.vk.auth.verification.libverify.mobile.id;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileIdScreenType.kt */
/* loaded from: classes15.dex */
public final class MobileIdScreenType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileIdScreenType[] $VALUES;
    public static final MobileIdScreenType AUTH;
    public static final Parcelable.Creator<MobileIdScreenType> CREATOR;
    public static final MobileIdScreenType SIGN_UP;

    /* compiled from: MobileIdScreenType.kt */
    public static final class a implements Parcelable.Creator<MobileIdScreenType> {
        @Override // android.os.Parcelable.Creator
        public final MobileIdScreenType createFromParcel(Parcel parcel) {
            return MobileIdScreenType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MobileIdScreenType[] newArray(int i) {
            return new MobileIdScreenType[i];
        }
    }

    static {
        MobileIdScreenType mobileIdScreenType = new MobileIdScreenType("AUTH", 0);
        AUTH = mobileIdScreenType;
        MobileIdScreenType mobileIdScreenType2 = new MobileIdScreenType("SIGN_UP", 1);
        SIGN_UP = mobileIdScreenType2;
        MobileIdScreenType[] mobileIdScreenTypeArr = {mobileIdScreenType, mobileIdScreenType2};
        $VALUES = mobileIdScreenTypeArr;
        $ENTRIES = new asp(mobileIdScreenTypeArr);
        CREATOR = new a();
    }

    public MobileIdScreenType() {
        throw null;
    }

    public static MobileIdScreenType valueOf(String str) {
        return (MobileIdScreenType) Enum.valueOf(MobileIdScreenType.class, str);
    }

    public static MobileIdScreenType[] values() {
        return (MobileIdScreenType[]) $VALUES.clone();
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
