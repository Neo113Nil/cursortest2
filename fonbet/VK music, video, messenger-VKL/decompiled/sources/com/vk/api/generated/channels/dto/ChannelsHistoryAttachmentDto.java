package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoObjectsDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ChannelsHistoryAttachmentDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsHistoryAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsHistoryAttachmentDto> CREATOR = new a();

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("video")
    private final VideoOneOfVideoObjectsDto video;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsHistoryAttachmentDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("photo")
        public static final TypeDto PHOTO;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: ChannelsHistoryAttachmentDto.kt */
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
            TypeDto typeDto = new TypeDto("PHOTO", 0, "photo");
            PHOTO = typeDto;
            TypeDto typeDto2 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: ChannelsHistoryAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsHistoryAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsHistoryAttachmentDto createFromParcel(Parcel parcel) {
            return new ChannelsHistoryAttachmentDto(TypeDto.CREATOR.createFromParcel(parcel), (PhotosPhotoDto) parcel.readParcelable(ChannelsHistoryAttachmentDto.class.getClassLoader()), (VideoOneOfVideoObjectsDto) parcel.readParcelable(ChannelsHistoryAttachmentDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsHistoryAttachmentDto[] newArray(int i) {
            return new ChannelsHistoryAttachmentDto[i];
        }
    }

    public ChannelsHistoryAttachmentDto(TypeDto typeDto, PhotosPhotoDto photosPhotoDto, VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto) {
        this.type = typeDto;
        this.photo = photosPhotoDto;
        this.video = videoOneOfVideoObjectsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsHistoryAttachmentDto)) {
            return false;
        }
        ChannelsHistoryAttachmentDto channelsHistoryAttachmentDto = (ChannelsHistoryAttachmentDto) obj;
        return this.type == channelsHistoryAttachmentDto.type && epx.f(this.photo, channelsHistoryAttachmentDto.photo) && epx.f(this.video, channelsHistoryAttachmentDto.video);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode2 = (hashCode + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto = this.video;
        return hashCode2 + (videoOneOfVideoObjectsDto != null ? videoOneOfVideoObjectsDto.hashCode() : 0);
    }

    public final String toString() {
        return "ChannelsHistoryAttachmentDto(type=" + this.type + ", photo=" + this.photo + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.video, i);
    }

    public /* synthetic */ ChannelsHistoryAttachmentDto(TypeDto typeDto, PhotosPhotoDto photosPhotoDto, VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : photosPhotoDto, (i & 4) != 0 ? null : videoOneOfVideoObjectsDto);
    }
}
