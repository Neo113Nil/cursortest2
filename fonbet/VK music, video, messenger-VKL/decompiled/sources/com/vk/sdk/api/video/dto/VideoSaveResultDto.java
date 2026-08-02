package com.vk.sdk.api.video.dto;

import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: VideoSaveResultDto.kt */
/* loaded from: classes5.dex */
public final class VideoSaveResultDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("description")
    private final String description;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("title")
    private final String title;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("video_id")
    private final Integer videoId;

    public VideoSaveResultDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSaveResultDto)) {
            return false;
        }
        VideoSaveResultDto videoSaveResultDto = (VideoSaveResultDto) obj;
        return epx.f(this.accessKey, videoSaveResultDto.accessKey) && epx.f(this.description, videoSaveResultDto.description) && epx.f(this.ownerId, videoSaveResultDto.ownerId) && epx.f(this.title, videoSaveResultDto.title) && epx.f(this.uploadUrl, videoSaveResultDto.uploadUrl) && epx.f(this.videoId, videoSaveResultDto.videoId);
    }

    public final int hashCode() {
        String str = this.accessKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uploadUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.videoId;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessKey;
        String str2 = this.description;
        UserId userId = this.ownerId;
        String str3 = this.title;
        String str4 = this.uploadUrl;
        Integer num = this.videoId;
        StringBuilder a = xe9.a("VideoSaveResultDto(accessKey=", str, ", description=", str2, ", ownerId=");
        a.append(userId);
        a.append(", title=");
        a.append(str3);
        a.append(", uploadUrl=");
        a.append(str4);
        a.append(", videoId=");
        a.append(num);
        a.append(")");
        return a.toString();
    }

    public VideoSaveResultDto(String str, String str2, UserId userId, String str3, String str4, Integer num) {
        this.accessKey = str;
        this.description = str2;
        this.ownerId = userId;
        this.title = str3;
        this.uploadUrl = str4;
        this.videoId = num;
    }

    public /* synthetic */ VideoSaveResultDto(String str, String str2, UserId userId, String str3, String str4, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num);
    }
}
