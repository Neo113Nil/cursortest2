package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsSendMessagePrimaryAttachmentsModeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSendMessagePrimaryAttachmentsModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsSendMessagePrimaryAttachmentsModeDto[] $VALUES;

    @pmi0("carousel")
    public static final ChannelsSendMessagePrimaryAttachmentsModeDto CAROUSEL;
    public static final Parcelable.Creator<ChannelsSendMessagePrimaryAttachmentsModeDto> CREATOR;

    @pmi0("grid")
    public static final ChannelsSendMessagePrimaryAttachmentsModeDto GRID;
    private final String value;

    /* compiled from: ChannelsSendMessagePrimaryAttachmentsModeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSendMessagePrimaryAttachmentsModeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSendMessagePrimaryAttachmentsModeDto createFromParcel(Parcel parcel) {
            return ChannelsSendMessagePrimaryAttachmentsModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSendMessagePrimaryAttachmentsModeDto[] newArray(int i) {
            return new ChannelsSendMessagePrimaryAttachmentsModeDto[i];
        }
    }

    static {
        ChannelsSendMessagePrimaryAttachmentsModeDto channelsSendMessagePrimaryAttachmentsModeDto = new ChannelsSendMessagePrimaryAttachmentsModeDto("CAROUSEL", 0, "carousel");
        CAROUSEL = channelsSendMessagePrimaryAttachmentsModeDto;
        ChannelsSendMessagePrimaryAttachmentsModeDto channelsSendMessagePrimaryAttachmentsModeDto2 = new ChannelsSendMessagePrimaryAttachmentsModeDto(SignalingProtocol.KEY_GRID, 1, "grid");
        GRID = channelsSendMessagePrimaryAttachmentsModeDto2;
        ChannelsSendMessagePrimaryAttachmentsModeDto[] channelsSendMessagePrimaryAttachmentsModeDtoArr = {channelsSendMessagePrimaryAttachmentsModeDto, channelsSendMessagePrimaryAttachmentsModeDto2};
        $VALUES = channelsSendMessagePrimaryAttachmentsModeDtoArr;
        $ENTRIES = new asp(channelsSendMessagePrimaryAttachmentsModeDtoArr);
        CREATOR = new a();
    }

    private ChannelsSendMessagePrimaryAttachmentsModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsSendMessagePrimaryAttachmentsModeDto valueOf(String str) {
        return (ChannelsSendMessagePrimaryAttachmentsModeDto) Enum.valueOf(ChannelsSendMessagePrimaryAttachmentsModeDto.class, str);
    }

    public static ChannelsSendMessagePrimaryAttachmentsModeDto[] values() {
        return (ChannelsSendMessagePrimaryAttachmentsModeDto[]) $VALUES.clone();
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
