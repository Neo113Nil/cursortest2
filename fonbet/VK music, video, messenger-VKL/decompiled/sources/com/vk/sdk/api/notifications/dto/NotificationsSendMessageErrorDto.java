package com.vk.sdk.api.notifications.dto;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsSendMessageErrorDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsSendMessageErrorDto {

    @pmi0("code")
    private final CodeDto code;

    @pmi0("description")
    private final String description;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsSendMessageErrorDto.kt */
    public static final class CodeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CodeDto[] $VALUES;

        @pmi0("4")
        public static final CodeDto APP_IS_NOT_INSTALLED;

        @pmi0("3")
        public static final CodeDto FLOOD_CONTROL_PER_DAY;

        @pmi0("2")
        public static final CodeDto FLOOD_CONTROL_PER_HOUR;

        @pmi0("1")
        public static final CodeDto NOTIFICATIONS_DISABLED;
        private final int value;

        static {
            CodeDto codeDto = new CodeDto("NOTIFICATIONS_DISABLED", 0, 1);
            NOTIFICATIONS_DISABLED = codeDto;
            CodeDto codeDto2 = new CodeDto("FLOOD_CONTROL_PER_HOUR", 1, 2);
            FLOOD_CONTROL_PER_HOUR = codeDto2;
            CodeDto codeDto3 = new CodeDto("FLOOD_CONTROL_PER_DAY", 2, 3);
            FLOOD_CONTROL_PER_DAY = codeDto3;
            CodeDto codeDto4 = new CodeDto("APP_IS_NOT_INSTALLED", 3, 4);
            APP_IS_NOT_INSTALLED = codeDto4;
            CodeDto[] codeDtoArr = {codeDto, codeDto2, codeDto3, codeDto4};
            $VALUES = codeDtoArr;
            $ENTRIES = new asp(codeDtoArr);
        }

        private CodeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static CodeDto valueOf(String str) {
            return (CodeDto) Enum.valueOf(CodeDto.class, str);
        }

        public static CodeDto[] values() {
            return (CodeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsSendMessageErrorDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSendMessageErrorDto)) {
            return false;
        }
        NotificationsSendMessageErrorDto notificationsSendMessageErrorDto = (NotificationsSendMessageErrorDto) obj;
        return this.code == notificationsSendMessageErrorDto.code && epx.f(this.description, notificationsSendMessageErrorDto.description);
    }

    public final int hashCode() {
        CodeDto codeDto = this.code;
        int hashCode = (codeDto == null ? 0 : codeDto.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsSendMessageErrorDto(code=" + this.code + ", description=" + this.description + ")";
    }

    public NotificationsSendMessageErrorDto(CodeDto codeDto, String str) {
        this.code = codeDto;
        this.description = str;
    }

    public /* synthetic */ NotificationsSendMessageErrorDto(CodeDto codeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : codeDto, (i & 2) != 0 ? null : str);
    }
}
