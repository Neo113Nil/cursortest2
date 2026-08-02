package com.vk.api.generated.vkStart.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseGeoCoordinatesDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VkStartInputActivityRoutePointDto.kt */
/* loaded from: classes15.dex */
public final class VkStartInputActivityRoutePointDto implements Parcelable {
    public static final Parcelable.Creator<VkStartInputActivityRoutePointDto> CREATOR = new a();

    @pmi0("location")
    private final BaseGeoCoordinatesDto location;

    /* compiled from: VkStartInputActivityRoutePointDto.kt */
    public static final class a implements Parcelable.Creator<VkStartInputActivityRoutePointDto> {
        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityRoutePointDto createFromParcel(Parcel parcel) {
            return new VkStartInputActivityRoutePointDto((BaseGeoCoordinatesDto) parcel.readParcelable(VkStartInputActivityRoutePointDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityRoutePointDto[] newArray(int i) {
            return new VkStartInputActivityRoutePointDto[i];
        }
    }

    public VkStartInputActivityRoutePointDto(BaseGeoCoordinatesDto baseGeoCoordinatesDto) {
        this.location = baseGeoCoordinatesDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkStartInputActivityRoutePointDto) && epx.f(this.location, ((VkStartInputActivityRoutePointDto) obj).location);
    }

    public final int hashCode() {
        return this.location.hashCode();
    }

    public final String toString() {
        return "VkStartInputActivityRoutePointDto(location=" + this.location + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.location, i);
    }
}
