package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsEditMessagePrimaryAttachmentsModeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsEditMessagePrimaryAttachmentsModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsEditMessagePrimaryAttachmentsModeDto[] $VALUES;

    @pmi0("carousel")
    public static final ChannelsEditMessagePrimaryAttachmentsModeDto CAROUSEL;
    public static final Parcelable.Creator<ChannelsEditMessagePrimaryAttachmentsModeDto> CREATOR;

    @pmi0("grid")
    public static final ChannelsEditMessagePrimaryAttachmentsModeDto GRID;
    private final String value;

    /* compiled from: ChannelsEditMessagePrimaryAttachmentsModeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsEditMessagePrimaryAttachmentsModeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsEditMessagePrimaryAttachmentsModeDto createFromParcel(Parcel parcel) {
            return ChannelsEditMessagePrimaryAttachmentsModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsEditMessagePrimaryAttachmentsModeDto[] newArray(int i) {
            return new ChannelsEditMessagePrimaryAttachmentsModeDto[i];
        }
    }

    static {
        ChannelsEditMessagePrimaryAttachmentsModeDto channelsEditMessagePrimaryAttachmentsModeDto = new ChannelsEditMessagePrimaryAttachmentsModeDto("CAROUSEL", 0, "carousel");
        CAROUSEL = channelsEditMessagePrimaryAttachmentsModeDto;
        ChannelsEditMessagePrimaryAttachmentsModeDto channelsEditMessagePrimaryAttachmentsModeDto2 = new ChannelsEditMessagePrimaryAttachmentsModeDto(SignalingProtocol.KEY_GRID, 1, "grid");
        GRID = channelsEditMessagePrimaryAttachmentsModeDto2;
        ChannelsEditMessagePrimaryAttachmentsModeDto[] channelsEditMessagePrimaryAttachmentsModeDtoArr = {channelsEditMessagePrimaryAttachmentsModeDto, channelsEditMessagePrimaryAttachmentsModeDto2};
        $VALUES = channelsEditMessagePrimaryAttachmentsModeDtoArr;
        $ENTRIES = new asp(channelsEditMessagePrimaryAttachmentsModeDtoArr);
        CREATOR = new a();
    }

    private ChannelsEditMessagePrimaryAttachmentsModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsEditMessagePrimaryAttachmentsModeDto valueOf(String str) {
        return (ChannelsEditMessagePrimaryAttachmentsModeDto) Enum.valueOf(ChannelsEditMessagePrimaryAttachmentsModeDto.class, str);
    }

    public static ChannelsEditMessagePrimaryAttachmentsModeDto[] values() {
        return (ChannelsEditMessagePrimaryAttachmentsModeDto[]) $VALUES.clone();
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
