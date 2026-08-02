package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkidokStartRegistrationResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidokStartRegistrationResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidokStartRegistrationResponseDto> CREATOR = new a();

    @pmi0("next_step")
    private final NextStepDto nextStep;

    @pmi0("policy")
    private final VkidokStartRegistrationPolicyDto policy;

    @pmi0(O6.e1)
    private final String sid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkidokStartRegistrationResponseDto.kt */
    public static final class NextStepDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextStepDto[] $VALUES;
        public static final Parcelable.Creator<NextStepDto> CREATOR;

        @pmi0("ok_mimicry_phone_validation")
        public static final NextStepDto OK_MIMICRY_PHONE_VALIDATION;
        private final String value;

        /* compiled from: VkidokStartRegistrationResponseDto.kt */
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
            NextStepDto nextStepDto = new NextStepDto("OK_MIMICRY_PHONE_VALIDATION", 0, "ok_mimicry_phone_validation");
            OK_MIMICRY_PHONE_VALIDATION = nextStepDto;
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

    /* compiled from: VkidokStartRegistrationResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidokStartRegistrationResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationResponseDto createFromParcel(Parcel parcel) {
            return new VkidokStartRegistrationResponseDto(parcel.readString(), NextStepDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VkidokStartRegistrationPolicyDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationResponseDto[] newArray(int i) {
            return new VkidokStartRegistrationResponseDto[i];
        }
    }

    public VkidokStartRegistrationResponseDto(String str, NextStepDto nextStepDto, VkidokStartRegistrationPolicyDto vkidokStartRegistrationPolicyDto) {
        this.sid = str;
        this.nextStep = nextStepDto;
        this.policy = vkidokStartRegistrationPolicyDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokStartRegistrationResponseDto)) {
            return false;
        }
        VkidokStartRegistrationResponseDto vkidokStartRegistrationResponseDto = (VkidokStartRegistrationResponseDto) obj;
        return epx.f(this.sid, vkidokStartRegistrationResponseDto.sid) && this.nextStep == vkidokStartRegistrationResponseDto.nextStep && epx.f(this.policy, vkidokStartRegistrationResponseDto.policy);
    }

    public final int hashCode() {
        int hashCode = (this.nextStep.hashCode() + (this.sid.hashCode() * 31)) * 31;
        VkidokStartRegistrationPolicyDto vkidokStartRegistrationPolicyDto = this.policy;
        return hashCode + (vkidokStartRegistrationPolicyDto == null ? 0 : vkidokStartRegistrationPolicyDto.hashCode());
    }

    public final String toString() {
        return "VkidokStartRegistrationResponseDto(sid=" + this.sid + ", nextStep=" + this.nextStep + ", policy=" + this.policy + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        this.nextStep.writeToParcel(parcel, i);
        VkidokStartRegistrationPolicyDto vkidokStartRegistrationPolicyDto = this.policy;
        if (vkidokStartRegistrationPolicyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkidokStartRegistrationPolicyDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkidokStartRegistrationResponseDto(String str, NextStepDto nextStepDto, VkidokStartRegistrationPolicyDto vkidokStartRegistrationPolicyDto, int i, zcl zclVar) {
        this(str, nextStepDto, (i & 4) != 0 ? null : vkidokStartRegistrationPolicyDto);
    }
}
