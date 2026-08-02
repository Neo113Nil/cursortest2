package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpacesEditStatusDto.kt */
/* loaded from: classes15.dex */
public final class SpacesEditStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SpacesEditStatusDto[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final SpacesEditStatusDto ACTIVE;
    public static final Parcelable.Creator<SpacesEditStatusDto> CREATOR;
    private final String value;

    /* compiled from: SpacesEditStatusDto.kt */
    public static final class a implements Parcelable.Creator<SpacesEditStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesEditStatusDto createFromParcel(Parcel parcel) {
            return SpacesEditStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesEditStatusDto[] newArray(int i) {
            return new SpacesEditStatusDto[i];
        }
    }

    static {
        SpacesEditStatusDto spacesEditStatusDto = new SpacesEditStatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
        ACTIVE = spacesEditStatusDto;
        SpacesEditStatusDto[] spacesEditStatusDtoArr = {spacesEditStatusDto};
        $VALUES = spacesEditStatusDtoArr;
        $ENTRIES = new asp(spacesEditStatusDtoArr);
        CREATOR = new a();
    }

    private SpacesEditStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SpacesEditStatusDto valueOf(String str) {
        return (SpacesEditStatusDto) Enum.valueOf(SpacesEditStatusDto.class, str);
    }

    public static SpacesEditStatusDto[] values() {
        return (SpacesEditStatusDto[]) $VALUES.clone();
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
