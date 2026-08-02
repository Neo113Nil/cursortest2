package com.vk.sdk.api.stories.dto;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StoriesGetVideoUploadServerResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoriesGetVideoUploadServerResponseDto {

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("user_ids")
    private final List<Integer> userIds;

    public StoriesGetVideoUploadServerResponseDto(String str, List<Integer> list) {
        this.uploadUrl = str;
        this.userIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetVideoUploadServerResponseDto)) {
            return false;
        }
        StoriesGetVideoUploadServerResponseDto storiesGetVideoUploadServerResponseDto = (StoriesGetVideoUploadServerResponseDto) obj;
        return epx.f(this.uploadUrl, storiesGetVideoUploadServerResponseDto.uploadUrl) && epx.f(this.userIds, storiesGetVideoUploadServerResponseDto.userIds);
    }

    public final int hashCode() {
        return this.userIds.hashCode() + (this.uploadUrl.hashCode() * 31);
    }

    public final String toString() {
        return "StoriesGetVideoUploadServerResponseDto(uploadUrl=" + this.uploadUrl + ", userIds=" + this.userIds + ")";
    }
}
