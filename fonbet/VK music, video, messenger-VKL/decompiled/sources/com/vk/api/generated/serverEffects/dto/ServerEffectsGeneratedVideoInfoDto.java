package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ServerEffectsGeneratedVideoInfoDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGeneratedVideoInfoDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGeneratedVideoInfoDto> CREATOR = new a();

    @pmi0("asr_output_url")
    private final String asrOutputUrl;

    @pmi0("generated_ov_id")
    private final long generatedOvId;

    @pmi0("generation_parameters")
    private final ServerEffectsGenerationParametersDto generationParameters;

    @pmi0("mp4_url")
    private final String mp4Url;

    @pmi0("processing_completion_estimated_timestamp")
    private final Long processingCompletionEstimatedTimestamp;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("status_poll_interval")
    private final Integer statusPollInterval;

    @pmi0("thumbnail_url")
    private final String thumbnailUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServerEffectsGeneratedVideoInfoDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("50")
        public static final StatusDto ERROR;

        @pmi0("10")
        public static final StatusDto ORIGINAL_VALIDATION_FAILED;

        @pmi0("4")
        public static final StatusDto READY_FOR_PREVIEW;

        @pmi0("1")
        public static final StatusDto TRANSFORMATION_IN_PROGRESS;

        @pmi0("0")
        public static final StatusDto WAITING_FOR_ORIGINAL_UPLOAD;

        @pmi0("2")
        public static final StatusDto WAITING_FOR_ORIGINAL_VALIDATION;
        private final int value;

        /* compiled from: ServerEffectsGeneratedVideoInfoDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("WAITING_FOR_ORIGINAL_UPLOAD", 0, 0);
            WAITING_FOR_ORIGINAL_UPLOAD = statusDto;
            StatusDto statusDto2 = new StatusDto("TRANSFORMATION_IN_PROGRESS", 1, 1);
            TRANSFORMATION_IN_PROGRESS = statusDto2;
            StatusDto statusDto3 = new StatusDto("WAITING_FOR_ORIGINAL_VALIDATION", 2, 2);
            WAITING_FOR_ORIGINAL_VALIDATION = statusDto3;
            StatusDto statusDto4 = new StatusDto("READY_FOR_PREVIEW", 3, 4);
            READY_FOR_PREVIEW = statusDto4;
            StatusDto statusDto5 = new StatusDto("ORIGINAL_VALIDATION_FAILED", 4, 10);
            ORIGINAL_VALIDATION_FAILED = statusDto5;
            StatusDto statusDto6 = new StatusDto("ERROR", 5, 50);
            ERROR = statusDto6;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5, statusDto6};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: ServerEffectsGeneratedVideoInfoDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGeneratedVideoInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGeneratedVideoInfoDto createFromParcel(Parcel parcel) {
            Long valueOf;
            Integer num;
            long readLong = parcel.readLong();
            StatusDto createFromParcel = StatusDto.CREATOR.createFromParcel(parcel);
            ServerEffectsGenerationParametersDto createFromParcel2 = ServerEffectsGenerationParametersDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            String readString2 = parcel.readString();
            Integer num2 = num;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            return new ServerEffectsGeneratedVideoInfoDto(readLong, createFromParcel, createFromParcel2, readString, valueOf, readString2, readString3, num2);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGeneratedVideoInfoDto[] newArray(int i) {
            return new ServerEffectsGeneratedVideoInfoDto[i];
        }
    }

    public ServerEffectsGeneratedVideoInfoDto(long j, StatusDto statusDto, ServerEffectsGenerationParametersDto serverEffectsGenerationParametersDto, String str, Long l, String str2, String str3, Integer num) {
        this.generatedOvId = j;
        this.status = statusDto;
        this.generationParameters = serverEffectsGenerationParametersDto;
        this.mp4Url = str;
        this.processingCompletionEstimatedTimestamp = l;
        this.thumbnailUrl = str2;
        this.asrOutputUrl = str3;
        this.statusPollInterval = num;
    }

    public final String d() {
        return this.mp4Url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Long e() {
        return this.processingCompletionEstimatedTimestamp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsGeneratedVideoInfoDto)) {
            return false;
        }
        ServerEffectsGeneratedVideoInfoDto serverEffectsGeneratedVideoInfoDto = (ServerEffectsGeneratedVideoInfoDto) obj;
        return this.generatedOvId == serverEffectsGeneratedVideoInfoDto.generatedOvId && this.status == serverEffectsGeneratedVideoInfoDto.status && epx.f(this.generationParameters, serverEffectsGeneratedVideoInfoDto.generationParameters) && epx.f(this.mp4Url, serverEffectsGeneratedVideoInfoDto.mp4Url) && epx.f(this.processingCompletionEstimatedTimestamp, serverEffectsGeneratedVideoInfoDto.processingCompletionEstimatedTimestamp) && epx.f(this.thumbnailUrl, serverEffectsGeneratedVideoInfoDto.thumbnailUrl) && epx.f(this.asrOutputUrl, serverEffectsGeneratedVideoInfoDto.asrOutputUrl) && epx.f(this.statusPollInterval, serverEffectsGeneratedVideoInfoDto.statusPollInterval);
    }

    public final StatusDto f() {
        return this.status;
    }

    public final Integer g() {
        return this.statusPollInterval;
    }

    public final int hashCode() {
        int hashCode = (this.generationParameters.hashCode() + ((this.status.hashCode() + (Long.hashCode(this.generatedOvId) * 31)) * 31)) * 31;
        String str = this.mp4Url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.processingCompletionEstimatedTimestamp;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.thumbnailUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.asrOutputUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.statusPollInterval;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGeneratedVideoInfoDto(generatedOvId=");
        sb.append(this.generatedOvId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", generationParameters=");
        sb.append(this.generationParameters);
        sb.append(", mp4Url=");
        sb.append(this.mp4Url);
        sb.append(", processingCompletionEstimatedTimestamp=");
        sb.append(this.processingCompletionEstimatedTimestamp);
        sb.append(", thumbnailUrl=");
        sb.append(this.thumbnailUrl);
        sb.append(", asrOutputUrl=");
        sb.append(this.asrOutputUrl);
        sb.append(", statusPollInterval=");
        return uqi.b(sb, this.statusPollInterval, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.generatedOvId);
        this.status.writeToParcel(parcel, i);
        this.generationParameters.writeToParcel(parcel, i);
        parcel.writeString(this.mp4Url);
        Long l = this.processingCompletionEstimatedTimestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.asrOutputUrl);
        Integer num = this.statusPollInterval;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ServerEffectsGeneratedVideoInfoDto(long j, StatusDto statusDto, ServerEffectsGenerationParametersDto serverEffectsGenerationParametersDto, String str, Long l, String str2, String str3, Integer num, int i, zcl zclVar) {
        this(j, statusDto, serverEffectsGenerationParametersDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : num);
    }
}
