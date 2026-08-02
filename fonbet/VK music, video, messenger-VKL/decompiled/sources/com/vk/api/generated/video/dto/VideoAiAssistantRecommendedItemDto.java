package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAiAssistantRecommendedItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantRecommendedItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantRecommendedItemDto> CREATOR = new a();

    @pmi0("item_type")
    private final ItemTypeDto itemType;

    @pmi0("playlist")
    private final VideoAiAssistantRecommendedItemPlaylistDto playlist;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAiAssistantRecommendedItemDto.kt */
    public static final class ItemTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemTypeDto[] $VALUES;
        public static final Parcelable.Creator<ItemTypeDto> CREATOR;

        @pmi0("playlist")
        public static final ItemTypeDto PLAYLIST;

        @pmi0("video")
        public static final ItemTypeDto VIDEO;
        private final String value;

        /* compiled from: VideoAiAssistantRecommendedItemDto.kt */
        public static final class a implements Parcelable.Creator<ItemTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ItemTypeDto createFromParcel(Parcel parcel) {
                return ItemTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ItemTypeDto[] newArray(int i) {
                return new ItemTypeDto[i];
            }
        }

        static {
            ItemTypeDto itemTypeDto = new ItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
            VIDEO = itemTypeDto;
            ItemTypeDto itemTypeDto2 = new ItemTypeDto("PLAYLIST", 1, "playlist");
            PLAYLIST = itemTypeDto2;
            ItemTypeDto[] itemTypeDtoArr = {itemTypeDto, itemTypeDto2};
            $VALUES = itemTypeDtoArr;
            $ENTRIES = new asp(itemTypeDtoArr);
            CREATOR = new a();
        }

        private ItemTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ItemTypeDto valueOf(String str) {
            return (ItemTypeDto) Enum.valueOf(ItemTypeDto.class, str);
        }

        public static ItemTypeDto[] values() {
            return (ItemTypeDto[]) $VALUES.clone();
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

    /* compiled from: VideoAiAssistantRecommendedItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantRecommendedItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantRecommendedItemDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantRecommendedItemDto(ItemTypeDto.CREATOR.createFromParcel(parcel), (VideoVideoFullDto) parcel.readParcelable(VideoAiAssistantRecommendedItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : VideoAiAssistantRecommendedItemPlaylistDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantRecommendedItemDto[] newArray(int i) {
            return new VideoAiAssistantRecommendedItemDto[i];
        }
    }

    public VideoAiAssistantRecommendedItemDto(ItemTypeDto itemTypeDto, VideoVideoFullDto videoVideoFullDto, VideoAiAssistantRecommendedItemPlaylistDto videoAiAssistantRecommendedItemPlaylistDto) {
        this.itemType = itemTypeDto;
        this.video = videoVideoFullDto;
        this.playlist = videoAiAssistantRecommendedItemPlaylistDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantRecommendedItemDto)) {
            return false;
        }
        VideoAiAssistantRecommendedItemDto videoAiAssistantRecommendedItemDto = (VideoAiAssistantRecommendedItemDto) obj;
        return this.itemType == videoAiAssistantRecommendedItemDto.itemType && epx.f(this.video, videoAiAssistantRecommendedItemDto.video) && epx.f(this.playlist, videoAiAssistantRecommendedItemDto.playlist);
    }

    public final int hashCode() {
        int hashCode = this.itemType.hashCode() * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode2 = (hashCode + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        VideoAiAssistantRecommendedItemPlaylistDto videoAiAssistantRecommendedItemPlaylistDto = this.playlist;
        return hashCode2 + (videoAiAssistantRecommendedItemPlaylistDto != null ? videoAiAssistantRecommendedItemPlaylistDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoAiAssistantRecommendedItemDto(itemType=" + this.itemType + ", video=" + this.video + ", playlist=" + this.playlist + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.itemType.writeToParcel(parcel, i);
        parcel.writeParcelable(this.video, i);
        VideoAiAssistantRecommendedItemPlaylistDto videoAiAssistantRecommendedItemPlaylistDto = this.playlist;
        if (videoAiAssistantRecommendedItemPlaylistDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantRecommendedItemPlaylistDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAiAssistantRecommendedItemDto(ItemTypeDto itemTypeDto, VideoVideoFullDto videoVideoFullDto, VideoAiAssistantRecommendedItemPlaylistDto videoAiAssistantRecommendedItemPlaylistDto, int i, zcl zclVar) {
        this(itemTypeDto, (i & 2) != 0 ? null : videoVideoFullDto, (i & 4) != 0 ? null : videoAiAssistantRecommendedItemPlaylistDto);
    }
}
