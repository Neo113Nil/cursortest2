package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ServiceBookingCreatedRecordDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingCreatedRecordDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingCreatedRecordDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("record_hash")
    private final String recordHash;

    @pmi0("record_id")
    private final int recordId;

    /* compiled from: ServiceBookingCreatedRecordDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingCreatedRecordDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCreatedRecordDto createFromParcel(Parcel parcel) {
            return new ServiceBookingCreatedRecordDto(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCreatedRecordDto[] newArray(int i) {
            return new ServiceBookingCreatedRecordDto[i];
        }
    }

    public ServiceBookingCreatedRecordDto(int i, int i2, String str) {
        this.id = i;
        this.recordId = i2;
        this.recordHash = str;
    }

    public final String d() {
        return this.recordHash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.recordId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingCreatedRecordDto)) {
            return false;
        }
        ServiceBookingCreatedRecordDto serviceBookingCreatedRecordDto = (ServiceBookingCreatedRecordDto) obj;
        return this.id == serviceBookingCreatedRecordDto.id && this.recordId == serviceBookingCreatedRecordDto.recordId && epx.f(this.recordHash, serviceBookingCreatedRecordDto.recordHash);
    }

    public final int hashCode() {
        return this.recordHash.hashCode() + shy.a(this.recordId, Integer.hashCode(this.id) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingCreatedRecordDto(id=");
        sb.append(this.id);
        sb.append(", recordId=");
        sb.append(this.recordId);
        sb.append(", recordHash=");
        return ho8.a(sb, this.recordHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.recordId);
        parcel.writeString(this.recordHash);
    }
}
