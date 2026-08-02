package com.vk.api.generated.textlives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentTypeDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: TextlivesTextpostAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class TextlivesTextpostAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<TextlivesTextpostAttachmentDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("type")
    private final WallWallpostAttachmentTypeDto type;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: TextlivesTextpostAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<TextlivesTextpostAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final TextlivesTextpostAttachmentDto createFromParcel(Parcel parcel) {
            return new TextlivesTextpostAttachmentDto(WallWallpostAttachmentTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : BaseLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PhotosPhotoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PollsPollDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoVideoFullDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final TextlivesTextpostAttachmentDto[] newArray(int i) {
            return new TextlivesTextpostAttachmentDto[i];
        }
    }

    public TextlivesTextpostAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, String str, BaseLinkDto baseLinkDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, VideoVideoFullDto videoVideoFullDto) {
        this.type = wallWallpostAttachmentTypeDto;
        this.accessKey = str;
        this.link = baseLinkDto;
        this.photo = photosPhotoDto;
        this.poll = pollsPollDto;
        this.video = videoVideoFullDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextlivesTextpostAttachmentDto)) {
            return false;
        }
        TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto = (TextlivesTextpostAttachmentDto) obj;
        return this.type == textlivesTextpostAttachmentDto.type && epx.f(this.accessKey, textlivesTextpostAttachmentDto.accessKey) && epx.f(this.link, textlivesTextpostAttachmentDto.link) && epx.f(this.photo, textlivesTextpostAttachmentDto.photo) && epx.f(this.poll, textlivesTextpostAttachmentDto.poll) && epx.f(this.video, textlivesTextpostAttachmentDto.video);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode3 = (hashCode2 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode4 = (hashCode3 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode5 = (hashCode4 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        return hashCode5 + (videoVideoFullDto != null ? videoVideoFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "TextlivesTextpostAttachmentDto(type=" + this.type + ", accessKey=" + this.accessKey + ", link=" + this.link + ", photo=" + this.photo + ", poll=" + this.poll + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.accessKey);
        BaseLinkDto baseLinkDto = this.link;
        if (baseLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkDto.writeToParcel(parcel, i);
        }
        PhotosPhotoDto photosPhotoDto = this.photo;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        PollsPollDto pollsPollDto = this.poll;
        if (pollsPollDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pollsPollDto.writeToParcel(parcel, i);
        }
        VideoVideoFullDto videoVideoFullDto = this.video;
        if (videoVideoFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoFullDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TextlivesTextpostAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, String str, BaseLinkDto baseLinkDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this(wallWallpostAttachmentTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : baseLinkDto, (i & 8) != 0 ? null : photosPhotoDto, (i & 16) != 0 ? null : pollsPollDto, (i & 32) != 0 ? null : videoVideoFullDto);
    }
}
