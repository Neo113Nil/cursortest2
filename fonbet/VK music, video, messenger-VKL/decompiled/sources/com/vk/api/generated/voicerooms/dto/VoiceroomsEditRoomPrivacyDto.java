package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoiceroomsEditRoomPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsEditRoomPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoiceroomsEditRoomPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final VoiceroomsEditRoomPrivacyDto ALL;

    @pmi0("by_link")
    public static final VoiceroomsEditRoomPrivacyDto BY_LINK;
    public static final Parcelable.Creator<VoiceroomsEditRoomPrivacyDto> CREATOR;

    @pmi0("donut")
    public static final VoiceroomsEditRoomPrivacyDto DONUT;

    @pmi0("friends")
    public static final VoiceroomsEditRoomPrivacyDto FRIENDS;

    @pmi0("members")
    public static final VoiceroomsEditRoomPrivacyDto MEMBERS;
    private final String value;

    /* compiled from: VoiceroomsEditRoomPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsEditRoomPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsEditRoomPrivacyDto createFromParcel(Parcel parcel) {
            return VoiceroomsEditRoomPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsEditRoomPrivacyDto[] newArray(int i) {
            return new VoiceroomsEditRoomPrivacyDto[i];
        }
    }

    static {
        VoiceroomsEditRoomPrivacyDto voiceroomsEditRoomPrivacyDto = new VoiceroomsEditRoomPrivacyDto("ALL", 0, "all");
        ALL = voiceroomsEditRoomPrivacyDto;
        VoiceroomsEditRoomPrivacyDto voiceroomsEditRoomPrivacyDto2 = new VoiceroomsEditRoomPrivacyDto("BY_LINK", 1, "by_link");
        BY_LINK = voiceroomsEditRoomPrivacyDto2;
        VoiceroomsEditRoomPrivacyDto voiceroomsEditRoomPrivacyDto3 = new VoiceroomsEditRoomPrivacyDto("DONUT", 2, "donut");
        DONUT = voiceroomsEditRoomPrivacyDto3;
        VoiceroomsEditRoomPrivacyDto voiceroomsEditRoomPrivacyDto4 = new VoiceroomsEditRoomPrivacyDto(Privacy.FRIENDS, 3, "friends");
        FRIENDS = voiceroomsEditRoomPrivacyDto4;
        VoiceroomsEditRoomPrivacyDto voiceroomsEditRoomPrivacyDto5 = new VoiceroomsEditRoomPrivacyDto("MEMBERS", 4, "members");
        MEMBERS = voiceroomsEditRoomPrivacyDto5;
        VoiceroomsEditRoomPrivacyDto[] voiceroomsEditRoomPrivacyDtoArr = {voiceroomsEditRoomPrivacyDto, voiceroomsEditRoomPrivacyDto2, voiceroomsEditRoomPrivacyDto3, voiceroomsEditRoomPrivacyDto4, voiceroomsEditRoomPrivacyDto5};
        $VALUES = voiceroomsEditRoomPrivacyDtoArr;
        $ENTRIES = new asp(voiceroomsEditRoomPrivacyDtoArr);
        CREATOR = new a();
    }

    private VoiceroomsEditRoomPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VoiceroomsEditRoomPrivacyDto valueOf(String str) {
        return (VoiceroomsEditRoomPrivacyDto) Enum.valueOf(VoiceroomsEditRoomPrivacyDto.class, str);
    }

    public static VoiceroomsEditRoomPrivacyDto[] values() {
        return (VoiceroomsEditRoomPrivacyDto[]) $VALUES.clone();
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
