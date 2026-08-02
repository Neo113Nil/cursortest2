package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoiceroomsGetParticipantsFilterDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsGetParticipantsFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoiceroomsGetParticipantsFilterDto[] $VALUES;
    public static final Parcelable.Creator<VoiceroomsGetParticipantsFilterDto> CREATOR;

    @pmi0("listeners")
    public static final VoiceroomsGetParticipantsFilterDto LISTENERS;

    @pmi0("authorized")
    public static final VoiceroomsGetParticipantsFilterDto USERS_AND_GROUPS_THAT_ARE_ACTIVE_SPEAKERS;
    private final String value;

    /* compiled from: VoiceroomsGetParticipantsFilterDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsGetParticipantsFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsGetParticipantsFilterDto createFromParcel(Parcel parcel) {
            return VoiceroomsGetParticipantsFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsGetParticipantsFilterDto[] newArray(int i) {
            return new VoiceroomsGetParticipantsFilterDto[i];
        }
    }

    static {
        VoiceroomsGetParticipantsFilterDto voiceroomsGetParticipantsFilterDto = new VoiceroomsGetParticipantsFilterDto("USERS_AND_GROUPS_THAT_ARE_ACTIVE_SPEAKERS", 0, "authorized");
        USERS_AND_GROUPS_THAT_ARE_ACTIVE_SPEAKERS = voiceroomsGetParticipantsFilterDto;
        VoiceroomsGetParticipantsFilterDto voiceroomsGetParticipantsFilterDto2 = new VoiceroomsGetParticipantsFilterDto("LISTENERS", 1, "listeners");
        LISTENERS = voiceroomsGetParticipantsFilterDto2;
        VoiceroomsGetParticipantsFilterDto[] voiceroomsGetParticipantsFilterDtoArr = {voiceroomsGetParticipantsFilterDto, voiceroomsGetParticipantsFilterDto2};
        $VALUES = voiceroomsGetParticipantsFilterDtoArr;
        $ENTRIES = new asp(voiceroomsGetParticipantsFilterDtoArr);
        CREATOR = new a();
    }

    private VoiceroomsGetParticipantsFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VoiceroomsGetParticipantsFilterDto valueOf(String str) {
        return (VoiceroomsGetParticipantsFilterDto) Enum.valueOf(VoiceroomsGetParticipantsFilterDto.class, str);
    }

    public static VoiceroomsGetParticipantsFilterDto[] values() {
        return (VoiceroomsGetParticipantsFilterDto[]) $VALUES.clone();
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
