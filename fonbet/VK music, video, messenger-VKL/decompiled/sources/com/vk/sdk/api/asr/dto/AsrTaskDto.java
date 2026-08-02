package com.vk.sdk.api.asr.dto;

import xsna.asp;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AsrTaskDto.kt */
/* loaded from: classes5.dex */
public final class AsrTaskDto {

    @pmi0("id")
    private final String id;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AsrTaskDto.kt */
    public static final class StatusDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("finished")
        public static final StatusDto FINISHED;

        @pmi0("internal_error")
        public static final StatusDto INTERNAL_ERROR;

        @pmi0("processing")
        public static final StatusDto PROCESSING;

        @pmi0("recognition_error")
        public static final StatusDto RECOGNITION_ERROR;

        @pmi0("transcoding_error")
        public static final StatusDto TRANSCODING_ERROR;
        private final String value;

        static {
            StatusDto statusDto = new StatusDto("PROCESSING", 0, "processing");
            PROCESSING = statusDto;
            StatusDto statusDto2 = new StatusDto("FINISHED", 1, "finished");
            FINISHED = statusDto2;
            StatusDto statusDto3 = new StatusDto("INTERNAL_ERROR", 2, "internal_error");
            INTERNAL_ERROR = statusDto3;
            StatusDto statusDto4 = new StatusDto("TRANSCODING_ERROR", 3, "transcoding_error");
            TRANSCODING_ERROR = statusDto4;
            StatusDto statusDto5 = new StatusDto("RECOGNITION_ERROR", 4, "recognition_error");
            RECOGNITION_ERROR = statusDto5;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5};
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

    public AsrTaskDto(String str, StatusDto statusDto, String str2) {
        this.id = str;
        this.status = statusDto;
        this.text = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrTaskDto)) {
            return false;
        }
        AsrTaskDto asrTaskDto = (AsrTaskDto) obj;
        return epx.f(this.id, asrTaskDto.id) && this.status == asrTaskDto.status && epx.f(this.text, asrTaskDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + ((this.status.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.id;
        StatusDto statusDto = this.status;
        String str2 = this.text;
        StringBuilder sb = new StringBuilder("AsrTaskDto(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(statusDto);
        sb.append(", text=");
        return i5s.a(sb, str2, ")");
    }
}
