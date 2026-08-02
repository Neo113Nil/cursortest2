package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoChannelsGetOnboardingStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsGetOnboardingStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsGetOnboardingStatusResponseDto> CREATOR = new a();

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoChannelsGetOnboardingStatusResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("assigned")
        public static final StatusDto ASSIGNED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("not_assigned")
        public static final StatusDto NOT_ASSIGNED;

        @pmi0("processed_step_one")
        public static final StatusDto PROCESSED_STEP_ONE;
        private final String value;

        /* compiled from: VideoChannelsGetOnboardingStatusResponseDto.kt */
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
            StatusDto statusDto = new StatusDto("ASSIGNED", 0, "assigned");
            ASSIGNED = statusDto;
            StatusDto statusDto2 = new StatusDto("NOT_ASSIGNED", 1, "not_assigned");
            NOT_ASSIGNED = statusDto2;
            StatusDto statusDto3 = new StatusDto("PROCESSED_STEP_ONE", 2, "processed_step_one");
            PROCESSED_STEP_ONE = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
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

    /* compiled from: VideoChannelsGetOnboardingStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsGetOnboardingStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetOnboardingStatusResponseDto createFromParcel(Parcel parcel) {
            return new VideoChannelsGetOnboardingStatusResponseDto(parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetOnboardingStatusResponseDto[] newArray(int i) {
            return new VideoChannelsGetOnboardingStatusResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoChannelsGetOnboardingStatusResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoChannelsGetOnboardingStatusResponseDto) && this.status == ((VideoChannelsGetOnboardingStatusResponseDto) obj).status;
    }

    public final int hashCode() {
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            return 0;
        }
        return statusDto.hashCode();
    }

    public final String toString() {
        return "VideoChannelsGetOnboardingStatusResponseDto(status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
    }

    public VideoChannelsGetOnboardingStatusResponseDto(StatusDto statusDto) {
        this.status = statusDto;
    }

    public /* synthetic */ VideoChannelsGetOnboardingStatusResponseDto(StatusDto statusDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : statusDto);
    }
}
