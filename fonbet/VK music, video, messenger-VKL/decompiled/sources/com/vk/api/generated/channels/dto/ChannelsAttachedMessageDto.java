package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.messages.dto.MessagesAudioMessageDto;
import com.vk.api.generated.messages.dto.MessagesMessageAttachmentLinkDto;
import com.vk.api.generated.messages.dto.MessagesMessageAttachmentVideoMessageDto;
import com.vk.api.generated.messages.dto.MessagesMessageAttachmentWallpostDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoObjectsDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ChannelsAttachedMessageDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsAttachedMessageDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsAttachedMessageDto> CREATOR = new a();

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_message")
    private final MessagesAudioMessageDto audioMessage;

    @pmi0("audio_playlist")
    private final AudioPlaylistDto audioPlaylist;

    @pmi0("channel_message")
    private final ChannelsMessageDto channelMessage;

    @pmi0("channel_stub")
    private final ChannelsStubAttachmentDto channelStub;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("link")
    private final MessagesMessageAttachmentLinkDto link;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("sticker")
    private final BaseStickerDto sticker;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("video")
    private final VideoOneOfVideoObjectsDto video;

    @pmi0("video_message")
    private final MessagesMessageAttachmentVideoMessageDto videoMessage;

    @pmi0("wall")
    private final MessagesMessageAttachmentWallpostDto wall;

    @pmi0("wall_reply")
    private final WallWallCommentDto wallReply;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsAttachedMessageDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("audio")
        public static final TypeDto AUDIO;

        @pmi0("audio_message")
        public static final TypeDto AUDIO_MESSAGE;

        @pmi0("audio_playlist")
        public static final TypeDto AUDIO_PLAYLIST;

        @pmi0("channel_message")
        public static final TypeDto CHANNEL_MESSAGE;

        @pmi0("channel_stub")
        public static final TypeDto CHANNEL_STUB;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("doc")
        public static final TypeDto DOC;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("photo")
        public static final TypeDto PHOTO;

        @pmi0("poll")
        public static final TypeDto POLL;

        @pmi0("sticker")
        public static final TypeDto STICKER;

        @pmi0("video")
        public static final TypeDto VIDEO;

        @pmi0("video_message")
        public static final TypeDto VIDEO_MESSAGE;

        @pmi0("wall")
        public static final TypeDto WALL;

        @pmi0("wall_reply")
        public static final TypeDto WALL_REPLY;
        private final String value;

        /* compiled from: ChannelsAttachedMessageDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 0, "audio");
            AUDIO = typeDto;
            TypeDto typeDto2 = new TypeDto("AUDIO_PLAYLIST", 1, "audio_playlist");
            AUDIO_PLAYLIST = typeDto2;
            TypeDto typeDto3 = new TypeDto("AUDIO_MESSAGE", 2, "audio_message");
            AUDIO_MESSAGE = typeDto3;
            TypeDto typeDto4 = new TypeDto("CHANNEL_MESSAGE", 3, "channel_message");
            CHANNEL_MESSAGE = typeDto4;
            TypeDto typeDto5 = new TypeDto("DOC", 4, "doc");
            DOC = typeDto5;
            TypeDto typeDto6 = new TypeDto("LINK", 5, "link");
            LINK = typeDto6;
            TypeDto typeDto7 = new TypeDto("PHOTO", 6, "photo");
            PHOTO = typeDto7;
            TypeDto typeDto8 = new TypeDto("POLL", 7, "poll");
            POLL = typeDto8;
            TypeDto typeDto9 = new TypeDto("STICKER", 8, "sticker");
            STICKER = typeDto9;
            TypeDto typeDto10 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 9, "video");
            VIDEO = typeDto10;
            TypeDto typeDto11 = new TypeDto("VIDEO_MESSAGE", 10, "video_message");
            VIDEO_MESSAGE = typeDto11;
            TypeDto typeDto12 = new TypeDto("WALL", 11, "wall");
            WALL = typeDto12;
            TypeDto typeDto13 = new TypeDto("WALL_REPLY", 12, "wall_reply");
            WALL_REPLY = typeDto13;
            TypeDto typeDto14 = new TypeDto("CHANNEL_STUB", 13, "channel_stub");
            CHANNEL_STUB = typeDto14;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: ChannelsAttachedMessageDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsAttachedMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsAttachedMessageDto createFromParcel(Parcel parcel) {
            return new ChannelsAttachedMessageDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesMessageAttachmentWallpostDto.CREATOR.createFromParcel(parcel), (AudioAudioDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), (AudioPlaylistDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesAudioMessageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ChannelsMessageDto.CREATOR.createFromParcel(parcel), (DocsDocDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesMessageAttachmentLinkDto.CREATOR.createFromParcel(parcel), (PhotosPhotoDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), (PollsPollDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), (BaseStickerDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), (VideoOneOfVideoObjectsDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesMessageAttachmentVideoMessageDto.CREATOR.createFromParcel(parcel), (WallWallCommentDto) parcel.readParcelable(ChannelsAttachedMessageDto.class.getClassLoader()), parcel.readInt() == 0 ? null : ChannelsStubAttachmentDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsAttachedMessageDto[] newArray(int i) {
            return new ChannelsAttachedMessageDto[i];
        }
    }

    public ChannelsAttachedMessageDto(TypeDto typeDto, MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto, AudioAudioDto audioAudioDto, AudioPlaylistDto audioPlaylistDto, MessagesAudioMessageDto messagesAudioMessageDto, ChannelsMessageDto channelsMessageDto, DocsDocDto docsDocDto, MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, BaseStickerDto baseStickerDto, VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto, MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto, WallWallCommentDto wallWallCommentDto, ChannelsStubAttachmentDto channelsStubAttachmentDto) {
        this.type = typeDto;
        this.wall = messagesMessageAttachmentWallpostDto;
        this.audio = audioAudioDto;
        this.audioPlaylist = audioPlaylistDto;
        this.audioMessage = messagesAudioMessageDto;
        this.channelMessage = channelsMessageDto;
        this.doc = docsDocDto;
        this.link = messagesMessageAttachmentLinkDto;
        this.photo = photosPhotoDto;
        this.poll = pollsPollDto;
        this.sticker = baseStickerDto;
        this.video = videoOneOfVideoObjectsDto;
        this.videoMessage = messagesMessageAttachmentVideoMessageDto;
        this.wallReply = wallWallCommentDto;
        this.channelStub = channelsStubAttachmentDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsAttachedMessageDto)) {
            return false;
        }
        ChannelsAttachedMessageDto channelsAttachedMessageDto = (ChannelsAttachedMessageDto) obj;
        return this.type == channelsAttachedMessageDto.type && epx.f(this.wall, channelsAttachedMessageDto.wall) && epx.f(this.audio, channelsAttachedMessageDto.audio) && epx.f(this.audioPlaylist, channelsAttachedMessageDto.audioPlaylist) && epx.f(this.audioMessage, channelsAttachedMessageDto.audioMessage) && epx.f(this.channelMessage, channelsAttachedMessageDto.channelMessage) && epx.f(this.doc, channelsAttachedMessageDto.doc) && epx.f(this.link, channelsAttachedMessageDto.link) && epx.f(this.photo, channelsAttachedMessageDto.photo) && epx.f(this.poll, channelsAttachedMessageDto.poll) && epx.f(this.sticker, channelsAttachedMessageDto.sticker) && epx.f(this.video, channelsAttachedMessageDto.video) && epx.f(this.videoMessage, channelsAttachedMessageDto.videoMessage) && epx.f(this.wallReply, channelsAttachedMessageDto.wallReply) && epx.f(this.channelStub, channelsAttachedMessageDto.channelStub);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto = this.wall;
        int hashCode2 = (hashCode + (messagesMessageAttachmentWallpostDto == null ? 0 : messagesMessageAttachmentWallpostDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode3 = (hashCode2 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        AudioPlaylistDto audioPlaylistDto = this.audioPlaylist;
        int hashCode4 = (hashCode3 + (audioPlaylistDto == null ? 0 : audioPlaylistDto.hashCode())) * 31;
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        int hashCode5 = (hashCode4 + (messagesAudioMessageDto == null ? 0 : messagesAudioMessageDto.hashCode())) * 31;
        ChannelsMessageDto channelsMessageDto = this.channelMessage;
        int hashCode6 = (hashCode5 + (channelsMessageDto == null ? 0 : channelsMessageDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode7 = (hashCode6 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto = this.link;
        int hashCode8 = (hashCode7 + (messagesMessageAttachmentLinkDto == null ? 0 : messagesMessageAttachmentLinkDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode9 = (hashCode8 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode10 = (hashCode9 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        BaseStickerDto baseStickerDto = this.sticker;
        int hashCode11 = (hashCode10 + (baseStickerDto == null ? 0 : baseStickerDto.hashCode())) * 31;
        VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto = this.video;
        int hashCode12 = (hashCode11 + (videoOneOfVideoObjectsDto == null ? 0 : videoOneOfVideoObjectsDto.hashCode())) * 31;
        MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto = this.videoMessage;
        int hashCode13 = (hashCode12 + (messagesMessageAttachmentVideoMessageDto == null ? 0 : messagesMessageAttachmentVideoMessageDto.hashCode())) * 31;
        WallWallCommentDto wallWallCommentDto = this.wallReply;
        int hashCode14 = (hashCode13 + (wallWallCommentDto == null ? 0 : wallWallCommentDto.hashCode())) * 31;
        ChannelsStubAttachmentDto channelsStubAttachmentDto = this.channelStub;
        return hashCode14 + (channelsStubAttachmentDto != null ? channelsStubAttachmentDto.hashCode() : 0);
    }

    public final String toString() {
        return "ChannelsAttachedMessageDto(type=" + this.type + ", wall=" + this.wall + ", audio=" + this.audio + ", audioPlaylist=" + this.audioPlaylist + ", audioMessage=" + this.audioMessage + ", channelMessage=" + this.channelMessage + ", doc=" + this.doc + ", link=" + this.link + ", photo=" + this.photo + ", poll=" + this.poll + ", sticker=" + this.sticker + ", video=" + this.video + ", videoMessage=" + this.videoMessage + ", wallReply=" + this.wallReply + ", channelStub=" + this.channelStub + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto = this.wall;
        if (messagesMessageAttachmentWallpostDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentWallpostDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.audio, i);
        parcel.writeParcelable(this.audioPlaylist, i);
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        if (messagesAudioMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesAudioMessageDto.writeToParcel(parcel, i);
        }
        ChannelsMessageDto channelsMessageDto = this.channelMessage;
        if (channelsMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessageDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.doc, i);
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto = this.link;
        if (messagesMessageAttachmentLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentLinkDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.poll, i);
        parcel.writeParcelable(this.sticker, i);
        parcel.writeParcelable(this.video, i);
        MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto = this.videoMessage;
        if (messagesMessageAttachmentVideoMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentVideoMessageDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.wallReply, i);
        ChannelsStubAttachmentDto channelsStubAttachmentDto = this.channelStub;
        if (channelsStubAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsStubAttachmentDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ChannelsAttachedMessageDto(TypeDto typeDto, MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto, AudioAudioDto audioAudioDto, AudioPlaylistDto audioPlaylistDto, MessagesAudioMessageDto messagesAudioMessageDto, ChannelsMessageDto channelsMessageDto, DocsDocDto docsDocDto, MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, BaseStickerDto baseStickerDto, VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto, MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto, WallWallCommentDto wallWallCommentDto, ChannelsStubAttachmentDto channelsStubAttachmentDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : messagesMessageAttachmentWallpostDto, (i & 4) != 0 ? null : audioAudioDto, (i & 8) != 0 ? null : audioPlaylistDto, (i & 16) != 0 ? null : messagesAudioMessageDto, (i & 32) != 0 ? null : channelsMessageDto, (i & 64) != 0 ? null : docsDocDto, (i & 128) != 0 ? null : messagesMessageAttachmentLinkDto, (i & 256) != 0 ? null : photosPhotoDto, (i & 512) != 0 ? null : pollsPollDto, (i & 1024) != 0 ? null : baseStickerDto, (i & 2048) != 0 ? null : videoOneOfVideoObjectsDto, (i & 4096) != 0 ? null : messagesMessageAttachmentVideoMessageDto, (i & 8192) != 0 ? null : wallWallCommentDto, (i & 16384) != 0 ? null : channelsStubAttachmentDto);
    }
}
