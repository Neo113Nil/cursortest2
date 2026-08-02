package com.vk.sdk.api.stories.dto;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StoriesGetPhotoUploadServerResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoriesGetPhotoUploadServerResponseDto {

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("user_ids")
    private final List<Integer> userIds;

    public StoriesGetPhotoUploadServerResponseDto(String str, List<Integer> list) {
        this.uploadUrl = str;
        this.userIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetPhotoUploadServerResponseDto)) {
            return false;
        }
        StoriesGetPhotoUploadServerResponseDto storiesGetPhotoUploadServerResponseDto = (StoriesGetPhotoUploadServerResponseDto) obj;
        return epx.f(this.uploadUrl, storiesGetPhotoUploadServerResponseDto.uploadUrl) && epx.f(this.userIds, storiesGetPhotoUploadServerResponseDto.userIds);
    }

    public final int hashCode() {
        return this.userIds.hashCode() + (this.uploadUrl.hashCode() * 31);
    }

    public final String toString() {
        return "StoriesGetPhotoUploadServerResponseDto(uploadUrl=" + this.uploadUrl + ", userIds=" + this.userIds + ")";
    }
}
