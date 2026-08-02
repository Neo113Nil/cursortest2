package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthOnSuccessValidationResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthOnSuccessValidationResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthOnSuccessValidationResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0("password_validation_rules")
    private final List<String> passwordValidationRules;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final AuthOnSuccessValidationProfileDto profile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthOnSuccessValidationResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("mailru_mimicry_get_silent_token")
        public static final NextStepDto MAILRU_MIMICRY_GET_SILENT_TOKEN;

        @pmi0("mailru_mimicry_success")
        public static final NextStepDto MAILRU_MIMICRY_SUCCESS;

        @pmi0("ok_mimicry_its_me")
        public static final NextStepDto OK_MIMICRY_ITS_ME;

        @pmi0("ok_mimicry_need_validation")
        public static final NextStepDto OK_MIMICRY_NEED_VALIDATION;

        @pmi0("ok_mimicry_password")
        public static final NextStepDto OK_MIMICRY_PASSWORD;

        @pmi0("ok_mimicry_vkid_its_me")
        public static final NextStepDto OK_MIMICRY_VKID_ITS_ME;

        @pmi0("ok_mimicry_vkid_seamless")
        public static final NextStepDto OK_MIMICRY_VKID_SEAMLESS;
        private final String value;

        /* compiled from: AuthOnSuccessValidationResponseDto.kt */
        public static final class a implements Parcelable.Creator<NextStepDto> {
            @Override // android.os.Parcelable.Creator
            public final NextStepDto createFromParcel(Parcel parcel) {
                return NextStepDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NextStepDto[] newArray(int i) {
                return new NextStepDto[i];
            }
        }

        static {
            NextStepDto nextStepDto = new NextStepDto("MAILRU_MIMICRY_GET_SILENT_TOKEN", 0, "mailru_mimicry_get_silent_token");
            MAILRU_MIMICRY_GET_SILENT_TOKEN = nextStepDto;
            NextStepDto nextStepDto2 = new NextStepDto("MAILRU_MIMICRY_SUCCESS", 1, "mailru_mimicry_success");
            MAILRU_MIMICRY_SUCCESS = nextStepDto2;
            NextStepDto nextStepDto3 = new NextStepDto("OK_MIMICRY_ITS_ME", 2, "ok_mimicry_its_me");
            OK_MIMICRY_ITS_ME = nextStepDto3;
            NextStepDto nextStepDto4 = new NextStepDto("OK_MIMICRY_VKID_ITS_ME", 3, "ok_mimicry_vkid_its_me");
            OK_MIMICRY_VKID_ITS_ME = nextStepDto4;
            NextStepDto nextStepDto5 = new NextStepDto("OK_MIMICRY_VKID_SEAMLESS", 4, "ok_mimicry_vkid_seamless");
            OK_MIMICRY_VKID_SEAMLESS = nextStepDto5;
            NextStepDto nextStepDto6 = new NextStepDto("OK_MIMICRY_PASSWORD", 5, "ok_mimicry_password");
            OK_MIMICRY_PASSWORD = nextStepDto6;
            NextStepDto nextStepDto7 = new NextStepDto("OK_MIMICRY_NEED_VALIDATION", 6, "ok_mimicry_need_validation");
            OK_MIMICRY_NEED_VALIDATION = nextStepDto7;
            NextStepDto[] nextStepDtoArr = {nextStepDto, nextStepDto2, nextStepDto3, nextStepDto4, nextStepDto5, nextStepDto6, nextStepDto7};
            $VALUES = nextStepDtoArr;
            $ENTRIES = new asp(nextStepDtoArr);
            CREATOR = new a();
        }

        private NextStepDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NextStepDto valueOf(String str) {
            return (NextStepDto) Enum.valueOf(NextStepDto.class, str);
        }

        public static NextStepDto[] values() {
            return (NextStepDto[]) $VALUES.clone();
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

    /* compiled from: AuthOnSuccessValidationResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthOnSuccessValidationResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthOnSuccessValidationResponseDto createFromParcel(Parcel parcel) {
            return new AuthOnSuccessValidationResponseDto(NextStepDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : AuthOnSuccessValidationProfileDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthOnSuccessValidationResponseDto[] newArray(int i) {
            return new AuthOnSuccessValidationResponseDto[i];
        }
    }

    public AuthOnSuccessValidationResponseDto(NextStepDto nextStepDto, List<String> list, AuthOnSuccessValidationProfileDto authOnSuccessValidationProfileDto) {
        this.nextStep = nextStepDto;
        this.passwordValidationRules = list;
        this.profile = authOnSuccessValidationProfileDto;
    }

    public final NextStepDto d() {
        return this.nextStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.passwordValidationRules;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthOnSuccessValidationResponseDto)) {
            return false;
        }
        AuthOnSuccessValidationResponseDto authOnSuccessValidationResponseDto = (AuthOnSuccessValidationResponseDto) obj;
        return this.nextStep == authOnSuccessValidationResponseDto.nextStep && epx.f(this.passwordValidationRules, authOnSuccessValidationResponseDto.passwordValidationRules) && epx.f(this.profile, authOnSuccessValidationResponseDto.profile);
    }

    public final AuthOnSuccessValidationProfileDto f() {
        return this.profile;
    }

    public final int hashCode() {
        int hashCode = this.nextStep.hashCode() * 31;
        List<String> list = this.passwordValidationRules;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AuthOnSuccessValidationProfileDto authOnSuccessValidationProfileDto = this.profile;
        return hashCode2 + (authOnSuccessValidationProfileDto != null ? authOnSuccessValidationProfileDto.hashCode() : 0);
    }

    public final String toString() {
        return "AuthOnSuccessValidationResponseDto(nextStep=" + this.nextStep + ", passwordValidationRules=" + this.passwordValidationRules + ", profile=" + this.profile + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nextStep.writeToParcel(parcel, i);
        parcel.writeStringList(this.passwordValidationRules);
        AuthOnSuccessValidationProfileDto authOnSuccessValidationProfileDto = this.profile;
        if (authOnSuccessValidationProfileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authOnSuccessValidationProfileDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthOnSuccessValidationResponseDto(NextStepDto nextStepDto, List list, AuthOnSuccessValidationProfileDto authOnSuccessValidationProfileDto, int i, zcl zclVar) {
        this(nextStepDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : authOnSuccessValidationProfileDto);
    }
}
