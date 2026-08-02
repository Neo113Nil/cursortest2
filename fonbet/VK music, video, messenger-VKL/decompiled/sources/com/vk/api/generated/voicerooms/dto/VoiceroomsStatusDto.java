package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoiceroomsStatusDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoiceroomsStatusDto[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final VoiceroomsStatusDto ACTIVE;

    @pmi0("closed")
    public static final VoiceroomsStatusDto CLOSED;
    public static final Parcelable.Creator<VoiceroomsStatusDto> CREATOR;

    @pmi0("scheduled")
    public static final VoiceroomsStatusDto SCHEDULED;
    private final String value;

    /* compiled from: VoiceroomsStatusDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsStatusDto createFromParcel(Parcel parcel) {
            return VoiceroomsStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsStatusDto[] newArray(int i) {
            return new VoiceroomsStatusDto[i];
        }
    }

    static {
        VoiceroomsStatusDto voiceroomsStatusDto = new VoiceroomsStatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
        ACTIVE = voiceroomsStatusDto;
        VoiceroomsStatusDto voiceroomsStatusDto2 = new VoiceroomsStatusDto("SCHEDULED", 1, "scheduled");
        SCHEDULED = voiceroomsStatusDto2;
        VoiceroomsStatusDto voiceroomsStatusDto3 = new VoiceroomsStatusDto("CLOSED", 2, "closed");
        CLOSED = voiceroomsStatusDto3;
        VoiceroomsStatusDto[] voiceroomsStatusDtoArr = {voiceroomsStatusDto, voiceroomsStatusDto2, voiceroomsStatusDto3};
        $VALUES = voiceroomsStatusDtoArr;
        $ENTRIES = new asp(voiceroomsStatusDtoArr);
        CREATOR = new a();
    }

    private VoiceroomsStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VoiceroomsStatusDto valueOf(String str) {
        return (VoiceroomsStatusDto) Enum.valueOf(VoiceroomsStatusDto.class, str);
    }

    public static VoiceroomsStatusDto[] values() {
        return (VoiceroomsStatusDto[]) $VALUES.clone();
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
