package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VoiceroomsGuestSpeakerDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsGuestSpeakerDto implements Parcelable {
    public static final Parcelable.Creator<VoiceroomsGuestSpeakerDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoiceroomsGuestSpeakerDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("accepted")
        public static final StatusDto ACCEPTED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("pending")
        public static final StatusDto PENDING;

        @pmi0("rejected")
        public static final StatusDto REJECTED;
        private final String value;

        /* compiled from: VoiceroomsGuestSpeakerDto.kt */
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
            StatusDto statusDto = new StatusDto(SignalingProtocol.PARTICIPANT_STATE_ACCEPTED, 0, "accepted");
            ACCEPTED = statusDto;
            StatusDto statusDto2 = new StatusDto("REJECTED", 1, "rejected");
            REJECTED = statusDto2;
            StatusDto statusDto3 = new StatusDto("PENDING", 2, "pending");
            PENDING = statusDto3;
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

    /* compiled from: VoiceroomsGuestSpeakerDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsGuestSpeakerDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsGuestSpeakerDto createFromParcel(Parcel parcel) {
            return new VoiceroomsGuestSpeakerDto(parcel.readString(), parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsGuestSpeakerDto[] newArray(int i) {
            return new VoiceroomsGuestSpeakerDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceroomsGuestSpeakerDto() {
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
        if (!(obj instanceof VoiceroomsGuestSpeakerDto)) {
            return false;
        }
        VoiceroomsGuestSpeakerDto voiceroomsGuestSpeakerDto = (VoiceroomsGuestSpeakerDto) obj;
        return epx.f(this.id, voiceroomsGuestSpeakerDto.id) && this.status == voiceroomsGuestSpeakerDto.status;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        StatusDto statusDto = this.status;
        return hashCode + (statusDto != null ? statusDto.hashCode() : 0);
    }

    public final String toString() {
        return "VoiceroomsGuestSpeakerDto(id=" + this.id + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
    }

    public VoiceroomsGuestSpeakerDto(String str, StatusDto statusDto) {
        this.id = str;
        this.status = statusDto;
    }

    public /* synthetic */ VoiceroomsGuestSpeakerDto(String str, StatusDto statusDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : statusDto);
    }
}
