package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoiceroomsPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoiceroomsPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final VoiceroomsPrivacyDto ALL;

    @pmi0("by_link")
    public static final VoiceroomsPrivacyDto BY_LINK;
    public static final Parcelable.Creator<VoiceroomsPrivacyDto> CREATOR;

    @pmi0("donut")
    public static final VoiceroomsPrivacyDto DONUT;

    @pmi0("friends")
    public static final VoiceroomsPrivacyDto FRIENDS;

    @pmi0("members")
    public static final VoiceroomsPrivacyDto MEMBERS;
    private final String value;

    /* compiled from: VoiceroomsPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsPrivacyDto createFromParcel(Parcel parcel) {
            return VoiceroomsPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsPrivacyDto[] newArray(int i) {
            return new VoiceroomsPrivacyDto[i];
        }
    }

    static {
        VoiceroomsPrivacyDto voiceroomsPrivacyDto = new VoiceroomsPrivacyDto("ALL", 0, "all");
        ALL = voiceroomsPrivacyDto;
        VoiceroomsPrivacyDto voiceroomsPrivacyDto2 = new VoiceroomsPrivacyDto("BY_LINK", 1, "by_link");
        BY_LINK = voiceroomsPrivacyDto2;
        VoiceroomsPrivacyDto voiceroomsPrivacyDto3 = new VoiceroomsPrivacyDto("DONUT", 2, "donut");
        DONUT = voiceroomsPrivacyDto3;
        VoiceroomsPrivacyDto voiceroomsPrivacyDto4 = new VoiceroomsPrivacyDto(Privacy.FRIENDS, 3, "friends");
        FRIENDS = voiceroomsPrivacyDto4;
        VoiceroomsPrivacyDto voiceroomsPrivacyDto5 = new VoiceroomsPrivacyDto("MEMBERS", 4, "members");
        MEMBERS = voiceroomsPrivacyDto5;
        VoiceroomsPrivacyDto[] voiceroomsPrivacyDtoArr = {voiceroomsPrivacyDto, voiceroomsPrivacyDto2, voiceroomsPrivacyDto3, voiceroomsPrivacyDto4, voiceroomsPrivacyDto5};
        $VALUES = voiceroomsPrivacyDtoArr;
        $ENTRIES = new asp(voiceroomsPrivacyDtoArr);
        CREATOR = new a();
    }

    private VoiceroomsPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VoiceroomsPrivacyDto valueOf(String str) {
        return (VoiceroomsPrivacyDto) Enum.valueOf(VoiceroomsPrivacyDto.class, str);
    }

    public static VoiceroomsPrivacyDto[] values() {
        return (VoiceroomsPrivacyDto[]) $VALUES.clone();
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
