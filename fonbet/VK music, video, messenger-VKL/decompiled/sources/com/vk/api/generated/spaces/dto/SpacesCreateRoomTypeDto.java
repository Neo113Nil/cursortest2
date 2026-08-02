package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpacesCreateRoomTypeDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCreateRoomTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SpacesCreateRoomTypeDto[] $VALUES;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final SpacesCreateRoomTypeDto CALL;

    @pmi0("channel")
    public static final SpacesCreateRoomTypeDto CHANNEL;

    @pmi0(SignalingProtocol.KEY_CONVERSATION)
    public static final SpacesCreateRoomTypeDto CONVERSATION;
    public static final Parcelable.Creator<SpacesCreateRoomTypeDto> CREATOR;

    @pmi0("tribune")
    public static final SpacesCreateRoomTypeDto TRIBUNE;
    private final String value;

    /* compiled from: SpacesCreateRoomTypeDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCreateRoomTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCreateRoomTypeDto createFromParcel(Parcel parcel) {
            return SpacesCreateRoomTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCreateRoomTypeDto[] newArray(int i) {
            return new SpacesCreateRoomTypeDto[i];
        }
    }

    static {
        SpacesCreateRoomTypeDto spacesCreateRoomTypeDto = new SpacesCreateRoomTypeDto("CALL", 0, NotificationCompat.CATEGORY_CALL);
        CALL = spacesCreateRoomTypeDto;
        SpacesCreateRoomTypeDto spacesCreateRoomTypeDto2 = new SpacesCreateRoomTypeDto("CHANNEL", 1, "channel");
        CHANNEL = spacesCreateRoomTypeDto2;
        SpacesCreateRoomTypeDto spacesCreateRoomTypeDto3 = new SpacesCreateRoomTypeDto("CONVERSATION", 2, SignalingProtocol.KEY_CONVERSATION);
        CONVERSATION = spacesCreateRoomTypeDto3;
        SpacesCreateRoomTypeDto spacesCreateRoomTypeDto4 = new SpacesCreateRoomTypeDto("TRIBUNE", 3, "tribune");
        TRIBUNE = spacesCreateRoomTypeDto4;
        SpacesCreateRoomTypeDto[] spacesCreateRoomTypeDtoArr = {spacesCreateRoomTypeDto, spacesCreateRoomTypeDto2, spacesCreateRoomTypeDto3, spacesCreateRoomTypeDto4};
        $VALUES = spacesCreateRoomTypeDtoArr;
        $ENTRIES = new asp(spacesCreateRoomTypeDtoArr);
        CREATOR = new a();
    }

    private SpacesCreateRoomTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SpacesCreateRoomTypeDto valueOf(String str) {
        return (SpacesCreateRoomTypeDto) Enum.valueOf(SpacesCreateRoomTypeDto.class, str);
    }

    public static SpacesCreateRoomTypeDto[] values() {
        return (SpacesCreateRoomTypeDto[]) $VALUES.clone();
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
