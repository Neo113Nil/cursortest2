package com.vk.sdk.api.video.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BasePropertyExistsDto;
import java.util.List;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.to;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoAlbumFullDto.kt */
/* loaded from: classes5.dex */
public final class VideoVideoAlbumFullDto {

    @pmi0("can_delete")
    private final BaseBoolIntDto canDelete;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("can_upload")
    private final BaseBoolIntDto canUpload;

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("image_blur")
    private final BasePropertyExistsDto imageBlur;

    @pmi0("is_system")
    private final BasePropertyExistsDto isSystem;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
    private final ResponseTypeDto responseType;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("updated_time")
    private final int updatedTime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoAlbumFullDto.kt */
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

    public VideoVideoAlbumFullDto(int i, int i2, int i3, UserId userId, String str, List<VideoVideoImageDto> list, BasePropertyExistsDto basePropertyExistsDto, BasePropertyExistsDto basePropertyExistsDto2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str2, ResponseTypeDto responseTypeDto) {
        this.count = i;
        this.updatedTime = i2;
        this.id = i3;
        this.ownerId = userId;
        this.title = str;
        this.image = list;
        this.imageBlur = basePropertyExistsDto;
        this.isSystem = basePropertyExistsDto2;
        this.canEdit = baseBoolIntDto;
        this.canDelete = baseBoolIntDto2;
        this.canUpload = baseBoolIntDto3;
        this.trackCode = str2;
        this.responseType = responseTypeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAlbumFullDto)) {
            return false;
        }
        VideoVideoAlbumFullDto videoVideoAlbumFullDto = (VideoVideoAlbumFullDto) obj;
        return this.count == videoVideoAlbumFullDto.count && this.updatedTime == videoVideoAlbumFullDto.updatedTime && this.id == videoVideoAlbumFullDto.id && epx.f(this.ownerId, videoVideoAlbumFullDto.ownerId) && epx.f(this.title, videoVideoAlbumFullDto.title) && epx.f(this.image, videoVideoAlbumFullDto.image) && this.imageBlur == videoVideoAlbumFullDto.imageBlur && this.isSystem == videoVideoAlbumFullDto.isSystem && this.canEdit == videoVideoAlbumFullDto.canEdit && this.canDelete == videoVideoAlbumFullDto.canDelete && this.canUpload == videoVideoAlbumFullDto.canUpload && epx.f(this.trackCode, videoVideoAlbumFullDto.trackCode) && this.responseType == videoVideoAlbumFullDto.responseType;
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(shy.a(this.id, shy.a(this.updatedTime, Integer.hashCode(this.count) * 31, 31), 31), 31, this.ownerId.b), 31, this.title);
        List<VideoVideoImageDto> list = this.image;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.imageBlur;
        int hashCode2 = (hashCode + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto2 = this.isSystem;
        int hashCode3 = (hashCode2 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
        int hashCode5 = (hashCode4 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canUpload;
        int hashCode6 = (hashCode5 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        ResponseTypeDto responseTypeDto = this.responseType;
        return hashCode7 + (responseTypeDto != null ? responseTypeDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        int i2 = this.updatedTime;
        int i3 = this.id;
        UserId userId = this.ownerId;
        String str = this.title;
        List<VideoVideoImageDto> list = this.image;
        BasePropertyExistsDto basePropertyExistsDto = this.imageBlur;
        BasePropertyExistsDto basePropertyExistsDto2 = this.isSystem;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
        BaseBoolIntDto baseBoolIntDto3 = this.canUpload;
        String str2 = this.trackCode;
        ResponseTypeDto responseTypeDto = this.responseType;
        StringBuilder a = odj.a(i, i2, "VideoVideoAlbumFullDto(count=", ", updatedTime=", ", id=");
        a.append(i3);
        a.append(", ownerId=");
        a.append(userId);
        a.append(", title=");
        b.c(str, ", image=", ", imageBlur=", a, list);
        a.append(basePropertyExistsDto);
        a.append(", isSystem=");
        a.append(basePropertyExistsDto2);
        a.append(", canEdit=");
        to.b(a, baseBoolIntDto, ", canDelete=", baseBoolIntDto2, ", canUpload=");
        a.append(baseBoolIntDto3);
        a.append(", trackCode=");
        a.append(str2);
        a.append(", responseType=");
        a.append(responseTypeDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ VideoVideoAlbumFullDto(int i, int i2, int i3, UserId userId, String str, List list, BasePropertyExistsDto basePropertyExistsDto, BasePropertyExistsDto basePropertyExistsDto2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str2, ResponseTypeDto responseTypeDto, int i4, zcl zclVar) {
        this(i, i2, i3, userId, str, (i4 & 32) != 0 ? null : list, (i4 & 64) != 0 ? null : basePropertyExistsDto, (i4 & 128) != 0 ? null : basePropertyExistsDto2, (i4 & 256) != 0 ? null : baseBoolIntDto, (i4 & 512) != 0 ? null : baseBoolIntDto2, (i4 & 1024) != 0 ? null : baseBoolIntDto3, (i4 & 2048) != 0 ? null : str2, (i4 & 4096) != 0 ? null : responseTypeDto);
    }
}
