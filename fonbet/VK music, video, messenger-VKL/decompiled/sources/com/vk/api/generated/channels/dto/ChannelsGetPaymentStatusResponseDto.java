package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ChannelsGetPaymentStatusResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetPaymentStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetPaymentStatusResponseDto> CREATOR = new a();

    @pmi0("data")
    private final ChannelsGetPaymentStatusResponseDataDto data;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsGetPaymentStatusResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("2")
        public static final StatusDto HANDLED;

        @pmi0("1")
        public static final StatusDto PAID;

        @pmi0("0")
        public static final StatusDto UNPAID;
        private final int value;

        /* compiled from: ChannelsGetPaymentStatusResponseDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("UNPAID", 0, 0);
            UNPAID = statusDto;
            StatusDto statusDto2 = new StatusDto("PAID", 1, 1);
            PAID = statusDto2;
            StatusDto statusDto3 = new StatusDto("HANDLED", 2, 2);
            HANDLED = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ChannelsGetPaymentStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetPaymentStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetPaymentStatusResponseDto createFromParcel(Parcel parcel) {
            return new ChannelsGetPaymentStatusResponseDto(StatusDto.CREATOR.createFromParcel(parcel), (ChannelsGetPaymentStatusResponseDataDto) parcel.readParcelable(ChannelsGetPaymentStatusResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetPaymentStatusResponseDto[] newArray(int i) {
            return new ChannelsGetPaymentStatusResponseDto[i];
        }
    }

    public ChannelsGetPaymentStatusResponseDto(StatusDto statusDto, ChannelsGetPaymentStatusResponseDataDto channelsGetPaymentStatusResponseDataDto) {
        this.status = statusDto;
        this.data = channelsGetPaymentStatusResponseDataDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetPaymentStatusResponseDto)) {
            return false;
        }
        ChannelsGetPaymentStatusResponseDto channelsGetPaymentStatusResponseDto = (ChannelsGetPaymentStatusResponseDto) obj;
        return this.status == channelsGetPaymentStatusResponseDto.status && epx.f(this.data, channelsGetPaymentStatusResponseDto.data);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        ChannelsGetPaymentStatusResponseDataDto channelsGetPaymentStatusResponseDataDto = this.data;
        return hashCode + (channelsGetPaymentStatusResponseDataDto == null ? 0 : channelsGetPaymentStatusResponseDataDto.hashCode());
    }

    public final String toString() {
        return "ChannelsGetPaymentStatusResponseDto(status=" + this.status + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        parcel.writeParcelable(this.data, i);
    }

    public /* synthetic */ ChannelsGetPaymentStatusResponseDto(StatusDto statusDto, ChannelsGetPaymentStatusResponseDataDto channelsGetPaymentStatusResponseDataDto, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : channelsGetPaymentStatusResponseDataDto);
    }
}
