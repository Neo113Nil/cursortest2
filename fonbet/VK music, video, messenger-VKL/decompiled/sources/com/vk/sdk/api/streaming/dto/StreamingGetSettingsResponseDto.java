package com.vk.sdk.api.streaming.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StreamingGetSettingsResponseDto.kt */
/* loaded from: classes5.dex */
public final class StreamingGetSettingsResponseDto {

    @pmi0("monthly_limit")
    private final MonthlyLimitDto monthlyLimit;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StreamingGetSettingsResponseDto.kt */
    public static final class MonthlyLimitDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MonthlyLimitDto[] $VALUES;

        @pmi0("tier_1")
        public static final MonthlyLimitDto TIER_1;

        @pmi0("tier_2")
        public static final MonthlyLimitDto TIER_2;

        @pmi0("tier_3")
        public static final MonthlyLimitDto TIER_3;

        @pmi0("tier_4")
        public static final MonthlyLimitDto TIER_4;

        @pmi0("tier_5")
        public static final MonthlyLimitDto TIER_5;

        @pmi0("tier_6")
        public static final MonthlyLimitDto TIER_6;

        @pmi0("unlimited")
        public static final MonthlyLimitDto UNLIMITED;
        private final String value;

        static {
            MonthlyLimitDto monthlyLimitDto = new MonthlyLimitDto("TIER_1", 0, "tier_1");
            TIER_1 = monthlyLimitDto;
            MonthlyLimitDto monthlyLimitDto2 = new MonthlyLimitDto("TIER_2", 1, "tier_2");
            TIER_2 = monthlyLimitDto2;
            MonthlyLimitDto monthlyLimitDto3 = new MonthlyLimitDto("TIER_3", 2, "tier_3");
            TIER_3 = monthlyLimitDto3;
            MonthlyLimitDto monthlyLimitDto4 = new MonthlyLimitDto("TIER_4", 3, "tier_4");
            TIER_4 = monthlyLimitDto4;
            MonthlyLimitDto monthlyLimitDto5 = new MonthlyLimitDto("TIER_5", 4, "tier_5");
            TIER_5 = monthlyLimitDto5;
            MonthlyLimitDto monthlyLimitDto6 = new MonthlyLimitDto("TIER_6", 5, "tier_6");
            TIER_6 = monthlyLimitDto6;
            MonthlyLimitDto monthlyLimitDto7 = new MonthlyLimitDto("UNLIMITED", 6, "unlimited");
            UNLIMITED = monthlyLimitDto7;
            MonthlyLimitDto[] monthlyLimitDtoArr = {monthlyLimitDto, monthlyLimitDto2, monthlyLimitDto3, monthlyLimitDto4, monthlyLimitDto5, monthlyLimitDto6, monthlyLimitDto7};
            $VALUES = monthlyLimitDtoArr;
            $ENTRIES = new asp(monthlyLimitDtoArr);
        }

        private MonthlyLimitDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static MonthlyLimitDto valueOf(String str) {
            return (MonthlyLimitDto) Enum.valueOf(MonthlyLimitDto.class, str);
        }

        public static MonthlyLimitDto[] values() {
            return (MonthlyLimitDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamingGetSettingsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamingGetSettingsResponseDto) && this.monthlyLimit == ((StreamingGetSettingsResponseDto) obj).monthlyLimit;
    }

    public final int hashCode() {
        MonthlyLimitDto monthlyLimitDto = this.monthlyLimit;
        if (monthlyLimitDto == null) {
            return 0;
        }
        return monthlyLimitDto.hashCode();
    }

    public final String toString() {
        return "StreamingGetSettingsResponseDto(monthlyLimit=" + this.monthlyLimit + ")";
    }

    public StreamingGetSettingsResponseDto(MonthlyLimitDto monthlyLimitDto) {
        this.monthlyLimit = monthlyLimitDto;
    }

    public /* synthetic */ StreamingGetSettingsResponseDto(MonthlyLimitDto monthlyLimitDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : monthlyLimitDto);
    }
}
