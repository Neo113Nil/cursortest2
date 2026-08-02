package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ClassifiedsReferenceDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsReferenceDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsReferenceDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("address_details")
    private final ClassifiedsAddressDetailsDto addressDetails;

    @pmi0("location")
    private final ClassifiedsLocationDto location;

    /* compiled from: ClassifiedsReferenceDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsReferenceDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsReferenceDto createFromParcel(Parcel parcel) {
            return new ClassifiedsReferenceDto(ClassifiedsLocationDto.CREATOR.createFromParcel(parcel), parcel.readString(), ClassifiedsAddressDetailsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsReferenceDto[] newArray(int i) {
            return new ClassifiedsReferenceDto[i];
        }
    }

    public ClassifiedsReferenceDto(ClassifiedsLocationDto classifiedsLocationDto, String str, ClassifiedsAddressDetailsDto classifiedsAddressDetailsDto) {
        this.location = classifiedsLocationDto;
        this.address = str;
        this.addressDetails = classifiedsAddressDetailsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsReferenceDto)) {
            return false;
        }
        ClassifiedsReferenceDto classifiedsReferenceDto = (ClassifiedsReferenceDto) obj;
        return epx.f(this.location, classifiedsReferenceDto.location) && epx.f(this.address, classifiedsReferenceDto.address) && epx.f(this.addressDetails, classifiedsReferenceDto.addressDetails);
    }

    public final int hashCode() {
        return this.addressDetails.hashCode() + urd0.a(this.location.hashCode() * 31, 31, this.address);
    }

    public final String toString() {
        return "ClassifiedsReferenceDto(location=" + this.location + ", address=" + this.address + ", addressDetails=" + this.addressDetails + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.location.writeToParcel(parcel, i);
        parcel.writeString(this.address);
        this.addressDetails.writeToParcel(parcel, i);
    }
}
