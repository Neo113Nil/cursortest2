package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsGetHistoryAttachmentsAttachmentTypesDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetHistoryAttachmentsAttachmentTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsGetHistoryAttachmentsAttachmentTypesDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsGetHistoryAttachmentsAttachmentTypesDto> CREATOR;

    @pmi0("photo")
    public static final ChannelsGetHistoryAttachmentsAttachmentTypesDto PHOTO;

    @pmi0("video")
    public static final ChannelsGetHistoryAttachmentsAttachmentTypesDto VIDEO;
    private final String value;

    /* compiled from: ChannelsGetHistoryAttachmentsAttachmentTypesDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetHistoryAttachmentsAttachmentTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryAttachmentsAttachmentTypesDto createFromParcel(Parcel parcel) {
            return ChannelsGetHistoryAttachmentsAttachmentTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryAttachmentsAttachmentTypesDto[] newArray(int i) {
            return new ChannelsGetHistoryAttachmentsAttachmentTypesDto[i];
        }
    }

    static {
        ChannelsGetHistoryAttachmentsAttachmentTypesDto channelsGetHistoryAttachmentsAttachmentTypesDto = new ChannelsGetHistoryAttachmentsAttachmentTypesDto("PHOTO", 0, "photo");
        PHOTO = channelsGetHistoryAttachmentsAttachmentTypesDto;
        ChannelsGetHistoryAttachmentsAttachmentTypesDto channelsGetHistoryAttachmentsAttachmentTypesDto2 = new ChannelsGetHistoryAttachmentsAttachmentTypesDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
        VIDEO = channelsGetHistoryAttachmentsAttachmentTypesDto2;
        ChannelsGetHistoryAttachmentsAttachmentTypesDto[] channelsGetHistoryAttachmentsAttachmentTypesDtoArr = {channelsGetHistoryAttachmentsAttachmentTypesDto, channelsGetHistoryAttachmentsAttachmentTypesDto2};
        $VALUES = channelsGetHistoryAttachmentsAttachmentTypesDtoArr;
        $ENTRIES = new asp(channelsGetHistoryAttachmentsAttachmentTypesDtoArr);
        CREATOR = new a();
    }

    private ChannelsGetHistoryAttachmentsAttachmentTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsGetHistoryAttachmentsAttachmentTypesDto valueOf(String str) {
        return (ChannelsGetHistoryAttachmentsAttachmentTypesDto) Enum.valueOf(ChannelsGetHistoryAttachmentsAttachmentTypesDto.class, str);
    }

    public static ChannelsGetHistoryAttachmentsAttachmentTypesDto[] values() {
        return (ChannelsGetHistoryAttachmentsAttachmentTypesDto[]) $VALUES.clone();
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
