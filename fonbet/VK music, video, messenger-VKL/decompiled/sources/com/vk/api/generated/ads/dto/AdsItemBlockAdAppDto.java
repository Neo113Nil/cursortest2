package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsItemBlockAdAppDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdAppDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdAppDto> CREATOR = new a();

    @pmi0("app_id")
    private final String appId;

    @pmi0("open_url")
    private final String openUrl;

    /* compiled from: AdsItemBlockAdAppDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdAppDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdAppDto createFromParcel(Parcel parcel) {
            return new AdsItemBlockAdAppDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdAppDto[] newArray(int i) {
            return new AdsItemBlockAdAppDto[i];
        }
    }

    public AdsItemBlockAdAppDto(String str, String str2) {
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
        if (!(obj instanceof AdsItemBlockAdAppDto)) {
            return false;
        }
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = (AdsItemBlockAdAppDto) obj;
        return epx.f(this.appId, adsItemBlockAdAppDto.appId) && epx.f(this.openUrl, adsItemBlockAdAppDto.openUrl);
    }

    public final int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        String str = this.openUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsItemBlockAdAppDto(appId=");
        sb.append(this.appId);
        sb.append(", openUrl=");
        return ho8.a(sb, this.openUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.openUrl);
    }

    public /* synthetic */ AdsItemBlockAdAppDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
