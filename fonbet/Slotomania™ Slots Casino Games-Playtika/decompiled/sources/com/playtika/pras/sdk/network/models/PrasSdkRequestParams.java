package com.playtika.pras.sdk.network.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public class PrasSdkRequestParams implements Parcelable {
    public static final Parcelable.Creator<PrasSdkRequestParams> CREATOR = new Parcelable.Creator<PrasSdkRequestParams>() { // from class: com.playtika.pras.sdk.network.models.PrasSdkRequestParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrasSdkRequestParams createFromParcel(Parcel parcel) {
            return new PrasSdkRequestParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrasSdkRequestParams[] newArray(int i) {
            return new PrasSdkRequestParams[i];
        }
    };
    String appSessionId;
    String appTransactionId;
    String appUserId;
    String appUserToken;
    long appVersionCode;
    String clientType;
    String currency;
    String developerPayload;
    String extraParamsJson;
    String locale;
    String packageName;
    String platform;
    String productTitle;
    int sdkVersionCode;
    String sku;

    public PrasSdkRequestParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, int i, long j, String str10, String str11, String str12) {
        this.clientType = null;
        this.packageName = str;
        this.appUserId = str2;
        this.appSessionId = str3;
        this.appUserToken = str4;
        this.sku = str5;
        this.currency = str6;
        this.appTransactionId = str7;
        this.developerPayload = str8;
        this.productTitle = str9;
        if (num != null) {
            this.clientType = num.toString();
        }
        this.sdkVersionCode = i;
        this.appVersionCode = j;
        this.locale = str10;
        this.platform = str11;
        this.extraParamsJson = str12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppSessionId() {
        return this.appSessionId;
    }

    public String getAppTransactionId() {
        return this.appTransactionId;
    }

    public String getAppUserId() {
        return this.appUserId;
    }

    public String getAppUserToken() {
        return this.appUserToken;
    }

    public long getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getClientType() {
        return this.clientType;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDeveloperPayload() {
        return this.developerPayload;
    }

    public String getExtraParamsJson() {
        return this.extraParamsJson;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public int getSdkVersionCode() {
        return this.sdkVersionCode;
    }

    public String getSku() {
        return this.sku;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.appUserId);
        parcel.writeString(this.appSessionId);
        parcel.writeString(this.appUserToken);
        parcel.writeString(this.sku);
        parcel.writeString(this.currency);
        parcel.writeString(this.appTransactionId);
        parcel.writeString(this.developerPayload);
        parcel.writeString(this.productTitle);
        parcel.writeString(this.clientType);
        parcel.writeInt(this.sdkVersionCode);
        parcel.writeLong(this.appVersionCode);
        parcel.writeString(this.locale);
        parcel.writeString(this.platform);
        parcel.writeString(this.extraParamsJson);
    }

    public PrasSdkRequestParams(String str, String str2, String str3, String str4, int i, long j, String str5) {
        this.clientType = null;
        this.packageName = str;
        this.appUserId = str2;
        this.appSessionId = str3;
        this.appUserToken = str4;
        this.sdkVersionCode = i;
        this.appVersionCode = j;
        this.platform = str5;
    }

    public PrasSdkRequestParams(String str, String str2, String str3, String str4, int i, long j, Integer num, String str5, String str6) {
        this(str, str2, str3, str4, i, j, str6);
        if (num != null) {
            this.clientType = num.toString();
        }
        this.locale = str5;
    }

    public PrasSdkRequestParams(String str, String str2, String str3, String str4, int i, long j, Integer num, String str5, String str6, String str7) {
        this(str, str2, str3, str4, i, j, str6);
        if (num != null) {
            this.clientType = num.toString();
        }
        this.locale = str5;
        this.extraParamsJson = str7;
    }

    public PrasSdkRequestParams(Parcel parcel) {
        this.clientType = null;
        this.packageName = parcel.readString();
        this.appUserId = parcel.readString();
        this.appSessionId = parcel.readString();
        this.appUserToken = parcel.readString();
        this.sku = parcel.readString();
        this.currency = parcel.readString();
        this.appTransactionId = parcel.readString();
        this.developerPayload = parcel.readString();
        this.productTitle = parcel.readString();
        this.clientType = parcel.readString();
        this.sdkVersionCode = parcel.readInt();
        this.appVersionCode = parcel.readLong();
        this.locale = parcel.readString();
        this.platform = parcel.readString();
        this.extraParamsJson = parcel.readString();
    }
}
