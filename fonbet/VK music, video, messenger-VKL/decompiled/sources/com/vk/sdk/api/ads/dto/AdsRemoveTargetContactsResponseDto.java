package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AdsRemoveTargetContactsResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsRemoveTargetContactsResponseDto {

    @pmi0("result")
    private final ResultDto result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsRemoveTargetContactsResponseDto.kt */
    public static final class ResultDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResultDto[] $VALUES;

        @pmi0("1")
        public static final ResultDto OK;
        private final int value;

        static {
            ResultDto resultDto = new ResultDto("OK", 0, 1);
            OK = resultDto;
            ResultDto[] resultDtoArr = {resultDto};
            $VALUES = resultDtoArr;
            $ENTRIES = new asp(resultDtoArr);
        }

        private ResultDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ResultDto valueOf(String str) {
            return (ResultDto) Enum.valueOf(ResultDto.class, str);
        }

        public static ResultDto[] values() {
            return (ResultDto[]) $VALUES.clone();
        }
    }

    public AdsRemoveTargetContactsResponseDto(ResultDto resultDto) {
        this.result = resultDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsRemoveTargetContactsResponseDto) && this.result == ((AdsRemoveTargetContactsResponseDto) obj).result;
    }

    public final int hashCode() {
        return this.result.hashCode();
    }

    public final String toString() {
        return "AdsRemoveTargetContactsResponseDto(result=" + this.result + ")";
    }
}
