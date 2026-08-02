package com.vk.sdk.api.textlives.dto;

import com.vk.sdk.api.base.dto.BaseLinkDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.polls.dto.PollsPollDto;
import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import com.vk.sdk.api.wall.dto.WallWallpostAttachmentTypeDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: TextlivesTextpostAttachmentDto.kt */
/* loaded from: classes5.dex */
public final class TextlivesTextpostAttachmentDto {

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

    public TextlivesTextpostAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, String str, BaseLinkDto baseLinkDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, VideoVideoFullDto videoVideoFullDto) {
        this.type = wallWallpostAttachmentTypeDto;
        this.accessKey = str;
        this.link = baseLinkDto;
        this.photo = photosPhotoDto;
        this.poll = pollsPollDto;
        this.video = videoVideoFullDto;
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
        return "TextlivesTextpostAttachmentDto(type=" + this.type + ", accessKey=" + this.accessKey + ", link=" + this.link + ", photo=" + this.photo + ", poll=" + this.poll + ", video=" + this.video + ")";
    }

    public /* synthetic */ TextlivesTextpostAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, String str, BaseLinkDto baseLinkDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this(wallWallpostAttachmentTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : baseLinkDto, (i & 8) != 0 ? null : photosPhotoDto, (i & 16) != 0 ? null : pollsPollDto, (i & 32) != 0 ? null : videoVideoFullDto);
    }
}
