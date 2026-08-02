package com.vk.sdk.api.video.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoStartStreamingResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoStartStreamingResponseDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("description")
    private final String description;

    @pmi0("name")
    private final String name;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("stream")
    private final VideoStreamInputParamsDto stream;

    @pmi0("thumb_upload_url")
    private final String thumbUploadUrl;

    @pmi0("video_id")
    private final int videoId;

    public VideoStartStreamingResponseDto(UserId userId, int i, String str, String str2, String str3, VideoStreamInputParamsDto videoStreamInputParamsDto, String str4, Integer num) {
        this.ownerId = userId;
        this.videoId = i;
        this.name = str;
        this.description = str2;
        this.accessKey = str3;
        this.stream = videoStreamInputParamsDto;
        this.thumbUploadUrl = str4;
        this.postId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStartStreamingResponseDto)) {
            return false;
        }
        VideoStartStreamingResponseDto videoStartStreamingResponseDto = (VideoStartStreamingResponseDto) obj;
        return epx.f(this.ownerId, videoStartStreamingResponseDto.ownerId) && this.videoId == videoStartStreamingResponseDto.videoId && epx.f(this.name, videoStartStreamingResponseDto.name) && epx.f(this.description, videoStartStreamingResponseDto.description) && epx.f(this.accessKey, videoStartStreamingResponseDto.accessKey) && epx.f(this.stream, videoStartStreamingResponseDto.stream) && epx.f(this.thumbUploadUrl, videoStartStreamingResponseDto.thumbUploadUrl) && epx.f(this.postId, videoStartStreamingResponseDto.postId);
    }

    public final int hashCode() {
        int hashCode = (this.stream.hashCode() + urd0.a(urd0.a(urd0.a(shy.a(this.videoId, Long.hashCode(this.ownerId.b) * 31, 31), 31, this.name), 31, this.description), 31, this.accessKey)) * 31;
        String str = this.thumbUploadUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.postId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.ownerId;
        int i = this.videoId;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.accessKey;
        VideoStreamInputParamsDto videoStreamInputParamsDto = this.stream;
        String str4 = this.thumbUploadUrl;
        Integer num = this.postId;
        StringBuilder sb = new StringBuilder("VideoStartStreamingResponseDto(ownerId=");
        sb.append(userId);
        sb.append(", videoId=");
        sb.append(i);
        sb.append(", name=");
        n6j.b(sb, str, ", description=", str2, ", accessKey=");
        sb.append(str3);
        sb.append(", stream=");
        sb.append(videoStreamInputParamsDto);
        sb.append(", thumbUploadUrl=");
        sb.append(str4);
        sb.append(", postId=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ VideoStartStreamingResponseDto(UserId userId, int i, String str, String str2, String str3, VideoStreamInputParamsDto videoStreamInputParamsDto, String str4, Integer num, int i2, zcl zclVar) {
        this(userId, i, str, str2, str3, videoStreamInputParamsDto, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : num);
    }
}
