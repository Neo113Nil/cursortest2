package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsMobileAppOpenDto.kt */
/* loaded from: classes14.dex */
public final class AdsMobileAppOpenDto implements Parcelable {
    public static final Parcelable.Creator<AdsMobileAppOpenDto> CREATOR = new a();

    @pmi0("app_id")
    private final String appId;

    @pmi0("open_url")
    private final String openUrl;

    /* compiled from: AdsMobileAppOpenDto.kt */
    public static final class a implements Parcelable.Creator<AdsMobileAppOpenDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsMobileAppOpenDto createFromParcel(Parcel parcel) {
            return new AdsMobileAppOpenDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsMobileAppOpenDto[] newArray(int i) {
            return new AdsMobileAppOpenDto[i];
        }
    }

    public AdsMobileAppOpenDto(String str, String str2) {
        this.appId = str;
        this.openUrl = str2;
    }

    public final String d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.openUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsMobileAppOpenDto)) {
            return false;
        }
        AdsMobileAppOpenDto adsMobileAppOpenDto = (AdsMobileAppOpenDto) obj;
        return epx.f(this.appId, adsMobileAppOpenDto.appId) && epx.f(this.openUrl, adsMobileAppOpenDto.openUrl);
    }

    public final int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        String str = this.openUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsMobileAppOpenDto(appId=");
        sb.append(this.appId);
        sb.append(", openUrl=");
        return ho8.a(sb, this.openUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.openUrl);
    }

    public /* synthetic */ AdsMobileAppOpenDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
