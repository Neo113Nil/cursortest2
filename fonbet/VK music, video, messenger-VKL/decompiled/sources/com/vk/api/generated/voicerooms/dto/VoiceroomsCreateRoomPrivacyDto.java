package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoiceroomsCreateRoomPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsCreateRoomPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoiceroomsCreateRoomPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final VoiceroomsCreateRoomPrivacyDto ALL;

    @pmi0("by_link")
    public static final VoiceroomsCreateRoomPrivacyDto BY_LINK;
    public static final Parcelable.Creator<VoiceroomsCreateRoomPrivacyDto> CREATOR;

    @pmi0("donut")
    public static final VoiceroomsCreateRoomPrivacyDto DONUT;

    @pmi0("friends")
    public static final VoiceroomsCreateRoomPrivacyDto FRIENDS;

    @pmi0("members")
    public static final VoiceroomsCreateRoomPrivacyDto MEMBERS;
    private final String value;

    /* compiled from: VoiceroomsCreateRoomPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsCreateRoomPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsCreateRoomPrivacyDto createFromParcel(Parcel parcel) {
            return VoiceroomsCreateRoomPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsCreateRoomPrivacyDto[] newArray(int i) {
            return new VoiceroomsCreateRoomPrivacyDto[i];
        }
    }

    static {
        VoiceroomsCreateRoomPrivacyDto voiceroomsCreateRoomPrivacyDto = new VoiceroomsCreateRoomPrivacyDto("ALL", 0, "all");
        ALL = voiceroomsCreateRoomPrivacyDto;
        VoiceroomsCreateRoomPrivacyDto voiceroomsCreateRoomPrivacyDto2 = new VoiceroomsCreateRoomPrivacyDto("BY_LINK", 1, "by_link");
        BY_LINK = voiceroomsCreateRoomPrivacyDto2;
        VoiceroomsCreateRoomPrivacyDto voiceroomsCreateRoomPrivacyDto3 = new VoiceroomsCreateRoomPrivacyDto("DONUT", 2, "donut");
        DONUT = voiceroomsCreateRoomPrivacyDto3;
        VoiceroomsCreateRoomPrivacyDto voiceroomsCreateRoomPrivacyDto4 = new VoiceroomsCreateRoomPrivacyDto(Privacy.FRIENDS, 3, "friends");
        FRIENDS = voiceroomsCreateRoomPrivacyDto4;
        VoiceroomsCreateRoomPrivacyDto voiceroomsCreateRoomPrivacyDto5 = new VoiceroomsCreateRoomPrivacyDto("MEMBERS", 4, "members");
        MEMBERS = voiceroomsCreateRoomPrivacyDto5;
        VoiceroomsCreateRoomPrivacyDto[] voiceroomsCreateRoomPrivacyDtoArr = {voiceroomsCreateRoomPrivacyDto, voiceroomsCreateRoomPrivacyDto2, voiceroomsCreateRoomPrivacyDto3, voiceroomsCreateRoomPrivacyDto4, voiceroomsCreateRoomPrivacyDto5};
        $VALUES = voiceroomsCreateRoomPrivacyDtoArr;
        $ENTRIES = new asp(voiceroomsCreateRoomPrivacyDtoArr);
        CREATOR = new a();
    }

    private VoiceroomsCreateRoomPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VoiceroomsCreateRoomPrivacyDto valueOf(String str) {
        return (VoiceroomsCreateRoomPrivacyDto) Enum.valueOf(VoiceroomsCreateRoomPrivacyDto.class, str);
    }

    public static VoiceroomsCreateRoomPrivacyDto[] values() {
        return (VoiceroomsCreateRoomPrivacyDto[]) $VALUES.clone();
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
