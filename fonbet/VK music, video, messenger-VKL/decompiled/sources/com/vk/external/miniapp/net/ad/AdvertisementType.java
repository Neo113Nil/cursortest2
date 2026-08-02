package com.vk.external.miniapp.net.ad;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertisementType.kt */
/* loaded from: classes18.dex */
public final class AdvertisementType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdvertisementType[] $VALUES;
    public static final Parcelable.Creator<AdvertisementType> CREATOR;
    public static final b Companion;
    public static final AdvertisementType INTERSTITIAL;
    public static final AdvertisementType MULTI_INTERSTITIAL;
    public static final AdvertisementType REWARD;

    /* compiled from: AdvertisementType.kt */
    public static final class a implements Parcelable.Creator<AdvertisementType> {
        @Override // android.os.Parcelable.Creator
        public final AdvertisementType createFromParcel(Parcel parcel) {
            return AdvertisementType.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertisementType[] newArray(int i) {
            return new AdvertisementType[i];
        }
    }

    /* compiled from: AdvertisementType.kt */
    public static final class b {
    }

    static {
        AdvertisementType advertisementType = new AdvertisementType("REWARD", 0);
        REWARD = advertisementType;
        AdvertisementType advertisementType2 = new AdvertisementType("MULTI_INTERSTITIAL", 1);
        MULTI_INTERSTITIAL = advertisementType2;
        AdvertisementType advertisementType3 = new AdvertisementType("INTERSTITIAL", 2);
        INTERSTITIAL = advertisementType3;
        AdvertisementType[] advertisementTypeArr = {advertisementType, advertisementType2, advertisementType3};
        $VALUES = advertisementTypeArr;
        $ENTRIES = new asp(advertisementTypeArr);
        Companion = new b();
        CREATOR = new a();
    }

    public AdvertisementType() {
        throw null;
    }

    public static zrp<AdvertisementType> i() {
        return $ENTRIES;
    }

    public static AdvertisementType valueOf(String str) {
        return (AdvertisementType) Enum.valueOf(AdvertisementType.class, str);
    }

    public static AdvertisementType[] values() {
        return (AdvertisementType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
