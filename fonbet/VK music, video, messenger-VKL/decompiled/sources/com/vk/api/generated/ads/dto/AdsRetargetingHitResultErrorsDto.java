package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsRetargetingHitResultErrorsDto.kt */
/* loaded from: classes14.dex */
public final class AdsRetargetingHitResultErrorsDto implements Parcelable {
    public static final Parcelable.Creator<AdsRetargetingHitResultErrorsDto> CREATOR = new a();

    @pmi0("error_code")
    private final String errorCode;

    @pmi0("error_message")
    private final String errorMessage;

    /* compiled from: AdsRetargetingHitResultErrorsDto.kt */
    public static final class a implements Parcelable.Creator<AdsRetargetingHitResultErrorsDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsRetargetingHitResultErrorsDto createFromParcel(Parcel parcel) {
            return new AdsRetargetingHitResultErrorsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsRetargetingHitResultErrorsDto[] newArray(int i) {
            return new AdsRetargetingHitResultErrorsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsRetargetingHitResultErrorsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsRetargetingHitResultErrorsDto)) {
            return false;
        }
        AdsRetargetingHitResultErrorsDto adsRetargetingHitResultErrorsDto = (AdsRetargetingHitResultErrorsDto) obj;
        return epx.f(this.errorCode, adsRetargetingHitResultErrorsDto.errorCode) && epx.f(this.errorMessage, adsRetargetingHitResultErrorsDto.errorMessage);
    }

    public final int hashCode() {
        String str = this.errorCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorMessage;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsRetargetingHitResultErrorsDto(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        return ho8.a(sb, this.errorMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMessage);
    }

    public AdsRetargetingHitResultErrorsDto(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public /* synthetic */ AdsRetargetingHitResultErrorsDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
