package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkidokCheckPasswordResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidokCheckPasswordResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidokCheckPasswordResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0("personal_info_validation_rules")
    private final VkidokPersonalInfoValidationRulesDto personalInfoValidationRules;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final VkidokCheckPasswordProfileDto profile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkidokCheckPasswordResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("ok_mimicry_personal_info")
        public static final NextStepDto OK_MIMICRY_PERSONAL_INFO;
        private final String value;

        /* compiled from: VkidokCheckPasswordResponseDto.kt */
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
            NextStepDto nextStepDto = new NextStepDto("OK_MIMICRY_PERSONAL_INFO", 0, "ok_mimicry_personal_info");
            OK_MIMICRY_PERSONAL_INFO = nextStepDto;
            NextStepDto[] nextStepDtoArr = {nextStepDto};
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

    /* compiled from: VkidokCheckPasswordResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidokCheckPasswordResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokCheckPasswordResponseDto createFromParcel(Parcel parcel) {
            return new VkidokCheckPasswordResponseDto(NextStepDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VkidokPersonalInfoValidationRulesDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VkidokCheckPasswordProfileDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokCheckPasswordResponseDto[] newArray(int i) {
            return new VkidokCheckPasswordResponseDto[i];
        }
    }

    public VkidokCheckPasswordResponseDto(NextStepDto nextStepDto, VkidokPersonalInfoValidationRulesDto vkidokPersonalInfoValidationRulesDto, VkidokCheckPasswordProfileDto vkidokCheckPasswordProfileDto) {
        this.nextStep = nextStepDto;
        this.personalInfoValidationRules = vkidokPersonalInfoValidationRulesDto;
        this.profile = vkidokCheckPasswordProfileDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokCheckPasswordResponseDto)) {
            return false;
        }
        VkidokCheckPasswordResponseDto vkidokCheckPasswordResponseDto = (VkidokCheckPasswordResponseDto) obj;
        return this.nextStep == vkidokCheckPasswordResponseDto.nextStep && epx.f(this.personalInfoValidationRules, vkidokCheckPasswordResponseDto.personalInfoValidationRules) && epx.f(this.profile, vkidokCheckPasswordResponseDto.profile);
    }

    public final int hashCode() {
        int hashCode = this.nextStep.hashCode() * 31;
        VkidokPersonalInfoValidationRulesDto vkidokPersonalInfoValidationRulesDto = this.personalInfoValidationRules;
        int hashCode2 = (hashCode + (vkidokPersonalInfoValidationRulesDto == null ? 0 : vkidokPersonalInfoValidationRulesDto.hashCode())) * 31;
        VkidokCheckPasswordProfileDto vkidokCheckPasswordProfileDto = this.profile;
        return hashCode2 + (vkidokCheckPasswordProfileDto != null ? vkidokCheckPasswordProfileDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkidokCheckPasswordResponseDto(nextStep=" + this.nextStep + ", personalInfoValidationRules=" + this.personalInfoValidationRules + ", profile=" + this.profile + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nextStep.writeToParcel(parcel, i);
        VkidokPersonalInfoValidationRulesDto vkidokPersonalInfoValidationRulesDto = this.personalInfoValidationRules;
        if (vkidokPersonalInfoValidationRulesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkidokPersonalInfoValidationRulesDto.writeToParcel(parcel, i);
        }
        VkidokCheckPasswordProfileDto vkidokCheckPasswordProfileDto = this.profile;
        if (vkidokCheckPasswordProfileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkidokCheckPasswordProfileDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkidokCheckPasswordResponseDto(NextStepDto nextStepDto, VkidokPersonalInfoValidationRulesDto vkidokPersonalInfoValidationRulesDto, VkidokCheckPasswordProfileDto vkidokCheckPasswordProfileDto, int i, zcl zclVar) {
        this(nextStepDto, (i & 2) != 0 ? null : vkidokPersonalInfoValidationRulesDto, (i & 4) != 0 ? null : vkidokCheckPasswordProfileDto);
    }
}
