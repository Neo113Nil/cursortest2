package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AppsGetAppPlaceholderInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAppPlaceholderInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAppPlaceholderInfoResponseDto> CREATOR = new a();

    @pmi0("app_type")
    private final AppsAppTypeDto appType;

    @pmi0("mobile_controls_type")
    private final Integer mobileControlsType;

    @pmi0("placeholder_info")
    private final AppsAppPlaceholderInfoDto placeholderInfo;

    /* compiled from: AppsGetAppPlaceholderInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAppPlaceholderInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAppPlaceholderInfoResponseDto createFromParcel(Parcel parcel) {
            return new AppsGetAppPlaceholderInfoResponseDto((AppsAppTypeDto) parcel.readParcelable(AppsGetAppPlaceholderInfoResponseDto.class.getClassLoader()), (AppsAppPlaceholderInfoDto) parcel.readParcelable(AppsGetAppPlaceholderInfoResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAppPlaceholderInfoResponseDto[] newArray(int i) {
            return new AppsGetAppPlaceholderInfoResponseDto[i];
        }
    }

    public AppsGetAppPlaceholderInfoResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAppPlaceholderInfoResponseDto)) {
            return false;
        }
        AppsGetAppPlaceholderInfoResponseDto appsGetAppPlaceholderInfoResponseDto = (AppsGetAppPlaceholderInfoResponseDto) obj;
        return this.appType == appsGetAppPlaceholderInfoResponseDto.appType && epx.f(this.placeholderInfo, appsGetAppPlaceholderInfoResponseDto.placeholderInfo) && epx.f(this.mobileControlsType, appsGetAppPlaceholderInfoResponseDto.mobileControlsType);
    }

    public final int hashCode() {
        AppsAppTypeDto appsAppTypeDto = this.appType;
        int hashCode = (appsAppTypeDto == null ? 0 : appsAppTypeDto.hashCode()) * 31;
        AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto = this.placeholderInfo;
        int hashCode2 = (hashCode + (appsAppPlaceholderInfoDto == null ? 0 : appsAppPlaceholderInfoDto.hashCode())) * 31;
        Integer num = this.mobileControlsType;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetAppPlaceholderInfoResponseDto(appType=");
        sb.append(this.appType);
        sb.append(", placeholderInfo=");
        sb.append(this.placeholderInfo);
        sb.append(", mobileControlsType=");
        return uqi.b(sb, this.mobileControlsType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.appType, i);
        parcel.writeParcelable(this.placeholderInfo, i);
        Integer num = this.mobileControlsType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AppsGetAppPlaceholderInfoResponseDto(AppsAppTypeDto appsAppTypeDto, AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto, Integer num) {
        this.appType = appsAppTypeDto;
        this.placeholderInfo = appsAppPlaceholderInfoDto;
        this.mobileControlsType = num;
    }

    public /* synthetic */ AppsGetAppPlaceholderInfoResponseDto(AppsAppTypeDto appsAppTypeDto, AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : appsAppTypeDto, (i & 2) != 0 ? null : appsAppPlaceholderInfoDto, (i & 4) != 0 ? null : num);
    }
}
