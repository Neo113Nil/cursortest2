package com.playtika.pras.sdk.network.models;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class DeviceInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new Parcelable.Creator<DeviceInfo>() { // from class: com.playtika.pras.sdk.network.models.DeviceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceInfo createFromParcel(Parcel parcel) {
            return new DeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    };
    private Boolean accessibilityEnabled;
    private String batteryStatus;
    private Integer deviceMemory;
    private String model;
    private String networkType;
    private Integer refreshRate;
    private String screenSizeInches;
    private String sdkAndroidId;
    private String type;
    private String uiMode;
    private String vendor;

    public DeviceInfo(Parcel parcel) {
        this.sdkAndroidId = parcel.readString();
        this.vendor = parcel.readString();
        this.model = parcel.readString();
        this.type = parcel.readString();
        this.networkType = parcel.readString();
        this.screenSizeInches = parcel.readString();
        this.uiMode = parcel.readString();
        this.deviceMemory = parcel.readByte() == 1 ? Integer.valueOf(parcel.readInt()) : null;
        this.refreshRate = parcel.readByte() == 1 ? Integer.valueOf(parcel.readInt()) : null;
        this.batteryStatus = parcel.readString();
        if (Build.VERSION.SDK_INT >= 29) {
            this.accessibilityEnabled = Boolean.valueOf(parcel.readBoolean());
        } else {
            this.accessibilityEnabled = Boolean.valueOf(parcel.readInt() == 1);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Boolean getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    public String getBatteryStatus() {
        return this.batteryStatus;
    }

    public Integer getDeviceMemory() {
        return this.deviceMemory;
    }

    public String getModel() {
        return this.model;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public Integer getRefreshRate() {
        return this.refreshRate;
    }

    public String getScreenSizeInches() {
        return this.screenSizeInches;
    }

    public String getSdkAndroidId() {
        return this.sdkAndroidId;
    }

    public String getType() {
        return this.type;
    }

    public String getUiMode() {
        return this.uiMode;
    }

    public String getVendor() {
        return this.vendor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sdkAndroidId);
        parcel.writeString(this.vendor);
        parcel.writeString(this.model);
        parcel.writeString(this.type);
        parcel.writeString(this.networkType);
        parcel.writeString(this.screenSizeInches);
        parcel.writeString(this.uiMode);
        parcel.writeByte((byte) (this.deviceMemory != null ? 1 : 0));
        Integer num = this.deviceMemory;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
        parcel.writeByte((byte) (this.refreshRate != null ? 1 : 0));
        Integer num2 = this.refreshRate;
        if (num2 != null) {
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.batteryStatus);
        if (Build.VERSION.SDK_INT >= 29) {
            Boolean bool = this.accessibilityEnabled;
            parcel.writeBoolean(bool != null && bool.booleanValue());
        } else {
            Boolean bool2 = this.accessibilityEnabled;
            parcel.writeInt((bool2 == null || !bool2.booleanValue()) ? 0 : 1);
        }
    }

    public DeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Boolean bool) {
        this.sdkAndroidId = str;
        this.vendor = str2;
        this.model = str3;
        this.type = str4;
        this.networkType = str5;
        this.screenSizeInches = str6;
        this.uiMode = str7;
        this.deviceMemory = num;
        this.refreshRate = num2;
        this.batteryStatus = str8;
        this.accessibilityEnabled = bool;
    }
}
