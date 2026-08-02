package com.vk.sdk.api.auth.dto;

import com.ironsource.O6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthRestoreResponseDto.kt */
/* loaded from: classes5.dex */
public final class AuthRestoreResponseDto {

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("success")
    private final SuccessDto success;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthRestoreResponseDto.kt */
    public static final class SuccessDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SuccessDto[] $VALUES;

        @pmi0("1")
        public static final SuccessDto OK;
        private final int value;

        static {
            SuccessDto successDto = new SuccessDto("OK", 0, 1);
            OK = successDto;
            SuccessDto[] successDtoArr = {successDto};
            $VALUES = successDtoArr;
            $ENTRIES = new asp(successDtoArr);
        }

        private SuccessDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SuccessDto valueOf(String str) {
            return (SuccessDto) Enum.valueOf(SuccessDto.class, str);
        }

        public static SuccessDto[] values() {
            return (SuccessDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthRestoreResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRestoreResponseDto)) {
            return false;
        }
        AuthRestoreResponseDto authRestoreResponseDto = (AuthRestoreResponseDto) obj;
        return this.success == authRestoreResponseDto.success && epx.f(this.sid, authRestoreResponseDto.sid);
    }

    public final int hashCode() {
        SuccessDto successDto = this.success;
        int hashCode = (successDto == null ? 0 : successDto.hashCode()) * 31;
        String str = this.sid;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AuthRestoreResponseDto(success=" + this.success + ", sid=" + this.sid + ")";
    }

    public AuthRestoreResponseDto(SuccessDto successDto, String str) {
        this.success = successDto;
        this.sid = str;
    }

    public /* synthetic */ AuthRestoreResponseDto(SuccessDto successDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : successDto, (i & 2) != 0 ? null : str);
    }
}
