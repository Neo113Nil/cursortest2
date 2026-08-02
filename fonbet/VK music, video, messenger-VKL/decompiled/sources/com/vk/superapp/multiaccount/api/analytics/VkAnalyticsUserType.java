package com.vk.superapp.multiaccount.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkAnalyticsUserType.kt */
/* loaded from: classes6.dex */
public final class VkAnalyticsUserType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkAnalyticsUserType[] $VALUES;
    public static final Parcelable.Creator<VkAnalyticsUserType> CREATOR;
    public static final VkAnalyticsUserType Master;
    public static final VkAnalyticsUserType Related;
    private final String value;

    /* compiled from: VkAnalyticsUserType.kt */
    public static final class a implements Parcelable.Creator<VkAnalyticsUserType> {
        @Override // android.os.Parcelable.Creator
        public final VkAnalyticsUserType createFromParcel(Parcel parcel) {
            return VkAnalyticsUserType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkAnalyticsUserType[] newArray(int i) {
            return new VkAnalyticsUserType[i];
        }
    }

    static {
        VkAnalyticsUserType vkAnalyticsUserType = new VkAnalyticsUserType("Master", 0, "master");
        Master = vkAnalyticsUserType;
        VkAnalyticsUserType vkAnalyticsUserType2 = new VkAnalyticsUserType("Related", 1, "related");
        Related = vkAnalyticsUserType2;
        VkAnalyticsUserType[] vkAnalyticsUserTypeArr = {vkAnalyticsUserType, vkAnalyticsUserType2};
        $VALUES = vkAnalyticsUserTypeArr;
        $ENTRIES = new asp(vkAnalyticsUserTypeArr);
        CREATOR = new a();
    }

    public VkAnalyticsUserType(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkAnalyticsUserType valueOf(String str) {
        return (VkAnalyticsUserType) Enum.valueOf(VkAnalyticsUserType.class, str);
    }

    public static VkAnalyticsUserType[] values() {
        return (VkAnalyticsUserType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
