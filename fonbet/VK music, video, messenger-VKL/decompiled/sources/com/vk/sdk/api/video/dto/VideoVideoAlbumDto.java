package com.vk.sdk.api.video.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoAlbumDto.kt */
/* loaded from: classes5.dex */
public final class VideoVideoAlbumDto {

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
    private final ResponseTypeDto responseType;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoAlbumDto.kt */
    public static final class ResponseTypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResponseTypeDto[] $VALUES;

        @pmi0("full")
        public static final ResponseTypeDto FULL;

        @pmi0(UcumUtils.UCUM_MINUTES)
        public static final ResponseTypeDto MIN;
        private final String value;

        static {
            ResponseTypeDto responseTypeDto = new ResponseTypeDto("MIN", 0, UcumUtils.UCUM_MINUTES);
            MIN = responseTypeDto;
            ResponseTypeDto responseTypeDto2 = new ResponseTypeDto("FULL", 1, "full");
            FULL = responseTypeDto2;
            ResponseTypeDto[] responseTypeDtoArr = {responseTypeDto, responseTypeDto2};
            $VALUES = responseTypeDtoArr;
            $ENTRIES = new asp(responseTypeDtoArr);
        }

        private ResponseTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ResponseTypeDto valueOf(String str) {
            return (ResponseTypeDto) Enum.valueOf(ResponseTypeDto.class, str);
        }

        public static ResponseTypeDto[] values() {
            return (ResponseTypeDto[]) $VALUES.clone();
        }
    }

    public VideoVideoAlbumDto(int i, UserId userId, String str, String str2, ResponseTypeDto responseTypeDto) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.trackCode = str2;
        this.responseType = responseTypeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAlbumDto)) {
            return false;
        }
        VideoVideoAlbumDto videoVideoAlbumDto = (VideoVideoAlbumDto) obj;
        return this.id == videoVideoAlbumDto.id && epx.f(this.ownerId, videoVideoAlbumDto.ownerId) && epx.f(this.title, videoVideoAlbumDto.title) && epx.f(this.trackCode, videoVideoAlbumDto.trackCode) && this.responseType == videoVideoAlbumDto.responseType;
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title);
        String str = this.trackCode;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        ResponseTypeDto responseTypeDto = this.responseType;
        return hashCode + (responseTypeDto != null ? responseTypeDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        String str = this.title;
        String str2 = this.trackCode;
        ResponseTypeDto responseTypeDto = this.responseType;
        StringBuilder sb = new StringBuilder("VideoVideoAlbumDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", title=");
        n6j.b(sb, str, ", trackCode=", str2, ", responseType=");
        sb.append(responseTypeDto);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ VideoVideoAlbumDto(int i, UserId userId, String str, String str2, ResponseTypeDto responseTypeDto, int i2, zcl zclVar) {
        this(i, userId, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : responseTypeDto);
    }
}
