package com.vk.sdk.api.ads.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.mq;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsLookalikeRequestDto.kt */
/* loaded from: classes5.dex */
public final class AdsLookalikeRequestDto {

    @pmi0("audience_count")
    private final Integer audienceCount;

    @pmi0("create_time")
    private final int createTime;

    @pmi0("id")
    private final int id;

    @pmi0("save_audience_levels")
    private final List<AdsLookalikeRequestSaveAudienceLevelDto> saveAudienceLevels;

    @pmi0("scheduled_delete_time")
    private final Integer scheduledDeleteTime;

    @pmi0("source_name")
    private final String sourceName;

    @pmi0("source_retargeting_group_id")
    private final Integer sourceRetargetingGroupId;

    @pmi0("source_type")
    private final SourceTypeDto sourceType;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("update_time")
    private final int updateTime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsLookalikeRequestDto.kt */
    public static final class SourceTypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceTypeDto[] $VALUES;

        @pmi0("promoted_post")
        public static final SourceTypeDto PROMOTED_POST;

        @pmi0("retargeting_group")
        public static final SourceTypeDto RETARGETING_GROUP;

        @pmi0("unknown")
        public static final SourceTypeDto UNKNOWN;
        private final String value;

        static {
            SourceTypeDto sourceTypeDto = new SourceTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "unknown");
            UNKNOWN = sourceTypeDto;
            SourceTypeDto sourceTypeDto2 = new SourceTypeDto("RETARGETING_GROUP", 1, "retargeting_group");
            RETARGETING_GROUP = sourceTypeDto2;
            SourceTypeDto sourceTypeDto3 = new SourceTypeDto("PROMOTED_POST", 2, "promoted_post");
            PROMOTED_POST = sourceTypeDto3;
            SourceTypeDto[] sourceTypeDtoArr = {sourceTypeDto, sourceTypeDto2, sourceTypeDto3};
            $VALUES = sourceTypeDtoArr;
            $ENTRIES = new asp(sourceTypeDtoArr);
        }

        private SourceTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SourceTypeDto valueOf(String str) {
            return (SourceTypeDto) Enum.valueOf(SourceTypeDto.class, str);
        }

        public static SourceTypeDto[] values() {
            return (SourceTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsLookalikeRequestDto.kt */
    public static final class StatusDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("canceled")
        public static final StatusDto CANCELED;

        @pmi0("new")
        public static final StatusDto NEW;

        @pmi0("save_done")
        public static final StatusDto SAVE_DONE;

        @pmi0("save_failed")
        public static final StatusDto SAVE_FAILED;

        @pmi0("save_in_progress")
        public static final StatusDto SAVE_IN_PROGRESS;

        @pmi0("search_done")
        public static final StatusDto SEARCH_DONE;

        @pmi0("search_failed")
        public static final StatusDto SEARCH_FAILED;

        @pmi0("search_in_progress")
        public static final StatusDto SEARCH_IN_PROGRESS;

        @pmi0("search_queued")
        public static final StatusDto SEARCH_QUEUED;

        @pmi0("unknown")
        public static final StatusDto UNKNOWN;
        private final String value;

        static {
            StatusDto statusDto = new StatusDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "unknown");
            UNKNOWN = statusDto;
            StatusDto statusDto2 = new StatusDto("NEW", 1, "new");
            NEW = statusDto2;
            StatusDto statusDto3 = new StatusDto("SEARCH_QUEUED", 2, "search_queued");
            SEARCH_QUEUED = statusDto3;
            StatusDto statusDto4 = new StatusDto("SEARCH_IN_PROGRESS", 3, "search_in_progress");
            SEARCH_IN_PROGRESS = statusDto4;
            StatusDto statusDto5 = new StatusDto("SEARCH_FAILED", 4, "search_failed");
            SEARCH_FAILED = statusDto5;
            StatusDto statusDto6 = new StatusDto("SEARCH_DONE", 5, "search_done");
            SEARCH_DONE = statusDto6;
            StatusDto statusDto7 = new StatusDto("SAVE_IN_PROGRESS", 6, "save_in_progress");
            SAVE_IN_PROGRESS = statusDto7;
            StatusDto statusDto8 = new StatusDto("SAVE_FAILED", 7, "save_failed");
            SAVE_FAILED = statusDto8;
            StatusDto statusDto9 = new StatusDto("SAVE_DONE", 8, "save_done");
            SAVE_DONE = statusDto9;
            StatusDto statusDto10 = new StatusDto(SignalingProtocol.HUNGUP_REASON_CANCELED, 9, "canceled");
            CANCELED = statusDto10;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5, statusDto6, statusDto7, statusDto8, statusDto9, statusDto10};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }
    }

    public AdsLookalikeRequestDto(int i, int i2, int i3, StatusDto statusDto, SourceTypeDto sourceTypeDto, Integer num, Integer num2, String str, Integer num3, List<AdsLookalikeRequestSaveAudienceLevelDto> list) {
        this.id = i;
        this.createTime = i2;
        this.updateTime = i3;
        this.status = statusDto;
        this.sourceType = sourceTypeDto;
        this.scheduledDeleteTime = num;
        this.sourceRetargetingGroupId = num2;
        this.sourceName = str;
        this.audienceCount = num3;
        this.saveAudienceLevels = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsLookalikeRequestDto)) {
            return false;
        }
        AdsLookalikeRequestDto adsLookalikeRequestDto = (AdsLookalikeRequestDto) obj;
        return this.id == adsLookalikeRequestDto.id && this.createTime == adsLookalikeRequestDto.createTime && this.updateTime == adsLookalikeRequestDto.updateTime && this.status == adsLookalikeRequestDto.status && this.sourceType == adsLookalikeRequestDto.sourceType && epx.f(this.scheduledDeleteTime, adsLookalikeRequestDto.scheduledDeleteTime) && epx.f(this.sourceRetargetingGroupId, adsLookalikeRequestDto.sourceRetargetingGroupId) && epx.f(this.sourceName, adsLookalikeRequestDto.sourceName) && epx.f(this.audienceCount, adsLookalikeRequestDto.audienceCount) && epx.f(this.saveAudienceLevels, adsLookalikeRequestDto.saveAudienceLevels);
    }

    public final int hashCode() {
        int hashCode = (this.sourceType.hashCode() + ((this.status.hashCode() + shy.a(this.updateTime, shy.a(this.createTime, Integer.hashCode(this.id) * 31, 31), 31)) * 31)) * 31;
        Integer num = this.scheduledDeleteTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sourceRetargetingGroupId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.sourceName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.audienceCount;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<AdsLookalikeRequestSaveAudienceLevelDto> list = this.saveAudienceLevels;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        int i2 = this.createTime;
        int i3 = this.updateTime;
        StatusDto statusDto = this.status;
        SourceTypeDto sourceTypeDto = this.sourceType;
        Integer num = this.scheduledDeleteTime;
        Integer num2 = this.sourceRetargetingGroupId;
        String str = this.sourceName;
        Integer num3 = this.audienceCount;
        List<AdsLookalikeRequestSaveAudienceLevelDto> list = this.saveAudienceLevels;
        StringBuilder a = odj.a(i, i2, "AdsLookalikeRequestDto(id=", ", createTime=", ", updateTime=");
        a.append(i3);
        a.append(", status=");
        a.append(statusDto);
        a.append(", sourceType=");
        a.append(sourceTypeDto);
        a.append(", scheduledDeleteTime=");
        a.append(num);
        a.append(", sourceRetargetingGroupId=");
        mq.b(num2, ", sourceName=", str, ", audienceCount=", a);
        a.append(num3);
        a.append(", saveAudienceLevels=");
        a.append(list);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AdsLookalikeRequestDto(int i, int i2, int i3, StatusDto statusDto, SourceTypeDto sourceTypeDto, Integer num, Integer num2, String str, Integer num3, List list, int i4, zcl zclVar) {
        this(i, i2, i3, statusDto, sourceTypeDto, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : num2, (i4 & 128) != 0 ? null : str, (i4 & 256) != 0 ? null : num3, (i4 & 512) != 0 ? null : list);
    }
}
