package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AppsNeedShowAddToMainScreenDeviceResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsNeedShowAddToMainScreenDeviceResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsNeedShowAddToMainScreenDeviceResponseDto> CREATOR = new a();

    @pmi0("need_to_show_on_close_time")
    private final Integer needToShowOnCloseTime;

    @pmi0("need_to_show_on_start")
    private final Boolean needToShowOnStart;

    /* compiled from: AppsNeedShowAddToMainScreenDeviceResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsNeedShowAddToMainScreenDeviceResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsNeedShowAddToMainScreenDeviceResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsNeedShowAddToMainScreenDeviceResponseDto(valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsNeedShowAddToMainScreenDeviceResponseDto[] newArray(int i) {
            return new AppsNeedShowAddToMainScreenDeviceResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsNeedShowAddToMainScreenDeviceResponseDto() {
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
        if (!(obj instanceof AppsNeedShowAddToMainScreenDeviceResponseDto)) {
            return false;
        }
        AppsNeedShowAddToMainScreenDeviceResponseDto appsNeedShowAddToMainScreenDeviceResponseDto = (AppsNeedShowAddToMainScreenDeviceResponseDto) obj;
        return epx.f(this.needToShowOnStart, appsNeedShowAddToMainScreenDeviceResponseDto.needToShowOnStart) && epx.f(this.needToShowOnCloseTime, appsNeedShowAddToMainScreenDeviceResponseDto.needToShowOnCloseTime);
    }

    public final int hashCode() {
        Boolean bool = this.needToShowOnStart;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.needToShowOnCloseTime;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsNeedShowAddToMainScreenDeviceResponseDto(needToShowOnStart=");
        sb.append(this.needToShowOnStart);
        sb.append(", needToShowOnCloseTime=");
        return uqi.b(sb, this.needToShowOnCloseTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.needToShowOnStart;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.needToShowOnCloseTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AppsNeedShowAddToMainScreenDeviceResponseDto(Boolean bool, Integer num) {
        this.needToShowOnStart = bool;
        this.needToShowOnCloseTime = num;
    }

    public /* synthetic */ AppsNeedShowAddToMainScreenDeviceResponseDto(Boolean bool, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }
}
