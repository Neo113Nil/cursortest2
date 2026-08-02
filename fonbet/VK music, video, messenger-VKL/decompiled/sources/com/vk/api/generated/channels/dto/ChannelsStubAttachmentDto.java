package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ChannelsStubAttachmentDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsStubAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsStubAttachmentDto> CREATOR = new a();

    @pmi0("artist")
    private final String artist;

    @pmi0("ext")
    private final String ext;

    @pmi0("height")
    private final Integer height;

    @pmi0("size")
    private final Integer size;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsStubAttachmentDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("audio")
        public static final TypeDto AUDIO;

        @pmi0("audio_message")
        public static final TypeDto AUDIO_MESSAGE;

        @pmi0("channel_message")
        public static final TypeDto CHANNEL_MESSAGE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final TypeDto DEFAULT;

        @pmi0("doc")
        public static final TypeDto DOC;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("photo")
        public static final TypeDto PHOTO;

        @pmi0("poll")
        public static final TypeDto POLL;

        @pmi0("video")
        public static final TypeDto VIDEO;

        @pmi0("video_message")
        public static final TypeDto VIDEO_MESSAGE;

        @pmi0("wall")
        public static final TypeDto WALL;

        @pmi0("wall_reply")
        public static final TypeDto WALL_REPLY;
        private final String value;

        /* compiled from: ChannelsStubAttachmentDto.kt */
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
            TypeDto typeDto = new TypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = typeDto;
            TypeDto typeDto2 = new TypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
            AUDIO = typeDto2;
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
            TypeDto typeDto9 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 8, "video");
            VIDEO = typeDto9;
            TypeDto typeDto10 = new TypeDto("VIDEO_MESSAGE", 9, "video_message");
            VIDEO_MESSAGE = typeDto10;
            TypeDto typeDto11 = new TypeDto("WALL", 10, "wall");
            WALL = typeDto11;
            TypeDto typeDto12 = new TypeDto("WALL_REPLY", 11, "wall_reply");
            WALL_REPLY = typeDto12;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12};
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

    /* compiled from: ChannelsStubAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsStubAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsStubAttachmentDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            Integer num = null;
            Integer num2 = valueOf;
            Integer num3 = valueOf2;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new ChannelsStubAttachmentDto(createFromParcel, num2, num3, readString, readString2, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsStubAttachmentDto[] newArray(int i) {
            return new ChannelsStubAttachmentDto[i];
        }
    }

    public ChannelsStubAttachmentDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsStubAttachmentDto)) {
            return false;
        }
        ChannelsStubAttachmentDto channelsStubAttachmentDto = (ChannelsStubAttachmentDto) obj;
        return this.type == channelsStubAttachmentDto.type && epx.f(this.height, channelsStubAttachmentDto.height) && epx.f(this.width, channelsStubAttachmentDto.width) && epx.f(this.artist, channelsStubAttachmentDto.artist) && epx.f(this.title, channelsStubAttachmentDto.title) && epx.f(this.size, channelsStubAttachmentDto.size) && epx.f(this.ext, channelsStubAttachmentDto.ext);
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        Integer num = this.height;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.artist;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.size;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.ext;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsStubAttachmentDto(type=");
        sb.append(this.type);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", artist=");
        sb.append(this.artist);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", ext=");
        return ho8.a(sb, this.ext, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.artist);
        parcel.writeString(this.title);
        Integer num3 = this.size;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.ext);
    }

    public ChannelsStubAttachmentDto(TypeDto typeDto, Integer num, Integer num2, String str, String str2, Integer num3, String str3) {
        this.type = typeDto;
        this.height = num;
        this.width = num2;
        this.artist = str;
        this.title = str2;
        this.size = num3;
        this.ext = str3;
    }

    public /* synthetic */ ChannelsStubAttachmentDto(TypeDto typeDto, Integer num, Integer num2, String str, String str2, Integer num3, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str3);
    }
}
